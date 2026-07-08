package X;

import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179111AQb implements InterfaceC2179131AQd {
    public final InterfaceC2179261AQq LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3903));
    public int LIZJ;

    @Override // X.InterfaceC2179131AQd
    public final List<InterfaceC2179261AQq> LIZIZ() {
        return (List) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC2179131AQd
    public final String getId() {
        String id;
        InterfaceC2179261AQq interfaceC2179261AQq = this.LIZ;
        return (interfaceC2179261AQq == null || (id = interfaceC2179261AQq.getId()) == null) ? "" : id;
    }

    @Override // X.InterfaceC2179131AQd
    public final int LJLJJL() {
        return this.LIZJ;
    }

    public C2179111AQb(InterfaceC2179261AQq interfaceC2179261AQq) {
        this.LIZ = interfaceC2179261AQq;
    }

    @Override // X.InterfaceC2179131AQd
    public final void LIZ(int i) {
        this.LIZJ = i;
    }
}
