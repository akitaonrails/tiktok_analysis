package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.11z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19679711z9 extends RecyclerView {
    public static final int LLJJIJIL = ViewConfiguration.getDoubleTapTimeout();
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public InterfaceC1649820t2C LLIZ;
    public InterfaceC21645719nT LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public final float LLJJIII;
    public boolean LLJJIJI;
    public RunnableC19679811zA LLJJIJIIJIL;

    public final void LIZLLL() {
        this.LLJI = false;
        this.LLJILLL = false;
    }

    public final InterfaceC19680011zC getCallback() {
        return null;
    }

    public final void setCallback(InterfaceC19680011zC interfaceC19680011zC) {
    }

    public final InterfaceC1649820t2C getControlProgressApiComponent() {
        return this.LLIZ;
    }

    public final boolean getDispatchUp() {
        return this.LLILLL;
    }

    public final float getDownX() {
        return this.LLILZIL;
    }

    public final float getDownY() {
        return this.LLILZLL;
    }

    public final boolean getHasEvent() {
        return this.LL;
    }

    public final int getSnapPosition() {
        return this.LLILZ;
    }

    public final boolean getStopMoveTouchEvent() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.11zA] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19679711z9.LIZJ(android.view.MotionEvent):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        LIZJ(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rv visibility = ");
        sbLIZ.append(getVisibility());
        sbLIZ.append(",receive motionEvent = ");
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ(motionEvent);
        if (this.LLILLJJLI) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            InterfaceC1649820t2C interfaceC1649820t2C = this.LLIZ;
            if (interfaceC1649820t2C != null) {
                interfaceC1649820t2C.ZG(motionEventObtain, this.LLILZIL, this.LLILZLL);
            }
            if (this.LLILLL) {
                if (motionEvent != null) {
                    motionEvent.setAction(1);
                }
                this.LLILLL = false;
                super.onTouchEvent(motionEvent);
                smoothScrollToPosition(this.LLILZ);
                scrollToPosition(this.LLILZ);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setControlProgressApiComponent(InterfaceC1649820t2C interfaceC1649820t2C) {
        this.LLIZ = interfaceC1649820t2C;
    }

    public final void setDispatchUp(boolean z) {
        this.LLILLL = z;
    }

    public final void setDownX(float f) {
        this.LLILZIL = f;
    }

    public final void setDownY(float f) {
        this.LLILZLL = f;
    }

    public final void setHasEvent(boolean z) {
        this.LL = z;
    }

    public final void setOnGestureListener(InterfaceC21645719nT interfaceC21645719nT) {
        this.LLIZLLLIL = interfaceC21645719nT;
    }

    public final void setSnapPosition(int i) {
        this.LLILZ = i;
    }

    public final void setStopMoveTouchEvent(boolean z) {
        this.LLILLJJLI = z;
    }

    public C19679711z9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19679711z9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = true;
        float scaledDoubleTapSlop = ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.LLJJIII = scaledDoubleTapSlop * scaledDoubleTapSlop;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
