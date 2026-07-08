package X;

import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0j7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1268850j7j implements InterfaceC1268960j7u, InterfaceC1274490jGp {
    public final String LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public VideoMixer.VideoMixerDescription LLILZIL;
    public boolean LLILZLL = true;
    public final VideoFrameStatics LLIZ = new VideoFrameStatics(LSPassThroughRecordSizeConfig.DEFAULT);
    public final /* synthetic */ ViewOnTouchListenerC1268840j7i LLIZLLLIL;

    @Override // X.InterfaceC1274490jGp
    public final /* synthetic */ int LJII(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, Runnable runnable, int i5, Map map) {
        return 0;
    }

    @Override // X.InterfaceC1274490jGp
    public final /* synthetic */ boolean LJJLIIIIJ() {
        return false;
    }

    @Override // X.InterfaceC1274490jGp
    public final Handler LJJLIIIJJI() {
        return null;
    }

    @Override // X.InterfaceC1274490jGp
    public final /* synthetic */ boolean LJLLLLLL() {
        return false;
    }

    @Override // X.InterfaceC1274490jGp
    public final /* synthetic */ int LLILLL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, int i4, long j, Runnable runnable, C1271970jCl c1271970jCl, int i5, Map map) {
        return 0;
    }

    @Override // X.InterfaceC1274490jGp
    public final /* synthetic */ long getLatestRenderCostMs() {
        return 0L;
    }

    public void LJ() {
        synchronized (this.LLIZLLLIL.LLILLL) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Remove Layer(name:");
                sbLIZ.append(this.LL);
                sbLIZ.append(",w:");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(",h:");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(")");
                AVLog.ioi("LayerControl", C2188811AlT.LIZIZ(sbLIZ));
                C1267590j5h c1267590j5h = this.LLIZLLLIL.LL;
                if (c1267590j5h != null) {
                    c1267590j5h.removeTrack(this.LLILLJJLI);
                }
                ((ArrayList) this.LLIZLLLIL.LLILLL).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1274490jGp
    public final void LJJIIJ() {
        C1272880jEE c1272880jEE = this.LLIZLLLIL.LLILLJJLI;
        if (c1272880jEE != null) {
            c1272880jEE.LJJIIJ();
        }
    }

    @Override // X.InterfaceC1268870j7l
    public final VideoMixer.VideoMixerDescription LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1268870j7l
    public final int getHeight() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1268870j7l
    public final int getWidth() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1268870j7l
    public final String name() {
        return this.LL;
    }

    @Override // X.InterfaceC1274490jGp
    public final void release() {
        LJ();
    }

    @Override // X.InterfaceC1268960j7u
    public void LIZ(VideoFrame videoFrame) {
        boolean z = false;
        if (this.LLILZLL) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            this.LLILLL = rotatedWidth;
            this.LLILZ = rotatedHeight;
            this.LLILZLL = false;
        }
        if (this.LLIZLLLIL.LIZLLL(videoFrame.getTimestampNs() / 1000)) {
            VideoFrameStatics videoFrameStatics = this.LLIZ;
            if (videoFrameStatics != null) {
                videoFrameStatics.add();
            }
            ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLIZLLLIL;
            if (viewOnTouchListenerC1268840j7i.LLJIJIL.LIZIZ.LJJJJL) {
                C1268860j7k c1268860j7k = viewOnTouchListenerC1268840j7i.LLIZ;
                if (c1268860j7k != null) {
                    c1268860j7k.LIZ(true);
                }
                C1272880jEE c1272880jEE = this.LLIZLLLIL.LLILLJJLI;
                if (c1272880jEE != null) {
                    c1272880jEE.onFrame(videoFrame);
                    return;
                }
                return;
            }
            C1267590j5h c1267590j5h = viewOnTouchListenerC1268840j7i.LL;
            if (c1267590j5h == null) {
                return;
            }
            if (viewOnTouchListenerC1268840j7i.LLIZ != null) {
                int originTrackIndex = c1267590j5h.getOriginTrackIndex();
                int i = this.LLILLJJLI;
                if (originTrackIndex >= 0 ? originTrackIndex == i : i == 0) {
                    z = true;
                }
                this.LLIZLLLIL.LLIZ.LIZ(z);
            }
            int i2 = this.LLILLJJLI;
            synchronized (c1267590j5h) {
                try {
                    if (!c1267590j5h.LL) {
                        c1267590j5h.mixFrame(i2, videoFrame);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1268870j7l
    public void LIZJ(VideoMixer.VideoMixerDescription videoMixerDescription) {
        VideoMixer.VideoMixerDescription videoMixerDescription2 = this.LLILZIL;
        if (videoMixerDescription != null && videoMixerDescription2 != null) {
            videoMixerDescription2.copy(videoMixerDescription);
            C1267590j5h c1267590j5h = this.LLIZLLLIL.LL;
            if (c1267590j5h != null) {
                synchronized (c1267590j5h) {
                    try {
                        c1267590j5h.updateDescription(this.LLILLJJLI, videoMixerDescription2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public void LIZLLL(String str) {
        C1267590j5h c1267590j5h = this.LLIZLLLIL.LL;
        if (c1267590j5h != null) {
            int iCreateTrack = c1267590j5h.createTrack();
            this.LLILLJJLI = iCreateTrack;
            c1267590j5h.setLayerName(iCreateTrack, str);
            this.LLILZIL = c1267590j5h.getDescription(this.LLILLJJLI);
        }
    }

    public void LJFF(VideoMixer.VideoMixerTexture videoMixerTexture) {
        if (this.LLILZLL) {
            int width = videoMixerTexture.getWidth();
            int height = videoMixerTexture.getHeight();
            this.LLILLL = width;
            this.LLILZ = height;
            this.LLILZLL = false;
        }
        ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i = this.LLIZLLLIL;
        C1267590j5h c1267590j5h = viewOnTouchListenerC1268840j7i.LL;
        if (c1267590j5h != null) {
            if (viewOnTouchListenerC1268840j7i.LLILZIL <= 0 || viewOnTouchListenerC1268840j7i.LIZLLL(TimeUtils.nativeNanoTime() / 1000)) {
                VideoFrameStatics videoFrameStatics = this.LLIZ;
                if (videoFrameStatics != null) {
                    videoFrameStatics.add();
                }
                int i = this.LLILLJJLI;
                synchronized (c1267590j5h) {
                    try {
                        if (!c1267590j5h.LL) {
                            c1267590j5h.mixFrame(i, videoMixerTexture);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1274490jGp
    public final void LJLLJ(boolean z) {
        throw new AndroidRuntimeException("BUG! should not be here");
    }

    @Override // X.InterfaceC1274490jGp
    public final void setCornerRadius(float f) {
        C1272880jEE c1272880jEE = this.LLIZLLLIL.LLILLJJLI;
        if (c1272880jEE != null) {
            c1272880jEE.setCornerRadius(f);
        }
    }

    @Override // X.InterfaceC1268870j7l, X.InterfaceC1274490jGp
    public void setEnable(boolean z) {
        C1267590j5h c1267590j5h = this.LLIZLLLIL.LL;
        if (c1267590j5h != null) {
            c1267590j5h.setEnable(this.LLILLJJLI, z);
            if (z != c1267590j5h.isEnable(this.LLILLJJLI)) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                C1274080jGA.LIZ.LIZ("LayerControl.setEnable@1", androidRuntimeException);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException;
                }
                return;
            }
            return;
        }
        AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException("BUG,mVideoMixer is null!!");
        C1274080jGA.LIZ.LIZ("LayerControl.setEnable@2", androidRuntimeException2);
        if (C1274040jG6.LIZ()) {
            throw androidRuntimeException2;
        }
    }

    public C1268850j7j(ViewOnTouchListenerC1268840j7i viewOnTouchListenerC1268840j7i, String str, int i, int i2, VideoMixer.VideoMixerDescription videoMixerDescription) {
        this.LLIZLLLIL = viewOnTouchListenerC1268840j7i;
        this.LL = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        LIZLLL(str);
        LIZJ(videoMixerDescription);
    }

    @Override // X.InterfaceC1274490jGp
    public final int LLI(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j, RunnableC1275220jI0 runnableC1275220jI0, int i3, C1271970jCl c1271970jCl, Map map) {
        VideoFrame videoFrame;
        C1271900jCe[] c1271900jCeArr = {null};
        if (byteBufferArr.length == 1) {
            ByteBuffer byteBuffer = byteBufferArr[0];
            int i4 = (i + 1) / 2;
            int i5 = i * i2;
            int i6 = ((i2 + 1) / 2) * i4;
            int i7 = i5 + i6;
            byteBuffer.position(0);
            byteBuffer.limit(i5);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBuffer.position(i5);
            byteBuffer.limit(i7);
            ByteBuffer byteBufferSlice2 = byteBuffer.slice();
            byteBuffer.position(i7);
            byteBuffer.limit(i7 + i6);
            ByteBuffer byteBufferSlice3 = byteBuffer.slice();
            C1271880jCc c1271880jCc = this.LLIZLLLIL.LLJ;
            if (c1271880jCc != null) {
                c1271900jCeArr[0] = c1271880jCc.LJ(byteBufferSlice, i, byteBufferSlice2, i2, byteBufferSlice3, i, i4, i4, i3, null);
            } else {
                c1271900jCeArr[0] = C1271900jCe.LJ(byteBufferSlice, i, byteBufferSlice2, i2, byteBufferSlice3, i, i4, i4, i3, null);
            }
        } else {
            C1271880jCc c1271880jCc2 = this.LLIZLLLIL.LLJ;
            if (c1271880jCc2 != null) {
                c1271900jCeArr[0] = c1271880jCc2.LJ(byteBufferArr[0], i, byteBufferArr[1], i2, byteBufferArr[2], iArr[0], iArr[1], iArr[2], i3, null);
            } else {
                c1271900jCeArr[0] = C1271900jCe.LJ(byteBufferArr[0], i, byteBufferArr[1], i2, byteBufferArr[2], iArr[0], iArr[1], iArr[2], i3, null);
            }
        }
        C1271900jCe c1271900jCe = c1271900jCeArr[0];
        if (c1271900jCe == null) {
            return -1;
        }
        C1271790jCT c1271790jCT = this.LLIZLLLIL.LLIZLLLIL;
        if (c1271790jCT != null) {
            videoFrame = c1271790jCT.LIZLLL(c1271900jCe, 0, 0L);
            if (videoFrame == null) {
                c1271900jCeArr[0].release();
                return 0;
            }
        } else {
            videoFrame = new VideoFrame(c1271900jCe, 0, 0L);
        }
        LIZ(videoFrame);
        videoFrame.release();
        return 0;
    }

    @Override // X.InterfaceC1274490jGp
    public final int LLIILZL(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, C1274550jGv c1274550jGv, RunnableC1275220jI0 runnableC1275220jI0, Map map) {
        int i5;
        if (z) {
            i5 = VideoMixer.TEXTURE_TYPE_OES;
        } else {
            i5 = VideoMixer.TEXTURE_TYPE_2D;
        }
        LJFF(new VideoMixer.VideoMixerTexture(i2, i3, i4, i5, new int[]{i, 0, 0}, fArr));
        return 0;
    }
}
