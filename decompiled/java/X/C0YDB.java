package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YDB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YDB extends C0YDA {
    public final C0YEF LIZIZ;
    public final C0Y6Z LIZJ;
    public final C868730Y6d LIZLLL;
    public final C0Y61 LJ;
    public final C868210Y4d LJFF;
    public final C870190YBt LJI;
    public final C866670XzF LJII;
    public final C866670XzF LJIIIIZZ;
    public final C870580YDg LJIIIZ;
    public final C0YE5 LJIIJ;
    public final C0YDV LJIIJJI;
    public final C0YDU LJIIL;
    public final C0Y19 LJIILIIL;
    public final C0YDD LJIILJJIL;
    public final C868160Y3y LJIILL;
    public final C0YDC LJIILLIIL;
    public final C866640XzC LJIIZILJ;

    @Override // X.C0YDA
    public final C0YDF LIZIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.C0YDA
    public final InterfaceC865750Xxl LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0YDA
    public final InterfaceC865750Xxl LIZLLL() {
        return this.LJII;
    }

    @Override // X.C0YDA
    public final InterfaceC866720XzK LJ() {
        return this.LJ;
    }

    @Override // X.C0YDA
    public final C0YDW LJI() {
        return this.LJIIL;
    }

    @Override // X.C0YDA
    public final C0YDH LJII() {
        return this.LJIILJJIL;
    }

    @Override // X.C0YDA
    public final C0YE8 LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.C0YDA
    public final C0YE6 LJIIJJI() {
        return this.LJIIJ;
    }

    @Override // X.C0YDA
    public final C0YDY LJIIL() {
        return this.LJIIJJI;
    }

    @Override // X.C0YDA
    public final InterfaceC868710Y6b LJIILIIL() {
        return this.LIZJ;
    }

    @Override // X.C0YDA
    public final InterfaceC870590YDh LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0YDA
    public final C0YJ5 LJIILL() {
        return this.LJFF;
    }

    @Override // X.C0YDA
    public final InterfaceC864330XvT LJIILLIIL() {
        return this.LJIIZILJ;
    }

    @Override // X.C0YDA
    public final InterfaceC871620YHg LJIJ() {
        return this.LIZLLL;
    }

    @Override // X.C0YDA
    public final InterfaceC868170Y3z LJIJI() {
        return this.LJIILL;
    }

    @Override // X.C0YDA
    public final InterfaceC866880Xza LJIJJ() {
        return this.LJIILIIL;
    }

    @Override // X.C0YDA
    public final void LIZ(String str) {
        C0YED c0yedLIZIZ = this.LIZIZ.LIZIZ("ServiceProviderProxy.clearSendingMessage");
        if (c0yedLIZIZ == null) {
            return;
        }
        c0yedLIZIZ.LJIJI().LIZ(str);
    }

    @Override // X.C0YDA
    public final InterfaceC866540Xz2 LJFF(String str) {
        return new C866550Xz3(this.LIZIZ, str);
    }

    @Override // X.C0YDA
    public final InterfaceC870630YDl LJIIZILJ(EnumC871430YGn enumC871430YGn) {
        return new C870620YDk(this.LIZIZ, enumC871430YGn);
    }

    @Override // X.C0YDA
    public final void LJIJJLI(String str) {
        C0YED c0yedLIZIZ = this.LIZIZ.LIZIZ("ServiceProviderProxy.markSendingMessage");
        if (c0yedLIZIZ == null) {
            return;
        }
        c0yedLIZIZ.LJIJI().LJIJJLI(str);
    }

    @Override // X.C0YDA
    public final void LJIL(C0YJY c0yjy) {
        C868210Y4d c868210Y4d = this.LJFF;
        c868210Y4d.LJIIL.add(c0yjy);
        C868200Y4c c868200Y4cLJIILJJIL = c868210Y4d.LJIILJJIL();
        if (c868200Y4cLJIILJJIL != null) {
            ((CopyOnWriteArraySet) c868200Y4cLJIILJJIL.LJIIIZ).add(c0yjy);
        }
    }

    public C0YDB(C0YEM c0yem, final C0YEF c0yef, C868780Y6i c868780Y6i) {
        super(c0yem);
        this.LIZIZ = c0yef;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1342);
        this.LIZJ = new C0Y6Z(awS558S0100000_14, c868780Y6i);
        this.LIZLLL = new C868730Y6d(awS558S0100000_14, c868780Y6i);
        this.LJ = new C0Y61(awS558S0100000_14, c868780Y6i);
        this.LJFF = new C868210Y4d(awS558S0100000_14, c868780Y6i);
        this.LJI = new C870190YBt(c0yef);
        this.LJII = new C866670XzF(c0yef, AFwS248S0000000_14.get$arr$(395));
        this.LJIIIIZZ = new C866670XzF(c0yef, AFwS248S0000000_14.get$arr$(394));
        this.LJIIIZ = new C870580YDg(c0yef);
        this.LJIIJ = new C0YE5(c0yef);
        this.LJIIJJI = new C0YDV(c0yef);
        this.LJIIL = new C0YDU(c0yef);
        this.LJIILIIL = new C0Y19(c0yef);
        new AbstractC866690XzH<Object>(c0yef) { // from class: X.0YDG
            @Override // X.AbstractC866690XzH
            public final Object LLLJ(C0YED c0yed) {
                throw null;
            }
        };
        this.LJIILJJIL = new C0YDD(c0yef);
        this.LJIILL = new C868160Y3y(c0yef);
        this.LJIILLIIL = new C0YDC(c0yef);
        this.LJIIZILJ = new C866640XzC(c0yef);
    }

    @Override // X.C0YDA
    public final InterfaceC871600YHe LJIIJ(String str, boolean z, boolean z2, boolean z3) {
        return new C871590YHd(this.LIZIZ, str, z, z2, z3);
    }

    @Override // X.C0YDA
    public final InterfaceC870610YDj LJIIIZ(String str, int[] iArr, int i, List<? extends C869590Y9l> list, boolean z) {
        return new C870600YDi(this.LIZIZ, str, iArr, i, list, z);
    }
}
