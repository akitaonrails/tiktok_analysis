package X;

import Y.AComparatorS32S0000000_13;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC830550Wi5 extends C0W5G {
    @Override // X.C0W5G
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(24L);
    }

    public final List LJFF() {
        C830560Wi6 c830560Wi6LJI = LJI();
        List<C830610WiB> list = c830560Wi6LJI.LIZIZ;
        List<C830610WiB> list2 = c830560Wi6LJI.LIZJ;
        List<C830610WiB> list3 = c830560Wi6LJI.LIZLLL;
        List listLLD = C13LP.LLD(4, list2);
        List listLLD2 = listLLD.isEmpty() ? C13LP.LLD(4, list3) : LJ(list3, listLLD);
        return C13LP.LJLIL(listLLD.isEmpty() ^ true ? LJ(list, listLLD) : listLLD2.isEmpty() ^ true ? LJ(list, listLLD2) : C13LP.LLD(4, list), C13LP.LJLIL(listLLD2, listLLD));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    public final C830560Wi6 LJI() {
        Object obj;
        Object next;
        ?? arrayList;
        ?? arrayList2;
        List<PublishBehaviorModel> list;
        List<PublishBehaviorModel> list2;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C0W5E.LIZ.getClass();
        List listLJ = C0W5E.LJ(jCurrentTimeMillis, "publish");
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C08JS.LIZ(((C0VLB) it2.next()).LIZLLL, PublishBehaviorModel.class));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            String str = ((PublishBehaviorModel) obj2).publishId;
            Object arrayList4 = linkedHashMap.get(str);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(str, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList5.add(new C830610WiB((String) entry.getKey(), C13LP.LJLLLL(new AComparatorS32S0000000_13(32), (Iterable) entry.getValue())));
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS32S0000000_13(31), arrayList5);
        Iterator it3 = listLJLLLL.iterator();
        while (true) {
            obj = null;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (((C830610WiB) next).LIZJ) {
                break;
            }
        }
        C830610WiB c830610WiB = (C830610WiB) next;
        if (c830610WiB == null || (list2 = c830610WiB.LIZ) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (PublishBehaviorModel publishBehaviorModel : list2) {
                arrayList.add(new C830610WiB(publishBehaviorModel.publishId, Collections.singletonList(publishBehaviorModel)));
            }
        }
        Iterator it4 = listLJLLLL.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (((C830610WiB) next2).LIZLLL) {
                obj = next2;
                break;
            }
        }
        C830610WiB c830610WiB2 = (C830610WiB) obj;
        if (c830610WiB2 == null || (list = c830610WiB2.LIZ) == null) {
            arrayList2 = C13BV.INSTANCE;
        } else {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (PublishBehaviorModel publishBehaviorModel2 : list) {
                arrayList2.add(new C830610WiB(publishBehaviorModel2.publishId, Collections.singletonList(publishBehaviorModel2)));
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : listLJLLLL) {
            C830610WiB c830610WiB3 = (C830610WiB) obj3;
            if (!c830610WiB3.LIZJ && !c830610WiB3.LIZLLL && c830610WiB3.LIZIZ) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : listLJLLLL) {
            C830610WiB c830610WiB4 = (C830610WiB) obj4;
            if (!c830610WiB4.LIZJ && !c830610WiB4.LIZLLL && !c830610WiB4.LIZIZ) {
                arrayList7.add(obj4);
            }
        }
        return new C830560Wi6(arrayList2, arrayList, arrayList6, arrayList7);
    }

    @Override // X.C0W5G
    public final boolean LIZ(String str) {
        return Intrinsics.LJFF(str, "publish");
    }

    public static List LJ(List list, List list2) {
        if (!list2.isEmpty() && !list.isEmpty()) {
            long j = ((C830610WiB) C13LP.LJJJJZI(list2)).LJ;
            long j2 = ((C830610WiB) C13LP.LJJLIIIJJI(list)).LJFF;
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C830610WiB) it2.next()).LJ > j) {
                    if (i != -1) {
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            if (((C830610WiB) listIterator.previous()).LJFF < j2) {
                                int iNextIndex = listIterator.nextIndex();
                                if (iNextIndex != -1) {
                                    return list.subList(Math.max(0, i - 2), Math.min(list.size() - 1, iNextIndex + 2) + 1);
                                }
                            }
                        }
                        return C13BV.INSTANCE;
                    }
                } else {
                    i++;
                }
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
