package X;

import Y.ARunnableS124S0100000_24;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0quS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568140quS implements InterfaceC1574170r4B {
    public final CopyOnWriteArrayList<InterfaceC1568150quT> LIZ = new CopyOnWriteArrayList<>();
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1574170r4B
    public final void LIZ(InterfaceC1568150quT interfaceC1568150quT) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZ.remove(interfaceC1568150quT)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1574170r4B
    public final void LIZIZ(InterfaceC1568150quT interfaceC1568150quT) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZ.add(interfaceC1568150quT)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1574170r4B
    public final void LIZJ(InterfaceC1574160r4A interfaceC1574160r4A, boolean z) {
        AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24(this, interfaceC1574160r4A, 28);
        if (z) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS124S0100000_24(awS425S0200000_24, 57));
        } else {
            awS425S0200000_24.invoke();
        }
    }
}
