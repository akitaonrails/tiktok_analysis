package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ese, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105740ese {
    public static C1105740ese LJ;
    public boolean LIZIZ;
    public InterfaceC1105760esg LIZLLL;
    public final PriorityQueue<InterfaceC1105760esg> LIZ = new PriorityQueue<>(20, new Comparator() { // from class: X.0esf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Intrinsics.LJI(((InterfaceC1105760esg) obj).getPriority(), ((InterfaceC1105760esg) obj2).getPriority());
        }
    });
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZIZ() {
        if (this.LIZIZ || this.LIZ.isEmpty()) {
            return;
        }
        InterfaceC1105760esg interfaceC1105760esgPoll = this.LIZ.poll();
        this.LIZLLL = interfaceC1105760esgPoll;
        this.LIZIZ = true;
        C786410Ut5.LJLIIL(1000L, this.LIZJ, new ARunnableS117S0100000_17(interfaceC1105760esgPoll, 0));
    }

    public final void LIZ(AbstractC1105780esi abstractC1105780esi) {
        if (!this.LIZ.contains(abstractC1105780esi) && !Intrinsics.LJFF(this.LIZLLL, abstractC1105780esi)) {
            this.LIZ.offer(abstractC1105780esi);
            LIZIZ();
        }
    }
}
