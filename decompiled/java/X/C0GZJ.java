package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GZJ extends SmartImageView {
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final Path LLJILJIL;
    public final Paint LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public Paint LLJJI;

    public final Paint getCustomBGPaint() {
        return this.LLJJI;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.LLJILJIL.reset();
        Path path = this.LLJILJIL;
        float f = this.LLJILLL;
        path.reset();
        if (this.LLJJ) {
            setRadius((Math.max(getWidth(), getHeight()) / 2.0f) - f);
        }
        path.moveTo((getWidth() - this.LLJIJIL) - f, f);
        path.arcTo((getWidth() - (this.LLJIJIL * 2.0f)) - f, f, getWidth() - f, (this.LLJIJIL * 2.0f) + f, 270.0f, 90.0f, false);
        path.lineTo(getWidth() - f, (getHeight() - this.LLJI) - f);
        float f2 = 2;
        path.arcTo((getWidth() - (this.LLJI * 2.0f)) - f, (getHeight() - (this.LLJI * f2)) - f, getWidth() - f, getHeight() - f, 0.0f, 90.0f, false);
        path.lineTo(this.LLIZLLLIL + f, getHeight() - f);
        float height = getHeight();
        float f3 = f2 * this.LLIZLLLIL;
        path.arcTo(f, (height - f3) - f, f3 + f, getHeight() - f, 90.0f, 90.0f, false);
        path.lineTo(f, this.LLJ + f);
        float f4 = (this.LLJ * 2.0f) + f;
        path.arcTo(f, f, f4, f4, 180.0f, 90.0f, false);
        path.close();
        canvas.clipPath(this.LLJILJIL);
        Paint paint = this.LLJJI;
        if (paint != null) {
            canvas.drawPath(this.LLJILJIL, paint);
        }
        canvas.drawPath(this.LLJILJIL, this.LLJILJILJ);
        super.draw(canvas);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCustomBGPaint(Paint paint) {
        this.LLJJI = paint;
    }

    public final void setInsets(float f) {
        this.LLJILLL = f;
        invalidate();
    }

    public final void setRadius(float f) {
        this.LLJ = f;
        this.LLJIJIL = f;
        this.LLIZLLLIL = f;
        this.LLJI = f;
    }

    public C0GZJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0GZJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJIL = new Path();
        Paint paint = new Paint();
        this.LLJILJILJ = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                try {
                    typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.RoundImageView);
                    this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_bottomLeftRadius, getResources().getDimension(R.dimen.mu));
                    this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_topLeftRadius, getResources().getDimension(R.dimen.mu));
                    this.LLJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_bottomRightRadius, getResources().getDimension(R.dimen.mu));
                    this.LLJIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.RoundImageView_topRightRadius, getResources().getDimension(R.dimen.mu));
                    paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.RoundImageView_roundPathColor, 0));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (typedArrayObtainStyledAttributes == null) {
                        return;
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
    }
}
