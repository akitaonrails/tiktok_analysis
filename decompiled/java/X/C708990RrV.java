package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import avg.f;
import kotlin.jvm.internal.AwS412S0200000_11;
import mf.a;

/* JADX INFO: renamed from: X.0RrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C708990RrV extends LinearLayout implements InterfaceC703980RjQ, InterfaceC20688015xO {
    public boolean LL;
    public int LLILLJJLI;
    public InterfaceC709010RrX LLILLL;
    public InterfaceC703970RjP LLILZ;

    public InterfaceC709010RrX getGestureInterceptor() {
        return this.LLILLL;
    }

    public final boolean getGroupClickable() {
        return this.LL;
    }

    public final int getHintTextRes() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC703980RjQ
    public final void LJ(C709410RsB c709410RsB) {
        this.LLILZ = c709410RsB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C700560Rdu.LIZIZ(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 71));
        }
        if (!this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC709010RrX gestureInterceptor = getGestureInterceptor();
        if (gestureInterceptor != null) {
            return gestureInterceptor.LIZIZ(motionEvent, new AwS412S0200000_11(this, motionEvent, 72));
        }
        if (this.LL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC20688015xO
    public void setGestureInterceptor(InterfaceC709010RrX interfaceC709010RrX) {
        this.LLILLL = interfaceC709010RrX;
    }

    public final void setGroupClickable(boolean z) {
        this.LL = z;
    }

    public final void setHintTextRes(int i) {
        this.LLILLJJLI = i;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        InterfaceC703970RjP interfaceC703970RjP;
        super.setLayoutParams(layoutParams);
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (interfaceC703970RjP = this.LLILZ) != null) {
            interfaceC703970RjP.LIZIZ(this);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (C700560Rdu.LIZ(this, i, this)) {
            return;
        }
        super.setVisibility(i);
    }

    public C708990RrV(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
        this.LLILLJJLI = -1;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Rnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (this.LL.LLILLJJLI != -1) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZIZ(this.LL.LLILLJJLI);
                    c1233040iBy.LIZLLL();
                }
            }
        };
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // X.InterfaceC703980RjQ
    public final Object LIZIZ(int i, View view) {
        return C700560Rdu.LIZJ(view, i);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC703970RjP interfaceC703970RjP = this.LLILZ;
        if (interfaceC703970RjP != null) {
            interfaceC703970RjP.LIZJ(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0DR8.LJLLILLLL.getClass();
        if (C0DR7.LIZ(view) && super.drawChild(canvas, view, j)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC703970RjP interfaceC703970RjP;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i != i3 || i2 != i4) && (interfaceC703970RjP = this.LLILZ) != null) {
            interfaceC703970RjP.LIZ(this);
        }
    }
}
