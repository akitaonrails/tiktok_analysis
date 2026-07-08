package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0DWR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWR extends ViewOnAttachStateChangeListenerC20604515jv {
    public final C01GW LLILZ;

    private final boolean getUiOpt() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getUiOpt()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C0DWR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DWR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1695));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
