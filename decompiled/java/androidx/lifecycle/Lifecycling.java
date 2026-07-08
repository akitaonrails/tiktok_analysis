package androidx.lifecycle;

import X.C089E;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class Lifecycling {
    public static final Lifecycling INSTANCE = new Lifecycling();
    public static final Map<Class<?>, Integer> callbackCache = new HashMap();
    public static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        String name;
        boolean z;
        boolean z2;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                name = r0.getName();
            } else {
                name = "";
            }
            if (name.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(name);
                sbLIZ.append('.');
                sbLIZ.append(adapterName);
                adapterName = C2188811AlT.LIZIZ(sbLIZ);
            }
            Constructor declaredConstructor = Class.forName(adapterName).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        }
    }

    public static final String getAdapterName(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(u.LJJIFFI(str, e3.d, "_", false));
        sbLIZ.append("_LifecycleAdapter");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        if (cls != null && LifecycleObserver.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object obj) {
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z) {
            if (z2) {
                return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (LifecycleEventObserver) obj);
            }
        } else {
            if (z2) {
                return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, null);
            }
            if (!z) {
                Class<?> cls = obj.getClass();
                Lifecycling lifecycling = INSTANCE;
                if (lifecycling.getObserverConstructorType(cls) == 2) {
                    List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
                    if (list.size() == 1) {
                        return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter((Constructor) ListProtector.get(list, 0), obj));
                    }
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i = 0; i < size; i++) {
                        generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter((Constructor) ListProtector.get(list, i), obj);
                    }
                    return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
                return new ReflectiveGenericLifecycleObserver(obj);
            }
        }
        return (LifecycleEventObserver) obj;
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(cls);
        if (constructorGeneratedConstructor != null) {
            classToAdapters.put(cls, Collections.singletonList(constructorGeneratedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(classToAdapters.get(superclass));
        } else {
            arrayList = null;
        }
        C089E c089e = new C089E(cls.getInterfaces());
        while (c089e.hasNext()) {
            Class<?> cls2 = (Class) c089e.next();
            if (isLifecycleParent(cls2)) {
                if (getObserverConstructorType(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(classToAdapters.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException(e3);
        }
    }
}
