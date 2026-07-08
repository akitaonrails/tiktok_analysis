package X;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270280jA2 {
    public AudioRecord LIZ;
    public RunnableC1273020jES LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public MediaProjection LJFF;
    public final Handler LJI;
    public boolean LJII;

    public C1270280jA2(C1267500j5Y c1267500j5Y) {
        Handler handlerLIZLLL;
        this.LIZJ = c1267500j5Y.LIZ.mPushBase.LIZLLL();
        this.LJ = c1267500j5Y.LIZ.mPushBase.LJIJ();
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZLLL = c1268700j7U.LIZLLL();
        } else {
            handlerLIZLLL = null;
        }
        this.LJI = handlerLIZLLL;
    }

    public final void LIZ(Cert cert) {
        int i;
        if (this.LJFF != null && this.LIZ == null && this.LIZIZ == null) {
            if (this.LJ) {
                i = 12;
            } else {
                i = 16;
            }
            int minBufferSize = AudioRecord.getMinBufferSize(this.LIZJ, i, 2);
            if (minBufferSize != -2 && minBufferSize != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioRecord.getMinBufferSize: ");
                sbLIZ.append(minBufferSize);
                AVLog.d("ScreenAudioNode", C2188811AlT.LIZIZ(sbLIZ));
                AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(this.LJFF);
                builder.addMatchingUsage(14);
                builder.addMatchingUsage(1);
                this.LIZ = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(this.LIZJ).setChannelMask(i).build()).setBufferSizeInBytes(minBufferSize).setAudioPlaybackCaptureConfig(builder.build()).build();
                if (cert == null) {
                    try {
                        cert = C1270290jA3.LIZJ.getValue().LIZ(EnumC1270240j9y.AUDIO_START).LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("startRecording with default cert:");
                        sbLIZ2.append(cert);
                        AVLog.logKibana(4, "ScreenAudioNode", C2188811AlT.LIZIZ(sbLIZ2), null);
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("AudioRecord.startRecording failed(startAudioPlayBack): ");
                        sbLIZ3.append(e.getMessage());
                        AVLog.logKibana(6, "ScreenAudioNode", C2188811AlT.LIZIZ(sbLIZ3), e);
                    }
                }
                AudioRecord audioRecord = this.LIZ;
                if (audioRecord != null) {
                    C1300970jxX.LIZJ(audioRecord, cert);
                }
                RunnableC1273020jES runnableC1273020jES = new RunnableC1273020jES(this.LIZ);
                this.LIZIZ = runnableC1273020jES;
                runnableC1273020jES.LLILLJJLI.post(runnableC1273020jES);
                this.LJII = false;
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AudioRecord.getMinBufferSize failed: ");
            sbLIZ4.append(minBufferSize);
            AVLog.logKibana(6, "ScreenAudioNode", C2188811AlT.LIZIZ(sbLIZ4), null);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("AudioRecord.getMinBufferSize failed: ");
            sbLIZ5.append(minBufferSize);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }
}
