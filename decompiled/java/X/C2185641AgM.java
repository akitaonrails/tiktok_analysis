package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;

/* JADX INFO: renamed from: X.1AgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2185641AgM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TECameraFrame.ETEPixelFormat.values().length];
        LIZ = iArr;
        try {
            iArr[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
