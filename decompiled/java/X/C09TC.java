package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;

/* JADX INFO: renamed from: X.09TC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C09TC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SAMICoreCallBackEventType.values().length];
        try {
            iArr[SAMICoreCallBackEventType.TTS_Started.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[SAMICoreCallBackEventType.TTS_Finished.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[SAMICoreCallBackEventType.TTS_Failed.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[SAMICoreCallBackEventType.TTS_Player_Finished.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[SAMICoreCallBackEventType.TTS_GetResulted.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
