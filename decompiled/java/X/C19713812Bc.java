package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.12Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713812Bc extends TouchDelegate {
    public static final Rect LIZJ = new Rect();
    public final List<C19713712Bb> LIZ;
    public C19713712Bb LIZIZ;

    public C19713812Bc(View view) {
        super(LIZJ, view);
        this.LIZ = new LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r1 != 3) goto L19;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r7)
            int r1 = r7.getAction()     // Catch: java.lang.Throwable -> L4e
            r5 = 1
            r3 = 0
            if (r1 == 0) goto Ld
            goto L31
        Ld:
            java.util.List<X.12Bb> r0 = r6.LIZ     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L13:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L39
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L4e
            X.12Bb r1 = (X.C19713712Bb) r1     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r1.onTouchEvent(r4)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L13
            r6.LIZIZ = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "expand click, only debug，detail->TouchDelegateUtils"
            r0 = 0
            X.C1647306ch.LIZ(r3, r1, r0)     // Catch: java.lang.Throwable -> L4e
            r4.recycle()
            return r5
        L31:
            if (r1 == r5) goto L41
            r0 = 2
            if (r1 == r0) goto L3e
            r0 = 3
            if (r1 == r0) goto L41
        L39:
            r5 = 0
        L3a:
            r4.recycle()
            return r5
        L3e:
            X.12Bb r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L4e
            goto L45
        L41:
            X.12Bb r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L4e
            r6.LIZIZ = r3     // Catch: java.lang.Throwable -> L4e
        L45:
            if (r0 == 0) goto L39
            boolean r0 = r0.onTouchEvent(r7)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L39
            goto L3a
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4e
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19713812Bc.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
