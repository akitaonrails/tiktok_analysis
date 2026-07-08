package X;

import kotlin.jvm.internal.AwS558S0100000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0YEW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEW implements C0YF9, InterfaceC870780YEa {
    public final /* synthetic */ InterfaceC870780YEa LIZ;
    public final InterfaceC863730XuV LIZIZ;
    public final C872370YKd LIZJ;
    public final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()).plus(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, this, 4)));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1286));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1288));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1287));

    @Override // X.InterfaceC870780YEa
    public final C868780Y6i LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC870780YEa
    public final InterfaceC870750YDx LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC870780YEa
    public final C871040YFa LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // X.InterfaceC870780YEa
    public final C0YLL getEventTracker() {
        return this.LIZ.getEventTracker();
    }

    @Override // X.C0YEU
    public final InterfaceC864380XvY LJIIIIZZ() {
        return (InterfaceC864380XvY) this.LJ.getValue();
    }

    @Override // X.C0YEU
    public final C870840YEg LJIIJJI() {
        return (C870840YEg) this.LJFF.getValue();
    }

    @Override // X.C0YEU
    public final C0YCR LJIILIIL() {
        return (C0YCR) this.LJI.getValue();
    }

    @Override // X.C0YEU
    public final InterfaceC497601wk LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.C0YEU
    public final C872370YKd LJIIL() {
        return this.LIZJ;
    }

    public C0YEW(C0YF0 c0yf0, InterfaceC870780YEa interfaceC870780YEa) {
        this.LIZ = interfaceC870780YEa;
        this.LIZIZ = c0yf0;
        this.LIZJ = new C872370YKd(c0yf0, getEventTracker());
    }
}
