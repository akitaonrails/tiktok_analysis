package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371430EhJ extends View {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public Function2<? super Float, ? super Boolean, Unit> LL;
    public Function1<? super Boolean, Unit> LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final RectF LLILZLL;
    public final RectF LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public EnumC310850CGl LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public final int LLJJIJI;

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final Function1<Boolean, Unit> getOnDragStateChanged() {
        return this.LLILLJJLI;
    }

    public final Function2<Float, Boolean, Unit> getOnSeekChanged() {
        return this.LL;
    }

    public final float getProgressRatio() {
        return this.LLIZLLLIL;
    }

    public final void LIZIZ(boolean z) {
        if (this.LLJ == z) {
            return;
        }
        this.LLJ = z;
        invalidate();
        Function1<? super Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void LIZJ(float f) {
        float width = getWidth() - (2 * 0.0f);
        if (width <= 0.0f) {
            return;
        }
        float fLIZLLL = C13LZ.LIZLLL((f - 0.0f) / width, 0.0f, 1.0f);
        if (C444960Hcc.LIZIZ()) {
            fLIZLLL = 1.0f - fLIZLLL;
        }
        LIZ(fLIZLLL, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371430EhJ.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    LIZIZ(false);
                    return true;
                }
                LIZJ(motionEvent.getX());
                return true;
            }
            LIZJ(motionEvent.getX());
            LIZIZ(false);
            super.performClick();
            return true;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        LIZIZ(true);
        LIZJ(motionEvent.getX());
        return true;
    }

    public final void setDisplayMode(EnumC310850CGl enumC310850CGl) {
        if (this.LLJI == enumC310850CGl) {
            return;
        }
        this.LLJI = enumC310850CGl;
        invalidate();
    }

    public final void setOnDragStateChanged(Function1<? super Boolean, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setOnSeekChanged(Function2<? super Float, ? super Boolean, Unit> function2) {
        this.LL = function2;
    }

    public C371430EhJ(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eb, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStyle(Paint.Style.FILL);
        this.LLILLL = paint;
        Paint paint2 = new Paint(1);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.eb, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint2.setColor(iIntValue2);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILZ = paint2;
        Paint paint3 = new Paint(1);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, context);
        paint3.setColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILZIL = paint3;
        this.LLILZLL = new RectF();
        this.LLIZ = new RectF();
        this.LLJI = EnumC310850CGl.NORMAL;
        this.LLJIJIL = C418440Gaw.LIZIZ(4);
        this.LLJILJIL = C418440Gaw.LIZIZ(12);
        this.LLJILJILJ = C418440Gaw.LIZIZ(8);
        this.LLJILLL = C418440Gaw.LIZIZ(10);
        this.LLJJ = C418440Gaw.LIZIZ(16);
        this.LLJJI = C418440Gaw.LIZIZ(2);
        this.LLJJIII = C418440Gaw.LIZIZ(4);
        this.LLJJIJI = ColorProtector.parseColor("#A2A3A7");
    }

    public final void LIZ(float f, boolean z) {
        this.LLIZLLLIL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        invalidate();
        Function2<? super Float, ? super Boolean, Unit> function2 = this.LL;
        if (function2 != null) {
            function2.invoke(Float.valueOf(this.LLIZLLLIL), Boolean.valueOf(z));
        }
    }
}
