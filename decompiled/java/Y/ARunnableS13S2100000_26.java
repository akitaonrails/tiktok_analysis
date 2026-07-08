package Y;

import X.C1533950q1J;
import X.C1711110ud3;
import X.C1771590wCb;
import X.C1773060wEy;
import X.C1773410wFX;
import X.C1C7U;
import X.InterfaceC1773310wFN;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierAssem;
import java.util.Collections;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS13S2100000_26 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final void run$0(ARunnableS13S2100000_26 aRunnableS13S2100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ECLynxCardViewOptHolder@189.mmkAbility$2$1$removeCurrentCell$1$1$1");
        try {
            ((InterfaceC1773310wFN) aRunnableS13S2100000_26.l2).LJIIIZ().Qb2(new C1773060wEy(Collections.singletonList(aRunnableS13S2100000_26.s0), new C1771590wCb(aRunnableS13S2100000_26.s1, 0, null, "fetch", "unknown", null, null, null, null, null, false, 65306)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECLynxCardViewOptHolder@189.mmkAbility$2$1$removeCurrentCell$1$1$1");
    }

    public static final void run$1(ARunnableS13S2100000_26 aRunnableS13S2100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RefundCashierAssem@d6e8.onRefundOptionUpdated$1");
        try {
            RefundCashierAssem refundCashierAssem = (RefundCashierAssem) aRunnableS13S2100000_26.l2;
            refundCashierAssem.LLJJIJI = aRunnableS13S2100000_26.s0;
            refundCashierAssem.LLJJIJIIJIL = aRunnableS13S2100000_26.s1;
            if (!(refundCashierAssem.LLJJIJIL instanceof C1711110ud3)) {
                refundCashierAssem.Jo().setEnabled(C1533950q1J.LJ(aRunnableS13S2100000_26.s1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RefundCashierAssem@d6e8.onRefundOptionUpdated$1");
    }

    public static final void run$2(ARunnableS13S2100000_26 aRunnableS13S2100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ECMMKGecCardItemViewHolder@f3a7.removeIfError$1$1$1");
        try {
            ((C1773410wFX) aRunnableS13S2100000_26.l2).LL.LJIIIZ().Qb2(new C1773060wEy(Collections.singletonList(aRunnableS13S2100000_26.s0), new C1771590wCb(aRunnableS13S2100000_26.s1, 0, null, "fetch", "unknown", null, null, null, null, null, false, 65306)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECMMKGecCardItemViewHolder@f3a7.removeIfError$1$1$1");
    }

    public ARunnableS13S2100000_26(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
