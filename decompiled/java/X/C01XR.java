package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.mob.ProfileIdentifierMobHelper$trackEvent$1", f = "ProfileIdentifierMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01XR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C2344009Gk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XR(String str, C2344009Gk c2344009Gk, InterfaceC1364105Vn<? super C01XR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c2344009Gk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierMobHelper@8587.trackEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1251280ifO.LIZ(this.LL, this.LLILLJJLI.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierMobHelper@8587.trackEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
