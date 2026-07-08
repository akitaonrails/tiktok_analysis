package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0j67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267850j67 extends AudioSink {
    public final List<InterfaceC1267860j68> LL = new ArrayList();
    public final List<InterfaceC1267860j68> LLILLJJLI = new ArrayList();
    public final List<InterfaceC1267860j68> LLILLL = new ArrayList();
    public final Object LLILZ = new Object();

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public final void onNoData() {
    }

    public final void LLIZ(InterfaceC1267860j68 interfaceC1267860j68) {
        synchronized (this.LLILZ) {
            try {
                ((ArrayList) this.LLILLL).remove(interfaceC1267860j68);
                if (!((ArrayList) this.LL).contains(interfaceC1267860j68) && !((ArrayList) this.LLILLJJLI).contains(interfaceC1267860j68)) {
                    ((ArrayList) this.LLILLJJLI).add(interfaceC1267860j68);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LLIZLLLIL(InterfaceC1267860j68 interfaceC1267860j68) {
        synchronized (this.LLILZ) {
            try {
                ((ArrayList) this.LLILLJJLI).remove(interfaceC1267860j68);
                if (((ArrayList) this.LL).contains(interfaceC1267860j68) && !((ArrayList) this.LLILLL).contains(interfaceC1267860j68)) {
                    ((ArrayList) this.LLILLL).add(interfaceC1267860j68);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public final void onData(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this.LLILZ) {
            try {
                if (!((ArrayList) this.LLILLJJLI).isEmpty()) {
                    ((ArrayList) this.LL).addAll(this.LLILLJJLI);
                    ((ArrayList) this.LLILLJJLI).clear();
                }
                if (!((ArrayList) this.LLILLL).isEmpty()) {
                    ((ArrayList) this.LL).removeAll(this.LLILLL);
                    ((ArrayList) this.LLILLL).clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC1267860j68 interfaceC1267860j68 : (ArrayList) this.LL) {
            if (interfaceC1267860j68 != null) {
                buffer.position(0);
                interfaceC1267860j68.LLILLIZIL(buffer, i, i2, i3, j);
            }
        }
    }
}
