package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.List;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS272S0000000_29;

/* JADX INFO: renamed from: X.11TR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TR extends C11SY {
    public final C11TT LIZJ;
    public final InterfaceC19505411Sy<String, User> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.11T3, X.11TT] */
    public C11TR() {
        ?? r4 = new C11T3<C11TS, List<? extends User>, C11TS, FollowingItemList>() { // from class: X.11TT
            public final C11TU LIZ;

            {
                C11TU.LIZ.getClass();
                this.LIZ = (C11TU) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(C11TU.class);
            }

            @Override // X.C11T3
            public final C11NZ<FollowingItemList> requestActual(C11TS c11ts) {
                C11TS c11ts2 = c11ts;
                return this.LIZ.LIZ(c11ts2.LIZ, c11ts2.LIZIZ, c11ts2.LIZLLL, c11ts2.LJ, c11ts2.LJFF).LJL(C11S5.LIZ());
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
        C11T5<User> c11t5 = new C11T5<User>() { // from class: X.11TV
        };
        C1675760ti2 c1675760ti2LJ = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJ();
        this.LIZLLL = c1675760ti2LJ;
        LJJIIZI(r4, c11t5, new AwS272S0000000_29(2));
        LJJIIZ(c1675760ti2LJ, c11t5, new AwS272S0000000_29(3));
        LJJIJIIJI(c1675760ti2LJ, c11t5, new AwS244S0000000_12(7));
    }

    public final C19484211Ku LJJIJIL(String str, String str2, long j, int i, int i2, int i3, int i4) {
        return request(new C11TS(str, str2, j, i, i2, i3, i4)).LJJLI(C11IR.LL);
    }
}
