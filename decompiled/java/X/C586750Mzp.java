package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.ECMMKGlobalContextCallback;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Mzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586750Mzp {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0NfZ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0NfZ] */
    public static C599670NfZ LIZ(EnumC586720Mzm enumC586720Mzm) {
        if (C586730Mzn.LIZ[enumC586720Mzm.ordinal()] == 1) {
            return new InterfaceC599750Nfh() { // from class: X.0NfZ
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(493));
                public final AtomicInteger LIZIZ = new AtomicInteger(LSPassThroughRecordSizeConfig.DEFAULT);

                public final ConcurrentHashMap<String, Object> LJIIJ() {
                    return (ConcurrentHashMap) this.LIZ.getValue();
                }

                @Override // X.InterfaceC599750Nfh
                public final JavaOnlyMap LIZ() {
                    IECommerceHostService iECommerceHostService;
                    C599710Nfd c599710Nfd;
                    Map map;
                    IECommerceHostService iECommerceHostService2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        if (!Intrinsics.LJFF("local_test", ((IApplicationDependencyService) iECommerceHostService2).getChannel())) {
                            return null;
                        }
                    }
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    for (Map.Entry<String, Object> entry : LJIIJ().entrySet()) {
                        if (entry.getValue() instanceof C599710Nfd) {
                            Object value = entry.getValue();
                            if ((value instanceof C599710Nfd) && (c599710Nfd = (C599710Nfd) value) != null) {
                                javaOnlyMap.put(entry.getKey(), c599710Nfd.LIZ);
                            }
                        } else if (entry.getValue() instanceof Map) {
                            Object value2 = entry.getValue();
                            if (C19719512Dh.LJII(value2) && (map = (Map) value2) != null) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                LJIIIZ(map, linkedHashMap);
                                javaOnlyMap.put(entry.getKey(), linkedHashMap);
                            }
                        }
                    }
                    return javaOnlyMap;
                }

                @Override // X.InterfaceC599750Nfh
                public final void release() {
                    LJIIJ().clear();
                }

                public final JavaOnlyArray LJI(Object[] objArr) {
                    Object c098200Yq;
                    Object c098200Yq2;
                    Map<String, ? extends Object> map;
                    Object c098200Yq3;
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    for (Object obj : objArr) {
                        if (obj instanceof List) {
                            try {
                                c098200Yq = Boolean.valueOf(javaOnlyArray.add(LJII((List) obj)));
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
                                c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LJIIIIZZ(map)));
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            C189200o6.m1boximpl(c098200Yq2);
                        } else if (obj instanceof Object[]) {
                            try {
                                c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LJI((Object[]) obj)));
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

                public final JavaOnlyArray LJII(List<?> list) {
                    Object c098200Yq;
                    Object c098200Yq2;
                    Map<String, ? extends Object> map;
                    Object c098200Yq3;
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = ListProtector.get(list, i);
                        if (obj instanceof List) {
                            try {
                                c098200Yq = Boolean.valueOf(javaOnlyArray.add(LJII((List) obj)));
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
                                c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LJIIIIZZ(map)));
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            C189200o6.m1boximpl(c098200Yq2);
                        } else if (obj instanceof Object[]) {
                            try {
                                c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LJI((Object[]) obj)));
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

                public final JavaOnlyMap LJIIIIZZ(Map<String, ? extends Object> map) {
                    Object c098200Yq;
                    Object c098200Yq2;
                    Map<String, ? extends Object> map2;
                    Object c098200Yq3;
                    if (map == null) {
                        return new JavaOnlyMap();
                    }
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj instanceof List) {
                            try {
                                javaOnlyMap.put(str, LJII((List) obj));
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
                                javaOnlyMap.put(str, LJIIIIZZ(map2));
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
                                javaOnlyMap.put(str, LJI((Object[]) obj));
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

                public final C599710Nfd LJIIJJI(String str) {
                    if (!a0.LJJIIZI(str, e3.d, false)) {
                        Object obj = LJIIJ().get(str);
                        if (!(obj instanceof C599710Nfd)) {
                            return null;
                        }
                        return (C599710Nfd) obj;
                    }
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    Map mapLIZJ = C19719512Dh.LIZJ(LJIIJ());
                    int size = listLJJLIIIJILLIZJL.size() - 1;
                    for (int i = 0; i < size; i++) {
                        Object obj2 = mapLIZJ.get(ListProtector.get(listLJJLIIIJILLIZJL, i));
                        if (obj2 instanceof C599710Nfd) {
                            obj2 = ((C599710Nfd) obj2).LIZ;
                        }
                        if (!C19719512Dh.LJII(obj2) || (mapLIZJ = (Map) obj2) == null) {
                            return null;
                        }
                    }
                    Object obj3 = mapLIZJ.get(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
                    if (obj3 instanceof C599710Nfd) {
                        return (C599710Nfd) obj3;
                    }
                    return new C599710Nfd(obj3, new HashMap());
                }

                @Override // X.InterfaceC599750Nfh
                public final void setData(Map map) {
                    for (Map.Entry entry : map.entrySet()) {
                        LJ((String) entry.getKey(), entry.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                    }
                }

                public static void LJIIIZ(Map map, Map map2) {
                    C599710Nfd c599710Nfd;
                    Object obj;
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() instanceof Map) {
                            map2.put(entry.getKey(), new LinkedHashMap());
                            LJIIIZ(map, map2);
                        } else if (entry.getValue() instanceof C599710Nfd) {
                            Object value = entry.getValue();
                            if ((value instanceof C599710Nfd) && (c599710Nfd = (C599710Nfd) value) != null && (obj = c599710Nfd.LIZ) != null) {
                                map2.put(entry.getKey(), obj);
                            }
                        }
                    }
                }

                public final void LJIIL(String str, C599710Nfd c599710Nfd) {
                    if (!a0.LJJIIZI(str, e3.d, false)) {
                        LJIIJ().put(str, c599710Nfd);
                        return;
                    }
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    Map mapLJIIJ = LJIIJ();
                    int size = listLJJLIIIJILLIZJL.size() - 1;
                    for (int i = 0; i < size; i++) {
                        Object obj = ListProtector.get(listLJJLIIIJILLIZJL, i);
                        Object concurrentHashMap = mapLJIIJ.get(obj);
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                            mapLJIIJ.put(obj, concurrentHashMap);
                        }
                        mapLJIIJ = C19719512Dh.LIZJ(concurrentHashMap);
                    }
                    mapLJIIJ.put(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL), c599710Nfd);
                }

                @Override // X.InterfaceC599750Nfh
                public final Object LIZLLL(String str, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                    Object obj;
                    C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                    if (c599710NfdLJIIJJI != null) {
                        obj = c599710NfdLJIIJJI.LIZ;
                    } else {
                        obj = null;
                    }
                    if (a0.LJJJIL(str)) {
                        C1771980wDE.LJFF(EnumC599640NfW.GET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                    }
                    return obj;
                }

                @Override // X.InterfaceC599750Nfh
                public final JavaOnlyMap LJFF(List list, EnumC599720Nfe enumC599720Nfe, Map map) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                        if (c599710NfdLJIIJJI != null) {
                            javaOnlyMap.put(str, c599710NfdLJIIJJI.LIZ);
                        }
                        if (a0.LJJJIL(str)) {
                            C1771980wDE.LJFF(EnumC599640NfW.GET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                        }
                    }
                    if (javaOnlyMap.isEmpty()) {
                        return null;
                    }
                    return javaOnlyMap;
                }

                @Override // X.InterfaceC599750Nfh
                public final String LIZIZ(String str, Object obj, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                    C599710Nfd c599710Nfd;
                    HashMap<String, Object> map2;
                    String strValueOf;
                    Object objPutIfAbsent;
                    if (obj == null) {
                        return null;
                    }
                    if (!a0.LJJIIZI(str, e3.d, false)) {
                        ConcurrentHashMap<String, Object> concurrentHashMapLJIIJ = LJIIJ();
                        Object c599710Nfd2 = concurrentHashMapLJIIJ.get(str);
                        if (c599710Nfd2 == null && (objPutIfAbsent = concurrentHashMapLJIIJ.putIfAbsent(str, (c599710Nfd2 = new C599710Nfd(null, new HashMap())))) != null) {
                            c599710Nfd2 = objPutIfAbsent;
                        }
                        if (c599710Nfd2 instanceof C599710Nfd) {
                            c599710Nfd = (C599710Nfd) c599710Nfd2;
                        } else {
                            c599710Nfd = null;
                        }
                    } else {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                        Map mapLJIIJ = LJIIJ();
                        int size = listLJJLIIIJILLIZJL.size() - 1;
                        for (int i = 0; i < size; i++) {
                            Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, i);
                            Object concurrentHashMap = mapLJIIJ.get(obj2);
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                                mapLJIIJ.put(obj2, concurrentHashMap);
                            }
                            mapLJIIJ = C19719512Dh.LIZJ(concurrentHashMap);
                        }
                        Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
                        Object c599710Nfd3 = mapLJIIJ.get(objLJJLIIIJJI);
                        if (c599710Nfd3 == null) {
                            c599710Nfd3 = new C599710Nfd(null, new HashMap());
                            mapLJIIJ.put(objLJJLIIIJJI, c599710Nfd3);
                        }
                        c599710Nfd = (C599710Nfd) c599710Nfd3;
                    }
                    if (c599710Nfd != null && (map2 = c599710Nfd.LIZIZ) != null) {
                        synchronized (map2) {
                            try {
                                strValueOf = String.valueOf(this.LIZIZ.getAndIncrement());
                                map2.put(strValueOf, obj);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return strValueOf;
                    }
                    C1771980wDE.LJFF(EnumC599640NfW.OBSERVER_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                    return null;
                }

                @Override // X.InterfaceC599750Nfh
                public final boolean LIZJ(String str, String str2, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                    C599710Nfd c599710Nfd;
                    HashMap<String, Object> map2;
                    boolean z = false;
                    if (!a0.LJJIIZI(str, e3.d, false)) {
                        Object obj = LJIIJ().get(str);
                        if (obj instanceof C599710Nfd) {
                            c599710Nfd = (C599710Nfd) obj;
                            if (c599710Nfd != null && (map2 = c599710Nfd.LIZIZ) != null) {
                                synchronized (map2) {
                                    try {
                                        if (map2.remove(str2) != null) {
                                            z = true;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                return z;
                            }
                        }
                    } else {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                        Map mapLJIIJ = LJIIJ();
                        int size = listLJJLIIIJILLIZJL.size() - 1;
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj2 = mapLJIIJ.get(ListProtector.get(listLJJLIIIJILLIZJL, i));
                                if (!C19719512Dh.LJII(obj2) || (mapLJIIJ = (Map) obj2) == null) {
                                    break;
                                }
                                i++;
                            } else {
                                Object obj3 = mapLJIIJ.get(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
                                if (obj3 instanceof C599710Nfd) {
                                    c599710Nfd = (C599710Nfd) obj3;
                                }
                            }
                        }
                    }
                    C1771980wDE.LJFF(EnumC599640NfW.UNOBSERVER_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                    return false;
                }

                @Override // X.InterfaceC599750Nfh
                public final void LJ(String str, Object obj, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                    IECommerceHostService iECommerceHostService;
                    boolean z;
                    String name;
                    Object objLIZIZ = obj;
                    if (objLIZIZ == null) {
                        objLIZIZ = null;
                    } else if (objLIZIZ instanceof Object[]) {
                        objLIZIZ = LJI((Object[]) objLIZIZ);
                    } else if ((objLIZIZ instanceof List) && !(objLIZIZ instanceof JavaOnlyArray)) {
                        objLIZIZ = LJII((List) objLIZIZ);
                    } else if ((objLIZIZ instanceof Map) && !(objLIZIZ instanceof JavaOnlyMap)) {
                        objLIZIZ = LJIIIIZZ((Map) objLIZIZ);
                    } else if (objLIZIZ instanceof JSONObject) {
                        C1297550js1.LIZ.getClass();
                        objLIZIZ = C1297550js1.LIZIZ((JSONObject) objLIZIZ);
                    } else if (!(objLIZIZ instanceof Integer) && !(objLIZIZ instanceof Double) && !(objLIZIZ instanceof Float) && !(objLIZIZ instanceof Long) && !(objLIZIZ instanceof String) && !(objLIZIZ instanceof Boolean) && !(objLIZIZ instanceof Byte) && !(objLIZIZ instanceof Short) && !(objLIZIZ instanceof ReadableMap) && !(objLIZIZ instanceof WritableMap) && !(objLIZIZ instanceof ReadableArray) && !(objLIZIZ instanceof WritableArray)) {
                        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("GlobalContext, checkAndConvertFormat, not support, type=");
                        sbLIZ.append(new C599700Nfc(objLIZIZ.getClass()));
                        sbLIZ.append(" value=");
                        sbLIZ.append(objLIZIZ);
                        sbLIZ.append(", ");
                        sbLIZ.append(Log.getStackTraceString(new Throwable()));
                        sbLIZ.append('}');
                        C2188811AlT.LIZIZ(sbLIZ);
                        c599820Nfo.getClass();
                        C599820Nfo.LIZIZ();
                        C1771980wDE.LJFF(EnumC599640NfW.SET_DATA, EnumC599450NfD.INVALID_VALUE, str, enumC599720Nfe, map);
                    }
                    C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                    if (c599710NfdLJIIJJI != null) {
                        if (!Intrinsics.LJFF(c599710NfdLJIIJJI.LIZ, objLIZIZ)) {
                            LJIIL(str, new C599710Nfd(objLIZIZ, c599710NfdLJIIJJI.LIZIZ));
                            HashMap<String, Object> map2 = c599710NfdLJIIJJI.LIZIZ;
                            synchronized (map2) {
                                try {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    for (Object obj2 : map2.values()) {
                                        if (C034S.LIZ()) {
                                            C1120604Zw.LIZ.LIZ();
                                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                                            Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                                            IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                                            if (iECommerceHostService2 != null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            String name2 = IApplicationDependencyService.class.getName();
                                            if (iECommerceHostService2 != null) {
                                                name = iECommerceHostService2.getClass().getName();
                                            } else {
                                                name = null;
                                            }
                                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                                            iECommerceHostService = (IECommerceHostService) service;
                                        } else {
                                            C1120604Zw.LIZ.LIZ();
                                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                                        }
                                        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                                            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("TTKECMMKGlobalContextImpl, notifyDataChange, observer=");
                                            sbLIZ2.append(obj2);
                                            sbLIZ2.append(", newData=");
                                            sbLIZ2.append(objLIZIZ);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                            c599820Nfo2.getClass();
                                            C599820Nfo.LIZ("ec_mmk_data", strLIZIZ);
                                        }
                                        if (obj2 instanceof ECMMKGlobalContextCallback) {
                                            ((ECMMKGlobalContextCallback) obj2).invoke(objLIZIZ);
                                        } else if ((obj2 instanceof LynxView) && !linkedHashSet.contains(obj2)) {
                                            ((LynxView) obj2).sendGlobalEvent("ecMixMallGlobalContextDataChange", JavaOnlyArray.of(JavaOnlyMap.from(C2097908Jt.LIZJ(new Pair(str, objLIZIZ)))));
                                            linkedHashSet.add(obj2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        LJIIL(str, new C599710Nfd(objLIZIZ, new HashMap()));
                    }
                    if (a0.LJJJIL(str)) {
                        C1771980wDE.LJFF(EnumC599640NfW.SET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                    }
                }
            };
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTKECMMKFactory.getGlobalContext, unknown type=");
        sbLIZ.append(enumC586720Mzm);
        sbLIZ.append(", use default");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZ("ec_mmk_util", strLIZIZ);
        return new InterfaceC599750Nfh() { // from class: X.0NfZ
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(493));
            public final AtomicInteger LIZIZ = new AtomicInteger(LSPassThroughRecordSizeConfig.DEFAULT);

            public final ConcurrentHashMap<String, Object> LJIIJ() {
                return (ConcurrentHashMap) this.LIZ.getValue();
            }

            @Override // X.InterfaceC599750Nfh
            public final JavaOnlyMap LIZ() {
                IECommerceHostService iECommerceHostService;
                C599710Nfd c599710Nfd;
                Map map;
                IECommerceHostService iECommerceHostService2;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (!Intrinsics.LJFF("local_test", ((IApplicationDependencyService) iECommerceHostService2).getChannel())) {
                        return null;
                    }
                }
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                for (Map.Entry<String, Object> entry : LJIIJ().entrySet()) {
                    if (entry.getValue() instanceof C599710Nfd) {
                        Object value = entry.getValue();
                        if ((value instanceof C599710Nfd) && (c599710Nfd = (C599710Nfd) value) != null) {
                            javaOnlyMap.put(entry.getKey(), c599710Nfd.LIZ);
                        }
                    } else if (entry.getValue() instanceof Map) {
                        Object value2 = entry.getValue();
                        if (C19719512Dh.LJII(value2) && (map = (Map) value2) != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            LJIIIZ(map, linkedHashMap);
                            javaOnlyMap.put(entry.getKey(), linkedHashMap);
                        }
                    }
                }
                return javaOnlyMap;
            }

            @Override // X.InterfaceC599750Nfh
            public final void release() {
                LJIIJ().clear();
            }

            public final JavaOnlyArray LJI(Object[] objArr) {
                Object c098200Yq;
                Object c098200Yq2;
                Map<String, ? extends Object> map;
                Object c098200Yq3;
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                for (Object obj : objArr) {
                    if (obj instanceof List) {
                        try {
                            c098200Yq = Boolean.valueOf(javaOnlyArray.add(LJII((List) obj)));
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
                            c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LJIIIIZZ(map)));
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        C189200o6.m1boximpl(c098200Yq2);
                    } else if (obj instanceof Object[]) {
                        try {
                            c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LJI((Object[]) obj)));
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

            public final JavaOnlyArray LJII(List<?> list) {
                Object c098200Yq;
                Object c098200Yq2;
                Map<String, ? extends Object> map;
                Object c098200Yq3;
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(list, i);
                    if (obj instanceof List) {
                        try {
                            c098200Yq = Boolean.valueOf(javaOnlyArray.add(LJII((List) obj)));
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
                            c098200Yq2 = Boolean.valueOf(javaOnlyArray.add(LJIIIIZZ(map)));
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        C189200o6.m1boximpl(c098200Yq2);
                    } else if (obj instanceof Object[]) {
                        try {
                            c098200Yq3 = Boolean.valueOf(javaOnlyArray.add(LJI((Object[]) obj)));
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

            public final JavaOnlyMap LJIIIIZZ(Map<String, ? extends Object> map) {
                Object c098200Yq;
                Object c098200Yq2;
                Map<String, ? extends Object> map2;
                Object c098200Yq3;
                if (map == null) {
                    return new JavaOnlyMap();
                }
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj instanceof List) {
                        try {
                            javaOnlyMap.put(str, LJII((List) obj));
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
                            javaOnlyMap.put(str, LJIIIIZZ(map2));
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
                            javaOnlyMap.put(str, LJI((Object[]) obj));
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

            public final C599710Nfd LJIIJJI(String str) {
                if (!a0.LJJIIZI(str, e3.d, false)) {
                    Object obj = LJIIJ().get(str);
                    if (!(obj instanceof C599710Nfd)) {
                        return null;
                    }
                    return (C599710Nfd) obj;
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                Map mapLIZJ = C19719512Dh.LIZJ(LJIIJ());
                int size = listLJJLIIIJILLIZJL.size() - 1;
                for (int i = 0; i < size; i++) {
                    Object obj2 = mapLIZJ.get(ListProtector.get(listLJJLIIIJILLIZJL, i));
                    if (obj2 instanceof C599710Nfd) {
                        obj2 = ((C599710Nfd) obj2).LIZ;
                    }
                    if (!C19719512Dh.LJII(obj2) || (mapLIZJ = (Map) obj2) == null) {
                        return null;
                    }
                }
                Object obj3 = mapLIZJ.get(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
                if (obj3 instanceof C599710Nfd) {
                    return (C599710Nfd) obj3;
                }
                return new C599710Nfd(obj3, new HashMap());
            }

            @Override // X.InterfaceC599750Nfh
            public final void setData(Map map) {
                for (Map.Entry entry : map.entrySet()) {
                    LJ((String) entry.getKey(), entry.getValue(), EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
                }
            }

            public static void LJIIIZ(Map map, Map map2) {
                C599710Nfd c599710Nfd;
                Object obj;
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Map) {
                        map2.put(entry.getKey(), new LinkedHashMap());
                        LJIIIZ(map, map2);
                    } else if (entry.getValue() instanceof C599710Nfd) {
                        Object value = entry.getValue();
                        if ((value instanceof C599710Nfd) && (c599710Nfd = (C599710Nfd) value) != null && (obj = c599710Nfd.LIZ) != null) {
                            map2.put(entry.getKey(), obj);
                        }
                    }
                }
            }

            public final void LJIIL(String str, C599710Nfd c599710Nfd) {
                if (!a0.LJJIIZI(str, e3.d, false)) {
                    LJIIJ().put(str, c599710Nfd);
                    return;
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                Map mapLJIIJ = LJIIJ();
                int size = listLJJLIIIJILLIZJL.size() - 1;
                for (int i = 0; i < size; i++) {
                    Object obj = ListProtector.get(listLJJLIIIJILLIZJL, i);
                    Object concurrentHashMap = mapLJIIJ.get(obj);
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        mapLJIIJ.put(obj, concurrentHashMap);
                    }
                    mapLJIIJ = C19719512Dh.LIZJ(concurrentHashMap);
                }
                mapLJIIJ.put(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL), c599710Nfd);
            }

            @Override // X.InterfaceC599750Nfh
            public final Object LIZLLL(String str, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                Object obj;
                C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                if (c599710NfdLJIIJJI != null) {
                    obj = c599710NfdLJIIJJI.LIZ;
                } else {
                    obj = null;
                }
                if (a0.LJJJIL(str)) {
                    C1771980wDE.LJFF(EnumC599640NfW.GET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                }
                return obj;
            }

            @Override // X.InterfaceC599750Nfh
            public final JavaOnlyMap LJFF(List list, EnumC599720Nfe enumC599720Nfe, Map map) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                    if (c599710NfdLJIIJJI != null) {
                        javaOnlyMap.put(str, c599710NfdLJIIJJI.LIZ);
                    }
                    if (a0.LJJJIL(str)) {
                        C1771980wDE.LJFF(EnumC599640NfW.GET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                    }
                }
                if (javaOnlyMap.isEmpty()) {
                    return null;
                }
                return javaOnlyMap;
            }

            @Override // X.InterfaceC599750Nfh
            public final String LIZIZ(String str, Object obj, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                C599710Nfd c599710Nfd;
                HashMap<String, Object> map2;
                String strValueOf;
                Object objPutIfAbsent;
                if (obj == null) {
                    return null;
                }
                if (!a0.LJJIIZI(str, e3.d, false)) {
                    ConcurrentHashMap<String, Object> concurrentHashMapLJIIJ = LJIIJ();
                    Object c599710Nfd2 = concurrentHashMapLJIIJ.get(str);
                    if (c599710Nfd2 == null && (objPutIfAbsent = concurrentHashMapLJIIJ.putIfAbsent(str, (c599710Nfd2 = new C599710Nfd(null, new HashMap())))) != null) {
                        c599710Nfd2 = objPutIfAbsent;
                    }
                    if (c599710Nfd2 instanceof C599710Nfd) {
                        c599710Nfd = (C599710Nfd) c599710Nfd2;
                    } else {
                        c599710Nfd = null;
                    }
                } else {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    Map mapLJIIJ = LJIIJ();
                    int size = listLJJLIIIJILLIZJL.size() - 1;
                    for (int i = 0; i < size; i++) {
                        Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, i);
                        Object concurrentHashMap = mapLJIIJ.get(obj2);
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                            mapLJIIJ.put(obj2, concurrentHashMap);
                        }
                        mapLJIIJ = C19719512Dh.LIZJ(concurrentHashMap);
                    }
                    Object objLJJLIIIJJI = C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
                    Object c599710Nfd3 = mapLJIIJ.get(objLJJLIIIJJI);
                    if (c599710Nfd3 == null) {
                        c599710Nfd3 = new C599710Nfd(null, new HashMap());
                        mapLJIIJ.put(objLJJLIIIJJI, c599710Nfd3);
                    }
                    c599710Nfd = (C599710Nfd) c599710Nfd3;
                }
                if (c599710Nfd != null && (map2 = c599710Nfd.LIZIZ) != null) {
                    synchronized (map2) {
                        try {
                            strValueOf = String.valueOf(this.LIZIZ.getAndIncrement());
                            map2.put(strValueOf, obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return strValueOf;
                }
                C1771980wDE.LJFF(EnumC599640NfW.OBSERVER_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                return null;
            }

            @Override // X.InterfaceC599750Nfh
            public final boolean LIZJ(String str, String str2, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                C599710Nfd c599710Nfd;
                HashMap<String, Object> map2;
                boolean z = false;
                if (!a0.LJJIIZI(str, e3.d, false)) {
                    Object obj = LJIIJ().get(str);
                    if (obj instanceof C599710Nfd) {
                        c599710Nfd = (C599710Nfd) obj;
                        if (c599710Nfd != null && (map2 = c599710Nfd.LIZIZ) != null) {
                            synchronized (map2) {
                                try {
                                    if (map2.remove(str2) != null) {
                                        z = true;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return z;
                        }
                    }
                } else {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    Map mapLJIIJ = LJIIJ();
                    int size = listLJJLIIIJILLIZJL.size() - 1;
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj2 = mapLJIIJ.get(ListProtector.get(listLJJLIIIJILLIZJL, i));
                            if (!C19719512Dh.LJII(obj2) || (mapLJIIJ = (Map) obj2) == null) {
                                break;
                            }
                            i++;
                        } else {
                            Object obj3 = mapLJIIJ.get(C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL));
                            if (obj3 instanceof C599710Nfd) {
                                c599710Nfd = (C599710Nfd) obj3;
                            }
                        }
                    }
                }
                C1771980wDE.LJFF(EnumC599640NfW.UNOBSERVER_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                return false;
            }

            @Override // X.InterfaceC599750Nfh
            public final void LJ(String str, Object obj, EnumC599720Nfe enumC599720Nfe, Map<String, ? extends Object> map) {
                IECommerceHostService iECommerceHostService;
                boolean z;
                String name;
                Object objLIZIZ = obj;
                if (objLIZIZ == null) {
                    objLIZIZ = null;
                } else if (objLIZIZ instanceof Object[]) {
                    objLIZIZ = LJI((Object[]) objLIZIZ);
                } else if ((objLIZIZ instanceof List) && !(objLIZIZ instanceof JavaOnlyArray)) {
                    objLIZIZ = LJII((List) objLIZIZ);
                } else if ((objLIZIZ instanceof Map) && !(objLIZIZ instanceof JavaOnlyMap)) {
                    objLIZIZ = LJIIIIZZ((Map) objLIZIZ);
                } else if (objLIZIZ instanceof JSONObject) {
                    C1297550js1.LIZ.getClass();
                    objLIZIZ = C1297550js1.LIZIZ((JSONObject) objLIZIZ);
                } else if (!(objLIZIZ instanceof Integer) && !(objLIZIZ instanceof Double) && !(objLIZIZ instanceof Float) && !(objLIZIZ instanceof Long) && !(objLIZIZ instanceof String) && !(objLIZIZ instanceof Boolean) && !(objLIZIZ instanceof Byte) && !(objLIZIZ instanceof Short) && !(objLIZIZ instanceof ReadableMap) && !(objLIZIZ instanceof WritableMap) && !(objLIZIZ instanceof ReadableArray) && !(objLIZIZ instanceof WritableArray)) {
                    C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("GlobalContext, checkAndConvertFormat, not support, type=");
                    sbLIZ2.append(new C599700Nfc(objLIZIZ.getClass()));
                    sbLIZ2.append(" value=");
                    sbLIZ2.append(objLIZIZ);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                    sbLIZ2.append('}');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c599820Nfo2.getClass();
                    C599820Nfo.LIZIZ();
                    C1771980wDE.LJFF(EnumC599640NfW.SET_DATA, EnumC599450NfD.INVALID_VALUE, str, enumC599720Nfe, map);
                }
                C599710Nfd c599710NfdLJIIJJI = LJIIJJI(str);
                if (c599710NfdLJIIJJI != null) {
                    if (!Intrinsics.LJFF(c599710NfdLJIIJJI.LIZ, objLIZIZ)) {
                        LJIIL(str, new C599710Nfd(objLIZIZ, c599710NfdLJIIJJI.LIZIZ));
                        HashMap<String, Object> map2 = c599710NfdLJIIJJI.LIZIZ;
                        synchronized (map2) {
                            try {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (Object obj2 : map2.values()) {
                                    if (C034S.LIZ()) {
                                        C1120604Zw.LIZ.LIZ();
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                                        IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                                        if (iECommerceHostService2 != null) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        String name2 = IApplicationDependencyService.class.getName();
                                        if (iECommerceHostService2 != null) {
                                            name = iECommerceHostService2.getClass().getName();
                                        } else {
                                            name = null;
                                        }
                                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                                        iECommerceHostService = (IECommerceHostService) service;
                                    } else {
                                        C1120604Zw.LIZ.LIZ();
                                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                                    }
                                    if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                                        C599820Nfo c599820Nfo22 = C599820Nfo.LIZ;
                                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                        sbLIZ22.append("TTKECMMKGlobalContextImpl, notifyDataChange, observer=");
                                        sbLIZ22.append(obj2);
                                        sbLIZ22.append(", newData=");
                                        sbLIZ22.append(objLIZIZ);
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ22);
                                        c599820Nfo22.getClass();
                                        C599820Nfo.LIZ("ec_mmk_data", strLIZIZ2);
                                    }
                                    if (obj2 instanceof ECMMKGlobalContextCallback) {
                                        ((ECMMKGlobalContextCallback) obj2).invoke(objLIZIZ);
                                    } else if ((obj2 instanceof LynxView) && !linkedHashSet.contains(obj2)) {
                                        ((LynxView) obj2).sendGlobalEvent("ecMixMallGlobalContextDataChange", JavaOnlyArray.of(JavaOnlyMap.from(C2097908Jt.LIZJ(new Pair(str, objLIZIZ)))));
                                        linkedHashSet.add(obj2);
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                } else {
                    LJIIL(str, new C599710Nfd(objLIZIZ, new HashMap()));
                }
                if (a0.LJJJIL(str)) {
                    C1771980wDE.LJFF(EnumC599640NfW.SET_DATA, EnumC599450NfD.INVALID_PARAMS, str, enumC599720Nfe, map);
                }
            }
        };
    }
}
