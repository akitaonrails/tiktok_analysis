package X;

import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270690jAh {
    public static boolean LIZ(EnumC1270750jAn enumC1270750jAn, int i) {
        int i2 = C1270740jAm.LIZ[enumC1270750jAn.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2 && i <= 5) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, String str) {
        InterfaceC1269880j9O logIODevice;
        if (LIZ(EnumC1270750jAn.REPORT_ALOG, i) && (logIODevice = AVLog.getLogIODevice()) != null) {
            logIODevice.LIZIZ(i, "CameraVideoCapturer", "camera_event", str, null);
        }
    }

    public static void LIZJ(int i, String str, String str2) {
        InterfaceC1269880j9O logKibanaDevice;
        if (LIZ(EnumC1270750jAn.REPORT_TRACE, i) && (logKibanaDevice = AVLog.getLogKibanaDevice()) != null) {
            logKibanaDevice.LIZIZ(i, str, "camera_event", str2, null);
        }
    }
}
