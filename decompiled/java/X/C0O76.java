package X;

import X.InterfaceC613710O5h;

/* JADX INFO: renamed from: X.0O76, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O76<D extends InterfaceC613710O5h> {
    public final C613970O6h<D> LIZ;
    public D LIZIZ;
    public C614090O6t LIZJ;

    public final C0O7A<D> LIZ() {
        C614090O6t c614090O6t = this.LIZJ;
        if (c614090O6t != null) {
            return ((c614090O6t instanceof C0O7D) || (c614090O6t instanceof C0O7C)) ? new C0O77(this.LIZ, c614090O6t) : new C0O78(this.LIZ, c614090O6t);
        }
        D d = this.LIZIZ;
        if (d != null) {
            return new C0O79(this.LIZ, d);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error and data is null: ");
        sbLIZ.append(this.LIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C0O76(C613970O6h<D> c613970O6h) {
        this.LIZ = c613970O6h;
    }
}
