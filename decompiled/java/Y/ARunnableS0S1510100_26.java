package Y;

import X.C1758370vrH;
import X.C1758380vrI;
import X.C1758390vrJ;
import X.C1758400vrK;
import X.C1758410vrL;
import X.C19EG;
import X.C1C7U;
import X.C23250099c;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS0S1510100_26 implements Runnable {
    public final int $t;
    public long j7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public boolean z6;

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

    public static final void run$0(ARunnableS0S1510100_26 aRunnableS0S1510100_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1");
        try {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) aRunnableS0S1510100_26.l1), null, null, new C1758400vrK((IPdpStarter.PdpEnterParam) aRunnableS0S1510100_26.l2, aRunnableS0S1510100_26.s0, (C1758370vrH) aRunnableS0S1510100_26.l3, aRunnableS0S1510100_26.z6, (Function0) aRunnableS0S1510100_26.l4, (C19EG) aRunnableS0S1510100_26.l1, (C1758380vrI) aRunnableS0S1510100_26.l5, aRunnableS0S1510100_26.j7, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpStarterOptimized@4303.jump2PdpInterceptor$1");
    }

    public static final void run$1(ARunnableS0S1510100_26 aRunnableS0S1510100_26) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1");
        try {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) aRunnableS0S1510100_26.l1), null, null, new C1758410vrL((IPdpStarter.PdpEnterParam) aRunnableS0S1510100_26.l2, aRunnableS0S1510100_26.s0, (C1758370vrH) aRunnableS0S1510100_26.l3, aRunnableS0S1510100_26.z6, (Function0) aRunnableS0S1510100_26.l4, (C19EG) aRunnableS0S1510100_26.l1, (C1758390vrJ) aRunnableS0S1510100_26.l5, aRunnableS0S1510100_26.j7, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpStarterOptimized@3f18.jump2PdpInterceptor$1");
    }

    public ARunnableS0S1510100_26(Object obj, Object obj2, String str, Object obj3, boolean z, Object obj4, Object obj5, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
        this.z6 = z;
        this.l4 = obj4;
        this.l5 = obj5;
        this.j7 = j;
    }
}
