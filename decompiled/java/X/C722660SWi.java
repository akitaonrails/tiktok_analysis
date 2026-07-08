package X;

/* JADX INFO: renamed from: X.0SWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722660SWi {
    public static boolean LIZ;

    public static boolean LIZIZ() {
        return (C104100aN.LIZ().isNewUser() ? C1486210omJ.LIZ() : ((Boolean) AnonymousClass0716.LJIIJJI.getValue()).booleanValue()) && !LIZ;
    }

    public static void LIZ(final Runnable runnable) {
        C20639086r.LIZ.LIZIZ();
        if (!C20639086r.LIZLLL(new Runnable() { // from class: X.0N7S
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TryPlayPreExecuteOpt@bed.doPostOnCommitOrDefault$safeRunnable$1");
                try {
                    if (C2187451AjH.LJIIJ()) {
                        runnable.run();
                    } else {
                        C0VY3.LIZJ(new C0N7T(runnable));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TryPlayPreExecuteOpt@bed.doPostOnCommitOrDefault$safeRunnable$1");
            }
        })) {
            runnable.run();
        }
    }

    public static void LIZJ(Runnable runnable) {
        if (LIZIZ()) {
            LIZ(runnable);
        } else {
            runnable.run();
        }
    }
}
