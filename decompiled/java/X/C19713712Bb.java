package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.12Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713712Bb extends TouchDelegate {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public final View LIZJ;
    public final ViewGroup LIZLLL;
    public boolean LJ;
    public final Rect LJFF;
    public final int LJI;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.LIZJ
            int r1 = r0.getVisibility()
            r6 = 0
            r0 = 8
            if (r0 != r1) goto Lc
            return r6
        Lc:
            android.view.View r0 = r7.LIZJ
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L15
            return r6
        L15:
            android.graphics.Rect r2 = r7.LIZ
            android.view.View r0 = r7.LIZJ
            int r1 = r0.getWidth()
            android.view.View r0 = r7.LIZJ
            int r0 = r0.getHeight()
            r2.set(r6, r6, r1, r0)
            android.graphics.Rect r3 = r7.LIZ
            int r1 = r3.left
            android.graphics.Rect r2 = r7.LIZIZ
            int r0 = r2.left
            int r1 = r1 - r0
            r3.left = r1
            int r1 = r3.top
            int r0 = r2.top
            int r1 = r1 - r0
            r3.top = r1
            int r1 = r3.right
            int r0 = r2.right
            int r1 = r1 + r0
            r3.right = r1
            int r1 = r3.bottom
            int r0 = r2.bottom
            int r1 = r1 + r0
            r3.bottom = r1
            android.view.ViewGroup r1 = r7.LIZLLL
            android.view.View r0 = r7.LIZJ
            r1.offsetDescendantRectToMyCoords(r0, r3)
            android.graphics.Rect r1 = r7.LJFF
            android.graphics.Rect r0 = r7.LIZ
            r1.set(r0)
            android.graphics.Rect r2 = r7.LJFF
            int r0 = r7.LJI
            int r1 = -r0
            int r0 = -r0
            r2.inset(r1, r0)
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r4 = (int) r0
            int r2 = r8.getAction()
            r1 = 1
            r3 = 2
            if (r2 == 0) goto Lac
            if (r2 == r1) goto L9e
            if (r2 == r3) goto L9e
            r0 = 3
            if (r2 != r0) goto L93
            boolean r0 = r7.LJ
            r7.LJ = r6
        L7a:
            if (r0 == 0) goto L93
        L7c:
            android.view.View r2 = r7.LIZJ
            if (r1 == 0) goto L94
            int r0 = r2.getWidth()
            int r0 = r0 / r3
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L8f:
            boolean r6 = r2.dispatchTouchEvent(r8)
        L93:
            return r6
        L94:
            int r0 = r7.LJI
            int r0 = r0 * 2
            float r0 = (float) r0
            float r0 = -r0
            r8.setLocation(r0, r0)
            goto L8f
        L9e:
            boolean r0 = r7.LJ
            if (r0 == 0) goto L93
            android.graphics.Rect r0 = r7.LJFF
            boolean r0 = r0.contains(r5, r4)
            if (r0 != 0) goto L7c
            r1 = 0
            goto L7c
        Lac:
            android.graphics.Rect r0 = r7.LIZ
            boolean r0 = r0.contains(r5, r4)
            r7.LJ = r0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19713712Bb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C19713712Bb(Rect rect, View view, ViewGroup viewGroup) {
        Rect rect2 = new Rect();
        super(rect2, view);
        this.LIZ = rect2;
        this.LIZIZ = rect;
        this.LIZJ = view;
        this.LIZLLL = viewGroup;
        this.LJFF = new Rect(rect2);
        this.LJI = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
