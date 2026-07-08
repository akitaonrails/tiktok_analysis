package Y;

import X.C10515049h;
import X.C1748720vbi;
import X.C1C7U;
import X.C898303fB;
import X.C914603ho;
import X.InterfaceC919903if;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import kotlin.jvm.internal.AwS26S0310000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS3S0310000_1 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final void run$0(ARunnableS3S0310000_1 aRunnableS3S0310000_1) {
        boolean zLIZ;
        C1C7U.LIZ("RequestService@938a.queryOrderRequest$1");
        try {
            C914603ho c914603ho = (C914603ho) aRunnableS3S0310000_1.l2;
            C898303fB c898303fB = (C898303fB) aRunnableS3S0310000_1.l0;
            boolean z = aRunnableS3S0310000_1.z3;
            InterfaceC919903if interfaceC919903if = (InterfaceC919903if) aRunnableS3S0310000_1.l1;
            c914603ho.getClass();
            C914603ho.LJFF(c898303fB, z, interfaceC919903if);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RequestService@938a.queryOrderRequest$1");
    }

    public static final void run$1(ARunnableS3S0310000_1 aRunnableS3S0310000_1) {
        boolean zLIZ;
        C1C7U.LIZ("USLogisticSelectAddressItemVH@ed63.onBind$1$7");
        try {
            C1748720vbi.LJFF(((USLogisticSelectAddressItemVH) aRunnableS3S0310000_1.l0).itemView, new C10515049h(), new AwS545S0100000_1((Address) aRunnableS3S0310000_1.l1, 1815), new AwS26S0310000_1((Address) aRunnableS3S0310000_1.l1, (ReachableAddress) aRunnableS3S0310000_1.l2, (USLogisticSelectAddressItemVH) aRunnableS3S0310000_1.l0, aRunnableS3S0310000_1.z3, 9));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("USLogisticSelectAddressItemVH@ed63.onBind$1$7");
    }

    public ARunnableS3S0310000_1(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.z3 = z;
        this.l2 = obj2;
    }
}
