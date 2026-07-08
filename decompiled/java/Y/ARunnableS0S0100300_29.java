package Y;

import X.C11A3;
import X.C1388580mEq;
import X.C15RW;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.widget.TextView;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS0S0100300_29 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        C11A3 c11a3 = (C11A3) this.l0;
        long j = this.j1;
        long j2 = this.j2;
        long j3 = this.j3;
        float f = (j - j2) * 1.0f;
        C15RW c15rw = c11a3.LLJI;
        if (c15rw == null) {
            c15rw = null;
        }
        float fMax = Math.max(0.0f, (f * c15rw.getMeasuredWidth()) / j3);
        TextView textView = ((C11A3) this.l0).LLJJ;
        if (textView == null) {
            textView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(new DecimalFormat("0.0").format(Float.valueOf((this.j1 - this.j2) / 1000.0f)));
        sbLIZ.append('s');
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C11A3 c11a32 = (C11A3) this.l0;
        TextView textView2 = c11a32.LLJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        if (C1388580mEq.LIZIZ(c11a32.mActivity)) {
            float f2 = -fMax;
            C15RW c15rw2 = ((C11A3) this.l0).LLJI;
            if (c15rw2 == null) {
                c15rw2 = null;
            }
            measuredWidth = f2 / c15rw2.getMeasuredWidth();
            C15RW c15rw3 = ((C11A3) this.l0).LLJI;
            if (c15rw3 == null) {
                c15rw3 = null;
            }
            measuredWidth2 = c15rw3.getMeasuredWidth();
            TextView textView3 = ((C11A3) this.l0).LLJJ;
            if (textView3 == null) {
                textView3 = null;
            }
            measuredWidth3 = textView3.getMeasuredWidth();
        } else {
            C15RW c15rw4 = ((C11A3) this.l0).LLJI;
            if (c15rw4 == null) {
                c15rw4 = null;
            }
            measuredWidth = fMax / c15rw4.getMeasuredWidth();
            C15RW c15rw5 = ((C11A3) this.l0).LLJI;
            if (c15rw5 == null) {
                c15rw5 = null;
            }
            measuredWidth2 = c15rw5.getMeasuredWidth();
            TextView textView4 = ((C11A3) this.l0).LLJJ;
            if (textView4 == null) {
                textView4 = null;
            }
            measuredWidth3 = textView4.getMeasuredWidth();
        }
        C786410Ut5.Hc(measuredWidth * (measuredWidth2 - measuredWidth3), textView2);
        C11A3 c11a33 = (C11A3) this.l0;
        TextView textView5 = c11a33.LLJILLL;
        if (textView5 == null) {
            textView5 = null;
        }
        C786410Ut5.S4(c11a33.LLLIIIIL(fMax), textView5);
        C11A3 c11a34 = (C11A3) this.l0;
        TextView textView6 = c11a34.LLJILJILJ;
        if (textView6 == null) {
            textView6 = null;
        }
        C786410Ut5.S4(c11a34.LLLIIIIL((c11a34.LLJI != null ? r0 : null).getMeasuredWidth() - fMax), textView6);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S0100300_29.LIZ$1():void");
    }

    public static final void run$0(ARunnableS0S0100300_29 aRunnableS0S0100300_29) {
        boolean zLIZ;
        C1C7U.LIZ("FTCCountdownScene@5596.translateViews$1");
        try {
            aRunnableS0S0100300_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCCountdownScene@5596.translateViews$1");
    }

    public static final void run$1(ARunnableS0S0100300_29 aRunnableS0S0100300_29) {
        boolean zLIZ;
        C1C7U.LIZ("CountdownScene@5c50.translateViews$1");
        try {
            aRunnableS0S0100300_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CountdownScene@5c50.translateViews$1");
    }

    public ARunnableS0S0100300_29(Object obj, long j, long j2, long j3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }
}
