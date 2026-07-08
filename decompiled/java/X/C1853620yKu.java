package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853620yKu implements InterfaceC1783630wW1 {
    public final List<InterfaceC1853660yKy> LIZ;
    public final InterfaceC346201Wa<InterfaceC1557650qdX> LIZIZ;

    @Override // X.InterfaceC1783630wW1
    public final void LIZ() {
        Iterator<InterfaceC1853660yKy> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1783630wW1
    public final void LJI() {
        Iterator<InterfaceC1853660yKy> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    @Override // X.InterfaceC1783630wW1
    public final InterfaceC346201Wa<InterfaceC1557650qdX> getEvents() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1853620yKu(List<? extends InterfaceC1853660yKy> list) {
        InterfaceC346201Wa<InterfaceC1557650qdX> interfaceC346201WaLJJII;
        this.LIZ = list;
        if (list.isEmpty()) {
            interfaceC346201WaLJJII = C1518305wz.LL;
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC1853660yKy) it2.next()).getEvents());
            }
            InterfaceC346201Wa[] interfaceC346201WaArr = (InterfaceC346201Wa[]) arrayList.toArray(new InterfaceC346201Wa[0]);
            interfaceC346201WaLJJII = C09IC.LJJII((InterfaceC346201Wa[]) Arrays.copyOf(interfaceC346201WaArr, interfaceC346201WaArr.length));
        }
        this.LIZIZ = interfaceC346201WaLJJII;
    }
}
