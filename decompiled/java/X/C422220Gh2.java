package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Gh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422220Gh2 extends LinearLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r2 = r4.getAction()
            r1 = 1
            if (r2 == r1) goto L16
            r0 = 2
            if (r2 == r0) goto L12
            r0 = 3
            if (r2 == r0) goto L16
        Ld:
            boolean r0 = super.onTouchEvent(r4)
            return r0
        L12:
            r3.requestDisallowInterceptTouchEvent(r1)
            goto Ld
        L16:
            r0 = 0
            r3.requestDisallowInterceptTouchEvent(r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C422220Gh2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C422220Gh2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        requestDisallowInterceptTouchEvent(true);
    }
}
