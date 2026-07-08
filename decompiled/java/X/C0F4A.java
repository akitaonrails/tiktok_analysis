package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0F4A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4A extends FrameLayout {
    public final SmartImageView LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public final C0F48 LLILZIL;
    public final RectF LLILZLL;
    public int LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public Function0<Unit> LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public C0F45 LLJJJIL;
    public boolean LLJJJJ;

    public final void LIZJ() {
        this.LLJJJ = false;
        LJII(72.0f, 76.0f);
        C786410Ut5.LLFF(0, this.LL);
        C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
        C786410Ut5.LLLLZLL(this.LLILLL, 0);
        C786410Ut5.LJLLLLLL(0, this.LLILZ);
        C0F48 c0f48 = this.LLILZIL;
        int visibility = c0f48.getVisibility();
        c0f48.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0f48);
    }

    public final void LIZIZ() {
        float f = this.LLJJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(f);
        float fLIZ = this.LLJJIII - C0F4B.LIZ(16.0f, getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fLIZ);
    }

    @Override // android.view.View
    public final boolean performClick() {
        ViewGroup viewGroup;
        super.performClick();
        if (!this.LLJJJ) {
            Function0<Unit> function0 = this.LLIZLLLIL;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return true;
        }
        animate().cancel();
        float fLJFF = LJFF(viewGroup);
        float fLIZLLL = LIZLLL(getY(), viewGroup);
        LIZJ();
        LIZIZ();
        LIZ(fLJFF, fLIZLLL);
        return true;
    }

    public final boolean getHasLoadedTreasureImage() {
        return this.LLJJJJ;
    }

    public C0F4A(Context context) {
        super(context, null, 0);
        this.LLILZLL = new RectF();
        this.LLJJJIL = C0F45.RIGHT;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dnl, this, true);
        setClipChildren(false);
        setClipToPadding(false);
        setClickable(true);
        setFocusable(true);
        setContentDescription(context.getString(2131822364));
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.ofy);
        this.LL = smartImageView;
        View viewFindViewById = findViewById(R.id.ofw);
        this.LLILLJJLI = viewFindViewById;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ofz);
        this.LLILLL = tuxTextView;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dnm, this, false);
        this.LLILZ = viewTd;
        C0F48 c0f48 = new C0F48(context);
        c0f48.setClickable(false);
        c0f48.setFocusable(false);
        c0f48.setImportantForAccessibility(2);
        this.LLILZIL = c0f48;
        viewFindViewById.setLayerType(1, null);
        final float f = 42 * context.getResources().getDisplayMetrics().density;
        final float f2 = 1 * context.getResources().getDisplayMetrics().density;
        final float f3 = 4.356f * context.getResources().getDisplayMetrics().density;
        final float f4 = 1.0f * context.getResources().getDisplayMetrics().density;
        viewFindViewById.setBackground(new Drawable(f, f2, f3, f4) { // from class: X.0F7B
            public static final int[] LJIIJJI = {-8750, -2058, -12090, -4374, -7203, -8750, -2058};
            public static final float[] LJIIL = {0.0f, 0.025f, 0.233f, 0.411f, 0.62f, 0.71f, 1.0f};
            public final float LIZ;
            public final float LIZIZ;
            public final float LIZJ;
            public final RectF LIZLLL = new RectF();
            public final RectF LJ = new RectF();
            public final Path LJFF = new Path();
            public final Matrix LJI = new Matrix();
            public final Paint LJII;
            public final Paint LJIIIIZZ;
            public final Paint LJIIIZ;
            public final Paint LJIIJ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                this.LIZLLL.set(getBounds());
                float f5 = this.LIZIZ / 2.0f;
                this.LIZLLL.inset(f5, f5);
                Paint paint = this.LJII;
                SweepGradient sweepGradient = new SweepGradient(this.LIZLLL.centerX(), this.LIZLLL.centerY(), LJIIJJI, LJIIL);
                this.LJI.reset();
                this.LJI.setRotate(90.0f, this.LIZLLL.centerX(), this.LIZLLL.centerY());
                sweepGradient.setLocalMatrix(this.LJI);
                paint.setShader(sweepGradient);
                float fMin = Math.min(this.LIZ, Math.min(this.LIZLLL.width() / 2.0f, this.LIZLLL.height() / 2.0f));
                this.LJFF.reset();
                this.LJFF.addRoundRect(this.LIZLLL, fMin, fMin, Path.Direction.CW);
                int iSave = canvas.save();
                canvas.clipPath(this.LJFF);
                canvas.drawRoundRect(this.LIZLLL, fMin, fMin, this.LJII);
                Paint paint2 = this.LJIIJ;
                float f6 = this.LIZJ;
                this.LJ.set(this.LIZLLL);
                this.LJ.offset(f6, f6);
                canvas.drawRoundRect(this.LJ, fMin, fMin, paint2);
                Paint paint3 = this.LJIIIZ;
                float f7 = -this.LIZJ;
                this.LJ.set(this.LIZLLL);
                this.LJ.offset(f7, f7);
                canvas.drawRoundRect(this.LJ, fMin, fMin, paint3);
                canvas.restoreToCount(iSave);
                canvas.drawRoundRect(this.LIZLLL, fMin, fMin, this.LJIIIIZZ);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
                this.LJII.setAlpha(i);
                int i2 = (i * 255) / 255;
                this.LJIIIIZZ.setAlpha(i2);
                this.LJIIIZ.setAlpha((i * 61) / 255);
                this.LJIIJ.setAlpha(i2);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJII.setColorFilter(colorFilter);
                this.LJIIIIZZ.setColorFilter(colorFilter);
                this.LJIIIZ.setColorFilter(colorFilter);
                this.LJIIJ.setColorFilter(colorFilter);
            }

            {
                this.LIZ = f;
                this.LIZIZ = f2;
                this.LIZJ = f4;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                this.LJII = paint;
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(-3859);
                paint2.setStrokeWidth(f2);
                this.LJIIIIZZ = paint2;
                Paint paint3 = new Paint(1);
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setColor(1040187391);
                paint3.setStrokeWidth(f3);
                paint3.setMaskFilter(new BlurMaskFilter(f3, BlurMaskFilter.Blur.NORMAL));
                this.LJIIIZ = paint3;
                Paint paint4 = new Paint(1);
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setColor(-12601);
                paint4.setStrokeWidth(f3);
                paint4.setMaskFilter(new BlurMaskFilter(f3, BlurMaskFilter.Blur.NORMAL));
                this.LJIIJ = paint4;
            }
        });
        tuxTextView.setText(context.getString(2131822364));
        tuxTextView.setTextColor(-50350);
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 10.0f, 0.0f, Float.valueOf(10.0f), 0.0f, 0, null, 233);
        tuxTextView.setTypeface(typefaceLIZIZ == null ? tuxTextView.getTypeface() : typefaceLIZIZ);
        addView(viewTd);
        addView(c0f48);
        LJI(60.0f, 60.0f, 0.0f, 16.0f, smartImageView);
        LJI(55.0f, 18.0f, 2.0f, 53.0f, viewFindViewById);
        LJI(55.0f, 18.0f, 2.0f, 53.0f, tuxTextView);
        LJI(18.0f, 18.0f, 54.0f, 0.0f, viewTd);
        LJI(28.0f, 62.0f, 0.0f, 0.0f, c0f48);
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 128), viewTd);
        LIZJ();
        C786410Ut5.W1(this, 8);
    }

    private final void settleAfterDrag(ViewGroup viewGroup) {
        float fLIZ = C0F4B.LIZ(60.0f, getContext());
        float f = this.LLJJI + (fLIZ / 2.0f);
        if (f <= viewGroup.getWidth() * 0.1f) {
            LJ(viewGroup, C0F45.LEFT);
            return;
        }
        if (f >= viewGroup.getWidth() * 0.9f) {
            LJ(viewGroup, C0F45.RIGHT);
        } else if (f < viewGroup.getWidth() / 2.0f) {
            LIZ(C0F4B.LIZ(16.0f, getContext()), LIZLLL(this.LLJJIII, viewGroup));
        } else {
            LIZ((viewGroup.getWidth() - C0F4B.LIZ(16.0f, getContext())) - fLIZ, LIZLLL(this.LLJJIII, viewGroup));
        }
    }

    public final float LJFF(ViewGroup viewGroup) {
        float fLIZ = C0F4B.LIZ(60.0f, getContext());
        int i = C0F47.LIZ[this.LLJJJIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return (viewGroup.getWidth() - C0F4B.LIZ(16.0f, getContext())) - fLIZ;
            }
            throw new C1954807lC();
        }
        return C0F4B.LIZ(16.0f, getContext());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (!this.LLJJIJIL) {
                        return false;
                    }
                    viewGroup.requestDisallowInterceptTouchEvent(false);
                    boolean z = this.LLJJIJIIJIL;
                    this.LLJJIJI = false;
                    this.LLJJIJIIJIL = false;
                    this.LLJJIJIL = false;
                    if (z) {
                        settleAfterDrag(viewGroup);
                    }
                    return true;
                }
                if (!this.LLJJIJIL) {
                    return false;
                }
                if (!this.LLJJIJIIJIL) {
                    float fAbs = Math.abs(motionEvent.getRawX() - this.LLJI);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.LLJIJIL);
                    float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    if (fAbs <= scaledTouchSlop && fAbs2 <= scaledTouchSlop) {
                        return true;
                    }
                    this.LLJJIJI = true;
                    this.LLJJIJIIJIL = true;
                    if (this.LLJJJ) {
                        float fLJFF = LJFF(viewGroup);
                        float fLIZLLL = LIZLLL(getY(), viewGroup);
                        LIZJ();
                        this.LLJJI = fLJFF;
                        this.LLJJIII = fLIZLLL;
                        LIZIZ();
                        this.LLJILJIL = this.LLJI;
                        this.LLJILJILJ = this.LLJIJIL;
                        this.LLJILLL = this.LLJJI;
                        this.LLJJ = this.LLJJIII;
                    }
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float fLIZ = C0F4B.LIZ(60.0f, getContext());
                float f = (this.LLJILLL + rawX) - this.LLJILJIL;
                float f2 = (this.LLJJ + rawY) - this.LLJILJILJ;
                float f3 = fLIZ / 2.0f;
                this.LLJJI = Math.min(Math.max(f + f3, 0.0f), viewGroup.getWidth()) - f3;
                this.LLJJIII = LIZLLL(f2, viewGroup);
                LIZIZ();
                return true;
            }
            if (!this.LLJJIJIL) {
                return false;
            }
            viewGroup.requestDisallowInterceptTouchEvent(false);
            boolean z2 = this.LLJJIJIIJIL;
            boolean z3 = !this.LLJJIJI;
            this.LLJJIJI = false;
            this.LLJJIJIIJIL = false;
            this.LLJJIJIL = false;
            if (z2) {
                settleAfterDrag(viewGroup);
            } else if (z3) {
                performClick();
                return true;
            }
            return true;
        }
        if (!this.LLJJJ) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.LLILZLL.set(0.0f, C0F4B.LIZ(16.0f, getContext()), C0F4B.LIZ(60.0f, getContext()), C0F4B.LIZ(76.0f, getContext()));
            if (!this.LLILZLL.contains(x, y)) {
                return false;
            }
        }
        if (!this.LLJJJ) {
            this.LLJJI = getX();
            this.LLJJIII = getY() + C0F4B.LIZ(16.0f, getContext());
        }
        this.LLJI = motionEvent.getRawX();
        this.LLJIJIL = motionEvent.getRawY();
        this.LLJILJIL = motionEvent.getRawX();
        this.LLJILJILJ = motionEvent.getRawY();
        this.LLJILLL = this.LLJJI;
        this.LLJJ = this.LLJJIII;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = true;
        animate().cancel();
        viewGroup.requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void LIZ(float f, float f2) {
        this.LLJJI = f;
        this.LLJJIII = f2;
        animate().x(f).y(f2 - C0F4B.LIZ(16.0f, getContext())).setDuration(250L).start();
    }

    public final float LIZLLL(float f, ViewGroup viewGroup) {
        float fLIZ = C0F4B.LIZ(8.0f, getContext());
        float fLIZ2 = C0F4B.LIZ(16.0f, getContext());
        float paddingTop = viewGroup.getPaddingTop() + fLIZ + fLIZ2;
        float height = ((viewGroup.getHeight() - viewGroup.getPaddingBottom()) - C0F4B.LIZ(60.0f, getContext())) - fLIZ;
        float paddingTop2 = viewGroup.getPaddingTop() + fLIZ + fLIZ2;
        if (height < paddingTop2) {
            height = paddingTop2;
        }
        return Math.min(Math.max(f, paddingTop), height);
    }

    public final void LJ(ViewGroup viewGroup, final C0F45 c0f45) {
        final int iIntValue;
        int i;
        int iLIZ;
        float width;
        animate().cancel();
        this.LLJJJIL = c0f45;
        this.LLJJJ = true;
        LJII(28.0f, 62.0f);
        C786410Ut5.LLFF(8, this.LL);
        C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
        C786410Ut5.LLLLZLL(this.LLILLL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
        C0F48 c0f48 = this.LLILZIL;
        c0f48.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, c0f48.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 1073741824;
        }
        final float fLIZ = c0f48.LIZ(16);
        int i2 = (int) ((c0f48.getResources().getDisplayMetrics().density * 0.5f) + 0.5f);
        if (i2 < 1) {
            i2 = 1;
        }
        final float f = i2;
        c0f48.setBackground(new Drawable(c0f45, iIntValue, fLIZ, f) { // from class: X.0F42
            public final C0F45 LIZ;
            public final float LIZIZ;
            public final float LIZJ;
            public final int LIZLLL;
            public final int LJ = Color.alpha(654311423);
            public final Paint LJFF;
            public final Paint LJI;
            public final Path LJII;
            public final Path LJIIIIZZ;
            public final RectF LJIIIZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                this.LJIIIZ.set(getBounds());
                float f2 = this.LIZIZ;
                float fWidth = this.LJIIIZ.width() / 2.0f;
                if (f2 > fWidth) {
                    f2 = fWidth;
                }
                float fHeight = this.LJIIIZ.height() / 2.0f;
                if (f2 > fHeight) {
                    f2 = fHeight;
                }
                this.LJII.reset();
                this.LJIIIIZZ.reset();
                int i3 = C0F44.LIZ[this.LIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        this.LJII.addRoundRect(this.LJIIIZ, new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2}, Path.Direction.CW);
                        Path path = this.LJIIIIZZ;
                        RectF rectF = this.LJIIIZ;
                        path.moveTo(rectF.right, rectF.top + (this.LIZJ / 2.0f));
                        Path path2 = this.LJIIIIZZ;
                        RectF rectF2 = this.LJIIIZ;
                        path2.lineTo(rectF2.left + f2, rectF2.top + (this.LIZJ / 2.0f));
                        Path path3 = this.LJIIIIZZ;
                        RectF rectF3 = this.LJIIIZ;
                        float f3 = rectF3.left;
                        float f4 = rectF3.top;
                        float f5 = f2 * 2.0f;
                        path3.arcTo(new RectF(f3, f4, f3 + f5, f5 + f4), -90.0f, -90.0f);
                        Path path4 = this.LJIIIIZZ;
                        RectF rectF4 = this.LJIIIZ;
                        path4.lineTo(rectF4.left + (this.LIZJ / 2.0f), rectF4.bottom - f2);
                        Path path5 = this.LJIIIIZZ;
                        RectF rectF5 = this.LJIIIZ;
                        float f6 = rectF5.left;
                        float f7 = rectF5.bottom;
                        path5.arcTo(new RectF(f6, f7 - f5, f5 + f6, f7), 180.0f, -90.0f);
                        Path path6 = this.LJIIIIZZ;
                        RectF rectF6 = this.LJIIIZ;
                        path6.lineTo(rectF6.right, rectF6.bottom - (this.LIZJ / 2.0f));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    this.LJII.addRoundRect(this.LJIIIZ, new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f}, Path.Direction.CW);
                    Path path7 = this.LJIIIIZZ;
                    RectF rectF7 = this.LJIIIZ;
                    path7.moveTo(rectF7.left, rectF7.top + (this.LIZJ / 2.0f));
                    Path path8 = this.LJIIIIZZ;
                    RectF rectF8 = this.LJIIIZ;
                    path8.lineTo(rectF8.right - f2, rectF8.top + (this.LIZJ / 2.0f));
                    Path path9 = this.LJIIIIZZ;
                    RectF rectF9 = this.LJIIIZ;
                    float f8 = rectF9.right;
                    float f9 = f2 * 2.0f;
                    float f10 = rectF9.top;
                    path9.arcTo(new RectF(f8 - f9, f10, f8, f9 + f10), -90.0f, 90.0f);
                    Path path10 = this.LJIIIIZZ;
                    RectF rectF10 = this.LJIIIZ;
                    path10.lineTo(rectF10.right - (this.LIZJ / 2.0f), rectF10.bottom - f2);
                    Path path11 = this.LJIIIIZZ;
                    RectF rectF11 = this.LJIIIZ;
                    float f11 = rectF11.right;
                    float f12 = rectF11.bottom;
                    path11.arcTo(new RectF(f11 - f9, f12 - f9, f11, f12), 0.0f, 90.0f);
                    Path path12 = this.LJIIIIZZ;
                    RectF rectF12 = this.LJIIIZ;
                    path12.lineTo(rectF12.left, rectF12.bottom - (this.LIZJ / 2.0f));
                }
                canvas.drawPath(this.LJII, this.LJFF);
                canvas.drawPath(this.LJIIIIZZ, this.LJI);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i3) {
                this.LJFF.setAlpha((this.LIZLLL * i3) / 255);
                this.LJI.setAlpha((this.LJ * i3) / 255);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJFF.setColorFilter(colorFilter);
                this.LJI.setColorFilter(colorFilter);
            }

            {
                this.LIZ = c0f45;
                this.LIZIZ = fLIZ;
                this.LIZJ = f;
                this.LIZLLL = Color.alpha(iIntValue);
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(iIntValue);
                this.LJFF = paint;
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(654311423);
                paint2.setStrokeWidth(f);
                this.LJI = paint2;
                this.LJII = new Path();
                this.LJIIIIZZ = new Path();
                this.LJIIIZ = new RectF();
            }
        });
        TuxIconView tuxIconView = c0f48.LL;
        int[] iArr = C0F46.LIZ;
        int i3 = iArr[c0f45.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = R.raw.icon_chevron_left_fill_ltr;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = R.raw.icon_chevron_right_fill_ltr;
        }
        tuxIconView.setIconRes(i);
        c0f48.LL.setTintColor(-1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0f48.LL.getLayoutParams();
        int i4 = iArr[c0f45.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                iLIZ = c0f48.LIZ(4);
            } else {
                throw new C1954807lC();
            }
        } else {
            iLIZ = c0f48.LIZ(0);
        }
        layoutParams.leftMargin = iLIZ;
        C0F48 c0f482 = this.LLILZIL;
        int visibility = c0f482.getVisibility();
        c0f482.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0f482);
        float fLIZ2 = C0F4B.LIZ(28.0f, getContext());
        int i5 = C0F47.LIZ[c0f45.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                width = viewGroup.getWidth() - fLIZ2;
            } else {
                throw new C1954807lC();
            }
        } else {
            width = 0.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(width);
        float f2 = this.LLJJIII;
        float fLIZ3 = C0F4B.LIZ(8.0f, getContext());
        float paddingTop = viewGroup.getPaddingTop() + fLIZ3;
        float height = ((viewGroup.getHeight() - viewGroup.getPaddingBottom()) - C0F4B.LIZ(62.0f, getContext())) - fLIZ3;
        float paddingTop2 = viewGroup.getPaddingTop() + fLIZ3;
        if (height < paddingTop2) {
            height = paddingTop2;
        }
        float fMin = Math.min(Math.max(f2, paddingTop), height);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fMin);
        C786410Ut5.W1(this, 0);
    }

    public final void LJII(float f, float f2) {
        int iLIZ = C0F4B.LIZ(f, getContext());
        int iLIZ2 = C0F4B.LIZ(f2, getContext());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iLIZ, iLIZ2);
        }
        if (layoutParams.width != iLIZ || layoutParams.height != iLIZ2) {
            layoutParams.width = iLIZ;
            layoutParams.height = iLIZ2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    public final void LJI(float f, float f2, float f3, float f4, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C0F4B.LIZ(f, getContext()), C0F4B.LIZ(f2, getContext()));
        layoutParams.leftMargin = C0F4B.LIZ(f3, getContext());
        layoutParams.topMargin = C0F4B.LIZ(f4, getContext());
        C786410Ut5.W5(view, layoutParams);
    }
}
