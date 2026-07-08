package X;

import Y.ARunnableS20S0210000_19;
import android.os.Looper;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1664690tQB<STATE> {
    public STATE LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZJ;
    public final C1664700tQC LIZLLL;
    public final List<Runnable> LJ;
    public final C830490Whz LJFF;
    public final LiveState<STATE> LJI;

    public final synchronized <V> LiveState<V> LIZ(InterfaceC2217241BqE<? super STATE, ? extends V> interfaceC2217241BqE) {
        LiveState<V> liveState = (LiveState) this.LJFF.get(interfaceC2217241BqE);
        if (liveState != null) {
            return liveState;
        }
        LiveState<V> liveState2 = new LiveState<>(new AwS426S0200000_25(interfaceC2217241BqE, this, 133));
        this.LJFF.put(interfaceC2217241BqE, liveState2);
        return liveState2;
    }

    public final void LIZIZ(boolean z) {
        this.LIZJ = true;
        try {
            Iterator it2 = this.LJFF.values().iterator();
            while (it2.hasNext()) {
                ((LiveState) it2.next()).LJII(z);
            }
            if (true ^ this.LJI.LIZJ.isEmpty()) {
                this.LJI.LJII(z);
            }
            this.LIZJ = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tQC, java.lang.Object] */
    public C1664690tQB(Function1 function1, Object obj) {
        this.LIZ = obj;
        ?? r0 = new Object() { // from class: X.0tQC
        };
        this.LIZLLL = r0;
        if (function1 != null) {
            function1.invoke(r0);
        }
        this.LJ = new ArrayList();
        this.LJFF = new C830490Whz();
        this.LJI = new LiveState<>(new AwS569S0100000_25(this, (C1664690tQB<Object>) 829));
    }

    public void LIZJ(Function1 function1, boolean z) {
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS20S0210000_19(function1, this, z, 1));
    }
}
