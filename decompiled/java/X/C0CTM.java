package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuj.HomeTabNujLaunchHelper$checkAndReportTabLaunch$1", f = "HomeTabNujLaunchHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CTM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTM(C19EG c19eg, InterfaceC1364105Vn<? super C0CTM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HomeTabNujLaunchHelper@afd.checkAndReportTabLaunch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CUI c0cui = C0CUI.LIZ;
        C19EG c19eg = this.LL;
        c0cui.getClass();
        C0CUI.LIZIZ(c19eg);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.checkAndReportTabLaunch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
