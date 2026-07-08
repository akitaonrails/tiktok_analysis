package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823050WQl {
    public static C823060WQm LIZ = new C823060WQm(new C823070WQn());
    public static InterfaceC823030WQj LIZIZ = new InterfaceC823030WQj() { // from class: X.0WQq
        @Override // X.InterfaceC823030WQj
        public final boolean LIZ() {
            return false;
        }

        @Override // X.InterfaceC823030WQj
        public final boolean LIZIZ() {
            return false;
        }

        @Override // X.InterfaceC823030WQj
        public final void LIZJ(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC823030WQj
        public final void LIZLLL(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC823030WQj
        public final boolean LJ() {
            return false;
        }

        @Override // X.InterfaceC823030WQj
        public final void LJFF(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC823030WQj
        public final boolean LJI() {
            return false;
        }

        @Override // X.InterfaceC823030WQj
        public final void LJII(JSONObject jSONObject) {
        }
    };
    public static volatile ExecutorService LIZJ;
    public static volatile ExecutorService LIZLLL;
    public static volatile ExecutorService LJ;
    public static volatile ScheduledExecutorService LJFF;
    public static volatile ExecutorService LJI;

    public static ExecutorService LIZIZ() {
        if (LJ == null) {
            synchronized (C823050WQl.class) {
                try {
                    if (LJ == null) {
                        LJ = C0WQZ.LIZ.LIZ(C2123508Tp.LIZ(C0WQX.BACKGROUND).LIZ(), true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public static ExecutorService LJFF() {
        if (LJI == null) {
            synchronized (C823050WQl.class) {
                try {
                    if (LJI == null) {
                        LJI = C0WQZ.LIZ.LIZ(C2123508Tp.LIZ(C0WQX.SERIAL).LIZ(), true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public static ExecutorService LIZJ() {
        if (C823080WQo.LIZ()) {
            try {
                C0WTW.LIZ.getClass();
            } catch (Throwable th) {
            }
            boolean z = (C0WTW.LJIIIZ().enableInt & 1) != 0;
            if (z) {
                return (C0WTO) C0WTW.LJ.getValue();
            }
        }
        if (LIZLLL == null) {
            synchronized (C823050WQl.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = C0WQZ.LIZ.LIZ(new C2123508Tp(new C2123408To(C0WQX.DEFAULT)), true);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LIZLLL;
    }

    public static ExecutorService LIZLLL() {
        if (C823080WQo.LIZ()) {
            try {
                C0WTW.LIZ.getClass();
            } catch (Throwable th) {
            }
            boolean z = (C0WTW.LJIIIZ().enableInt & 2) != 0;
            if (z) {
                return C0WTW.LJIIIIZZ();
            }
        }
        if (LIZJ == null) {
            synchronized (C823050WQl.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = C0WQZ.LIZ.LIZ(new C2123508Tp(new C2123408To(C0WQX.IO)), true);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LIZJ;
    }

    public static ScheduledExecutorService LJ() {
        if (C823080WQo.LIZ()) {
            try {
                C0WTW.LIZ.getClass();
            } catch (Throwable th) {
            }
            boolean z = (C0WTW.LJIIIZ().enableInt & 4) != 0;
            if (z) {
                return (C0WTN) C0WTW.LJIIIIZZ.getValue();
            }
        }
        if (LJFF == null) {
            synchronized (C823050WQl.class) {
                try {
                    if (LJFF == null) {
                        C0WQS c0wqs = C0WQZ.LIZ;
                        C2123408To c2123408To = new C2123408To(C0WQX.SCHEDULED);
                        c2123408To.LIZJ = 1;
                        LJFF = (ScheduledExecutorService) c0wqs.LIZ(new C2123508Tp(c2123408To), true);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LJFF;
    }

    public static ExecutorService LIZ(C2123508Tp c2123508Tp) {
        C0WQX c0wqx = c2123508Tp.LIZ;
        if (c0wqx != C0WQX.IO && c0wqx != C0WQX.DEFAULT && c0wqx != C0WQX.BACKGROUND) {
            return C0WQZ.LIZ.LIZ(c2123508Tp, false);
        }
        throw new IllegalArgumentException();
    }

    public static boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it2 = LIZ.LIZJ.iterator();
        while (it2.hasNext()) {
            if (str.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(ExecutorService executorService) {
        if (LIZJ == null || executorService != LIZLLL()) {
            if (LIZLLL == null || executorService != LIZJ()) {
                if (LJ == null || executorService != LIZIZ()) {
                    if (LJFF == null || executorService != LJ()) {
                        if (LJI != null && executorService == LJFF()) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
