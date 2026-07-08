package Y;

import X.C1775290wIZ;
import X.C1775300wIa;
import X.C1C7U;
import X.C21281718Qd;
import X.C21281818Qe;
import X.C786410Ut5;
import android.widget.TextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS19S0200100_26 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strK4;
        C21281818Qe c21281818Qe = (C21281818Qe) this.l0;
        C1775300wIa c1775300wIa = (C1775300wIa) this.l1;
        long j = this.j2;
        c1775300wIa.getClass();
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 <= 0) {
            strK4 = "00:00";
        } else {
            long j3 = 60;
            strK4 = C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
            if (strK4 == null) {
                c21281818Qe.getClass();
                return;
            }
        }
        TextView textView = c21281818Qe.LLILZ;
        if (textView != null) {
            textView.setText(strK4);
        }
    }

    public final void LIZ$1() {
        String strK4;
        C21281718Qd c21281718Qd = (C21281718Qd) this.l0;
        C1775290wIZ c1775290wIZ = (C1775290wIZ) this.l1;
        long j = this.j2;
        c1775290wIZ.getClass();
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (j2 <= 0) {
            strK4 = "00:00";
        } else {
            long j3 = 60;
            strK4 = C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2));
            if (strK4 == null) {
                c21281718Qd.getClass();
                return;
            }
        }
        TextView textView = c21281718Qd.LLILLL;
        if (textView != null) {
            textView.setText(strK4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r9 = r0.l0
            X.0vvT r9 = (X.C1760970vvT) r9
            java.lang.Object r7 = r0.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale r7 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale) r7
            long r2 = r0.j2
            r9.LIZIZ()
            r0 = 0
            r9.LJIIJJI = r0
            java.lang.String r0 = r7.startTime
            r8 = 0
            if (r0 == 0) goto L85
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L85
            java.lang.String r0 = r7.endTime
            if (r0 == 0) goto L85
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L85
            r9.LJIIIIZZ = r2
            java.lang.String r0 = r7.startTime
            long r14 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r14 = r14 * r0
            java.lang.String r4 = r7.endTime
            long r12 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4)
            long r12 = r12 * r0
            java.lang.String r6 = r7.countdown
            r4 = 0
            if (r6 == 0) goto L93
            java.lang.Long r6 = X.C2095008Iq.LJIILIIL(r6)
            if (r6 == 0) goto L93
            long r10 = r6.longValue()
        L4a:
            long r10 = r10 * r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9.LIZLLL = r0
            java.lang.Integer r7 = r7.status
            r6 = 2
            if (r7 == 0) goto L91
            int r1 = r7.intValue()
            r0 = 1
            if (r1 != r0) goto L86
            r9.LJIIIZ = r0
            r9.LJIIJ = r0
            long r12 = r12 + r10
            long r12 = r12 - r14
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L69
            r9.LJIIIZ = r6
        L69:
            r4 = r10
            r10 = r12
        L6b:
            long r0 = r9.LIZLLL
            long r4 = r4 + r0
            r9.LJ = r4
            long r0 = r0 + r10
            r9.LJFF = r0
            Y.ARunnableS126S0100000_26 r0 = r9.LJIIL
            if (r0 != 0) goto L78
            r0 = r8
        L78:
            r0.run()
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r9.LJI
            Y.ARunnableS126S0100000_26 r0 = r9.LJIIL
            if (r0 == 0) goto L82
            r8 = r0
        L82:
            X.C786410Ut5.LJLIIL(r2, r1, r8)
        L85:
            return
        L86:
            int r0 = r7.intValue()
            if (r0 != r6) goto L91
            r9.LJIIIZ = r6
            r9.LJIIJ = r6
            goto L6b
        L91:
            r4 = r10
            goto L6b
        L93:
            r10 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS19S0200100_26.LIZ$2():void");
    }

    public static final void run$0(ARunnableS19S0200100_26 aRunnableS19S0200100_26) {
        boolean zLIZ;
        C1C7U.LIZ("MMKSingleVideoView@a724.updateCountdownText$1$1");
        try {
            aRunnableS19S0200100_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MMKSingleVideoView@a724.updateCountdownText$1$1");
    }

    public static final void run$1(ARunnableS19S0200100_26 aRunnableS19S0200100_26) {
        boolean zLIZ;
        C1C7U.LIZ("EcVideoView@8143.updateCountdownText$1$1");
        try {
            aRunnableS19S0200100_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcVideoView@8143.updateCountdownText$1$1");
    }

    public static final void run$2(ARunnableS19S0200100_26 aRunnableS19S0200100_26) {
        boolean zLIZ;
        C1C7U.LIZ("FlashSaleCountDownService@62e1.startCountDownInMainThread$1");
        try {
            aRunnableS19S0200100_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashSaleCountDownService@62e1.startCountDownInMainThread$1");
    }

    public ARunnableS19S0200100_26(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
    }
}
