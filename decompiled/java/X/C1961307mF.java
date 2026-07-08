package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.07mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961307mF {
    public static Object LIZ(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        Class<?> cls = obj.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZIZ(cls, linkedHashSet);
        ArrayList arrayList = new ArrayList(linkedHashSet);
        if (arrayList.size() > 0) {
            clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
        } else {
            clsArr = new Class[0];
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    public static void LIZIZ(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    LIZIZ(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
