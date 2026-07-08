package X;

import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0n0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1418380n0u {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[MusicRequestCallbackInfoType.values().length];
        try {
            iArr[MusicRequestCallbackInfoType.BEFORE_EXTRACTOR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[MusicRequestCallbackInfoType.AFTER_EXTRACTOR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[MusicRequestCallbackInfoType.ZIP_GENERATE_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[MusicRequestCallbackInfoType.ZIP_UPLOAD_TOS_SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[MusicRequestCallbackInfoType.RESPONSE_SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[MusicRequestCallbackInfoType.EXTRACTOR_CLIP128.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[MusicRequestCallbackInfoType.REQUEST_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
