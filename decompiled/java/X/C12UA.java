package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.Stack;

/* JADX INFO: renamed from: X.12UA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UA extends RelativeLayout {
    public final ImageView LL;
    public final C12UB LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public C12UL LLJI;
    public final C12U9 LLJIJIL;

    public final void LIZ() {
        this.LLILZIL = this.LLILLL;
        this.LLILZLL = getWidth() - this.LLILLL;
        this.LLIZ = this.LLILZIL - (this.LL.getWidth() / 2);
        this.LLIZLLLIL = this.LLILZLL - (this.LL.getWidth() / 2);
    }

    public final void LIZLLL() {
        this.LLILLJJLI.invalidate();
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.LLILLJJLI.getMStack());
        return stack;
    }

    public final void LIZJ(int i) {
        if (i < 0) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LL.getLayoutParams();
        if (C1388580mEq.LIZIZ(getContext())) {
            int i2 = this.LLIZ;
            if (i < i2) {
                i = i2;
            }
            int i3 = this.LLIZLLLIL;
            if (i > i3) {
                i = i3;
            }
            layoutParams.setMarginEnd(i);
        } else {
            int i4 = this.LLIZ;
            if (i < i4) {
                i = i4;
            }
            int i5 = this.LLIZLLLIL;
            if (i > i5) {
                i = i5;
            }
            layoutParams.leftMargin = i;
        }
        C786410Ut5.c6(this.LL, layoutParams);
    }

    public final void setStack(Stack<Point> stack) {
        this.LLILLJJLI.getMStack().clear();
        if (!C086I.LIZIZ(stack)) {
            this.LLILLJJLI.getMStack().addAll(stack);
        }
        LIZLLL();
    }

    public C12UA(C19EG c19eg, C12U9 c12u9) {
        super(c19eg);
        this.LL = new ImageView(c19eg);
        this.LLILLJJLI = new C12UB(c19eg);
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = 1;
        this.LLJIJIL = c12u9;
    }

    public final void LIZIZ(float f, View view, boolean z) {
        if (this.LLJIJIL.LLJJIII) {
            return;
        }
        LIZ();
        int i = (int) f;
        int i2 = this.LLIZ;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = this.LLIZLLLIL;
        if (i2 > i3) {
            i2 = i3;
        }
        LIZJ(i2);
        int i4 = this.LLIZ;
        if (i < i4) {
            i = i4;
        }
        int i5 = this.LLIZLLLIL;
        if (i > i5) {
            i = i5;
        }
        float width = ((i + (view.getWidth() / 2)) - this.LLILLL) / (this.LLILZLL - this.LLILZIL);
        if (width > 0.99d) {
            width = 1.0f;
        }
        if (width < 0.01d) {
            width = 0.0f;
        }
        C12UL c12ul = this.LLJI;
        if (c12ul != null) {
            c12ul.LIZ(width, z);
        }
    }
}
