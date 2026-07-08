package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.163Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163Y implements Runnable {
    public static final C163Y LL = new C163Y();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CommentTranslationMultiTranslationManager@3db9.finishOngoingTranslation$1");
        try {
            C163I.LJFF = null;
            C163I.LIZ.getClass();
            Handler handler = C163I.LIZIZ;
            C163X c163x = C163I.LJI;
            handler.removeCallbacks(c163x);
            C786410Ut5.LJLIIL(50L, handler, c163x);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentTranslationMultiTranslationManager@3db9.finishOngoingTranslation$1");
    }
}
