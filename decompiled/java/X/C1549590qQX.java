package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.services.IUtilsService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549590qQX implements InterfaceC1544510qIL<JSONObject> {
    public InterfaceC634840OvC LIZ;

    public static final int LIZLLL(Object obj) throws C1549560qQU {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new C1549560qQU("the key is null");
        }
        throw new C1549560qQU("the key is not a number");
    }

    @Override // X.InterfaceC1544510qIL
    public final Object LIZ(Map map) {
        C1543800qHC.LIZ.getClass();
        return C1543800qHC.LIZJ(map);
    }

    public static Map LJFF(JSONObject jSONObject, Function1 function1) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, function1.invoke(new Pair(next, jSONObject.opt(next))));
        }
        return map;
    }

    public static final Object LJI(Method method, InterfaceC1549470qQL interfaceC1549470qQL) {
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.LJFF(returnType, Number.class)) {
            int i = C1549710qQj.LIZ[interfaceC1549470qQL.defaultValue().type().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return Integer.valueOf(interfaceC1549470qQL.defaultValue().intValue());
                    }
                    return Integer.valueOf(interfaceC1549470qQL.defaultValue().intValue());
                }
                return Long.valueOf(interfaceC1549470qQL.defaultValue().longValue());
            }
            return Double.valueOf(interfaceC1549470qQL.defaultValue().doubleValue());
        }
        if (!Intrinsics.LJFF(returnType, Boolean.TYPE) && !Intrinsics.LJFF(returnType, Boolean.class)) {
            return interfaceC1549470qQL.defaultValue().stringValue();
        }
        return Boolean.valueOf(interfaceC1549470qQL.defaultValue().boolValue());
    }

    @Override // X.InterfaceC1544510qIL
    public final Map LIZIZ(Class cls, Object obj) throws C1549560qQU, JSONException {
        String containerID;
        HashMap<String, Pair<Method, InterfaceC1549470qQL>> mapLJII;
        ConcurrentHashMap<Class<? extends InterfaceC1063710dmr>, C1549180qPs> concurrentHashMap;
        C1549180qPs c1549180qPs;
        JSONObject jSONObject = (JSONObject) obj;
        InterfaceC634840OvC interfaceC634840OvC = this.LIZ;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1549460qQK c1549460qQKLIZ = C1543810qHD.LIZ(containerID);
        if (c1549460qQKLIZ != null && (concurrentHashMap = c1549460qQKLIZ.LIZIZ) != null && (c1549180qPs = concurrentHashMap.get(cls)) != null) {
            C1549610qQZ.LIZ.getClass();
            C1549520qQQ c1549520qQQLJ = C1549610qQZ.LJ(c1549180qPs.LIZJ, jSONObject);
            if (c1549520qQQLJ == null) {
                return null;
            }
            return C1549610qQZ.LIZJ(jSONObject, new AwS389S0200000_23(c1549520qQQLJ, c1549180qPs, 25));
        }
        Class<? extends XBaseModel> clsLIZ = C1549670qQf.LIZ(cls);
        if (clsLIZ == null || (mapLJII = LJII(clsLIZ, jSONObject)) == null) {
            return null;
        }
        return LJFF(jSONObject, new AwS389S0200000_23((HashMap) mapLJII, (HashMap<String, Pair<Method, InterfaceC1549470qQL>>) this, (C1549590qQX) 23));
    }

    public final Object LIZJ(Object obj, InterfaceC1549470qQL interfaceC1549470qQL) {
        C19719912Dl c19719912DlLIZ;
        boolean z = obj instanceof JSONObject;
        C19719912Dl c19719912DlLIZ2 = null;
        Class<? extends XBaseModel> clsNestedClassType = null;
        if (z) {
            if (interfaceC1549470qQL != null) {
                c19719912DlLIZ = C13LE.LIZ(interfaceC1549470qQL.nestedClassType());
            } else {
                c19719912DlLIZ = null;
            }
            if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1467105oj.class))) {
                if (interfaceC1549470qQL != null) {
                    clsNestedClassType = interfaceC1549470qQL.nestedClassType();
                }
                return LJIIIIZZ(clsNestedClassType, (JSONObject) obj);
            }
        }
        if (obj instanceof JSONArray) {
            if (interfaceC1549470qQL != null) {
                c19719912DlLIZ2 = C13LE.LIZ(interfaceC1549470qQL.nestedClassType());
            }
            if (!Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1467105oj.class))) {
                return C189000o4.LIZ((JSONArray) obj, new AwS389S0200000_23(this, interfaceC1549470qQL, 21));
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

    public final JSONObject LJ(Class<? extends XBaseModel> cls, JSONObject jSONObject) throws JSONException {
        Method[] declaredMethods;
        Object objOpt;
        if (cls != null && (declaredMethods = cls.getDeclaredMethods()) != null) {
            ArrayList<Method> arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                InterfaceC1549470qQL interfaceC1549470qQL = (InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class);
                if (interfaceC1549470qQL != null && interfaceC1549470qQL.isGetter()) {
                    arrayList.add(method);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            for (Method method2 : arrayList) {
                InterfaceC1549470qQL interfaceC1549470qQL2 = (InterfaceC1549470qQL) method2.getAnnotation(InterfaceC1549470qQL.class);
                Object objOpt2 = jSONObject.opt(interfaceC1549470qQL2.keyPath());
                if ((objOpt2 == null || Intrinsics.LJFF(objOpt2, JSONObject.NULL)) && interfaceC1549470qQL2.defaultValue().type() != DefaultType.NONE) {
                    jSONObject.put(interfaceC1549470qQL2.keyPath(), LJI(method2, interfaceC1549470qQL2));
                }
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(interfaceC1549470qQL2.nestedClassType());
                String strKeyPath = interfaceC1549470qQL2.keyPath();
                if (!Intrinsics.LJFF(C13LE.LIZ(interfaceC1549470qQL2.nestedClassType()), C13LE.LIZ(C1467105oj.class)) && (objOpt2 instanceof JSONObject)) {
                    objOpt = LJ(C09R7.LIZ(c19719912DlLIZ), (JSONObject) objOpt2);
                } else if (!Intrinsics.LJFF(C13LE.LIZ(interfaceC1549470qQL2.nestedClassType()), C13LE.LIZ(C1467105oj.class)) && (objOpt2 instanceof JSONArray)) {
                    objOpt = C189000o4.LIZ((JSONArray) objOpt2, new AwS389S0200000_23(this, c19719912DlLIZ, 22));
                } else {
                    objOpt = jSONObject.opt(interfaceC1549470qQL2.keyPath());
                }
                jSONObject2.put(strKeyPath, objOpt);
            }
            return jSONObject2;
        }
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00b7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.reflect.Method, X.InterfaceC1549470qQL>> LJII(java.lang.Class<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r9, org.json.JSONObject r10) throws X.C1549560qQU, org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549590qQX.LJII(java.lang.Class, org.json.JSONObject):java.util.HashMap");
    }

    public final Object LJIIIIZZ(final Class<? extends XBaseModel> cls, final JSONObject jSONObject) {
        if (cls == null || LJII(cls, jSONObject) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0qQe
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (Intrinsics.LJFF(method.getName(), "toJSON")) {
                    return this.LL.LJ(cls, jSONObject);
                }
                if (Intrinsics.LJFF(method.getName(), "toString")) {
                    return C786410Ut5.J3(jSONObject);
                }
                InterfaceC1549470qQL interfaceC1549470qQL = (InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class);
                return this.LL.LIZJ(jSONObject.opt(interfaceC1549470qQL.keyPath()), interfaceC1549470qQL);
            }
        });
    }
}
