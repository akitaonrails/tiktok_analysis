package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.journey.FollowStatus;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import com.ss.android.ugc.aweme.service.profilerec.model.OnboardingProfile;
import com.ss.android.ugc.aweme.service.profilerec.model.ProfileRecResponse;
import com.ss.android.ugc.aweme.service.profilerec.model.VideoCoverStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService$maybeShowProfileRecIntroPanel$1$1", f = "ProfileRecommendationService.kt", l = {116, 126}, m = "invokeSuspend")
public final class C1303040k0s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileRecommendationService LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303040k0s(ProfileRecommendationService profileRecommendationService, C19EG c19eg, InterfaceC1364105Vn<? super C1303040k0s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileRecommendationService;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303040k0s(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1296740jqi c1296740jqi;
        OnboardingProfile onboardingProfile;
        String str;
        String str2;
        int value;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        ?? arrayList;
        ProfileRecResponse profileRecResponse;
        Object objLIZJ = obj;
        C1C7U.LIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C632880Os2 c632880Os2 = null;
        try {
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            c1296740jqi = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZJ);
                    ProfileRecommendationService profileRecommendationService = this.LLILLJJLI;
                    profileRecommendationService.LJFF = false;
                    profileRecommendationService.LIZLLL.set(false);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZJ);
        } else {
            C155000ia.LIZIZ(objLIZJ);
            C1296710jqf c1296710jqf = new C1296710jqf(this.LLILLJJLI, null);
            this.LL = 1;
            objLIZJ = C099A.LIZJ(1000L, c1296710jqf, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1");
                return objLJFF;
            }
        }
        c1296740jqi = (C1296740jqi) objLIZJ;
        if (c1296740jqi != null && (profileRecResponse = c1296740jqi.LIZIZ) != null) {
            onboardingProfile = profileRecResponse.profileRecStruct;
        } else {
            onboardingProfile = null;
        }
        if (onboardingProfile != null && (str = onboardingProfile.userId) != null && (str2 = onboardingProfile.name) != null) {
            String str3 = onboardingProfile.secUd;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = onboardingProfile.bio;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = onboardingProfile.avatarUrl;
            if (str5 == null) {
                str5 = "";
            }
            FollowStatus followStatus = onboardingProfile.followStatus;
            if (followStatus != null) {
                value = followStatus.getValue();
            } else {
                value = 0;
            }
            Boolean bool = onboardingProfile.blueV;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Boolean bool2 = onboardingProfile.hasStory;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            List<VideoCoverStruct> list = onboardingProfile.videoCovers;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (VideoCoverStruct videoCoverStruct : list) {
                    String str6 = videoCoverStruct.videoId;
                    String str7 = videoCoverStruct.coverUrl;
                    if (str7 == null) {
                        str7 = "";
                    }
                    arrayList.add(new C632960OsA(str6, str7));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c632880Os2 = new C632880Os2(str, str2, str3, str4, str5, value, zBooleanValue, zBooleanValue2, arrayList);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1593940ra4 c1593940ra4 = new C1593940ra4(this.LLILLL, c632880Os2, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1593940ra4) == objLJFF) {
            C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1");
            return objLJFF;
        }
        ProfileRecommendationService profileRecommendationService2 = this.LLILLJJLI;
        profileRecommendationService2.LJFF = false;
        profileRecommendationService2.LIZLLL.set(false);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileRecommendationService@e133.maybeShowProfileRecIntroPanel$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
