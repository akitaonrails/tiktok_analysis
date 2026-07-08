package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0t6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652280t6A extends TouchDelegate {
    public final List<C19713612Ba> LIZ;
    public C19713612Ba LIZIZ;

    public C1652280t6A(View view) {
        super(new Rect(), view);
        this.LIZ = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r2 != 3) goto L9;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r2 = r6.getAction()
            r4 = 0
            r3 = 1
            r1 = 0
            if (r2 == 0) goto L23
            if (r2 == r3) goto L12
            r0 = 2
            if (r2 == r0) goto L17
            r0 = 3
            if (r2 == r0) goto L12
        L11:
            return r4
        L12:
            X.12Ba r0 = r5.LIZIZ
            r5.LIZIZ = r1
            goto L19
        L17:
            X.12Ba r0 = r5.LIZIZ
        L19:
            if (r0 == 0) goto L11
            boolean r0 = r0.onTouchEvent(r6)
            if (r0 == 0) goto L11
            r4 = 1
            return r4
        L23:
            r2 = 0
        L24:
            java.util.List<X.12Ba> r0 = r5.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.List<X.12Ba> r0 = r5.LIZ
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.12Ba r1 = (X.C19713612Ba) r1
            boolean r0 = r1.onTouchEvent(r6)
            if (r0 == 0) goto L3f
            r5.LIZIZ = r1
            return r3
        L3f:
            int r2 = r2 + 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1652280t6A.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
