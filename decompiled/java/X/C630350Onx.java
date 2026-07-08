package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0Onx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630350Onx extends TouchDelegate {
    public static final Rect LIZJ = new Rect();
    public final List<C630450Oo7> LIZ;
    public C630450Oo7 LIZIZ;

    public C630350Onx(View view) {
        super(LIZJ, view);
        this.LIZ = new LinkedList();
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
            X.0Oo7 r0 = r5.LIZIZ
            r5.LIZIZ = r1
            goto L19
        L17:
            X.0Oo7 r0 = r5.LIZIZ
        L19:
            if (r0 == 0) goto L11
            boolean r0 = r0.onTouchEvent(r6)
            if (r0 == 0) goto L11
            r4 = 1
            return r4
        L23:
            r2 = 0
        L24:
            java.util.List<X.0Oo7> r0 = r5.LIZ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.List<X.0Oo7> r0 = r5.LIZ
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0Oo7 r1 = (X.C630450Oo7) r1
            boolean r0 = r1.onTouchEvent(r6)
            if (r0 == 0) goto L3f
            r5.LIZIZ = r1
            return r3
        L3f:
            int r2 = r2 + 1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C630350Onx.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
