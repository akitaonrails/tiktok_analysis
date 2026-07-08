package Y;

import X.C1700650uMB;
import X.C1C7U;
import X.InterfaceC1700660uMC;
import com.bytedance.common.jato.JatoXL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS3S0010000_26 implements Runnable {
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

    public static final void run$0(ARunnableS3S0010000_26 aRunnableS3S0010000_26) {
        JatoXL.lambda$setEnabledThreadAttrFix$0(aRunnableS3S0010000_26.z0);
    }

    public static final void run$1(ARunnableS3S0010000_26 aRunnableS3S0010000_26) {
        boolean zLIZ;
        C1C7U.LIZ("DynamicPopupsManager@93ca.notifyDynamicPopupListener$1");
        try {
            List<InterfaceC1700660uMC> list = C1700650uMB.LIZ;
            boolean z = aRunnableS3S0010000_26.z0;
            for (InterfaceC1700660uMC interfaceC1700660uMC : (ArrayList) list) {
                if (z) {
                    interfaceC1700660uMC.LIZIZ();
                } else {
                    interfaceC1700660uMC.LIZ();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DynamicPopupsManager@93ca.notifyDynamicPopupListener$1");
    }

    public ARunnableS3S0010000_26(boolean z, int i) {
        this.$t = i;
        if (i != 0) {
            this.z0 = z;
        } else {
            this.z0 = z;
        }
    }
}
