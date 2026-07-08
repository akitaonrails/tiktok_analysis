package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0804, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class AnonymousClass0804 implements AnonymousClass0806 {
    public C1967707nH LIZ;
    public final C1494570ozn LIZIZ;

    @Override // X.AnonymousClass0806
    public final <T> T get() {
        return (T) this.LIZ.LIZ;
    }

    @Override // X.AnonymousClass0806
    public final AnonymousClass0806 LIZ(String str) {
        long jNanoTime = System.nanoTime();
        try {
            try {
                this.LIZ = this.LIZ.LIZJ(str, new Class[0], new Object[0]);
                C1494570ozn c1494570ozn = this.LIZIZ;
                if (c1494570ozn != null) {
                    C1494680ozy c1494680ozy = c1494570ozn.LJLJI.LIZJ;
                    if (c1494680ozy.LJ == -1) {
                        c1494680ozy.LJ = 0L;
                    }
                    c1494680ozy.LJ += System.nanoTime() - jNanoTime;
                }
                return this;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C081H(e.getMessage(), e.getCause());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1494570ozn c1494570ozn2 = this.LIZIZ;
            if (c1494570ozn2 != null) {
                C1494680ozy c1494680ozy2 = c1494570ozn2.LJLJI.LIZJ;
                if (c1494680ozy2.LJ == -1) {
                    c1494680ozy2.LJ = 0L;
                }
                c1494680ozy2.LJ += System.nanoTime() - jNanoTime;
            }
            throw th;
        }
    }

    public AnonymousClass0804(C1967707nH c1967707nH, C1494570ozn c1494570ozn) {
        this.LIZ = c1967707nH;
        this.LIZIZ = c1494570ozn;
    }

    @Override // X.AnonymousClass0806
    public final AnonymousClass0806 LIZIZ(String str, Class<?>[] clsArr, Object... objArr) {
        long jNanoTime = System.nanoTime();
        try {
            try {
                this.LIZ = this.LIZ.LIZJ(str, clsArr, objArr);
                C1494570ozn c1494570ozn = this.LIZIZ;
                if (c1494570ozn != null) {
                    C1494680ozy c1494680ozy = c1494570ozn.LJLJI.LIZJ;
                    if (c1494680ozy.LJ == -1) {
                        c1494680ozy.LJ = 0L;
                    }
                    c1494680ozy.LJ += System.nanoTime() - jNanoTime;
                }
                return this;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C081H(e.getMessage(), e.getCause());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1494570ozn c1494570ozn2 = this.LIZIZ;
            if (c1494570ozn2 != null) {
                C1494680ozy c1494680ozy2 = c1494570ozn2.LJLJI.LIZJ;
                if (c1494680ozy2.LJ == -1) {
                    c1494680ozy2.LJ = 0L;
                }
                c1494680ozy2.LJ += System.nanoTime() - jNanoTime;
            }
            throw th;
        }
    }
}
