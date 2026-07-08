package X;

import Y.ARunnableS53S0300000_20;
import android.os.Handler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0j42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266560j42 implements InterfaceC1274500jGq, InterfaceC1270200j9u {
    public final boolean LL = true;
    public C1270350jA9 LLILLJJLI;
    public VideoTrack LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final InterfaceC1267050j4p LLIZ;
    public final VideoMixer.VideoMixerDescription LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final VideoFrameStatics LLJIJIL;

    @Override // X.InterfaceC1270200j9u
    public final void LJ() {
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJI(int i, Exception exc) {
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIILIIL(int i, int i2, int i3, String str) {
    }

    @Override // X.InterfaceC1274500jGq
    public final synchronized void release() {
        InterfaceC1267050j4p interfaceC1267050j4p = this.LLIZ;
        if (interfaceC1267050j4p != null) {
            ((C1266570j43) interfaceC1267050j4p).LIZ(this);
        }
        C1270350jA9 c1270350jA9 = this.LLILLJJLI;
        if (c1270350jA9 != null) {
            c1270350jA9.release();
            this.LLILLJJLI = null;
        }
        VideoTrack videoTrack = this.LLILLL;
        if (videoTrack != null && !this.LL) {
            videoTrack.release();
            this.LLILLL = null;
        }
    }

    @Override // X.InterfaceC1274500jGq
    public final String name() {
        return this.LLILLL.id();
    }

    @Override // X.InterfaceC1274500jGq
    public final int stop() {
        AVLog.iow("InputVideoStream", "InputVideoStream: stop.");
        this.LLILLJJLI.stop();
        return 0;
    }

    @Override // X.InterfaceC1274500jGq
    public final int start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputVideoStream: start.width:");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(",height:");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(",fps:");
        sbLIZ.append(this.LLILZ);
        AVLog.iow("InputVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LLJI(this.LLILZIL, this.LLILZLL, this.LLILZ);
        return 0;
    }

    @Override // X.InterfaceC1274500jGq
    public final VideoMixer.VideoMixerDescription LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1274500jGq
    public final void LJIILJJIL(VideoMixer.VideoMixerDescription videoMixerDescription) {
        if (videoMixerDescription == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update mix description:");
        sbLIZ.append(this);
        sbLIZ.append(",desc:");
        sbLIZ.append(videoMixerDescription);
        AVLog.iow("InputVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL.copy(videoMixerDescription);
        C1266570j43 c1266570j43 = (C1266570j43) this.LLIZ;
        C1283100jUi.LIZIZ(c1266570j43.LIZ.LL, new ARunnableS53S0300000_20(this, videoMixerDescription, c1266570j43, 62));
    }

    @Override // X.InterfaceC1274500jGq
    public final int LJIIL(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j) {
        if (i != this.LLJI || i2 != this.LLJ) {
            this.LLJI = i;
            this.LLJ = i2;
            this.LLILLJJLI.adaptOutputFormat(i, i2, this.LLILZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Report first video frame at ");
            sbLIZ.append(i);
            sbLIZ.append("x");
            sbLIZ.append(i2);
            sbLIZ.append(" timestamp ");
            sbLIZ.append(j);
            AVLog.iod("InputVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJIJIL.add();
        this.LLILLJJLI.LLJILJILJ(byteBufferArr, iArr, i, i2, j, TimeUtils.currentTimeMs());
        return 0;
    }

    public C1266560j42(MediaEngineFactory mediaEngineFactory, Handler handler, C1266570j43 c1266570j43, int i, int i2, int i3, String str) {
        C1270350jA9 c1270350jA9 = new C1270350jA9(this, handler, null);
        this.LLILLJJLI = c1270350jA9;
        this.LLILLL = mediaEngineFactory.createVideoTrack(c1270350jA9, str);
        this.LLIZ = c1266570j43;
        this.LLILZ = i3;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZLLLIL = VideoMixer.VideoMixerDescription.INVISIABLE();
        this.LLJIJIL = new VideoFrameStatics(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC1274500jGq
    public final int LJIIJJI(long j, int i, int i2, int i3, float[] fArr, int i4, boolean z) {
        if (i2 != this.LLJI || i3 != this.LLJ) {
            this.LLJI = i2;
            this.LLJ = i3;
            this.LLILLJJLI.adaptOutputFormat(i2, i3, this.LLILZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Report first video frame at ");
            sbLIZ.append(i2);
            sbLIZ.append("x");
            sbLIZ.append(i3);
            sbLIZ.append(" timestamp ");
            sbLIZ.append(j);
            AVLog.iod("InputVideoStream", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJIJIL.add();
        return this.LLILLJJLI.LLJIJIL(i, z, i2, i3, 0, fArr, j, null, TimeUtils.currentTimeMs(), 0L);
    }
}
