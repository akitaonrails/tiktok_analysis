package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: renamed from: X.0DPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338740DPs implements InterfaceC338730DPr {
    public final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(540));
    public final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(296));
    public final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
    public final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166));
    public final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(480));
    public final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
    public final int LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
    public final int LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640));
    public final int LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));

    @Override // X.InterfaceC338730DPr
    public final void LIZIZ(int i, int i2, C338760DPu c338760DPu, AwS618S0100000_4 awS618S0100000_4) {
        int measuredWidth;
        int i3;
        int i4;
        int iLJ;
        awS618S0100000_4.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        View childAt = c338760DPu.getChildAt(0);
        if (C497820Jfg.LJ(c338760DPu.getContext())) {
            i4 = this.LIZ;
            iLJ = C13LZ.LJ(childAt.getMeasuredHeight(), this.LJIIIIZZ, this.LJIIIZ);
        } else {
            if (c338760DPu.getMeasuredWidth() > this.LIZIZ) {
                measuredWidth = c338760DPu.getMeasuredWidth();
                i3 = this.LIZJ;
            } else {
                measuredWidth = c338760DPu.getMeasuredWidth();
                i3 = this.LIZLLL;
            }
            i4 = measuredWidth - i3;
            int i5 = this.LJ;
            if (i4 > i5) {
                i4 = i5;
            }
            if (C497820Jfg.LIZLLL(c338760DPu.getContext())) {
                iLJ = C13LZ.LJ(childAt.getMeasuredHeight(), this.LJFF, c338760DPu.getMeasuredHeight() - this.LJII);
            } else {
                iLJ = C13LZ.LJ(childAt.getMeasuredHeight(), this.LJFF, this.LJI);
            }
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(iLJ, 1073741824));
    }

    @Override // X.InterfaceC338730DPr
    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C338760DPu c338760DPu, C346580DiK c346580DiK) {
        View childAt = c338760DPu.getChildAt(0);
        Context context = c338760DPu.getContext();
        if (!C497820Jfg.LJ(context) && C497820Jfg.LIZLLL(context)) {
            int measuredWidth = childAt.getMeasuredWidth();
            int i5 = i4 - this.LJIIJ;
            int i6 = i + (((i3 - i) - measuredWidth) / 2);
            childAt.layout(i6, i5 - childAt.getMeasuredHeight(), measuredWidth + i6, i5);
            return;
        }
        C338720DPq.LIZ(childAt, i, i2, i3, i4);
    }
}
