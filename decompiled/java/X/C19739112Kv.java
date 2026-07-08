package X;

import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19739112Kv extends View {
    public Paint LL;
    public boolean LLILLJJLI;
    public ValueAnimator LLILLL;
    public final C1910890zpH LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public RectF LLIZLLLIL;
    public Bitmap LLJ;
    public float LLJI;
    public Context LLJIJIL;
    public Integer LLJILJIL;
    public int LLJILJILJ;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        RectF rectF = this.LLIZLLLIL;
        if (rectF != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int color;
        if (this.LLIZLLLIL == null) {
            return;
        }
        if (this.LLJ == null) {
            Integer num = this.LLJILJIL;
            if (num != null) {
                color = num.intValue();
            } else {
                Context context = this.LLJIJIL;
                if (context != null) {
                    color = C960203pA.LIZ(R.attr.bx, context);
                } else {
                    color = ColorProtector.parseColor("#d9161823");
                }
            }
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.LLIZLLLIL;
            boolean z = true;
            if (this.LLILZLL != 1) {
                z = false;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawRect(0.0f, 0.0f, width, height, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
            }
            this.LLJ = bitmapCreateBitmap;
        }
        canvas.drawBitmap(this.LLJ, 0.0f, 0.0f, this.LL);
    }

    public void setDark(boolean z) {
        if (Math.abs(this.LLJI - 0.85f) >= Float.MIN_NORMAL && !this.LLILLJJLI) {
            ValueAnimator valueAnimator = this.LLILLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.LLILLL = null;
            }
            if (!z) {
                this.LLILLJJLI = false;
                this.LLJI = 0.85f;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(1.0f);
                invalidate();
                return;
            }
            this.LLILLJJLI = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
            this.LLILLL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setEvaluator(new FloatEvaluator());
            this.LLILLL.setDuration(300L);
            this.LLILLL.addUpdateListener(new AUListenerS277S0100000_29(this, 16));
            this.LLILLL.addListener(new ALAdapterS24S0100000_29(this, 8));
            this.LLILLL.setStartDelay(300L);
            this.LLILLL.start();
        }
    }

    public void setTopOffset(int i) {
        this.LLJILJILJ = i;
    }

    public C19739112Kv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.EDIT_PROFILE);
        this.LLILZLL = 0;
        this.LLIZ = 0.5625f;
        this.LLJILJIL = null;
        this.LLJILJILJ = -1;
        this.LLJIJIL = context;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        this.LLILZIL = (int) C12ES.LIZJ(16.0f, context);
        this.LLJI = 0.5f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        C1910890zpH c1910890zpH = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewWidth: ");
        sbLIZ.append(width);
        sbLIZ.append(", viewHeight: ");
        sbLIZ.append(height);
        c1910890zpH.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ));
        if (width <= height) {
            height = width;
        }
        int i5 = height - (this.LLILZIL * 2);
        int i6 = (int) (i5 * this.LLIZ);
        C1910890zpH c1910890zpH2 = this.LLILZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("offset: ");
        sbLIZ2.append(this.LLILZIL);
        sbLIZ2.append(", adjusted width: ");
        sbLIZ2.append(i5);
        sbLIZ2.append(", height: ");
        sbLIZ2.append(i6);
        c1910890zpH2.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ2));
        int iMax = this.LLJILJILJ;
        if (iMax < 0) {
            iMax = Math.max(0, (getHeight() - i6) / 2);
        }
        int i7 = this.LLILZIL;
        if ((i7 * 2) + i5 < width) {
            i7 = (width - i5) / 2;
        }
        C1910890zpH c1910890zpH3 = this.LLILZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("topOffset: ");
        sbLIZ3.append(iMax);
        sbLIZ3.append(", widthOffset: ");
        sbLIZ3.append(i7);
        c1910890zpH3.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLIZLLLIL = new RectF(i7, iMax, i7 + i5, iMax + i6);
        C1910890zpH c1910890zpH4 = this.LLILZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("mVisibleRect - left: ");
        sbLIZ4.append(this.LLIZLLLIL.left);
        sbLIZ4.append(", top: ");
        sbLIZ4.append(this.LLIZLLLIL.top);
        sbLIZ4.append(", right: ");
        sbLIZ4.append(this.LLIZLLLIL.right);
        sbLIZ4.append(", bottom: ");
        sbLIZ4.append(this.LLIZLLLIL.bottom);
        c1910890zpH4.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ4));
        Bitmap bitmap = this.LLJ;
        if (bitmap != null) {
            C786410Ut5.LJJJJ(bitmap);
            this.LLJ = null;
        }
    }
}
