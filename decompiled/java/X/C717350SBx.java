package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.SubOnlyPaywallOverlayViewHolder$getView$1$1$1$1", f = "SubOnlyPaywallOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C717350SBx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0SC0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717350SBx(C0SC0 c0sc0, InterfaceC1364105Vn<? super C717350SBx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0sc0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C717350SBx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LJIIJJI() != null) {
            this.LL.LIZIZ.LIZ(!r0.booleanValue());
        } else {
            this.LL.LIZIZ.LIZ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
