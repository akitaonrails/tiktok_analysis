package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1971707nv {
    public static final ConcurrentHashMap<String, Pair<Keva, Keva>> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1971807nw());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1971907nx());

    public static Pair LIZ(String str) {
        C01GW c01gw = LIZIZ;
        Keva keva = (Keva) c01gw.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lazy_data_update_time-");
        sbLIZ.append(str);
        long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        C01GW c01gw2 = LIZJ;
        Keva keva2 = (Keva) c01gw2.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lazy_data_update_time-");
        sbLIZ2.append(str);
        if (j > keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L)) {
            return new Pair(c01gw.getValue(), c01gw2.getValue());
        }
        return new Pair(c01gw2.getValue(), c01gw.getValue());
    }

    public static Keva LIZIZ(String str) {
        Pair<Keva, Keva> pairPutIfAbsent;
        ConcurrentHashMap<String, Pair<Keva, Keva>> concurrentHashMap = LIZ;
        Pair<Keva, Keva> pairLIZ = concurrentHashMap.get(str);
        if (pairLIZ == null && (pairPutIfAbsent = concurrentHashMap.putIfAbsent(str, (pairLIZ = LIZ(str)))) != null) {
            pairLIZ = pairPutIfAbsent;
        }
        return pairLIZ.getSecond();
    }

    public static Keva LIZJ(String str) {
        Pair<Keva, Keva> pairPutIfAbsent;
        ConcurrentHashMap<String, Pair<Keva, Keva>> concurrentHashMap = LIZ;
        Pair<Keva, Keva> pairLIZ = concurrentHashMap.get(str);
        if (pairLIZ == null && (pairPutIfAbsent = concurrentHashMap.putIfAbsent(str, (pairLIZ = LIZ(str)))) != null) {
            pairLIZ = pairPutIfAbsent;
        }
        return pairLIZ.getFirst();
    }

    public static void LIZLLL(Keva keva, Object obj, String str) {
        boolean z = true;
        if (obj != null) {
            if (obj instanceof Integer) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("-int");
                keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), ((Integer) obj).intValue());
                return;
            }
            if (obj instanceof Float) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("-float");
                keva.storeFloat(C2188811AlT.LIZIZ(sbLIZ2), ((Float) obj).floatValue());
                return;
            }
            if (obj instanceof Boolean) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append("-boolean");
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ3), ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Double) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("-double");
                keva.storeDouble(C2188811AlT.LIZIZ(sbLIZ4), ((Double) obj).doubleValue());
                return;
            }
            if (obj instanceof byte[]) {
                return;
            }
            if (obj instanceof Long) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(str);
                sbLIZ5.append("-long");
                keva.storeLong(C2188811AlT.LIZIZ(sbLIZ5), ((Long) obj).longValue());
                return;
            }
            if (obj instanceof String) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(str);
                sbLIZ6.append("-string");
                keva.storeString(C2188811AlT.LIZIZ(sbLIZ6), (String) obj);
                return;
            }
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                field.setAccessible(z);
                C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
                if (c09ct != null) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(str);
                    sbLIZ7.append('-');
                    sbLIZ7.append(c09ct.value());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                    if (Intrinsics.LJFF(field.getType(), Integer.TYPE)) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append(strLIZIZ);
                        sbLIZ8.append("-int");
                        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ8), ((Integer) field.get(obj)).intValue());
                    } else if (Intrinsics.LJFF(field.getType(), Float.TYPE)) {
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append(strLIZIZ);
                        sbLIZ9.append("-float");
                        keva.storeFloat(C2188811AlT.LIZIZ(sbLIZ9), ((Float) field.get(obj)).floatValue());
                    } else if (Intrinsics.LJFF(field.getType(), Boolean.TYPE)) {
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append(strLIZIZ);
                        sbLIZ10.append("-boolean");
                        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ10), ((Boolean) field.get(obj)).booleanValue());
                    } else if (Intrinsics.LJFF(field.getType(), Double.TYPE)) {
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append(strLIZIZ);
                        sbLIZ11.append("-double");
                        keva.storeDouble(C2188811AlT.LIZIZ(sbLIZ11), ((Double) field.get(obj)).doubleValue());
                    } else if (!Intrinsics.LJFF(field.getType(), byte[].class)) {
                        if (Intrinsics.LJFF(field.getType(), Long.TYPE)) {
                            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                            sbLIZ12.append(strLIZIZ);
                            sbLIZ12.append("-long");
                            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ12), ((Long) field.get(obj)).longValue());
                        } else if (Intrinsics.LJFF(field.getType(), String.class)) {
                            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                            sbLIZ13.append(strLIZIZ);
                            sbLIZ13.append("-string");
                            keva.storeString(C2188811AlT.LIZIZ(sbLIZ13), (String) field.get(obj));
                        } else if (Object[].class.isAssignableFrom(field.getType())) {
                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                            sbLIZ14.append(strLIZIZ);
                            sbLIZ14.append("-size");
                            keva.storeInt(C2188811AlT.LIZIZ(sbLIZ14), ((Object[]) field.get(obj)).length);
                            Object[] objArr = (Object[]) field.get(obj);
                            int length2 = objArr.length;
                            for (int i2 = 0; i2 < length2; i2++) {
                                Object obj2 = objArr[i2];
                                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                sbLIZ15.append(strLIZIZ);
                                sbLIZ15.append('-');
                                sbLIZ15.append(i2);
                                LIZLLL(keva, obj2, C2188811AlT.LIZIZ(sbLIZ15));
                            }
                        } else if (Map.class.isAssignableFrom(field.getType())) {
                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                            sbLIZ16.append(strLIZIZ);
                            sbLIZ16.append("-size");
                            keva.storeInt(C2188811AlT.LIZIZ(sbLIZ16), ((Map) field.get(obj)).size());
                            for (Map.Entry entry : ((Map) field.get(obj)).entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append(strLIZIZ);
                                sbLIZ17.append('-');
                                sbLIZ17.append(key);
                                LIZLLL(keva, value, C2188811AlT.LIZIZ(sbLIZ17));
                            }
                        } else if (Collection.class.isAssignableFrom(field.getType())) {
                            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                            sbLIZ18.append(strLIZIZ);
                            sbLIZ18.append("-size");
                            keva.storeInt(C2188811AlT.LIZIZ(sbLIZ18), ((Collection) field.get(obj)).size());
                            int i3 = 0;
                            for (Object obj3 : (Collection) field.get(obj)) {
                                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                                sbLIZ19.append(strLIZIZ);
                                sbLIZ19.append('-');
                                sbLIZ19.append(i3);
                                LIZLLL(keva, obj3, C2188811AlT.LIZIZ(sbLIZ19));
                                i3++;
                            }
                        } else {
                            LIZLLL(keva, field.get(obj), strLIZIZ);
                        }
                    }
                }
                i++;
                z = true;
            }
        }
    }

    public static void LJ(Class cls, String str, String str2) {
        if (str2 != null) {
            try {
                LIZLLL(LIZIZ(str), new Gson().LJII(str2, cls), str);
                Keva kevaLIZIZ = LIZIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lazy_data_update_time-");
                sbLIZ.append(str);
                kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
