package X;

import com.ss.android.ttve.nativePort.TEAudioAEDInterface;
import com.ss.android.vesdk.VEAudioRecorder;

/* JADX INFO: renamed from: X.1Brf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2218131Brf implements InterfaceC2218151Brh {
    public final /* synthetic */ VEAudioRecorder LIZ;

    public C2218131Brf(VEAudioRecorder vEAudioRecorder) {
        this.LIZ = vEAudioRecorder;
    }

    @Override // X.InterfaceC2218151Brh
    public final void LIZ(int i, byte[] bArr) {
        TEAudioAEDInterface tEAudioAEDInterface = this.LIZ.mVoiceDetect;
        if (tEAudioAEDInterface != null && i > 0) {
            tEAudioAEDInterface.process(bArr, i);
        }
        InterfaceC2218151Brh interfaceC2218151Brh = this.LIZ.mExternalListener;
        if (interfaceC2218151Brh != null) {
            interfaceC2218151Brh.LIZ(i, bArr);
        }
    }

    @Override // X.InterfaceC2218151Brh
    public final void onError(int i, int i2, String str) {
        InterfaceC2218151Brh interfaceC2218151Brh = this.LIZ.mExternalListener;
        if (interfaceC2218151Brh != null) {
            interfaceC2218151Brh.onError(i, i2, str);
        }
    }

    @Override // X.InterfaceC2218151Brh
    public final void onInfo(int i, int i2, double d, Object obj) {
        InterfaceC2218151Brh interfaceC2218151Brh = this.LIZ.mExternalListener;
        if (interfaceC2218151Brh != null) {
            interfaceC2218151Brh.onInfo(i, i2, d, obj);
        }
    }
}
