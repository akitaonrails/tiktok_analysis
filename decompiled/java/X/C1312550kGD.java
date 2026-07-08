package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312550kGD {
    public static final Map<Class, Map<String, AbstractC1312520kGA>> LIZ = new ConcurrentHashMap();
    public static final Map<String, AbstractC1312520kGA> LIZIZ = new HashMap();

    public static Map<String, AbstractC1312520kGA> LIZJ(Class<? extends LynxBaseUI> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return LIZIZ;
        }
        Map<String, AbstractC1312520kGA> map = (Map) ((ConcurrentHashMap) LIZ).get(cls);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        if (cls == LynxBaseUI.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        map2.putAll(LIZJ(superclass));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC1312540kGC interfaceC1312540kGC = (InterfaceC1312540kGC) method.getAnnotation(InterfaceC1312540kGC.class);
            if (interfaceC1312540kGC != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map2.put(interfaceC1312540kGC.name(), LIZ(interfaceC1312540kGC, method, parameterTypes[0]));
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Wrong number of args for prop setter: ");
                    sbLIZ.append(cls.getName());
                    sbLIZ.append("#");
                    sbLIZ.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            InterfaceC1312530kGB interfaceC1312530kGB = (InterfaceC1312530kGB) method.getAnnotation(InterfaceC1312530kGB.class);
            if (interfaceC1312530kGB != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        LIZIZ(interfaceC1312530kGB, method, parameterTypes2[1], map2);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Second argument should be property index: ");
                        sbLIZ2.append(cls.getName());
                        sbLIZ2.append("#");
                        sbLIZ2.append(method.getName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Wrong number of args for group prop setter: ");
                    sbLIZ3.append(cls.getName());
                    sbLIZ3.append("#");
                    sbLIZ3.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        ((ConcurrentHashMap) LIZ).put(cls, map2);
        return map2;
    }

    public static Map<String, AbstractC1312520kGA> LIZLLL(Class<? extends ShadowNode> cls) {
        Class<? super Object> superclass;
        if (cls == null) {
            return LIZIZ;
        }
        Map<String, AbstractC1312520kGA> map = (Map) ((ConcurrentHashMap) LIZ).get(cls);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        if (cls == ShadowNode.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        map2.putAll(LIZLLL(superclass));
        for (Method method : cls.getDeclaredMethods()) {
            InterfaceC1312540kGC interfaceC1312540kGC = (InterfaceC1312540kGC) method.getAnnotation(InterfaceC1312540kGC.class);
            if (interfaceC1312540kGC != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map2.put(interfaceC1312540kGC.name(), LIZ(interfaceC1312540kGC, method, parameterTypes[0]));
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Wrong number of args for prop setter: ");
                    sbLIZ.append(cls.getName());
                    sbLIZ.append("#");
                    sbLIZ.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            InterfaceC1312530kGB interfaceC1312530kGB = (InterfaceC1312530kGB) method.getAnnotation(InterfaceC1312530kGB.class);
            if (interfaceC1312530kGB != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        LIZIZ(interfaceC1312530kGB, method, parameterTypes2[1], map2);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Second argument should be property index: ");
                        sbLIZ2.append(cls.getName());
                        sbLIZ2.append("#");
                        sbLIZ2.append(method.getName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Wrong number of args for group prop setter: ");
                    sbLIZ3.append(cls.getName());
                    sbLIZ3.append("#");
                    sbLIZ3.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        ((ConcurrentHashMap) LIZ).put(cls, map2);
        return map2;
    }

    public static AbstractC1312520kGA LIZ(final InterfaceC1312540kGC interfaceC1312540kGC, final Method method, Class<?> cls) {
        if (cls == InterfaceC1298070jsr.class) {
            return new C1312620kGK(interfaceC1312540kGC, method);
        }
        if (cls == Boolean.TYPE) {
            final boolean zDefaultBoolean = interfaceC1312540kGC.defaultBoolean();
            return new AbstractC1312520kGA(interfaceC1312540kGC, method, zDefaultBoolean) { // from class: X.0kGN
                public final boolean LIZLLL;

                @Override // X.AbstractC1312520kGA
                public final Object LIZ(C1311730kEt c1311730kEt) {
                    if (c1311730kEt.LIZIZ(this.LIZ, this.LIZLLL)) {
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }

                {
                    this.LIZLLL = zDefaultBoolean;
                }
            };
        }
        if (cls == Integer.TYPE) {
            return new C1312600kGI(interfaceC1312540kGC, method, interfaceC1312540kGC.defaultInt());
        }
        if (cls == Long.TYPE) {
            return new C1312560kGE(interfaceC1312540kGC, method);
        }
        if (cls == Float.TYPE) {
            return new C1312590kGH(interfaceC1312540kGC, method, interfaceC1312540kGC.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new C1312580kGG(interfaceC1312540kGC, method, interfaceC1312540kGC.defaultDouble());
        }
        if (cls == String.class) {
            return new C1312640kGM(interfaceC1312540kGC, method);
        }
        if (cls == Boolean.class) {
            return new AbstractC1312520kGA(interfaceC1312540kGC, method) { // from class: X.0kGL
                @Override // X.AbstractC1312520kGA
                public final Object LIZ(C1311730kEt c1311730kEt) {
                    if (!c1311730kEt.LJIIJ(this.LIZ)) {
                        if (c1311730kEt.LIZIZ(this.LIZ, false)) {
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    }
                    return null;
                }
            };
        }
        if (cls == Integer.class) {
            return new C1312570kGF(interfaceC1312540kGC, method);
        }
        if (cls == ReadableArray.class) {
            return new C1312610kGJ(interfaceC1312540kGC, method);
        }
        if (cls == ReadableMap.class) {
            return new AbstractC1312520kGA(interfaceC1312540kGC, method) { // from class: X.0kGO
                @Override // X.AbstractC1312520kGA
                public final Object LIZ(C1311730kEt c1311730kEt) {
                    return c1311730kEt.LJI(this.LIZ);
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unrecognized type: ");
        sbLIZ.append(cls);
        sbLIZ.append(" for method: ");
        sbLIZ.append(method.getDeclaringClass().getName());
        sbLIZ.append("#");
        sbLIZ.append(method.getName());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(InterfaceC1312530kGB interfaceC1312530kGB, Method method, Class<?> cls, Map<String, AbstractC1312520kGA> map) {
        String[] strArrNames = interfaceC1312530kGB.names();
        int i = 0;
        if (cls != InterfaceC1298070jsr.class) {
            if (cls != Integer.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Float.TYPE) {
                        if (cls != Double.TYPE) {
                            if (cls != Integer.class) {
                                if (cls != String.class) {
                                    if (cls != ReadableArray.class) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Unrecognized type: ");
                                        sbLIZ.append(cls);
                                        sbLIZ.append(" for method: ");
                                        sbLIZ.append(method.getDeclaringClass().getName());
                                        sbLIZ.append("#");
                                        sbLIZ.append(method.getName());
                                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    while (i < strArrNames.length) {
                                        ((HashMap) map).put(strArrNames[i], new C1312610kGJ(interfaceC1312530kGB, method, i));
                                        i++;
                                    }
                                    return;
                                }
                                while (i < strArrNames.length) {
                                    ((HashMap) map).put(strArrNames[i], new C1312640kGM(interfaceC1312530kGB, method, i));
                                    i++;
                                }
                                return;
                            }
                            while (i < strArrNames.length) {
                                ((HashMap) map).put(strArrNames[i], new C1312570kGF(interfaceC1312530kGB, method, i));
                                i++;
                            }
                            return;
                        }
                        while (i < strArrNames.length) {
                            ((HashMap) map).put(strArrNames[i], new C1312580kGG(interfaceC1312530kGB, method, i, interfaceC1312530kGB.defaultDouble()));
                            i++;
                        }
                        return;
                    }
                    while (i < strArrNames.length) {
                        ((HashMap) map).put(strArrNames[i], new C1312590kGH(interfaceC1312530kGB, method, i, interfaceC1312530kGB.defaultFloat()));
                        i++;
                    }
                    return;
                }
                while (i < strArrNames.length) {
                    ((HashMap) map).put(strArrNames[i], new C1312560kGE(interfaceC1312530kGB, method, i));
                    i++;
                }
                return;
            }
            while (i < strArrNames.length) {
                ((HashMap) map).put(strArrNames[i], new C1312600kGI(interfaceC1312530kGB, method, i, interfaceC1312530kGB.defaultInt()));
                i++;
            }
            return;
        }
        while (i < strArrNames.length) {
            ((HashMap) map).put(strArrNames[i], new C1312620kGK(interfaceC1312530kGB, method, i));
            i++;
        }
    }
}
