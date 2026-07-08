package X;

import Y.ARunnableS7S0100002_20;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* JADX INFO: renamed from: X.0jjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292170jjL extends GLSurfaceView implements InterfaceC2246811Cwp {
    public volatile boolean LL;
    public float LLILLJJLI;
    public float LLILLL;
    public DataSource.ScaleType LLILZ;
    public InterfaceC1292140jjI LLILZIL;
    public IPlayerController LLILZLL;
    public Surface LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final C1292180jjM LLJI;

    public static void setNewInstanceCallback(InterfaceC1292190jjN interfaceC1292190jjN) {
    }

    @Override // X.InterfaceC2246811Cwp
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK) {
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LJII() {
        this.LLILZIL.LJII();
    }

    @Override // X.InterfaceC2246811Cwp
    public final void onCompletion() {
        this.LLILZIL.onCompletion();
    }

    @Override // X.InterfaceC2246811Cwp
    public final void release() {
        C1292180jjM c1292180jjM = this.LLJI;
        if (c1292180jjM != null) {
            Surface surface = c1292180jjM.LIZ.LLIZ;
            if (surface != null) {
                surface.release();
            }
            c1292180jjM.LIZ.LL = false;
            c1292180jjM.LIZ.LLIZ = null;
        }
        InterfaceC1292140jjI interfaceC1292140jjI = this.LLILZIL;
        if (interfaceC1292140jjI != null) {
            interfaceC1292140jjI.release();
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        queueEvent(new ARunnableS83S0000000_3(36));
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    @Override // X.InterfaceC2246811Cwp
    public final boolean LIZIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC2246811Cwp
    public boolean getLastFrameHold() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC2246811Cwp
    public DataSource.ScaleType getScaleType() {
        return this.LLILZ;
    }

    public C1292170jjL(Context context) {
        super(context, null);
        C1292180jjM c1292180jjM = new C1292180jjM(this);
        this.LLJI = c1292180jjM;
        if (!isInEditMode()) {
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-3);
            InterfaceC1292140jjI interfaceC1292140jjI = this.LLILZIL;
            if (interfaceC1292140jjI != null) {
                interfaceC1292140jjI.LJ(c1292180jjM);
            }
            setZOrderOnTop(true);
            setPreserveEGLContextOnPause(true);
        }
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LIZ(List<MaskSrc> list) {
        queueEvent(new ARunnableS89S0200000_20(this, list, 142));
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
        this.LLILZ = dataInfo.getScaleType();
        if (this.LLILZIL == null) {
            return;
        }
        queueEvent(new ARunnableS89S0200000_20(this, dataInfo, 141));
    }

    @Override // X.InterfaceC2246811Cwp
    public void setEnableElementEvent(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK) {
        this.LLILZIL.setFirstGLFrameListener(interfaceC2247121CxK);
    }

    @Override // X.InterfaceC2246811Cwp
    public void setLastFrameHold(boolean z) {
        this.LLIZLLLIL = z;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setPlayerController(IPlayerController iPlayerController) {
        this.LLILZLL = iPlayerController;
    }

    @Override // X.InterfaceC2246811Cwp
    public void setVideoRenderer(InterfaceC1292140jjI interfaceC1292140jjI) {
        this.LLILZIL = interfaceC1292140jjI;
        setRenderer(interfaceC1292140jjI);
        InterfaceC1292140jjI interfaceC1292140jjI2 = this.LLILZIL;
        if (interfaceC1292140jjI2 != null) {
            interfaceC1292140jjI2.LJ(this.LLJI);
        }
        setRenderMode(0);
    }

    @Override // X.InterfaceC2246811Cwp
    public final void LIZLLL(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.LLILLJJLI = f;
            this.LLILLL = f2;
        }
        if (this.LLILZIL == null) {
            return;
        }
        queueEvent(new ARunnableS7S0100002_20(this, getMeasuredWidth(), getMeasuredHeight(), 8));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LIZLLL(this.LLILLJJLI, this.LLILLL);
    }
}
