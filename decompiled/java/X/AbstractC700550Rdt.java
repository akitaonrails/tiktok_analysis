package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Rdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC700550Rdt extends TouchDelegate {
    public final View LIZ;
    public final View LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;

    public abstract Rect LIZJ();

    public boolean LIZIZ() {
        return this.LIZ.isShown() && this.LIZ.getHeight() > 0 && this.LIZ.isEnabled();
    }

    public void LIZLLL(MotionEvent motionEvent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click placeholder hotspot, raw point is：(");
        sbLIZ.append(motionEvent.getRawX());
        sbLIZ.append(", ");
        sbLIZ.append(motionEvent.getRawY());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[PHI: r3
      0x008e: PHI (r3v4 boolean) = (r3v5 boolean), (r3v7 boolean) binds: [B:26:0x008c, B:32:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[PHI: r3
      0x00b4: PHI (r3v2 boolean) = (r3v5 boolean), (r3v7 boolean) binds: [B:26:0x008c, B:32:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.LIZIZ()
            r5 = 0
            if (r0 != 0) goto L19
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "status check failed:"
            r1.append(r0)
            android.view.View r0 = r8.LIZ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        L19:
            android.graphics.Rect r3 = r8.LIZJ()
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getBounds failed:"
            r1.append(r0)
            android.view.View r0 = r8.LIZ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        L31:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r3)
            int r0 = r8.LIZJ
            int r1 = -r0
            int r0 = -r0
            r7.inset(r1, r0)
            float r0 = r9.getX()
            int r6 = (int) r0
            float r0 = r9.getY()
            int r4 = (int) r0
            int r2 = r9.getActionMasked()
            r1 = 1
            r0 = 2
            if (r2 == 0) goto L7f
            if (r2 == r1) goto Laa
            if (r2 == r0) goto Laa
            r0 = 3
            if (r2 == r0) goto L86
            r0 = 5
            if (r2 == r0) goto Laa
            r0 = 6
            if (r2 == r0) goto Laa
            r3 = 0
        L5d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "is hitTarget:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", target is:"
            r1.append(r0)
            android.view.View r0 = r8.LIZ
            r1.append(r0)
            java.lang.String r0 = ", is succeed:"
            r1.append(r0)
            r1.append(r5)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        L7f:
            boolean r3 = r3.contains(r6, r4)
            r8.LIZLLL = r3
            goto L8a
        L86:
            boolean r3 = r8.LIZLLL
            r8.LIZLLL = r5
        L8a:
            if (r3 == 0) goto L5d
            if (r1 == 0) goto Lb4
        L8e:
            android.view.View r0 = r8.LIZ
            int r0 = r0.getWidth()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            android.view.View r0 = r8.LIZ
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            r9.setLocation(r2, r0)
        La3:
            android.view.View r0 = r8.LIZ
            boolean r5 = r0.dispatchTouchEvent(r9)
            goto L5d
        Laa:
            boolean r3 = r8.LIZLLL
            if (r3 == 0) goto L5d
            boolean r0 = r7.contains(r6, r4)
            if (r0 != 0) goto L8e
        Lb4:
            int r2 = r8.LIZJ
            int r0 = r2 * 2
            float r0 = (float) r0
            float r1 = -r0
            int r0 = r2 * 2
            float r0 = (float) r0
            float r0 = -r0
            r9.setLocation(r1, r0)
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC700550Rdt.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public AbstractC700550Rdt(View view, View view2) {
        super(new Rect(), view);
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }
}
