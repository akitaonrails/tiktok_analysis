package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.1Brj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218171Brj implements InterfaceC2218081Bra {
    public boolean LIZ;
    public SVCTask LIZIZ;
    public int LIZJ;
    public final /* synthetic */ C1660940tK8 LIZLLL;

    public C2218171Brj(C1660940tK8 c1660940tK8) {
        this.LIZLLL = c1660940tK8;
    }

    @Override // X.InterfaceC2218081Bra
    public final void onReceive(VEAudioSample vEAudioSample) {
        byte[] bArr;
        SVCTask sVCTask;
        StringBuilder sb;
        int iLIZJ;
        C19974213Dg c19974213Dg;
        if (vEAudioSample == null) {
            return;
        }
        if (vEAudioSample.getSampleBuffer() instanceof C2218091Brb) {
            bArr = ((C2218091Brb) vEAudioSample.getSampleBuffer()).LIZ;
            if (bArr == null) {
                return;
            }
        } else {
            if (!(vEAudioSample.getSampleBuffer() instanceof C2218101Brc)) {
                return;
            }
            ByteBuffer byteBuffer = ((C2218101Brc) vEAudioSample.getSampleBuffer()).LIZ;
            byteBuffer.limit();
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.get(bArr);
            byteBuffer.clear();
        }
        int i = this.LIZJ;
        this.LIZJ = i + 1;
        if (i % 60 == 0) {
            vEAudioSample.getByteSize();
            if (vEAudioSample.getSampleBuffer() instanceof C2218091Brb) {
                sb = new StringBuilder("(ByteArray): ");
                C13E7 c13e7 = new C13E7(bArr);
                if (c13e7.LIZJ() > 6) {
                    c19974213Dg = new C19974213Dg(c13e7, 0, 6);
                } else {
                    c19974213Dg = new C19974213Dg(c13e7, 0, c13e7.LIZJ() - 1);
                }
            } else if (vEAudioSample.getSampleBuffer() instanceof C2218101Brc) {
                sb = new StringBuilder("(ByteBuffer): ");
                C13E7 c13e72 = new C13E7(bArr);
                if (c13e72.LIZJ() > 6) {
                    c19974213Dg = new C19974213Dg(c13e72, 0, 6);
                } else {
                    if (c13e72.LIZJ() > 0) {
                        iLIZJ = c13e72.LIZJ() - 1;
                    } else {
                        iLIZJ = 0;
                    }
                    c19974213Dg = new C19974213Dg(c13e72, 0, iLIZJ);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VEAudioSample = ");
                sbLIZ.append(vEAudioSample);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            sb.append(c19974213Dg);
        }
        if (this.LIZ && C123100dR.LIZ(C1664460tPo.LJIIIIZZ(this.LIZLLL.Cp().RT1())) && (sVCTask = this.LIZIZ) != null) {
            sVCTask.LJFF(3, bArr);
        }
    }

    @Override // X.InterfaceC2218071BrZ
    public final void onError(int i, int i2, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(3, "calling_event_index");
        c0lab.LJ("error_code", String.valueOf(i2 + 2000));
        c0lab.LJ("error_msg", "mic_failed");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errType=");
        sbLIZ.append(i);
        sbLIZ.append(", ret=");
        sbLIZ.append(i2);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        c0lab.LJ("net_error_msg", C2188811AlT.LIZIZ(sbLIZ));
        c0lab.LJ("debug_vc_scene", "shoot_vc");
        C20684815ws.LJIILLIIL("audio_vc_stream_event", c0lab.LIZ);
    }

    @Override // X.InterfaceC2218071BrZ
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shoot:  onInfo() : onInitMicSuccess(), sampleRate: ");
            sbLIZ.append(((VEAudioCaptureSettings) obj).getSampleRate());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START) {
            this.LIZ = true;
        } else {
            if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                return;
            }
            this.LIZ = false;
        }
    }
}
