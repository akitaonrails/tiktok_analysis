package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09F2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09F2 {
    public static Object LIZ(Object obj, ChunkPatch chunkPatch) throws IllegalAccessException {
        C09F6 c09f6;
        Object obj2;
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (obj != null && arrayList != null && arrayList.size() != 0) {
            if (((String) ListProtector.get(arrayList, 0)).equals("")) {
                ListProtector.remove(arrayList, 0);
            }
            if (arrayList.size() <= 1) {
                return obj;
            }
            HashMap<String, C09F6> map = chunkPatch.LIZLLL;
            if (map != null) {
                c09f6 = map.get(ListProtector.get(arrayList, 0));
            } else {
                c09f6 = null;
            }
            if (c09f6 != null && c09f6.LIZIZ == obj) {
                ListProtector.remove(arrayList, 0);
                Object obj3 = c09f6.LIZJ;
                if (arrayList.size() <= 1) {
                    chunkPatch.LIZ = obj3;
                    return obj3;
                }
                if (obj3 instanceof List) {
                    int i = CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0));
                    List list = (List) obj3;
                    if (i > list.size() - 1) {
                        return null;
                    }
                    Object obj4 = ListProtector.get(list, i);
                    ListProtector.remove(arrayList, 0);
                    if (arrayList.size() <= 1) {
                        chunkPatch.LIZ = obj4;
                        return obj4;
                    }
                    return LIZ(obj4, chunkPatch);
                }
                if (obj3 instanceof Map) {
                    return LIZJ((Map) obj3, chunkPatch);
                }
                return LIZ(obj3, chunkPatch);
            }
            if (obj instanceof Map) {
                return LIZJ((Map) obj, chunkPatch);
            }
            for (int i2 = 0; i2 <= arrayList.size() - 1; i2++) {
                String str = (String) ListProtector.get(arrayList, 0);
                C09F6 c09f62 = map.get(str);
                if (c09f62 != null && (obj2 = c09f62.LIZIZ) != null && obj2.getClass().equals(obj.getClass())) {
                    Field field = c09f62.LIZ;
                    field.setAccessible(true);
                    ListProtector.remove(arrayList, 0);
                    if (arrayList.size() <= 1) {
                        Object obj5 = field.get(obj);
                        chunkPatch.LIZ = obj5;
                        return obj5;
                    }
                    if (Collection.class.isAssignableFrom(field.getType())) {
                        List list2 = (List) field.get(obj);
                        int i3 = CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0));
                        if (i3 > list2.size() - 1) {
                            return null;
                        }
                        Object obj6 = ListProtector.get(list2, i3);
                        ListProtector.remove(arrayList, 0);
                        if (arrayList.size() <= 1) {
                            chunkPatch.LIZ = obj6;
                            return obj6;
                        }
                        return LIZ(obj6, chunkPatch);
                    }
                    Object obj7 = field.get(obj);
                    chunkPatch.LIZ = obj7;
                    return LIZ(obj7, chunkPatch);
                }
                Field fieldLIZ = C2333709Cl.LIZ(obj.getClass(), str);
                if (fieldLIZ != null) {
                    ListProtector.remove(arrayList, 0);
                    if (arrayList.size() <= 1) {
                        Object obj8 = fieldLIZ.get(obj);
                        chunkPatch.LIZ = obj8;
                        C09F6 c09f63 = new C09F6();
                        c09f63.LIZ = fieldLIZ;
                        c09f63.LIZIZ = obj;
                        c09f63.LIZJ = obj8;
                        map.put(str, c09f63);
                        return obj8;
                    }
                    if (Collection.class.isAssignableFrom(fieldLIZ.getType())) {
                        List list3 = (List) fieldLIZ.get(obj);
                        C09F6 c09f64 = new C09F6();
                        c09f64.LIZ = fieldLIZ;
                        c09f64.LIZIZ = obj;
                        c09f64.LIZJ = list3;
                        map.put(str, c09f64);
                        Object obj9 = ListProtector.get(list3, CastIntegerProtector.parseInt((String) ListProtector.get(arrayList, 0)));
                        ListProtector.remove(arrayList, 0);
                        if (arrayList.size() <= 1) {
                            chunkPatch.LIZ = obj9;
                            return obj9;
                        }
                        return LIZ(obj9, chunkPatch);
                    }
                    Object obj10 = fieldLIZ.get(obj);
                    chunkPatch.LIZ = obj10;
                    C09F6 c09f65 = new C09F6();
                    c09f65.LIZ = fieldLIZ;
                    c09f65.LIZIZ = obj;
                    c09f65.LIZJ = obj10;
                    map.put(str, c09f65);
                    return LIZ(obj10, chunkPatch);
                }
            }
        }
        return null;
    }

    public static Object LIZJ(Map<String, Object> map, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList == null) {
            return null;
        }
        if (((String) ListProtector.get(arrayList, 0)).equals("")) {
            ListProtector.remove(arrayList, 0);
        }
        if (arrayList.size() <= 1) {
            return map;
        }
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            Object obj = ListProtector.get(arrayList, 0);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getKey().equals(obj)) {
                    ListProtector.remove(arrayList, 0);
                    Object value = entry.getValue();
                    chunkPatch.LIZ = value;
                    chunkPatch.LIZIZ = arrayList;
                    if (arrayList.size() <= 1) {
                        return value;
                    }
                    if (value instanceof ArrayList) {
                        try {
                            Object obj2 = ((ArrayList) value).get(CastIntegerProtector.parseInt(arrayList.get(0)));
                            arrayList.remove(0);
                            if (arrayList.size() <= 1) {
                                chunkPatch.LIZ = obj2;
                                return obj2;
                            }
                            if (obj2 instanceof Map) {
                                return LIZJ((Map) obj2, chunkPatch);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (value instanceof Map) {
                        return LIZJ((Map) value, chunkPatch);
                    }
                }
            }
        }
        return null;
    }

    public static Field LIZIZ(Object obj, String str, HashMap<String, C09F6> map) {
        C09F6 c09f6;
        Object obj2;
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        if (map != null && (c09f6 = map.get(str)) != null && (obj2 = c09f6.LIZIZ) != null && obj2.getClass().equals(obj.getClass())) {
            return c09f6.LIZ;
        }
        return C2333709Cl.LIZ(obj.getClass(), str);
    }
}
