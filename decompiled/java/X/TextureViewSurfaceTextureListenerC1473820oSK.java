package X;

import Y.ARunnableS123S0100000_23;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oSK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class TextureViewSurfaceTextureListenerC1473820oSK implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C1473810oSJ LL;

    public TextureViewSurfaceTextureListenerC1473820oSK(C1473810oSJ c1473810oSJ) {
        this.LL = c1473810oSJ;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean zLIZIZ;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSurfaceTextureDestroyed keepSurfaceTexture:");
            sbLIZ.append(this.LL.LL);
            sbLIZ.append(", surface ");
            sbLIZ.append(this.LL.LLILLJJLI);
            sbLIZ.append("this:");
            sbLIZ.append(this.LL);
            C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLJIJIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        C1473810oSJ c1473810oSJ = this.LL;
        c1473810oSJ.LLJI = false;
        if (c1473810oSJ.LLJ) {
            return false;
        }
        if (C1474810oTv.LJLJJL()) {
            if (!this.LL.LLILLL) {
                boolean z = C1473840oSM.LIZ;
                C1473810oSJ c1473810oSJ2 = this.LL;
                zLIZIZ = C1473840oSM.LIZIZ(surfaceTexture, c1473810oSJ2.LLILZ, c1473810oSJ2.LLILZIL);
            } else {
                zLIZIZ = false;
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onSurfaceTextureDestroyed keepSurfaceTexture:");
                sbLIZ2.append(this.LL.LL);
                sbLIZ2.append(", store:");
                sbLIZ2.append(zLIZIZ);
                sbLIZ2.append(this.LL.getViewInfo());
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LL.LIZIZ(false);
            C1473810oSJ c1473810oSJ3 = this.LL;
            c1473810oSJ3.LL = null;
            c1473810oSJ3.LLILLL = false;
            return !zLIZIZ;
        }
        if (this.LL.LLILLL) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onSurfaceTextureDestroyed keepSurfaceTexture:");
                sbLIZ3.append(this.LL.LL);
                sbLIZ3.append(", needReCreateSurface.");
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.LL.LIZIZ(false);
            C1473810oSJ c1473810oSJ4 = this.LL;
            c1473810oSJ4.LL = null;
            c1473810oSJ4.LLILLL = false;
            return true;
        }
        HandlerHook.viewPost(this.LL, new ARunnableS123S0100000_23(this, 225));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        SurfaceWrapper surfaceWrapper;
        WeakReference<InterfaceC1473850oSN> weakReference;
        InterfaceC1473850oSN interfaceC1473850oSN;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLJIJIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification() && (surfaceWrapper = this.LL.LLILLJJLI) != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
            interfaceC1473850oSN.LIZIZ();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        WeakReference<InterfaceC1473850oSN> weakReference;
        InterfaceC1473850oSN interfaceC1473850oSN;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSurfaceTextureAvailable surfaceTexture :");
            sbLIZ.append(surfaceTexture);
            sbLIZ.append(this.LL.getViewInfo());
            C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1473810oSJ c1473810oSJ = this.LL;
        if (c1473810oSJ.LLILLJJLI == null) {
            c1473810oSJ.LLILLJJLI = new SurfaceWrapper(surfaceTexture, this.LL);
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onSurfaceTextureAvailable new Surface :");
                sbLIZ2.append(this.LL.LLILLJJLI);
                sbLIZ2.append(this.LL.getViewInfo());
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1473810oSJ c1473810oSJ2 = this.LL;
        c1473810oSJ2.LLJI = true;
        c1473810oSJ2.LL = surfaceTexture;
        TextureView.SurfaceTextureListener surfaceTextureListener = c1473810oSJ2.LLJIJIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        this.LL.LLJ = false;
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (c1480850odf != null && c1480850odf.isEnableSurfaceLifeCycleNotification()) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("KeepSurfaceTextureView onSurfaceAvailable sf: ");
                sbLIZ3.append(this.LL.LLILLJJLI);
                C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ3));
            }
            SurfaceWrapper surfaceWrapper = this.LL.LLILLJJLI;
            if (surfaceWrapper != null && (weakReference = surfaceWrapper.mListener) != null && (interfaceC1473850oSN = weakReference.get()) != null) {
                interfaceC1473850oSN.LIZ();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.LL.LLJIJIL;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
