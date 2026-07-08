package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.13Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Z0 extends C13Z1 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public Set<Set<InterfaceC1680530tpj>> LIZLLL;
    public final Set<C13ZC> LJ = new LinkedHashSet();
    public final C05P0 LJFF = new ParcelableSnapshotMutableState(C19971913Cj.LLILZIL, C631860OqO.LIZ);
    public final /* synthetic */ C13ZC LJI;

    @Override // X.C13Z1
    public final void LJIIIZ() {
    }

    @Override // X.C13Z1
    public final void LIZJ() {
        C13ZC c13zc = this.LJI;
        c13zc.LJJII--;
    }

    @Override // X.C13Z1
    public final boolean LIZLLL() {
        return this.LJI.LIZJ.LIZLLL();
    }

    @Override // X.C13Z1
    public final C13D2 LJI() {
        return (C13D2) ((C13FE) this.LJFF).getValue();
    }

    @Override // X.C13Z1
    public final CoroutineContext LJIIIIZZ() {
        return this.LJI.LIZJ.LJIIIIZZ();
    }

    @Override // X.C13Z1
    public final void LJIILLIIL() {
        this.LJI.LJJII++;
    }

    public final void LJIJI() {
        if (!this.LJ.isEmpty()) {
            Set<Set<InterfaceC1680530tpj>> set = this.LIZLLL;
            if (set != null) {
                for (C13ZC c13zc : this.LJ) {
                    Iterator it2 = ((HashSet) set).iterator();
                    while (it2.hasNext()) {
                        ((Set) it2.next()).remove(c13zc.LIZLLL);
                    }
                }
            }
            this.LJ.clear();
        }
    }

    @Override // X.C13Z1
    public final boolean LJ() {
        return this.LIZIZ;
    }

    @Override // X.C13Z1
    public final boolean LJFF() {
        return this.LIZJ;
    }

    @Override // X.C13Z1
    public final int LJII() {
        return this.LIZ;
    }

    @Override // X.C13Z1
    public final void LIZIZ(C13Z3 c13z3) {
        this.LJI.LIZJ.LIZIZ(c13z3);
    }

    @Override // X.C13Z1
    public final void LJIIJ(C13Y2 c13y2) {
        C13ZC c13zc = this.LJI;
        c13zc.LIZJ.LJIIJ(c13zc.LJII);
        this.LJI.LIZJ.LJIIJ(c13y2);
    }

    @Override // X.C13Z1
    public final C13Z6 LJIIL(C13Z3 c13z3) {
        return this.LJI.LIZJ.LJIIL(c13z3);
    }

    @Override // X.C13Z1
    public final void LJIILIIL(Set<InterfaceC1680530tpj> set) {
        Set hashSet = this.LIZLLL;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.LIZLLL = hashSet;
        }
        hashSet.add(set);
    }

    @Override // X.C13Z1
    public final void LJIILJJIL(C13ZC c13zc) {
        this.LJ.add(c13zc);
    }

    @Override // X.C13Z1
    public final void LJIILL(C13Y2 c13y2) {
        this.LJI.LIZJ.LJIILL(c13y2);
    }

    @Override // X.C13Z1
    public final void LJIIZILJ(C13ZC c13zc) {
        Set<Set<InterfaceC1680530tpj>> set = this.LIZLLL;
        if (set != null) {
            Iterator it2 = ((HashSet) set).iterator();
            while (it2.hasNext()) {
                ((Set) it2.next()).remove(c13zc.LIZLLL);
            }
        }
        C19719512Dh.LIZ(this.LJ).remove(c13zc);
    }

    @Override // X.C13Z1
    public final void LJIJ(C13Y2 c13y2) {
        this.LJI.LIZJ.LJIJ(c13y2);
    }

    @Override // X.C13Z1
    public final void LIZ(C13Y2 c13y2, C19719212De c19719212De) {
        this.LJI.LIZJ.LIZ(c13y2, c19719212De);
    }

    @Override // X.C13Z1
    public final void LJIIJJI(C13Z3 c13z3, C13Z6 c13z6, InterfaceC20032213Zo<?> interfaceC20032213Zo) {
        this.LJI.LIZJ.LJIIJJI(c13z3, c13z6, interfaceC20032213Zo);
    }

    public C13Z0(C13ZC c13zc, int i, boolean z, boolean z2, C20030313Yv c20030313Yv) {
        this.LJI = c13zc;
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
