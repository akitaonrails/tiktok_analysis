package X;

import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.utils.IAudioFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275610jId implements IAudioFrameObserver {
    public long LIZ;

    @Override // com.ss.bytertc.engine.IAudioFrameObserver
    public final void onRemoteUserAudioFrame(StreamKey streamKey, IAudioFrame iAudioFrame) {
    }

    @Override // com.ss.bytertc.engine.IAudioFrameObserver
    public final void onMixedAudioFrame(IAudioFrame iAudioFrame) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LIZ > 20000) {
            AVLog.w("ClientImpl", "onMixedAudioFrame");
            this.LIZ = jCurrentTimeMillis;
        }
        throw null;
    }

    @Override // com.ss.bytertc.engine.IAudioFrameObserver
    public final void onPlaybackAudioFrame(IAudioFrame iAudioFrame) {
        throw null;
    }

    @Override // com.ss.bytertc.engine.IAudioFrameObserver
    public final void onRecordAudioFrame(IAudioFrame iAudioFrame) {
        throw null;
    }
}
