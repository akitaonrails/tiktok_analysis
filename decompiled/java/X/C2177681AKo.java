package X;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicEnableSurfaceStateTracker;

/* JADX INFO: renamed from: X.1AKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177681AKo implements InterfaceC2181691AZz {
    public SurfaceView LIZ;
    public String LIZIZ;
    public final boolean LIZJ;
    public SurfaceHolderCallbackC2176471AFx<C2177681AKo> LIZLLL;
    public String LJ;

    @Override // X.InterfaceC2181691AZz
    public final int LJIJ() {
        return 0;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJI(int i) {
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIL() {
        this.LJ = null;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJJ() {
    }

    public final boolean LIZ() {
        if (this.LJ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkTokenAndReturn, token:");
        sbLIZ.append(this.LJ);
        C20441214yg.LIZIZ("LinkMicLayoutSurfaceRTCView", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJJI() {
        SurfaceHolderCallbackC2176471AFx<C2177681AKo> surfaceHolderCallbackC2176471AFx;
        SurfaceView surfaceView;
        SurfaceHolder holder;
        if (LinkMicEnableSurfaceStateTracker.INSTANCE.isEnable() && (surfaceHolderCallbackC2176471AFx = this.LIZLLL) != null && (surfaceView = this.LIZ) != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(surfaceHolderCallbackC2176471AFx);
        }
        if (this.LJ != null) {
            this.LJ = null;
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void init() {
        SurfaceHolder holder;
        if (LinkMicEnableSurfaceStateTracker.INSTANCE.isEnable()) {
            this.LIZLLL = new SurfaceHolderCallbackC2176471AFx<>("LinkMicLayoutRenderView", this);
            SurfaceView surfaceView = this.LIZ;
            if (surfaceView == null || (holder = surfaceView.getHolder()) == null) {
                return;
            }
            holder.addCallback(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIJ() {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2177691AKp(this));
    }

    @Override // X.InterfaceC2181691AZz
    public final boolean LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC2181691AZz
    public final View LJIILJJIL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2181691AZz
    public final String getLinkMicId() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIL(int i) {
        SurfaceView surfaceView = this.LIZ;
        if (surfaceView != null) {
            C951770asJ.LIZ(i, surfaceView);
        }
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILL(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2177711AKr(this, z));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIILLIIL(Rect rect) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C1A50(this, rect));
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIJJLI(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC2181691AZz
    public final void setVisible(boolean z) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2177701AKq(this, z));
    }

    public C2177681AKo(SurfaceView surfaceView, String str, boolean z) {
        this.LIZ = surfaceView;
        this.LIZIZ = str;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC2181691AZz
    public final void LJIIZILJ(ViewGroup viewGroup, int i, boolean z, boolean z2) {
        if (LIZ()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C2177671AKn(this, z2, z, viewGroup, i));
    }
}
