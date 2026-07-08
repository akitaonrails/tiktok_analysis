package X;

import java.util.List;

/* JADX INFO: renamed from: X.0i0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225940i0W extends AbstractC1225870i0P {
    public final List<C1225950i0X> LIZ;
    public final C1224630hyP LIZIZ;
    public final List<C1225950i0X> LIZJ;

    @Override // X.AbstractC1225870i0P
    public final C1224630hyP LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1225870i0P
    public final List<C1225950i0X> LIZIZ() {
        return this.LIZJ;
    }

    public C1225940i0W(List list) {
        C622840Obq c622840Obq = new C622840Obq();
        c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
        c622840Obq.LIZ = 1;
        C1224630hyP c1224630hyP = new C1224630hyP(c622840Obq);
        this.LIZ = list;
        this.LIZIZ = c1224630hyP;
        this.LIZJ = list;
    }
}
