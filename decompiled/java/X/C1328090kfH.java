package X;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328090kfH implements InterfaceC1327390ke9<C1328480kfu> {
    public final Executor LIZ;
    public final InterfaceC1327440keE LIZIZ;
    public final InterfaceC1327390ke9<C1328480kfu> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC1327160kdm LJ;
    public final C1326950kdR LJFF;
    public final C1326950kdR LJI;
    public final Map<String, C1326950kdR> LJII;
    public final InterfaceC1325590kbF LJIIIIZZ;

    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        this.LIZJ.LIZIZ(new C1328310kfd(this, interfaceC1328020kfA, interfaceC1327930kf1, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ), interfaceC1327930kf1);
    }

    public C1328090kfH(Executor executor, InterfaceC1327440keE interfaceC1327440keE, InterfaceC1327390ke9 interfaceC1327390ke9, InterfaceC1327160kdm interfaceC1327160kdm, C1326950kdR c1326950kdR, C1326950kdR c1326950kdR2, Map map, InterfaceC1325590kbF interfaceC1325590kbF) {
        executor.getClass();
        this.LIZ = executor;
        interfaceC1327440keE.getClass();
        this.LIZIZ = interfaceC1327440keE;
        this.LIZJ = interfaceC1327390ke9;
        interfaceC1327160kdm.getClass();
        this.LJ = interfaceC1327160kdm;
        this.LIZLLL = true;
        this.LJFF = c1326950kdR;
        this.LJI = c1326950kdR2;
        this.LJII = map;
        this.LJIIIIZZ = interfaceC1325590kbF;
    }
}
