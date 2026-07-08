package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.081D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081D {
    public static boolean LIZIZ;
    public static Class<?> LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public final Object LIZ;

    public C081D(Context context) {
        this.LIZ = null;
        synchronized (C081D.class) {
            try {
                if (!LIZIZ) {
                    C2207231Ba5.LIZ(3);
                    LIZJ = C1959207lu.LIZ("android.util.BoostFramework");
                    C2207231Ba5.LIZ(3);
                    LIZLLL = C1959207lu.LIZJ(LIZJ, "perfLockAcquire", Integer.TYPE, int[].class);
                    C2207231Ba5.LIZ(3);
                    LJ = C1959207lu.LIZJ(LIZJ, "perfLockRelease", new Class[0]);
                    LIZIZ = true;
                    C2207231Ba5.LIZ(4);
                }
            } catch (Exception e) {
                LIZIZ = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BoostFramework() : Exception_1 = ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                C2207231Ba5.LIZ(6);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            Class<?> cls = LIZJ;
            if (cls != null) {
                this.LIZ = C1959207lu.LIZIZ(cls, Context.class).newInstance(context);
            }
        } catch (Exception e2) {
            try {
                this.LIZ = C1959207lu.LIZIZ(LIZJ, new Class[0]).newInstance(new Object[0]);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BoostFramework() : Exception_3 = ");
                sbLIZ2.append(e2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2207231Ba5.LIZ(6);
            }
        }
    }

    public final void LIZ(int i, int... iArr) {
        try {
            Method method = LIZLLL;
            if (method != null) {
                int iIntValue = ((Integer) C2204961BRm.a0(method, this.LIZ, new Object[]{Integer.valueOf(i), iArr}, new C0WZX("dTF6Tg0zW4TPRhkiSh/KcASDDRsBmUXBBw==", null))).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invoke perfLockAcquire result ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" for ");
                sbLIZ.append(i);
                sbLIZ.append(" with ");
                sbLIZ.append(Arrays.toString(iArr));
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
