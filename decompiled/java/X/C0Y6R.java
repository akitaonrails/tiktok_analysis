package X;

import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y6R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y6R implements InterfaceC868610Y5r {
    public final C0Y60 LIZ;
    public final C0YJB LIZIZ;
    public final C870870YEj LIZJ;
    public final C868740Y6e LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    @Override // X.InterfaceC868610Y5r
    public final C0Y2J LIZJ() {
        return (C0Y2J) this.LJ.getValue();
    }

    @Override // X.InterfaceC868610Y5r
    public final C0Y66 LJI() {
        return (C0Y66) this.LJI.getValue();
    }

    @Override // X.InterfaceC868610Y5r
    public final C0Y48 LJII() {
        return (C0Y48) this.LJFF.getValue();
    }

    @Override // X.InterfaceC868610Y5r
    public final C0Y60 LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC868610Y5r
    public final C868740Y6e LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC868610Y5r
    public final C0Y1U LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC868610Y5r
    public final C0YJB LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC868610Y5r
    public final C870870YEj LJFF() {
        return this.LIZJ;
    }

    public C0Y6R(C0YDJ c0ydj) {
        this.LIZ = new C0Y60(c0ydj.LIZ, c0ydj.LIZJ.LIZLLL);
        this.LIZIZ = new C0YJB(c0ydj.LIZ);
        C0YEM c0yem = c0ydj.LIZ;
        this.LIZJ = new C870870YEj(c0yem);
        this.LIZLLL = new C868740Y6e(c0yem);
        this.LJ = C452501pT.LIZIZ(new AwS558S0100000_14(c0ydj, 1258));
        this.LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(c0ydj, 1257));
        this.LJI = C452501pT.LIZIZ(new AwS558S0100000_14(c0ydj, 1256));
    }
}
