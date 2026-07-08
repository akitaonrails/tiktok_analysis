package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254891DNn implements InterfaceC2254971DNv<C1DL5>, C1DL5 {
    public final SurfaceView LIZ;
    public boolean LIZIZ;
    public final HashMap<C1DLI, SurfaceHolder.Callback> LIZJ = new HashMap<>();

    @Override // X.InterfaceC2254971DNv
    public final void init() {
    }

    @Override // X.InterfaceC2254971DNv
    public final void onDestroy() {
    }

    @Override // X.C1DL5
    public final Surface getSurface() {
        return this.LIZ.getHolder().getSurface();
    }

    @Override // X.C1DL5
    public final View getPreviewView() {
        return this.LIZ;
    }

    @Override // X.C1DL5
    public final boolean jk() {
        return this.LIZIZ;
    }

    public C2254891DNn(SurfaceView surfaceView) {
        this.LIZ = surfaceView;
    }

    @Override // X.C1DL5
    public final void LIZ(C1DI1 c1di1) {
        SurfaceHolderCallbackC2254161DKs surfaceHolderCallbackC2254161DKs = new SurfaceHolderCallbackC2254161DKs(c1di1, new AwS579S0100000_35(this, 425), AFwS226S0000000_35.get$arr$(836), new AwS579S0100000_35(this, 426));
        synchronized (this.LIZJ) {
            try {
                this.LIZJ.put(c1di1, surfaceHolderCallbackC2254161DKs);
                this.LIZ.getHolder().addCallback(surfaceHolderCallbackC2254161DKs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
