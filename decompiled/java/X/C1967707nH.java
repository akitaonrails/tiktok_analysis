package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07nH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1967707nH {
    public static final Map<String, Method> LIZJ;
    public final Object LIZ;
    public final boolean LIZIZ;

    static {
        new ConcurrentHashMap();
        LIZJ = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static C1967707nH LJI() {
        try {
            return new C1967707nH(Class.forName("com.bytedance.ttnet.NQEManager"));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Class not found: ");
            sbLIZ.append("com.bytedance.ttnet.NQEManager");
            throw new C1967807nI(C2188811AlT.LIZIZ(sbLIZ), e, "com.bytedance.ttnet.NQEManager");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to load class: ");
            sbLIZ2.append("com.bytedance.ttnet.NQEManager");
            throw new C1967807nI(C2188811AlT.LIZIZ(sbLIZ2), e2, "com.bytedance.ttnet.NQEManager");
        }
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTReflect{target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isClassTarget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetClass=");
        sbLIZ.append((this.LIZIZ ? (Class) this.LIZ : this.LIZ.getClass()).getName());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1967707nH(Class<?> cls) {
        this.LIZ = cls;
        this.LIZIZ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(AccessibleObject accessibleObject) {
        if (accessibleObject instanceof Member) {
            Member member = (Member) accessibleObject;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return;
            }
        }
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to set accessible for ");
            sbLIZ.append(accessibleObject);
            throw new C1967807nI(C2188811AlT.LIZIZ(sbLIZ), e, accessibleObject.getClass().getSimpleName());
        }
    }

    public static Class<?> LJII(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1967707nH.class == obj.getClass()) {
            return this.LIZ.equals(((C1967707nH) obj).LIZ);
        }
        return false;
    }

    public C1967707nH(Object obj) {
        this.LIZ = obj;
    }

    public final Method LIZLLL(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> cls;
        Class<?> superclass;
        if (this.LIZIZ) {
            cls = (Class) this.LIZ;
        } else {
            cls = this.LIZ.getClass();
        }
        String strLIZIZ = LIZIZ(cls.getName(), str, clsArr);
        Method method = (Method) ((ConcurrentHashMap) LIZJ).get(strLIZIZ);
        if (method != null) {
            return method;
        }
        if (this.LIZIZ) {
            superclass = (Class) this.LIZ;
        } else {
            superclass = this.LIZ.getClass();
        }
        Method declaredMethod = null;
        while (superclass != null && declaredMethod == null) {
            try {
                declaredMethod = superclass.getMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    superclass = superclass.getSuperclass();
                }
            }
        }
        if (declaredMethod != null) {
            LIZ(declaredMethod);
            ((ConcurrentHashMap) LIZJ).put(strLIZIZ, declaredMethod);
            return declaredMethod;
        }
        throw new NoSuchMethodException();
    }

    public final Method LJ(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> superclass;
        Class<?> cls;
        Class<?> clsLJII;
        if (this.LIZIZ) {
            superclass = (Class) this.LIZ;
        } else {
            superclass = this.LIZ.getClass();
        }
        Method method = null;
        loop0: while (true) {
            if (superclass != null) {
                if (0 != 0) {
                    break;
                }
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (method2.getName().equals(str) && method2.getParameterTypes().length == clsArr.length) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        if (parameterTypes.length == clsArr.length) {
                            for (int i = 0; i < parameterTypes.length; i++) {
                                Class<?> clsLJII2 = LJII(parameterTypes[i]);
                                Class<?> cls2 = clsArr[i];
                                if (cls2 == C1967907nJ.class || (clsLJII = LJII(cls2)) == null || clsLJII2.isAssignableFrom(clsLJII)) {
                                }
                            }
                            method = method2;
                            break loop0;
                        }
                        continue;
                    }
                }
                superclass = superclass.getSuperclass();
            } else if (0 == 0) {
                throw new NoSuchMethodException();
            }
        }
        LIZ(method);
        if (this.LIZIZ) {
            cls = (Class) this.LIZ;
        } else {
            cls = this.LIZ.getClass();
        }
        ((ConcurrentHashMap) LIZJ).put(LIZIZ(cls.getName(), str, clsArr), method);
        return method;
    }

    public final C1967707nH LJFF(Method method, Object... objArr) throws Throwable {
        Class<?> cls;
        try {
            LIZ(method);
            Object objA0 = C2204961BRm.a0(method, this.LIZ, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyCdOGDo1VxQnxjC8bCuoPiqW92K1QFZV0uThvabqv4R6NDFix1W3mQlEM=", null));
            if (method.getReturnType() == Void.TYPE) {
                return this;
            }
            if (objA0 != null) {
                return new C1967707nH(objA0);
            }
            throw new C1967807nI("Instance object cannot be null");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to invoke method: ");
            sbLIZ.append(method.getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String[] strArr = new String[3];
            if (this.LIZIZ) {
                cls = (Class) this.LIZ;
            } else {
                cls = this.LIZ.getClass();
            }
            strArr[0] = cls.getName();
            strArr[1] = method.getName();
            strArr[2] = Arrays.toString(method.getParameterTypes());
            throw new C1967807nI(strLIZIZ, e, strArr);
        }
    }

    public static String LIZIZ(String str, String str2, Class... clsArr) {
        String name;
        StringBuilder sb = new StringBuilder(str);
        sb.append("#");
        sb.append(str2);
        if (clsArr.length > 0) {
            sb.append(e3.e);
            for (int i = 0; i < clsArr.length; i++) {
                Class cls = clsArr[i];
                if (cls != null) {
                    name = cls.getName();
                } else {
                    name = "null";
                }
                sb.append(name);
                if (i != clsArr.length - 1) {
                    sb.append(",");
                }
            }
            sb.append(e3.f);
        }
        return sb.toString();
    }

    public final C1967707nH LIZJ(String str, Class<?>[] clsArr, Object... objArr) {
        Class<?> cls;
        try {
            return LJFF(LIZLLL(str, clsArr), objArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return LJFF(LJ(str, clsArr), objArr);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No method found: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String[] strArr = new String[3];
                if (this.LIZIZ) {
                    cls = (Class) this.LIZ;
                } else {
                    cls = this.LIZ.getClass();
                }
                strArr[0] = cls.getName();
                strArr[1] = str;
                strArr[2] = Arrays.toString(clsArr);
                throw new C1967807nI(strLIZIZ, e2, strArr);
            }
        }
    }
}
