package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473920oSU implements InterfaceC1482650ogZ {
    public final C1473880oSQ LL;
    public final CopyOnWriteArrayList<InterfaceC1473950oSX> LLILLJJLI = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
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
    public final void resume() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void u(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1482650ogZ
    public final boolean Da() {
        SurfaceWrapper surfaceWrapper = this.LL.LLILLL;
        if (surfaceWrapper != null) {
            return surfaceWrapper.isValid();
        }
        return false;
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LL.getSurface();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
        C1473880oSQ c1473880oSQ = this.LL;
        if (c1473880oSQ != null) {
            c1473880oSQ.LIZ();
            c1473880oSQ.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LL;
    }

    public C1473920oSU(ViewGroup viewGroup) {
        C1473880oSQ c1473880oSQ = new C1473880oSQ(viewGroup.getContext());
        this.LL = c1473880oSQ;
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(c1473880oSQ, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(c1473880oSQ, 0, layoutParams);
        } else {
            viewGroup.addView(c1473880oSQ, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        c1473880oSQ.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0oSW
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLILLIZIL(i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LLF(i, i2);
                }
            }
        });
    }

    @Override // X.InterfaceC1482650ogZ
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.add(interfaceC1473950oSX);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJ(InterfaceC1474030oSf interfaceC1474030oSf) {
        C1474010oSd.LIZJ(this.LL, interfaceC1474030oSf);
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.remove(interfaceC1473950oSX);
    }
}
