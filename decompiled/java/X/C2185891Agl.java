package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraFrame;

/* JADX INFO: renamed from: X.1Agl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2185891Agl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TECameraFrame.ETEPixelFormat.values().length];
        LIZ = iArr;
        try {
            iArr[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV422P.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUYV422.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_UYVY422.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_RGB8.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_RGBA8.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_GRAY8.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_BGR8.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV12.ordinal()] = 12;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_GRAY.ordinal()] = 13;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8.ordinal()] = 14;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8.ordinal()] = 15;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES.ordinal()] = 16;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            LIZ[TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Count.ordinal()] = 17;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
    }
}
