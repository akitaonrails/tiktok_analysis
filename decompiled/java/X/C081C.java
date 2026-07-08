package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.081C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081C {
    public static boolean LIZIZ;
    public static Class<?> LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Method LJI;
    public static Method LJII;
    public final Object LIZ;

    public final int LIZJ() {
        try {
            Method method = LJ;
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.LIZ, new Object[0], new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBCA==", null))).intValue();
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            C2207231Ba5.LIZ(6);
            return -1;
        }
    }

    public C081C(Context context) {
        this.LIZ = null;
        synchronized (C081C.class) {
            try {
                if (!LIZIZ) {
                    C2207231Ba5.LIZ(3);
                    LIZJ = C1959207lu.LIZ("com.mediatek.perfservice.PerfServiceWrapper");
                    C2207231Ba5.LIZ(3);
                    Class cls = Integer.TYPE;
                    LIZLLL = C1959207lu.LIZJ(LIZJ, "userGetCapability", cls);
                    C2207231Ba5.LIZ(3);
                    LJ = C1959207lu.LIZJ(LIZJ, "userRegScn", new Class[0]);
                    C2207231Ba5.LIZ(3);
                    LJFF = C1959207lu.LIZJ(LIZJ, "userRegScnConfig", cls, cls, cls, cls, cls, cls);
                    C2207231Ba5.LIZ(3);
                    C1959207lu.LIZJ(LIZJ, "userEnable", cls);
                    C2207231Ba5.LIZ(3);
                    LJI = C1959207lu.LIZJ(LIZJ, "userEnableTimeoutMs", cls, cls);
                    C2207231Ba5.LIZ(3);
                    LJII = C1959207lu.LIZJ(LIZJ, "userDisable", cls);
                    LIZIZ = true;
                    C2207231Ba5.LIZ(4);
                }
            } catch (Exception e) {
                LIZIZ = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PerfService() : Exception_1 = ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(6);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            Class<?> cls2 = LIZJ;
            if (cls2 != null) {
                this.LIZ = C1959207lu.LIZIZ(cls2, Context.class).newInstance(context);
            }
        } catch (Exception e2) {
            try {
                this.LIZ = C1959207lu.LIZIZ(LIZJ, new Class[0]).newInstance(new Object[0]);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MTKPerfService() : Exception_4 = ");
                sbLIZ2.append(e2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2207231Ba5.LIZ(6);
            }
        }
    }

    public final int LIZLLL(int i) {
        try {
            Method method = LIZLLL;
            if (method != null) {
                return ((Integer) C2204961BRm.a0(method, this.LIZ, new Object[]{Integer.valueOf(i)}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBCA==", null))).intValue();
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            C2207231Ba5.LIZ(6);
            return -1;
        }
    }

    public final void LIZ(int i, int i2) {
        try {
            Method method = LJI;
            if (method != null) {
                C2204961BRm.a0(method, this.LIZ, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBCA==", null));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke userEnableTimeoutMs with handle ");
                sbLIZ.append(i);
                sbLIZ.append(" and timeout ");
                sbLIZ.append(i2);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Exception ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2207231Ba5.LIZ(6);
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        try {
            Method method = LJFF;
            if (method != null) {
                C2204961BRm.a0(method, this.LIZ, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), -1, -1}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBCA==", null));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke userRegScnConfig with handle ");
                sbLIZ.append(i);
                sbLIZ.append(" and cmd ");
                sbLIZ.append(i2);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Exception ");
            sbLIZ2.append(e);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2207231Ba5.LIZ(6);
        }
    }
}
