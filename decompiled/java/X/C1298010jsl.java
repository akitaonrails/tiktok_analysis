package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298010jsl {
    public static JavaOnlyArray LIZIZ(List list) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (list == null) {
            return javaOnlyArray;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object objLIZLLL = LIZLLL(it2.next());
            if (objLIZLLL == null) {
                javaOnlyArray.pushNull();
            } else if (objLIZLLL instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) objLIZLLL).booleanValue());
            } else if (objLIZLLL instanceof Integer) {
                javaOnlyArray.pushInt(((Integer) objLIZLLL).intValue());
            } else if (objLIZLLL instanceof Double) {
                javaOnlyArray.pushDouble(((Double) objLIZLLL).doubleValue());
            } else if (objLIZLLL instanceof String) {
                javaOnlyArray.pushString((String) objLIZLLL);
            } else if (objLIZLLL instanceof JavaOnlyArray) {
                javaOnlyArray.pushArray((JavaOnlyArray) objLIZLLL);
            } else if (objLIZLLL instanceof JavaOnlyMap) {
                javaOnlyArray.pushMap((JavaOnlyMap) objLIZLLL);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not convert ");
                sbLIZ.append(objLIZLLL.getClass());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LIZJ(Map<String, Object> map) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (map == null) {
            return javaOnlyMap;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            LIZ(javaOnlyMap, entry.getKey(), entry.getValue());
        }
        return javaOnlyMap;
    }

    public static Object LIZLLL(final Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Float) && !(obj instanceof Long) && !(obj instanceof Byte) && !(obj instanceof Short)) {
            if (obj.getClass().isArray()) {
                return LIZIZ(new AbstractList() { // from class: X.0jsm
                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public final int size() {
                        return Array.getLength(obj);
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public final Object get(int i) {
                        return Array.get(obj, i);
                    }
                });
            }
            if (obj instanceof List) {
                return LIZIZ((List) obj);
            }
            if (obj instanceof Map) {
                return LIZJ((Map) obj);
            }
            if (obj instanceof Bundle) {
                BaseBundle baseBundle = (BaseBundle) obj;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                for (String str : baseBundle.keySet()) {
                    try {
                        obj2 = baseBundle.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj2 = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj2 = null;
                    }
                    LIZ(javaOnlyMap, str, obj2);
                }
                return javaOnlyMap;
            }
            return obj;
        }
        return Double.valueOf(((Number) obj).doubleValue());
    }

    public static void LIZ(JavaOnlyMap javaOnlyMap, String str, Object obj) {
        Object objLIZLLL = LIZLLL(obj);
        if (objLIZLLL == null) {
            javaOnlyMap.putNull(str);
            return;
        }
        if (objLIZLLL instanceof Boolean) {
            javaOnlyMap.putBoolean(str, ((Boolean) objLIZLLL).booleanValue());
            return;
        }
        if (objLIZLLL instanceof Integer) {
            javaOnlyMap.putInt(str, ((Integer) objLIZLLL).intValue());
            return;
        }
        if (objLIZLLL instanceof Number) {
            javaOnlyMap.putDouble(str, ((Number) objLIZLLL).doubleValue());
            return;
        }
        if (objLIZLLL instanceof String) {
            javaOnlyMap.putString(str, (String) objLIZLLL);
            return;
        }
        if (objLIZLLL instanceof JavaOnlyArray) {
            javaOnlyMap.putArray(str, (JavaOnlyArray) objLIZLLL);
        } else {
            if (objLIZLLL instanceof JavaOnlyMap) {
                javaOnlyMap.putMap(str, (JavaOnlyMap) objLIZLLL);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not convert ");
            sbLIZ.append(objLIZLLL.getClass());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
