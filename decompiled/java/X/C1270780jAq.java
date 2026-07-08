package X;

import android.os.Handler;
import com.ss.android.ttvecamera.TECameraCapture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270780jAq implements InterfaceC1270980jBA {
    public final TECameraCapture LIZ;
    public final Handler LIZIZ;
    public final List<AbstractC1270770jAp> LIZJ = new ArrayList();
    public int LIZLLL;

    @Override // X.InterfaceC1270980jBA
    public final void LIZ(int i) {
        this.LIZLLL = (~i) & this.LIZLLL;
    }

    @Override // X.InterfaceC1270980jBA
    public final void LIZIZ(int i) {
        this.LIZLLL = i | this.LIZLLL;
    }

    public C1270780jAq(TECameraCapture tECameraCapture, Handler handler) {
        this.LIZ = tECameraCapture;
        this.LIZIZ = handler;
    }
}
