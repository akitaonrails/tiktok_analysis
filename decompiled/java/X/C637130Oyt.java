package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Oyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.popup.outreach.ProfileOutreachBannerHelper$handleTriggerCallback$1$1$1", f = "ProfileOutreachBannerHelper.kt", l = {}, m = "invokeSuspend")
public final class C637130Oyt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2238171Cit LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637130Oyt(C2238171Cit c2238171Cit, InterfaceC1364105Vn<? super C637130Oyt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2238171Cit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C637130Oyt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileOutreachBannerHelper@7058.handleTriggerCallback$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2238171Cit c2238171Cit = this.LL;
        c2238171Cit.LIZIZ.setState(new AwS614S0100000_35(c2238171Cit, 183));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileOutreachBannerHelper@7058.handleTriggerCallback$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
