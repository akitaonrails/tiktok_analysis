package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652160t5y implements InterfaceC1651800t5O {
    public final C1650980t44 LIZ;
    public final C1650980t44 LIZIZ;
    public final C1650980t44 LIZJ;
    public final Set<C1650980t44> LIZLLL = new LinkedHashSet();
    public final Set<InterfaceC1652150t5x> LJ = new LinkedHashSet();
    public final List<C1650980t44> LJFF = new ArrayList();

    @Override // X.InterfaceC1651800t5O
    public final List<C1650980t44> getItems() {
        ((ArrayList) this.LJFF).clear();
        if (!this.LIZLLL.isEmpty()) {
            ((ArrayList) this.LJFF).addAll(this.LIZLLL);
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC1651800t5O
    public final void notifyDataSetChanged() {
        Iterator<InterfaceC1652150t5x> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final C1650980t44 LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1651800t5O
    public final C1650980t44 LIZLLL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1651800t5O
    public final C1650980t44 LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1651800t5O
    public final void Cl(List list) {
        if (!list.isEmpty()) {
            this.LIZLLL.removeAll(C13LP.LLIIJI(list));
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final C1650980t44 LIZJ(int i) {
        C1650980t44 next;
        Iterator<C1650980t44> it2 = this.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.InterfaceC1651800t5O
    public final void LJ(InterfaceC1652150t5x interfaceC1652150t5x) {
        this.LJ.add(interfaceC1652150t5x);
    }

    @Override // X.InterfaceC1651800t5O
    public final void LLLZ(List list) {
        if (!list.isEmpty()) {
            this.LIZLLL.addAll(list);
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final void LIZ(C1650980t44 c1650980t44, boolean z) {
        if (C19719612Di.LJJIII(this.LIZLLL, new AwS604S0100000_25(c1650980t44, 400), true)) {
            this.LIZLLL.add(c1650980t44);
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final void LJFF(C1650980t44 c1650980t44, boolean z) {
        if (this.LIZLLL.remove(c1650980t44) && z) {
            notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final void LJII(C1650980t44 c1650980t44, boolean z) {
        this.LIZLLL.add(c1650980t44);
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC1651800t5O
    public final void LJIIIIZZ(List<? extends C1650980t44> list, boolean z) {
        this.LIZLLL.clear();
        if (!list.isEmpty()) {
            this.LIZLLL.addAll(list);
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    public C1652160t5y(C1650980t44 c1650980t44, C1650980t44 c1650980t442, C1650980t44 c1650980t443) {
        this.LIZ = c1650980t44;
        this.LIZIZ = c1650980t442;
        this.LIZJ = c1650980t443;
    }
}
