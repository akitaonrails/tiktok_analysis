package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Hld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450550Hld extends RecyclerView {
    public boolean LL;
    public C450540Hlc LLILLJJLI;

    public final C450540Hlc getPopHelper() {
        return this.LLILLJJLI;
    }

    public final boolean getSwipeEnabled() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r2 = r4.getAction()
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 == r1) goto L28
            r0 = 2
            if (r2 == r0) goto L20
            r0 = 3
            if (r2 == r0) goto L28
        Lf:
            X.0Hlc r0 = r3.LLILLJJLI
            if (r0 == 0) goto L38
            boolean r0 = r0.LJII()
            if (r0 != r1) goto L38
            int r0 = r4.getAction()
            if (r0 != r1) goto L38
            return r1
        L20:
            X.0Hlc r0 = r3.LLILLJJLI
            if (r0 == 0) goto Lf
            r0.LIZJ(r4)
            goto Lf
        L28:
            X.0Hlc r0 = r3.LLILLJJLI
            if (r0 == 0) goto Lf
            r0.LIZ()
            goto Lf
        L30:
            X.0Hlc r0 = r3.LLILLJJLI
            if (r0 == 0) goto Lf
            r0.LIZIZ(r4)
            goto Lf
        L38:
            boolean r0 = r3.LL
            if (r0 == 0) goto L4a
            boolean r0 = super.onInterceptTouchEvent(r4)
            if (r0 == 0) goto L4a
            X.0Hlc r0 = r3.LLILLJJLI
            if (r0 == 0) goto L49
            r0.LIZ()
        L49:
            return r1
        L4a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450550Hld.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setPopHelper(C450540Hlc c450540Hlc) {
        this.LLILLJJLI = c450540Hlc;
    }

    public final void setSwipeEnabled(boolean z) {
        this.LL = z;
    }

    public C450550Hld(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C450550Hld(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
