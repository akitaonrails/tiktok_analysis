package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0kXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323400kXi implements InterfaceC2173208fK, InterfaceC1507880pLG {
    public final String LIZ;
    public final WeakReference<C1323410kXj> LIZIZ;

    @Override // X.InterfaceC1507880pLG
    public final void LIZJ() {
        if (this.LIZIZ.get() == null) {
            LJII();
        }
    }

    @Override // X.InterfaceC1507880pLG
    public final void LIZLLL() {
        if (this.LIZIZ.get() == null) {
            LJII();
        }
    }

    public final void LJII() {
        C2232408os c2232408os = C1507830pLB.LIZ;
        C1507830pLB.LJII(this, this.LIZ);
        CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet = C1507830pLB.LJIIJ.get(this.LIZ);
        if (copyOnWriteArraySet != null) {
            copyOnWriteArraySet.remove(this);
        }
    }

    @Override // X.InterfaceC2173208fK
    public final void LIZ(List<String> list) {
        C1323410kXj c1323410kXj = this.LIZIZ.get();
        if (c1323410kXj != null) {
            c1323410kXj.LIZ(list);
        } else {
            LJII();
        }
    }

    @Override // X.InterfaceC1507880pLG
    public final void LIZIZ(String str) {
        C1323410kXj c1323410kXj = this.LIZIZ.get();
        if (c1323410kXj != null) {
            c1323410kXj.LIZIZ(str);
        } else {
            LJII();
        }
    }

    @Override // X.InterfaceC1507880pLG
    public final void LJFF(String str) {
        C1323410kXj c1323410kXj = this.LIZIZ.get();
        if (c1323410kXj != null) {
            c1323410kXj.LJFF(str);
        } else {
            LJII();
        }
    }

    @Override // X.InterfaceC2173208fK
    public final void LJI(String str) {
        if (this.LIZIZ.get() == null) {
            LJII();
        }
    }

    public C1323400kXi(C1323410kXj c1323410kXj, String str) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(c1323410kXj);
    }

    @Override // X.InterfaceC2173208fK
    public final void LJ(String str, String str2) {
        C1323410kXj c1323410kXj = this.LIZIZ.get();
        if (c1323410kXj != null) {
            c1323410kXj.LJ(str, str2);
        } else {
            LJII();
        }
    }
}
