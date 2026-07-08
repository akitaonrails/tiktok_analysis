package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS43S0000100_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20023813Wi extends AbstractC20024013Wk {
    public final HashMap<C1576580r84<?>, Map<String, List<C20023913Wj>>> LIZ = new HashMap<>();

    public final void LIZIZ() {
        HashMap<C1576580r84<?>, Map<String, List<C20023913Wj>>> map = this.LIZ;
        for (Map.Entry<C1576580r84<?>, Map<String, List<C20023913Wj>>> entry : map.entrySet()) {
            C1576580r84<?> key = entry.getKey();
            for (Map.Entry<String, List<C20023913Wj>> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                List<C20023913Wj> value = entry2.getValue();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                for (C20023913Wj c20023913Wj : value) {
                    String str = c20023913Wj.LIZ;
                    long j = c20023913Wj.LIZIZ;
                    long j2 = c20023913Wj.LIZJ;
                    long j3 = c20023913Wj.LIZLLL;
                    long j4 = c20023913Wj.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(',');
                    sbLIZ.append(j);
                    sbLIZ.append(',');
                    sbLIZ.append(j2);
                    sbLIZ.append(',');
                    sbLIZ.append(j3);
                    sbLIZ.append(',');
                    sbLIZ.append(j4);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                KevaImpl.getRepo(key.LIZJ(), 0).storeStringSet(key2, C13LP.LLIIJI(arrayList));
            }
        }
        map.clear();
    }

    public C20023813Wi(Context context) {
    }

    public static C20023913Wj LJIIIIZZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        try {
            if (listLJJLIIIJILLIZJL.size() == 5) {
                return new C20023913Wj((String) listLJJLIIIJILLIZJL.get(0), CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(1)), CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(2)), CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(3)), CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(4)));
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static Pair LIZLLL(String str, List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C20023913Wj c20023913Wj = (C20023913Wj) obj;
                if (Intrinsics.LJFF(c20023913Wj.LIZ, str)) {
                    return new Pair(c20023913Wj, Integer.valueOf(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    @Override // X.AbstractC20024013Wk
    public final Map LIZ(String str, C1576580r84 c1576580r84) {
        Map<String, List<C20023913Wj>> map = this.LIZ.get(c1576580r84);
        if (map == null) {
            Keva repo = KevaImpl.getRepo(c1576580r84.LIZJ(), 0);
            Set<String> allKey = repo.getAllKey();
            if (allKey.size() >= 5) {
                TreeSet treeSet = new TreeSet(allKey);
                while (treeSet.size() > 5) {
                    String str2 = (String) treeSet.first();
                    treeSet.remove(str2);
                    repo.erase(str2);
                }
                allKey = treeSet;
            }
            Pair pair = new Pair(repo, allKey);
            Keva keva = (Keva) pair.getFirst();
            Set<String> set = (Set) pair.getSecond();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : set) {
                Set<String> stringSet = keva.getStringSet(str3, C08CX.INSTANCE);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = stringSet.iterator();
                while (it2.hasNext()) {
                    C20023913Wj c20023913WjLJIIIIZZ = LJIIIIZZ((String) it2.next());
                    if (c20023913WjLJIIIIZZ != null) {
                        arrayList.add(c20023913WjLJIIIIZZ);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                HashMap<C1576580r84<?>, Map<String, List<C20023913Wj>>> map2 = this.LIZ;
                Map<String, List<C20023913Wj>> map3 = map2.get(c1576580r84);
                if (map3 == null) {
                    map3 = new HashMap<>();
                    map2.put(c1576580r84, map3);
                }
                map3.put(str3, arrayList2);
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (Intrinsics.LJFF(((C20023913Wj) next).LIZ, str)) {
                            if (next != null) {
                                linkedHashMap.put(str3, next);
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }
        Set<String> setKeySet = map.keySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str4 : setKeySet) {
            List<C20023913Wj> list = map.get(str4);
            if (list != null) {
                Iterator<C20023913Wj> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        C20023913Wj next2 = it4.next();
                        if (Intrinsics.LJFF(next2.LIZ, str)) {
                            if (next2 != null) {
                                linkedHashMap2.put(str4, next2);
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap2;
    }

    public final List LIZJ(String str, C1576580r84 c1576580r84) {
        List<C20023913Wj> list;
        Map<String, List<C20023913Wj>> map = this.LIZ.get(c1576580r84);
        if (map != null && (list = map.get(str)) != null) {
            return list;
        }
        Set<String> stringSet = KevaImpl.getRepo(c1576580r84.LIZJ(), 0).getStringSet(str, C08CX.INSTANCE);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            C20023913Wj c20023913WjLJIIIIZZ = LJIIIIZZ((String) it2.next());
            if (c20023913WjLJIIIIZZ != null) {
                arrayList.add(c20023913WjLJIIIIZZ);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashMap<C1576580r84<?>, Map<String, List<C20023913Wj>>> map2 = this.LIZ;
        Map<String, List<C20023913Wj>> map3 = map2.get(c1576580r84);
        if (map3 == null) {
            map3 = new HashMap<>();
            map2.put(c1576580r84, map3);
        }
        map3.put(str, arrayList2);
        return arrayList2;
    }

    public final void LJFF(C1576580r84<?> c1576580r84, String str, String str2) {
        List listLIZJ = LIZJ(str2, c1576580r84);
        Pair pairLIZLLL = LIZLLL(str, listLIZJ);
        if (pairLIZLLL == null) {
            listLIZJ.add(new C20023913Wj(str, 0L, 0L, 1L, -1L));
            return;
        }
        C20023913Wj c20023913Wj = (C20023913Wj) pairLIZLLL.getFirst();
        int iIntValue = ((Number) pairLIZLLL.getSecond()).intValue();
        if (c20023913Wj == null) {
            ListProtector.remove(listLIZJ, iIntValue);
            listLIZJ.add(new C20023913Wj(str, 0L, 0L, 1L, -1L));
        } else {
            c20023913Wj.LIZLLL++;
        }
    }

    public final void LJ(C1576580r84<?> c1576580r84, String str, String str2, Function1<? super C20023913Wj, Unit> function1) {
        Pair pairLIZLLL = LIZLLL(str, LIZJ(str2, c1576580r84));
        if (pairLIZLLL == null) {
            return;
        }
        Object first = pairLIZLLL.getFirst();
        ((Number) pairLIZLLL.getSecond()).intValue();
        if (first == 0) {
            return;
        }
        function1.invoke(first);
    }

    public final void LJI(C1576580r84<?> c1576580r84, String str, String str2, long j) {
        LJ(c1576580r84, str, str2, new AwS43S0000100_30(j, 2));
    }

    public final void LJII(C1576580r84<?> c1576580r84, String str, String str2, long j) {
        LJ(c1576580r84, str, str2, new AwS43S0000100_30(j, 3));
    }
}
