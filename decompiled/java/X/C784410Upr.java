package X;

import Y.ATListenerS446S0100000_12;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.GlobalLikeContinueTarget;
import com.bytedance.android.livesdk.livesetting.LiveInteractViewRequestLayoutOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Upr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C784410Upr extends C1083340eIW implements InterfaceC782440Umg {
    public final List<View.OnTouchListener> LL;
    public final List<View.OnTouchListener> LLILLJJLI;
    public final List<View.OnTouchListener> LLILLL;
    public final List<InterfaceC784400Upq> LLILZ;
    public View.OnTouchListener LLILZIL;
    public InterfaceC784390Upp LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC782440Umg
    public final void LLLJIL() {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILZ).clear();
    }

    @Override // X.InterfaceC782440Umg
    public final void L(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        ((ArrayList) this.LLILLJJLI).add(onTouchListener);
    }

    @Override // X.InterfaceC782440Umg
    public final void LJLLLLLL(InterfaceC784400Upq interfaceC784400Upq) {
        ((ArrayList) this.LLILZ).add(interfaceC784400Upq);
    }

    @Override // X.InterfaceC782440Umg
    public final void LL(ATListenerS446S0100000_12 aTListenerS446S0100000_12) {
        if (aTListenerS446S0100000_12 != null && ((ArrayList) this.LLILLL).contains(aTListenerS446S0100000_12)) {
            ((ArrayList) this.LLILLL).remove(aTListenerS446S0100000_12);
        }
    }

    @Override // X.InterfaceC782440Umg
    public final void LLLL(View.OnTouchListener onTouchListener) {
        ((ArrayList) this.LL).add(onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int size = ((ArrayList) this.LL).size() - 1; size >= 0; size--) {
            ((View.OnTouchListener) ListProtector.get(this.LL, size)).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (Boolean.TRUE.equals(DataChannelGlobal.LLILZ.gg0(GlobalLikeContinueTarget.class))) {
            return false;
        }
        if (!this.LLIZ && !super.onInterceptTouchEvent(motionEvent)) {
            for (int size = ((ArrayList) this.LLILLL).size() - 1; size >= 0; size--) {
                View.OnTouchListener onTouchListener = (View.OnTouchListener) ListProtector.get(this.LLILLL, size);
                if (motionEvent.getAction() == 2) {
                    View.OnTouchListener onTouchListener2 = this.LLILZIL;
                    if (onTouchListener2 != null) {
                        onTouchListener2.onTouch(this, motionEvent);
                        return true;
                    }
                    if (onTouchListener.onTouch(this, motionEvent)) {
                        this.LLILZIL = (View.OnTouchListener) ListProtector.get(this.LLILLL, size);
                        return true;
                    }
                } else {
                    this.LLILZIL = null;
                }
                onTouchListener.onTouch(this, motionEvent);
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getTouchDelegate() != null && getTouchDelegate().onTouchEvent(motionEvent)) {
            return true;
        }
        for (int size = ((ArrayList) this.LLILLJJLI).size() - 1; size >= 0; size--) {
            View.OnTouchListener onTouchListener = (View.OnTouchListener) ListProtector.get(this.LLILLJJLI, size);
            if (motionEvent.getAction() == 2) {
                View.OnTouchListener onTouchListener2 = this.LLILZIL;
                if (onTouchListener2 != null) {
                    onTouchListener2.onTouch(this, motionEvent);
                    return true;
                }
                if (onTouchListener.onTouch(this, motionEvent)) {
                    this.LLILZIL = (View.OnTouchListener) ListProtector.get(this.LLILLJJLI, size);
                    return true;
                }
            } else {
                this.LLILZIL = null;
            }
            onTouchListener.onTouch(this, motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC784400Upq) it2.next()).onWindowFocusChanged(z);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // X.InterfaceC782440Umg
    public void setInterceptTouchEvent(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.InterfaceC782440Umg
    public void setOnSizeChangedListener(InterfaceC784390Upp interfaceC784390Upp) {
        this.LLILZLL = interfaceC784390Upp;
    }

    @Override // X.InterfaceC782440Umg
    public final void v(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        ((ArrayList) this.LLILLL).add(onTouchListener);
    }

    public C784410Upr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLIZ = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (LiveInteractViewRequestLayoutOptSetting.INSTANCE.enableGestureOpt() && view != null && view.getVisibility() == 8) {
            addViewInLayout(view, i, layoutParams, true);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!(view instanceof C1090450eTz) && !(view instanceof C1090460eU0) && !(view instanceof C1083090eI7) && !(view instanceof C1100290ejr)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC784390Upp interfaceC784390Upp = this.LLILZLL;
        if (interfaceC784390Upp != null) {
            interfaceC784390Upp.LIZ(i2, i4);
        }
    }
}
