package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340910DYb extends LinearLayout implements InterfaceC1860810yWV {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;

    @Override // X.InterfaceC1860810yWV
    public final void LIZIZ(Float f, Float f2, Float f3, Float f4) {
    }

    @Override // X.InterfaceC1860810yWV
    public void setBackgroundDrawColor(int i) {
    }

    @Override // X.InterfaceC1860810yWV
    public void setCornerRadius(float f) {
    }

    public void setEnableGradientEffect(boolean z) {
    }

    public void setHighLightDrawColor(int i) {
    }

    public void setStrokeDrawColor(int i) {
    }

    @Override // X.InterfaceC1860810yWV
    public float getClickX() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1860810yWV
    public float getClickY() {
        return this.LLILZLL;
    }

    public int getDrawType() {
        return this.LLILLL;
    }

    public boolean getHasLeftTail() {
        return this.LL;
    }

    public boolean getHasRightTail() {
        return this.LLILLJJLI;
    }

    public float getIndentation() {
        return this.LLILZ;
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

    public void setClickX(float f) {
        this.LLILZIL = f;
    }

    public void setClickY(float f) {
        this.LLILZLL = f;
    }

    public void setDrawType(int i) {
        this.LLILLL = i;
    }

    @Override // X.InterfaceC1860810yWV
    public void setHasLeftTail(boolean z) {
        this.LL = z;
    }

    public void setHasRightTail(boolean z) {
        this.LLILLJJLI = z;
    }

    public void setIndentation(float f) {
        this.LLILZ = f;
    }

    @Override // X.InterfaceC1860810yWV
    public void setUI(Function1<? super C14IN, Unit> function1) {
        C14IN c14in = new C14IN(0);
        function1.invoke(c14in);
        Integer num = c14in.LJI;
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = iIntValue;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
        Integer num2 = c14in.LJII;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = iIntValue2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams2);
        }
        Rect rect = c14in.LJIIIIZZ;
        if (rect != null) {
            C426750GoL.LJIIIZ(this, Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom), false, 16);
        }
    }

    public C340910DYb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.LLILZ = 1.0f;
        setOrientation(1);
    }

    @Override // X.InterfaceC1860810yWV
    public final void LIZ(int i, boolean z, boolean z2, View view, Float f, Float f2, Float f3, Float f4, boolean z3) {
        int marginStart;
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (f3 != null || f4 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int iLIZIZ2 = 0;
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
