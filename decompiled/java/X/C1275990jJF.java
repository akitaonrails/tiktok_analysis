package X;

import com.ss.bytertc.engine.live.ByteRTCStreamMixingEvent;
import com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamType;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275990jJF implements IMixedStreamObserver {
    public final /* synthetic */ C1275970jJD LIZ;

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final boolean isSupportClientPushStream() {
        return false;
    }

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i) {
    }

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final void onMixingAudioFrame(String str, byte[] bArr, int i, long j) {
    }

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final void onMixingDataFrame(String str, byte[] bArr, long j) {
    }

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final void onMixingVideoFrame(String str, VideoFrame videoFrame) {
    }

    public C1275990jJF(C1275970jJD c1275970jJD) {
        this.LIZ = c1275970jJD;
    }

    @Override // com.ss.bytertc.engine.live.IMixedStreamObserver
    public final void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, int i, String str2, MixedStreamType mixedStreamType) {
        if (byteRTCStreamMixingEvent != null && mixedStreamType != null && str.equals(this.LIZ.LJII)) {
            if (C1268530j7D.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Received onStreamMixingEvent, eventType: ");
                sbLIZ.append(byteRTCStreamMixingEvent);
                sbLIZ.append(" taskId: ");
                sbLIZ.append(str);
                sbLIZ.append(" error: ");
                sbLIZ.append(byteRTCTranscoderErrorCode);
                sbLIZ.append(" mixType: ");
                sbLIZ.append(mixedStreamType);
                AVLog.iod("ServerStreamMixer", C2188811AlT.LIZIZ(sbLIZ));
            }
            AVLog.debugTrace(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, mixedStreamType);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mix event: ");
            sbLIZ2.append(byteRTCStreamMixingEvent.toString());
            sbLIZ2.append(", taskId: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", error: ");
            sbLIZ2.append(byteRTCTranscoderErrorCode.toString());
            sbLIZ2.append(", mixType: ");
            sbLIZ2.append(mixedStreamType.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            if (byteRTCStreamMixingEvent != ByteRTCStreamMixingEvent.STREAM_MIXING_UPDATE) {
                this.LIZ.LJ.LJ(byteRTCStreamMixingEvent, str2, byteRTCTranscoderErrorCode.value(), i, mixedStreamType.value());
            }
        }
    }
}
