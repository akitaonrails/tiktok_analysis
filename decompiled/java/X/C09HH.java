package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09HH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HH implements Serializable {
    public static final int $stable = 8;
    public final int LL;
    public boolean LLILLJJLI;
    public final ArrayList<C09HF> LLILLL;

    public final C09HH copy(int i, boolean z, ArrayList<C09HF> arrayList) {
        return new C09HH(i, z, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09HH)) {
            return false;
        }
        C09HH c09hh = (C09HH) obj;
        return this.LL == c09hh.LL && this.LLILLJJLI == c09hh.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c09hh.LLILLL);
    }

    public int hashCode() {
        return (((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryRecord(totalCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dailyModels=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: deepCopy, reason: merged with bridge method [inline-methods] */
    public C09HH m22deepCopy() {
        int i = this.LL;
        boolean z = this.LLILLJJLI;
        ArrayList<C09HF> arrayList = this.LLILLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C09HF> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().m21deepCopy());
        }
        return new C09HH(i, z, new ArrayList(arrayList2));
    }

    public final ArrayList<C09HF> getDailyModels() {
        return this.LLILLL;
    }

    public final boolean getHasMore() {
        return this.LLILLJJLI;
    }

    public final int getTotalCount() {
        return this.LL;
    }

    public final C09HH plus(C09HH c09hh) {
        C09HH c09hhM22deepCopy = m22deepCopy();
        HashMap map = new HashMap();
        for (C09HF c09hf : c09hhM22deepCopy.LLILLL) {
            map.put(c09hf.getDayDescription(), c09hf.getHistoryRecords());
        }
        for (C09HF c09hf2 : c09hh.LLILLL) {
            if (map.containsKey(c09hf2.getDayDescription())) {
                ArrayList arrayList = (ArrayList) map.get(c09hf2.getDayDescription());
                if (arrayList != null) {
                    arrayList.addAll(c09hf2.getHistoryRecords());
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (hashSet.add(Long.valueOf(((C09HE) obj).getTimeStamp()))) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayListLIZ = C09HN.LIZ(arrayList2);
                    if (arrayListLIZ != null) {
                        map.put(c09hf2.getDayDescription(), arrayListLIZ);
                    }
                }
            } else {
                c09hhM22deepCopy.LLILLL.add(c09hf2);
            }
        }
        c09hhM22deepCopy.LLILLJJLI = c09hh.LLILLJJLI;
        return c09hhM22deepCopy;
    }

    public final void setHasMore(boolean z) {
        this.LLILLJJLI = z;
    }

    public C09HH(int i, boolean z, ArrayList<C09HF> arrayList) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = arrayList;
    }
}
