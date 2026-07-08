package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0VT7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VT7 {
    public static volatile C0VT7 LIZIZ;
    public static final CopyOnWriteArrayList<C0VTA> LIZJ = new CopyOnWriteArrayList<>();
    public boolean LIZ;

    public static C0VT7 LIZ() {
        if (LIZIZ == null) {
            synchronized (C0VT7.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0VT7();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZJ() {
        synchronized (C0VT7.class) {
            try {
                if (this.LIZ) {
                    this.LIZ = false;
                    Iterator<C0VTA> it2 = LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(0);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        C0VT5 c0vt5LIZ = C0VT5.LIZ();
        if ((c0vt5LIZ.LIZLLL || c0vt5LIZ.LIZJ > 31.0f) && !C0VT9.LIZ) {
            LIZJ();
            return;
        }
        C0VT5 c0vt5LIZ2 = C0VT5.LIZ();
        if ((c0vt5LIZ2.LIZLLL || c0vt5LIZ2.LIZJ >= 30.0f) && !C0VT9.LIZ) {
            return;
        }
        synchronized (C0VT7.class) {
            try {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                Iterator<C0VTA> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL(C0VTA c0vta) {
        if (c0vta == null) {
            return;
        }
        CopyOnWriteArrayList<C0VTA> copyOnWriteArrayList = LIZJ;
        if (!copyOnWriteArrayList.contains(c0vta)) {
            copyOnWriteArrayList.add(c0vta);
        }
    }
}
