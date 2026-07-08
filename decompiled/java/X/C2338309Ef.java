package X;

/* JADX INFO: renamed from: X.09Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2338309Ef {
    public static String LIZIZ(Class<?> cls) {
        if (cls == null) {
            return "null";
        }
        if (cls.isArray()) {
            return cls.getCanonicalName();
        }
        if (cls.isPrimitive()) {
            return cls.getName();
        }
        return cls.getCanonicalName();
    }

    public static Class<?> LIZJ(Class<?> cls) {
        if (cls != null && cls.isPrimitive()) {
            String name = cls.getName();
            if (!name.equals("double")) {
                if (!name.equals("int")) {
                    if (!name.equals("byte")) {
                        if (!name.equals("char")) {
                            if (!name.equals("long")) {
                                if (!name.equals("void")) {
                                    if (!name.equals("boolean")) {
                                        if (!name.equals("float")) {
                                            if (!name.equals("short")) {
                                                return cls;
                                            }
                                            return Short.class;
                                        }
                                        return Float.class;
                                    }
                                    return Boolean.class;
                                }
                                return Void.class;
                            }
                            return Long.class;
                        }
                        return Character.class;
                    }
                    return Byte.class;
                }
                return Integer.class;
            }
            return Double.class;
        }
        return cls;
    }

    public static void LIZ(Class<?>[] clsArr, Object... objArr) {
        String strLIZIZ;
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr.length == objArr.length) {
            for (int i = 0; i < clsArr.length; i++) {
                Class<?> cls = clsArr[i];
                Object obj = objArr[i];
                if (!(obj == null ? !cls.isPrimitive() : LIZJ(cls).isAssignableFrom(LIZJ(obj.getClass())))) {
                    String strLIZIZ2 = LIZIZ(cls);
                    if (obj == null) {
                        strLIZIZ = "null";
                    } else {
                        strLIZIZ = LIZIZ(obj.getClass());
                    }
                    throw new IllegalArgumentException(C786410Ut5.j4("The param %d type mismatch: expected %s, actual %s", new Object[]{Integer.valueOf(i + 1), strLIZIZ2, strLIZIZ}));
                }
            }
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("param count mismatch: expected %d, actual %d", new Object[]{Integer.valueOf(clsArr.length), Integer.valueOf(objArr.length)}));
    }
}
