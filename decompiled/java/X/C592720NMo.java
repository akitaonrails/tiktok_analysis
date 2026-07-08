package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.avatarloader.impl.core.DMAvatarResManager$getAvatar$1", f = "DMAvatarResManager.kt", l = {}, m = "invokeSuspend")
public final class C592720NMo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C897710ZJp LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592720NMo(C897710ZJp c897710ZJp, String str, InterfaceC1364105Vn<? super C592720NMo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c897710ZJp;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592720NMo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMAvatarResManager@fa0.getAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF(2, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAvatarResManager@fa0.getAvatar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
