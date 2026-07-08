package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jB3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270910jB3 extends AbstractC1270770jAp {
    public final TECameraCapture LIZLLL;
    public final Handler LJ;

    @Override // X.AbstractC1270770jAp
    public final JSONObject LIZIZ() {
        return null;
    }

    @Override // X.AbstractC1270770jAp
    public final void LIZLLL() {
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS120S0100000_20(this, 196));
    }

    @Override // X.AbstractC1270770jAp
    public final boolean LIZ(C1270930jB5 c1270930jB5) {
        return c1270930jB5 instanceof C1270960jB8;
    }

    @Override // X.AbstractC1270770jAp
    public final void LIZJ(C1270930jB5 c1270930jB5) {
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS89S0200000_20(c1270930jB5, this, 127));
    }

    public C1270910jB3(TECameraCapture tECameraCapture, Handler handler, InterfaceC1270980jBA interfaceC1270980jBA) {
        super(1, "LiveRhythmicMotion", interfaceC1270980jBA);
        this.LIZLLL = tECameraCapture;
        this.LJ = handler;
    }
}
