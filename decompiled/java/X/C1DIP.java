package X;

import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import java.util.List;
import kotlin.jvm.internal.AwS0S0221001_35;

/* JADX INFO: renamed from: X.1DIP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DIP implements InterfaceC1780750wRN {
    public final /* synthetic */ VECameraController LIZ;

    @Override // X.InterfaceC1780750wRN
    public final void LJII() {
        this.LIZ.getClass();
    }

    public C1DIP(VECameraController vECameraController) {
        this.LIZ = vECameraController;
    }

    @Override // X.InterfaceC1780750wRN
    public final void LIZLLL(float f, int i, boolean z) {
        boolean z2;
        if (this.LIZ.LLILZLL.invoke().booleanValue()) {
            return;
        }
        VECameraController vECameraController = this.LIZ;
        if (f > 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        vECameraController.LLLFFI = z2;
        C0CNO.LIZLLL(0L, new C1780690wRH(vECameraController, f, i, z));
    }

    @Override // X.InterfaceC1780750wRN
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        if (!this.LIZ.LLILZLL.invoke().booleanValue()) {
            C0CNO.LIZLLL(0L, new AwS0S0221001_35(this.LIZ, (VECameraController) f, (float) list, (List<Integer>) i, (int) z, z2, false));
        }
    }
}
