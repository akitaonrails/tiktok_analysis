package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368910EdF extends HorizontalScrollView implements InterfaceC358560E3y {
    public final RelativeLayout LL;
    public final C358530E3v LLILLJJLI;
    public C368250EcB LLILLL;
    public C370920EgU LLILZ;
    public int LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public final AwS619S0100000_5 LLIZ;
    public boolean LLIZLLLIL;

    public final long getCurTimePosition() {
        if (this.LLILLL == null) {
            return 0L;
        }
        return (long) Math.floor(getScrollX() / r0.getPxPerMs());
    }

    @Override // X.InterfaceC358560E3y
    public C358550E3x getFrameData() {
        C368250EcB c368250EcB = this.LLILLL;
        float pxPerMs = c368250EcB != null ? c368250EcB.getPxPerMs() : 1.0f;
        C368250EcB c368250EcB2 = this.LLILLL;
        return new C358550E3x(pxPerMs, c368250EcB2 != null ? c368250EcB2.getFrameWidth() : 0);
    }

    public final int getRootLeftPadding() {
        return this.LL.getPaddingLeft();
    }

    public final float getVideoFrameScale() {
        C368250EcB c368250EcB = this.LLILLL;
        if (c368250EcB != null) {
            return c368250EcB.getPxPerMs();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC358560E3y
    public int getCurScrollX() {
        return getScrollX();
    }

    @Override // X.InterfaceC358560E3y
    public final void LIZ(int i) {
        C368250EcB c368250EcB = this.LLILLL;
        if (c368250EcB != null) {
            c368250EcB.postInvalidate();
        }
    }

    public final void LIZJ(int i) {
        C368250EcB c368250EcB;
        C368250EcB c368250EcB2 = this.LLILLL;
        if (c368250EcB2 != null) {
            c368250EcB2.setStepDuration(1000.0f);
        }
        if (i > 0 && (c368250EcB = this.LLILLL) != null) {
            c368250EcB.setMaxRepeatCount(i);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLIZLLLIL) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setEnableScroll(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setPreInitRect(Rect rect) {
        Rect preInitVisibleRect;
        C368250EcB c368250EcB = this.LLILLL;
        if (c368250EcB != null && (preInitVisibleRect = c368250EcB.getPreInitVisibleRect()) != null) {
            preInitVisibleRect.set(rect);
        }
    }

    public final void setScrollXListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setVideoFrameScale(float f) {
        C368250EcB c368250EcB = this.LLILLL;
        if (c368250EcB != null) {
            c368250EcB.setPxPerMs(f);
        }
    }

    public final void setVideoFrameWidth(int i) {
        C368250EcB c368250EcB = this.LLILLL;
        if (c368250EcB != null) {
            c368250EcB.setFrameWidth(i);
        }
    }

    public C368910EdF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.LL = relativeLayout;
        this.LLILLJJLI = new C358530E3v(getContext(), this);
        int iLIZJ = C0FU0.LIZJ(C0EHL.LIZ()) / 2;
        this.LLIZ = new AwS619S0100000_5(this, 68);
        this.LLIZLLLIL = true;
        setHorizontalScrollBarEnabled(false);
        addView(relativeLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        C369030EdR.LIZJ(relativeLayout, iLIZJ, 0, iLIZJ, 0);
    }

    public final void LIZIZ(List<? extends NLETrackSlot> list, C370920EgU c370920EgU) {
        int marginStart;
        C358530E3v c358530E3v = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        c358530E3v.LJI = marginStart;
        this.LLILLJJLI.LJ = list;
        if (this.LLILLL == null) {
            C368250EcB c368250EcB = new C368250EcB(getContext());
            c368250EcB.setFrameFetcher(this.LLIZ);
            this.LL.addView(c368250EcB, 0, new FrameLayout.LayoutParams(-2, -1));
            this.LLILLL = c368250EcB;
        }
        C368250EcB c368250EcB2 = this.LLILLL;
        if (c368250EcB2 != null) {
            c368250EcB2.setData(list);
        }
        this.LLILZ = c370920EgU;
        C23250099c.LIZLLL(c370920EgU, c370920EgU.LLJILJIL, null, new C358360E3e(c370920EgU, this.LLILLJJLI, null), 2);
        c370920EgU.LJFF(false);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int frameWidth;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LLILLL != null) {
            int iAbs = Math.abs(getScrollX() - this.LLILZIL);
            C368250EcB c368250EcB = this.LLILLL;
            if (c368250EcB != null) {
                frameWidth = c368250EcB.getFrameWidth();
            } else {
                frameWidth = 0;
            }
            if (iAbs >= frameWidth * 5) {
                C370920EgU c370920EgU = this.LLILZ;
                if (c370920EgU != null) {
                    c370920EgU.LJFF(false);
                }
                this.LLILZIL = getScrollX();
            }
        }
        C368250EcB c368250EcB2 = this.LLILLL;
        if (c368250EcB2 != null) {
            c368250EcB2.postInvalidate();
        }
        Function1<? super Integer, Unit> function1 = this.LLILZLL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(getScrollX()));
        }
    }
}
