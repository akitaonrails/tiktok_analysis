package X;

import Y.ARunnableS9S0100001_29;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19762412Tu extends RelativeLayout implements InterfaceC19755712Rf {
    public final ImageView LL;
    public final C19756012Ri LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public InterfaceC19756212Rk LLJI;
    public final InterfaceC19762512Tv LLJIJIL;

    @Override // X.InterfaceC19755712Rf
    public final void LIZIZ() {
        this.LLILLJJLI.invalidate();
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LIZLLL() {
        if (this.LLILLJJLI.getMStack().empty()) {
            return null;
        }
        Point pointPop = this.LLILLJJLI.getMStack().pop();
        LIZIZ();
        return pointPop;
    }

    public final void LJFF() {
        this.LLILZIL = this.LLILLL;
        this.LLILZLL = getWidth() - this.LLILLL;
        this.LLIZ = this.LLILZIL - (this.LL.getWidth() / 2);
        this.LLIZLLLIL = this.LLILZLL - (this.LL.getWidth() / 2);
    }

    @Override // X.InterfaceC19755712Rf
    public Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.LLILLJJLI.getMStack());
        return stack;
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZJ(int i) {
        if (i >= this.LLJ - 1) {
            return i;
        }
        for (Point point : this.LLILLJJLI.getMStack()) {
            if (i >= point.getX() && i < point.getY()) {
                return point.getX();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC19755712Rf
    public final Point LJ(int i) {
        return this.LLILLJJLI.getMStack().push(new Point(i, i, System.currentTimeMillis()));
    }

    public final void LJII(int i) {
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

    @Override // X.InterfaceC19755712Rf
    public final void LJIILL(float f) {
        HandlerHook.viewPost(this, new ARunnableS9S0100001_29(this, f, 0));
    }

    @Override // X.InterfaceC19755712Rf
    public void setStack(Stack<Point> stack) {
        this.LLILLJJLI.getMStack().clear();
        if (!C086I.LIZIZ(stack)) {
            this.LLILLJJLI.getMStack().addAll(stack);
        }
        LIZIZ();
    }

    public C19762412Tu(Context context, InterfaceC19762512Tv interfaceC19762512Tv) {
        super(context);
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = 1;
        this.LL = new ImageView(context);
        this.LLILLJJLI = new C19756012Ri(context);
        this.LLJIJIL = interfaceC19762512Tv;
    }

    @Override // X.InterfaceC19755712Rf
    public final int LIZ(int i, Point point) {
        int x;
        if (point != null) {
            x = point.getX();
        } else {
            x = i;
        }
        for (Point point2 : this.LLILLJJLI.getMStack()) {
            if (point2.getX() >= x && i >= point2.getX() && i <= point2.getY() && !Intrinsics.LJFF(point2, point)) {
                return point2.getX();
            }
        }
        return -1;
    }

    public final void LJI(float f, View view, boolean z) {
        if (this.LLJIJIL.LJLJJLL()) {
            return;
        }
        LJFF();
        int i = (int) f;
        int i2 = this.LLIZ;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = this.LLIZLLLIL;
        if (i2 > i3) {
            i2 = i3;
        }
        LJII(i2);
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
        if (C1388580mEq.LIZIZ(getContext())) {
            width = 1 - width;
        }
        InterfaceC19756212Rk interfaceC19756212Rk = this.LLJI;
        if (interfaceC19756212Rk != null) {
            interfaceC19756212Rk.LIZ(width, z);
        }
    }
}
