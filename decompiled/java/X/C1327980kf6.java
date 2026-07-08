package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327980kf6 implements InterfaceC1327390ke9<C1328480kfu> {
    public final Executor LIZ;
    public final InterfaceC1327440keE LIZIZ;
    public final InterfaceC1327390ke9<C1328480kfu> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC1327160kdm LJ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        this.LIZJ.LIZIZ(new C1328320kfe(this, interfaceC1328020kfA, interfaceC1327930kf1, this.LIZLLL, this.LJ), interfaceC1327930kf1);
    }

    public C1327980kf6(Executor executor, InterfaceC1327440keE interfaceC1327440keE, InterfaceC1327390ke9<C1328480kfu> interfaceC1327390ke9, boolean z, InterfaceC1327160kdm interfaceC1327160kdm) {
        executor.getClass();
        this.LIZ = executor;
        interfaceC1327440keE.getClass();
        this.LIZIZ = interfaceC1327440keE;
        this.LIZJ = interfaceC1327390ke9;
        interfaceC1327160kdm.getClass();
        this.LJ = interfaceC1327160kdm;
        this.LIZLLL = z;
    }
}
