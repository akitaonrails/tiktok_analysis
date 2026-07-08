package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0qQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549670qQf {
    public static Class LIZ(Class cls) {
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(C040D.class) != null) {
                arrayList.add(cls2);
            }
        }
        if (arrayList.isEmpty()) {
            Class<?>[] declaredClasses2 = cls.getSuperclass().getDeclaredClasses();
            arrayList = new ArrayList();
            for (Class<?> cls3 : declaredClasses2) {
                if (cls3.getAnnotation(C040D.class) != null) {
                    arrayList.add(cls3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Class) C13LP.LJJJJZI(arrayList);
    }
}
