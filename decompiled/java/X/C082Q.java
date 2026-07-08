package X;

import android.os.Build;
import android.os.Looper;
import android.util.Printer;
import com.bytedance.otis.optimise.lancet.ObserverWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.082Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082Q {
    public static int LIZ;
    public static Object LJ;
    public static final ObserverWrapper LJI;
    public static final Field LJII;
    public static final Field LJIIIIZZ;
    public static final ArrayList<Printer> LIZIZ = new ArrayList<>(3);
    public static final Looper LIZJ = Looper.getMainLooper();
    public static Printer LIZLLL = null;
    public static volatile boolean LJFF = false;
    public static boolean LJIIIZ = false;

    static {
        LJI = null;
        try {
            LJI = new ObserverWrapper();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = -1;
        }
        try {
            if (LIZ != -1) {
                LJII = C1958607lo.LIZ(Looper.class, "mLogging");
                if (Build.VERSION.SDK_INT > 28) {
                    LJIIIIZZ = C1958607lo.LIZ(Looper.class, "sObserver");
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZ = -1;
        }
    }

    public static void LIZ() {
        if (LIZ == 0 && LIZJ == Looper.myLooper() && Build.VERSION.SDK_INT > 28) {
            try {
                Field field = LJIIIIZZ;
                if (field == null || LJII == null) {
                    LIZ = -1;
                    return;
                }
                Object obj = field.get(null);
                LJ = obj;
                if (obj == null) {
                    field.set(null, LJI);
                    LIZ = 1;
                } else if (LJIIIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(Looper.class.getName());
                    sbLIZ.append("$Observer");
                    Class<?> cls = Class.forName(C2188811AlT.LIZIZ(sbLIZ));
                    if (cls.isAssignableFrom(obj.getClass())) {
                        ObserverWrapper observerWrapper = LJI;
                        observerWrapper.setOriginObserver(new C082R(cls, obj));
                        field.set(null, observerWrapper);
                        LIZ = 1;
                    }
                }
                Printer printer = LIZLLL;
                if (printer != null) {
                    ArrayList<Printer> arrayList = LIZIZ;
                    if (arrayList.contains(printer)) {
                        return;
                    }
                    arrayList.add(LIZLLL);
                    LIZIZ();
                    LIZLLL = null;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ = -1;
            }
        }
    }

    public static void LIZIZ() {
        try {
            Field field = LJII;
            if (field != null) {
                field.set(LIZJ, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
