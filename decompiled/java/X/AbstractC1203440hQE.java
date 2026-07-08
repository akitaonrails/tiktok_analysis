package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1203440hQE extends View {
    public final TuxIconDrawable LL;
    public final PorterDuffXfermode LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    public AbstractC1203440hQE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Object) null);
    }

    public void LIZ(float f) {
    }

    public void LIZIZ(float f) {
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.LLIZ ? super.getPaddingLeft() - ((int) (this.LLILZ * 0.0625f)) : super.getPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.LLIZ ? super.getPaddingRight() - ((int) (this.LLILZ * 0.0625f)) : super.getPaddingRight();
    }

    private final int getStartOffset() {
        return getLayoutDirection() == 1 ? (getWidth() - getPaddingRight()) - this.LLILZ : getPaddingLeft();
    }

    public final boolean getHasOffset() {
        return this.LLIZ;
    }

    public final boolean getRatingEnableTouch() {
        return this.LLILZLL;
    }

    public final int getRatingSize() {
        return this.LLILZ;
    }

    public final int getRatingSpacing() {
        return this.LLILZIL;
    }

    public final float getRatingValue() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Pair pair;
        int paddingTop = getPaddingTop();
        int i = this.LLILZ + paddingTop;
        int startOffset = getStartOffset();
        this.LL.LJFF(this.LLJ);
        for (int i2 = 0; i2 < 5; i2++) {
            this.LL.setBounds(startOffset, paddingTop, this.LLILZ + startOffset, i);
            this.LL.draw(canvas);
            if (getLayoutDirection() == 1) {
                startOffset = (startOffset - this.LLILZ) - this.LLILZIL;
            } else {
                startOffset = startOffset + this.LLILZ + this.LLILZIL;
            }
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLL, 31);
        this.LLILLL.setXfermode(this.LLILLJJLI);
        int i3 = (int) this.LLIZLLLIL;
        int startOffset2 = getStartOffset();
        this.LL.LJFF(this.LLJI);
        for (int i4 = 0; i4 < i3; i4++) {
            this.LL.setBounds(startOffset2, paddingTop, this.LLILZ + startOffset2, i);
            this.LL.draw(canvas);
            if (getLayoutDirection() == 1) {
                startOffset2 = (startOffset2 - this.LLILZ) - this.LLILZIL;
            } else {
                startOffset2 = startOffset2 + this.LLILZ + this.LLILZIL;
            }
        }
        double d = ((double) (this.LLIZLLLIL - i3)) + 0.05d;
        if (!this.LLILZLL && d > 0.0d && d >= 0.1d) {
            double d2 = (((double) ((int) (d / 0.1d))) * 0.07d) + 0.15d;
            if (getLayoutDirection() == 1) {
                pair = new Pair(Integer.valueOf(((int) (((double) this.LLILZ) * (((double) 1) - d2))) + startOffset2), Integer.valueOf(this.LLILZ + startOffset2));
            } else {
                pair = new Pair(Integer.valueOf(startOffset2), Integer.valueOf(((int) (((double) this.LLILZ) * d2)) + startOffset2));
            }
            canvas.clipRect(((Number) pair.getFirst()).intValue(), paddingTop, ((Number) pair.getSecond()).intValue(), i);
            this.LL.setBounds(startOffset2, paddingTop, this.LLILZ + startOffset2, i);
            this.LL.draw(canvas);
        }
        this.LLILLL.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZLL && isEnabled()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        LIZJ(motionEvent.getX(), false);
                        return true;
                    }
                } else {
                    LIZIZ(this.LLIZLLLIL);
                    return true;
                }
            } else {
                LIZJ(motionEvent.getX(), true);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActiveColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLJI = numLIZJ.intValue();
            invalidate();
        }
    }

    public final void setActiveColorInt(int i) {
        this.LLJI = i;
        invalidate();
    }

    public final void setHasOffset(boolean z) {
        this.LLIZ = z;
    }

    public final void setInactiveColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            this.LLJ = numLIZJ.intValue();
            invalidate();
        }
    }

    public final void setInactiveColorInt(int i) {
        this.LLJ = i;
        invalidate();
    }

    public final void setRatingEnableTouch(boolean z) {
        this.LLILZLL = z;
    }

    public final void setRatingSize(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            this.LL.LJII(i);
            this.LL.LJ(this.LLILZ);
        }
    }

    public final void setRatingSpacing(int i) {
        this.LLILZIL = i;
    }

    public final void setRatingValue(float f) {
        if (this.LLIZLLLIL != f) {
            this.LLIZLLLIL = f;
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(float r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.getLayoutDirection()
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L82
            r0 = 1
        L9:
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r0 == 0) goto L53
            int r1 = r5.getWidth()
            int r0 = r5.getPaddingLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5.getPaddingRight()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L3e
            int r1 = r5.getWidth()
            int r0 = r5.getPaddingLeft()
            int r1 = r1 - r0
            float r2 = (float) r1
            float r2 = r2 - r6
            int r1 = r5.LLILZIL
            int r0 = r1 / 2
            float r0 = (float) r0
            float r2 = r2 + r0
            int r0 = r5.LLILZ
            int r0 = r0 + r1
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = (float) r4
            float r2 = r2 + r0
            int r0 = (int) r2
        L3d:
            float r2 = (float) r0
        L3e:
            float r0 = r5.LLIZLLLIL
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L84
            if (r7 == 0) goto L52
            X.0ZDN r1 = new X.0ZDN
            android.content.Context r0 = r5.getContext()
            r1.<init>(r0)
            r1.LIZ(r3)
        L52:
            return
        L53:
            int r0 = r5.getPaddingLeft()
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7f
            int r1 = r5.getWidth()
            int r0 = r5.getPaddingRight()
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L3e
            int r0 = r5.getPaddingLeft()
            float r0 = (float) r0
            float r6 = r6 - r0
            int r1 = r5.LLILZIL
            int r0 = r1 / 2
            float r0 = (float) r0
            float r6 = r6 + r0
            int r0 = r5.LLILZ
            int r0 = r0 + r1
            float r0 = (float) r0
            float r6 = r6 / r0
            float r0 = (float) r4
            float r6 = r6 + r0
            int r0 = (int) r6
            goto L3d
        L7f:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3e
        L82:
            r0 = 0
            goto L9
        L84:
            X.0ZDN r1 = new X.0ZDN
            android.content.Context r0 = r5.getContext()
            r1.<init>(r0)
            r1.LIZ(r3)
            r5.setRatingValue(r2)
            r5.LIZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1203440hQE.LIZJ(float, boolean):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.LLILZ;
        int i4 = this.LLILZIL;
        setMeasuredDimension((((i3 + i4) * 5) - i4) + getPaddingLeft() + getPaddingRight(), this.LLILZ + getPaddingTop() + getPaddingBottom());
    }

    public AbstractC1203440hQE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxRating, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxRating__tux_ratingIcon, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxRating_tux_ratingInactiveColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxRating_tux_ratingActiveColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        this.LL = c419910GdJ.LIZ(context);
    }

    public /* synthetic */ AbstractC1203440hQE(Context context, AttributeSet attributeSet, Object obj) {
        this(context, attributeSet, R.attr.yl);
    }
}
