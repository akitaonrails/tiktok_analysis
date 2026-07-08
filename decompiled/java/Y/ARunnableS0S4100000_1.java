package Y;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS0S4100000_1 implements Runnable {
    public final int $t;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final void run$0(ARunnableS0S4100000_1 aRunnableS0S4100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PaymentBindHelper@f28b.openBindUrl$2$1");
        try {
            PaymentBindHelper.LIZ.getClass();
            String str = PaymentBindHelper.LJ;
            if (str != null) {
                PaymentBindHelper.LJII((CommuteType) aRunnableS0S4100000_1.l4, aRunnableS0S4100000_1.s0, str, aRunnableS0S4100000_1.s1, aRunnableS0S4100000_1.s2, aRunnableS0S4100000_1.s3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaymentBindHelper@f28b.openBindUrl$2$1");
    }

    public static final void run$1(ARunnableS0S4100000_1 aRunnableS0S4100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PaymentBindHelper@f28b.openBindUrl$2");
        try {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS0S4100000_1(aRunnableS0S4100000_1.s0, aRunnableS0S4100000_1.s1, (CommuteType) aRunnableS0S4100000_1.l4, aRunnableS0S4100000_1.s2, aRunnableS0S4100000_1.s3, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaymentBindHelper@f28b.openBindUrl$2");
    }

    public ARunnableS0S4100000_1(String str, String str2, CommuteType commuteType, String str3, String str4, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = commuteType;
        this.s2 = str3;
        this.s3 = str4;
    }
}
