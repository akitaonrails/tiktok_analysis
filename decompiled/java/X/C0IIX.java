package X;

import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveColdStartSurfaceCoverExp;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IIX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIX implements C0IIY {
    public static volatile Looper LJIJI;
    public final SurfaceView LIZ;
    public final int LIZJ;
    public final BPEAHandler LJ;
    public Bitmap LJI;
    public C0IG8 LJII;
    public volatile InterfaceC480510Isr LJIIIIZZ;
    public long LJIIIZ;
    public final Paint LIZIZ = new Paint(6);
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final Object LJFF = new Object();
    public volatile boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = false;
    public volatile boolean LJIIZILJ = false;
    public final SurfaceHolderCallbackC463210IEl LJIJ = new SurfaceHolder.Callback() { // from class: X.0IEl
        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            boolean z;
            this.LL.LJIIJ = true;
            C0IIX c0iix = this.LL;
            synchronized (c0iix.LJFF) {
                try {
                    z = c0iix.LJIILLIIL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!z) {
                this.LL.LJFF();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.LL.LJIIJ = false;
            synchronized (this.LL.LJFF) {
                try {
                    C0IIX c0iix = this.LL;
                    c0iix.LJIIJJI = false;
                    c0iix.LJIIL = false;
                    if (!c0iix.LJIILLIIL) {
                        c0iix.LJIILL = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            boolean z;
            C0IIX c0iix = this.LL;
            if (!c0iix.LJIIJJI) {
                synchronized (c0iix.LJFF) {
                    try {
                        z = c0iix.LJIILLIIL;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (!z) {
                    this.LL.LJFF();
                }
            }
        }
    };

    public final void LIZIZ() {
        Canvas canvasLockHardwareCanvas;
        synchronized (this.LJFF) {
            try {
                if (this.LJIILLIIL || !this.LJIIJJI) {
                    return;
                }
                InterfaceC480510Isr interfaceC480510Isr = this.LJIIIIZZ;
                if (interfaceC480510Isr != null) {
                    interfaceC480510Isr.H0(System.currentTimeMillis());
                }
                Surface surface = this.LIZ.getHolder().getSurface();
                if (surface != null && surface.isValid()) {
                    boolean z = false;
                    try {
                        try {
                            canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                        } catch (Throwable th) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        canvasLockHardwareCanvas = null;
                    }
                    if (canvasLockHardwareCanvas == null) {
                        try {
                            canvasLockHardwareCanvas = surface.lockCanvas(null);
                            if (canvasLockHardwareCanvas == null) {
                            }
                            try {
                                canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            } catch (Throwable th3) {
                                th = th3;
                                z = true;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (z && canvasLockHardwareCanvas != null) {
                                        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                                    }
                                    C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS107S0100000_7(this, 253));
                                } catch (Throwable th4) {
                                    if (z && canvasLockHardwareCanvas != null) {
                                        try {
                                            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                                            throw th4;
                                        } catch (Throwable th42) {
                                            throw th42;
                                        }
                                    }
                                    throw th42;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            TryCatchGuardChecker.doCheck(th);
                            if (z) {
                                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            }
                            C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS107S0100000_7(this, 253));
                        }
                    } else {
                        canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    }
                }
                C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS107S0100000_7(this, 253));
            } finally {
                TryCatchGuardChecker.doCheck(th42);
            }
        }
    }

    public final void LIZJ() {
        Surface surface;
        Canvas canvasLockHardwareCanvas;
        boolean z;
        if (this.LJIIZILJ || !this.LJIIJ) {
            return;
        }
        synchronized (this.LJFF) {
            try {
                if (this.LJIIJJI || this.LJIILL || this.LJIILLIIL) {
                    return;
                }
                Bitmap bitmap = this.LJI;
                if (bitmap == null || bitmap.isRecycled() || (surface = this.LIZ.getHolder().getSurface()) == null || !surface.isValid()) {
                    return;
                }
                Canvas canvas = null;
                try {
                    canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                    if (canvasLockHardwareCanvas == null) {
                        try {
                            canvasLockHardwareCanvas = surface.lockCanvas(null);
                            if (canvasLockHardwareCanvas == null) {
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            canvas = canvasLockHardwareCanvas;
                            canvasLockHardwareCanvas = canvas;
                            z = false;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                if (z || canvasLockHardwareCanvas == null) {
                                    return;
                                }
                                surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            } catch (Throwable th2) {
                                if (z && canvasLockHardwareCanvas != null) {
                                    try {
                                        surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                                        throw th2;
                                    } catch (Throwable th22) {
                                        throw th22;
                                    }
                                }
                                throw th22;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    int width = canvasLockHardwareCanvas.getWidth();
                    int height = canvasLockHardwareCanvas.getHeight();
                    int width2 = bitmap.getWidth();
                    int height2 = bitmap.getHeight();
                    if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                        float f = width;
                        float f2 = width2;
                        float f3 = height;
                        float f4 = height2;
                        float fMax = Math.max(f / f2, f3 / f4);
                        float f5 = (f3 - (f4 * fMax)) * 0.5f;
                        Matrix matrix = new Matrix();
                        matrix.setScale(fMax, fMax);
                        matrix.postTranslate((f - (f2 * fMax)) * 0.5f, f5);
                        canvasLockHardwareCanvas.drawBitmap(bitmap, matrix, this.LIZIZ);
                        if (Color.alpha(this.LIZJ) != 0) {
                            canvasLockHardwareCanvas.drawColor(this.LIZJ);
                        }
                        try {
                            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        } catch (Throwable th222) {
                        }
                        synchronized (this.LJFF) {
                            try {
                                if (this.LJIILL || this.LJIILLIIL) {
                                    return;
                                }
                                this.LJIIJJI = true;
                                boolean zLJII = LJII();
                                if (zLJII) {
                                    this.LJIILL = true;
                                }
                                C0IG8 c0ig8 = this.LJII;
                                if (c0ig8 != null) {
                                    C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS76S0200000_7(this, c0ig8, 72));
                                }
                                if (zLJII) {
                                    LIZIZ();
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = true;
                    TryCatchGuardChecker.doCheck(th);
                    if (z) {
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th2222) {
                }
            } finally {
            }
        }
    }

    public final boolean LIZLLL() {
        boolean z;
        synchronized (this.LJFF) {
            try {
                z = this.LJIIJJI && !this.LJIILL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LJ() {
        boolean zLJII;
        if (this.LJIIZILJ) {
            return;
        }
        synchronized (this.LJFF) {
            try {
                this.LJIILJJIL = true;
                zLJII = LJII();
                if (zLJII) {
                    this.LJIILL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!zLJII || this.LJIIZILJ) {
            return;
        }
        this.LJ.removeCallbacksAndMessages(null);
        if (this.LIZ.getVisibility() != 8) {
            C786410Ut5.LLIIII(this.LIZ, 8);
        }
    }

    public final void LJFF() {
        boolean z;
        if (this.LJIIZILJ) {
            return;
        }
        synchronized (this.LJFF) {
            try {
                z = this.LJIILLIIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            return;
        }
        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS107S0100000_7(this, 251));
    }

    public final boolean LJII() {
        if (this.LJIILL || this.LJIILLIIL || !this.LJIIJJI || !this.LJIIL) {
            return false;
        }
        return !this.LJIILIIL || this.LJIILJJIL;
    }

    @Override // X.C0IIY
    public final void onFirstFrameRender() {
        boolean zLJII;
        boolean z;
        if (this.LJIIZILJ) {
            return;
        }
        synchronized (this.LJFF) {
            try {
                if (this.LJIILL || this.LJIILLIIL) {
                    return;
                }
                this.LJIIL = true;
                if (this.LJIIJJI) {
                    zLJII = LJII();
                    if (zLJII) {
                        this.LJIILL = true;
                    }
                    z = false;
                } else {
                    boolean z2 = this.LJIILIIL && !this.LJIILJJIL;
                    if (this.LJI == null || !z2) {
                        this.LJIILL = true;
                        this.LJIILLIIL = true;
                        z = true;
                    } else {
                        z = false;
                    }
                    zLJII = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstFrameRender, revealNow=");
                sbLIZ.append(zLJII);
                sbLIZ.append(", abortCover=");
                sbLIZ.append(z);
                sbLIZ.append(", drawn=");
                sbLIZ.append(this.LJIIJJI);
                sbLIZ.append(", deferUntilSelected=");
                sbLIZ.append(this.LJIILIIL);
                sbLIZ.append(", selected=");
                sbLIZ.append(this.LJIILJJIL);
                sbLIZ.append(", hasBitmap=");
                sbLIZ.append(this.LJI != null);
                sbLIZ.append(", thread=");
                sbLIZ.append(C786410Ut5.u3().getName());
                sbLIZ.append(", roomId=");
                sbLIZ.append(this.LJIIIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    this.LJ.removeCallbacksAndMessages(null);
                    C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS107S0100000_7(this, 252));
                } else if (zLJII) {
                    if (LiveColdStartSurfaceCoverExp.isRevealOnDrawThread()) {
                        C786410Ut5.LJJZZIII(this.LJ, new ARunnableS107S0100000_7(this, 250));
                    } else {
                        LIZIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0IEl] */
    public C0IIX(SurfaceView surfaceView) {
        int iLIZIZ = 0;
        this.LIZ = surfaceView;
        Context context = surfaceView.getContext();
        if (context != null) {
            try {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.eui, context);
            } catch (Throwable th) {
            }
        }
        this.LIZJ = iLIZIZ;
        if (LJIJI == null) {
            synchronized (C0IIX.class) {
                try {
                    if (LJIJI == null) {
                        HandlerThread handlerThread = new HandlerThread("ColdStartCoverDraw");
                        handlerThread.start();
                        LJIJI = C786410Ut5.W2(handlerThread);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        this.LJ = new BPEAHandler(LJIJI);
        this.LIZ.setZOrderMediaOverlay(true);
        this.LIZ.getHolder().setFormat(-3);
        this.LIZ.getHolder().addCallback(this.LJIJ);
    }

    public static void LJI(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZ(Bitmap bitmap) {
        Bitmap bitmap2;
        boolean z;
        if (this.LJIIZILJ) {
            LJI(bitmap);
            return;
        }
        synchronized (this.LJFF) {
            try {
                if (!this.LJIILL && !this.LJIILLIIL) {
                    bitmap2 = this.LJI;
                    this.LJI = bitmap;
                    z = false;
                    this.LJIIJJI = false;
                } else {
                    bitmap2 = null;
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LJI(bitmap);
            return;
        }
        if (bitmap2 != null && bitmap2 != bitmap) {
            LJI(bitmap2);
        }
        LIZJ();
    }
}
