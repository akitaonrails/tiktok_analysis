package X;

import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473910oST implements InterfaceC1482650ogZ {
    public final C1473810oSJ LL;
    public final CopyOnWriteArrayList<InterfaceC1473950oSX> LLILLJJLI = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final /* synthetic */ void LIZLLL() {
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LJFF() {
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
        SurfaceWrapper surfaceWrapper = this.LL.LLILLJJLI;
        return surfaceWrapper != null && surfaceWrapper.isValid();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void LIZJ() {
        C1473810oSJ c1473810oSJ = this.LL;
        if (c1473810oSJ != null) {
            c1473810oSJ.LLJ = true;
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final Surface getSurface() {
        return this.LL.getSurface();
    }

    @Override // X.InterfaceC1482650ogZ
    public final void release() {
        C1473810oSJ c1473810oSJ = this.LL;
        if (C1481110oe5.LIZ) {
            c1473810oSJ.getClass();
            C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", "release");
        }
        c1473810oSJ.LIZIZ(true);
        c1473810oSJ.setSurfaceTextureListener(null);
    }

    @Override // X.InterfaceC1482650ogZ
    public final View getView() {
        return this.LL;
    }

    public C1473910oST(ViewGroup viewGroup) {
        C1473810oSJ c1473810oSJ = new C1473810oSJ(viewGroup.getContext());
        this.LL = c1473810oSJ;
        c1473810oSJ.setId(R.id.vbi);
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(c1473810oSJ, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(c1473810oSJ, 0, layoutParams);
        } else {
            viewGroup.addView(c1473810oSJ, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        c1473810oSJ.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0oSV
            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Iterator<InterfaceC1473950oSX> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                Surface surface = this.LL.LL.getSurface();
                if (surface != null) {
                    C1471640oOo.LIZJ.remove(surface);
                    return true;
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
                C1473810oSJ c1473810oSJ2 = this.LL.LL;
                C1471640oOo.LIZJ.put(c1473810oSJ2.getSurface(), c1473810oSJ2);
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
    public final void LJIIIZ(String str) {
        Pair pair;
        C1473810oSJ c1473810oSJ = this.LL;
        if (c1473810oSJ != null) {
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            SimBitRate simBitRate = c1477400oY6.LIZLLL.get(str);
            if (simBitRate == null && (simBitRate = c1477400oY6.LJ.get(str)) == null && (simBitRate = c1477400oY6.LJII.get(str)) == null) {
                simBitRate = c1477400oY6.LJIIIIZZ.get(str);
            }
            if (simBitRate != null && simBitRate.getVideoWidth() > 0 && simBitRate.getVideoHeight() > 0) {
                pair = new Pair(Integer.valueOf(simBitRate.getVideoWidth()), Integer.valueOf(simBitRate.getVideoHeight()));
            } else {
                pair = new Pair(-1, -1);
            }
            if (((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                int iIntValue = ((Integer) pair.first).intValue();
                int iIntValue2 = ((Integer) pair.second).intValue();
                if (C1474810oTv.LJLJJL()) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EnableSurfaceTexturePool recordBindVideoSize reuseState:");
                        sbLIZ.append(c1473810oSJ.LLILZLL);
                        sbLIZ.append(", lastBindVideoWidth:");
                        sbLIZ.append(c1473810oSJ.LLILZ);
                        sbLIZ.append(", lastBindVideoHeight:");
                        sbLIZ.append(c1473810oSJ.LLILZIL);
                        sbLIZ.append(", width:");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", height:");
                        sbLIZ.append(iIntValue2);
                        C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    c1473810oSJ.LLILZ = iIntValue;
                    c1473810oSJ.LLILZIL = iIntValue2;
                    return;
                }
                int i = c1473810oSJ.LLILZ;
                if (i == -1 && c1473810oSJ.LLILZIL == -1) {
                    c1473810oSJ.LLILZLL = 1;
                } else if (i == iIntValue && c1473810oSJ.LLILZIL == iIntValue2) {
                    c1473810oSJ.LLILZLL = 2;
                } else {
                    c1473810oSJ.LLILZLL = 3;
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("recordBindVideoSize reuseState:");
                    sbLIZ2.append(c1473810oSJ.LLILZLL);
                    sbLIZ2.append(", lastBindVideoWidth:");
                    sbLIZ2.append(c1473810oSJ.LLILZ);
                    sbLIZ2.append(", lastBindVideoHeight:");
                    sbLIZ2.append(c1473810oSJ.LLILZIL);
                    sbLIZ2.append(", width:");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(", height:");
                    sbLIZ2.append(iIntValue2);
                    C1481110oe5.LIZIZ("KeepSurfaceTextureViewV2", C2188811AlT.LIZIZ(sbLIZ2));
                }
                c1473810oSJ.LLILZ = iIntValue;
                c1473810oSJ.LLILZIL = iIntValue2;
            }
        }
    }

    @Override // X.InterfaceC1482650ogZ
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLJJLI.remove(interfaceC1473950oSX);
    }
}
