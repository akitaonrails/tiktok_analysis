package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS7S0100002_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* JADX INFO: renamed from: X.0jjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292130jjH extends TextureViewSurfaceTextureListenerC1287530jbr implements InterfaceC2246811Cwp {
    public volatile boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public DataSource.ScaleType LLJJI;
    public InterfaceC1292140jjI LLJJIII;
    public IPlayerController LLJJIJI;
    public Surface LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C1292150jjJ LLJJJIL;

    @Override // X.InterfaceC2246811Cwp
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK) {
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LJII() {
        this.LLJJIII.LJII();
    }

    @Override // X.InterfaceC2246811Cwp
    public final void onCompletion() {
        this.LLJJIII.onCompletion();
    }

    @Override // X.InterfaceC2246811Cwp
    public final void release() {
        C1292150jjJ c1292150jjJ = this.LLJJJIL;
        if (c1292150jjJ != null) {
            Surface surface = c1292150jjJ.LIZ.LLJJIJIIJIL;
            if (surface != null) {
                surface.release();
            }
            c1292150jjJ.LIZ.LLJILJILJ = false;
            c1292150jjJ.LIZ.LLJJIJIIJIL = null;
        }
        InterfaceC1292140jjI interfaceC1292140jjI = this.LLJJIII;
        if (interfaceC1292140jjI != null) {
            interfaceC1292140jjI.release();
        }
    }

    @Override // X.TextureViewSurfaceTextureListenerC1287530jbr, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJI(new ARunnableS103S0100000_3((Object) this, 89));
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    @Override // X.InterfaceC2246811Cwp
    public final boolean LIZIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC2246811Cwp
    public boolean getLastFrameHold() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC2246811Cwp
    public DataSource.ScaleType getScaleType() {
        return this.LLJJI;
    }

    public C1292130jjH(Context context) {
        super(context);
        C1292150jjJ c1292150jjJ = new C1292150jjJ(this);
        this.LLJJJIL = c1292150jjJ;
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(new C1287500jbo(this, 8, 16));
            InterfaceC1292140jjI interfaceC1292140jjI = this.LLJJIII;
            if (interfaceC1292140jjI != null) {
                interfaceC1292140jjI.LJ(c1292150jjJ);
            }
            setPreserveEGLContextOnPause(true);
            setOpaque(false);
        }
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LIZ(List<MaskSrc> list) {
        LJI(new ARunnableS89S0200000_20(this, list, 144));
    }

    @Override // X.InterfaceC2246811Cwp
    public final boolean LIZJ(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        C786410Ut5.LJJJLZIJ(this, viewGroup);
        return true;
    }

    @Override // X.InterfaceC2246811Cwp
    public final boolean LJ(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == viewGroup) {
            return true;
        }
        LIZJ(viewGroup2);
        if (viewGroup.indexOfChild(this) != -1) {
            return false;
        }
        viewGroup.addView(this);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC2246811Cwp
    public void setConfigParams(DataSource.DataInfo dataInfo) {
        this.LLJJI = dataInfo.getScaleType();
        if (this.LLJJIII == null) {
            return;
        }
        LJI(new ARunnableS89S0200000_20(this, dataInfo, 143));
    }

    @Override // X.InterfaceC2246811Cwp
    public void setEnableElementEvent(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.LLJJIII.setFirstGLFrameListener(interfaceC2247121CxK);
    }

    @Override // X.InterfaceC2246811Cwp
    public void setLastFrameHold(boolean z) {
        this.LLJJIJIL = z;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setPlayerController(IPlayerController iPlayerController) {
        this.LLJJIJI = iPlayerController;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setVideoRenderer(InterfaceC1292140jjI interfaceC1292140jjI) {
        this.LLJJIII = interfaceC1292140jjI;
        setRenderer(interfaceC1292140jjI);
        InterfaceC1292140jjI interfaceC1292140jjI2 = this.LLJJIII;
        if (interfaceC1292140jjI2 != null) {
            interfaceC1292140jjI2.LJ(this.LLJJJIL);
        }
        setRenderMode(0);
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LIZLLL(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.LLJILLL = f;
            this.LLJJ = f2;
        }
        if (this.LLJJIII == null) {
            return;
        }
        LJI(new ARunnableS7S0100002_20(this, getMeasuredWidth(), getMeasuredHeight(), 9));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LIZLLL(this.LLJILLL, this.LLJJ);
    }
}
