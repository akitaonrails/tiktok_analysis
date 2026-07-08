package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20426114wF {
    public final long LIZ;
    public final long LIZIZ;
    public final List<C20426414wI> LIZJ;
    public final List<C20425114w5> LIZLLL;

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

    public C20426114wF(C20426214wG c20426214wG) {
        long j = c20426214wG.LIZ;
        long j2 = c20426214wG.LIZIZ;
        List<C20426314wH> list = c20426214wG.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C20426314wH c20426314wH : list) {
            arrayList.add(new C20426414wI(c20426314wH.LIZ, c20426314wH.LIZIZ, c20426314wH.LIZJ));
        }
        List<C20425214w6> list2 = c20426214wG.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C20425214w6> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C20425114w5(it2.next()));
        }
        this(arrayList, arrayList2, j, j2);
    }

    public C20426114wF(List list, List list2, long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
