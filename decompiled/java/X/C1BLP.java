package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BLP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLP extends C1BLC {
    @Override // X.C1BLC
    public final boolean LIZLLL() {
        List list = this.LJI.LJIIIIZZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!C08PT.LIZLLL().contains(C1BLV.LIZ((String) it2.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1BLC
    public final boolean LJ() {
        return C08PT.LIZLLL().contains(C1BLV.LIZ(this.LIZIZ)) && LIZLLL();
    }

    @Override // X.C1BLC
    public final void LJI(Map<String, String> map) {
        map.put("task_type", String.valueOf(this.LJIIIIZZ));
        map.put("name", this.LIZ);
        Iterable iterable = this.LJI.LJIIIZ;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        map.put("dependent_modules", C13LP.LJJLIIIJ(iterable, "|", null, null, 0, null, null, 62));
        map.put("is_all_dependent_modules_installed", String.valueOf(LIZLLL()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1BLP(String str, boolean z, boolean z2, boolean z3, C2203341BLg c2203341BLg, AnonymousClass1405 anonymousClass1405, int i) {
        AnonymousClass1405 anonymousClass14052 = anonymousClass1405;
        C2203341BLg c2203341BLg2 = c2203341BLg;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = (i & 2) != 0 ? false : z;
        z5 = (i & 4) != 0 ? true : z5;
        z4 = (i & 8) != 0 ? false : z4;
        c2203341BLg2 = (i & 16) != 0 ? null : c2203341BLg2;
        anonymousClass14052 = (i & 32) != 0 ? new AnonymousClass1405(new AnonymousClass1403()) : anonymousClass14052;
        Map<String, String> map = C1BLV.LIZ;
        super(C1BLV.LIZ(str), str, z6, z4, c2203341BLg2, anonymousClass14052, z5);
        List<String> list = anonymousClass14052.LJIIIIZZ;
        list = list == null ? C13BV.INSTANCE : list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str2 : list) {
            Map<String, String> map2 = C1BLV.LIZ;
            arrayList.add(C1BLV.LIZ(str2));
        }
        anonymousClass14052.LJIIIZ = arrayList;
    }
}
