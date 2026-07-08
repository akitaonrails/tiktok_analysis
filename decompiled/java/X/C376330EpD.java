package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376330EpD extends AppCompatImageView {
    public float LL;
    public Function2<? super Float, ? super Float, Unit> LLILLJJLI;
    public Function1<? super Float, Unit> LLILLL;
    public Function1<? super Float, Unit> LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public float LLIZ;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
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

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (!this.LLILZIL) {
            return false;
        }
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILZLL = motionEvent.getRawX();
                this.LL = motionEvent.getX();
                this.LLIZ = motionEvent.getRawX();
                Function1<? super Float, Unit> function1 = this.LLILZ;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(this.LL));
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
                if (numValueOf.intValue() == 1) {
                    float rawX = motionEvent.getRawX();
                    Function1<? super Float, Unit> function12 = this.LLILLL;
                    if (function12 != null) {
                        function12.invoke(Float.valueOf(rawX - this.LLILZLL));
                        return true;
                    }
                }
            }
        }
        return true;
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

    public final void setTouchAble(boolean z) {
        this.LLILZIL = z;
    }

    public C376330EpD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C376330EpD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = true;
    }
}
