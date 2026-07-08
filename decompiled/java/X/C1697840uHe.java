package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import nv7.c0;

/* JADX INFO: renamed from: X.0uHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697840uHe extends FrameLayout implements InterfaceC1453510nvZ {
    public RectF LL;
    public final int LLILLJJLI;
    public final Paint LLILLL;
    public final DashPathEffect LLILZ;
    public final int LLILZIL;
    public int LLILZLL;
    public RectF LLIZ;
    public final Vibrator LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public C1663530tOJ LLJJI;
    public int LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // X.InterfaceC1453510nvZ
    public final void LJ() {
        LJIIIZ(false);
        LJIILIIL(false);
        LJI(false);
        LJIIJJI(false);
        LJIIIIZZ(false);
        LJIILL(false);
        LJII(false);
        LJIILJJIL(false);
        LJIIJ(false);
        LJIIL(false);
        C1663530tOJ c1663530tOJ = this.LLJJI;
        if (c1663530tOJ != null) {
            if (this.LLJJIJIIJIL || this.LLJJIJIL) {
                c1663530tOJ.LIZIZ(false);
                this.LLJJI.LIZJ(false);
                this.LLJJI.LJ(false);
                this.LLJJI.LIZLLL(false);
            }
        }
    }

    @Override // X.InterfaceC1453510nvZ
    public View getContentView() {
        return this;
    }

    public static int LJFF() {
        InterfaceC1674890tgd interfaceC1674890tgd = C196909122h.LIZJ;
        if (interfaceC1674890tgd != null) {
            interfaceC1674890tgd.n2();
        }
        return c0.LIZ.LIZJ();
    }

    public static int getTbMargin() {
        return (int) C12ES.LIZJ(201.0f, C0CHQ.LIZ);
    }

    public final void LJIILLIIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJIJI > 200) {
            this.LLJJIJI = jCurrentTimeMillis;
            Vibrator vibrator = this.LLIZLLLIL;
            if (vibrator != null) {
                try {
                    vibrator.vibrate(30L);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public float getLeftViewXMargin() {
        return C1388580mEq.LIZIZ(getContext()) ? this.LLILLJJLI : C12ES.LIZJ(32.0f, getContext());
    }

    public float getRightViewXMargin() {
        return C1388580mEq.LIZIZ(getContext()) ? ScreenUtils.getScreenWidth(getContext()) - C12ES.LIZJ(32.0f, getContext()) : ScreenUtils.getScreenWidth(getContext()) - this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJ();
        Context context = getContext();
        int screenWidth = ScreenUtils.getScreenWidth(getContext());
        getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(screenWidth, LJFF());
        layoutParams.gravity = 1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        if (this.LL == null) {
            this.LL = new RectF(getLeftViewXMargin(), (int) C12ES.LIZJ(88.0f, context), getRightViewXMargin(), LJFF() - this.LLILZIL);
        }
    }

    public int getDeltaX() {
        return this.LLILZLL;
    }

    public boolean getEnableFakeFeedView() {
        return this.LLJJIJIIJIL;
    }

    public boolean getEnableStoryFakeFeedView() {
        return this.LLJJIJIL;
    }

    public C1697840uHe(Context context) {
        super(context, null);
        Paint paint = new Paint();
        this.LLILLL = paint;
        this.LLIZ = new RectF();
        this.LLJ = 1.0f;
        this.LLJI = 1.0f;
        this.LLJIJIL = 1.0f;
        this.LLJILJIL = 1.0f;
        this.LLJILJILJ = 0;
        this.LLJILLL = -1;
        this.LLJJ = 0;
        this.LLJJIII = 100;
        this.LLJJIJI = 0L;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = false;
        int iLIZJ = (int) C12ES.LIZJ(1.5f, context);
        this.LLILLJJLI = (int) C12ES.LIZJ(56.0f, context);
        this.LLJJ = (int) C12ES.LIZJ(32.0f, context);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context);
        if (numLIZJ != null) {
            paint.setColor(numLIZJ.intValue());
        }
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(iLIZJ);
        paint.setShadowLayer(10.0f, 0.0f, 0.0f, -7829368);
        setWillNotDraw(false);
        this.LLILZIL = (int) C12ES.LIZJ(201.0f, context);
        this.LLILZ = new DashPathEffect(new float[]{C12ES.LIZJ(2.0f, context), C12ES.LIZJ(1.0f, context)}, 0.0f);
        this.LLIZLLLIL = (Vibrator) C786410Ut5.H2(context, "vibrator");
    }

    private void setLinePaintShadowRadius(float f) {
        this.LLILLL.setShadowLayer(f * 10.0f, 0.0f, 0.0f, -7829368);
    }

    @Override // X.InterfaceC1453510nvZ
    public final float LIZ(float f) {
        if (Math.abs(f - 0.0f) < 0.01f) {
            return 0.0f;
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 0.01f) {
            return 90.0f;
        }
        if (Math.abs(f - 45.0f) < 0.01f) {
            return 45.0f;
        }
        if (Math.abs(f - (-45.0f)) < 0.01f) {
            return -45.0f;
        }
        return f;
    }

    @Override // X.InterfaceC1453510nvZ
    public final RectF LIZLLL(RectF rectF) {
        float f;
        this.LLJJIII--;
        float fLIZJ = C12ES.LIZJ(5.0f, getContext());
        float f2 = rectF.left;
        RectF rectF2 = this.LL;
        float f3 = rectF2.left;
        float f4 = 0.0f;
        if (f2 < f3) {
            f = (f3 - f2) + fLIZJ;
        } else {
            float f5 = rectF.right;
            float f6 = rectF2.right;
            if (f5 > f6) {
                f = (f6 - f5) - fLIZJ;
            } else {
                f = 0.0f;
            }
        }
        float f7 = rectF.top;
        float f8 = rectF2.top;
        if (f7 < f8) {
            f4 = (f8 - f7) + fLIZJ;
        } else {
            float f9 = rectF.bottom;
            float f10 = rectF2.bottom;
            if (f9 > f10) {
                f4 = (f10 - f9) - fLIZJ;
            }
        }
        RectF rectF3 = new RectF(rectF);
        rectF3.offset(f, f4);
        if (!this.LL.contains(rectF3) && this.LLJJIII >= 0) {
            RectF rectF4 = new RectF(rectF3);
            float fCenterX = rectF4.centerX();
            float fCenterY = rectF4.centerY();
            rectF4.left *= 0.9f;
            rectF4.right *= 0.9f;
            rectF4.top *= 0.9f;
            rectF4.bottom *= 0.9f;
            rectF4.offsetTo(fCenterX - (rectF4.width() / 2.0f), fCenterY - (rectF4.height() / 2.0f));
            return LIZLLL(rectF4);
        }
        this.LLJJIII = 100;
        return rectF3;
    }

    public final void LJI(boolean z) {
        if (z) {
            this.LLJILJILJ |= 64;
        } else {
            this.LLJILJILJ &= -65;
        }
        invalidate();
    }

    public final void LJII(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 8) != 8) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 8;
        } else {
            this.LLJILJILJ &= -9;
        }
        postInvalidate();
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 32) != 32) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 32;
        } else {
            this.LLJILJILJ &= -33;
        }
        postInvalidate();
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            this.LLJILJILJ |= 256;
        } else {
            this.LLJILJILJ &= -257;
        }
        invalidate();
    }

    public final void LJIIJ(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 2) != 2) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 2;
        } else {
            this.LLJILJILJ &= -3;
        }
        postInvalidate();
    }

    public final void LJIIJJI(boolean z) {
        if (z) {
            this.LLJILJILJ |= 128;
        } else {
            this.LLJILJILJ &= -129;
        }
        invalidate();
    }

    public final void LJIIL(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 1) != 1) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 1;
        } else {
            this.LLJILJILJ &= -2;
        }
        postInvalidate();
    }

    public final void LJIILIIL(boolean z) {
        if (z) {
            this.LLJILJILJ |= 512;
        } else {
            this.LLJILJILJ &= -513;
        }
        invalidate();
    }

    public final void LJIILJJIL(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 4) != 4) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 4;
        } else {
            this.LLJILJILJ &= -5;
        }
        postInvalidate();
    }

    public final void LJIILL(boolean z) {
        if (z) {
            if ((this.LLJILJILJ & 16) != 16) {
                LJIILLIIL();
            }
            this.LLJILJILJ |= 16;
        } else {
            this.LLJILJILJ &= -17;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        RectF rectF;
        RectF rectF2;
        super.onDraw(canvas);
        this.LLILLL.setPathEffect(null);
        this.LLILLL.setAlpha(255);
        setLinePaintShadowRadius(1.0f);
        if ((this.LLJILJILJ & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LLILLL.setAlpha((int) (this.LLJ * 255.0f));
            float f = this.LLJ;
            if (f > 0.5d) {
                setLinePaintShadowRadius(f);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            RectF rectF3 = this.LL;
            if (rectF3 != null) {
                canvas.drawLine(0.0f, rectF3.top, getWidth(), this.LL.top, this.LLILLL);
            }
        }
        if ((this.LLJILJILJ & 256) == 256) {
            this.LLILLL.setAlpha((int) (this.LLJI * 255.0f));
            float f2 = this.LLJI;
            if (f2 > 0.5d) {
                setLinePaintShadowRadius(f2);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            float f3 = this.LL.left;
            canvas.drawLine(f3, 0.0f, f3, getHeight(), this.LLILLL);
        }
        if ((this.LLJILJILJ & 128) == 128) {
            this.LLILLL.setAlpha((int) (this.LLJIJIL * 255.0f));
            float f4 = this.LLJIJIL;
            if (f4 > 0.5d) {
                setLinePaintShadowRadius(f4);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            float f5 = this.LL.right;
            canvas.drawLine(f5, 0.0f, f5, getHeight(), this.LLILLL);
        }
        if ((this.LLJILJILJ & 64) == 64) {
            this.LLILLL.setAlpha((int) (this.LLJILJIL * 255.0f));
            float f6 = this.LLJILJIL;
            if (f6 > 0.5d) {
                setLinePaintShadowRadius(f6);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            canvas.drawLine(0.0f, this.LL.bottom, getWidth(), this.LL.bottom, this.LLILLL);
        }
        this.LLILLL.setAlpha(255);
        if ((this.LLJILJILJ & 32) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            canvas.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, this.LLILLL);
        }
        if ((this.LLJILJILJ & 16) == 16) {
            canvas.drawLine(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), this.LLILLL);
        }
        this.LLILLL.setPathEffect(this.LLILZ);
        if ((this.LLJILJILJ & 8) == 8 && (rectF2 = this.LLIZ) != null) {
            canvas.drawLine(0.0f, rectF2.centerY(), getWidth(), this.LLIZ.centerY(), this.LLILLL);
        }
        if ((this.LLJILJILJ & 4) == 4 && (rectF = this.LLIZ) != null) {
            canvas.drawLine(rectF.centerX(), 0.0f, this.LLIZ.centerX(), getHeight(), this.LLILLL);
        }
        if ((this.LLJILJILJ & 2) == 2 && this.LLIZ != null) {
            canvas.drawLine(0.0f, getHeight() - ((getHeight() - this.LLIZ.centerY()) + this.LLIZ.centerX()), this.LLIZ.centerX() + (getHeight() - this.LLIZ.centerY()), getHeight(), this.LLILLL);
        }
        if ((this.LLJILJILJ & 1) == 1 && this.LLIZ != null) {
            canvas.drawLine(getWidth(), getHeight() - ((getWidth() - this.LLIZ.centerX()) + (getHeight() - this.LLIZ.centerY())), getWidth() - ((getWidth() - this.LLIZ.centerX()) + (getHeight() - this.LLIZ.centerY())), getHeight(), this.LLILLL);
        }
    }

    public void setDeltaX(int i) {
        this.LLILZLL = i;
    }

    @Override // X.InterfaceC1453510nvZ
    public void setEnableFakeFeedView(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    @Override // X.InterfaceC1453510nvZ
    public void setEnableStoryFakeFeedView(boolean z) {
        this.LLJJIJIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0264  */
    @Override // X.InterfaceC1453510nvZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(android.graphics.PointF[] r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1697840uHe.LIZIZ(android.graphics.PointF[], boolean, boolean):int");
    }

    @Override // X.InterfaceC1453510nvZ
    public final PointF LIZJ(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return new PointF(0.0f, 0.0f);
        }
        RectF rectFLIZIZ = C0GTU.LIZIZ(pointFArr);
        rectFLIZIZ.offset(this.LLILZLL, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (Math.abs(((Math.abs(rectFLIZIZ.bottom - rectFLIZIZ.top) / 2.0f) + rectFLIZIZ.top) - (getHeight() / 2.0f)) < 1.0f) {
            float f3 = rectFLIZIZ.bottom;
            float f4 = rectFLIZIZ.top;
            pointF.y = (getHeight() / 2.0f) - (((f3 - f4) / 2.0f) + f4);
        }
        if (Math.abs(((Math.abs(rectFLIZIZ.right - rectFLIZIZ.left) / 2.0f) + rectFLIZIZ.left) - (getWidth() / 2.0f)) < 1.0f) {
            float f5 = rectFLIZIZ.right;
            float f6 = rectFLIZIZ.left;
            pointF.x = (getWidth() / 2.0f) - (((f5 - f6) / 2.0f) + f6);
        }
        return pointF;
    }
}
