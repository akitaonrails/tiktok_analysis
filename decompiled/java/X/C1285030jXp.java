package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285030jXp {
    public final C1285570jYh LIZ;
    public final MediaCodec LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;
    public final MediaCodec.BufferInfo LJFF = new MediaCodec.BufferInfo();

    public final ByteBuffer LIZ() {
        MediaCodec mediaCodec = this.LIZIZ;
        ByteBuffer outputBuffer = null;
        if (mediaCodec == null) {
            return null;
        }
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(this.LJFF, 1000L);
        if (iDequeueOutputBuffer >= 0) {
            outputBuffer = this.LIZIZ.getOutputBuffer(iDequeueOutputBuffer);
            this.LJ = iDequeueOutputBuffer;
        } else if (iDequeueOutputBuffer == -2 && Build.VERSION.SDK_INT >= 24) {
            MediaFormat outputFormat = this.LIZIZ.getOutputFormat();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decoded audio format: ");
            sbLIZ.append(outputFormat);
            AnimaXLog.LIZIZ("AudioAssetDecoder", C2188811AlT.LIZIZ(sbLIZ));
            if (outputFormat.containsKey("pcm-encoding")) {
                this.LIZ.LJ = outputFormat.getInteger("pcm-encoding");
            }
        }
        if ((this.LJFF.flags & 4) != 0) {
            this.LIZJ = true;
        }
        return outputBuffer;
    }

    public C1285030jXp(C1285570jYh c1285570jYh) {
        String string;
        this.LIZ = c1285570jYh;
        MediaFormat mediaFormat = c1285570jYh.LIZ;
        if (mediaFormat == null || (string = mediaFormat.getString("mime")) == null) {
            return;
        }
        try {
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
            this.LIZIZ = mediaCodecCreateDecoderByType;
            mediaCodecCreateDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to init audio asset decoder: ");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("AudioAssetDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
