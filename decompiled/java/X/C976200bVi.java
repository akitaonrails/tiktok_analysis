package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0bVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976200bVi {
    public boolean LIZ;
    public final Set<InterfaceC975560bUg> LIZIZ = new LinkedHashSet();
    public List<C954460awe> LIZJ = new ArrayList();
    public List<C954460awe> LIZLLL = new ArrayList();

    public final void LIZIZ() {
        C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", "reset");
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LIZIZ.clear();
        this.LIZ = false;
    }

    public final int LIZ(C954460awe c954460awe) {
        long j;
        if (c954460awe != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        ArrayList arrayList = (ArrayList) this.LIZJ;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C954460awe) ListProtector.get(arrayList, i)).LJ == j) {
                if (i >= 0) {
                    return i;
                }
            } else {
                i++;
            }
        }
        return 0;
    }

    public final void LIZJ(int i, int i2, List list, List list2, List list3, List list4) {
        if (list4.isEmpty()) {
            C20441214yg.LJ("TakeTheStageSequenceHelper", "tryChangePerformSequence return by empty newPerformSequence");
            return;
        }
        StringBuilder sb = new StringBuilder("tryChangePerformerSequence execute, interactiveComponents size:");
        sb.append(this.LIZIZ.size());
        sb.append(", curLinkMicSequence:");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        sb.append(arrayList);
        sb.append(", curPerformSequence:");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it3.next()).LJ));
        }
        sb.append(arrayList2);
        sb.append(", newLinkMicSequence:");
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(((C954460awe) it4.next()).LJ));
        }
        sb.append(arrayList3);
        sb.append(", newPerformSequence:");
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        Iterator it5 = list4.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Long.valueOf(((C954460awe) it5.next()).LJ));
        }
        sb.append(arrayList4);
        C20441214yg.LJIIIZ("TakeTheStageSequenceHelper", sb.toString());
        Iterator<InterfaceC975560bUg> it6 = this.LIZIZ.iterator();
        while (it6.hasNext()) {
            it6.next().LIZIZ(i, i2, list, list2, list3, list4);
        }
    }
}
