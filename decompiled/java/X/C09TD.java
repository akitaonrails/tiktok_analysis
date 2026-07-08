package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreDataType;

/* JADX INFO: renamed from: X.09TD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C09TD {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[C09TE.values().length];
        try {
            iArr[C09TE.READING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C09TE.STOP_READING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C09TE.DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[SAMICoreDataType.values().length];
        try {
            iArr2[SAMICoreDataType.SAMICoreDataType_AudioBin.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[SAMICoreCallBackEventType.values().length];
        try {
            iArr3[SAMICoreCallBackEventType.TTS_Started.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr3[SAMICoreCallBackEventType.TTS_GetResulted.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr3[SAMICoreCallBackEventType.TTS_Finished.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[SAMICoreCallBackEventType.TTS_Failed.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr3[SAMICoreCallBackEventType.TTS_WebSocketStateChanged.ordinal()] = 5;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZJ = iArr3;
    }
}
