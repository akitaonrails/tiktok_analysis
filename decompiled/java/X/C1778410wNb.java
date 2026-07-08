package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0wNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1778410wNb {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEVideoEncodeSettings.COMPILE_TYPE.values().length];
        LIZIZ = iArr;
        try {
            iArr[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_GIF.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_HIGH_GIF.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_TRANSPARENT_GIF.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_JPEG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZIZ[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_PNG.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        int[] iArr2 = new int[VEEditor.SCALE_MODE.values().length];
        LIZ = iArr2;
        try {
            iArr2[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_CANVAS.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_FIT_START_WITH_2DENGINE.ordinal()] = 5;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[VEEditor.SCALE_MODE.SCALE_MODE_FIT_END_WITH_2DENGINE.ordinal()] = 6;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
    }
}
