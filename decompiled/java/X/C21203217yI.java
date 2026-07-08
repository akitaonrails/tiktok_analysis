package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.17yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203217yI {
    public static final boolean LIZ;
    public static final Set<String> LIZIZ;
    public static final Set<String> LIZJ;

    static {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_record_search_live_info", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = zLJIIIZ;
        LIZIZ = C13LQ.LJLIIL(new String[]{"profile_card", "follow_icon", "live_follow_popup"});
        LIZJ = C13LQ.LJLIIL(new String[]{"live_cart", "live_popup_card"});
    }
}
