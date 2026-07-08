package X;

import com.ss.android.ugc.aweme.ui.layout.AsyncInflaterCacheCheckRunnable;

/* JADX INFO: renamed from: X.04t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1238904t1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1231004rk());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1231104rl());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1238704sz());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1238804t0());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1239004t2());
    public static boolean LJFF;
    public static boolean LJI;
    public static AsyncInflaterCacheCheckRunnable LJII;
    public static Runnable LJIIIIZZ;

    public static final boolean LIZ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static final void LIZIZ(Runnable runnable, boolean z) {
        if (z && LIZ() && !LJFF) {
            if (((Boolean) LIZJ.getValue()).booleanValue()) {
                AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable = LJII;
                if (asyncInflaterCacheCheckRunnable == null) {
                    runnable.run();
                    return;
                } else {
                    asyncInflaterCacheCheckRunnable.LIZLLL();
                    LJIIIIZZ = runnable;
                    return;
                }
            }
            return;
        }
        runnable.run();
    }
}
