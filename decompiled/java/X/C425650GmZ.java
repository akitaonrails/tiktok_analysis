package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0GmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425650GmZ extends RelativeLayout {
    public float LL;
    public float LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public final boolean LLILZIL;

    public C425650GmZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 20;
        this.LLILZIL = C444960Hcc.LIZJ(getContext());
        this.LLILLL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.view.MotionEvent r6, X.C692720RFe r7) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r3 = 0
            if (r1 == 0) goto L71
            r4 = 1
            if (r1 == r4) goto L11
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 == r0) goto L11
        L10:
            return r3
        L11:
            boolean r0 = r5.LLILZ
            if (r0 == 0) goto L10
            if (r7 == 0) goto L1b
            r0 = 0
            r7.LIZ(r0, r4)
        L1b:
            r5.LLILZ = r3
            return r4
        L1e:
            float r1 = r5.LL
            float r0 = r6.getRawX()
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r5.LLILLJJLI
            float r0 = r6.getRawY()
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L67
            int r0 = r5.LLILLL
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L67
            r5.LLILZ = r4
            boolean r0 = r5.LLILZIL
            if (r0 == 0) goto L6a
            float r2 = r5.LL
            float r0 = r6.getRawX()
        L4b:
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r2)
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5b
            if (r7 == 0) goto L5b
            r7.LIZ(r2, r3)
        L5b:
            float r0 = r6.getRawX()
            r5.LL = r0
            float r0 = r6.getRawY()
            r5.LLILLJJLI = r0
        L67:
            boolean r0 = r5.LLILZ
            return r0
        L6a:
            float r2 = r6.getRawX()
            float r0 = r5.LL
            goto L4b
        L71:
            float r0 = r6.getRawX()
            r5.LL = r0
            float r0 = r6.getRawY()
            r5.LLILLJJLI = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C425650GmZ.LIZ(android.view.MotionEvent, X.0RFe):boolean");
    }
}
