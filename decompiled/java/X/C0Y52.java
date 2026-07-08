package X;

import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y52, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y52 {
    public final C868200Y4c LIZ;
    public final C868140Y3w LIZIZ;
    public final C0YLE LIZJ;
    public final C871360YGg LIZLLL;
    public final C1741006ro LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    public final C870180YBs LIZ() {
        return (C870180YBs) this.LJII.getValue();
    }

    public final InterfaceC868170Y3z LIZJ() {
        return (InterfaceC868170Y3z) this.LJI.getValue();
    }

    public final InterfaceC863630XuL LIZLLL() {
        return (InterfaceC863630XuL) this.LJFF.getValue();
    }

    public final C868200Y4c LIZIZ() {
        return this.LIZ;
    }

    public final C868140Y3w LJ() {
        return this.LIZIZ;
    }

    public C0Y52(C0YDJ c0ydj) {
        this.LIZ = new C868200Y4c(c0ydj.LIZ);
        this.LIZIZ = new C868140Y3w(c0ydj.LIZ);
        this.LIZJ = new C0YLE(c0ydj.LIZ);
        C871360YGg c871360YGg = c0ydj.LIZIZ;
        this.LIZLLL = c871360YGg == null ? new C871360YGg() : c871360YGg;
        this.LJ = new C1741006ro(new AwS546S0100000_2(this, 909));
        this.LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(c0ydj, 1260));
        this.LJI = C452501pT.LIZIZ(new AwS415S0200000_14(c0ydj, this, 70));
        this.LJII = C452501pT.LIZIZ(new AwS558S0100000_14(c0ydj, 1259));
    }
}
