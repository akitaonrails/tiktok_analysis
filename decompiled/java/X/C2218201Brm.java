package X;

import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.1Brm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218201Brm implements InterfaceC2218081Bra {
    @Override // X.InterfaceC2218071BrZ
    public final void onError(int i, int i2, String str) {
    }

    @Override // X.InterfaceC2218081Bra
    public final void onReceive(VEAudioSample vEAudioSample) {
        if (vEAudioSample == null) {
            return;
        }
        C2218111Brd sampleBuffer = vEAudioSample.getSampleBuffer();
        if (!(sampleBuffer instanceof C2218091Brb)) {
            if (sampleBuffer instanceof C2218101Brc) {
                ByteBuffer byteBuffer = ((C2218101Brc) vEAudioSample.getSampleBuffer()).LIZ;
                byteBuffer.limit();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.get(bArr);
                byteBuffer.clear();
            }
        }
        throw null;
    }

    @Override // X.InterfaceC2218071BrZ
    public final void onInfo(int i, int i2, double d, Object obj) {
        if (i != VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START || i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP) {
                throw null;
            }
        }
    }
}
