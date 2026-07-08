package X;

import java.util.HashMap;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623890sMN implements InterfaceC1623560sLq {
    public final InterfaceC1625060sOG LIZ;
    public final C01GW LIZIZ;

    @Override // X.InterfaceC1623560sLq
    public final InterfaceC2218911Bsv LIZ() {
        return (InterfaceC2218911Bsv) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1623560sLq
    public final int LJLJLJ() {
        return this.LIZ.LJLJLJ();
    }

    public C1623890sMN(InterfaceC1625060sOG interfaceC1625060sOG) {
        this.LIZ = interfaceC1625060sOG;
        new HashMap();
        this.LIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 171));
    }

    @Override // X.InterfaceC1623560sLq
    public final void LJJZZI(boolean z) {
        this.LIZ.LJJZZI(z);
    }
}
