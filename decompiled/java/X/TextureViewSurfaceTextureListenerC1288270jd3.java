package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.PlatformCanvasView;
import com.lynx.canvas.SurfaceHolder;

/* JADX INFO: renamed from: X.0jd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class TextureViewSurfaceTextureListenerC1288270jd3 extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC790510Uzh {
    public final long LL;
    public C854540Xfg LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public PlatformCanvasView LLIZLLLIL;
    public SurfaceHolder mSurfaceHolder;

    public final void LIZ() {
        setNeedAlphaWorkaround(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public float getScale() {
        PlatformCanvasView platformCanvasView = this.LLIZLLLIL;
        if (platformCanvasView == null) {
            return 1.0f;
        }
        return platformCanvasView.LIZIZ;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        C1288370jdD.LIZJ("KryptonCanvasView", "onAttachedToWindow");
        super.onAttachedToWindow();
        if (this.LLILLL) {
            C1288370jdD.LIZLLL("KryptonCanvasView", "initScreenLockWorkaround multiple times.");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initScreenLockWorkaround ");
        sbLIZ.append(this);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C854540Xfg(this, 0);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        try {
            C786410Ut5.LJIJJ(getContext(), this.LLILLJJLI, intentFilter);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1288370jdD.LIZIZ("KryptonCanvasView", e.getMessage());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register BoardCastReceiver: ");
            sbLIZ2.append(this.LLILLJJLI);
            C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLILLL = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.LLILLL) {
            C1288370jdD.LIZLLL("KryptonCanvasView", "deInitScreenLockWorkaround multiple times.");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deInitScreenLockWorkaround ");
        sbLIZ.append(this);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = false;
        try {
            C786410Ut5.LJJIFFI(getContext(), this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1288370jdD.LIZIZ("KryptonCanvasView", e.getMessage());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unregister BoardCastReceiver: ");
            sbLIZ2.append(this.LLILLJJLI);
            C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public TextureViewSurfaceTextureListenerC1288270jd3(Context context) {
        super(C786410Ut5.N3(context));
        this.LL = 0L;
        C1288370jdD.LIZJ("KryptonCanvasView", "UICanvasView created");
        setSurfaceTextureListener(this);
        this.LLILZ = 1.0f;
        setOpaque(false);
        setNeedAlphaWorkaround(true);
        SurfaceHolder surfaceHolder = new SurfaceHolder(this);
        this.mSurfaceHolder = surfaceHolder;
        surfaceHolder.LIZIZ(this);
        SurfaceHolder surfaceHolder2 = this.mSurfaceHolder;
        long j = surfaceHolder2.LJ;
        surfaceHolder2.LJ = 0L;
        this.LL = j;
        this.LLIZLLLIL = new PlatformCanvasView();
    }

    private void setNeedAlphaWorkaround(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNeedAlphaWorkaround with ");
        sbLIZ.append(z);
        sbLIZ.append(" Build.VERSION.SDK_INT ");
        int i = Build.VERSION.SDK_INT;
        sbLIZ.append(i);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 28) {
            return;
        }
        this.LLILZIL = z;
        if (z) {
            super.setAlpha(0.0f);
        } else {
            super.setAlpha(this.LLILZ);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureDestroyed ");
        sbLIZ.append(surfaceTexture);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        if (C1285860jZA.LIZ) {
            C1288370jdD.LIZJ("KryptonCanvasView", "needTextureDestroyWorkaround, try to postAtFrontOnUI.");
            this.LLIZ = getVisibility();
            this.LLILZLL = true;
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
            ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 77);
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            Message messageObtain = Message.obtain(bPEAHandler, aRunnableS113S0100000_13);
            messageObtain.setAsynchronous(true);
            C786410Ut5.LJLJJLL(bPEAHandler, messageObtain);
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LLILZ = f;
        if (!this.LLILZIL) {
            super.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        try {
            super.setBackground(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBackground fail, message: ");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        try {
            super.setBackgroundDrawable(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBackgroundDrawable fail, message: ");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        try {
            super.setForeground(drawable);
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setForeground fail, message: ");
            sbLIZ.append(e.getMessage());
            C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        super.setSurfaceTexture(surfaceTexture);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILZLL) {
            this.LLIZ = i;
            if (i == 0) {
                C1288370jdD.LIZJ("KryptonCanvasView", "Force visiblity to INVISIBLE due to workaround.");
                i = 4;
            }
        }
        super.setVisibility(i);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureAvailable ");
        sbLIZ.append(surfaceTexture);
        sbLIZ.append(" wh ");
        sbLIZ.append(i);
        sbLIZ.append(" / ");
        sbLIZ.append(i2);
        C1288370jdD.LIZLLL("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.LIZIZ(this);
            this.mSurfaceHolder.LIZLLL(i, i2);
            PlatformCanvasView platformCanvasView = this.LLIZLLLIL;
            if (platformCanvasView != null) {
                platformCanvasView.LJ(this.LL, i, i2, EnumC1285200jY6.SCALE_TO_FILL);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSurfaceTextureAvailable but sh is ");
        sbLIZ2.append(this.mSurfaceHolder);
        C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureSizeChanged ");
        sbLIZ.append(surfaceTexture);
        sbLIZ.append(" wh ");
        sbLIZ.append(i);
        sbLIZ.append(" / ");
        sbLIZ.append(i2);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.LIZLLL(i, i2);
            PlatformCanvasView platformCanvasView = this.LLIZLLLIL;
            if (platformCanvasView != null) {
                platformCanvasView.LJ(this.LL, i, i2, EnumC1285200jY6.SCALE_TO_FILL);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSurfaceTextureSizeChanged but sh is ");
        sbLIZ2.append(this.mSurfaceHolder);
        C1288370jdD.LIZIZ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C1288370jdD.LIZIZ("KryptonCanvasView", "onSizeChanged before added to view tree, may produce npe on some devices");
        }
    }
}
