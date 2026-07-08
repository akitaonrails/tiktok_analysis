package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B8H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B8H {
    public C1B8L LIZ;
    public C1B8L LIZIZ;
    public int LIZJ;

    public final long LIZ(long j, long j2) {
        synchronized (this) {
            try {
                C1B8L c1b8l = this.LIZ;
                if (c1b8l == null) {
                    return -1L;
                }
                C1B8L c1b8l2 = null;
                C1B8L c1b8l3 = c1b8l;
                while (true) {
                    if (c1b8l3.LIZIZ > j) {
                        C1B8L c1b8l4 = c1b8l3.LIZJ;
                        c1b8l2 = c1b8l3;
                        c1b8l3 = c1b8l4;
                        if (c1b8l4 == null) {
                            break;
                        }
                    } else if (c1b8l2 != null) {
                        if (c1b8l3 == c1b8l2 || j - c1b8l3.LIZIZ >= c1b8l2.LIZIZ - j) {
                            break;
                        }
                    }
                }
                c1b8l3 = c1b8l2;
                if (c1b8l2 == null) {
                    return -1L;
                }
                long j3 = c1b8l.LIZ - c1b8l3.LIZ;
                long j4 = j2 - c1b8l3.LIZIZ;
                if (j3 < 0 || j4 <= 0) {
                    return -1L;
                }
                return j3 / j4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(long j, long j2) {
        C1B8L c1b8l;
        synchronized (this) {
            try {
                C1B8L c1b8l2 = this.LIZ;
                if (c1b8l2 != null) {
                    if (j >= c1b8l2.LIZ && j2 >= c1b8l2.LIZIZ) {
                        C1B8L c1b8l3 = c1b8l2.LIZJ;
                        if (c1b8l3 != null && j2 - c1b8l3.LIZIZ < 1000) {
                            c1b8l2.LIZ = j;
                            c1b8l2.LIZIZ = j2;
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int i = this.LIZJ;
                if (i >= 10 && (c1b8l = this.LIZIZ) != null) {
                    C1B8L c1b8l4 = c1b8l.LIZLLL;
                    c1b8l.LIZLLL = null;
                    this.LIZIZ = c1b8l4;
                    if (c1b8l4 != null) {
                        c1b8l4.LIZJ = null;
                    }
                } else {
                    this.LIZJ = i + 1;
                    c1b8l = new C1B8L();
                }
                c1b8l.LIZ = j;
                c1b8l.LIZIZ = j2;
                if (c1b8l2 != null) {
                    c1b8l.LIZJ = c1b8l2;
                    c1b8l2.LIZLLL = c1b8l;
                }
                this.LIZ = c1b8l;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
