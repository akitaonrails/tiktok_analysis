package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1284860jXY implements InterfaceC1472350oPx {
    public volatile BPEAHandler LIZ;

    @Override // X.InterfaceC1472350oPx
    public final void LIZLLL() {
        Looper looperMyLooper;
        if (this.LIZ != null || Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()) || (looperMyLooper = Looper.myLooper()) == null) {
            return;
        }
        this.LIZ = new BPEAHandler(looperMyLooper);
    }

    @Override // X.InterfaceC1472350oPx
    public final boolean LIZ(SurfaceView surfaceView) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (((Boolean) C1474810oTv.f210t5.getValue()).booleanValue() && surfaceView != null && (layoutParams = surfaceView.getLayoutParams()) != null && layoutParams.width < 0 && surfaceView != null && (layoutParams2 = surfaceView.getLayoutParams()) != null && layoutParams2.height < 0) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("BaseSurfaceControlSession", "surface view size not set. ignore setParentSurfaceControl. sometimes it happens when video enters landscape screen");
            }
            return false;
        }
        return true;
    }

    public final void LJ(ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && this.LIZ != null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("BaseSurfaceControlSession", "setParentSurfaceControl on mainThread, will post");
            }
            BPEAHandler bPEAHandler = this.LIZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS120S0100000_20);
                return;
            }
            return;
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("BaseSurfaceControlSession", "setParentSurfaceControl on playerThread");
        }
        aRunnableS120S0100000_20.run();
    }
}
