package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.a;
import com.google.gson.internal.r;
import com.google.gson.internal.s;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09CQ {
    public static volatile Gson LIZ;
    public static volatile boolean LIZIZ = !((Boolean) C2277531ECp.LJFF.getValue()).booleanValue();
    public static volatile boolean LIZJ = !((Boolean) C2277531ECp.LJ.getValue()).booleanValue();
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final boolean LJI;
    public static final Map<Class<?>, TypeVariable<Class<?>>[]> LJII;
    public static final Method LJIIIIZZ;
    public static Object LJIIIZ;
    public static Method LJIIJ;
    public static Method LJIIJJI;
    public static Method LJIIL;
    public static Method LJIILIIL;

    static {
        C2333109Cf c2333109Cf = C2333109Cf.LIZ;
        c2333109Cf.getClass();
        LIZLLL = ((Boolean) C2333109Cf.LJ.getValue()).booleanValue();
        c2333109Cf.getClass();
        LJ = ((Boolean) C2333109Cf.LJFF.getValue()).booleanValue();
        c2333109Cf.getClass();
        LJFF = ((Boolean) C2333109Cf.LJI.getValue()).booleanValue();
        c2333109Cf.getClass();
        LJI = ((Boolean) C2333109Cf.LJII.getValue()).booleanValue();
        LJII = new ConcurrentHashMap();
        try {
            Method declaredMethod = a.class.getDeclaredMethod("LJLJI", new Class[0]);
            LJIIIIZZ = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL() {
        if (LJIIIZ == null || LJIIJ == null) {
            synchronized (C09CQ.class) {
                try {
                    if (LJIIIZ == null || LJIIJ == null) {
                        Class<?> cls = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        Method method = cls.getMethod("allocateInstance", Class.class);
                        LJIIIZ = obj;
                        LJIIJ = method;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZJ(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Abstract class can't be instantiated! Class name: ");
            sbLIZ.append(cls.getName());
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Interface can't be instantiated! Interface name: ");
        sbLIZ2.append(cls.getName());
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static k LIZ(C09CU c09cu, C09D6 c09d6) {
        int i = C09CR.LIZ[c09d6.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        c09cu.LJJJJJL();
                        return m.LL;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected token: ");
                    sbLIZ.append(c09d6);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return new q(Boolean.valueOf(c09cu.LJJ()));
            }
            return new q((Number) new r(c09cu.LJJJZ()));
        }
        return new q(c09cu.LJJJZ());
    }

    public static k LIZIZ(C09CU c09cu, C09D6 c09d6) {
        int i = C09CR.LIZ[c09d6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            c09cu.LIZIZ();
            return new n();
        }
        c09cu.LIZ();
        return new h();
    }

    public static Object LJ(C09CU c09cu, C09D6 c09d6) {
        int i = C09CR.LIZ[c09d6.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        c09cu.LJJJJJL();
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected token: ");
                    sbLIZ.append(c09d6);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return Boolean.valueOf(c09cu.LJJ());
            }
            return TypeAdapters.LJIIL.read(c09cu);
        }
        return c09cu.LJJJZ();
    }

    public static Object LJFF(C09CU c09cu, C09D6 c09d6) {
        int i = C09CR.LIZ[c09d6.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            c09cu.LIZIZ();
            return new s();
        }
        c09cu.LIZ();
        return new ArrayList();
    }
}
