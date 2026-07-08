package X;

import android.os.Build;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.videoview.SurfaceViewWrapper;

/* JADX INFO: renamed from: X.0ogY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482640ogY implements InterfaceC1482650ogZ {
    public static int LLILLJJLI = -1;
    public InterfaceC1482650ogZ LL;

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJLJLLL(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean Da() {
        return this.LL.Da();
    }

    @Override // X.InterfaceC1482650ogZ
    public final View Hk() {
        return this.LL.Hk();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
        this.LL.LIZ();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZJ() {
        this.LL.LIZJ();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZLLL() {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
        this.LL.LJFF();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIL() {
        this.LL.LJIIL();
    }

    @Override // X.InterfaceC1482650ogZ
    public final int LJIILL() {
        return this.LL.LJIILL();
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean LJIJI() {
        return this.LL.LJIJI();
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LL.getSurface();
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LL.getView();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void onPagePause() {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.onPagePause();
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.release();
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void resume() {
        this.LL.resume();
    }

    public static C1482640ogY LJIIIIZZ(C1473870oSP c1473870oSP) {
        Object tag = c1473870oSP.getTag();
        if (tag instanceof C1482640ogY) {
            return (C1482640ogY) tag;
        }
        C1482640ogY c1482640ogY = new C1482640ogY();
        c1482640ogY.LL = new C1473960oSY(c1473870oSP);
        c1473870oSP.setTag(c1482640ogY);
        return c1482640ogY;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LL.Dn(interfaceC1473950oSX);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJ(InterfaceC1474030oSf interfaceC1474030oSf) {
        this.LL.LJ(interfaceC1474030oSf);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIIZ(String str) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.LJIIIZ(str);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIL(SurfaceView surfaceView) {
        this.LL.LJIL(surfaceView);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJJ(C1170404hy c1170404hy) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.LJJ(c1170404hy);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void jj(boolean z) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.jj(z);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void q3(boolean z) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.q3(false);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LL.s5(interfaceC1473950oSX);
    }

    public static C1482640ogY LIZIZ(ViewGroup viewGroup, boolean z) {
        if (z && ((Boolean) C1474810oTv.s0.getValue()).booleanValue()) {
            if (LLILLJJLI == -1) {
                LLILLJJLI = 0;
                try {
                    if (((Integer) Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.oplus.display.reset_two_pq_layer", -1)).intValue() == 1) {
                        LLILLJJLI = 1;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (LLILLJJLI == 0) {
                z = false;
            }
        }
        return LJI(viewGroup, z, false);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void u(boolean z, boolean z2) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.u(z, false);
        }
    }

    public static C1482640ogY LJI(ViewGroup viewGroup, boolean z, boolean z2) {
        C1482640ogY c1482640ogY = new C1482640ogY();
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (c1480850odf.isUseSurfaceControl() && z) {
            c1482640ogY.LL = new C1474100oSm(viewGroup);
            return c1482640ogY;
        }
        if ((Build.VERSION.SDK_INT >= 24 && z2) || (c1480850odf.isUseSurfaceView() && z)) {
            c1482640ogY.LL = new SurfaceViewWrapper(0, 0, viewGroup);
            c1482640ogY.getView().setTag(c1482640ogY);
            return c1482640ogY;
        }
        LJII(false, c1482640ogY, viewGroup);
        c1482640ogY.getView().setTag(c1482640ogY);
        return c1482640ogY;
    }

    public static void LJII(boolean z, C1482640ogY c1482640ogY, ViewGroup viewGroup) {
        if (z) {
            c1482640ogY.LL = new C1473910oST(viewGroup);
        } else if (((Boolean) C1474810oTv.LJLIIL.getValue()).booleanValue()) {
            c1482640ogY.LL = new C1473920oSU(viewGroup);
        } else {
            c1482640ogY.LL = new C1473960oSY(viewGroup);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIJ(float f, int i, int i2, int i3) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.LJIIJ(f, i, i2, i3);
        }
    }
}
