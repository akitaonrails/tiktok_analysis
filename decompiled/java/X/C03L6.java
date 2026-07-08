package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03L6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspCreateOrderManager$handleCreateOrderResultForMini$8$1$2", f = "OspCreateOrderManager.kt", l = {}, m = "invokeSuspend")
public final class C03L6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MiniOspViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03L6(MiniOspViewModel miniOspViewModel, InterfaceC1364105Vn<? super C03L6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = miniOspViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03L6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForMini$8$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS228S0000000_1.get$arr$(900));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspCreateOrderManager@b17e.handleCreateOrderResultForMini$8$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
