package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2028807x8 implements Runnable {
    public final Object LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final void LIZ() throws Throwable {
        try {
            Method declaredMethod = Class.forName(this.LLILLJJLI).getDeclaredMethod(this.LLILLL, new Class[0]);
            declaredMethod.setAccessible(true);
            C201955140j.LIZIZ("search", "begin invoke " + this.LLILLL);
            C2204961BRm.a0(declaredMethod, this.LL, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS8bJDCz3ydxs1sOqHnTtsfCubI0A3uTAOEGqelFK5ZAL9B", null));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("search", e);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJI("search", e2);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C201955140j.LJI("search", e3);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LancetObj@5510.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LancetObj@5510.run");
    }

    public RunnableC2028807x8(Object obj, String str, String str2) {
        this.LL = obj;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
