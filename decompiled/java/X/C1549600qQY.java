package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.services.IUtilsService;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549600qQY {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ(Object obj) throws C1549560qQU {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new C1549560qQU("the key is null");
        }
        throw new C1549560qQU("the key is not a number");
    }

    public static Object LIZLLL(Class cls, C1549490qQN c1549490qQN) {
        if (Intrinsics.LJFF(cls, Number.class)) {
            int i = C1549690qQh.LIZ[c1549490qQN.LJI.LIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Integer.valueOf(c1549490qQN.LJI.LIZLLL);
                    }
                    return Integer.valueOf(c1549490qQN.LJI.LIZLLL);
                }
                return Long.valueOf(c1549490qQN.LJI.LJFF);
            }
            return Double.valueOf(c1549490qQN.LJI.LIZIZ);
        }
        if (!Intrinsics.LJFF(cls, Boolean.TYPE) && !Intrinsics.LJFF(cls, Boolean.class)) {
            return c1549490qQN.LJI.LIZJ;
        }
        return Boolean.valueOf(c1549490qQN.LJI.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1549520qQQ LJ(X.C1549520qQQ r9, java.util.HashMap r10) throws X.C1549560qQU {
        /*
            Method dump skipped, instruction units count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549600qQY.LJ(X.0qQQ, java.util.HashMap):X.0qQQ");
    }

    public static Object LIZ(C1549180qPs c1549180qPs, C1549490qQN c1549490qQN, Object obj) {
        C13IQ<? extends XBaseModel> c13iq;
        Object value;
        Class clsLIZ;
        C13IQ<? extends XBaseModel> c13iq2;
        C13IQ<? extends XBaseModel> c13iq3;
        C13IQ<? extends XBaseModel> c13iq4;
        Class clsLIZ2 = null;
        if (obj instanceof Map) {
            if (c1549490qQN != null) {
                c13iq3 = c1549490qQN.LIZJ;
            } else {
                c13iq3 = null;
            }
            if (!Intrinsics.LJFF(c13iq3, C13LE.LIZ(C1467105oj.class))) {
                if (c1549490qQN != null && (c13iq4 = c1549490qQN.LIZJ) != null) {
                    clsLIZ2 = C09R7.LIZ(c13iq4);
                }
                return LJFF(clsLIZ2, ((ReadableMap) obj).toHashMap(), c1549180qPs);
            }
        }
        if (obj instanceof List) {
            if (c1549490qQN != null) {
                c13iq = c1549490qQN.LIZJ;
            } else {
                c13iq = null;
            }
            if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C1467105oj.class))) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Object obj2 : list) {
                    if (obj2 instanceof ReadableMap) {
                        if (c1549490qQN != null && (c13iq2 = c1549490qQN.LIZJ) != null) {
                            clsLIZ = C09R7.LIZ(c13iq2);
                        } else {
                            clsLIZ = null;
                        }
                        value = LJFF(clsLIZ, ((ReadableMap) obj2).toHashMap(), c1549180qPs);
                    } else {
                        C1543800qHC.LIZ.getClass();
                        C587540N2q.LIZ.getClass();
                        value = ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).getValue(obj2);
                    }
                    arrayList.add(value);
                }
                return arrayList;
            }
        }
        C1543800qHC.LIZ.getClass();
        C587540N2q.LIZ.getClass();
        return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    public static Map LIZJ(HashMap map, C1549520qQQ c1549520qQQ, C1549180qPs c1549180qPs) {
        ?? arrayList;
        if (c1549520qQQ == null) {
            return null;
        }
        HashMap<String, C1549490qQN> map2 = c1549520qQQ.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object obj = map.get(((C1549490qQN) entry.getValue()).LIZIZ);
            if (obj == null && ((C1549490qQN) entry.getValue()).LJI.LIZ != DefaultType.NONE) {
                map.put(((C1549490qQN) entry.getValue()).LIZIZ, LIZLLL(((C1549490qQN) entry.getValue()).LJII, (C1549490qQN) entry.getValue()));
            }
            if (!Intrinsics.LJFF(((C1549490qQN) entry.getValue()).LIZJ, C13LE.LIZ(C1467105oj.class)) && (obj instanceof ReadableMap)) {
                arrayList = LIZJ(((ReadableMap) obj).toHashMap(), c1549180qPs.LJ.get(C09R7.LIZ(((C1549490qQN) entry.getValue()).LIZJ)), c1549180qPs);
            } else if (!Intrinsics.LJFF(((C1549490qQN) entry.getValue()).LIZJ, C13LE.LIZ(C1467105oj.class)) && (obj instanceof ReadableArray)) {
                ArrayList<Object> arrayList2 = ((ReadableArray) obj).toArrayList();
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator<Object> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(LIZJ(((ReadableMap) it3.next()).toHashMap(), c1549180qPs.LJ.get(C09R7.LIZ(((C1549490qQN) entry.getValue()).LIZJ)), c1549180qPs));
                }
            } else {
                arrayList = map.get(((C1549490qQN) entry.getValue()).LIZIZ);
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }

    public static Object LJFF(final Class cls, final HashMap map, final C1549180qPs c1549180qPs) {
        final C1549520qQQ c1549520qQQLJ;
        if (cls == null || (c1549520qQQLJ = LJ(c1549180qPs.LJ.get(cls), map)) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0qQa
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                String str;
                if (Intrinsics.LJFF(method.getName(), "toJSON")) {
                    return new JSONObject(C1549600qQY.LIZJ(map, c1549180qPs.LJ.get(cls), c1549180qPs));
                }
                if (Intrinsics.LJFF(method.getName(), "toString")) {
                    return map.toString();
                }
                C1549490qQN c1549490qQN = c1549520qQQLJ.LIZ.get(method);
                HashMap<String, Object> map2 = map;
                if (c1549490qQN != null) {
                    str = c1549490qQN.LIZIZ;
                } else {
                    str = null;
                }
                return C1549600qQY.LIZ(c1549180qPs, c1549490qQN, map2.get(str));
            }
        });
    }
}
