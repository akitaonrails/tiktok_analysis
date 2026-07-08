package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19735712Jn extends View {
    public static final int[] LLJJIJIL = {R.attr.fpq};
    public static final C19735812Jo LLJJJ;
    public Drawable LL;
    public float LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public Rect LLILZLL;
    public final RectF LLIZ;
    public boolean LLIZLLLIL;
    public ColorStateList LLJ;
    public ObjectAnimator LLJI;
    public final Paint LLJIJIL;
    public final int LLJILJIL;
    public InterfaceC19734812Je LLJILJILJ;
    public final int LLJILLL;
    public final VelocityTracker LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.12Jo] */
    static {
        final Class<Float> cls = Float.class;
        LLJJJ = new Property<C19735712Jn, Float>(cls) { // from class: X.12Jo
            @Override // android.util.Property
            public final Float get(C19735712Jn c19735712Jn) {
                return Float.valueOf(c19735712Jn.LLILLJJLI);
            }

            @Override // android.util.Property
            public final void set(C19735712Jn c19735712Jn, Float f) {
                c19735712Jn.setThumbPosition(f.floatValue());
            }
        };
    }

    private boolean getTargetCheckedState() {
        return this.LLILLJJLI > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.LLILLJJLI : this.LLILLJJLI) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.LLILLL;
    }

    public Drawable getThumbDrawable() {
        return this.LL;
    }

    public Rect getThumbRect() {
        return this.LLILZLL;
    }

    public int getTrackPadding() {
        return this.LLILZ;
    }

    public int getTrackRadius() {
        return this.LLILZIL;
    }

    public ColorStateList getTrackTintList() {
        return this.LLJ;
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.LLIZLLLIL) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, LLJJIJIL);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.LLJ;
        if (colorStateList != null) {
            this.LLJIJIL.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        RectF rectF = this.LLIZ;
        rectF.left = 0.0f;
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.LLIZ;
        rectF2.top = this.LLILZ;
        rectF2.bottom = getMeasuredHeight() - this.LLILZ;
        RectF rectF3 = this.LLIZ;
        int i = this.LLILZIL;
        canvas.drawRoundRect(rectF3, i, i, this.LLJIJIL);
        this.LLILZLL.left = getThumbOffset();
        Rect rect = this.LLILZLL;
        rect.right = rect.left + this.LLILLL;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(rect);
            this.LL.setState(drawableState);
            this.LL.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19735712Jn.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            InterfaceC19734812Je interfaceC19734812Je = this.LLJILJILJ;
            if (interfaceC19734812Je != null) {
                interfaceC19734812Je.LIZ(z);
            }
        }
        refreshDrawableState();
        float f = 1.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (!z) {
                f = 0.0f;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, LLJJJ, f);
            this.LLJI = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(250L);
            this.LLJI.setAutoCancel(true);
            C786410Ut5.Pd(this.LLJI);
            return;
        }
        ObjectAnimator objectAnimator = this.LLJI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    public void setEnableTouch(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setOnCheckedChangeListener(InterfaceC19734812Je interfaceC19734812Je) {
        this.LLJILJILJ = interfaceC19734812Je;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.LL = drawable;
    }

    public void setThumbPosition(float f) {
        this.LLILLJJLI = f;
        invalidate();
    }

    public void setThumbRect(Rect rect) {
        this.LLILZLL = rect;
    }

    public void setTrackPadding(int i) {
        this.LLILZ = i;
    }

    public void setTrackRadius(int i) {
        this.LLILZIL = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.LLJ = colorStateList;
    }

    public C19735712Jn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LLJIJIL = paint;
        this.LLJJ = VelocityTracker.obtain();
        this.LLJJIJIIJIL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVSwitchView);
        this.LL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.AVSwitchView_beauty_thumb);
        this.LLJ = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.AVSwitchView_beauty_track_tint);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.AVSwitchView_beauty_track_padding, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.AVSwitchView_beauty_track_radius, 0);
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        this.LLILZLL = new Rect();
        this.LLIZ = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLJILJIL = viewConfiguration.getScaledTouchSlop();
        this.LLJILLL = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.LL;
        if (drawable == null) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.LL.getIntrinsicHeight();
        Rect rect = this.LLILZLL;
        rect.left = 0;
        rect.top = 0;
        rect.right = intrinsicWidth;
        this.LLILLL = intrinsicWidth;
        rect.bottom = intrinsicHeight;
        this.LL.setBounds(rect);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
        } else {
            setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        }
    }
}
