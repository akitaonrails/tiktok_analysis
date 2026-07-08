package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.livepusher.LivePusherLocalAudioState;
import com.ss.bytertc.engine.livepusher.LivePusherLocalVideoState;
import com.ss.bytertc.engine.livepusher.LivePusherStatus;

/* JADX INFO: renamed from: X.0jNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1278700jNc {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[LivePusherStatus.values().length];
        try {
            iArr[LivePusherStatus.LIVE_PUSH_STATUS_CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[LivePusherStatus.LIVE_PUSH_STATUS_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[LivePusherStatus.LIVE_PUSH_STATUS_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
        int[] iArr2 = new int[LivePusherLocalAudioState.values().length];
        try {
            iArr2[LivePusherLocalAudioState.LIVE_PUSHER_LOCAL_AUDIO_STATE_FIRST_FRAME_ENCODED.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[LivePusherLocalAudioState.LIVE_PUSHER_LOCAL_AUDIO_STATE_FIRST_FRAME_SENT.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[LivePusherLocalVideoState.values().length];
        try {
            iArr3[LivePusherLocalVideoState.LIVE_PUSHER_LOCAL_VIDEO_STATE_FIRST_FRAME_ENCODED.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr3[LivePusherLocalVideoState.LIVE_PUSHER_LOCAL_VIDEO_STATE_FIRST_FRAME_SENT.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZJ = iArr3;
    }
}
