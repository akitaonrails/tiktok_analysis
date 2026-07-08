package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.StoryLivePhotoMode;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: renamed from: X.0nYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1439400nYo {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[StoryLivePhotoMode.values().length];
        try {
            iArr[StoryLivePhotoMode.LIVE_PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[StoryLivePhotoMode.STATIC.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[StoryLivePhotoMode.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[VEVideoEncodeSettings.COMPILE_TYPE.values().length];
        try {
            iArr2[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_WEBP.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_PNG.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
    }
}
