package X;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0p2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1496250p2V {
    public static final C1496310p2b LIZLLL = new C1496250p2V() { // from class: X.0p2b
        @Override // X.C1496250p2V
        public final C1496250p2V LIZLLL(long j) {
            return this;
        }

        @Override // X.C1496250p2V
        public final void LJFF() {
        }

        @Override // X.C1496250p2V
        public final C1496250p2V LJI(long j, TimeUnit timeUnit) {
            return this;
        }
    };
    public boolean LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C1496250p2V LIZ() {
        this.LIZ = false;
        return this;
    }

    public C1496250p2V LIZIZ() {
        this.LIZJ = 0L;
        return this;
    }

    public long LIZJ() {
        if (this.LIZ) {
            return this.LIZIZ;
        }
        "No deadline".toString();
        throw new IllegalStateException("No deadline");
    }

    public void LJFF() throws InterruptedIOException {
        if (Thread.interrupted()) {
            C786410Ut5.u3().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.LIZ && this.LIZIZ - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean LJ() {
        return this.LIZ;
    }

    public long LJII() {
        return this.LIZJ;
    }

    public C1496250p2V LIZLLL(long j) {
        this.LIZ = true;
        this.LIZIZ = j;
        return this;
    }

    public C1496250p2V LJI(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            this.LIZJ = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timeout < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
