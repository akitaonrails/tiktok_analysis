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
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549580qQW implements InterfaceC1544510qIL<ReadableMap> {
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
        return C1543800qHC.LIZ(map);
    }

    public static final Object LJFF(Method method, InterfaceC1549470qQL interfaceC1549470qQL) {
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.LJFF(returnType, Number.class)) {
            int i = C1549700qQi.LIZ[interfaceC1549470qQL.defaultValue().type().ordinal()];
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
    public final Map LIZIZ(Class cls, Object obj) throws C1549560qQU {
        String containerID;
        HashMap<String, Object> hashMap;
        HashMap<String, Pair<Method, InterfaceC1549470qQL>> mapLJI;
        InterfaceC1549470qQL second;
        ConcurrentHashMap<Class<? extends InterfaceC1063710dmr>, C1549180qPs> concurrentHashMap;
        C1549180qPs c1549180qPs;
        ReadableMap readableMap = (ReadableMap) obj;
        InterfaceC634840OvC interfaceC634840OvC = this.LIZ;
        LinkedHashMap linkedHashMap = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1549460qQK c1549460qQKLIZ = C1543810qHD.LIZ(containerID);
        if (c1549460qQKLIZ != null && (concurrentHashMap = c1549460qQKLIZ.LIZIZ) != null && (c1549180qPs = concurrentHashMap.get(cls)) != null) {
            HashMap<String, Object> hashMap2 = readableMap.toHashMap();
            C1549520qQQ c1549520qQQLJ = C1549600qQY.LJ(c1549180qPs.LIZJ, hashMap2);
            if (c1549520qQQLJ != null) {
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(hashMap2.size()));
                Iterator<T> it2 = hashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), C1549600qQY.LIZ(c1549180qPs, c1549520qQQLJ.LIZIZ.get(entry.getKey()), entry.getValue()));
                }
            }
        } else {
            System.out.println((Object) "idl ReadableMap->Map. no cache");
            Class<? extends XBaseModel> clsLIZ = C1549670qQf.LIZ(cls);
            if (clsLIZ != null && (mapLJI = LJI(clsLIZ, (hashMap = readableMap.toHashMap()))) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(hashMap.size()));
                Iterator<T> it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    Object key = entry2.getKey();
                    Pair<Method, InterfaceC1549470qQL> pair = mapLJI.get(entry2.getKey());
                    if (pair != null) {
                        second = pair.getSecond();
                    } else {
                        second = null;
                    }
                    linkedHashMap2.put(key, LIZJ(entry2.getValue(), second));
                }
                return linkedHashMap2;
            }
        }
        return linkedHashMap;
    }

    public final Object LIZJ(Object obj, InterfaceC1549470qQL interfaceC1549470qQL) {
        C19719912Dl c19719912DlLIZ;
        Class<? extends XBaseModel> clsNestedClassType;
        C19719912Dl c19719912DlLIZ2;
        Class<? extends XBaseModel> clsNestedClassType2 = null;
        if (obj instanceof Map) {
            if (interfaceC1549470qQL != null) {
                c19719912DlLIZ2 = C13LE.LIZ(interfaceC1549470qQL.nestedClassType());
            } else {
                c19719912DlLIZ2 = null;
            }
            if (!Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1467105oj.class))) {
                if (interfaceC1549470qQL != null) {
                    clsNestedClassType2 = interfaceC1549470qQL.nestedClassType();
                }
                return LJII(clsNestedClassType2, ((ReadableMap) obj).toHashMap());
            }
        }
        if (obj instanceof List) {
            if (interfaceC1549470qQL != null) {
                c19719912DlLIZ = C13LE.LIZ(interfaceC1549470qQL.nestedClassType());
            } else {
                c19719912DlLIZ = null;
            }
            if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1467105oj.class))) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Object obj2 : list) {
                    if (interfaceC1549470qQL != null) {
                        clsNestedClassType = interfaceC1549470qQL.nestedClassType();
                    } else {
                        clsNestedClassType = null;
                    }
                    arrayList.add(LJII(clsNestedClassType, ((ReadableMap) obj2).toHashMap()));
                }
                return arrayList;
            }
        }
        C1543800qHC.LIZ.getClass();
        C587540N2q.LIZ.getClass();
        return ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.HashMap] */
    public final HashMap<String, Object> LJ(Class<? extends XBaseModel> cls, HashMap<String, Object> map) {
        Method[] declaredMethods;
        ?? arrayList;
        HashMap map2 = null;
        map2 = null;
        if (cls != null && (declaredMethods = cls.getDeclaredMethods()) != null) {
            ArrayList<Method> arrayList2 = new ArrayList();
            for (Method method : declaredMethods) {
                InterfaceC1549470qQL interfaceC1549470qQL = (InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class);
                if (interfaceC1549470qQL != null && interfaceC1549470qQL.isGetter()) {
                    arrayList2.add(method);
                }
            }
            map2 = new HashMap();
            for (Method method2 : arrayList2) {
                InterfaceC1549470qQL interfaceC1549470qQL2 = (InterfaceC1549470qQL) method2.getAnnotation(InterfaceC1549470qQL.class);
                Object obj = map.get(interfaceC1549470qQL2.keyPath());
                if (obj == null && interfaceC1549470qQL2.defaultValue().type() != DefaultType.NONE) {
                    map.put(interfaceC1549470qQL2.keyPath(), LJFF(method2, interfaceC1549470qQL2));
                }
                String strKeyPath = interfaceC1549470qQL2.keyPath();
                if (!Intrinsics.LJFF(C13LE.LIZ(interfaceC1549470qQL2.nestedClassType()), C13LE.LIZ(C1467105oj.class)) && (obj instanceof ReadableMap)) {
                    arrayList = LJ(interfaceC1549470qQL2.nestedClassType(), ((ReadableMap) obj).toHashMap());
                } else if (!Intrinsics.LJFF(C13LE.LIZ(interfaceC1549470qQL2.nestedClassType()), C13LE.LIZ(C1467105oj.class)) && (obj instanceof ReadableArray)) {
                    ArrayList<Object> arrayList3 = ((ReadableArray) obj).toArrayList();
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator<Object> it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(LJ(interfaceC1549470qQL2.nestedClassType(), ((ReadableMap) it2.next()).toHashMap()));
                    }
                } else {
                    arrayList = map.get(interfaceC1549470qQL2.keyPath());
                }
                map2.put(strKeyPath, arrayList);
            }
        }
        return map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, kotlin.Pair<java.lang.reflect.Method, X.InterfaceC1549470qQL>> LJI(java.lang.Class<? extends com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel> r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) throws X.C1549560qQU {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549580qQW.LJI(java.lang.Class, java.util.HashMap):java.util.HashMap");
    }

    public final Object LJII(final Class<? extends XBaseModel> cls, final HashMap<String, Object> map) {
        if (cls == null || LJI(cls, map) == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: X.0qQd
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (Intrinsics.LJFF(method.getName(), "toJSON")) {
                    return new JSONObject(this.LL.LJ(cls, map));
                }
                if (Intrinsics.LJFF(method.getName(), "toString")) {
                    return map.toString();
                }
                InterfaceC1549470qQL interfaceC1549470qQL = (InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class);
                return this.LL.LIZJ(map.get(interfaceC1549470qQL.keyPath()), interfaceC1549470qQL);
            }
        });
    }
}
