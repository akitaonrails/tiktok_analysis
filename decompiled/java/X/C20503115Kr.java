package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20503115Kr extends View {
    public Function1<? super Float, Unit> LL;
    public Function1<? super Float, Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final RectF LLIZLLLIL;
    public Function1<? super MotionEvent, Unit> LLJ;

    public Function1<MotionEvent, Unit> getOnInterceptTouchListener() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnMoveDownListener() {
        return this.LLILLL;
    }

    public final Function1<Float, Unit> getOnMoveListener() {
        return this.LL;
    }

    public final Function1<Float, Unit> getOnMoveUpListener() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnSelectedListener() {
        return this.LLILZ;
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
                Function1<MotionEvent, Unit> onInterceptTouchListener = getOnInterceptTouchListener();
                if (onInterceptTouchListener != null) {
                    onInterceptTouchListener.invoke(motionEvent);
                }
                this.LLILZLL = motionEvent.getRawX();
                motionEvent.getX();
                this.LLIZ = motionEvent.getRawX();
                Function0<Unit> function0 = this.LLILLL;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                if (numValueOf.intValue() == 2) {
                    Function1<? super Float, Unit> function1 = this.LL;
                    if (function1 != null) {
                        function1.invoke(Float.valueOf(motionEvent.getRawX() - this.LLIZ));
                    }
                    this.LLIZ = motionEvent.getRawX();
                    return true;
                }
                if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                    float rawX = motionEvent.getRawX();
                    Function1<? super Float, Unit> function12 = this.LLILLJJLI;
                    if (function12 != null) {
                        function12.invoke(Float.valueOf(rawX - this.LLILZLL));
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public void setOnInterceptTouchListener(Function1<? super MotionEvent, Unit> function1) {
        this.LLJ = function1;
    }

    public final void setOnMoveDownListener(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnMoveListener(Function1<? super Float, Unit> function1) {
        this.LL = function1;
    }

    public final void setOnMoveUpListener(Function1<? super Float, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setOnSelectedListener(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setScale(float f) {
        this.LLILZIL = f;
    }

    public C20503115Kr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20503115Kr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = new RectF();
    }
}
