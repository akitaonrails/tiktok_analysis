package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* JADX INFO: renamed from: X.0kT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320560kT8 {
    public static C1320560kT8 LIZLLL;
    public final RunnableC1320550kT7 LIZJ = new Runnable() { // from class: X.0kT7
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("DeferredReleaser@9bd7.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("DeferredReleaser@9bd7.<field>$1");
        }

        public final void LIZ() {
            C1320560kT8.LIZIZ();
            Iterator it2 = ((HashSet) this.LL.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1320280kSg) it2.next()).release();
            }
            ((HashSet) this.LL.LIZ).clear();
            C1320560kT8 c1320560kT8 = C1320560kT8.LIZLLL;
        }
    };
    public final Set<InterfaceC1320280kSg> LIZ = new HashSet();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    static {
        new Random().nextFloat();
    }

    public static void LIZIZ() {
        C1322350kW1.LJFF(Looper.getMainLooper().getThread() == C786410Ut5.u3());
    }

    public void LIZ(InterfaceC1320280kSg interfaceC1320280kSg) {
        LIZIZ();
        ((HashSet) this.LIZ).remove(interfaceC1320280kSg);
    }

    public void LIZJ(InterfaceC1320280kSg interfaceC1320280kSg) {
        LIZIZ();
        if (((HashSet) this.LIZ).add(interfaceC1320280kSg) && ((HashSet) this.LIZ).size() == 1) {
            C786410Ut5.LJJZZIII(this.LIZIZ, this.LIZJ);
        }
    }
}
