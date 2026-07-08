package X;

import X.InterfaceC613710O5h;
import java.util.Collections;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0O6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613970O6h<D extends InterfaceC613710O5h> {
    public final InterfaceC613730O5j<D> LIZ;
    public final C0O8O LIZIZ;
    public final C613950O6f LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, (C613970O6h<InterfaceC613710O5h>) 1739));

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MotaRequest(operation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", motaContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mota=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InterfaceC346201Wa<C0O7A<D>> LIZ() {
        C613950O6f c613950O6f = this.LIZJ;
        InterfaceC613730O5j<D> interfaceC613730O5j = this.LIZ;
        C613970O6h<D> c613970O6h = new C613970O6h<>(c613950O6f, interfaceC613730O5j, this.LIZIZ);
        c613950O6f.getClass();
        if (interfaceC613730O5j instanceof InterfaceC613720O5i) {
            return new C613980O6i(C13LP.LJLILLLLZI(new C614000O6k(c613950O6f.LIZ), C13LP.LJLILLLLZI(c613950O6f.LIZJ.getValue(), Collections.singletonList(c613950O6f.LIZLLL.getValue())))).LIZ(c613970O6h);
        }
        if (interfaceC613730O5j instanceof InterfaceC613740O5k) {
            return new C613980O6i(C13LP.LJLILLLLZI(new C614000O6k(c613950O6f.LIZ), Collections.singletonList(c613950O6f.LIZIZ.getValue()))).LIZ(c613970O6h);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this operation: ");
        sbLIZ.append(c613970O6h);
        sbLIZ.append(" not support");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C613970O6h(C613950O6f c613950O6f, InterfaceC613730O5j interfaceC613730O5j, C0O8O c0o8o) {
        this.LIZ = interfaceC613730O5j;
        this.LIZIZ = c0o8o;
        this.LIZJ = c613950O6f;
    }
}
