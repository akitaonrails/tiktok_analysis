package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0R2D, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2D {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    public static void LIZ(String str, Map map, List list, Object obj) {
        Cloneable linkedHashMap;
        Number number;
        Object linkedHashMap2;
        Object next;
        String str2;
        String str3;
        Integer numLJIIJJI;
        if (obj == null) {
            return;
        }
        int i = 0;
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(new Regex("([^\\.\\[\\]]+)|\\[(\\d+)]"), str, 0, 2, null);
        ArrayList arrayList = new ArrayList();
        for (MatchResult matchResult : sequenceFindAll$default) {
            MatchGroup matchGroupLJ = matchResult.getGroups().LJ(1);
            if (matchGroupLJ != null) {
                str2 = matchGroupLJ.LIZ;
            } else {
                str2 = null;
            }
            MatchGroup matchGroupLJ2 = matchResult.getGroups().LJ(2);
            if (matchGroupLJ2 != null) {
                str3 = matchGroupLJ2.LIZ;
            } else {
                str3 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            } else if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
                arrayList.add(Integer.valueOf(numLJIIJJI.intValue()));
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Object second : arrayList) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Pair pair = (Pair) next;
                    if (pair.getFirst() != null && Intrinsics.LJFF(pair.getFirst(), second.toString())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (second = pair2.getSecond()) == null) {
                second = "";
            }
            arrayList2.add(second);
        }
        if (!arrayList2.isEmpty() && Intrinsics.LJFF(ListProtector.get(arrayList2, 0), "cache") && map != 0) {
            List listLJJJJIZL = C13LP.LJJJJIZL(arrayList2, 1);
            if (listLJJJJIZL.isEmpty()) {
                return;
            }
            int size = listLJJJJIZL.size() - 1;
            while (i < size) {
                Object obj2 = ListProtector.get(listLJJJJIZL, i);
                i++;
                Object obj3 = ListProtector.get(listLJJJJIZL, i);
                if (obj2 instanceof String) {
                    if (C19719512Dh.LJII(map)) {
                        Map mapLIZJ = C19719512Dh.LIZJ(map);
                        if (!mapLIZJ.containsKey(obj2) || mapLIZJ.get(obj2) == null) {
                            if (obj3 instanceof Integer) {
                                linkedHashMap = new ArrayList();
                            } else {
                                linkedHashMap = new LinkedHashMap();
                            }
                            mapLIZJ.put(obj2, linkedHashMap);
                        }
                        map = mapLIZJ.get(obj2);
                        if (map == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (!(obj2 instanceof Integer) || !C19719512Dh.LJI(map)) {
                        return;
                    }
                    List listLIZIZ = C19719512Dh.LIZIZ(map);
                    while (true) {
                        number = (Number) obj2;
                        if (listLIZIZ.size() > number.intValue()) {
                            break;
                        } else {
                            listLIZIZ.add(null);
                        }
                    }
                    if (ListProtector.get(listLIZIZ, number.intValue()) == null) {
                        int iIntValue = number.intValue();
                        if (obj3 instanceof Integer) {
                            linkedHashMap2 = new ArrayList();
                        } else {
                            linkedHashMap2 = new LinkedHashMap();
                        }
                        ListProtector.set(listLIZIZ, iIntValue, linkedHashMap2);
                    }
                    map = ListProtector.get(listLIZIZ, number.intValue());
                    if (map == 0) {
                        return;
                    }
                }
            }
            Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(listLJJJJIZL);
            if (objLJJLIIIJJI instanceof String) {
                if (!C19719512Dh.LJII(map)) {
                    return;
                }
                C19719512Dh.LIZJ(map).put(objLJJLIIIJJI, obj);
            } else {
                if (!(objLJJLIIIJJI instanceof Integer) || !C19719512Dh.LJI(map)) {
                    return;
                }
                List listLIZIZ2 = C19719512Dh.LIZIZ(map);
                while (true) {
                    Number number2 = (Number) objLJJLIIIJJI;
                    if (listLIZIZ2.size() <= number2.intValue()) {
                        listLIZIZ2.add(null);
                    } else {
                        ListProtector.set(listLIZIZ2, number2.intValue(), obj);
                        return;
                    }
                }
            }
        }
    }
}
