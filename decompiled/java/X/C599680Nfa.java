package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599680Nfa {
    public static final JavaOnlyArray LIZIZ(Object[] objArr) {
        Object c098200Yq;
        Object c098200Yq2;
        Map map;
        Object c098200Yq3;
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : objArr) {
            if (obj instanceof List) {
                try {
                    c098200Yq = Boolean.valueOf(javaOnlyArray.add(LIZJ((List) obj)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else if (obj instanceof Map) {
                try {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        map = null;
                    }
                    c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LIZLLL(map)));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m1boximpl(c098200Yq2);
            } else if (obj instanceof Object[]) {
                try {
                    c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LIZIZ((Object[]) obj)));
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m1boximpl(c098200Yq3);
            } else {
                javaOnlyArray.add(obj);
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyArray LIZJ(List<?> list) {
        Object c098200Yq;
        Object c098200Yq2;
        Map map;
        Object c098200Yq3;
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            if (obj instanceof List) {
                try {
                    c098200Yq = Boolean.valueOf(javaOnlyArray.add(LIZJ((List) obj)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else if (obj instanceof Map) {
                try {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        map = null;
                    }
                    c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LIZLLL(map)));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m1boximpl(c098200Yq2);
            } else if (obj instanceof Object[]) {
                try {
                    c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LIZIZ((Object[]) obj)));
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m1boximpl(c098200Yq3);
            } else {
                javaOnlyArray.add(obj);
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZLLL(Map<String, ? extends Object> map) {
        Object c098200Yq;
        Object c098200Yq2;
        Map map2;
        Object c098200Yq3;
        if (map == null) {
            return new JavaOnlyMap();
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                try {
                    javaOnlyMap.put(str, LIZJ((List) obj));
                    c098200Yq3 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq3 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m1boximpl(c098200Yq3);
            } else if (obj instanceof Map) {
                try {
                    if (obj instanceof Map) {
                        map2 = (Map) obj;
                    } else {
                        map2 = null;
                    }
                    javaOnlyMap.put(str, LIZLLL(map2));
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m1boximpl(c098200Yq2);
            } else if (obj instanceof Object[]) {
                try {
                    javaOnlyMap.put(str, LIZIZ((Object[]) obj));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                javaOnlyMap.put(str, obj);
            }
        }
        return javaOnlyMap;
    }

    public static final Object LIZ(C599380Nf6 c599380Nf6, String str, Object obj, EnumC599400Nf8 enumC599400Nf8, Map<String, ? extends Object> map) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Object[]) {
            return LIZIZ((Object[]) obj);
        }
        if ((obj instanceof List) && !(obj instanceof JavaOnlyArray)) {
            return LIZJ((List) obj);
        }
        if ((obj instanceof Map) && !(obj instanceof JavaOnlyMap)) {
            return LIZLLL((Map) obj);
        }
        if (obj instanceof JSONObject) {
            C1297550js1.LIZ.getClass();
            return C1297550js1.LIZIZ((JSONObject) obj);
        }
        if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof ReadableMap) || (obj instanceof WritableMap) || (obj instanceof ReadableArray) || (obj instanceof WritableArray)) {
            return obj;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ec_mmk_global_context GlobalContext, checkAndConvertFormat, not support, type=");
        sbLIZ.append(new C599690Nfb(obj.getClass()));
        sbLIZ.append(" value=");
        sbLIZ.append(obj);
        sbLIZ.append(", ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        sbLIZ.append('}');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZJ(strLIZIZ);
        c599380Nf6.LJ(EnumC599630NfV.SET_DATA, EnumC599440NfC.INVALID_VALUE, str, enumC599400Nf8, map);
        return obj;
    }
}
