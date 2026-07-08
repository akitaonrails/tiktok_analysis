package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ef5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C370050Ef5 extends View {
    public float LL;
    public Function2<? super Float, ? super Float, Unit> LLILLJJLI;
    public Function1<? super Float, Unit> LLILLL;
    public Function1<? super Float, Unit> LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final RectF LLIZLLLIL;
    public Function1<? super MotionEvent, Boolean> LLJ;

    public Function1<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LLJ;
    }

    public final Function1<Float, Unit> getOnMoveDownListener() {
        return this.LLILZ;
    }

    public final Function2<Float, Float, Unit> getOnMoveListener() {
        return this.LLILLJJLI;
    }

    public final Function1<Float, Unit> getOnMoveUpListener() {
        return this.LLILLL;
    }

    public final float getScale() {
        return this.LLILZIL;
    }

    public final RectF getSelectFrameRect() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                Function1<MotionEvent, Boolean> onInterceptTouchListener = getOnInterceptTouchListener();
                if (onInterceptTouchListener != null && onInterceptTouchListener.invoke(motionEvent).booleanValue()) {
                    return false;
                }
                this.LLILZLL = motionEvent.getRawX();
                this.LL = motionEvent.getX();
                this.LLIZ = motionEvent.getRawX();
                Function1<? super Float, Unit> function1 = this.LLILZ;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(this.LL));
                    return true;
                }
            } else {
                if (numValueOf.intValue() == 2) {
                    Function2<? super Float, ? super Float, Unit> function2 = this.LLILLJJLI;
                    if (function2 != null) {
                        function2.invoke(Float.valueOf(motionEvent.getRawX() - this.LLIZ), Float.valueOf(motionEvent.getRawX()));
                    }
                    this.LLIZ = motionEvent.getRawX();
                    return true;
                }
                if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                    float rawX = motionEvent.getRawX();
                    Function1<? super Float, Unit> function12 = this.LLILLL;
                    if (function12 != null) {
                        function12.invoke(Float.valueOf(rawX - this.LLILZLL));
                    }
                }
            }
        }
        return true;
    }

    public void setOnInterceptTouchListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LLJ = function1;
    }

    public final void setOnMoveDownListener(Function1<? super Float, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setOnMoveListener(Function2<? super Float, ? super Float, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public final void setOnMoveUpListener(Function1<? super Float, Unit> function1) {
        this.LLILLL = function1;
    }

    public final void setScale(float f) {
        this.LLILZIL = f;
    }

    public C370050Ef5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C370050Ef5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new RectF();
    }
}
