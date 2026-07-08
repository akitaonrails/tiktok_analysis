package X;

import Y.ACallableS257S0200000_34;
import android.os.ConditionVariable;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.audio.TEDubWriter;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.1Bre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218121Bre implements InterfaceC2218081Bra {
    public InterfaceC2218141Brg LIZ;
    public VEAudioCapture LIZIZ;
    public final ConditionVariable LIZJ = new ConditionVariable();
    public C2218131Brf LIZLLL = null;
    public int LJ = 44100;
    public Cert LJFF;
    public String LJI;
    public double LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public final synchronized void LIZ() {
        if (this.LIZIZ != null) {
            return;
        }
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
        builder.setSampleRate(44100);
        builder.setChannel(2);
        builder.setAudioCaptureLowLatency(false);
        VEAudioCaptureSettings vEAudioCaptureSettingsBuild = builder.build();
        VEAudioCapture vEAudioCapture = new VEAudioCapture();
        this.LIZIZ = vEAudioCapture;
        vEAudioCapture.addCaptureListener(this);
        int iLIZIZ = LIZIZ(new ACallableS257S0200000_34(this, vEAudioCaptureSettingsBuild, 6), "init()");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call init, sourceId:");
        sbLIZ.append(1);
        sbLIZ.append(" retValue:");
        sbLIZ.append(iLIZIZ);
        C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C2218121Bre(TEDubWriter tEDubWriter) {
        this.LIZ = tEDubWriter;
    }

    public final synchronized void LIZJ(Cert cert) {
        if (this.LIZIZ != null) {
            LIZIZ(new ACallableS257S0200000_34(this, cert, 5), "stopRecording");
            this.LIZIZ = null;
        }
        InterfaceC2218141Brg interfaceC2218141Brg = this.LIZ;
        if (interfaceC2218141Brg != null) {
            interfaceC2218141Brg.destroy();
        }
        C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "call unInit() finished!");
    }

    @Override // X.InterfaceC2218081Bra
    public final void onReceive(VEAudioSample vEAudioSample) {
        byte[] bArrArray;
        if (this.LIZ != null) {
            if (vEAudioSample.getSampleBuffer() instanceof C2218101Brc) {
                bArrArray = ((C2218101Brc) vEAudioSample.getSampleBuffer()).LIZ.array();
            } else {
                if (vEAudioSample.getSampleBuffer() instanceof C2218091Brb) {
                    bArrArray = ((C2218091Brb) vEAudioSample.getSampleBuffer()).LIZ;
                }
                C2484209oO.LIZJ("TEBufferedAudioCaptureRecorder", "sample buffer is empty!");
            }
            if (bArrArray != null) {
                this.LIZ.LIZJ(vEAudioSample.getByteSize(), bArrArray);
                C2218131Brf c2218131Brf = this.LIZLLL;
                if (c2218131Brf != null) {
                    c2218131Brf.LIZ(vEAudioSample.getByteSize(), bArrArray);
                    return;
                }
                return;
            }
            C2484209oO.LIZJ("TEBufferedAudioCaptureRecorder", "sample buffer is empty!");
        }
    }

    public final int LIZIZ(Callable callable, String str) {
        this.LIZJ.close();
        try {
            int iIntValue = ((Integer) callable.call()).intValue();
            if (iIntValue == 0) {
                if (!this.LIZJ.block(2000)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" timeout ! timeoutMs:");
                    sbLIZ.append(2000);
                    C2484209oO.LIZJ("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ));
                    return -1;
                }
                return 0;
            }
            return iIntValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // X.InterfaceC2218071BrZ
    public final void onError(int i, int i2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorType:");
        sbLIZ.append(i);
        sbLIZ.append(" ret:");
        sbLIZ.append(i2);
        sbLIZ.append(" msg:");
        sbLIZ.append(str);
        C2484209oO.LIZJ("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ));
        C2218131Brf c2218131Brf = this.LIZLLL;
        if (c2218131Brf != null) {
            c2218131Brf.onError(i, i2, str);
        }
        this.LIZJ.open();
    }

    @Override // X.InterfaceC2218071BrZ
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_INIT");
            if (obj != null) {
                this.LJ = ((VEAudioCaptureSettings) obj).getSampleRate();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("oninfo TE_INFO_RECORD_AUDIO_CAPTURE_INIT samplerate:");
                sbLIZ.append(this.LJ);
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_START");
            if (this.LIZ == null && VEConfigCenter.getInstance().getValue("ve_enable_aaudio_mic_record", false).booleanValue()) {
                this.LIZ = this.LIZIZ.createAudioWriter();
            }
            InterfaceC2218141Brg interfaceC2218141Brg = this.LIZ;
            if (interfaceC2218141Brg != null) {
                String str = this.LJI;
                int iLIZ = interfaceC2218141Brg.LIZ(this.LJ, str, this.LJIIIIZZ, this.LJII, this.LJIIIZ);
                if (iLIZ != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("init wav file failed, ret = ");
                    sbLIZ2.append(iLIZ);
                    C2484209oO.LIZJ("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C2218131Brf c2218131Brf = this.LIZLLL;
                if (c2218131Brf != null) {
                    c2218131Brf.onInfo(i, this.LJ, 2.0d, obj);
                }
            } else {
                C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_START, audioWritter is null !");
            }
        } else if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
            C2484209oO.LJI("TEBufferedAudioCaptureRecorder", "oninfo TE_INFO_RECORD_AUDIO_CAPTURE_STOP");
            InterfaceC2218141Brg interfaceC2218141Brg2 = this.LIZ;
            if (interfaceC2218141Brg2 != null) {
                interfaceC2218141Brg2.LIZIZ();
                C2218131Brf c2218131Brf2 = this.LIZLLL;
                if (c2218131Brf2 != null) {
                    c2218131Brf2.onInfo(i, i2, 0.0d, obj);
                }
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("oninfo other type : ");
            sbLIZ3.append(i);
            C2484209oO.LJI("TEBufferedAudioCaptureRecorder", C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LIZJ.open();
    }
}
