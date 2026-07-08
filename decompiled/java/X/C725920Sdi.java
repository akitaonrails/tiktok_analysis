package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Sdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725920Sdi extends FrameLayout {
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final float LLILZ;
    public C20632315oP LLILZIL;
    public C725900Sdg LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZLL = null;
        super.onDetachedFromWindow();
    }

    public final C725900Sdg LIZ() {
        C725900Sdg c725900Sdg;
        C725900Sdg c725900Sdg2 = this.LLILZLL;
        if (c725900Sdg2 != null) {
            return c725900Sdg2;
        }
        Object parent = getParent();
        C725900Sdg c725900Sdg3 = null;
        View view = parent instanceof View ? (View) parent : null;
        if (view == null || (c725900Sdg = (C725900Sdg) view.findViewById(R.id.jit)) == null) {
            View rootView = getRootView();
            if (rootView != null) {
                c725900Sdg3 = (C725900Sdg) rootView.findViewById(R.id.jit);
            }
        } else {
            c725900Sdg3 = c725900Sdg;
        }
        this.LLILZLL = c725900Sdg3;
        return c725900Sdg3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = C2552209zM.LIZ;
        if (C2552209zM.LIZ) {
            HandlerHook.viewPost(this, new ARunnableS111S0100000_11(this, 11));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C20632315oP) {
                this.LLILZIL = (C20632315oP) childAt;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            if (r0 != 0) goto L24
            float r0 = r7.getX()
            r6.LLILLJJLI = r0
            float r0 = r7.getY()
            r6.LLILLL = r0
            boolean r0 = X.C2552209zM.LIZ
            boolean r0 = X.C2552209zM.LIZ
            if (r0 == 0) goto L24
            X.0Sdg r0 = r6.LIZ()
            if (r0 == 0) goto L24
            r0.LJIIIZ()
            r0.LIZLLL()
        L24:
            X.15oP r4 = r6.LLILZIL
            if (r4 != 0) goto L2d
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L2d:
            int r1 = r7.getActionMasked()
            r5 = 1
            if (r1 == 0) goto L80
            if (r1 == r5) goto L7c
            r0 = 2
            if (r1 == r0) goto L41
            r0 = 3
            if (r1 == r0) goto L7c
        L3c:
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L41:
            boolean r0 = r4.LLJJIJI
            if (r0 != 0) goto L4a
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L4a:
            float r1 = r7.getX()
            float r0 = r6.LLILLJJLI
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            float r1 = r7.getY()
            float r0 = r6.LLILLL
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            int r1 = r6.LL
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L6c
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L6c:
            float r0 = r6.LLILZ
            float r2 = r2 * r0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L77
            r4.setUserInputEnabled(r5)
            goto L3c
        L77:
            r0 = 0
            r4.setUserInputEnabled(r0)
            goto L3c
        L7c:
            r4.setUserInputEnabled(r5)
            goto L3c
        L80:
            r4.setUserInputEnabled(r5)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725920Sdi.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public C725920Sdi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = 2.0f;
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
