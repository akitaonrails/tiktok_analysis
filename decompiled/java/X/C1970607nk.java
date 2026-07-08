package X;

import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.07nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1970607nk {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(Map map) {
        int i;
        int size = map.size();
        if (size <= 0) {
            i = 0;
        } else {
            i = 4;
            while (i < size) {
                i <<= 1;
            }
        }
        long j = 12;
        long j2 = 4;
        long jLIZLLL = 0 + j + j2 + j2 + j2 + j + j2 + (((long) i) * 4) + j + j2 + (((long) (i * 2)) * 4);
        for (Map.Entry entry : map.entrySet()) {
            jLIZLLL = jLIZLLL + LIZLLL(entry.getKey()) + LIZLLL(entry.getValue());
        }
        return jLIZLLL;
    }

    public static long LIZIZ(List list) {
        long jLIZ;
        long j = 12;
        long j2 = 4;
        long size = 0 + j + j2 + j2 + j2 + j + j2 + ((long) (list.size() * 4));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            if (map instanceof ArrayMap) {
                jLIZ = LIZ(map);
            } else if (map instanceof LinkedHashMap) {
                jLIZ = LIZJ((HashMap) map);
            } else if (map instanceof HashMap) {
                jLIZ = LIZJ((HashMap) map);
            } else {
                jLIZ = LIZ(map);
            }
            size += jLIZ;
        }
        return size;
    }

    public static long LIZJ(HashMap map) {
        long j = 12;
        long j2 = 4;
        long size = 0 + j + j2 + j2 + j2 + j2 + j2 + j + j2 + ((long) (map.size() * 4));
        for (Map.Entry entry : map.entrySet()) {
            size = size + j + j2 + j2 + j2 + LIZLLL(entry.getKey()) + LIZLLL(entry.getValue());
        }
        return size;
    }

    public static long LIZLLL(Object obj) {
        long jLIZLLL = 0;
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof String) {
            return (((long) ((String) obj).length()) * 2) + 0;
        }
        if (!(obj instanceof Integer)) {
            if (!(obj instanceof Long)) {
                if (!(obj instanceof Float)) {
                    if (!(obj instanceof Double)) {
                        if (obj instanceof Boolean) {
                            return 1L;
                        }
                        try {
                            for (Field field : obj.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                try {
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        jLIZLLL += LIZLLL(obj2);
                                    }
                                } catch (IllegalAccessException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        return jLIZLLL;
                    }
                    return 8L;
                }
                return 4L;
            }
            return 8L;
        }
        return 4L;
    }

    public static ArrayMap LJ(Map map) {
        int size;
        if (map != null) {
            size = map.size();
        } else {
            size = 0;
        }
        ArrayMap arrayMap = new ArrayMap(size);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                arrayMap.put(entry.getKey(), entry.getValue());
            }
        }
        return arrayMap;
    }
}
