package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0yxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877480yxO {
    public static final C1877480yxO LIZ = new C1877480yxO();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"US", "IN", "ID", "BR", "NG"});
    public static final String LIZJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
    public static final List<Long> LIZLLL = C1697810uHb.LJIIJJI(2500L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), 10000L, 15000L);
    public static final Set<Integer> LJ = C13LQ.LJLIIL(new Integer[]{1, 2});
    public static final int LJFF = 2;

    public static void LIZIZ(String str) {
        if (LIZIZ.contains(LIZJ)) {
            LIZ(LJFF, str);
        }
    }

    public static void LIZ(int i, String str) {
        if (LJ.contains(Integer.valueOf(i))) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "exp_group_num");
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
    }
}
