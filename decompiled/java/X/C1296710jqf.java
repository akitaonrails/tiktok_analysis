package X;

import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$maybeShowProfileRecIntroPanel$1$1$result$1", f = "ProfileRecommendationService.kt", l = {117}, m = "invokeSuspend")
public final class C1296710jqf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1296740jqi>, Object> {
    public int LL;
    public final /* synthetic */ ProfileRecommendationService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296710jqf(ProfileRecommendationService profileRecommendationService, InterfaceC1364105Vn<? super C1296710jqf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileRecommendationService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296710jqf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LIZIZ;
            C1296700jqe c1296700jqe = new C1296700jqe(null);
            this.LL = 1;
            obj = C09IC.LJIJ(c2252321DDq, this, c1296700jqe);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1296740jqi> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
