package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20426214wG {
    public final long LIZ;
    public final long LIZIZ;
    public final List<C20426314wH> LIZJ;
    public final List<C20425214w6> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyeRootFlow(startAtFlowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minAppVersion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", flows=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", states=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1CQI LIZ() {
        Long lValueOf = Long.valueOf(this.LIZ);
        Long lValueOf2 = Long.valueOf(this.LIZIZ);
        List<C20426314wH> list = this.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C20426314wH c20426314wH : list) {
            c20426314wH.getClass();
            arrayList.add(new C1CQP(Long.valueOf(c20426314wH.LIZ), Long.valueOf(c20426314wH.LIZIZ), Long.valueOf(c20426314wH.LIZJ)));
        }
        List<C20425214w6> list2 = this.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C20425214w6> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LIZ());
        }
        return new C1CQI(lValueOf, lValueOf2, arrayList, arrayList2);
    }

    public C20426214wG(List list, List list2, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
