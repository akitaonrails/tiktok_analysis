package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS283S0000000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Oyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.popup.outreach.ProfileOutreachBannerHelper$releaseBannerAwait$2", f = "ProfileOutreachBannerHelper.kt", l = {}, m = "invokeSuspend")
public final class C637140Oyu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2238171Cit LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637140Oyu(C2238171Cit c2238171Cit, InterfaceC1364105Vn<? super C637140Oyu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2238171Cit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637140Oyu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileOutreachBannerHelper@7058.releaseBannerAwait$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.setState(AFwS283S0000000_35.get$arr$(166));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.releaseBannerAwait$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
