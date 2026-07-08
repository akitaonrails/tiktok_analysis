package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.List;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS272S0000000_29;

/* JADX INFO: renamed from: X.11TQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TQ extends C11SY {
    public final C11TY LIZJ;
    public final InterfaceC19505411Sy<String, User> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.11T3, X.11TY] */
    public C11TQ() {
        ?? r4 = new C11T3<C19505611Ta, List<? extends User>, C19505611Ta, FollowerItemList>() { // from class: X.11TY
            public final FollowRelationApi LIZ;

            {
                FollowRelationApi.LIZ.getClass();
                this.LIZ = (FollowRelationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(FollowRelationApi.class);
            }

            @Override // X.C11T3
            public final C11NZ<FollowerItemList> requestActual(C19505611Ta c19505611Ta) {
                C19505611Ta c19505611Ta2 = c19505611Ta;
                return this.LIZ.LIZIZ(c19505611Ta2.LIZ, c19505611Ta2.LIZIZ, c19505611Ta2.LIZJ, c19505611Ta2.LIZLLL, c19505611Ta2.LJ, c19505611Ta2.LJFF, c19505611Ta2.LJI, c19505611Ta2.LJII, c19505611Ta2.LJIIIIZZ).LJL(C11S5.LIZ());
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return ((FollowerItemList) obj2).items;
            }
        };
        this.LIZJ = r4;
        C11TW c11tw = new C11TW();
        C1675760ti2 c1675760ti2LJ = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJ();
        this.LIZLLL = c1675760ti2LJ;
        LJJIIZI(r4, c11tw, new AwS272S0000000_29(4));
        LJJIIZ(c1675760ti2LJ, c11tw, new AwS272S0000000_29(5));
        LJJIJIIJI(c1675760ti2LJ, c11tw, new AwS244S0000000_12(8));
    }

    public final C11NZ<FollowerItemList> LJJIJIL(String str, String str2, long j, int i, int i2, int i3, int i4, String str3, String str4) {
        return request(new C19505611Ta(str, str2, j, i, i2, i3, i4, str3, str4, 0, null));
    }
}
