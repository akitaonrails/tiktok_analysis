package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.stream.LyraxStreamProtocol;

/* JADX INFO: renamed from: X.0jMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1277990jMT {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[LyraxStreamProtocol.values().length];
        LIZJ = iArr;
        try {
            iArr[LyraxStreamProtocol.RTP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZJ[LyraxStreamProtocol.RTMP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        int[] iArr2 = new int[LyraxNetworkQuality.values().length];
        LIZIZ = iArr2;
        try {
            iArr2[LyraxNetworkQuality.EXCELLENT.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZIZ[LyraxNetworkQuality.GOOD.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZIZ[LyraxNetworkQuality.POOR.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZIZ[LyraxNetworkQuality.BAD.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            LIZIZ[LyraxNetworkQuality.VERYBAD.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            LIZIZ[LyraxNetworkQuality.DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        int[] iArr3 = new int[LyraxPublisherState.values().length];
        LIZ = iArr3;
        try {
            iArr3[LyraxPublisherState.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            LIZ[LyraxPublisherState.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            LIZ[LyraxPublisherState.RECONNECTING.ordinal()] = 3;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            LIZ[LyraxPublisherState.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            LIZ[LyraxPublisherState.STOP.ordinal()] = 5;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
    }
}
