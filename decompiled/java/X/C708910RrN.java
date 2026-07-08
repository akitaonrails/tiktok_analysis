package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import mf.a;

/* JADX INFO: renamed from: X.0RrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C708910RrN extends FrameLayout implements InterfaceC703980RjQ {
    public boolean LL;
    public int LLILLJJLI;
    public final float[] LLILLL;
    public View LLILZ;
    public InterfaceC703970RjP LLILZIL;

    public final boolean getGroupClickable() {
        return this.LL;
    }

    public final int getHintTextRes() {
        return this.LLILLJJLI;
    }

    public final float[] getLastTouchDownXY() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC703980RjQ
    public final void LJ(C709410RsB c709410RsB) {
        this.LLILZIL = c709410RsB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        View view;
        View view2;
        Object tag;
        FcpAwemeInfo fcpAwemeInfo;
        C01GW c01gw = C265840AbO.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            C700560Rdu.LIZIZ(motionEvent, this);
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLILLL[0] = motionEvent.getRawX();
            this.LLILLL[1] = motionEvent.getRawY();
        }
        try {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (((Boolean) c01gw.getValue()).booleanValue() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILZ = C1967407nE.LIZIZ(this);
                    return zDispatchTouchEvent;
                }
                if (numValueOf.intValue() == 1 && (view = this.LLILZ) != null && view.isClickable() && (view2 = this.LLILZ) != null && view2.isPressed()) {
                    C704180Rjk.LIZ.getClass();
                    HandlerHook.viewPostDelay(this, new ARunnableS111S0100000_11(this, 153), 100L);
                    C700410Rdf c700410Rdf = C700410Rdf.LIZ;
                    View view3 = this.LLILZ;
                    c700410Rdf.getClass();
                    if (view3 != null && (tag = getTag(C700100RdA.LJII)) != null) {
                        Object tag2 = getTag(C700100RdA.LJIIIIZZ);
                        if ((tag2 instanceof FcpAwemeInfo) && (fcpAwemeInfo = (FcpAwemeInfo) tag2) != null) {
                            C700410Rdf.LJ(view3, tag, fcpAwemeInfo, true);
                        }
                    }
                }
            }
            return zDispatchTouchEvent;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LJFF("FeedInterceptTouchLayout::dispatchTouchEvent", e);
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
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
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (interfaceC703970RjP = this.LLILZIL) != null) {
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

    public C708910RrN(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
        this.LLILLJJLI = -1;
        this.LLILLL = new float[2];
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0RrO
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
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LIZLLL.getValue());
    }

    @Override // X.InterfaceC703980RjQ
    public final Object LIZIZ(int i, View view) {
        return C700560Rdu.LIZJ(view, i);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC703970RjP interfaceC703970RjP = this.LLILZIL;
        if (interfaceC703970RjP != null) {
            interfaceC703970RjP.LIZJ(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC703970RjP interfaceC703970RjP;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i != i3 || i2 != i4) && (interfaceC703970RjP = this.LLILZIL) != null) {
            interfaceC703970RjP.LIZ(this);
        }
    }
}
