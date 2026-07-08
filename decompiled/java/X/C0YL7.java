package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0YL7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YL7 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C868780Y6i LIZ;
    public final boolean LIZIZ;

    public static C788930Ux9 LIZIZ(List list) {
        boolean z;
        C869590Y9l c869590Y9l;
        boolean z2 = false;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C0YL6.LIZ((C869590Y9l) obj)) {
                arrayList.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(Long.valueOf(((C869590Y9l) obj2).getIndex()), obj2);
        }
        List listLJLLJ = C13LP.LJLLJ(linkedHashMap.keySet());
        Long l = (Long) C13LP.LJJJLL(listLJLLJ);
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        HashSet hashSet = new HashSet(arrayList.size());
        C869590Y9l c869590Y9l2 = (C869590Y9l) C2097608Jq.LJFF(C13LP.LJJLIIIJJI(listLJLLJ), linkedHashMap);
        while (hashSet.add(Long.valueOf(c869590Y9l2.getIndex()))) {
            long prevIndex = c869590Y9l2.getPrevIndex();
            if (prevIndex == -1) {
                return new C788930Ux9(c869590Y9l2, false);
            }
            if (prevIndex <= 0) {
                int iLJI = C1697810uHb.LJI(listLJLLJ, Long.valueOf(c869590Y9l2.getIndex()));
                if (iLJI < 0) {
                    iLJI = -(iLJI + 1);
                }
                int i = iLJI - 1;
                if (i < 0 || (c869590Y9l = (C869590Y9l) linkedHashMap.get(ListProtector.get(listLJLLJ, i))) == null) {
                    return new C788930Ux9(c869590Y9l2, false);
                }
            } else {
                c869590Y9l = (C869590Y9l) linkedHashMap.get(Long.valueOf(prevIndex));
                if (c869590Y9l == null) {
                    if (c869590Y9l2.getIndex() > jLongValue) {
                        z2 = true;
                    }
                    return new C788930Ux9(c869590Y9l2, z2);
                }
            }
            c869590Y9l2 = c869590Y9l;
        }
        return new C788930Ux9(c869590Y9l2, true);
    }

    public final List<C0YNC> LIZ(List<C869840YAk> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            if (!this.LIZIZ) {
                return arrayList;
            }
            throw new IllegalStateException("MessageGapDetector: zero segments for gap detection");
        }
        if (list.size() == 1) {
            return arrayList;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i < size) {
            C869840YAk c869840YAk = (C869840YAk) ListProtector.get(list, i);
            i++;
            C869840YAk c869840YAk2 = (C869840YAk) ListProtector.get(list, i);
            if (c869840YAk.LJ >= c869840YAk2.LIZJ) {
                C868780Y6i c868780Y6i = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detectGaps gap not found, leftSegment ");
                sbLIZ.append(c869840YAk);
                sbLIZ.append(", rightSegment ");
                sbLIZ.append(c869840YAk2);
                c868780Y6i.LJIIIIZZ("MessageGapDetector", C2188811AlT.LIZIZ(sbLIZ), null);
            } else {
                arrayList.add(new C0YNC(c869840YAk.LJ, c869840YAk.LJFF, c869840YAk2.LIZJ, c869840YAk2.LIZLLL));
            }
        }
        return arrayList;
    }

    public C0YL7(C868780Y6i c868780Y6i, boolean z) {
        this.LIZ = c868780Y6i;
        this.LIZIZ = z;
    }
}
