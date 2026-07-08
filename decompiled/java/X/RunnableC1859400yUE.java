package X;

/* JADX INFO: renamed from: X.0yUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class RunnableC1859400yUE implements Runnable {
    public static final RunnableC1859400yUE LL = new RunnableC1859400yUE();

    public static void LIZ() {
        C1859360yUA.LIZ.getClass();
        if (C1859360yUA.LJFF) {
            String str = C1859360yUA.LJ;
            if (str == null) {
                C1859360yUA.LJFF = false;
                return;
            }
            C1859410yUF c1859410yUF = C1859360yUA.LIZJ.get(str);
            C1556190qbB c1556190qbB = C1859360yUA.LIZLLL.get(str);
            C1785140wYS.LJ(str, false);
            if (c1556190qbB == null) {
                if (c1859410yUF != null) {
                    c1859410yUF.LJI();
                }
            } else if (c1556190qbB.LIZIZ.invoke().booleanValue()) {
                if ((C07IH.LIZIZ() & 2) != 0) {
                    if (c1859410yUF != null) {
                        c1859410yUF.LIZIZ();
                    }
                } else if (c1859410yUF != null) {
                    c1859410yUF.LJI();
                }
            } else if (c1859410yUF != null) {
                c1859410yUF.LIZIZ();
            }
            C1859360yUA.LJFF = false;
            C1859360yUA.LJ = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TakoTypewriterPauseController@5bc8.pendingResumeRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoTypewriterPauseController@5bc8.pendingResumeRunnable$1");
    }
}
