package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516540pZE {
    public static C1504900pGS LJIIIIZZ() {
        return new C1504900pGS(Collections.emptyList());
    }

    public static void LIZ(List<?> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(list, i) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Element at index ");
                    sbLIZ.append(i);
                    sbLIZ.append(" is null");
                    throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return;
        }
        throw new NullPointerException("list == null");
    }

    public static void LIZIZ(Map<?, ?> map) {
        if (map != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    if (entry.getValue() == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Value for key ");
                        sbLIZ.append(entry.getKey());
                        sbLIZ.append(" is null");
                        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    throw new NullPointerException("map.containsKey(null)");
                }
            }
            return;
        }
        throw new NullPointerException("map == null");
    }

    public static void LJII(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Required field");
        sbLIZ.append(str);
        sbLIZ.append(" not set:");
        sbLIZ.append((Object) sb);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static <T> List<T> LIZJ(String str, List<T> list) {
        if (list != null) {
            if (list != Collections.emptyList() && !(list instanceof C1497000p3i)) {
                return new ArrayList(list);
            }
            return new C1504900pGS(list);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" == null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static <K, V> Map<K, V> LIZLLL(String str, Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" == null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LJ(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static <T> List<T> LJFF(String str, List<T> list) {
        if (list != null) {
            if (list instanceof C1504900pGS) {
                list = ((C1504900pGS) list).LLILLJJLI;
            }
            if (list != Collections.emptyList() && !(list instanceof C1497000p3i)) {
                C1497000p3i c1497000p3i = new C1497000p3i(list);
                if (!c1497000p3i.contains(null)) {
                    return c1497000p3i;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".contains(null)");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return list;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" == null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static <K, V> Map<K, V> LJI(String str, Map<K, V> map) {
        if (map != null) {
            if (map.isEmpty()) {
                return Collections.emptyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (!linkedHashMap.containsKey(null)) {
                if (!linkedHashMap.containsValue(null)) {
                    return Collections.unmodifiableMap(linkedHashMap);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".containsValue(null)");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(".containsKey(null)");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(" == null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LJIIIZ(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ListProtector.set(list, i, protoAdapter.redact(ListProtector.get(list, i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void LJIIJ(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }
}
