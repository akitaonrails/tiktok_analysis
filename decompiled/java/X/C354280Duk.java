package X;

import Y.AComparatorS24S0000000_5;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Duk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C354280Duk extends C2217421BqW implements Function1<List<? extends BeatInfo>, List<? extends BeatInfo>> {
    public C354280Duk(AudioBeatsPanelFragment audioBeatsPanelFragment) {
        super(1, audioBeatsPanelFragment, AudioBeatsPanelFragment.class, "filterBeatsFromLocal", "filterBeatsFromLocal(Ljava/util/List;)Ljava/util/List;", 0);
    }

    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v86, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final List<? extends BeatInfo> invoke(List<? extends BeatInfo> list) {
        long j;
        long j2;
        long j3;
        long j4;
        List list2;
        List list3;
        List<? extends BeatInfo> list4 = list;
        this.receiver.getClass();
        if (list4.isEmpty()) {
            return C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<? extends BeatInfo> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        Iterator<? extends BeatInfo> it3 = list4.iterator();
        while (true) {
            j = 0;
            j2 = 1;
            j3 = 1000;
            j4 = 10000;
            if (!it3.hasNext()) {
                break;
            }
            long j5 = it3.next().timestampInMS;
            long j6 = ((j5 - 10000) + 1) / 1000;
            if (j6 >= 0) {
                j = j6;
            }
            Iterator it4 = C13LP.LLIIII(new IntRange((int) j, (int) (j5 / 1000))).iterator();
            while (it4.hasNext()) {
                int iIntValue = ((Number) it4.next()).intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                Object obj = 0;
                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                if (obj2 != null) {
                    obj = obj2;
                }
                linkedHashMap.put(numValueOf, Integer.valueOf(((Number) obj).intValue() + 1));
            }
        }
        Iterator<? extends BeatInfo> it5 = list4.iterator();
        while (it5.hasNext()) {
            long j7 = it5.next().timestampInMS;
            long j8 = ((j7 - j4) + j2) / j3;
            if (j8 < j) {
                j8 = 0;
            }
            Iterator it6 = C13LP.LLIIII(new IntRange((int) j8, (int) (j7 / j3))).iterator();
            while (it6.hasNext()) {
                int iIntValue2 = ((Number) it6.next()).intValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    long j9 = iIntValue2;
                    long j10 = j9 + j4;
                    long j11 = ((BeatInfo) obj3).timestampInMS;
                    if (j9 <= j11 && j11 <= j10) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                ?? arrayList4 = arrayList3;
                while (arrayList4.size() > 20) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : arrayList4) {
                        Integer numValueOf2 = Integer.valueOf(((BeatInfo) obj4).value);
                        Object arrayList5 = linkedHashMap2.get(numValueOf2);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            linkedHashMap2.put(numValueOf2, arrayList5);
                        }
                        ((List) arrayList5).add(obj4);
                    }
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = arrayList4;
                    Iterator it7 = C1697810uHb.LJIIJJI(4, 2, 3).iterator();
                    while (it7.hasNext()) {
                        int iIntValue3 = ((Number) it7.next()).intValue();
                        if (((List) c259800zU.element).size() > 20) {
                            List list5 = (List) linkedHashMap2.get(Integer.valueOf(iIntValue3));
                            if (list5 != null) {
                                Iterator it8 = list5.iterator();
                                while (it8.hasNext()) {
                                    ((BeatInfo) it8.next()).setMarkedForRemoval(true);
                                }
                            }
                            Iterable iterable = (Iterable) c259800zU.element;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : iterable) {
                                if (!((BeatInfo) obj5).markedForRemoval) {
                                    arrayList6.add(obj5);
                                }
                            }
                            c259800zU.element = new ArrayList(arrayList6);
                        }
                    }
                    if (((List) c259800zU.element).size() > 20 && (list3 = (List) linkedHashMap2.get(1)) != null && (!list3.isEmpty())) {
                        List list6 = (List) linkedHashMap2.get(1);
                        if (list6 != null) {
                            ArrayList arrayList7 = new ArrayList();
                            int i = 0;
                            for (Object obj6 : list6) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    if (i2 % 2 == 0) {
                                        arrayList7.add(obj6);
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            Iterator it9 = arrayList7.iterator();
                            while (it9.hasNext()) {
                                ((BeatInfo) it9.next()).setMarkedForRemoval(true);
                            }
                        }
                        Iterable iterable2 = (Iterable) c259800zU.element;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj7 : iterable2) {
                            if (!((BeatInfo) obj7).markedForRemoval) {
                                arrayList8.add(obj7);
                            }
                        }
                        c259800zU.element = new ArrayList(arrayList8);
                    }
                    if (((List) c259800zU.element).size() > 20 && (list2 = (List) linkedHashMap2.get(1)) != null && (!list2.isEmpty())) {
                        List list7 = (List) linkedHashMap2.get(1);
                        if (list7 != null) {
                            ArrayList arrayList9 = new ArrayList();
                            int i3 = 0;
                            for (Object obj8 : list7) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    if (i3 % 2 == 0) {
                                        arrayList9.add(obj8);
                                    }
                                    i3 = i4;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            Iterator it10 = arrayList9.iterator();
                            while (it10.hasNext()) {
                                ((BeatInfo) it10.next()).setMarkedForRemoval(true);
                            }
                        }
                        Iterable iterable3 = (Iterable) c259800zU.element;
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj9 : iterable3) {
                            if (!((BeatInfo) obj9).markedForRemoval) {
                                arrayList10.add(obj9);
                            }
                        }
                        c259800zU.element = new ArrayList(arrayList10);
                    }
                    arrayList4 = new ArrayList((Collection) c259800zU.element);
                }
                arrayList.removeAll(arrayList3);
                arrayList.addAll(arrayList4);
                linkedHashMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(arrayList4.size()));
                j = 0;
                j2 = 1;
                j3 = 1000;
                j4 = 10000;
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(152), arrayList);
    }
}
