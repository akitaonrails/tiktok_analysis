package X;

import android.content.Intent;
import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.os.Build;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0jA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1270270jA1 extends C1270170j9r {
    public AudioRecord LLJJJJLIIL;
    public RunnableC1273020jES LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;

    @Override // X.C1270170j9r, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", "release()", null);
        AudioRecord audioRecord = this.LLJJJJLIIL;
        this.LLJJJJLIIL = null;
        if (audioRecord != null) {
            try {
                C1300970jxX.LIZIZ(audioRecord, C1270290jA3.LIZIZ().LIZ(EnumC1270240j9y.AUDIO_STOP).LIZ);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioRecord.release failed(ScreenVideoCaptureWithInnerRecord.release): ");
                sbLIZ.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        this.LLJJL = null;
        super.release();
    }

    @Override // X.C1270170j9r, X.AbstractC1268600j7K
    public final void stop() {
        AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", "stop()", null);
        AudioRecord audioRecord = this.LLJJJJLIIL;
        if (audioRecord != null) {
            try {
                C1300970jxX.LIZLLL(audioRecord, C1270290jA3.LIZIZ().LIZ(EnumC1270240j9y.AUDIO_STOP).LIZ);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioRecord.stop failed(ScreenVideoCaptureWithInnerRecord.stop): ");
                sbLIZ.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ), e);
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1274080jGA.LIZ.LIZ("ScreenVideoCaptureWithInnerRecord.stop#AudioRecord.stop", e2);
            }
        }
        RunnableC1273020jES runnableC1273020jES = this.LLJJL;
        if (runnableC1273020jES != null) {
            C1273730jFb.LIZLLL(runnableC1273020jES.LLILLJJLI);
            AVLog.d("AudioRecordThread", "stop");
            runnableC1273020jES.LLILLL = false;
            Deque<ByteBuffer> deque = runnableC1273020jES.LLJ;
            if (deque != null) {
                ((LinkedList) deque).clear();
                runnableC1273020jES.LLJ = null;
            }
        }
        super.stop();
    }

    public final void LLJJ(Cert cert) {
        int i;
        int i2;
        if (this.LLJILJILJ != null && this.LLJJJJLIIL == null && this.LLJJL == null) {
            if (this.LLJLILLLLZIIL) {
                i = 12;
            } else {
                i = 16;
            }
            if (this.LLJLLIL) {
                i2 = this.LLJLL;
            } else {
                i2 = 44100;
            }
            int minBufferSize = AudioRecord.getMinBufferSize(i2, i, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioRecord.getMinBufferSize: ");
                sbLIZ.append(minBufferSize);
                AVLog.d("ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ));
                AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(this.LLJILJILJ);
                builder.addMatchingUsage(14);
                builder.addMatchingUsage(1);
                this.LLJJJJLIIL = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i2).setChannelMask(i).build()).setBufferSizeInBytes(minBufferSize).setAudioPlaybackCaptureConfig(builder.build()).build();
                if (cert == null) {
                    try {
                        cert = C1270290jA3.LIZIZ().LIZ(EnumC1270240j9y.AUDIO_START).LIZ;
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AudioRecord.startRecording failed(ScreenVideoCaptureWithInnerRecord.startAudioPlayBack): ");
                        sbLIZ2.append(e.getMessage());
                        AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ2), e);
                    }
                }
                C1300970jxX.LIZJ(this.LLJJJJLIIL, cert);
                RunnableC1273020jES runnableC1273020jES = new RunnableC1273020jES(this.LLJJJJLIIL);
                this.LLJJL = runnableC1273020jES;
                runnableC1273020jES.LLILLJJLI.post(runnableC1273020jES);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AudioRecord.getMinBufferSize failed: ");
            sbLIZ3.append(minBufferSize);
            AVLog.logKibana(6, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ3), null);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AudioRecord.getMinBufferSize failed: ");
            sbLIZ4.append(minBufferSize);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public C1270270jA1(Intent intent, InterfaceC1270200j9u interfaceC1270200j9u) {
        super(intent, interfaceC1270200j9u);
        this.LLJJLIIIJLLLLLLLZ = 10;
        this.LLJLIL = -207;
    }

    public final void LLJILLL(InterfaceC1272460jDY interfaceC1272460jDY, Cert cert) {
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAudioPlayBackObserver: ");
            if (interfaceC1272460jDY == null) {
                i = 0;
            } else {
                i = 1;
            }
            sbLIZ.append(i);
            AVLog.logKibana(4, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ), null);
            if (interfaceC1272460jDY != null) {
                try {
                    LLJJ(cert);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = this.LLJL;
                    this.LLJL = i2 + 1;
                    if (i2 < this.LLJJLIIIJLLLLLLLZ) {
                        LLJILLL(interfaceC1272460jDY, cert);
                        AVLog.logKibana(5, "ScreenVideoCaptureWithInnerRecord", "try restart audioRecord", e);
                        return;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ScreenVideoCaptureWithInnerRecordError,code:");
                        sbLIZ2.append(this.LLJLIL);
                        AVLog.logKibana(5, "ScreenVideoCaptureWithInnerRecord", C2188811AlT.LIZIZ(sbLIZ2), e);
                        return;
                    }
                }
            }
            RunnableC1273020jES runnableC1273020jES = this.LLJJL;
            if (runnableC1273020jES != null) {
                runnableC1273020jES.LLJI = interfaceC1272460jDY;
            }
        }
    }
}
