package X;

import Y.ALAdapterS7S0100000_10;
import Y.AUListenerS260S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C680440QmY extends View {
    public static final float LLL = C341940Daq.LIZ(56.0d);
    public static final float LLLF = C341940Daq.LIZ(1.0d);
    public static final float LLLFF = C341940Daq.LIZ(26.0d);
    public static final float LLLFFI = C341940Daq.LIZ(4.0d);
    public static final float LLLFZ = C341940Daq.LIZ(12.0d);
    public static final float LLLI = C341940Daq.LIZ(8.0d);
    public int LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public boolean LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final PointF LLJJ;
    public EnumC680480Qmc LLJJI;
    public Animator LLJJIII;
    public Animator LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public RectF LLJJJJ;
    public final RectF LLJJJJJIL;
    public final RectF LLJJJJLIIL;
    public C680390QmT LLJJL;
    public C680390QmT LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public List<C680390QmT> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public InterfaceC680580Qmm LLJLL;
    public boolean LLJLLIL;
    public final RectF LLJLLL;
    public final RectF LLJZ;
    public InterfaceC680590Qmn LLJZIJLIL;

    public void LJIIJ() {
    }

    public RectF getPhotoDisplayRect() {
        return null;
    }

    public final void LJIIIIZZ() {
        List<C680390QmT> list = this.LLJLIL;
        if (list != null) {
            int i = 0;
            for (C680390QmT c680390QmT : list) {
                int i2 = i + 1;
                c680390QmT.LJFF = i == 0;
                c680390QmT.LJ = (i == 0 || i == list.size() - 1) ? false : true;
                if (c680390QmT.LJFF) {
                    this.LLJJL = c680390QmT;
                }
                i = i2;
            }
        }
    }

    public void LJIIIZ() {
        RectF rectF = this.LLJJJJLIIL;
        rectF.left = getLeft();
        rectF.top = getTop();
        rectF.right = getRight();
        rectF.bottom = getBottom();
    }

    public final RectF getCurrentRect() {
        RectF rectF = this.LLJJJJJIL;
        rectF.left = EnumC680530Qmh.LEFT.getCoordinate();
        rectF.top = EnumC680530Qmh.TOP.getCoordinate();
        rectF.right = EnumC680530Qmh.RIGHT.getCoordinate();
        rectF.bottom = EnumC680530Qmh.BOTTOM.getCoordinate();
        return rectF;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Animator animator;
        Animator animator2 = this.LLJJIII;
        if (animator2 != null && animator2.isRunning() && (animator = this.LLJJIII) != null) {
            animator.cancel();
        }
        Animator animator3 = this.LLJJIJI;
        if (animator3 != null) {
            animator3.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final InterfaceC680580Qmm getBottomPanelViewModel() {
        return this.LLJLL;
    }

    public final boolean getCanDragBox() {
        return this.LLJL;
    }

    public final RectF getContainerRect() {
        return this.LLJJJJLIIL;
    }

    public final C680390QmT getCurrentExpandedPoint() {
        return this.LLJJL;
    }

    public final boolean getNeedInvalidCorner() {
        return this.LLIZLLLIL;
    }

    public final boolean getNeedUpdateRect() {
        return this.LLJJJIL;
    }

    public final InterfaceC680590Qmn getOnRectMoveListener() {
        return this.LLJZIJLIL;
    }

    public final int getOuterCircleColor() {
        return this.LL;
    }

    public final List<C680390QmT> getPointList() {
        return this.LLJLIL;
    }

    public final boolean getShouldShowPoints() {
        return this.LLJLLIL;
    }

    public final RectF getTitleRoundRect() {
        return this.LLJZ;
    }

    public final boolean getTouchable() {
        return this.LLJLILLLLZIIL;
    }

    public final C680390QmT getVirtualCirclePoint() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public static RectF LIZLLL(C680390QmT c680390QmT) {
        RectF rectF = new RectF();
        PointF pointF = c680390QmT.LIZLLL;
        float f = pointF.x;
        float f2 = LLLF / 4;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        return rectF;
    }

    public final RectF LJ(C680390QmT c680390QmT) {
        RectF rectF = c680390QmT.LIZIZ;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        float fWidth = rectF2.width();
        float f = LLL;
        if (fWidth < f) {
            float fWidth2 = (f - rectF2.width()) / 2;
            float f2 = rectF2.left - fWidth2;
            rectF2.left = f2;
            float f3 = rectF2.right + fWidth2;
            rectF2.right = f3;
            if (f2 <= 0.0f) {
                rectF2.left = 0.0f;
            }
            if (f3 >= getRight() && getRight() != 0) {
                rectF2.right = getRight();
            }
        }
        if (rectF2.height() < f) {
            float fHeight = (f - rectF2.height()) / 2;
            float f4 = rectF2.top - fHeight;
            rectF2.top = f4;
            float f5 = rectF2.bottom + fHeight;
            rectF2.bottom = f5;
            if (f4 <= 0.0f) {
                rectF2.top = 0.0f;
            }
            if (f5 >= getBottom() && getBottom() != 0) {
                rectF2.bottom = getBottom();
            }
        }
        return rectF2;
    }

    public float LJI(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLJJIJIIJIL) {
            canvas.drawColor(C679560Ql8.LIZ);
            if (this.LLJJIJIL) {
                RectF rectF = this.LLJJJJ;
                if (rectF != null) {
                    LJFF(canvas, rectF);
                }
                LJFF(canvas, getCurrentRect());
            }
            if (this.LLJLLIL) {
                this.LLILLL.setStrokeWidth(this.LLJILJIL * 1.4f);
                List<C680390QmT> list = this.LLJLIL;
                if (list != null) {
                    int i = 0;
                    for (C680390QmT c680390QmT : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C680390QmT c680390QmT2 = c680390QmT;
                            if (c680390QmT2.LJ) {
                                PointF pointF = c680390QmT2.LIZLLL;
                                float f = pointF.x;
                                float f2 = pointF.y;
                                float f3 = this.LLJILJIL;
                                canvas.drawCircle(f, f2, f3, this.LLILLL);
                                canvas.drawCircle(f, f2, this.LLJIJIL, this.LLILLJJLI);
                                RectF rectF2 = c680390QmT2.LJI;
                                rectF2.top = f2 - f3;
                                rectF2.bottom = f2 + f3;
                                rectF2.left = f - f3;
                                rectF2.right = f + f3;
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r33) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C680440QmY.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBottomPanelViewModel(InterfaceC680580Qmm interfaceC680580Qmm) {
        this.LLJLL = interfaceC680580Qmm;
    }

    public final void setCanDragBox(boolean z) {
        this.LLJL = z;
    }

    public final void setCurrentExpandedPoint(C680390QmT c680390QmT) {
        this.LLJJL = c680390QmT;
    }

    public final void setCurrentPoint(int i) {
        this.LLJJIJIL = true;
        List<C680390QmT> list = this.LLJLIL;
        if (list != null) {
            for (C680390QmT c680390QmT : list) {
                int i2 = c680390QmT.LIZ;
                if (i2 == i && i == 0) {
                    RectF rectF = c680390QmT.LIZIZ;
                    if (rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right >= 0.0f && rectF.bottom >= 0.0f) {
                        LJIIIIZZ();
                        setCurrentRect(LJ(c680390QmT));
                        invalidate();
                    }
                }
                if (i2 == i && c680390QmT.LJ) {
                    LJIIIIZZ();
                    setCurrentRect(LJ(c680390QmT));
                    c680390QmT.LJ = false;
                    invalidate();
                }
            }
        }
    }

    public final void setCurrentRect(RectF rectF) {
        EnumC680530Qmh.LEFT.setCoordinate(rectF.left);
        EnumC680530Qmh.TOP.setCoordinate(rectF.top);
        EnumC680530Qmh.RIGHT.setCoordinate(rectF.right);
        EnumC680530Qmh.BOTTOM.setCoordinate(rectF.bottom);
    }

    public final void setNeedInvalidCorner(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setNeedUpdateRect(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setOnRectMoveListener(InterfaceC680590Qmn interfaceC680590Qmn) {
        this.LLJZIJLIL = interfaceC680590Qmn;
    }

    public final void setOuterCircleColor(int i) {
        this.LL = i;
    }

    public final void setPointList(List<C680390QmT> list) {
        int size;
        this.LLJLIL = list;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C680390QmT c680390QmT = new C680390QmT(size, new RectF(-1.0f, -1.0f, -1.0f, -1.0f), new RectF(-1.0f, -1.0f, -1.0f, -1.0f), false, true, 104);
        this.LLJJLIIIJLLLLLLLZ = c680390QmT;
        if (list != null) {
            list.add(c680390QmT);
        }
    }

    public final void setShouldShowPoints(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setTouchable(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setVirtualCirclePoint(C680390QmT c680390QmT) {
        this.LLJJLIIIJLLLLLLLZ = c680390QmT;
    }

    public C680440QmY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJFF(Canvas canvas, RectF rectF) {
        LJIIJ();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float f5 = LLLFZ;
        Canvas canvas2 = canvas;
        canvas2.drawRoundRect(rectF, f5, f5, this.LLILZ);
        if (this.LLIZLLLIL) {
            this.LLJLLL.set(f, f2, f3, (f4 - (2.0f * f5)) - this.LLJILLL);
            canvas2.drawRoundRect(this.LLJLLL, f5, f5, this.LLILZIL);
        }
        RectF rectF2 = this.LLJLLL;
        float f6 = this.LLJILLL;
        rectF2.set(f + f6, f2 + f6, f3 - f6, f4 - f6);
        RectF rectF3 = this.LLJLLL;
        float f7 = LLLI;
        canvas2.drawRoundRect(rectF3, f7, f7, this.LLILZLL);
        float f8 = LLLFF;
        float f9 = f + f8;
        float f10 = f3 - f8;
        float fWidth = rectF.width();
        float f11 = LLL;
        if (fWidth < f11) {
            float fCenterX = rectF.centerX();
            float f12 = LLLFFI;
            f9 = fCenterX - (f12 / 2);
            f10 = f12 + f9;
        }
        float f13 = f2 + f8;
        float f14 = f4 - f8;
        if (rectF.height() < f11) {
            float fCenterY = rectF.centerY();
            float f15 = LLLFFI;
            f13 = fCenterY - (f15 / 2);
            f14 = f15 + f13;
        }
        Animator animator = this.LLJJIII;
        if (animator != null && animator.isRunning()) {
            float f16 = 2;
            if (rectF.width() < this.LLJILJIL * f16 || rectF.height() < this.LLJILJIL * f16) {
                return;
            }
        }
        if (f10 > f9) {
            float f18 = this.LLJILLL;
            canvas2.drawRect(f9, ((f18 / 2) + f2) - 1.0f, f10, f18 + f2 + 1.0f, this.LLILZLL);
            float f19 = this.LLJILLL;
            canvas2.drawRect(f9, (f4 - f19) - 1.0f, f10, (f4 - (f19 / 2)) + 1.0f, this.LLILZLL);
        }
        if (f14 > f13) {
            float f20 = this.LLJILLL;
            canvas2.drawRect(((f20 / 2) + f) - 1.0f, f13, f20 + f + 1.0f, f14, this.LLILZLL);
            float f21 = this.LLJILLL;
            canvas2.drawRect((f3 - f21) - 1.0f, f13, (f3 - (f21 / 2)) + 1.0f, f14, this.LLILZLL);
        }
        if (f10 > f9) {
            float f22 = f9;
            float f23 = f10;
            canvas2.drawRect(f22, f2 - 1.0f, f23, f2 + (this.LLJILLL / 2) + 1.0f, this.LLIZ);
            canvas2 = canvas2;
            canvas2.drawRect(f22, (f4 - (this.LLJILLL / 2)) - 1.0f, f23, f4 + 1.0f, this.LLIZ);
        }
        if (f14 > f13) {
            Canvas canvas3 = canvas2;
            canvas3.drawRect(f - 1.0f, f13, f + (this.LLJILLL / 2) + 1.0f, f14, this.LLIZ);
            canvas3.drawRect((f3 - (this.LLJILLL / 2)) - 1.0f, f13, f3 + 1.0f, f14, this.LLIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0QmT, java.lang.Object] */
    public final void LJII(final C680390QmT c680390QmT, boolean z) {
        setCurrentRect(c680390QmT.LIZIZ);
        C259800zU c259800zU = new C259800zU();
        ?? r0 = this.LLJJL;
        c259800zU.element = r0;
        if (Intrinsics.LJFF(c680390QmT, r0)) {
            c259800zU.element = null;
        }
        RectF rectFLIZLLL = LIZLLL(c680390QmT);
        this.LLJJL = c680390QmT;
        RectF rectFLJ = LJ(c680390QmT);
        if (c259800zU.element != 0) {
            InterfaceC680590Qmn interfaceC680590Qmn = this.LLJZIJLIL;
            if (interfaceC680590Qmn != null && !z) {
                interfaceC680590Qmn.LIZIZ(c680390QmT.LIZJ, c680390QmT);
            }
            final RectF rectFLIZLLL2 = LIZLLL((C680390QmT) c259800zU.element);
            final RectF rectFLJ2 = LJ((C680390QmT) c259800zU.element);
            LIZIZ(rectFLIZLLL, rectFLJ, new AUListenerS260S0100000_10(this, 2), new ValueAnimator.AnimatorUpdateListener() { // from class: X.0QmZ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C680440QmY c680440QmY = this.LL;
                    if (c680440QmY.LLJJJJ == null) {
                        c680440QmY.LLJJJJ = new RectF();
                    }
                    C680440QmY c680440QmY2 = this.LL;
                    RectF rectF = c680440QmY2.LLJJJJ;
                    if (rectF != null) {
                        RectF rectF2 = rectFLJ2;
                        RectF rectF3 = rectFLIZLLL2;
                        rectF.left = rectF2.left + (valueAnimator.getAnimatedFraction() * (rectF3.left - rectF2.left));
                        rectF.top = rectF2.top + (valueAnimator.getAnimatedFraction() * (rectF3.top - rectF2.top));
                        rectF.right = rectF2.right + (valueAnimator.getAnimatedFraction() * (rectF3.right - rectF2.right));
                        rectF.bottom = rectF2.bottom + (valueAnimator.getAnimatedFraction() * (rectF3.bottom - rectF2.bottom));
                        float f = 2;
                        if (rectF.right - rectF.left <= (c680440QmY2.LLJIJIL + (c680440QmY2.LLILLL.getStrokeWidth() / f)) * f) {
                            c680440QmY2.LLIZ.setColor(C679560Ql8.LIZ);
                        }
                    }
                    if (((RectF) valueAnimator.getAnimatedValue()).right - ((RectF) valueAnimator.getAnimatedValue()).left >= this.LL.LLJILJIL * 2) {
                        c680390QmT.LJ = false;
                    }
                }
            }, new AwS411S0200000_10(c259800zU, (C259800zU<C680390QmT>) this, (C680440QmY) 55), Boolean.FALSE);
            return;
        }
        LIZIZ(getCurrentRect(), rectFLJ, new AUListenerS260S0100000_10(this, 4), new AUListenerS260S0100000_10(this, 3), null, Boolean.FALSE);
    }

    public C680440QmY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = -1;
        int i2 = C679560Ql8.LIZ;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.LLILLJJLI = paint;
        int i3 = this.LL;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(i3);
        paint2.setAlpha(51);
        this.LLILLL = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
        this.LLILZ = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(-1);
        paint4.setAlpha(36);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LLILZIL = paint4;
        Paint paint5 = new Paint();
        paint5.setAntiAlias(true);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(-1);
        paint5.setAlpha(36);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LLILZLL = paint5;
        Paint paint6 = new Paint();
        paint6.setStyle(Paint.Style.FILL);
        paint6.setColor(-1);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LLIZ = paint6;
        this.LLJ = C341940Daq.LIZ(20.0d);
        this.LLJI = C341940Daq.LIZ(3.0d);
        this.LLJIJIL = C341940Daq.LIZ(8.0d);
        this.LLJILJIL = C341940Daq.LIZ(12.0d);
        this.LLJILJILJ = C341940Daq.LIZ(5.0d);
        this.LLJILLL = C341940Daq.LIZ(5.0d);
        this.LLJJ = new PointF();
        this.LLJJIJIL = true;
        this.LLJJJJJIL = new RectF();
        this.LLJJJJLIIL = new RectF();
        this.LLJL = true;
        this.LLJLILLLLZIIL = true;
        Paint paint7 = new Paint();
        paint7.setFilterBitmap(true);
        setLayerType(1, paint7);
        this.LLJLLIL = true;
        this.LLJLLL = new RectF();
        this.LLJZ = new RectF();
    }

    public final void LIZIZ(RectF rectF, RectF rectF2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener2, final Function0<Unit> function0, final Boolean bool) {
        this.LLJJIJIIJIL = true;
        final RectF rectF3 = new RectF();
        Animator animator = this.LLJJIII;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLJJIJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: X.0Qmd
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                RectF rectF4 = (RectF) obj;
                RectF rectF5 = (RectF) obj2;
                RectF rectF6 = rectF3;
                float f2 = rectF4.left;
                rectF6.left = f2 + ((rectF5.left - f2) * f);
                float f3 = rectF4.right;
                rectF6.right = f3 + ((rectF5.right - f3) * f);
                float f4 = rectF4.top;
                rectF6.top = f4 + ((rectF5.top - f4) * f);
                float f5 = rectF4.bottom;
                rectF6.bottom = f5 + (f * (rectF5.bottom - f5));
                return rectF6;
            }
        }, rectF, rectF2);
        valueAnimatorOfObject.setInterpolator(new InterpolatorC21388318n3() { // from class: X.18n2
            {
                PointF pointF = this.LIZIZ;
                pointF.x = 0.0f;
                pointF.y = 0.0f;
                PointF pointF2 = this.LIZJ;
                pointF2.x = 0.2f;
                pointF2.y = 1.0f;
            }
        });
        valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addListener(new AnimatorListenerAdapter() { // from class: X.0Qma
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator3) {
                Function0<Unit> function02;
                super.onAnimationCancel(animator3);
                if (Intrinsics.LJFF(bool, Boolean.FALSE) && (function02 = function0) != null) {
                    function02.invoke();
                }
                this.LL.LLJJJ = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator3) {
                Function0<Unit> function02;
                super.onAnimationEnd(animator3);
                if (this.LL.LLJJJ && (function02 = function0) != null) {
                    function02.invoke();
                }
                this.LL.LLJJJ = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator3) {
                super.onAnimationStart(animator3);
                this.LL.LLJJJ = true;
            }
        });
        this.LLJJIII = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new TypeEvaluator() { // from class: X.0Qme
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                RectF rectF4 = (RectF) obj;
                RectF rectF5 = (RectF) obj2;
                RectF rectF6 = rectF3;
                float f2 = rectF4.left;
                rectF6.left = f2 + ((rectF5.left - f2) * f);
                float f3 = rectF4.right;
                rectF6.right = f3 + ((rectF5.right - f3) * f);
                float f4 = rectF4.top;
                rectF6.top = f4 + ((rectF5.top - f4) * f);
                float f5 = rectF4.bottom;
                rectF6.bottom = f5 + (f * (rectF5.bottom - f5));
                return rectF6;
            }
        }, rectF, rectF2);
        valueAnimatorOfObject2.setInterpolator(new InterpolatorC21388318n3() { // from class: X.18n2
            {
                PointF pointF = this.LIZIZ;
                pointF.x = 0.0f;
                pointF.y = 0.0f;
                PointF pointF2 = this.LIZJ;
                pointF2.x = 0.2f;
                pointF2.y = 1.0f;
            }
        });
        valueAnimatorOfObject2.addUpdateListener(animatorUpdateListener2);
        valueAnimatorOfObject2.setDuration(300L);
        valueAnimatorOfObject2.addListener(new ALAdapterS7S0100000_10(this, 4));
        this.LLJJIJI = valueAnimatorOfObject2;
        Intrinsics.LJFF(bool, Boolean.TRUE);
        Animator animator3 = this.LLJJIII;
        if (animator3 != null) {
            animator3.start();
        }
        Animator animator4 = this.LLJJIJI;
        if (animator4 != null) {
            animator4.start();
        }
    }
}
