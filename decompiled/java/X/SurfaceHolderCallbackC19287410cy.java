package X;

import Y.ACallableS431S0100000_28;
import android.view.SurfaceHolder;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* JADX INFO: renamed from: X.10cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class SurfaceHolderCallbackC19287410cy implements SurfaceHolder.Callback {
    public final /* synthetic */ ScanQRCodeActivityV2 LL;

    public final void LIZ() {
        this.LL.LLLZLZ();
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.LL;
        scanQRCodeActivityV2.getClass();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -scanQRCodeActivityV2.LLJJJ.getHeight(), scanQRCodeActivityV2.LLJJJIL.getHeight() - C341940Daq.LIZ(20.0d));
        translateAnimation.setDuration(2000L);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        scanQRCodeActivityV2.LLJJJ.startAnimation(translateAnimation);
    }

    public SurfaceHolderCallbackC19287410cy(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.LL = scanQRCodeActivityV2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2;
        synchronized (this) {
            try {
                scanQRCodeActivityV2 = this.LL;
                scanQRCodeActivityV2.LLJJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (scanQRCodeActivityV2.LLJI == null) {
            scanQRCodeActivityV2.LLLLZLLIL(new InterfaceC19289410dI() { // from class: X.10d4
                @Override // X.InterfaceC19289410dI
                public final void LIZ() {
                    SurfaceHolderCallbackC19287410cy surfaceHolderCallbackC19287410cy = this.LIZ;
                    surfaceHolderCallbackC19287410cy.getClass();
                    C15O7.LIZIZ(new ACallableS431S0100000_28(surfaceHolderCallbackC19287410cy, 21), ExecutorC1592406Li.LLILLJJLI, null);
                }
            });
        } else {
            LIZ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2;
        this.LL.LLJJJ.clearAnimation();
        synchronized (this) {
            try {
                scanQRCodeActivityV2 = this.LL;
                scanQRCodeActivityV2.LLJJ = false;
            } finally {
            }
        }
        if (scanQRCodeActivityV2.LLJI != null) {
            synchronized (scanQRCodeActivityV2) {
                try {
                    IQRCodeScanner iQRCodeScanner = this.LL.LLJI;
                    if (iQRCodeScanner != null) {
                        iQRCodeScanner.stop();
                        this.LL.LLJI.release();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LL.LLJLLIL.LIZ("surfaceChanged", Integer.valueOf(i2));
    }
}
