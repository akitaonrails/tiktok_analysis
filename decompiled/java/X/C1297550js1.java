package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.PiperData;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0js1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297550js1 {
    public static final C1297550js1 LIZ = new C1297550js1();

    public static JavaOnlyArray LIZ(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONArray) {
                javaOnlyArray.add(LIZ((JSONArray) objOpt));
            } else if (objOpt instanceof JSONObject) {
                javaOnlyArray.add(LIZIZ((JSONObject) objOpt));
            } else {
                javaOnlyArray.add(objOpt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZIZ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                javaOnlyMap.put(next, LIZIZ((JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                javaOnlyMap.put(next, LIZ((JSONArray) objOpt));
            } else if (Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                javaOnlyMap.put(next, null);
            } else {
                javaOnlyMap.put(next, objOpt);
            }
        }
        return javaOnlyMap;
    }

    public static Number LIZJ(Number number) {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        double dDoubleValue;
        try {
            c098200Yq = Integer.valueOf(number.intValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        try {
            c098200Yq2 = Double.valueOf(number.doubleValue());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        Double d = (Double) obj;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        if (Double.compare(iIntValue, dDoubleValue) == 0) {
            return Integer.valueOf(iIntValue);
        }
        long j = (long) dDoubleValue;
        if (Double.compare(dDoubleValue, j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(dDoubleValue);
    }

    public static JSONArray LIZLLL(JavaOnlyArray javaOnlyArray) {
        int i;
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = javaOnlyArray.get(i2);
            try {
                ReadableType type = javaOnlyArray.getType(i2);
                if (type != null) {
                    i = C1297630js9.LIZ[type.ordinal()];
                } else {
                    i = -1;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                jSONArray.put(obj);
                            } else {
                                jSONArray.put(C1299060juS.LIZIZ((PiperData) obj));
                            }
                        } else {
                            jSONArray.put(LIZJ((Number) obj));
                        }
                    } else {
                        jSONArray.put(LJ((JavaOnlyMap) obj));
                    }
                } else {
                    jSONArray.put(LIZLLL((JavaOnlyArray) obj));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("revertJavaOnlyArray2JSONArray ");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            }
        }
        return jSONArray;
    }

    public static JSONObject LJ(JavaOnlyMap javaOnlyMap) {
        boolean z;
        int i;
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap != null && !javaOnlyMap.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return jSONObject;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = javaOnlyMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Object obj = javaOnlyMap.get(strNextKey);
            try {
                ReadableType type = javaOnlyMap.getType(strNextKey);
                if (type != null) {
                    i = C1297630js9.LIZ[type.ordinal()];
                } else {
                    i = -1;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                jSONObject.putOpt(strNextKey, obj);
                            } else {
                                jSONObject.put(strNextKey, C1299060juS.LIZIZ((PiperData) obj));
                            }
                        } else {
                            jSONObject.put(strNextKey, LIZJ((Number) obj));
                        }
                    } else {
                        jSONObject.putOpt(strNextKey, LJ((JavaOnlyMap) obj));
                    }
                } else {
                    jSONObject.putOpt(strNextKey, LIZLLL((JavaOnlyArray) obj));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("revertJavaOnlyMap2JSONObject ");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            }
        }
        return jSONObject;
    }
}
