package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.083F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083F {
    public static Class LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Object LIZLLL;
    public static Object LJ;
    public static Object LJFF;
    public static final Set<Integer> LJI;
    public static Class LJII;

    static {
        HashSet hashSet = new HashSet();
        LJI = hashSet;
        hashSet.add(113);
        hashSet.add(114);
        hashSet.add(115);
        hashSet.add(116);
        hashSet.add(121);
        hashSet.add(122);
        hashSet.add(100);
        hashSet.add(159);
        hashSet.add(123);
    }

    public static Object LIZ() {
        if (LJ == null) {
            try {
                synchronized (C083F.class) {
                    try {
                        if (LJ == null) {
                            if (LJII == null) {
                                LJII = Class.forName("android.app.ActivityThread");
                            }
                            LJ = C1968107nL.LIZLLL(LJII, new Object[0]);
                        }
                        if (LJ == null && Looper.myLooper() != Looper.getMainLooper()) {
                            Object obj = new Object();
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(obj, 164));
                            if (LJ == null) {
                                synchronized (obj) {
                                    try {
                                        obj.wait(Mp4ScreenVideoLoadTimeout.CONTROL);
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th2) {
            }
        }
        return LJ;
    }

    public static synchronized Class LIZIZ() {
        if (LIZ == null) {
            try {
                LIZ = Class.forName("android.app.ActivityThread");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZ;
    }

    public static synchronized Field LIZJ() {
        if (LIZIZ == null) {
            LIZIZ = C1958707lp.LIZ(LIZIZ(), "mH");
        }
        return LIZIZ;
    }

    public static synchronized Object LIZLLL() {
        if (LJFF == null) {
            try {
                LJFF = LIZJ().get(LJFF());
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LJFF;
    }

    public static synchronized Field LJ() {
        if (LIZJ == null) {
            LIZJ = C1958707lp.LIZ(LIZIZ(), "mInstrumentation");
        }
        return LIZJ;
    }

    public static synchronized Object LJFF() {
        try {
            try {
                if (LJ == null) {
                    LJ = C1968107nL.LIZLLL(LIZIZ(), new Object[0]);
                }
                return LJ;
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        }
    }

    public static boolean LJI(Message message) {
        if (((HashSet) LJI).contains(Integer.valueOf(message.what))) {
            return true;
        }
        return false;
    }
}
