package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0YC8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YC8 {
    public final C0YEM LIZ;
    public final C0YC9 LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;

    public C0YC8(C0YEM c0yem) {
        C0YC9 c0yc9 = new C0YC9();
        this.LIZ = c0yem;
        this.LIZIZ = c0yc9;
        this.LIZJ = -1;
        this.LIZLLL = "";
        this.LJII = -1;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1;
    }

    public final void LIZ(Exception exc) throws Exception {
        this.LIZ.LIZLLL().LJIIIIZZ("SendMsgTracker", "send message fetch failed", exc);
        if (exc instanceof C0Y8K) {
            C0Y8K c0y8k = (C0Y8K) exc;
            this.LIZJ = c0y8k.getErrorCode();
            this.LIZLLL = c0y8k.getErrorMessage();
            if (c0y8k.getErrorResponse() != null) {
                C0YC9 c0yc9 = this.LIZIZ;
                c0yc9.LJJIIJZLJL = C0YIF.LIZ;
                c0yc9.LJJIIJ = c0y8k.getErrorCode();
                return;
            } else {
                this.LIZIZ.LJJIIJZLJL = c0y8k.getErrorCode();
                return;
            }
        }
        this.LIZJ = -9999;
        String message = exc.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        this.LIZLLL = message;
        this.LIZIZ.LJJIIJZLJL = -9999;
        if (!this.LIZ.LJIIIZ().LIZIZ) {
        } else {
            throw exc;
        }
    }

    public final void LIZIZ(C0YCX c0ycx) {
        this.LIZIZ.LJJ = c0ycx.LJII;
        C0YC9 c0yc9 = this.LIZIZ;
        c0yc9.LJJIIZ = c0ycx.LJI;
        c0yc9.LJIIJ = SystemClock.uptimeMillis();
        this.LIZIZ.LJIIJJI = System.currentTimeMillis();
        C0YC9 c0yc92 = this.LIZIZ;
        c0yc92.LJIIL = c0yc92.LJIIJ - this.LIZIZ.LJIIIIZZ;
        if (this.LIZIZ.LJIILIIL > 0) {
            C0YC9 c0yc93 = this.LIZIZ;
            c0yc93.LJIIZILJ = c0yc93.LJIILIIL - this.LIZIZ.LJIIIZ;
        }
        if (this.LIZIZ.LJIILJJIL > 0) {
            C0YC9 c0yc94 = this.LIZIZ;
            c0yc94.LJIJ = c0yc94.LJIIJJI - this.LIZIZ.LJIILJJIL;
            C0YC9 c0yc95 = this.LIZIZ;
            c0yc95.LJIILL = c0yc95.LJIILJJIL - this.LIZIZ.LJIILIIL;
        }
        C0YC9 c0yc96 = this.LIZIZ;
        c0yc96.LJIILLIIL = (c0yc96.LJIIL - (this.LIZIZ.LJIILJJIL - this.LIZIZ.LJIILIIL)) / ((long) 2);
    }

    public final void LIZJ(long j) {
        int iIntValue;
        this.LIZIZ.LIZLLL = SystemClock.uptimeMillis();
        this.LIZIZ.LJJIIZI = j;
        Integer numLIZ = this.LIZ.LJ().LIZ().LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LJIIIIZZ = iIntValue;
    }
}
