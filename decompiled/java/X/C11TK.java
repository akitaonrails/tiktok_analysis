package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.userservice.CommonFollowApi;
import com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS352S0000000_29;

/* JADX INFO: renamed from: X.11TK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TK extends C11SY {
    public final C1675760ti2 LIZJ;
    public final C19212310Ef LIZLLL;
    public final C11TM LJ;
    public final C11SU<Pair<C19212410Eg, FollowStatus>> LJFF;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.10Ef, X.11T4] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.11T4, X.11TM] */
    public C11TK(C1675760ti2 c1675760ti2) {
        this.LIZJ = c1675760ti2;
        ?? r1 = new C11T3<String, Integer, C19212410Eg, FollowStatus>() { // from class: X.10Ef
            public final JediFollowApi LIZ;

            {
                JediFollowApi.LIZ.getClass();
                this.LIZ = (JediFollowApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((IMainService) ServiceManager.get().getService(IMainService.class)).getApiUrlPrefix()).create(JediFollowApi.class);
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return ((C19212410Eg) obj).LIZ;
            }

            @Override // X.C11T3
            public final C11NZ<FollowStatus> requestActual(C19212410Eg c19212410Eg) {
                C19212410Eg c19212410Eg2 = c19212410Eg;
                int i = c19212410Eg2.LJ;
                if (i == -1) {
                    return this.LIZ.followWithRetrofitPost(c19212410Eg2.LIZ, c19212410Eg2.LIZIZ, c19212410Eg2.LIZJ, c19212410Eg2.LIZLLL, null, c19212410Eg2.LJFF, null, c19212410Eg2.LJII, c19212410Eg2.LJIIIIZZ, c19212410Eg2.LJIIIZ, c19212410Eg2.LJIIJ).LJL(C11S5.LIZ());
                }
                JediFollowApi jediFollowApi = this.LIZ;
                String str = c19212410Eg2.LIZ;
                String str2 = c19212410Eg2.LIZIZ;
                int i2 = c19212410Eg2.LIZJ;
                int i3 = c19212410Eg2.LIZLLL;
                String str3 = c19212410Eg2.LJFF;
                int i4 = c19212410Eg2.LJI;
                String str4 = c19212410Eg2.LJII;
                String str5 = c19212410Eg2.LJIIIZ;
                return jediFollowApi.followWithRetrofitPost(str, str2, i2, i3, Integer.valueOf(i), str3, Integer.valueOf(i4), str4, c19212410Eg2.LJIIIIZZ, str5, c19212410Eg2.LJIIJ).LJL(C11S5.LIZ());
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                FollowStatus followStatus = (FollowStatus) obj2;
                if (followStatus.status_code == 0) {
                    return Integer.valueOf(followStatus.getFollowStatus());
                }
                return null;
            }
        };
        this.LIZLLL = r1;
        ?? r3 = new C11T3<String, Integer, C11TO, BaseResponse>() { // from class: X.11TM
            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return ((C11TO) obj).LIZ;
            }

            @Override // X.C11T3
            public final C11NZ<BaseResponse> requestActual(C11TO c11to) {
                C11TO c11to2 = c11to;
                CommonFollowApi commonFollowApi = CommonFollowApi.LIZ;
                String str = c11to2.LIZ;
                String str2 = c11to2.LIZIZ;
                commonFollowApi.getClass();
                return CommonFollowApi.LIZIZ.remove(str, str2);
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return Integer.valueOf(((BaseResponse) obj2).status_code);
            }
        };
        this.LJ = r3;
        this.LJFF = C11SU.LJLLLLLL();
        LJJIJIIJIL(C11T2.LIZIZ(r1), C11T2.LIZ(c1675760ti2), C0LJ7.LIZ(AFwS352S0000000_29.get$arr$(1)));
        LJJIJIIJIL(C11T2.LIZIZ(r3), C11T2.LIZ(c1675760ti2), C0LJ7.LIZ(AFwS352S0000000_29.get$arr$(2)));
    }
}
