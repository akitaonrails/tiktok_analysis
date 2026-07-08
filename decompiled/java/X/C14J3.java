package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.14J3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14J3 extends LinearLayout implements InterfaceC1860810yWV {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public final Paint LLIZ;
    public final Paint LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;
    public final Path LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;

    public void setEnableGradientEffect(boolean z) {
    }

    private final Paint getHighLightPaint() {
        return (Paint) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1860810yWV
    public float getClickX() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1860810yWV
    public float getClickY() {
        return this.LLJJIII;
    }

    public int getDrawType() {
        return this.LLILZIL;
    }

    public boolean getHasLeftTail() {
        return this.LL;
    }

    public boolean getHasRightTail() {
        return this.LLILLJJLI;
    }

    public float getIndentation() {
        return this.LLILZLL;
    }

    public final float LIZJ(float f) {
        float measuredHeight = (getMeasuredHeight() / 2.0f) - 1.0f;
        if (f > measuredHeight) {
            return measuredHeight;
        }
        return f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float fLIZIZ;
        float fLIZIZ2;
        float f;
        int i;
        boolean hasLeftTail = getHasLeftTail();
        Float fValueOf = Float.valueOf(4.0f);
        if (!hasLeftTail && !this.LLILLL) {
            fLIZIZ = 0.0f;
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(fValueOf);
        }
        if (!getHasRightTail() && !this.LLILZ) {
            fLIZIZ2 = 0.0f;
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf);
        }
        float indentation = getIndentation();
        float measuredHeight = (-getIndentation()) + getMeasuredHeight();
        float indentation2 = getIndentation() + fLIZIZ;
        float measuredWidth = ((-getIndentation()) + getMeasuredWidth()) - fLIZIZ2;
        float fLIZJ = LIZJ(this.LLJILJIL);
        float fLIZJ2 = LIZJ(this.LLJILJILJ);
        float fLIZJ3 = LIZJ(this.LLJJ);
        float fLIZJ4 = LIZJ(this.LLJILLL);
        this.LLJIJIL.reset();
        this.LLJIJIL.moveTo(indentation2 + fLIZJ, indentation);
        this.LLJIJIL.lineTo(measuredWidth - fLIZJ2, indentation);
        float f2 = 2;
        float f3 = fLIZJ2 * f2;
        this.LLJIJIL.arcTo(new RectF(measuredWidth - f3, indentation, measuredWidth, f3 + indentation), 270.0f, 90.0f);
        if (getHasRightTail()) {
            this.LLJIJIL.lineTo(measuredWidth, measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(9.0f))));
            this.LLJIJIL.cubicTo(measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.0f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.0f))), measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.7f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.0f))), measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.7f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.0f))));
            this.LLJIJIL.lineTo(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.1f))) + measuredWidth, measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.7f))));
            this.LLJIJIL.cubicTo(measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.7f))), measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))));
            this.LLJIJIL.cubicTo(measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))) + measuredWidth, measuredHeight, measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), measuredHeight);
        } else {
            this.LLJIJIL.lineTo(measuredWidth, measuredHeight - fLIZJ4);
            float f4 = fLIZJ4 * f2;
            this.LLJIJIL.arcTo(new RectF(measuredWidth - f4, measuredHeight - f4, measuredWidth, measuredHeight), 0.0f, 90.0f);
        }
        if (getHasLeftTail()) {
            this.LLJIJIL.lineTo(indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), measuredHeight);
            f = 90.0f;
            i = 2;
            this.LLJIJIL.cubicTo(indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight, indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))), indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))));
            this.LLJIJIL.cubicTo(indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.7f))), indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.1f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.7f))), indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.1f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(3.7f))));
            this.LLJIJIL.lineTo(indentation2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.7f))), measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(5.0f))));
            this.LLJIJIL.cubicTo(indentation2, measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f))), indentation2, measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(9.0f))), indentation2, measuredHeight - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(9.0f))));
        } else {
            f = 90.0f;
            i = 2;
            this.LLJIJIL.lineTo(indentation2 + fLIZJ3, measuredHeight);
            float f5 = f2 * fLIZJ3;
            this.LLJIJIL.arcTo(new RectF(indentation2, measuredHeight - f5, f5 + indentation2, measuredHeight), 90.0f, 90.0f);
        }
        this.LLJIJIL.lineTo(indentation2, indentation + fLIZJ);
        float f6 = f2 * fLIZJ;
        this.LLJIJIL.arcTo(new RectF(indentation2, indentation, indentation2 + f6, f6 + indentation), 180.0f, f);
        canvas.save();
        if (C444960Hcc.LIZIZ()) {
            canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        int drawType = getDrawType();
        if (drawType != 0) {
            if (drawType != 1) {
                if (drawType == i) {
                    canvas.drawPath(this.LLJIJIL, this.LLIZ);
                    canvas.drawPath(this.LLJIJIL, this.LLIZLLLIL);
                }
            } else {
                canvas.drawPath(this.LLJIJIL, this.LLIZLLLIL);
            }
        } else {
            canvas.drawPath(this.LLJIJIL, this.LLIZ);
        }
        if (this.LLJ) {
            canvas.drawPath(this.LLJIJIL, getHighLightPaint());
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            setClickX(motionEvent.getX());
            setClickY(motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, X.InterfaceC1860810yWV
    public final void getLocationInWindow(int[] iArr) {
        super.getLocationInWindow(iArr);
    }

    @Override // X.InterfaceC1860810yWV
    public void setBackgroundDrawColor(int i) {
        this.LLIZ.setColor(i);
    }

    public void setClickX(float f) {
        this.LLJJI = f;
    }

    public void setClickY(float f) {
        this.LLJJIII = f;
    }

    @Override // X.InterfaceC1860810yWV
    public void setCornerRadius(float f) {
        LIZIZ(Float.valueOf(f), Float.valueOf(f), Float.valueOf(f), Float.valueOf(f));
    }

    public void setDrawType(int i) {
        this.LLILZIL = i;
    }

    @Override // X.InterfaceC1860810yWV
    public void setHasLeftTail(boolean z) {
        this.LL = z;
    }

    public void setHasRightTail(boolean z) {
        this.LLILLJJLI = z;
    }

    public void setHighLightDrawColor(int i) {
        getHighLightPaint().setColor(i);
    }

    public void setIndentation(float f) {
        this.LLILZLL = f;
    }

    public void setStrokeDrawColor(int i) {
        Paint paint = this.LLIZLLLIL;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
    }

    @Override // X.InterfaceC1860810yWV
    public void setUI(Function1<? super C14IN, Unit> function1) {
        C14IN c14in = new C14IN(0);
        function1.invoke(c14in);
        Integer num = c14in.LIZ;
        if (num != null) {
            setDrawType(num.intValue());
        }
        Float f = c14in.LJ;
        if (f != null) {
            setCornerRadius(f.floatValue());
        }
        C14J5 c14j5 = c14in.LJFF;
        if (c14j5 != null) {
            LIZIZ(Float.valueOf(c14j5.LIZ), Float.valueOf(c14j5.LIZIZ), Float.valueOf(c14j5.LIZLLL), Float.valueOf(c14j5.LIZJ));
        }
        Integer num2 = c14in.LIZIZ;
        if (num2 != null) {
            setStrokeDrawColor(num2.intValue());
        }
        Integer num3 = c14in.LIZJ;
        if (num3 != null) {
            setBackgroundDrawColor(num3.intValue());
        }
        Integer num4 = c14in.LIZLLL;
        if (num4 != null) {
            int iIntValue = num4.intValue();
            this.LLJ = true;
            setHighLightDrawColor(iIntValue);
        } else {
            this.LLJ = false;
        }
        Integer num5 = c14in.LJI;
        if (num5 != null) {
            int iIntValue2 = num5.intValue();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = iIntValue2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
        Integer num6 = c14in.LJII;
        if (num6 != null) {
            int iIntValue3 = num6.intValue();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = iIntValue3;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams2);
        }
        Rect rect = c14in.LJIIIIZZ;
        if (rect != null) {
            C426750GoL.LJIIIZ(this, Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom), false, 16);
        }
        Integer num7 = c14in.LJIIIZ;
        if (num7 != null) {
            int iIntValue4 = num7.intValue();
            C426750GoL.LJIIL(this, Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue4), 16);
        }
        Rect rect2 = c14in.LJIIJ;
        if (rect2 != null) {
            C426750GoL.LJIIL(this, Integer.valueOf(rect2.left), Integer.valueOf(rect2.top), Integer.valueOf(rect2.right), Integer.valueOf(rect2.bottom), 16);
        }
        Float f2 = c14in.LJIIJJI;
        if (f2 != null) {
            setIndentation(f2.floatValue());
        }
        invalidate();
    }

    public C14J3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.LLILZLL = 1.0f;
        Paint paint = new Paint();
        this.LLIZ = paint;
        this.LLIZLLLIL = new Paint();
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(552));
        this.LLJIJIL = new Path();
        Float fValueOf = Float.valueOf(20.0f);
        this.LLJILJIL = C418440Gaw.LIZIZ(fValueOf);
        this.LLJILJILJ = C418440Gaw.LIZIZ(fValueOf);
        this.LLJILLL = C418440Gaw.LIZIZ(fValueOf);
        this.LLJJ = C418440Gaw.LIZIZ(fValueOf);
        paint.setAntiAlias(true);
        paint.setColor(0);
        setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(44.0f))));
        setOrientation(1);
    }

    @Override // X.InterfaceC1860810yWV
    public final void LIZIZ(Float f, Float f2, Float f3, Float f4) {
        if (f != null) {
            this.LLJILJIL = f.floatValue();
        }
        if (f2 != null) {
            f2.floatValue();
            this.LLJILJILJ = f2.floatValue();
        }
        if (f3 != null) {
            f3.floatValue();
            this.LLJILLL = f3.floatValue();
        }
        if (f4 != null) {
            f4.floatValue();
            this.LLJJ = f4.floatValue();
        }
    }

    @Override // X.InterfaceC1860810yWV
    public final void LIZ(int i, boolean z, boolean z2, View view, Float f, Float f2, Float f3, Float f4, boolean z3) {
        float fLIZIZ;
        float fLIZIZ2;
        int marginStart;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        float fLIZIZ3;
        float fLIZIZ4;
        float fLIZIZ5;
        float fLIZIZ6;
        float fLIZIZ7;
        float fLIZIZ8;
        Float fValueOf = Float.valueOf(20.0f);
        this.LLJILJIL = C418440Gaw.LIZIZ(fValueOf);
        this.LLJILJILJ = C418440Gaw.LIZIZ(fValueOf);
        this.LLJJ = C418440Gaw.LIZIZ(fValueOf);
        this.LLJILLL = C418440Gaw.LIZIZ(fValueOf);
        int iLIZIZ2 = 0;
        setHasLeftTail(false);
        setHasRightTail(false);
        this.LLILLL = false;
        this.LLILZ = false;
        Float fValueOf2 = Float.valueOf(8.0f);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (z) {
                            this.LLJILJIL = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                            this.LLJJ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                            setHasLeftTail(true);
                        }
                        if (z2) {
                            this.LLJILJILJ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                            this.LLJILLL = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                            setHasRightTail(true);
                        }
                        if (view != null) {
                            int paddingLeft = view.getPaddingLeft();
                            if (f != null) {
                                fLIZIZ7 = C418440Gaw.LIZIZ(f);
                            } else {
                                fLIZIZ7 = C418440Gaw.LIZIZ(Float.valueOf(3.0f));
                            }
                            int iLIZIZ3 = C814420VxA.LIZIZ(fLIZIZ7);
                            int paddingRight = view.getPaddingRight();
                            if (f2 != null) {
                                fLIZIZ8 = C418440Gaw.LIZIZ(f2);
                            } else {
                                fLIZIZ8 = C418440Gaw.LIZIZ(fValueOf2);
                            }
                            view.setPadding(paddingLeft, iLIZIZ3, paddingRight, C814420VxA.LIZIZ(fLIZIZ8));
                        }
                    }
                } else {
                    if (z) {
                        this.LLILLL = true;
                        this.LLJILJIL = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                        this.LLJJ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                    }
                    if (z2) {
                        this.LLILZ = true;
                        this.LLJILJILJ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                        this.LLJILLL = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                    }
                    if (view != null) {
                        int paddingLeft2 = view.getPaddingLeft();
                        if (f != null) {
                            fLIZIZ5 = C418440Gaw.LIZIZ(f);
                        } else {
                            fLIZIZ5 = C418440Gaw.LIZIZ(Float.valueOf(3.0f));
                        }
                        int iLIZIZ4 = C814420VxA.LIZIZ(fLIZIZ5);
                        int paddingRight2 = view.getPaddingRight();
                        if (f2 != null) {
                            fLIZIZ6 = C418440Gaw.LIZIZ(f2);
                        } else {
                            fLIZIZ6 = C418440Gaw.LIZIZ(Float.valueOf(3.0f));
                        }
                        view.setPadding(paddingLeft2, iLIZIZ4, paddingRight2, C814420VxA.LIZIZ(fLIZIZ6));
                    }
                }
            } else {
                if (z) {
                    this.LLILLL = true;
                    this.LLJJ = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                }
                if (z2) {
                    this.LLILZ = true;
                    this.LLJILLL = C418440Gaw.LIZIZ(Float.valueOf(5.0f));
                }
                if (view != null) {
                    int paddingLeft3 = view.getPaddingLeft();
                    if (f != null) {
                        fLIZIZ3 = C418440Gaw.LIZIZ(f);
                    } else {
                        fLIZIZ3 = C418440Gaw.LIZIZ(fValueOf2);
                    }
                    int iLIZIZ5 = C814420VxA.LIZIZ(fLIZIZ3);
                    int paddingRight3 = view.getPaddingRight();
                    if (f2 != null) {
                        fLIZIZ4 = C418440Gaw.LIZIZ(f2);
                    } else {
                        fLIZIZ4 = C418440Gaw.LIZIZ(Float.valueOf(3.0f));
                    }
                    view.setPadding(paddingLeft3, iLIZIZ5, paddingRight3, C814420VxA.LIZIZ(fLIZIZ4));
                }
            }
        } else {
            if (z) {
                setHasLeftTail(true);
            }
            if (z2) {
                setHasRightTail(true);
            }
            if (view != null) {
                int paddingLeft4 = view.getPaddingLeft();
                if (f != null) {
                    fLIZIZ = C418440Gaw.LIZIZ(f);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(fValueOf2);
                }
                int iLIZIZ6 = C814420VxA.LIZIZ(fLIZIZ);
                int paddingRight4 = view.getPaddingRight();
                if (f2 != null) {
                    fLIZIZ2 = C418440Gaw.LIZIZ(f2);
                } else {
                    fLIZIZ2 = C418440Gaw.LIZIZ(fValueOf2);
                }
                view.setPadding(paddingLeft4, iLIZIZ6, paddingRight4, C814420VxA.LIZIZ(fLIZIZ2));
            }
        }
        if (f3 != null || f4 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            if (f3 != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(f3));
            } else {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    iLIZIZ = marginLayoutParams.topMargin;
                } else {
                    iLIZIZ = 0;
                }
            }
            Integer numValueOf2 = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            if (f4 != null) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(f4));
            } else {
                ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    iLIZIZ2 = marginLayoutParams2.bottomMargin;
                }
            }
            C426750GoL.LJIIIZ(this, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(iLIZIZ2), false, 16);
        }
    }
}
