package X;

import Y.ARunnableS133S0100000_33;
import android.hardware.Camera;

/* JADX INFO: renamed from: X.1AiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2186851AiJ implements Camera.AutoFocusCallback {
    public final /* synthetic */ C2186801AiE LIZ;

    public C2186851AiJ(C2186801AiE c2186801AiE) {
        this.LIZ = c2186801AiE;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        C786410Ut5.LJJZZIII(this.LIZ.LJ, new ARunnableS133S0100000_33(this, 86));
    }
}
