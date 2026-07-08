package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS151S0110000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255631DQj extends FrameLayout implements C0IEW {
    public Function0<Unit> LL;
    public final C01GW LLILLJJLI;
    public final AwS551S0100000_7 LLILLL;
    public final Map<C0II6, Function0<Unit>> LLILZ;
    public final List<C0II6> LLILZIL;
    public boolean LLILZLL;
    public final C2255611DQh LLIZ;

    private final boolean getBizManageOptEnable() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    @Override // X.C0IEW
    public boolean getEnableScroll() {
        return this.LLILZLL;
    }

    public Function0<Unit> getScrollUpCallback() {
        return this.LL;
    }

    @Override // X.C0IEW
    public final void LLJJJ(C0II6 c0ii6) {
        this.LLILZ.remove(c0ii6);
        if (this.LLILZ.isEmpty()) {
            setEnableScroll(false);
            LLLIIII(false, false);
        }
    }

    @Override // X.C0IEW
    public final void LLLLZLL(boolean z) {
        this.LLIZ.LJIJJLI = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.LLIZ.LIZIZ(motionEvent, new AwS436S0200000_35(this, motionEvent, 29));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LLIZ.LIZLLL(motionEvent, new AwS436S0200000_35(this, motionEvent, 30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> scrollUpCallback;
        if (getBizManageOptEnable()) {
            scrollUpCallback = this.LLILLL;
        } else {
            scrollUpCallback = getScrollUpCallback();
        }
        return this.LLIZ.LJ(motionEvent, scrollUpCallback, new AwS436S0200000_35(this, motionEvent, 31));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.LLIZ.LJFF(new AwS151S0110000_35(this, z, 1), z);
    }

    @Override // X.C0IEW
    public void setCanInterceptCallback(Function0<Boolean> function0) {
        this.LLIZ.LJIJ = function0;
    }

    @Override // X.C0IEW
    public void setCanReallyShowCardCallback(Function0<Boolean> function0) {
        this.LLIZ.LJIIZILJ = function0;
    }

    @Override // X.C0IEW
    public void setCardFullyShown(boolean z) {
        float f;
        C2255611DQh c2255611DQh = this.LLIZ;
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
        this.LLIZ.LJIILLIIL = Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    @Override // X.C0IEW
    public void setDragDistance(float f) {
        this.LLIZ.LJIIJ = f;
    }

    @Override // X.C0IEW
    public void setDragProgressListener(Function1<? super Float, Unit> function1) {
        this.LLIZ.LJIIJJI = function1;
    }

    @Override // X.C0IEW
    public void setDragReleaseListener(InterfaceC1631620sYq<? super Float, ? super Float, ? super Float, Unit> interfaceC1631620sYq) {
        this.LLIZ.LJIIL = interfaceC1631620sYq;
    }

    @Override // X.C0IEW
    public void setEnableScroll(boolean z) {
        this.LLILZLL = z;
        this.LLIZ.LJIJI = z;
    }

    @Override // X.C0IEW
    public void setScrollUpCallback(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C2255631DQj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(28));
        this.LLILLL = new AwS551S0100000_7(this, 39);
        this.LLILZ = new LinkedHashMap();
        this.LLILZIL = C1697810uHb.LJIILJJIL(C0II6.LIVE_END_HALF_SCREEN_CARD, C0II6.LIVE_SURVEY_CARD);
        this.LLIZ = new C2255611DQh(this);
    }

    @Override // X.C0IEW
    public final void LLLIIII(boolean z, boolean z2) {
        this.LLIZ.LJIJJ = z2;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // X.C0IEW
    public final void LLIIZ(C0II6 c0ii6, boolean z, Function0<Unit> function0) {
        this.LLILZ.put(c0ii6, function0);
        setEnableScroll(true);
        LLLIIII(true, z);
    }
}
