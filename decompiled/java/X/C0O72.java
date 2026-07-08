package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0O72, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0O72<K, PO> implements C0O71<K, PO> {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0O74());

    public abstract PO LIZLLL(K k);

    public abstract C0O4U<PO> LJ(K k);

    public abstract C0O4V LJFF(Object obj, Object obj2);

    @Override // X.C0O71
    public List<PO> LIZIZ(List<? extends K> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends K> it2 = list.iterator();
        while (it2.hasNext()) {
            PO po = get(it2.next());
            if (po != null) {
                arrayList.add(po);
            }
        }
        return arrayList;
    }

    @Override // X.C0O71
    public PO get(K k) {
        return LIZLLL(k);
    }

    @Override // X.C0O71
    public final C0O4U<PO> remove(K k) {
        C0O4U<PO> c0o4uLJ = LJ(k);
        if (c0o4uLJ != null) {
            ((C1487140ono) this.LIZ.getValue()).remove(k);
        }
        return c0o4uLJ;
    }

    @Override // X.C0O71
    public C0O4U<PO> replace(K k, PO po) {
        C0O4V c0o4vLJFF = LJFF(k, po);
        if (c0o4vLJFF != null) {
            ((C1487140ono) this.LIZ.getValue()).put(k, po);
        }
        return c0o4vLJFF;
    }
}
