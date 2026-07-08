package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: X.12nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19861912nR extends AbstractC19850512lb implements NavigableMap {
    public static final C19863212ne LLILZLL;
    public static final C19861912nR LLIZ;
    public static final /* synthetic */ int zzb = 0;
    public final transient C19862012nS LLILLL;
    public final transient AbstractC19861312nL LLILZ;
    public final transient C19861912nR LLILZIL;

    public C19861912nR(C19862012nS c19862012nS, AbstractC19861312nL abstractC19861312nL, C19861912nR c19861912nR) {
        this.LLILLL = c19862012nS;
        this.LLILZ = abstractC19861312nL;
        this.LLILZIL = c19861912nR;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.LLILLL.LLILLL;
    }

    @Override // X.AbstractC19850312lZ, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.LLILLL;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19850312lZ, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19850312lZ
    /* JADX INFO: renamed from: zza */
    public final AbstractC19861612nO values() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19850312lZ
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ AbstractC19860912nH keySet() {
        return this.LLILLL;
    }

    static {
        C19863212ne c19863212ne = C19863212ne.LL;
        LLILZLL = c19863212ne;
        C19862012nS c19862012nSLJIJI = AbstractC19862112nT.LJIJI(c19863212ne);
        C19863012nc c19863012nc = AbstractC19861312nL.LLILLJJLI;
        LLIZ = new C19861912nR(c19862012nSLJIJI, C19861712nP.LLILZIL, null);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.LLILLL.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C19861912nR c19861912nR = this.LLILZIL;
        if (c19861912nR != null) {
            return c19861912nR;
        }
        if (!isEmpty()) {
            return new C19861912nR((C19862012nS) this.LLILLL.descendingSet(), this.LLILZ.zzf(), this);
        }
        Comparator comparator = this.LLILLL.LLILLL;
        return LIZIZ((comparator instanceof AbstractC19863112nd ? (AbstractC19863112nd) comparator : new C19862712nZ(comparator)).LIZ());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.LLILLL.first();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.LLILLL.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC19850312lZ
    public final AbstractC19860912nH LIZ() {
        return isEmpty() ? C19861012nI.LLJ : new C19861112nJ(this);
    }

    @Override // X.AbstractC19850312lZ, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.LLILZ.size() - 1);
    }

    public static C19861912nR LIZIZ(Comparator comparator) {
        if (C19863212ne.LL.equals(comparator)) {
            return LLIZ;
        }
        C19862012nS c19862012nSLJIJI = AbstractC19862112nT.LJIJI(comparator);
        C19863012nc c19863012nc = AbstractC19861312nL.LLILLJJLI;
        return new C19861912nR(c19862012nSLJIJI, C19861712nP.LLILZIL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.SortedMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static C19861912nR zzf(Map map) {
        boolean zEquals;
        final C19863212ne c19863212ne = LLILZLL;
        Comparator comparator = map.comparator();
        int i = 1;
        if (comparator == null) {
            zEquals = true;
        } else {
            zEquals = c19863212ne.equals(comparator);
        }
        ?? EntrySet = map.entrySet();
        Map.Entry[] entryArr = AbstractC19850312lZ.LLILLJJLI;
        if (!(EntrySet instanceof Collection)) {
            Iterator it2 = EntrySet.iterator();
            EntrySet = new ArrayList();
            it2.getClass();
            while (it2.hasNext()) {
                EntrySet.add(it2.next());
            }
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) EntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1) {
                Object[] objArr = new Object[length];
                Object[] objArr2 = new Object[length];
                if (!zEquals) {
                    Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: X.12nY
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            Comparator comparator2 = c19863212ne;
                            Map.Entry entry = (Map.Entry) obj;
                            Map.Entry entry2 = (Map.Entry) obj2;
                            C19863212ne c19863212ne2 = C19861912nR.LLILZLL;
                            entry.getClass();
                            entry2.getClass();
                            return comparator2.compare(entry.getKey(), entry2.getKey());
                        }
                    });
                    Map.Entry entry = entryArr2[0];
                    entry.getClass();
                    Object key = entry.getKey();
                    objArr[0] = key;
                    Object value = entry.getValue();
                    objArr2[0] = value;
                    C19862412nW.LIZ(objArr[0], value);
                    do {
                        Map.Entry entry2 = entryArr2[i - 1];
                        entry2.getClass();
                        Map.Entry entry3 = entryArr2[i];
                        entry3.getClass();
                        Object key2 = entry3.getKey();
                        Object value2 = entry3.getValue();
                        C19862412nW.LIZ(key2, value2);
                        objArr[i] = key2;
                        objArr2[i] = value2;
                        if (c19863212ne.compare(key, key2) != 0) {
                            i++;
                            key = key2;
                        } else {
                            String strValueOf = String.valueOf(entry2);
                            String strValueOf2 = String.valueOf(entry3);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Multiple entries with same key: ");
                            sbLIZ.append(strValueOf);
                            sbLIZ.append(" and ");
                            sbLIZ.append(strValueOf2);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } while (i < length);
                } else {
                    do {
                        Map.Entry entry4 = entryArr2[i2];
                        entry4.getClass();
                        Object key3 = entry4.getKey();
                        Object value3 = entry4.getValue();
                        C19862412nW.LIZ(key3, value3);
                        objArr[i2] = key3;
                        objArr2[i2] = value3;
                        i2++;
                    } while (i2 < length);
                }
                return new C19861912nR(new C19862012nS(AbstractC19861312nL.LJIIIZ(length, objArr), c19863212ne), AbstractC19861312nL.LJIIIZ(length, objArr2), null);
            }
            Map.Entry entry5 = entryArr2[0];
            entry5.getClass();
            return new C19861912nR(new C19862012nS(AbstractC19861312nL.zzj(entry5.getKey()), c19863212ne), AbstractC19861312nL.zzj(entry5.getValue()), null);
        }
        return LIZIZ(c19863212ne);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // X.AbstractC19850312lZ, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C19862012nS c19862012nS = this.LLILLL;
        if (obj != null) {
            try {
                iBinarySearch = Collections.binarySearch(c19862012nS.LLILZIL, obj, c19862012nS.LLILLL);
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (iBinarySearch < 0) {
                iBinarySearch = -1;
            }
        } else {
            iBinarySearch = -1;
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.LLILZ.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final C19861912nR LIZJ(int i, int i2) {
        if (i == 0) {
            if (i2 != this.LLILZ.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i == i2) {
            return LIZIZ(this.LLILLL.LLILLL);
        }
        return new C19861912nR(this.LLILLL.LJJI(i, i2), this.LLILZ.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final C19861912nR headMap(Object obj, boolean z) {
        C19862012nS c19862012nS = this.LLILLL;
        obj.getClass();
        return LIZJ(0, c19862012nS.LJIL(obj, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final C19861912nR tailMap(Object obj, boolean z) {
        C19862012nS c19862012nS = this.LLILLL;
        obj.getClass();
        return LIZJ(c19862012nS.LJJ(obj, z), this.LLILZ.size());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final C19861912nR subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.LLILLL.LLILLL.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(C08KQ.LIZ("expected fromKey <= toKey but %s > %s", obj, obj2));
    }
}
