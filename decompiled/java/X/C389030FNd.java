package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389030FNd extends AppCompatImageView {
    public final Paint LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public final Path LLIZ;
    public final Context LLIZLLLIL;
    public Bitmap LLJ;
    public float LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public C1361400lX0 LLJILJILJ;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C389030FNd(Context context) {
        this(context, null, 0);
    }

    public final void LIZJ(Canvas canvas) {
        if (this.LLJ == null) {
            return;
        }
        canvas.save();
        Path path = this.LLIZ;
        float f = this.LLJILJIL;
        float f2 = 2;
        float width = getWidth() - (this.LLJILJIL / f2);
        float height = getHeight() - (this.LLJILJIL / f2);
        float f3 = this.LLJI;
        path.addRoundRect(f / f2, f / f2, width, height, f3, f3, Path.Direction.CW);
        canvas.clipPath(this.LLIZ);
        super.onDraw(canvas);
        canvas.restore();
        Paint paint = this.LL;
        paint.setColor(this.LLJIJIL);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LLJILJIL);
        Path path2 = this.LLIZ;
        float f4 = this.LLJILJIL;
        float width2 = getWidth() - (this.LLJILJIL / f2);
        float height2 = getHeight() - (this.LLJILJIL / f2);
        float f5 = this.LLJI;
        path2.addRoundRect(f4 / f2, f4 / f2, width2, height2, f5, f5, Path.Direction.CW);
        canvas.drawPath(this.LLIZ, this.LL);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCornerRadiusDp(float f) {
        this.LLJI = C12ES.LIZJ(f, this.LLIZLLLIL);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.LLJ = bitmap;
        super.setImageBitmap(bitmap);
    }

    public final void setStrokeColor(int i) {
        int iIntValue;
        Integer numLIZJ;
        C1361400lX0 c1361400lX0 = this.LLJILJILJ;
        if (c1361400lX0 != null && (numLIZJ = C1308910kAL.LIZJ(i, c1361400lX0)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJIJIL = iIntValue;
        invalidate();
    }

    public final void setStrokeWidthDp(float f) {
        this.LLJILJIL = C12ES.LIZJ(f, this.LLIZLLLIL);
        invalidate();
    }

    public C389030FNd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(long j, long j2) {
        float f = j2 / j;
        this.LLILZLL = f;
        if (f > 0.75d) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            float f2 = this.LLILLJJLI;
            layoutParams.width = (int) f2;
            layoutParams.height = (int) Math.min(this.LLILLL, this.LLILZLL * f2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            setMaxHeight((int) this.LLILLL);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        float f3 = this.LLILZ;
        layoutParams2.width = (int) f3;
        layoutParams2.height = (int) Math.max(this.LLILZLL * f3, this.LLILZIL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        setMinimumHeight((int) this.LLILZIL);
    }

    public C389030FNd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
        this.LLILLJJLI = C339190DRl.LIZ(88);
        float f = 140;
        this.LLILLL = C339190DRl.LIZ(f);
        this.LLILZ = C339190DRl.LIZ(f);
        this.LLILZIL = C339190DRl.LIZ(78);
        this.LLILZLL = 1.0f;
        this.LLIZ = new Path();
        this.LLJI = C12ES.LIZJ(2.0f, this.LLIZLLLIL);
        Context context2 = this.LLIZLLLIL;
        this.LLJIJIL = context2 != null ? C960203pA.LIZ(R.attr.eh, context2) : 0;
        this.LLJILJIL = C12ES.LIZJ(1.0f, this.LLIZLLLIL);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLIZLLLIL = context;
        if (context != null) {
            this.LLJILJILJ = new C1361400lX0(context, R.style.y3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZ.reset();
        Path path = this.LLIZ;
        float f = this.LLJILJIL;
        float f2 = 2;
        float width = getWidth() - (this.LLJILJIL / f2);
        float height = getHeight() - (this.LLJILJIL / f2);
        float f3 = this.LLJI;
        path.addRoundRect(f / f2, f / f2, width, height, f3, f3, Path.Direction.CW);
    }
}
