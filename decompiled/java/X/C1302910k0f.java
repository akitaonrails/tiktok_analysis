package X;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302910k0f {
    public static boolean LIZ(int i, int i2) {
        return (i2 & i) == i;
    }

    public static boolean LIZIZ() {
        C1302930k0h.LIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasPlatformV2Apis: versionSdkInt=[");
        int i = Build.VERSION.SDK_INT;
        sbLIZ.append(i);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        return i >= 34 || Intrinsics.LJFF(Build.VERSION.CODENAME, "UpsideDownCake");
    }

    public static void LIZJ() {
        C1302930k0h.LIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasInvalidBuildVersion: versionSdkInt=[");
        int i = Build.VERSION.SDK_INT;
        sbLIZ.append(i);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (i < 26) {
            throw new UnsupportedOperationException("Core-Telecom only supports builds from Oreo (Android 8) and above.  In order to utilize Core-Telecom, your device must be updated.");
        }
    }
}
