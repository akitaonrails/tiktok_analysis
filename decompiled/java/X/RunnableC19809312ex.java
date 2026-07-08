package X;

/* JADX INFO: renamed from: X.12ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC19809312ex implements Runnable {
    public final long LL;
    public final long LLILLJJLI;
    public final /* synthetic */ C19812312fR LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzmp@39a4.run");
        try {
            this.LLILLL.LIZIZ.LJIIL().LJIILL(new Runnable() { // from class: X.12eY
                public final void LIZ() {
                    RunnableC19809312ex runnableC19809312ex = this.LL;
                    C19812312fR c19812312fR = runnableC19809312ex.LLILLL;
                    long j = runnableC19809312ex.LL;
                    long j2 = runnableC19809312ex.LLILLJJLI;
                    c19812312fR.LIZIZ.LJ();
                    c19812312fR.LIZIZ.LJIILJJIL().LJIIL.LIZJ("Application going to the background");
                    c19812312fR.LIZIZ.LIZIZ().LJIJI.LIZ(true);
                    C19809512ez c19809512ez = c19812312fR.LIZIZ;
                    c19809512ez.LJ();
                    c19809512ez.LIZLLL = true;
                    if (!c19812312fR.LIZIZ.LIZ.LJI.LJIL()) {
                        if (c19812312fR.LIZIZ.LIZ.LJI.LJIJI(null, C19817012gC.LJLJLJ)) {
                            c19812312fR.LIZIZ.LJFF.LIZ(j2, false, false);
                            c19812312fR.LIZIZ.LJFF.LIZJ.LIZ();
                        } else {
                            c19812312fR.LIZIZ.LJFF.LIZJ.LIZ();
                            c19812312fR.LIZIZ.LJFF.LIZ(j2, false, false);
                        }
                    }
                    c19812312fR.LIZIZ.LJIILJJIL().LJIIJJI.LIZ(Long.valueOf(j), "Application backgrounded at: timestamp_millis");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ2;
                    C1C7U.LIZ("zzmo@39a3.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ2) {
                        }
                    }
                    C1C7U.LIZIZ("zzmo@39a3.run");
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzmp@39a4.run");
    }

    public RunnableC19809312ex(C19812312fR c19812312fR, long j, long j2) {
        this.LLILLL = c19812312fR;
        this.LL = j;
        this.LLILLJJLI = j2;
    }
}
