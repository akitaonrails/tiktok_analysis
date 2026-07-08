package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0VA2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VA2 implements C0VAH {
    public List<Integer> LJ;
    public final List<LinkedHashMap<Long, Long>> LIZ = new ArrayList();
    public final List<LinkedHashMap<Long, Long>> LIZIZ = new ArrayList();
    public List<LinkedHashMap<Long, Long>> LIZJ = new ArrayList();
    public boolean LIZLLL = false;
    public long LJFF = 0;
    public long LJI = 0;
    public long LJII = 0;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcTimeInStateInfo{freqTimeMapList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", freqDeltaTimeMapList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalCpuTime=");
        if (this.LJFF == 0) {
            this.LJFF = LIZ(this.LIZ);
        }
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", totalDeltaCpuTime=");
        if (this.LJI == 0) {
            this.LJI = LIZ(this.LIZIZ);
        }
        sbLIZ.append(this.LJI);
        sbLIZ.append(", totalMergeCpuTime=");
        if (this.LJII == 0) {
            this.LJII = LIZ(this.LIZJ);
        }
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ(List<LinkedHashMap<Long, Long>> list) {
        int size;
        List<Integer> list2;
        if (!this.LIZLLL) {
            synchronized (C0VAI.class) {
                List<Integer> list3 = C0VAI.LIZLLL;
                list2 = list3;
                if (list3 == null) {
                    List<C0VA6> listLIZ = C0VAI.LIZ();
                    ArrayList arrayList = new ArrayList();
                    Iterator<C0VA6> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((ArrayList) it2.next().LIZIZ).size()));
                    }
                    C0VAI.LIZLLL = arrayList;
                    list2 = arrayList;
                }
            }
            this.LJ = list2;
            this.LIZLLL = true;
        }
        long jLongValue = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.LJ.size()) {
            for (int i = 0; i < size; i++) {
                Iterator it3 = ((LinkedHashMap) ListProtector.get(list, i)).entrySet().iterator();
                while (it3.hasNext()) {
                    jLongValue += ((Long) ((Map.Entry) it3.next()).getValue()).longValue();
                }
            }
        }
        return jLongValue;
    }
}
