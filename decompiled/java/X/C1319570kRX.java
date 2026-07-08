package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319570kRX extends C16G0 {
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final int LLJLIL;
    public Function0<Unit> LLJLILLLLZIIL;

    public final Function0<Unit> getOnFirstScrollAfterExpand() {
        return this.LLJLILLLLZIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    @Override // X.C16G0, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.LLJJL
            if (r0 != 0) goto L9
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L9:
            int r1 = r5.getActionMasked()
            r3 = 0
            if (r1 == 0) goto L45
            r2 = 1
            if (r1 == r2) goto L40
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 == r0) goto L40
        L19:
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L1e:
            float r1 = r5.getY()
            float r0 = r4.LLJL
            float r1 = r1 - r0
            boolean r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L19
            float r1 = java.lang.Math.abs(r1)
            int r0 = r4.LLJLIL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L19
            r4.LLJJLIIIJLLLLLLLZ = r2
            r4.LLJJL = r3
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4.LLJLILLLLZIIL
            if (r0 == 0) goto L3f
            r0.invoke()
        L3f:
            return r2
        L40:
            r4.LLJJL = r3
            r4.LLJJLIIIJLLLLLLLZ = r3
            goto L19
        L45:
            float r0 = r5.getY()
            r4.LLJL = r0
            r4.LLJJLIIIJLLLLLLLZ = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1319570kRX.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C16G0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJLIIIJLLLLLLLZ) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.LLJJLIIIJLLLLLLLZ = false;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnFirstScrollAfterExpand(Function0<Unit> function0) {
        this.LLJLILLLLZIIL = function0;
    }

    public C1319570kRX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
