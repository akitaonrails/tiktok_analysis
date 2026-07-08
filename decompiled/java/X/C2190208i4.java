package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08i4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment$startTimer$1$1", f = "SloganAndConsentFragment.kt", l = {}, m = "invokeSuspend")
public final class C2190208i4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SloganAndConsentFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2190208i4(SloganAndConsentFragment sloganAndConsentFragment, InterfaceC1364105Vn<? super C2190208i4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sloganAndConsentFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2190208i4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SloganAndConsentFragment@cf5a.startTimer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.iS();
        C19249910Sr c19249910Sr = C19249910Sr.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(!ComplianceServiceProvider.LJJIII().LJ()), "has_consent");
        c19249910Sr.LIZIZ(c2344009Gk, "skip_slogan_and_consent");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SloganAndConsentFragment@cf5a.startTimer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
