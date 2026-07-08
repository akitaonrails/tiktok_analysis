package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YET, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YET implements C0YF9, InterfaceC870780YEa {
    public final InterfaceC870750YDx LIZ;
    public final C871040YFa LIZIZ;
    public volatile Function0<C0YED> LIZJ = AFwS201S0000000_14.get$arr$(347);
    public final C868780Y6i LIZLLL;
    public final C0YLL LJ;

    public final C0YEW LIZ() {
        C0YEW c0yew;
        C0YED c0yedInvoke = this.LIZJ.invoke();
        if (c0yedInvoke == null || (c0yew = c0yedInvoke.LIZJ) == null) {
            throw new C0YF3("No active session. Session-scoped root dependency accessed before login.");
        }
        return c0yew;
    }

    @Override // X.C0YEU
    public final InterfaceC497601wk LIZJ() {
        return LIZ().LIZLLL;
    }

    @Override // X.C0YEU
    public final InterfaceC864380XvY LJIIIIZZ() {
        return LIZ().LJIIIIZZ();
    }

    @Override // X.C0YEU
    public final C870840YEg LJIIJJI() {
        return LIZ().LJIIJJI();
    }

    @Override // X.C0YEU
    public final C872370YKd LJIIL() {
        return LIZ().LIZJ;
    }

    @Override // X.C0YEU
    public final C0YCR LJIILIIL() {
        return LIZ().LJIILIIL();
    }

    @Override // X.InterfaceC870780YEa
    public final C868780Y6i LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC870780YEa
    public final InterfaceC870750YDx LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC870780YEa
    public final C871040YFa LJIILL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC870780YEa
    public final C0YLL getEventTracker() {
        return this.LJ;
    }

    public C0YET(int i, InterfaceC870750YDx interfaceC870750YDx, C871040YFa c871040YFa) {
        this.LIZ = interfaceC870750YDx;
        this.LIZIZ = c871040YFa;
        InterfaceC868790Y6j log = interfaceC870750YDx.getLog();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" -imCloudBiz = ");
        sbLIZ.append(i);
        this.LIZLLL = new C868780Y6i(log, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = new C0YLL(interfaceC870750YDx.getEvent(), new AwS558S0100000_14(this, 1250), new AwS558S0100000_14(this, 1251));
    }
}
