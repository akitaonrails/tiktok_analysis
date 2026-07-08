package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160780gJQ implements InterfaceC1160790gJR {
    public final CopyOnWriteArraySet<InterfaceC1160790gJR> LL = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1160790gJR
    public final void onSuccess() {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess();
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LIZLLL(C1161040gJq c1161040gJq) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(c1161040gJq);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJ(C1161000gJm c1161000gJm) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(c1161000gJm);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIIZZ(C1161000gJm c1161000gJm) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(c1161000gJm);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final C1161000gJm LJIIJ(C1161000gJm c1161000gJm) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            c1161000gJm = it2.next().LJIIJ(c1161000gJm);
        }
        return c1161000gJm;
    }

    @Override // X.InterfaceC1160790gJR
    public final void onError(Throwable th) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onError(th);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LIZJ(C1161040gJq c1161040gJq, boolean z) {
        int size;
        List<C1161140gK0> listLIZIZ = c1161040gJq.LIZIZ();
        if (listLIZIZ != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new C1160580gJ6(size, z));
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c1161040gJq, z);
        }
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIZ(C1160990gJl c1160990gJl, String str) {
        Iterator<InterfaceC1160790gJR> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(c1160990gJl, str);
        }
    }
}
