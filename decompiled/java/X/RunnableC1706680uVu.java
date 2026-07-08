package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0uVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1706680uVu implements Runnable {
    public static final RunnableC1706680uVu LL = new RunnableC1706680uVu();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LoadingWatchDog@fd49.watchDogRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoadingWatchDog@fd49.watchDogRunnable$1");
    }

    public static void LIZ() {
        C00YL c00ylLIZ = C1706400uVS.LIZ();
        if (c00ylLIZ != null) {
            c00ylLIZ.LIZ("cke_technology_loading_watch", C2097608Jq.LJIIIIZZ(new Pair("stage", C1706690uVv.LIZIZ), new Pair("keep_time", String.valueOf(System.currentTimeMillis() - C1706690uVv.LIZ)), new Pair("flag", "loading")));
        }
    }
}
