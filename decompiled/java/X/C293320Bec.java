package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Bec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293320Bec {
    public static final boolean LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "sync_show_anchor_in_feed", true, false);
    public static volatile boolean LIZIZ;

    static {
        boolean z = false;
        try {
            z = Keva.getRepo("zoin—sp").getBoolean("media_key.lib.decode.finished", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZIZ = z;
    }
}
