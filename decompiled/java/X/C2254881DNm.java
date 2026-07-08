package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254881DNm implements InterfaceC2254971DNv<C1DL5>, C1DL5 {
    public final InterfaceC2238351CjB LIZ;
    public SurfaceView LIZIZ;
    public boolean LIZJ;
    public final HashMap<C1DLI, SurfaceHolder.Callback> LIZLLL = new HashMap<>();

    @Override // X.InterfaceC2254971DNv
    public final void onDestroy() {
    }

    @Override // X.C1DL5
    public final View getPreviewView() {
        SurfaceView surfaceView = this.LIZIZ;
        if (surfaceView == null) {
            return null;
        }
        return surfaceView;
    }

    @Override // X.C1DL5
    public final Surface getSurface() {
        SurfaceView surfaceView = this.LIZIZ;
        if (surfaceView == null) {
            surfaceView = null;
        }
        return surfaceView.getHolder().getSurface();
    }

    @Override // X.InterfaceC2254971DNv
    public final void init() {
        this.LIZIZ = new SurfaceView(this.LIZ.getActivity());
        C1DLB ckCameraViewLikeFunction = this.LIZ.LIZ().getCkCameraViewLikeFunction();
        SurfaceView surfaceView = this.LIZIZ;
        if (surfaceView == null) {
            surfaceView = null;
        }
        ckCameraViewLikeFunction.LIZLLL(surfaceView, new FrameLayout.LayoutParams(-1, -1), C2255001DNy.LIZ);
    }

    @Override // X.C1DL5
    public final boolean jk() {
        return this.LIZJ;
    }

    public C2254881DNm(InterfaceC2238351CjB interfaceC2238351CjB) {
        this.LIZ = interfaceC2238351CjB;
    }

    @Override // X.C1DL5
    public final void LIZ(C1DI1 c1di1) {
        SurfaceHolderCallbackC2254161DKs surfaceHolderCallbackC2254161DKs = new SurfaceHolderCallbackC2254161DKs(c1di1, new AwS579S0100000_35(this, 427), AFwS226S0000000_35.get$arr$(836), new AwS579S0100000_35(this, 428));
        synchronized (this.LIZLLL) {
            try {
                this.LIZLLL.put(c1di1, surfaceHolderCallbackC2254161DKs);
                SurfaceView surfaceView = this.LIZIZ;
                if (surfaceView == null) {
                    surfaceView = null;
                }
                surfaceView.getHolder().addCallback(surfaceHolderCallbackC2254161DKs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
