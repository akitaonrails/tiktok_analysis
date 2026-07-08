package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0DQV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQV {
    public static final String LIZ(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        return C13LQ.LJJJ(strArr, e3.d, null, e3.d, null, 58);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K extends CharSequence, V> Map<K, V> LIZIZ(Bundle bundle, String... strArr) {
        Object obj;
        String strLIZ = LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj != null && !(obj instanceof Number) && !(obj instanceof String)) {
                if (obj instanceof Map) {
                    C323580CmK c323580CmK = new C323580CmK(2);
                    c323580CmK.LIZIZ(strArr);
                    c323580CmK.LIZ(str);
                    linkedHashMap.putAll(LIZLLL((Map) obj, (String[]) c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()])));
                } else if (obj instanceof Iterable) {
                    C323580CmK c323580CmK2 = new C323580CmK(2);
                    c323580CmK2.LIZIZ(strArr);
                    c323580CmK2.LIZ(str);
                    linkedHashMap.putAll(LIZJ((Iterable) obj, (String[]) c323580CmK2.LIZLLL(new String[c323580CmK2.LIZJ()])));
                } else if (obj instanceof Object[]) {
                    C323580CmK c323580CmK3 = new C323580CmK(2);
                    c323580CmK3.LIZIZ(strArr);
                    c323580CmK3.LIZ(str);
                    linkedHashMap.putAll(LJ((Object[]) obj, (String[]) c323580CmK3.LIZLLL(new String[c323580CmK3.LIZJ()])));
                } else if (obj instanceof Bundle) {
                    C323580CmK c323580CmK4 = new C323580CmK(2);
                    c323580CmK4.LIZIZ(strArr);
                    c323580CmK4.LIZ(str);
                    linkedHashMap.putAll(LIZIZ((Bundle) obj, (String[]) c323580CmK4.LIZLLL(new String[c323580CmK4.LIZJ()])));
                }
            } else {
                linkedHashMap.put(Intrinsics.LJIIJJI(str, strLIZ), obj);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K extends CharSequence, V> Map<K, V> LIZJ(Iterable<? extends V> iterable, String... strArr) {
        String strLIZ = LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (V v : iterable) {
            int i2 = i + 1;
            if (i >= 0) {
                if (v != null && !(v instanceof Number) && !(v instanceof String)) {
                    if (v instanceof Map) {
                        C323580CmK c323580CmK = new C323580CmK(2);
                        c323580CmK.LIZIZ(strArr);
                        c323580CmK.LIZ(String.valueOf(i));
                        linkedHashMap.putAll(LIZLLL((Map) v, (String[]) c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()])));
                    } else if (v instanceof Iterable) {
                        C323580CmK c323580CmK2 = new C323580CmK(2);
                        c323580CmK2.LIZIZ(strArr);
                        c323580CmK2.LIZ(String.valueOf(i));
                        linkedHashMap.putAll(LIZJ((Iterable) v, (String[]) c323580CmK2.LIZLLL(new String[c323580CmK2.LIZJ()])));
                    } else if (v instanceof Object[]) {
                        C323580CmK c323580CmK3 = new C323580CmK(2);
                        c323580CmK3.LIZIZ(strArr);
                        c323580CmK3.LIZ(String.valueOf(i));
                        linkedHashMap.putAll(LJ((Object[]) v, (String[]) c323580CmK3.LIZLLL(new String[c323580CmK3.LIZJ()])));
                    } else if (v instanceof Bundle) {
                        C323580CmK c323580CmK4 = new C323580CmK(2);
                        c323580CmK4.LIZIZ(strArr);
                        c323580CmK4.LIZ(String.valueOf(i));
                        linkedHashMap.putAll(LIZIZ((Bundle) v, (String[]) c323580CmK4.LIZLLL(new String[c323580CmK4.LIZJ()])));
                    }
                } else {
                    linkedHashMap.put(Intrinsics.LJIIJJI(Integer.valueOf(i), strLIZ), v);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public static final <K extends CharSequence, V> Map<K, V> LIZLLL(Map<K, ? extends V> map, String... strArr) {
        String strLIZ = LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null && !(entry.getValue() instanceof Number) && !(entry.getValue() instanceof String)) {
                if (entry.getValue() instanceof Map) {
                    V value = entry.getValue();
                    if (value != null) {
                        C323580CmK c323580CmK = new C323580CmK(2);
                        c323580CmK.LIZIZ(strArr);
                        c323580CmK.LIZ(entry.getKey().toString());
                        linkedHashMap.putAll(LIZLLL((Map) value, (String[]) c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()])));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K of com.bytedance.tpsw.bpea.common.UtilsKt.flattenMap$lambda-0, V of com.bytedance.tpsw.bpea.common.UtilsKt.flattenMap$lambda-0>");
                    }
                } else if (entry.getValue() instanceof Iterable) {
                    V value2 = entry.getValue();
                    if (value2 != null) {
                        C323580CmK c323580CmK2 = new C323580CmK(2);
                        c323580CmK2.LIZIZ(strArr);
                        c323580CmK2.LIZ(entry.getKey().toString());
                        linkedHashMap.putAll(LIZJ((Iterable) value2, (String[]) c323580CmK2.LIZLLL(new String[c323580CmK2.LIZJ()])));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Iterable<V of com.bytedance.tpsw.bpea.common.UtilsKt.flattenMap$lambda-0>");
                    }
                } else if (entry.getValue() instanceof Object[]) {
                    V value3 = entry.getValue();
                    if (value3 != null) {
                        C323580CmK c323580CmK3 = new C323580CmK(2);
                        c323580CmK3.LIZIZ(strArr);
                        c323580CmK3.LIZ(entry.getKey().toString());
                        linkedHashMap.putAll(LJ((Object[]) value3, (String[]) c323580CmK3.LIZLLL(new String[c323580CmK3.LIZJ()])));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<V of com.bytedance.tpsw.bpea.common.UtilsKt.flattenMap$lambda-0>");
                    }
                } else if (entry.getValue() instanceof Bundle) {
                    V value4 = entry.getValue();
                    if (value4 != null) {
                        C323580CmK c323580CmK4 = new C323580CmK(2);
                        c323580CmK4.LIZIZ(strArr);
                        c323580CmK4.LIZ(entry.getKey().toString());
                        linkedHashMap.putAll(LIZIZ((Bundle) value4, (String[]) c323580CmK4.LIZLLL(new String[c323580CmK4.LIZJ()])));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
                    }
                } else {
                    continue;
                }
            } else {
                linkedHashMap.put(Intrinsics.LJIIJJI(entry.getKey(), strLIZ), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K extends CharSequence, V> Map<K, V> LJ(V[] vArr, String... strArr) {
        String strLIZ = LIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = vArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object[] objArr = vArr[i];
            int i3 = i2 + 1;
            if (objArr != 0 && !(objArr instanceof Number) && !(objArr instanceof String)) {
                if (objArr instanceof Map) {
                    C323580CmK c323580CmK = new C323580CmK(2);
                    c323580CmK.LIZIZ(strArr);
                    c323580CmK.LIZ(String.valueOf(i2));
                    linkedHashMap.putAll(LIZLLL((Map) objArr, (String[]) c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()])));
                } else if (objArr instanceof Iterable) {
                    C323580CmK c323580CmK2 = new C323580CmK(2);
                    c323580CmK2.LIZIZ(strArr);
                    c323580CmK2.LIZ(String.valueOf(i2));
                    linkedHashMap.putAll(LIZJ((Iterable) objArr, (String[]) c323580CmK2.LIZLLL(new String[c323580CmK2.LIZJ()])));
                } else if (objArr instanceof Object[]) {
                    C323580CmK c323580CmK3 = new C323580CmK(2);
                    c323580CmK3.LIZIZ(strArr);
                    c323580CmK3.LIZ(String.valueOf(i2));
                    linkedHashMap.putAll(LJ(objArr, (String[]) c323580CmK3.LIZLLL(new String[c323580CmK3.LIZJ()])));
                } else if (objArr instanceof Bundle) {
                    C323580CmK c323580CmK4 = new C323580CmK(2);
                    c323580CmK4.LIZIZ(strArr);
                    c323580CmK4.LIZ(String.valueOf(i2));
                    linkedHashMap.putAll(LIZIZ((Bundle) objArr, (String[]) c323580CmK4.LIZLLL(new String[c323580CmK4.LIZJ()])));
                }
            } else {
                linkedHashMap.put(Intrinsics.LJIIJJI(Integer.valueOf(i2), strLIZ), objArr);
            }
            i++;
            i2 = i3;
        }
        return linkedHashMap;
    }
}
