package X;

import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.audio.VEAudioSample;

/* JADX INFO: renamed from: X.1BrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218031BrV implements InterfaceC2217931BrL {
    public final /* synthetic */ VEAudioCapture LIZ;

    public C2218031BrV(VEAudioCapture vEAudioCapture) {
        this.LIZ = vEAudioCapture;
    }

    @Override // X.InterfaceC2217931BrL
    public final void onReceive(VEAudioSample vEAudioSample) {
        for (InterfaceC2218071BrZ interfaceC2218071BrZ : this.LIZ.mCaptureListeners.LIZJ()) {
            if (interfaceC2218071BrZ == null) {
                C2484209oO.LIZJ("VEAudioCapture", "onReceive error listener is null");
            } else if (interfaceC2218071BrZ instanceof InterfaceC2218081Bra) {
                ((InterfaceC2218081Bra) interfaceC2218071BrZ).onReceive(vEAudioSample);
            }
        }
    }

    @Override // X.InterfaceC2217931BrL
    public final void LIZ(int i, int i2, Object obj) {
        for (InterfaceC2218071BrZ interfaceC2218071BrZ : this.LIZ.mCaptureListeners.LIZJ()) {
            if (interfaceC2218071BrZ == null) {
                C2484209oO.LIZJ("VEAudioCapture", "onInfo error listener is null");
            } else {
                interfaceC2218071BrZ.onInfo(i, i2, 0.0d, obj);
            }
        }
    }

    @Override // X.InterfaceC2217931BrL
    public final void onError(int i, int i2, String str) {
        for (InterfaceC2218071BrZ interfaceC2218071BrZ : this.LIZ.mCaptureListeners.LIZJ()) {
            if (interfaceC2218071BrZ == null) {
                C2484209oO.LIZJ("VEAudioCapture", "onError error listener is null");
            } else {
                interfaceC2218071BrZ.onError(i, i2, str);
            }
        }
    }
}
