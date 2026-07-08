package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.0iXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246600iXq extends ConstraintLayout {
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r5 = 1
            r4 = 0
            if (r8 == 0) goto L7b
            int r0 = r8.getAction()
            if (r0 != 0) goto L7b
            android.app.Activity r0 = X.C19713312Ax.LIZIZ()
            r6 = 0
            if (r0 == 0) goto L86
            android.view.View r2 = r0.getCurrentFocus()
            if (r2 == 0) goto L87
            android.view.ViewParent r0 = r2.getParent()
        L1b:
            boolean r0 = r0 instanceof X.C1748440vbG
            if (r0 == 0) goto L84
            if (r2 == 0) goto L82
            android.view.ViewParent r3 = r2.getParent()
        L25:
            boolean r0 = r3 instanceof X.C1748440vbG
            if (r0 == 0) goto L80
            android.view.View r3 = (android.view.View) r3
        L2b:
            if (r2 == 0) goto L7b
            boolean r0 = r2 instanceof X.C0I7D
            if (r0 == 0) goto L7b
            if (r3 == 0) goto L7b
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x008a: FILL_ARRAY_DATA , data: [1, 2} // fill-array
            r2.getLocationOnScreen(r1)
            r0 = r1[r4]
            r5 = r1[r5]
            int r4 = r3.getHeight()
            int r4 = r4 + r5
            int r3 = r3.getWidth()
            int r3 = r3 + r0
            float r1 = r8.getRawX()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6e
            float r1 = r8.getRawX()
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6e
            float r1 = r8.getRawY()
            float r0 = (float) r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6e
            float r1 = r8.getRawY()
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L7b
        L6e:
            boolean r0 = r2 instanceof X.C0I7D
            if (r0 == 0) goto L73
            r6 = r2
        L73:
            com.ss.android.ugc.aweme.base.utils.KeyboardUtils.LIZIZ(r6)
            if (r6 == 0) goto L7b
            r6.clearFocus()
        L7b:
            boolean r0 = super.dispatchTouchEvent(r8)
            return r0
        L80:
            r3 = r6
            goto L2b
        L82:
            r3 = r6
            goto L25
        L84:
            r3 = r2
            goto L2b
        L86:
            r2 = r6
        L87:
            r0 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1246600iXq.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public C1246600iXq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
