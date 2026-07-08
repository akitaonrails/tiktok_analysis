package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13J9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13J9 {
    public final C13E8<char[]> LIZ = new C13E8<>();
    public int LIZIZ;

    public final char[] LIZ(int i) {
        char[] cArrLJIIZILJ;
        synchronized (this) {
            try {
                cArrLJIIZILJ = this.LIZ.LJIIZILJ();
                if (cArrLJIIZILJ != null) {
                    this.LIZIZ -= cArrLJIIZILJ.length;
                } else {
                    cArrLJIIZILJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (cArrLJIIZILJ == null) {
            return new char[i];
        }
        return cArrLJIIZILJ;
    }
}
