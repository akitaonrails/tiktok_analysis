package X;

import com.google.gson.n;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BPT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BPT implements C1BQC {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C1BP4 LIZIZ;

    @Override // X.C1BQC
    public final void close() {
        this.LIZ.compareAndSet(false, true);
    }

    public C1BPT(C1BP4 c1bp4) {
        this.LIZIZ = c1bp4;
    }

    @Override // X.C1BQC
    public final void LIZ(final C2204481BPq c2204481BPq) {
        C1BP4 c1bp4 = this.LIZIZ;
        c1bp4.LJ.LIZJ(new InterfaceC1530550pvp() { // from class: X.1BPu
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                C1BPT c1bpt = this.LIZ;
                InterfaceC1530550pvp interfaceC1530550pvp = c2204481BPq;
                if (!c1bpt.LIZ.get() && obj != null) {
                    interfaceC1530550pvp.accept(obj);
                }
            }
        });
    }

    @Override // X.C1BQC
    public final void LIZIZ(n nVar) {
        if (this.LIZ.get()) {
            return;
        }
        this.LIZIZ.LJFF.sendWorkerBridgeMessage(C1BQX.LIZIZ(nVar));
    }
}
