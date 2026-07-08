package X;

import Y.ARunnableS13S0301000_20;
import Y.ARunnableS89S0200000_20;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282580jTs extends MediaCodec.Callback {
    public final Handler LIZ = null;
    public final /* synthetic */ C1282400jTa LIZIZ;

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    public C1282580jTs(C1282400jTa c1282400jTa) {
        this.LIZIZ = c1282400jTa;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        AVLog.ioe("HardwareVideoEncoder", "ASyncEncode error", codecException);
        AVLog.logKibana(6, "HardwareVideoEncoder", "ASyncEncode error", codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOutputFormatChanged: ");
        sbLIZ.append(mediaFormat);
        AVLog.iod("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ != null && Looper.myLooper() != this.LIZ.getLooper()) {
            C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS89S0200000_20(mediaFormat, this, 229));
        } else {
            this.LIZIZ.LLJILJILJ(mediaFormat);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (this.LIZ != null && Looper.myLooper() != this.LIZ.getLooper()) {
            C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS13S0301000_20(i, this, mediaCodec, bufferInfo, 7));
        } else {
            this.LIZIZ.LLJILJIL(mediaCodec, i, bufferInfo);
        }
    }
}
