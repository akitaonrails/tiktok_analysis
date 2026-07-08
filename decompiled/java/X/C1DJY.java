package X;

import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttvecamera.b0;
import com.ss.android.vesdk.k;

/* JADX INFO: renamed from: X.1DJY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DJY implements InterfaceC2253721DJa {
    public final /* synthetic */ b0 LIZ;

    public C1DJY(b0 b0Var) {
        this.LIZ = b0Var;
    }

    public final void LIZ(boolean z) {
        InterfaceC2254611DMl interfaceC2254611DMl;
        C1DJB c1djb = this.LIZ.mCameraCaptureUpdateCallback;
        if (c1djb != null && (interfaceC2254611DMl = ((C1DJA) c1djb).LIZ.LLJ) != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[LowLightEnhance], camera capture session is updated, enable LLE : ");
            sbLIZ.append(z);
            C2183341Ace.LIZLLL("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
            k kVar = ((C1DJZ) interfaceC2254611DMl).LIZ.LIZIZ;
            kVar.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setBool("enable", z);
            kVar.LJJJ.LJIL("UseEnhancementAlgorithm", tEBundleObtain);
        }
    }
}
