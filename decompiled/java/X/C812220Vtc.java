package X;

import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0Vtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812220Vtc {
    public static final Method LIZ;
    public static final Method LIZIZ;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            method = null;
        }
        LIZ = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZIZ = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
            } catch (Exception e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
        }
    }
}
