package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389050FNf {
    public final TextView LIZ;
    public final boolean LIZIZ = false;
    public int LIZJ;
    public int LIZLLL;

    public C389050FNf(TextView textView) {
        this.LIZ = textView;
    }

    public final int LIZIZ(int i) {
        float textSize = this.LIZ.getTextSize();
        this.LIZ.setTextSize(i);
        TextView textView = this.LIZ;
        textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(C14KQ.LJFF(this.LIZ.getContext()), Integer.MIN_VALUE));
        int measuredHeight = this.LIZ.getMeasuredHeight();
        this.LIZ.setTextSize(0, textSize);
        return measuredHeight;
    }

    public final void LIZ(int i, int i2, int i3, int i4, Function1<? super Integer, Unit> function1) {
        int size;
        View view;
        int i5 = this.LIZLLL;
        if (i5 > 0) {
            LIZJ(i2, i3, i4, i5, function1);
            return;
        }
        C389060FNg c389060FNg = new C389060FNg(this, i2, i3, i4, function1);
        TextView textView = this.LIZ;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            Object parent = textView.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                size = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = textView.getResources().getDisplayMetrics().heightPixels;
            }
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        c389060FNg.invoke(Integer.valueOf(textView.getMeasuredHeight()), Integer.valueOf(size));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r6, int r7, int r8, int r9, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r10) {
        /*
            r5 = this;
            android.widget.TextView r0 = r5.LIZ
            java.lang.CharSequence r0 = r0.getText()
            r4 = 0
            if (r0 == 0) goto L42
            int r1 = r0.length()
        Ld:
            int r0 = r5.LIZJ
            int r0 = r1 - r0
            r5.LIZJ = r1
            if (r0 <= 0) goto L3d
            r3 = 1
        L16:
            r2 = 0
            if (r0 == 0) goto L58
        L19:
            android.widget.TextView r0 = r5.LIZ
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L59
            int r1 = r5.LIZIZ(r6)
            if (r3 == 0) goto L44
            r7 = r6
        L2e:
            if (r1 < r9) goto L59
            if (r4 != 0) goto L59
            int r7 = r7 + (-1)
            if (r7 > r8) goto L38
            r7 = r8
            r4 = 1
        L38:
            int r1 = r5.LIZIZ(r7)
            goto L2e
        L3d:
            r3 = 0
            if (r0 >= 0) goto L16
            r2 = 1
            goto L19
        L42:
            r1 = 0
            goto Ld
        L44:
            if (r2 == 0) goto L58
            r0 = r6
        L47:
            if (r1 > r9) goto L56
            if (r4 != 0) goto L56
            int r0 = r0 + 1
            if (r0 < r7) goto L51
            r0 = r7
            r4 = 1
        L51:
            int r1 = r5.LIZIZ(r0)
            goto L47
        L56:
            r7 = r0
            goto L59
        L58:
            r7 = r6
        L59:
            if (r7 != r6) goto L5f
            boolean r0 = r5.LIZIZ
            if (r0 == 0) goto L66
        L5f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r10.invoke(r0)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389050FNf.LIZJ(int, int, int, int, kotlin.jvm.functions.Function1):void");
    }
}
