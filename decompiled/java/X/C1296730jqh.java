package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import com.ss.android.ugc.aweme.profilerec.network.ProfileRecApi;
import com.ss.android.ugc.aweme.service.profilerec.model.ProfileRecResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0jqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$prefetchProfileRecData$1", f = "ProfileRecommendationService.kt", l = {197, 203, 211, 215}, m = "invokeSuspend")
public final class C1296730jqh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileRecommendationService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296730jqh(ProfileRecommendationService profileRecommendationService, InterfaceC1364105Vn<? super C1296730jqh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileRecommendationService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296730jqh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LIZIZ;
            C1296740jqi c1296740jqi = new C1296740jqi(EnumC1286380ja0.FAILED, 2);
            this.LL = 4;
            c2252321DDq.setValue(c1296740jqi);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C312930COl.LIZ.getClass();
            ProfileRecApi profileRecApi = C312930COl.LIZIZ;
            if (profileRecApi != null) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLJJLI.LIZ.LIZ);
                String str = this.LLILLJJLI.LIZ.LIZIZ;
                if (a0.LJJJIL(str)) {
                    str = null;
                }
                this.LL = 1;
                obj = profileRecApi.prefetchProfileRec(lLJIILIIL, str, 1, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
            return unit2;
        }
        C0X52 c0x52 = (C0X52) obj;
        if (c0x52 != null) {
            if (c0x52.LIZJ()) {
                C2252321DDq c2252321DDq2 = this.LLILLJJLI.LIZIZ;
                C1296740jqi c1296740jqi2 = new C1296740jqi(EnumC1286380ja0.SUCCESSFUL, (ProfileRecResponse) c0x52.LIZIZ);
                this.LL = 2;
                c2252321DDq2.setValue(c1296740jqi2);
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
                    return objLJFF;
                }
            } else {
                C2252321DDq c2252321DDq3 = this.LLILLJJLI.LIZIZ;
                C1296740jqi c1296740jqi3 = new C1296740jqi(EnumC1286380ja0.FAILED, 2);
                this.LL = 3;
                c2252321DDq3.setValue(c1296740jqi3);
                if (Unit.LIZ == objLJFF) {
                    C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
                    return objLJFF;
                }
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
            return unit3;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileRecommendationService@e133.prefetchProfileRecData$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
