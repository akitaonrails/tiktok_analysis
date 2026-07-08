package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0cGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1005230cGX extends LinearLayout {
    public int LL;
    public int LLILLJJLI;

    public int getMInTopModeMarginTop() {
        return this.LLILLJJLI;
    }

    public final int getMarginTopLayoutMode() {
        return this.LL;
    }

    public void setMInTopModeMarginTop(int i) {
        this.LLILLJJLI = i;
    }

    public final void setMarginTopLayoutMode(int i) {
        this.LL = i;
    }

    public C1005230cGX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            super.onMeasure(r6, r7)
            java.lang.String r0 = "desc"
            android.view.View r1 = r5.findViewWithTag(r0)
            java.lang.String r0 = "left_icon"
            android.view.View r0 = r5.findViewWithTag(r0)
            if (r0 != 0) goto L12
            return
        L12:
            int r4 = r0.getMeasuredHeight()
            int r3 = r1.getMeasuredHeight()
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = r1.getLineCount()
            if (r3 <= r4) goto L57
            r0 = 1
            if (r2 <= r0) goto L57
        L25:
            r5.LL = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "desc height:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "  icon:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "  count : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "  mode:"
            r1.append(r0)
            int r0 = r5.LL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "IntroItemLayout"
            X.C1344030l4z.LIZJ(r0, r1)
            return
        L57:
            r0 = 2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1005230cGX.onMeasure(int, int):void");
    }

    public C1005230cGX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = -1;
        this.LLILLJJLI = C341940Daq.LIZ(0.0d);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int top;
        super.onLayout(z, i, i2, i3, i4);
        View viewFindViewWithTag = findViewWithTag("left_icon");
        if (viewFindViewWithTag != null && viewFindViewWithTag.getVisibility() == 0) {
            if (this.LL == 1) {
                top = getMInTopModeMarginTop();
            } else {
                top = viewFindViewWithTag.getTop();
            }
            viewFindViewWithTag.setTop(top);
        }
    }
}
