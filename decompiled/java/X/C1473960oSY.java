package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473960oSY implements InterfaceC1482650ogZ {
    public static final String LLILZIL;
    public final C1473870oSP LL;
    public final CopyOnWriteArrayList<InterfaceC1473950oSX> LLILLJJLI = new CopyOnWriteArrayList<>();
    public boolean LLILLL;
    public SurfaceTexture LLILZ;

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
        this.LLILLL = false;
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIIIZ(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIIJ(float f, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final int LJIILL() {
        return 0;
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJIL(SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJJ(C1170404hy c1170404hy) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LJLJLLL(String str) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void jj(boolean z) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void onPagePause() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void q3(boolean z) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void u(boolean z, boolean z2) {
    }

    static {
        LLILZIL = ((Boolean) C1474810oTv.LJJLIIIJILLIZJL.getValue()).booleanValue() ? "TextureViewWrapper<init>" : "UNKNOWN";
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean Da() {
        return this.LL.LLILLL;
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LL.getSurface();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
        SurfaceTexture surfaceTexture = this.LLILZ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void resume() {
        this.LL.LJIILLIIL();
    }

    public final void LIZIZ() {
        Surface surface = getSurface();
        if (surface != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TextureView-");
            sbLIZ.append("null");
            C1474190oSv.LIZ(C2188811AlT.LIZIZ(sbLIZ), surface);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LL;
    }

    public C1473960oSY(ViewGroup viewGroup) {
        C1473870oSP c1473870oSP = new C1473870oSP(viewGroup.getContext(), null);
        this.LL = c1473870oSP;
        c1473870oSP.setId(R.id.vbi);
        if (viewGroup instanceof FrameLayout) {
            c1473870oSP.LJIJ(new FrameLayout.LayoutParams(-1, -1, 17), LLILZIL);
            viewGroup.addView(c1473870oSP, 0);
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            c1473870oSP.LJIJ(layoutParams, LLILZIL);
            viewGroup.addView(c1473870oSP, 0);
        } else {
            c1473870oSP.LJIJ(new ViewGroup.LayoutParams(-1, -1), LLILZIL);
            viewGroup.addView(c1473870oSP, 0);
        }
        c1473870oSP.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1473970oSZ(this));
    }

    @Override // X.InterfaceC1482650ogZ
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        try {
            if (!((Boolean) C309510CBh.LIZ.getValue()).booleanValue()) {
                this.LLILLJJLI.add(interfaceC1473950oSX);
            } else if (!this.LLILLJJLI.contains(interfaceC1473950oSX)) {
                this.LLILLJJLI.add(interfaceC1473950oSX);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.add(interfaceC1473950oSX);
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJ(InterfaceC1474030oSf interfaceC1474030oSf) {
        C1474010oSd.LIZJ(this.LL, interfaceC1474030oSf);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.remove(interfaceC1473950oSX);
    }

    public C1473960oSY(C1473870oSP c1473870oSP) {
        this.LL = c1473870oSP;
        c1473870oSP.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1473970oSZ(this));
    }
}
