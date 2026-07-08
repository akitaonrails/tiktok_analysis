package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import kotlin.jvm.internal.AwS564S0100000_20;

/* JADX INFO: renamed from: X.0jXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class TextureViewSurfaceTextureListenerC1284890jXb extends TextureView implements TextureView.SurfaceTextureListener {
    public volatile ChoreographerFrameCallbackC1284880jXa LL;
    public final C01GW LLILLJJLI;
    public final String LLILLL;
    public EnumC1284920jXe LLILZ;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final C1287380jbc getRenderer() {
        return (C1287380jbc) this.LLILLJJLI.getValue();
    }

    public final EnumC1284920jXe getRenderMode() {
        return this.LLILZ;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Handler handler;
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa = this.LL;
        if (choreographerFrameCallbackC1284880jXa != null && (handler = choreographerFrameCallbackC1284880jXa.LL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(choreographerFrameCallbackC1284880jXa, 38));
        }
        this.LL = null;
        return true;
    }

    public final void setRenderMode(EnumC1284920jXe enumC1284920jXe) {
        Handler handler;
        this.LLILZ = enumC1284920jXe;
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa = this.LL;
        if (choreographerFrameCallbackC1284880jXa != null && (handler = choreographerFrameCallbackC1284880jXa.LL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(enumC1284920jXe, choreographerFrameCallbackC1284880jXa, 26));
        }
    }

    public final void setUniforms(C1287390jbd c1287390jbd) {
        Handler handler;
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa = this.LL;
        if (choreographerFrameCallbackC1284880jXa != null && (handler = choreographerFrameCallbackC1284880jXa.LL) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(c1287390jbd, this, 25));
        }
    }

    public TextureViewSurfaceTextureListenerC1284890jXb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS564S0100000_20(context, 49));
        this.LLILLL = "TuxTextureView";
        this.LLILZ = EnumC1284920jXe.CONTINUOUS;
        setSurfaceTextureListener(this);
    }

    public final void LIZ(String str, String str2, C1287390jbd c1287390jbd) {
        getRenderer().LL = str;
        getRenderer().LLILLJJLI = str2;
        getRenderer().LLILLL = true;
        getRenderer().LIZLLL(c1287390jbd);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa;
        if (this.LL == null || ((choreographerFrameCallbackC1284880jXa = this.LL) != null && !choreographerFrameCallbackC1284880jXa.isAlive())) {
            ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa2 = new ChoreographerFrameCallbackC1284880jXa(this);
            choreographerFrameCallbackC1284880jXa2.start();
            this.LL = choreographerFrameCallbackC1284880jXa2;
        }
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa3 = this.LL;
        if (choreographerFrameCallbackC1284880jXa3 != null) {
            choreographerFrameCallbackC1284880jXa3.LIZJ(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ChoreographerFrameCallbackC1284880jXa choreographerFrameCallbackC1284880jXa = this.LL;
        if (choreographerFrameCallbackC1284880jXa != null) {
            choreographerFrameCallbackC1284880jXa.LIZJ(i, i2);
        }
    }
}
