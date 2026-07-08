package X;

import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: X.163X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163X implements Runnable {
    public static final C163X LL = new C163X();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CommentTranslationMultiTranslationManager@3db9.tryTranslateRunnable$1");
        try {
            ConcurrentLinkedDeque<C207137163r> concurrentLinkedDeque = C163I.LJ;
            if (concurrentLinkedDeque.peekLast() != null && C163I.LJFF == null) {
                C207137163r c207137163rPollLast = concurrentLinkedDeque.pollLast();
                C163I.LJFF = c207137163rPollLast;
                if (c207137163rPollLast != null) {
                    C163I.LIZ.getClass();
                    C163I.LJII(c207137163rPollLast);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentTranslationMultiTranslationManager@3db9.tryTranslateRunnable$1");
    }
}
