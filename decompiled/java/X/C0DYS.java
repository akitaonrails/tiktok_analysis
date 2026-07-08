package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DYS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DYS extends C0I7D {
    public float LLIZ;
    public final int LLIZLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r5 = 1
            boolean r0 = r7.canScrollVertically(r5)
            r6 = -1
            r3 = 0
            if (r0 != 0) goto Lf
            boolean r0 = r7.canScrollVertically(r6)
            if (r0 == 0) goto L1d
        Lf:
            int r1 = r8.getActionMasked()
            if (r1 == 0) goto L62
            if (r1 == r5) goto L5a
            r0 = 2
            if (r1 == r0) goto L22
            r0 = 3
            if (r1 == r0) goto L5a
        L1d:
            boolean r0 = super.onTouchEvent(r8)
            return r0
        L22:
            float r4 = r8.getY()
            float r0 = r7.LLIZ
            float r4 = r4 - r0
            boolean r0 = r7.canScrollVertically(r5)
            r2 = 0
            if (r0 != 0) goto L58
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L58
            r1 = 1
        L35:
            boolean r0 = r7.canScrollVertically(r6)
            if (r0 != 0) goto L56
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L56
        L3f:
            if (r1 != 0) goto L43
            if (r5 == 0) goto L1d
        L43:
            float r1 = java.lang.Math.abs(r4)
            int r0 = r7.LLIZLLLIL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            return r3
        L56:
            r5 = 0
            goto L3f
        L58:
            r1 = 0
            goto L35
        L5a:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L1d
        L62:
            float r0 = r8.getY()
            r7.LLIZ = r0
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DYS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C0DYS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
        this.LLIZLLLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
