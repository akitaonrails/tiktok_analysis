package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$1", f = "BlockUserController.kt", l = {}, m = "invokeSuspend")
public final class C592770NMt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BlockUserController LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592770NMt(BlockUserController blockUserController, InterfaceC1364105Vn<? super C592770NMt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = blockUserController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592770NMt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BlockUserController@aeb9.callApi$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BlockUserController@aeb9.callApi$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
