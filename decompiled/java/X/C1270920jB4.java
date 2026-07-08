package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270920jB4 extends AbstractC1270770jAp {
    public final TECameraCapture LIZLLL;
    public final Handler LJ;
    public final CountDownLatch LJFF;
    public final JSONObject LJI;

    @Override // X.AbstractC1270770jAp
    public final boolean LIZ(C1270930jB5 c1270930jB5) {
        return true;
    }

    @Override // X.AbstractC1270770jAp
    public final void LIZLLL() {
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS120S0100000_20(this, 195));
    }

    @Override // X.AbstractC1270770jAp
    public final JSONObject LIZIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC1270770jAp
    public final void LIZJ(C1270930jB5 c1270930jB5) {
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS89S0200000_20(c1270930jB5, this, 126));
    }

    public C1270920jB4(TECameraCapture tECameraCapture, Handler handler, InterfaceC1270980jBA interfaceC1270980jBA) {
        super(2, "LiveOneKeyProcess", interfaceC1270980jBA);
        this.LIZLLL = tECameraCapture;
        this.LJ = handler;
        this.LJFF = new CountDownLatch(2);
        this.LJI = new JSONObject();
    }
}
