package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.services.IUtilsService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS232S0300000_23;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549610qQZ {
    public static final C1549610qQZ LIZ = new C1549610qQZ();

    public static Map LIZJ(JSONObject jSONObject, Function1 function1) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, function1.invoke(new Pair(next, jSONObject.opt(next))));
        }
        return map;
    }

    public static Object LIZLLL(Class cls, C1549490qQN c1549490qQN) {
        if (Intrinsics.LJFF(cls, Number.class)) {
            int i = C1549720qQk.LIZ[c1549490qQN.LJI.LIZ.ordinal()];
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

    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0090 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1549520qQQ LJ(X.C1549520qQQ r8, org.json.JSONObject r9) throws X.C1549560qQU, org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549610qQZ.LJ(X.0qQQ, org.json.JSONObject):X.0qQQ");
    }

    public static Object LIZ(C1549180qPs c1549180qPs, C1549490qQN c1549490qQN, Object obj) {
        C13IQ<? extends XBaseModel> c13iq;
        C13IQ<? extends XBaseModel> c13iq2;
        boolean z = obj instanceof JSONObject;
        C13IQ<? extends XBaseModel> c13iq3 = null;
        clsLIZ = null;
        Class clsLIZ = null;
        if (z) {
            if (c1549490qQN != null) {
                c13iq = c1549490qQN.LIZJ;
            } else {
                c13iq = null;
            }
            if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C1467105oj.class))) {
                if (c1549490qQN != null && (c13iq2 = c1549490qQN.LIZJ) != null) {
                    clsLIZ = C09R7.LIZ(c13iq2);
                }
                return LJFF(clsLIZ, (JSONObject) obj, c1549180qPs);
            }
        }
        if (obj instanceof JSONArray) {
            if (c1549490qQN != null) {
                c13iq3 = c1549490qQN.LIZJ;
            }
            if (!Intrinsics.LJFF(c13iq3, C13LE.LIZ(C1467105oj.class))) {
                return C189000o4.LIZ((JSONArray) obj, new AwS232S0300000_23(c1549180qPs, c1549490qQN, obj, 11));
            }
            C1543800qHC.LIZ.getClass();
            C587540N2q.LIZ.getClass();
            return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).jsonToList((JSONArray) obj);
        }
        if (z) {
            C1543800qHC.LIZ.getClass();
            return C1543800qHC.LIZIZ((JSONObject) obj);
        }
        if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject, C1549520qQQ c1549520qQQ, C1549180qPs c1549180qPs) throws JSONException {
        Object objOpt;
        if (c1549520qQQ == null) {
            return null;
        }
        HashMap<String, C1549490qQN> map = c1549520qQQ.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object objOpt2 = jSONObject.opt(((C1549490qQN) entry.getValue()).LIZIZ);
            if ((objOpt2 == null || Intrinsics.LJFF(objOpt2, JSONObject.NULL)) && ((C1549490qQN) entry.getValue()).LJI.LIZ != DefaultType.NONE) {
                C1549610qQZ c1549610qQZ = LIZ;
                Class<?> cls = ((C1549490qQN) entry.getValue()).LJII;
                C1549490qQN c1549490qQN = (C1549490qQN) entry.getValue();
                c1549610qQZ.getClass();
                jSONObject.put(((C1549490qQN) entry.getValue()).LIZIZ, LIZLLL(cls, c1549490qQN));
            }
            if (!Intrinsics.LJFF(((C1549490qQN) entry.getValue()).LIZJ, C13LE.LIZ(C1467105oj.class)) && (objOpt2 instanceof JSONObject)) {
                C1549610qQZ c1549610qQZ2 = LIZ;
                C1549520qQQ c1549520qQQ2 = c1549180qPs.LJ.get(C09R7.LIZ(((C1549490qQN) entry.getValue()).LIZJ));
                c1549610qQZ2.getClass();
                objOpt = LIZIZ((JSONObject) objOpt2, c1549520qQQ2, c1549180qPs);
            } else if (!Intrinsics.LJFF(((C1549490qQN) entry.getValue()).LIZJ, C13LE.LIZ(C1467105oj.class)) && (objOpt2 instanceof JSONArray)) {
                objOpt = C189000o4.LIZ((JSONArray) objOpt2, new AwS389S0200000_23(c1549180qPs, (C1549180qPs) entry, (Map.Entry<String, C1549490qQN>) 24));
            } else {
                objOpt = jSONObject.opt(((C1549490qQN) entry.getValue()).LIZIZ);
            }
            linkedHashMap.put(key, objOpt);
        }
        return new JSONObject(linkedHashMap);
    }

    public static Object LJFF(final Class cls, final JSONObject jSONObject, final C1549180qPs c1549180qPs) {
        final C1549520qQQ c1549520qQQLJ;
        if (cls == null || (c1549520qQQLJ = LJ(c1549180qPs.LJ.get(cls), jSONObject)) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0qQb
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                String str;
                if (Intrinsics.LJFF(method.getName(), "toJSON")) {
                    C1549610qQZ c1549610qQZ = C1549610qQZ.LIZ;
                    JSONObject jSONObject2 = jSONObject;
                    C1549520qQQ c1549520qQQ = c1549180qPs.LJ.get(cls);
                    C1549180qPs c1549180qPs2 = c1549180qPs;
                    c1549610qQZ.getClass();
                    return C1549610qQZ.LIZIZ(jSONObject2, c1549520qQQ, c1549180qPs2);
                }
                if (Intrinsics.LJFF(method.getName(), "toString")) {
                    return C786410Ut5.J3(jSONObject);
                }
                C1549490qQN c1549490qQN = c1549520qQQLJ.LIZ.get(method);
                JSONObject jSONObject3 = jSONObject;
                if (c1549490qQN != null) {
                    str = c1549490qQN.LIZIZ;
                } else {
                    str = null;
                }
                Object objOpt = jSONObject3.opt(str);
                C1549610qQZ c1549610qQZ2 = C1549610qQZ.LIZ;
                C1549180qPs c1549180qPs3 = c1549180qPs;
                c1549610qQZ2.getClass();
                return C1549610qQZ.LIZ(c1549180qPs3, c1549490qQN, objOpt);
            }
        });
    }
}
