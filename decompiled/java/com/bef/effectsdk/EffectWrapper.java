package com.bef.effectsdk;

/* JADX INFO: loaded from: classes21.dex */
public class EffectWrapper {
    public static native long nativeCreateHandle(boolean z);

    public static native int nativeDestroyHandle(long j);

    public static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    public static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    public static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    public static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    public static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    public static native void nativeSetAlgorithmModelInfos(String str);

    public static native int nativeSetAllowedList(long j, String[] strArr, int i, int i2);

    public static native void nativeSetCameraPosition(long j, boolean z);

    public static native int nativeSetClientState(long j, int i);

    public static native void nativeSetFrameOrientation(long j, int i);

    public static native void nativeSetGradeModelDownloadStatus(String str, int i);

    public static native int nativeSetInputText(long j, String str, int i, int i2, String str2);

    public static native void nativeSetOrientation(long j, int i);

    public static native int nativeSetSafeArea(long j, int i, float[][] fArr);

    public static native int nativeSetStickerPath(long j, String str);

    public static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    public static long createHandle(boolean z) {
        return nativeCreateHandle(z);
    }

    public static int destroyHandle(long j) {
        return nativeDestroyHandle(j);
    }

    public static int releaseResourceFinder(long j, ResourceFinder resourceFinder) {
        return nativeReleaseResourceFinder(j, resourceFinder);
    }

    public static void setCameraPosition(long j, boolean z) {
        nativeSetCameraPosition(j, z);
    }

    public static int setClientState(long j, int i) {
        return nativeSetClientState(j, i);
    }

    public static void setFrameOrientation(long j, int i) {
        nativeSetFrameOrientation(j, i);
    }

    public static void setOrientation(long j, int i) {
        nativeSetOrientation(j, i);
    }

    public static int setStickerPath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int setSafeArea(long j, int i, float[][] fArr) {
        return nativeSetSafeArea(j, i, fArr);
    }

    public static int setAllowedList(long j, String[] strArr, int i, int i2) {
        return nativeSetAllowedList(j, strArr, i, i2);
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2);
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2);
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2);
    }

    public static int initResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str) {
        return nativeInitResourceFinder(j, resourceFinder, i, i2, str);
    }

    public static int processAlgorithm(long j, int i, int i2, int i3, double d) {
        return nativeProcessAlgorithm(j, i, i2, i3, d);
    }

    public static int sendMessage(long j, long j2, long j3, long j4, String str) {
        return nativeSendMessage(j, j2, j3, j4, str);
    }

    public static int setInputText(long j, String str, int i, int i2, String str2) {
        return nativeSetInputText(j, str, i, i2, str2);
    }

    public static int processFrame(long j, int i, int i2, int i3, int i4, double d) {
        return nativeProcessFrame(j, i, i2, i3, i4, d);
    }
}
