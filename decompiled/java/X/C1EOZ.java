package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1EOZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EOZ implements InterfaceC1328030kfB {
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C2280521EOc());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2280531EOd());

    @Override // X.InterfaceC1328030kfB
    public final Executor LIZ() {
        return (ExecutorServiceC822430WOb) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1328030kfB
    public final Executor LIZIZ() {
        return (ExecutorServiceC822430WOb) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1328030kfB
    public final Executor LIZJ() {
        return (ExecutorServiceC822430WOb) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1328030kfB
    public final Executor LIZLLL() {
        return (ExecutorServiceC822430WOb) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1328030kfB
    public final Executor LJ() {
        return (ExecutorServiceC822430WOb) this.LIZ.getValue();
    }

    public C1EOZ(int i) {
        this.LIZIZ = C452501pT.LIZIZ(new C2280511EOb(i));
        this.LIZJ = C452501pT.LIZIZ(new C2280501EOa(i));
    }
}
