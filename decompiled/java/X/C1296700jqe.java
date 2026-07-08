package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$maybeShowProfileRecIntroPanel$1$1$result$1$1", f = "ProfileRecommendationService.kt", l = {}, m = "invokeSuspend")
public final class C1296700jqe extends C09AX implements Function2<C1296740jqi, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1296700jqe(InterfaceC1364105Vn<? super C1296700jqe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1296700jqe c1296700jqe = new C1296700jqe(interfaceC1364105Vn);
        c1296700jqe.LL = obj;
        return c1296700jqe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((C1296740jqi) this.LL).LIZ == EnumC1286380ja0.SUCCESSFUL) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$result$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1296740jqi c1296740jqi, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c1296740jqi, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
