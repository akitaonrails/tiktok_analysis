package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19RF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19RF extends FrameLayout {
    public final boolean LL;
    public Paint LLILLJJLI;
    public boolean LLILLL;
    public C19RH LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C19RH c19rh;
        Paint paint;
        C19RH c19rh2 = this.LLILZ;
        if (c19rh2 != null) {
            c19rh2.LIZ(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.LLILLL && this.LL && (c19rh = this.LLILZ) != null && (paint = this.LLILLJJLI) != null) {
            c19rh.LIZIZ.set(0.0f, 0.0f, c19rh.LIZ.getWidth(), c19rh.LIZ.getHeight());
            c19rh.LIZJ.reset();
            c19rh.LIZJ.addRoundRect(c19rh.LIZIZ, c19rh.LIZLLL, Path.Direction.CW);
            canvas.drawPath(c19rh.LIZJ, paint);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C19RH c19rh = this.LLILZ;
        if (c19rh != null) {
            c19rh.LIZ(canvas);
        }
        super.draw(canvas);
    }

    public final void setRadius(float f) {
        C19RH c19rh = new C19RH(this) { // from class: X.19RI
            {
                super(this);
            }
        };
        this.LLILZ = c19rh;
        float[] fArr = {f, f, f, f, f, f, f, f};
        c19rh.LIZLLL = fArr;
        setOutlineProvider(new C0IDB(fArr, 3));
        setClipToOutline(true);
        invalidate();
    }

    public C19RF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.19RG, X.19RH] */
    public C19RF(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        this.LL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadiusLayout, i, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusLeftTop, dimension);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusRightTop, dimension);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusLeftBottom, dimension);
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(R$styleable.RadiusLayout_cornerRadiusRightBottom, dimension);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.RadiusLayout_radiusStrokeColor, -16777216);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeWidth, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeDashWidth, 0);
        int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RadiusLayout_radiusStrokeDashGapWidth, 0);
        if (dimension2 == dimension3) {
            z = true;
        } else {
            z = false;
        }
        if (z && dimension2 == dimension4 && dimension4 == dimension5) {
            setRadius(dimension2);
        } else {
            float[] fArr = new float[8];
            if (C426750GoL.LIZLLL(getContext())) {
                fArr[0] = dimension3;
                fArr[1] = dimension3;
                fArr[2] = dimension2;
                fArr[3] = dimension2;
                fArr[4] = dimension4;
                fArr[5] = dimension4;
                fArr[6] = dimension5;
                fArr[7] = dimension5;
            } else {
                fArr[0] = dimension2;
                fArr[1] = dimension2;
                fArr[2] = dimension3;
                fArr[3] = dimension3;
                fArr[4] = dimension5;
                fArr[5] = dimension5;
                fArr[6] = dimension4;
                fArr[7] = dimension4;
            }
            ?? r0 = new C19RH(this) { // from class: X.19RG
                {
                    super(this);
                }

                @Override // X.C19RH
                public final void LIZ(Canvas canvas) {
                    this.LIZIZ.set(0.0f, 0.0f, this.LIZ.getWidth(), this.LIZ.getHeight());
                    this.LIZJ.reset();
                    this.LIZJ.addRoundRect(this.LIZIZ, this.LIZLLL, Path.Direction.CW);
                    canvas.clipPath(this.LIZJ);
                }

                public final void LIZIZ(float[] fArr2) {
                    this.LIZLLL = fArr2;
                    this.LIZ.setOutlineProvider(null);
                    this.LIZ.setClipToOutline(false);
                }
            };
            this.LLILZ = r0;
            r0.LIZIZ(fArr);
            invalidate();
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        if (dimensionPixelOffset2 != 0 && dimensionPixelOffset3 != 0) {
            paint.setPathEffect(new DashPathEffect(new float[]{dimensionPixelOffset2, dimensionPixelOffset3}, 0.0f));
        }
        paint.setStrokeWidth(dimensionPixelOffset);
        this.LLILLJJLI = paint;
        this.LLILLL = (((-16777216) & color) == 0 || dimensionPixelOffset == 0) ? false : true;
        invalidate();
        typedArrayObtainStyledAttributes.recycle();
    }
}
