package X;

import kotlin.jvm.internal.AwS558S0100000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0YF4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YF4 implements C0YF9 {
    public final InterfaceC870750YDx LIZ;
    public final InterfaceC863730XuV LIZIZ;
    public final C871040YFa LIZJ;
    public final C868780Y6i LIZLLL;
    public final C0YLL LJ;
    public final C872370YKd LJFF;
    public final C054G LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;

    @Override // X.C0YEU
    public final InterfaceC864380XvY LJIIIIZZ() {
        return (InterfaceC864380XvY) this.LJII.getValue();
    }

    @Override // X.C0YEU
    public final C870840YEg LJIIJJI() {
        return (C870840YEg) this.LJIIIIZZ.getValue();
    }

    @Override // X.C0YEU
    public final C0YCR LJIILIIL() {
        return (C0YCR) this.LJIIIZ.getValue();
    }

    @Override // X.C0YEU
    public final InterfaceC497601wk LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC870780YEa
    public final C868780Y6i LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC870780YEa
    public final InterfaceC870750YDx LJ() {
        return this.LIZ;
    }

    @Override // X.C0YEU
    public final C872370YKd LJIIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC870780YEa
    public final C871040YFa LJIILL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC870780YEa
    public final C0YLL getEventTracker() {
        return this.LJ;
    }

    public C0YF4(int i, InterfaceC870750YDx interfaceC870750YDx, C0YF0 c0yf0, C871040YFa c871040YFa) {
        this.LIZ = interfaceC870750YDx;
        this.LIZIZ = c0yf0;
        this.LIZJ = c871040YFa;
        InterfaceC868790Y6j log = interfaceC870750YDx.getLog();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" -imCloudBiz = ");
        sbLIZ.append(i);
        this.LIZLLL = new C868780Y6i(log, C2188811AlT.LIZIZ(sbLIZ));
        C0YLL c0yll = new C0YLL(interfaceC870750YDx.getEvent(), new AwS558S0100000_14(this, 1282), new AwS558S0100000_14(this, 1283));
        this.LJ = c0yll;
        this.LJFF = new C872370YKd(c0yf0, c0yll);
        this.LJI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()).plus(new C914180Ztg(CoroutineExceptionHandler.LJJLIL, this, 3)));
        this.LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1281));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1285));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1284));
    }
}
