package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0khh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329590khh implements InterfaceC1329780ki0 {
    public final C1331210kkJ LIZ;
    public final C1329440khS LIZIZ;
    public final InterfaceC1329600khi LIZJ;
    public final Rect LIZLLL;
    public final int[] LJ;
    public final C1329890kiB[] LJFF;
    public final Rect LJI = new Rect();
    public final Rect LJII = new Rect();
    public int LJIIIIZZ = 2;
    public Bitmap LJIIIZ;

    public final synchronized void LJII() {
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            this.LJIIIZ = null;
        }
    }

    @Override // X.InterfaceC1329780ki0
    public final boolean LIZ() {
        boolean z = this.LIZIZ.LJFF;
        if (C1328130kfL.LJIILIIL().LJJI()) {
            return true;
        }
        return z && C1328130kfL.LJIILIIL().LJJIFFI();
    }

    @Override // X.InterfaceC1329780ki0
    public final int LIZLLL() {
        return this.LIZLLL.width();
    }

    @Override // X.InterfaceC1329780ki0
    public final int LJI() {
        return this.LIZLLL.height();
    }

    @Override // X.InterfaceC1329780ki0
    public final int getFrameCount() {
        return this.LIZJ.getFrameCount();
    }

    @Override // X.InterfaceC1329780ki0
    public final int getHeight() {
        return this.LIZJ.getHeight();
    }

    @Override // X.InterfaceC1329780ki0
    public final int getLoopCount() {
        return this.LIZJ.getLoopCount();
    }

    @Override // X.InterfaceC1329780ki0
    public final int getWidth() {
        return this.LIZJ.getWidth();
    }

    @Override // X.InterfaceC1329780ki0
    public final C1329440khS LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1329780ki0
    public final int LIZIZ(int i) {
        return this.LJ[i];
    }

    @Override // X.InterfaceC1329780ki0
    public final C1329590khh LJ(Rect rect) {
        if (LJIIIIZZ(this.LIZJ, rect).equals(this.LIZLLL)) {
            return this;
        }
        return new C1329590khh(this.LIZ, this.LIZIZ, rect);
    }

    @Override // X.InterfaceC1329780ki0
    public final C1329890kiB getFrameInfo(int i) {
        return this.LJFF[i];
    }

    public static Rect LJIIIIZZ(InterfaceC1329600khi interfaceC1329600khi, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, interfaceC1329600khi.getWidth(), interfaceC1329600khi.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), interfaceC1329600khi.getWidth()), Math.min(rect.height(), interfaceC1329600khi.getHeight()));
    }

    @Override // X.InterfaceC1329780ki0
    public final void LJFF(Canvas canvas, int i) {
        InterfaceC1329960kiI frame = this.LIZJ.getFrame(i);
        try {
            if (this.LIZJ.doesRenderSupportScaling()) {
                LJIIL(canvas, frame);
            } else {
                LJIIJJI(canvas, frame);
            }
            frame.dispose();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            frame.dispose();
            throw th;
        }
    }

    public final synchronized void LJIIJ(int i, int i2) {
        Bitmap bitmap = this.LJIIIZ;
        if (bitmap != null && (bitmap.getWidth() < i || this.LJIIIZ.getHeight() < i2)) {
            LJII();
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public final void LJIIJJI(Canvas canvas, InterfaceC1329960kiI interfaceC1329960kiI) {
        int width = interfaceC1329960kiI.getWidth();
        int height = interfaceC1329960kiI.getHeight();
        int xOffset = interfaceC1329960kiI.getXOffset();
        int yOffset = interfaceC1329960kiI.getYOffset();
        synchronized (this) {
            try {
                LJIIJ(width, height);
                synchronized (this.LJIIIZ) {
                    try {
                        this.LJIIIZ.eraseColor(0);
                        try {
                            interfaceC1329960kiI.renderFrame(width, height, this.LJIIIZ);
                            this.LJI.set(0, 0, width, height);
                            this.LJII.set(0, 0, width, height);
                            canvas.save();
                            canvas.translate(xOffset, yOffset);
                            canvas.drawBitmap(this.LJIIIZ, this.LJI, this.LJII, (Paint) null);
                            canvas.restore();
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(LJIIIZ(this.LJIIIZ, width, height, null, this.LJIIIIZZ));
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void LJIIL(Canvas canvas, InterfaceC1329960kiI interfaceC1329960kiI) {
        double dWidth = ((double) this.LIZLLL.width()) / ((double) this.LIZJ.getWidth());
        double dHeight = ((double) this.LIZLLL.height()) / ((double) this.LIZJ.getHeight());
        int iRound = (int) Math.round(((double) interfaceC1329960kiI.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) interfaceC1329960kiI.getHeight()) * dHeight);
        int xOffset = (int) (((double) interfaceC1329960kiI.getXOffset()) * dWidth);
        int yOffset = (int) (((double) interfaceC1329960kiI.getYOffset()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.LIZLLL.width();
                int iHeight = this.LIZLLL.height();
                LJIIJ(iWidth, iHeight);
                synchronized (this.LJIIIZ) {
                    try {
                        this.LJIIIZ.eraseColor(0);
                        try {
                            interfaceC1329960kiI.renderFrame(iRound, iRound2, this.LJIIIZ);
                            this.LJI.set(0, 0, iWidth, iHeight);
                            this.LJII.set(xOffset, yOffset, iWidth + xOffset, iHeight + yOffset);
                            canvas.drawBitmap(this.LJIIIZ, this.LJI, this.LJII, (Paint) null);
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(e.getMessage());
                            sbLIZ.append(LJIIIZ(this.LJIIIZ, iRound, iRound2, this.LIZLLL, this.LJIIIIZZ));
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1329590khh(C1331210kkJ c1331210kkJ, C1329440khS c1329440khS, Rect rect) {
        this.LIZ = c1331210kkJ;
        this.LIZIZ = c1329440khS;
        InterfaceC1329600khi interfaceC1329600khi = c1329440khS.LIZ;
        this.LIZJ = interfaceC1329600khi;
        int[] frameDurations = interfaceC1329600khi.getFrameDurations();
        this.LJ = frameDurations;
        c1331210kkJ.getClass();
        for (int i = 0; i < frameDurations.length; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        C1331210kkJ c1331210kkJ2 = this.LIZ;
        int[] iArr = this.LJ;
        c1331210kkJ2.getClass();
        for (int i2 = 0; i2 < iArr.length; i2++) {
        }
        C1331210kkJ c1331210kkJ3 = this.LIZ;
        int[] iArr2 = this.LJ;
        c1331210kkJ3.getClass();
        for (int i3 = 0; i3 < iArr2.length; i3++) {
        }
        this.LIZLLL = LJIIIIZZ(this.LIZJ, rect);
        this.LJFF = new C1329890kiB[this.LIZJ.getFrameCount()];
        for (int i4 = 0; i4 < this.LIZJ.getFrameCount(); i4++) {
            this.LJFF[i4] = this.LIZJ.getFrameInfo(i4);
        }
    }

    public static String LJIIIZ(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder sb = new StringBuilder(", mTempBitmap:");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append(", frame:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        if (rect != null) {
            sb.append(", renderedBounds:");
            sb.append(rect.width());
            sb.append("x");
            sb.append(rect.height());
        }
        sb.append(", decodeType:");
        sb.append(i3);
        return sb.toString();
    }
}
