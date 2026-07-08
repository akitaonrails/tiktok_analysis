package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: renamed from: X.1B7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199871B7x {
    public final C1498850p6h<String, C1B8K> LIZ = new C1498850p6h<>(4, 16, false);
    public final BPEAHandler LIZIZ = new BPEAHandler(C786410Ut5.W2(C2199761B7m.LIZ));
    public final BPEAHandler LIZJ = new BPEAHandler(C1700030uLB.LIZ);

    public final void LIZ(String str, List<InetAddress> list) {
        synchronized (this.LIZ) {
            try {
                C1B8K c1b8k = this.LIZ.get(str);
                if (c1b8k == null) {
                    c1b8k = new C1B8K();
                    this.LIZ.put(str, c1b8k);
                }
                c1b8k.LIZ = list;
                c1b8k.LIZIZ = System.currentTimeMillis();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
