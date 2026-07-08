package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389830FQf extends View {
    public Pair<Integer, Integer> LL;
    public Pair<Integer, Integer> LLILLJJLI;
    public Pair<Integer, Integer> LLILLL;
    public RectF LLILZ;
    public final RectF LLILZIL;
    public final Rect LLILZLL;
    public final Rect LLIZ;
    public InterfaceC389890FQl LLIZLLLIL;
    public final Region LLJ;
    public final Region LLJI;
    public final Region LLJIJIL;
    public final Region LLJILJIL;
    public final Region LLJILJILJ;
    public final Region LLJILLL;
    public final Region LLJJ;
    public final Region LLJJI;
    public EnumC375190EnN LLJJIII;
    public EnumC389810FQd LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final ValueAnimator LLJJJ;
    public float LLJJJIL;
    public InterfaceC389870FQj LLJJJJ;
    public float LLJJJJJIL;
    public Rect LLJJJJLIIL;
    public C389850FQh LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public InterfaceC359760E8o LLJL;

    static {
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    }

    private final RectF getCurrentRectF() {
        this.LLILZIL.set(this.LLILZ);
        return this.LLILZIL;
    }

    private final Pair<Integer, Integer> getMinWidthHeight() {
        if (this.LLILLL.getFirst().intValue() <= 0 || this.LLILLL.getSecond().intValue() <= 0) {
            LIZ();
        }
        return this.LLILLL;
    }

    public final void LIZ() {
        EnumC375190EnN enumC375190EnN = this.LLJJIII;
        this.LLILLL = enumC375190EnN == EnumC375190EnN.FREE ? new Pair<>(Integer.valueOf(this.LLJJL.LJ), Integer.valueOf(this.LLJJL.LJFF)) : LIZJ(enumC375190EnN) >= 1.0f ? new Pair<>(Integer.valueOf(this.LLJJL.LJ), Integer.valueOf((int) (this.LLJJL.LJ / LIZJ(this.LLJJIII)))) : new Pair<>(Integer.valueOf((int) (this.LLJJL.LJFF * LIZJ(this.LLJJIII))), Integer.valueOf(this.LLJJL.LJFF));
    }

    public final void LJIIIIZZ() {
        InterfaceC359760E8o interfaceC359760E8o = this.LLJL;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.LIZ();
        }
        invalidate();
    }

    public final int getCenterX() {
        return this.LLJJL.LIZ + (getCropRectMaxWidth() / 2);
    }

    public final int getCenterY() {
        return this.LLJJL.LIZJ + (getCropRectMaxHeight() / 2);
    }

    public final float getCurrentRatio() {
        return this.LLILZ.width() / this.LLILZ.height();
    }

    public final Rect getDeltaLeftTopRightBottom() {
        Rect rect = this.LLIZ;
        float fLIZJ = (rect.right - rect.left) / (rect.bottom - rect.top);
        EnumC375190EnN enumC375190EnN = this.LLJJIII;
        if (enumC375190EnN != EnumC375190EnN.FREE) {
            fLIZJ = LIZJ(enumC375190EnN);
        }
        Rect rect2 = new Rect();
        int cropRectMaxWidth = getCropRectMaxWidth();
        int cropRectMaxHeight = getCropRectMaxHeight();
        float f = cropRectMaxWidth;
        float f2 = cropRectMaxHeight;
        if (fLIZJ < f / f2) {
            C389850FQh c389850FQh = this.LLJJL;
            int i = c389850FQh.LIZJ;
            rect2.top = i;
            rect2.bottom = i + cropRectMaxHeight;
            int i2 = (int) (f2 * fLIZJ);
            int i3 = ((cropRectMaxWidth - i2) / 2) + c389850FQh.LIZ;
            rect2.left = i3;
            rect2.right = i3 + i2;
        } else {
            C389850FQh c389850FQh2 = this.LLJJL;
            int i4 = c389850FQh2.LIZ;
            rect2.left = i4;
            rect2.right = i4 + cropRectMaxWidth;
            int i5 = (int) (f / fLIZJ);
            int i6 = ((cropRectMaxHeight - i5) / 2) + c389850FQh2.LIZJ;
            rect2.top = i6;
            rect2.bottom = i6 + i5;
        }
        Rect rect3 = this.LLIZ;
        return new Rect(rect3.left - rect2.left, rect3.top - rect2.top, rect2.right - rect3.right, rect2.bottom - rect3.bottom);
    }

    public final Rect getRect() {
        return new Rect(C389880FQk.LIZ(this.LLILZ));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC359760E8o interfaceC359760E8o = this.LLJL;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.dispose();
        }
        this.LLJL = null;
        super.onDetachedFromWindow();
    }

    public final void LJ() {
        int iIntValue = getMinWidthHeight().getSecond().intValue();
        RectF rectF = this.LLILZ;
        float f = rectF.bottom;
        float f2 = rectF.top;
        float f3 = iIntValue;
        if (f < f2 + f3) {
            rectF.bottom = f2 + f3;
        }
        if (rectF.bottom > getHeight()) {
            this.LLILZ.bottom = getHeight();
        }
        Rect rect = this.LLJJJJLIIL;
        if (rect != null) {
            RectF rectF2 = this.LLILZ;
            float f4 = rectF2.bottom;
            int i = rect.bottom;
            if (f4 > i) {
                rectF2.bottom = i;
            }
        }
        InterfaceC389870FQj interfaceC389870FQj = this.LLJJJJ;
        if (interfaceC389870FQj != null) {
            interfaceC389870FQj.LIZIZ(EnumC389840FQg.BOTTOM);
        }
    }

    public final void LJFF() {
        int iIntValue = getMinWidthHeight().getFirst().intValue();
        RectF rectF = this.LLILZ;
        float f = rectF.left;
        float f2 = rectF.right;
        float f3 = iIntValue;
        if (f > f2 - f3) {
            rectF.left = f2 - f3;
        }
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        Rect rect = this.LLJJJJLIIL;
        if (rect != null) {
            float f4 = rectF.left;
            int i = rect.left;
            if (f4 < i) {
                rectF.left = i;
            }
        }
        InterfaceC389870FQj interfaceC389870FQj = this.LLJJJJ;
        if (interfaceC389870FQj != null) {
            interfaceC389870FQj.LIZIZ(EnumC389840FQg.LEFT);
        }
    }

    public final void LJI() {
        int iIntValue = getMinWidthHeight().getFirst().intValue();
        RectF rectF = this.LLILZ;
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = iIntValue;
        if (f < f2 + f3) {
            rectF.right = f2 + f3;
        }
        if (rectF.right > getWidth()) {
            this.LLILZ.right = getWidth();
        }
        Rect rect = this.LLJJJJLIIL;
        if (rect != null) {
            RectF rectF2 = this.LLILZ;
            float f4 = rectF2.right;
            int i = rect.right;
            if (f4 > i) {
                rectF2.right = i;
            }
        }
        InterfaceC389870FQj interfaceC389870FQj = this.LLJJJJ;
        if (interfaceC389870FQj != null) {
            interfaceC389870FQj.LIZIZ(EnumC389840FQg.RIGHT);
        }
    }

    public final void LJII() {
        int iIntValue = getMinWidthHeight().getSecond().intValue();
        RectF rectF = this.LLILZ;
        float f = rectF.top;
        float f2 = rectF.bottom;
        float f3 = iIntValue;
        if (f > f2 - f3) {
            rectF.top = f2 - f3;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        Rect rect = this.LLJJJJLIIL;
        if (rect != null) {
            float f4 = rectF.top;
            int i = rect.top;
            if (f4 < i) {
                rectF.top = i;
            }
        }
        InterfaceC389870FQj interfaceC389870FQj = this.LLJJJJ;
        if (interfaceC389870FQj != null) {
            interfaceC389870FQj.LIZIZ(EnumC389840FQg.TOP);
        }
    }

    public final int getCropRectMaxHeight() {
        int height = getHeight();
        C389850FQh c389850FQh = this.LLJJL;
        return (height - c389850FQh.LIZJ) - c389850FQh.LIZLLL;
    }

    public final int getCropRectMaxWidth() {
        int width = getWidth();
        C389850FQh c389850FQh = this.LLJJL;
        return (width - c389850FQh.LIZ) - c389850FQh.LIZIZ;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((Boolean) C275410Aqp.LIZ.getValue()).booleanValue() && this.LLJL == null) {
            this.LLJL = C20298714bh.LIZ(this, new AwS584S0100000_5(this, 1216));
        }
        InterfaceC359760E8o interfaceC359760E8o = this.LLJL;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.LIZ();
        }
    }

    public final EnumC375190EnN getCropMode() {
        return this.LLJJIII;
    }

    public final RectF LIZIZ(float f) {
        RectF rectF = new RectF();
        float cropRectMaxWidth = getCropRectMaxWidth();
        float cropRectMaxHeight = getCropRectMaxHeight();
        if (f < cropRectMaxWidth / cropRectMaxHeight) {
            float f2 = this.LLJJL.LIZJ;
            rectF.top = f2;
            rectF.bottom = f2 + cropRectMaxHeight;
            float f3 = cropRectMaxHeight * f;
            float f4 = ((cropRectMaxWidth - f3) / 2) + r1.LIZ;
            rectF.left = f4;
            rectF.right = f4 + f3;
            return rectF;
        }
        float f5 = this.LLJJL.LIZ;
        rectF.left = f5;
        rectF.right = f5 + cropRectMaxWidth;
        float f6 = cropRectMaxWidth / f;
        float f7 = ((cropRectMaxHeight - f6) / 2) + r1.LIZJ;
        rectF.top = f7;
        rectF.bottom = f7 + f6;
        return rectF;
    }

    public final float LIZJ(EnumC375190EnN enumC375190EnN) {
        switch (C389800FQc.LIZ[enumC375190EnN.ordinal()]) {
            case 1:
                return 0.5625f;
            case 2:
                return 0.75f;
            case 3:
                return 1.0f;
            case 4:
                return 1.3333334f;
            case 5:
                return 1.7777778f;
            case 6:
                return this.LLJJJIL;
            default:
                RectF rectF = this.LLILZ;
                return ((rectF.right - rectF.left) * 1.0f) / (rectF.bottom - rectF.top);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Region region = this.LLJ;
        RectF rectF = this.LLILZ;
        float f = rectF.left;
        float f2 = this.LLJJLIIIJLLLLLLLZ;
        float f3 = rectF.top;
        region.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
        Region region2 = this.LLJI;
        RectF rectF2 = this.LLILZ;
        float f4 = rectF2.left;
        float f5 = this.LLJJLIIIJLLLLLLLZ;
        float f6 = rectF2.bottom;
        region2.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
        Region region3 = this.LLJIJIL;
        RectF rectF3 = this.LLILZ;
        float f7 = rectF3.right;
        float f8 = this.LLJJLIIIJLLLLLLLZ;
        float f9 = rectF3.top;
        region3.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
        Region region4 = this.LLJILJIL;
        RectF rectF4 = this.LLILZ;
        float f10 = rectF4.right;
        float f11 = this.LLJJLIIIJLLLLLLLZ;
        float f12 = rectF4.bottom;
        region4.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
        Region region5 = this.LLJILJILJ;
        RectF rectF5 = this.LLILZ;
        float f13 = rectF5.left;
        float f14 = this.LLJJLIIIJLLLLLLLZ;
        float f15 = 1;
        region5.set((int) (f13 - f14), (int) (rectF5.top + f14 + f15), (int) (f13 + f14), (int) ((rectF5.bottom - f14) - f15));
        Region region6 = this.LLJILLL;
        RectF rectF6 = this.LLILZ;
        float f16 = rectF6.left;
        float f18 = this.LLJJLIIIJLLLLLLLZ;
        float f19 = rectF6.top;
        region6.set((int) (f16 + f18 + f15), (int) (f19 - f18), (int) ((rectF6.right - f18) - f15), (int) (f19 + f18));
        Region region7 = this.LLJJ;
        RectF rectF7 = this.LLILZ;
        float f20 = rectF7.right;
        float f21 = this.LLJJLIIIJLLLLLLLZ;
        region7.set((int) (f20 - f21), (int) (rectF7.top + f21 + f15), (int) (f20 + f21), (int) ((rectF7.bottom - f21) - f15));
        Region region8 = this.LLJJI;
        RectF rectF8 = this.LLILZ;
        float f22 = rectF8.left;
        float f23 = this.LLJJLIIIJLLLLLLLZ;
        float f24 = rectF8.bottom;
        region8.set((int) (f22 + f23 + f15), (int) (f24 - f23), (int) ((rectF8.right - f23) - f15), (int) (f24 + f23));
        InterfaceC359760E8o interfaceC359760E8o = this.LLJL;
        if (interfaceC359760E8o != null) {
            interfaceC359760E8o.LIZ();
        }
        this.LLIZLLLIL.LIZ(canvas, C389880FQk.LIZ(this.LLILZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r1 != 3) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389830FQf.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCropListener(InterfaceC389870FQj interfaceC389870FQj) {
        this.LLJJJJ = interfaceC389870FQj;
    }

    public final void setCropMode(EnumC375190EnN enumC375190EnN) {
        if (this.LLJJIII != enumC375190EnN) {
            this.LLJJIII = enumC375190EnN;
            this.LLILZ = LIZIZ(LIZJ(enumC375190EnN));
            LIZ();
            LJIIIIZZ();
        }
    }

    public final void setCropViewConfig(C389850FQh c389850FQh) {
        this.LLJJL = c389850FQh;
        this.LLJJJ.setDuration(c389850FQh.LJII);
        Interpolator interpolator = this.LLJJL.LJIIIIZZ;
        if (interpolator != null) {
            this.LLJJJ.setInterpolator(interpolator);
        }
    }

    public final void setFreeModeCropRect(float f) {
        this.LLJJJJJIL = f;
        if (getWidth() != 0 && getHeight() != 0) {
            if (f > 0.0f) {
                this.LLILZ = LIZIZ(f);
            }
            LJIIIIZZ();
        }
    }

    public final void setLimitRect(Rect rect) {
        this.LLJJJJLIIL = rect;
    }

    public final void setOriginRatio(float f) {
        this.LLJJJIL = f;
    }

    public final void setPainter(InterfaceC389890FQl interfaceC389890FQl) {
        this.LLIZLLLIL = interfaceC389890FQl;
    }

    public final void setRect(RectF rectF) {
        this.LLILZ = rectF;
        LJIIIIZZ();
    }

    public final void setTouchRegionSize(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public C389830FQf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Pair<>(0, 0);
        this.LLILLJJLI = new Pair<>(0, 0);
        this.LLILLL = new Pair<>(0, 0);
        this.LLILZ = new RectF();
        this.LLILZIL = new RectF();
        this.LLILZLL = new Rect();
        this.LLIZ = new Rect();
        this.LLIZLLLIL = new InterfaceC389890FQl() { // from class: X.0FGF
            public static final float LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            public static final float LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            public static final float LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            public final Paint LIZ;
            public final Paint LIZIZ;
            public final Paint LIZJ;
            public final int LIZLLL;
            public final Path LJ;
            public final Path LJFF;
            public final Path LJI;
            public final Path LJII;
            public final Path LJIIIIZZ;

            {
                Paint paint = new Paint(1);
                this.LIZ = paint;
                Paint paint2 = new Paint(1);
                this.LIZIZ = paint2;
                Paint paint3 = new Paint(1);
                this.LIZJ = paint3;
                this.LIZLLL = Integer.MIN_VALUE;
                this.LJ = new Path();
                this.LJFF = new Path();
                this.LJI = new Path();
                this.LJII = new Path();
                this.LJIIIIZZ = new Path();
                paint.setColor(-1);
                float f = LJIIIZ;
                paint.setStrokeWidth(f);
                paint.setStyle(Paint.Style.STROKE);
                paint2.setColor(-2130706433);
                paint2.setStrokeWidth(f);
                paint2.setStyle(Paint.Style.STROKE);
                paint3.setColor(-1);
                paint3.setStrokeWidth(LJIIJ);
                paint3.setStyle(Paint.Style.STROKE);
            }

            @Override // X.InterfaceC389890FQl
            public final void LIZ(Canvas canvas, Rect rect) {
                RectF rectF = new RectF(rect);
                int iSave = canvas.save();
                try {
                    this.LJIIIIZZ.reset();
                    this.LJIIIIZZ.addRect(rectF, Path.Direction.CW);
                    this.LJIIIIZZ.setFillType(Path.FillType.INVERSE_WINDING);
                    canvas.clipPath(this.LJIIIIZZ);
                    canvas.drawColor(this.LIZLLL);
                    canvas.restoreToCount(iSave);
                    float f = (rect.right - rect.left) / 3.0f;
                    float f2 = (rect.bottom - rect.top) / 3.0f;
                    int i = 1;
                    do {
                        float f3 = i;
                        float f4 = rect.left + (f3 * f);
                        canvas.drawLine(f4, rect.top, f4, rect.bottom, this.LIZIZ);
                        float f5 = rect.top + (f3 * f2);
                        canvas.drawLine(rect.left, f5, rect.right, f5, this.LIZIZ);
                        i++;
                    } while (i < 3);
                    float f6 = rect.left;
                    float f7 = rect.top;
                    float f8 = 2;
                    float f9 = LJIIIZ / f8;
                    float f10 = f7 + f9;
                    canvas.drawLine(f6, f10, rect.right, f10, this.LIZ);
                    float f11 = rect.left + f9;
                    canvas.drawLine(f11, rect.top, f11, rect.bottom, this.LIZ);
                    float f12 = rect.right - f9;
                    canvas.drawLine(f12, rect.top, f12, rect.bottom, this.LIZ);
                    float f13 = rect.bottom - f9;
                    canvas.drawLine(rect.left, f13, rect.right, f13, this.LIZ);
                    this.LJ.reset();
                    Path path = this.LJ;
                    float f14 = rect.left;
                    float f15 = LJIIJ / f8;
                    float f16 = rect.top;
                    float f18 = LJIIJJI;
                    path.moveTo(f14 + f15, f16 + f18 + f15);
                    this.LJ.lineTo(rect.left + f15, rect.top + f15);
                    this.LJ.lineTo(rect.left + f18 + f15, rect.top + f15);
                    canvas.drawPath(this.LJ, this.LIZJ);
                    this.LJFF.reset();
                    this.LJFF.moveTo(rect.left + f18 + f15, rect.bottom - f15);
                    this.LJFF.lineTo(rect.left + f15, rect.bottom - f15);
                    this.LJFF.lineTo(rect.left + f15, (rect.bottom - f18) - f15);
                    canvas.drawPath(this.LJFF, this.LIZJ);
                    this.LJI.reset();
                    this.LJI.moveTo((rect.right - f18) - f15, rect.top + f15);
                    this.LJI.lineTo(rect.right - f15, rect.top + f15);
                    this.LJI.lineTo(rect.right - f15, rect.top + f18 + f15);
                    canvas.drawPath(this.LJI, this.LIZJ);
                    this.LJII.reset();
                    this.LJII.moveTo((rect.right - f18) - f15, rect.bottom - f15);
                    this.LJII.lineTo(rect.right - f15, rect.bottom - f15);
                    this.LJII.lineTo(rect.right - f15, (rect.bottom - f18) - f15);
                    canvas.drawPath(this.LJII, this.LIZJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
        };
        this.LLJ = new Region();
        this.LLJI = new Region();
        this.LLJIJIL = new Region();
        this.LLJILJIL = new Region();
        this.LLJILJILJ = new Region();
        this.LLJILLL = new Region();
        this.LLJJ = new Region();
        this.LLJJI = new Region();
        this.LLJJIII = EnumC375190EnN.FREE;
        this.LLJJIJI = EnumC389810FQd.OUT_OF_BOUNDS;
        this.LLJJIJIIJIL = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJ = valueAnimatorOfFloat;
        this.LLJJJIL = 1.0f;
        this.LLJJJJJIL = -1.0f;
        this.LLJJL = new C389850FQh();
        this.LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        if (((Boolean) C275410Aqp.LIZ.getValue()).booleanValue() && this.LLJL == null) {
            this.LLJL = C20298714bh.LIZ(this, new AwS584S0100000_5(this, 1216));
        }
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 7));
    }

    public final boolean LIZLLL(int i, int i2) {
        if (this.LLJ.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.LEFT_TOP;
            return true;
        }
        if (this.LLJIJIL.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.RIGHT_TOP;
            return true;
        }
        if (this.LLJI.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.LEFT_BOTTOM;
            return true;
        }
        if (this.LLJILJIL.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.RIGHT_BOTTOM;
            return true;
        }
        if (this.LLJILJILJ.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.LEFT;
            return true;
        }
        if (this.LLJILLL.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.TOP;
            return true;
        }
        if (this.LLJJ.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.RIGHT;
            return true;
        }
        if (this.LLJJI.contains(i, i2)) {
            this.LLJJIJI = EnumC389810FQd.BOTTOM;
            return true;
        }
        this.LLJJIJI = EnumC389810FQd.OUT_OF_BOUNDS;
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            size = View.MeasureSpec.getSize(i);
        } else {
            size = this.LLJJL.LJ;
        }
        if (mode2 == 1073741824) {
            size2 = View.MeasureSpec.getSize(i2);
        } else {
            size2 = this.LLJJL.LJFF;
        }
        EnumC375190EnN enumC375190EnN = this.LLJJIII;
        if (enumC375190EnN != EnumC375190EnN.FREE) {
            this.LLILZ = LIZIZ(LIZJ(enumC375190EnN));
        } else {
            float f = this.LLJJJJJIL;
            if (f > 0.0f) {
                this.LLILZ = LIZIZ(f);
            }
        }
        setMeasuredDimension(size, size2);
    }
}
