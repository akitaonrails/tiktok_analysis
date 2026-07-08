package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: X.12LS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LS {
    public static int LIZ(SidecarDeviceState sidecarDeviceState) {
        try {
            return sidecarDeviceState.posture;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return ((Integer) SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return 0;
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return 0;
            }
        }
    }

    public static List LIZIZ(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return C13BV.INSTANCE;
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return C13BV.INSTANCE;
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return C13BV.INSTANCE;
            }
        }
    }

    public static void LIZJ(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }
}
