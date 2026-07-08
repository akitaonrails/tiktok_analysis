package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0krE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335500krE implements InterfaceC1335510krF {
    public final List<InterfaceC1335510krF> LIZ = new CopyOnWriteArrayList();

    @Override // X.InterfaceC1335510krF
    public final void onCleared() {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).onCleared();
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LIZ(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LIZ(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LIZIZ(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LIZIZ(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LIZJ(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LIZJ(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LIZLLL(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LIZLLL(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LJ(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LJ(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LJFF(C1331240kkM c1331240kkM) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LJFF(c1331240kkM);
        }
    }

    @Override // X.InterfaceC1335510krF
    public final void LJI(InterfaceC1332030kld interfaceC1332030kld) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1335510krF) it2.next()).LJI(interfaceC1332030kld);
        }
    }
}
