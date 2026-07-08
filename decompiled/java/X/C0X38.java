package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.common.jato.dex.DexTricksNativeHolder;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0X38, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X38 {
    public static int LIZ;
    public static volatile boolean LIZIZ;
    public static boolean LIZJ;

    public static int LIZ() {
        if (!LIZIZ) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        int iLIZ = DeviceInfoUtils.LIZ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean z = CastIntegerProtector.parseInt(DeviceInfoUtils.LIZIZ("ro.build.version.preview_sdk")) != 0;
        if ((LIZJ && iLIZ != i && iLIZ >= 35) || i >= 35 || (z && i == 34)) {
            return DexTricksNativeHolder.verifyNone15();
        }
        if (i >= 21) {
            return DexTricksNativeHolder.verifyNone(LIZ);
        }
        if (i != 19 || DeviceInfoUtils.LIZJ()) {
            return 0;
        }
        return DexTricksNativeHolder.dvmVerifyNone();
    }

    public static synchronized void LIZIZ(Context context, boolean z) {
        LIZJ(context.getApplicationInfo(), z);
    }

    public static synchronized void LIZJ(ApplicationInfo applicationInfo, boolean z) {
        if (!DeviceInfoUtils.LIZLLL() && !DeviceInfoUtils.LJ()) {
            if (LIZIZ) {
                return;
            }
            LIZJ = z;
            LIZ = applicationInfo.targetSdkVersion;
            LIZIZ = true;
            return;
        }
        LIZIZ = false;
    }
}
