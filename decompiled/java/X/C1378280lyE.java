package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378280lyE implements InterfaceC1233550iCn {
    public static final C1378280lyE LIZJ = new C1378280lyE();
    public Pair<Long, ? extends User> LIZ;
    public Pair<Long, ? extends InterfaceC473070Igr> LIZIZ;

    public C1378280lyE() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1378300lyG(this, null), 3);
    }

    public static boolean LIZ(User user) {
        if (user.getCanMessageFollowStatusList() == null || !(!r0.isEmpty()) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(User user, long j) {
        this.LIZ = new Pair<>(Long.valueOf(j), user);
        Pair<Long, ? extends InterfaceC473070Igr> pair = this.LIZIZ;
        if (pair != null && pair.getFirst().longValue() == j) {
            try {
                com.bytedance.android.live.base.model.user.User userLIZLLL = C20639815pc.LIZLLL(user);
                if (userLIZLLL != null) {
                    C054G c054gLIZIZ = C2296808zG.LIZIZ();
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c054gLIZIZ, C2107308Nj.LIZ, null, new C473060Igq(pair, j, userLIZLLL, this, null), 2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
