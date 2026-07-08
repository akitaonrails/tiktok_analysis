package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899050zWB {
    public boolean LIZJ;
    public final List<InterfaceC1899330zWd> LIZ = new ArrayList();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC1899060zWC LIZLLL = new Runnable() { // from class: X.0zWC
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TaskTimer@561f.timerAction$1");
            try {
                Iterator it2 = ((ArrayList) this.LL.LIZ).iterator();
                while (it2.hasNext()) {
                    C01U6.LIZIZ(new AwS572S0100000_28((InterfaceC1899330zWd) it2.next(), 21));
                }
                C1899050zWB c1899050zWB = this.LL;
                C786410Ut5.LJLIIL(1000L, c1899050zWB.LIZIZ, c1899050zWB.LIZLLL);
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TaskTimer@561f.timerAction$1");
        }
    };

    public final void LIZIZ() {
        if (this.LIZJ) {
            this.LIZJ = false;
            this.LIZIZ.removeCallbacksAndMessages(null);
        }
        ((ArrayList) this.LIZ).clear();
        this.LIZJ = false;
    }

    public final void LIZJ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C786410Ut5.LJLIIL(1000L, this.LIZIZ, this.LIZLLL);
    }

    public final void LIZLLL() {
        if (this.LIZJ) {
            this.LIZJ = false;
            this.LIZIZ.removeCallbacksAndMessages(null);
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1899330zWd) it2.next()).LIZLLL();
        }
    }

    public final void LIZ(InterfaceC1899330zWd interfaceC1899330zWd) {
        if (((ArrayList) this.LIZ).contains(interfaceC1899330zWd)) {
            return;
        }
        ((ArrayList) this.LIZ).add(interfaceC1899330zWd);
    }
}
