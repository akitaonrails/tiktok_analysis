package X;

import Y.AfS181S0100000_12;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.List;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS272S0000000_29;

/* JADX INFO: renamed from: X.11TP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TP extends C11SY {
    public final C11TZ LIZJ;
    public final C11TW LIZLLL;
    public final InterfaceC19505411Sy<String, User> LJ;
    public final String LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.11T3, X.11TZ] */
    public C11TP() {
        ?? r4 = new C11T3<C19505611Ta, List<? extends User>, C19505611Ta, FollowingItemList>() { // from class: X.11TZ
            public final FollowRelationApi LIZ;

            {
                FollowRelationApi.LIZ.getClass();
                this.LIZ = (FollowRelationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(FollowRelationApi.class);
            }

            @Override // X.C11T3
            public final C11NZ<FollowingItemList> requestActual(C19505611Ta c19505611Ta) {
                C19505611Ta c19505611Ta2 = c19505611Ta;
                return this.LIZ.LIZ(c19505611Ta2.LIZ, c19505611Ta2.LIZIZ, c19505611Ta2.LIZJ, c19505611Ta2.LIZLLL, c19505611Ta2.LJ, c19505611Ta2.LJFF, c19505611Ta2.LJI, c19505611Ta2.LJII, c19505611Ta2.LJIIIZ, c19505611Ta2.LJIIJ).LJL(C11S5.LIZ());
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertKeyActual(Object obj) {
                return obj;
            }

            @Override // X.C11T3, X.C11T4
            public final Object convertValActual(Object obj, Object obj2) {
                return ((FollowingItemList) obj2).items;
            }
        };
        this.LIZJ = r4;
        C11TW c11tw = new C11TW();
        this.LIZLLL = c11tw;
        C1675760ti2 c1675760ti2LJ = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJ();
        this.LJ = c1675760ti2LJ;
        this.LJFF = "FollowingListRepo";
        LJJIIZI(r4, c11tw, new AwS272S0000000_29(6));
        LJJIIZ(c1675760ti2LJ, c11tw, new AwS272S0000000_29(7));
        LJJIJIIJI(c1675760ti2LJ, c11tw, new AwS244S0000000_12(9));
        C11T2.LIZ(c1675760ti2LJ).LIZLLL(true, new InterfaceC19505211Sw[0]).LJJLL(new AfS181S0100000_12(this, 321), new AfS181S0100000_12(this, 322));
    }

    public final C11NZ LJJIJIL(String str, String str2, long j, int i, int i2, int i3, String str3, int i4, String str4) {
        return request(new C19505611Ta(str, str2, j, 40, i, i2, i3, str3, null, i4, str4));
    }
}
