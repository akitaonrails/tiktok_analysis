package X;

import androidx.lifecycle.GenericLifecycleObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466640IRq {
    public static C466640IRq LJI;
    public boolean LIZ;
    public C466650IRr LIZIZ;
    public boolean LIZJ;
    public C466650IRr LIZLLL;
    public int LJ;
    public GenericLifecycleObserver LJFF;

    public static C466640IRq LIZJ() {
        if (LJI == null) {
            synchronized (C466640IRq.class) {
                try {
                    if (LJI == null) {
                        LJI = new C466640IRq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public final String LIZ() {
        C466650IRr c466650IRr;
        if (!this.LIZ || (c466650IRr = this.LIZIZ) == null) {
            return null;
        }
        return c466650IRr.LIZIZ;
    }

    public final String LIZIZ() {
        C466650IRr c466650IRr;
        if (!this.LIZ || (c466650IRr = this.LIZIZ) == null) {
            return null;
        }
        return c466650IRr.LIZ;
    }

    public final String LIZLLL() {
        C466650IRr c466650IRr;
        if (!this.LIZ || (c466650IRr = this.LIZIZ) == null) {
            return null;
        }
        return c466650IRr.LIZLLL;
    }
}
