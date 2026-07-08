package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl$startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1$1", f = "UcpServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C376801dG extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;

    public C376801dG(InterfaceC1364105Vn<? super C376801dG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C376801dG c376801dG = new C376801dG(interfaceC1364105Vn);
        c376801dG.LL = ((Boolean) obj).booleanValue();
        return c376801dG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpServiceImpl@34af.startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL);
        C1C7U.LIZIZ("UcpServiceImpl@34af.startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
