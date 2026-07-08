package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS151S0110000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255641DQk extends ConstraintLayout implements C0IEW {
    public Function0<Unit> LL;
    public boolean LLILLJJLI;
    public final C2255611DQh LLILLL;

    @Override // X.C0IEW
    public final void LLIIZ(C0II6 c0ii6, boolean z, Function0<Unit> function0) {
    }

    @Override // X.C0IEW
    public final void LLJJJ(C0II6 c0ii6) {
    }

    @Override // X.C0IEW
    public boolean getEnableScroll() {
        return this.LLILLJJLI;
    }

    public Function0<Unit> getScrollUpCallback() {
        return this.LL;
    }

    @Override // X.C0IEW
    public final void LLLLZLL(boolean z) {
        this.LLILLL.LJIJJLI = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.LLILLL.LIZIZ(motionEvent, new AwS436S0200000_35(this, motionEvent, 26));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LLILLL.LIZLLL(motionEvent, new AwS436S0200000_35(this, motionEvent, 27));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.LLILLL.LJ(motionEvent, getScrollUpCallback(), new AwS436S0200000_35(this, motionEvent, 28));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.LLILLL.LJFF(new AwS151S0110000_35(this, z, 0), z);
    }

    @Override // X.C0IEW
    public void setCanInterceptCallback(Function0<Boolean> function0) {
        this.LLILLL.LJIJ = function0;
    }

    @Override // X.C0IEW
    public void setCanReallyShowCardCallback(Function0<Boolean> function0) {
        this.LLILLL.LJIIZILJ = function0;
    }

    @Override // X.C0IEW
    public void setCardFullyShown(boolean z) {
        float f;
        C2255611DQh c2255611DQh = this.LLILLL;
        c2255611DQh.LJIILIIL = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c2255611DQh.LJIILJJIL = f;
    }

    @Override // X.C0IEW
    public void setCardType(Boolean bool) {
        this.LLILLL.LJIILLIIL = Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    @Override // X.C0IEW
    public void setDragDistance(float f) {
        this.LLILLL.LJIIJ = f;
    }

    @Override // X.C0IEW
    public void setDragProgressListener(Function1<? super Float, Unit> function1) {
        this.LLILLL.LJIIJJI = function1;
    }

    @Override // X.C0IEW
    public void setDragReleaseListener(InterfaceC1631620sYq<? super Float, ? super Float, ? super Float, Unit> interfaceC1631620sYq) {
        this.LLILLL.LJIIL = interfaceC1631620sYq;
    }

    @Override // X.C0IEW
    public void setEnableScroll(boolean z) {
        this.LLILLJJLI = z;
        this.LLILLL.LJIJI = z;
    }

    @Override // X.C0IEW
    public void setScrollUpCallback(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C2255641DQk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = new C2255611DQh(this);
    }

    @Override // X.C0IEW
    public final void LLLIIII(boolean z, boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }
}
