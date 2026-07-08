package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0GZS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GZS extends RemoteImageView {
    public int LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public Shape LLIZ;
    public Shape LLIZLLLIL;
    public Paint LLJ;
    public Paint LLJI;
    public Paint LLJIJIL;
    public Bitmap LLJILJIL;
    public PorterDuffXfermode LLJILJILJ;

    public final void LJI() {
        if (this.LLILZIL <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        Bitmap bitmap = this.LLJILJIL;
        if (bitmap != null) {
            C786410Ut5.LJJJJ(bitmap);
            this.LLJILJIL = null;
        }
        this.LLJILJIL = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.LLJILJIL);
        Paint paint = new Paint(1);
        paint.setColor(this.LLILZ);
        canvas.drawRect(new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), paint);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJILJIL == null) {
            LJI();
        }
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.LLJILJIL;
        if (bitmap != null) {
            C786410Ut5.LJJJJ(bitmap);
            this.LLJILJIL = null;
        }
        C20597815iq.LIZ(this);
    }

    public final void LIZLLL(Canvas canvas) {
        Shape shape;
        super.onDraw(canvas);
        if (this.LLILZIL > 0.0f && this.LLIZLLLIL != null && this.LLJILJIL != null) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
            this.LLJI.setXfermode(null);
            canvas.drawBitmap(this.LLJILJIL, 0.0f, 0.0f, this.LLJI);
            float f = this.LLILZIL;
            canvas.translate(f, f);
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            this.LLJI.setXfermode(this.LLJILJILJ);
            this.LLIZLLLIL.draw(canvas, this.LLJI);
            canvas.restoreToCount(iSaveLayer);
        }
        int i = this.LLILLJJLI;
        if ((i != 1 && i != 2) || (shape = this.LLIZ) == null) {
            return;
        }
        shape.draw(canvas, this.LLJ);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZLLL(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setExtension(C0GZT c0gzt) {
        requestLayout();
    }

    public void setShapeMode(int i) {
        LJII(this.LLILLL, i);
    }

    public void setShapeRadius(float f) {
        LJII(f, this.LLILLJJLI);
    }

    public void setStrokeColor(int i) {
        LJIIIIZZ(this.LLILZIL, i);
    }

    public void setStrokeWidth(float f) {
        LJIIIIZZ(f, this.LLILZ);
    }

    public C0GZS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = 637534208;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ShapedRemoteImageView);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapedRemoteImageView_shape_mode, 0);
            this.LLILLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShapedRemoteImageView_round_radius, 0.0f);
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShapedRemoteImageView_stroke_width, 0.0f);
            this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.ShapedRemoteImageView_stroke_color, this.LLILZ);
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.LLJ = paint;
        paint.setFilterBitmap(true);
        this.LLJ.setColor(-16777216);
        this.LLJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint2 = new Paint(1);
        this.LLJI = paint2;
        paint2.setFilterBitmap(true);
        this.LLJI.setColor(-16777216);
        Paint paint3 = new Paint(1);
        this.LLJIJIL = paint3;
        paint3.setFilterBitmap(true);
        this.LLJIJIL.setColor(-16777216);
        this.LLJIJIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        new Path();
    }

    public final void LJII(float f, int i) {
        boolean z;
        if (this.LLILLJJLI == i && this.LLILLL == f) {
            z = false;
        } else {
            z = true;
        }
        this.LLILZLL = z;
        if (z) {
            this.LLILLJJLI = i;
            this.LLILLL = f;
            this.LLIZ = null;
            this.LLIZLLLIL = null;
            requestLayout();
        }
    }

    public final void LJIIIIZZ(float f, int i) {
        float f2 = this.LLILZIL;
        if (f2 <= 0.0f) {
            return;
        }
        if (f2 != f) {
            this.LLILZIL = f;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Shape shape = this.LLIZLLLIL;
            float f3 = this.LLILZIL * 2.0f;
            shape.resize(measuredWidth - f3, measuredHeight - f3);
            postInvalidate();
        }
        if (this.LLILZ != i) {
            this.LLILZ = i;
            LJI();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.LLILZLL) {
            this.LLILZLL = false;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.LLILLJJLI == 2) {
                this.LLILLL = Math.min(measuredWidth, measuredHeight) / 2.0f;
            }
            if (this.LLIZ == null || this.LLILLL != 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, this.LLILLL);
                this.LLIZ = new RoundRectShape(fArr, null, null);
                this.LLIZLLLIL = new RoundRectShape(fArr, null, null);
            }
            float f = measuredWidth;
            float f2 = measuredHeight;
            this.LLIZ.resize(f, f2);
            Shape shape = this.LLIZLLLIL;
            float f3 = this.LLILZIL * 2.0f;
            shape.resize(f - f3, f2 - f3);
            LJI();
        }
    }
}
