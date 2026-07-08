package Y;

import X.C1235670iGD;
import X.C197039127h;
import X.C1C7U;
import X.C786410Ut5;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity;
import com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS7S1400000_19 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
        String string;
        CharSequence message = ((C1235670iGD) this.l1).getMessage();
        if (message == null || (string = message.toString()) == null) {
            string = "";
        }
        if (!Intrinsics.LJFF(string, this.s0)) {
            TuxTextView tuxTextView = (TuxTextView) this.l2;
            if (tuxTextView != null) {
                tuxTextView.setText(String.valueOf(string.length()));
            }
            this.s0 = string;
            C1235670iGD c1235670iGD = ((MinisReportOrderActivity) this.l3).LLILLL;
            if (String.valueOf(c1235670iGD != null ? c1235670iGD.getMessage() : null).length() <= ((MinisReportOrderActivity) this.l3).LL) {
                TuxTextView tuxTextView2 = (TuxTextView) this.l2;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.a1k);
                }
            } else {
                TuxTextView tuxTextView3 = (TuxTextView) this.l2;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColorRes(R.attr.a1l);
                }
            }
            MinisReportOrderActivity minisReportOrderActivity = (MinisReportOrderActivity) this.l3;
            C197039127h c197039127h = minisReportOrderActivity.LLILLJJLI;
            if (c197039127h != null) {
                c197039127h.setEnabled(a0.LJLIIIL(string).toString().length() > 0 && string.length() <= minisReportOrderActivity.LL);
            }
        }
        C786410Ut5.LJLIIL(150L, (Handler) this.l4, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l1
            X.0iGD r0 = (X.C1235670iGD) r0
            java.lang.CharSequence r0 = r0.getMessage()
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L12
        L10:
            java.lang.String r2 = ""
        L12:
            java.lang.String r0 = r4.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L7e
            java.lang.Object r1 = r4.l2
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L2b
            int r0 = r2.length()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
        L2b:
            r4.s0 = r2
            java.lang.Object r0 = r4.l3
            com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity r0 = (com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity) r0
            X.0iGD r0 = r0.LLJJI
            r3 = 0
            if (r0 == 0) goto L97
            java.lang.CharSequence r0 = r0.getMessage()
        L3a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.Object r0 = r4.l3
            com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity r0 = (com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity) r0
            int r0 = r0.LLILLJJLI
            if (r1 > r0) goto L8a
            java.lang.Object r1 = r4.l2
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L56
            r0 = 2131100625(0x7f0603d1, float:1.7813637E38)
            r1.setTextColorRes(r0)
        L56:
            java.lang.Object r1 = r4.l3
            com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity r1 = (com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity) r1
            X.127h r2 = r1.LLJJ
            if (r2 == 0) goto L7e
            int r0 = r1.LL
            if (r0 == 0) goto L88
            X.0iGD r0 = r1.LLJJI
            if (r0 == 0) goto L6a
            java.lang.CharSequence r3 = r0.getMessage()
        L6a:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r1 = r0.length()
            java.lang.Object r0 = r4.l3
            com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity r0 = (com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity) r0
            int r0 = r0.LLILLJJLI
            if (r1 > r0) goto L88
            r0 = 1
        L7b:
            r2.setEnabled(r0)
        L7e:
            java.lang.Object r2 = r4.l4
            android.os.Handler r2 = (android.os.Handler) r2
            r0 = 150(0x96, double:7.4E-322)
            X.C786410Ut5.LJLIIL(r0, r2, r4)
            return
        L88:
            r0 = 0
            goto L7b
        L8a:
            java.lang.Object r1 = r4.l2
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            if (r1 == 0) goto L56
            r0 = 2131100626(0x7f0603d2, float:1.7813639E38)
            r1.setTextColorRes(r0)
            goto L56
        L97:
            r0 = r3
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S1400000_19.LIZ$1():void");
    }

    public static final void run$0(ARunnableS7S1400000_19 aRunnableS7S1400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("MinisReportOrderActivity@a3c7.setInputAndSubmitField$1$updateTextRunnable$1");
        try {
            aRunnableS7S1400000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisReportOrderActivity@a3c7.setInputAndSubmitField$1$updateTextRunnable$1");
    }

    public static final void run$1(ARunnableS7S1400000_19 aRunnableS7S1400000_19) {
        boolean zLIZ;
        C1C7U.LIZ("MinisReportFeedbackActivity@1249.setInputAndSubmitField$1$updateTextRunnable$1");
        try {
            aRunnableS7S1400000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisReportFeedbackActivity@1249.setInputAndSubmitField$1$updateTextRunnable$1");
    }

    public ARunnableS7S1400000_19(C1235670iGD c1235670iGD, TuxTextView tuxTextView, MinisReportFeedbackActivity minisReportFeedbackActivity, BPEAHandler bPEAHandler, int i) {
        String string;
        this.$t = i;
        this.l1 = c1235670iGD;
        this.l2 = tuxTextView;
        this.l3 = minisReportFeedbackActivity;
        this.l4 = bPEAHandler;
        CharSequence message = c1235670iGD.getMessage();
        this.s0 = (message == null || (string = message.toString()) == null) ? "" : string;
    }

    public ARunnableS7S1400000_19(C1235670iGD c1235670iGD, TuxTextView tuxTextView, MinisReportOrderActivity minisReportOrderActivity, BPEAHandler bPEAHandler, int i) {
        String string;
        this.$t = i;
        this.l1 = c1235670iGD;
        this.l2 = tuxTextView;
        this.l3 = minisReportOrderActivity;
        this.l4 = bPEAHandler;
        CharSequence message = c1235670iGD.getMessage();
        this.s0 = (message == null || (string = message.toString()) == null) ? "" : string;
    }
}
