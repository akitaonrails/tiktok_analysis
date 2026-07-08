package X;

import Y.ARunnableS120S0100000_20;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0j3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1266430j3p implements InterfaceC1274500jGq {
    public final /* synthetic */ C1266350j3h LL;

    @Override // X.InterfaceC1274500jGq
    public final void release() {
    }

    @Override // X.InterfaceC1274500jGq
    public final int start() {
        return 0;
    }

    @Override // X.InterfaceC1274500jGq
    public final int stop() {
        return 0;
    }

    @Override // X.InterfaceC1274500jGq
    public final VideoMixer.VideoMixerDescription LIZ() {
        return this.LL.LLLJL;
    }

    @Override // X.InterfaceC1274500jGq
    public final String name() {
        VideoTrack videoTrack = this.LL.LLJILJILJ;
        return videoTrack != null ? videoTrack.id() : "";
    }

    public C1266430j3p(C1266350j3h c1266350j3h) {
        this.LL = c1266350j3h;
    }

    @Override // X.InterfaceC1274500jGq
    public final void LJIILJJIL(VideoMixer.VideoMixerDescription videoMixerDescription) {
        this.LL.LLLJL.copy(videoMixerDescription);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update origin mix description:");
        sbLIZ.append(videoMixerDescription.toString());
        AVLog.iow("LiveStream", C2188811AlT.LIZIZ(sbLIZ));
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 353);
        Handler handler = this.LL.LL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, aRunnableS120S0100000_20);
        }
    }

    @Override // X.InterfaceC1274500jGq
    public final int LJIIL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j) {
        AbstractC1268600j7K abstractC1268600j7K;
        C1266520j3y c1266520j3y;
        C1270360jAA c1270360jAA;
        Bundle bundle;
        C1266350j3h c1266350j3h = this.LL;
        if (c1266350j3h.LLJJ()) {
            c1266350j3h.LLLLLLLZIL("byte_buffer_planes", "ExternalVideoFrameNode");
            C1266420j3o c1266420j3o = c1266350j3h.LLJJJIL;
            if (c1266420j3o != null && (c1266520j3y = c1266420j3o.LJII) != null && (c1270360jAA = c1266520j3y.LL) != null && byteBufferArr.length >= 3 && iArr.length >= 3) {
                VideoFrame videoFrame = new VideoFrame(C1271900jCe.LIZJ(i, i2, C1270360jAA.LJIIJ(byteBufferArr[0]), iArr[0], C1270360jAA.LJIIJ(byteBufferArr[1]), iArr[1], C1270360jAA.LJIIJ(byteBufferArr[2]), iArr[2], TimeUtils.currentTimeMs(), null, TimeUtils.nativeTimeUTCMicros() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 0L), 0, j);
                try {
                    C1266350j3h c1266350j3h2 = c1270360jAA.LLILLL;
                    if (c1266350j3h2 == null || !c1266350j3h2.LLLFF(videoFrame, "byte_buffer_planes")) {
                        C1269730j99 c1269730j99 = c1270360jAA.LLILZ;
                        if (c1269730j99 != null) {
                            bundle = c1269730j99.LIZ(null);
                        } else {
                            bundle = new Bundle();
                        }
                        c1270360jAA.LJIIIZ(videoFrame, bundle);
                    }
                    videoFrame.release();
                    return 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    videoFrame.release();
                    throw th;
                }
            }
            return -1;
        }
        c1266350j3h.LLLLLLLZIL("byte_buffer_planes", "LiveStreamVideoCapture");
        LiveStreamVideoCapture liveStreamVideoCapture = c1266350j3h.LLJJIJIL;
        if (liveStreamVideoCapture != null) {
            if ((liveStreamVideoCapture.LLJJIJIL != 1 && !liveStreamVideoCapture.LLJJJJJIL) || (abstractC1268600j7K = liveStreamVideoCapture.LLJJL) == null || !(abstractC1268600j7K instanceof C1269670j93)) {
                return -1;
            }
            long jNativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
            ((C1270350jA9) liveStreamVideoCapture.LLJJL).LLJILJILJ(byteBufferArr, iArr, i, i2, jNativeNanoTime, jNativeNanoTime / 1000);
            return 0;
        }
        return -1;
    }

    @Override // X.InterfaceC1274500jGq
    public final int LJIIJJI(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z) {
        return this.LL.LJIIJJI(j, i, i2, i3, fArr, 0, z);
    }
}
