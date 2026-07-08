package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0wcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787600wcQ implements InterfaceC1789000weg {
    public final int LIZ;
    public final double LIZIZ;

    @Override // X.InterfaceC1789000weg
    public final String getName() {
        return "order_retry";
    }

    public C1787600wcQ(double d, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        d = (i & 2) != 0 ? 1.0d : d;
        this.LIZ = i2;
        this.LIZIZ = d;
    }

    @Override // X.InterfaceC1789000weg
    public final Object LIZ(int i, C1788990wef c1788990wef) {
        Object objLIZIZ = AnonymousClass0958.LIZIZ((long) (((long) Math.min(i, this.LIZ)) * 1000 * this.LIZIZ), c1788990wef);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1789000weg
    public final boolean LIZIZ(int i, Exception exc) {
        return exc instanceof C1787950wcz;
    }
}
