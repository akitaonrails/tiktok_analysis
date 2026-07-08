package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0eq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104110eq1 extends LinearLayout implements C0Z9D {
    public boolean LL;
    public final C1104110eq1 LLILLJJLI;

    @Override // X.C0Z9D
    public final boolean LLLIIL() {
        return this.LL;
    }

    @Override // X.C0Z9D
    public ViewGroup getWrapper() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C0Z9D
    public void setMultiSelectMode(boolean z) {
        this.LL = z;
    }

    public C1104110eq1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = this;
    }
}
