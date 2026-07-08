package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.135r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199545135r {
    public static final Map<Field, C199545135r> LJ = new WeakHashMap();
    public final boolean LIZ;
    public final Field LIZIZ;
    public final Method[] LIZJ;
    public final String LIZLLL;

    public static C199545135r LIZIZ(Field field) {
        String strValue = null;
        if (field == null) {
            return null;
        }
        Map<Field, C199545135r> map = LJ;
        synchronized (map) {
            try {
                C199545135r c199545135r = (C199545135r) ((WeakHashMap) map).get(field);
                boolean zIsEnumConstant = field.isEnumConstant();
                if (c199545135r == null) {
                    if (!zIsEnumConstant) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            InterfaceC199548135u interfaceC199548135u = (InterfaceC199548135u) field.getAnnotation(InterfaceC199548135u.class);
                            if (interfaceC199548135u == null) {
                                return null;
                            }
                            strValue = interfaceC199548135u.value();
                            field.setAccessible(true);
                        }
                    } else {
                        InterfaceC199549135v interfaceC199549135v = (InterfaceC199549135v) field.getAnnotation(InterfaceC199549135v.class);
                        if (interfaceC199549135v != null) {
                            strValue = interfaceC199549135v.value();
                        } else if (((InterfaceC199550135w) field.getAnnotation(InterfaceC199550135w.class)) == null) {
                            return null;
                        }
                    }
                    if ("##default".equals(strValue)) {
                        strValue = field.getName();
                    }
                    c199545135r = new C199545135r(field, strValue);
                    ((WeakHashMap) map).put(field, c199545135r);
                }
                return c199545135r;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Object LIZ(Object obj) {
        try {
            return this.LIZIZ.get(obj);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public C199545135r(Field field, String str) {
        String strIntern;
        this.LIZIZ = field;
        if (str == null) {
            strIntern = null;
        } else {
            strIntern = str.intern();
        }
        this.LIZLLL = strIntern;
        this.LIZ = C199533135f.LIZJ(field.getType());
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            String strLIZ = C19376010rG.LIZ(method.getName());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set");
            sbLIZ.append(C19376010rG.LIZ(field.getName()));
            if (strLIZ.equals(C2188811AlT.LIZIZ(sbLIZ)) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        this.LIZJ = (Method[]) arrayList.toArray(new Method[0]);
    }

    public final void LIZLLL(Object obj, Object obj2) {
        Method[] methodArr = this.LIZJ;
        if (methodArr.length > 0) {
            for (Method method : methodArr) {
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        C2204961BRm.a0(method, obj, new Object[]{obj2}, new C0WZX("dzBzEgU1UM3QUBkgVRvKZW8qUDqMD3k9ulQMYpHDpJOh3XAp", null));
                        return;
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        LIZJ(obj, this.LIZIZ, obj2);
    }

    public static void LIZJ(Object obj, Field field, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            try {
                Object obj3 = field.get(obj);
                if (obj2 == null) {
                    if (obj3 == null) {
                        return;
                    }
                } else if (obj2.equals(obj3)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("expected final value <");
                sbLIZ.append(obj3);
                sbLIZ.append("> but was <");
                sbLIZ.append(obj2);
                sbLIZ.append("> on ");
                sbLIZ.append(field.getName());
                sbLIZ.append(" field in ");
                sbLIZ.append(obj.getClass().getName());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalArgumentException(e2);
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new IllegalArgumentException(e3);
        }
    }
}
