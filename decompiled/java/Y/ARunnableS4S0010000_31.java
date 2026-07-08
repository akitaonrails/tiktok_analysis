package Y;

import X.C1233040iBy;
import X.C15YE;
import X.C1C7U;
import X.C844470XAv;
import android.os.Bundle;
import com.ss.android.common.applog.AppLog;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS4S0010000_31 implements Runnable {
    public final int $t;
    public boolean z0;

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
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", C15YE.LJIIJ() ? 2 : 0);
        AppLog.setCustomerHeader(bundle);
        int i = this.z0 ? 2131846523 : 2131846522;
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(i);
        c1233040iBy.LIZLLL();
    }

    public final void LIZ$1() {
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", C15YE.LJIIJ() ? 2 : 0);
        AppLog.setCustomerHeader(bundle);
        int i = this.z0 ? 2131846523 : 2131846522;
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(i);
        c1233040iBy.LIZLLL();
    }

    public static final void run$0(ARunnableS4S0010000_31 aRunnableS4S0010000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FamilyPairingManager@6b46.toggleFamilyPairingRestrictMode$1");
        try {
            aRunnableS4S0010000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FamilyPairingManager@6b46.toggleFamilyPairingRestrictMode$1");
    }

    public static final void run$1(ARunnableS4S0010000_31 aRunnableS4S0010000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FamilyPairingManagerV2@bc14.toggleFamilyPairingRestrictMode$1");
        try {
            aRunnableS4S0010000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FamilyPairingManagerV2@bc14.toggleFamilyPairingRestrictMode$1");
    }

    public ARunnableS4S0010000_31(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
