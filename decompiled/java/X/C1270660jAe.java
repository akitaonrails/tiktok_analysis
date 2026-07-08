package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;

/* JADX INFO: renamed from: X.0jAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270660jAe implements InterfaceC1283630jVZ {
    public final /* synthetic */ C2185991Agv LL;
    public final /* synthetic */ ARunnableS120S0100000_20 LLILLJJLI;

    @Override // X.InterfaceC1283630jVZ
    public final void LJLJJL(TEFrameSizei tEFrameSizei) {
    }

    @Override // X.InterfaceC1283630jVZ, X.C1DJX
    public final void LIZIZ(TECameraFrame tECameraFrame) {
        C1270610jAZ c1270610jAZ = (C1270610jAZ) this.LLILLJJLI.l0;
        if (!c1270610jAZ.p) {
            c1270610jAZ.p = true;
            C1283100jUi.LIZIZ(c1270610jAZ.LLJL, new ARunnableS120S0100000_20(this, 420));
        }
        C1270610jAZ c1270610jAZ2 = (C1270610jAZ) this.LLILLJJLI.l0;
        int i = c1270610jAZ2.q + 1;
        c1270610jAZ2.q = i;
        if (i == 1) {
            c1270610jAZ2.LLLZIL = 7;
        } else if (i == 2) {
            c1270610jAZ2.LLLZIL = 1;
        }
        c1270610jAZ2.LIZIZ(tECameraFrame);
    }

    @Override // X.C1DJX
    public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
        ((C1270610jAZ) this.LLILLJJLI.l0).getClass();
    }

    public C1270660jAe(ARunnableS120S0100000_20 aRunnableS120S0100000_20, C2185991Agv c2185991Agv) {
        this.LLILLJJLI = aRunnableS120S0100000_20;
        this.LL = c2185991Agv;
    }
}
