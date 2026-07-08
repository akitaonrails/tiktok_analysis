package X;

import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.0jbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1287540jbs {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C1287520jbq LJ;

    public final synchronized boolean LIZIZ() {
        return this.LIZLLL;
    }

    public final synchronized boolean LIZJ() {
        if (!this.LIZ) {
            this.LIZ = true;
        }
        return !this.LIZJ;
    }

    public final synchronized void LIZ(GL10 gl10) {
        boolean z;
        if (!this.LIZIZ) {
            if (!this.LIZ) {
                this.LIZ = true;
            }
            if (!gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ")) {
                z = true;
            } else {
                z = false;
            }
            this.LIZJ = z;
            notifyAll();
            this.LIZLLL = !this.LIZJ;
            this.LIZIZ = true;
        }
    }

    public final synchronized void LIZLLL(C1287520jbq c1287520jbq) {
        c1287520jbq.LLILLJJLI = true;
        if (this.LJ == c1287520jbq) {
            this.LJ = null;
        }
        notifyAll();
    }
}
