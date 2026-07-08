package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981213Fy {
    public static final <T> C13HG<T> LIZ(C13IQ<T> c13iq, C13HG<Object>... c13hgArr) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        Field field;
        Object obj;
        InterfaceC1841100y0i interfaceC1841100y0i;
        C13HG<T> c13hg;
        C13HG<T> c13hgLIZIZ;
        Class clsLIZ = C09R7.LIZ(c13iq);
        C13HG[] c13hgArr2 = (C13HG[]) Arrays.copyOf(c13hgArr, c13hgArr.length);
        if (clsLIZ.isEnum() && clsLIZ.getAnnotation(InterfaceC1841100y0i.class) == null && clsLIZ.getAnnotation(C13G1.class) == null) {
            return new C19981013Fw(clsLIZ.getCanonicalName(), (Enum[]) clsLIZ.getEnumConstants());
        }
        C13HG[] c13hgArr3 = (C13HG[]) Arrays.copyOf(c13hgArr2, c13hgArr2.length);
        try {
            Field declaredField = clsLIZ.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            if (obj2 != null && (c13hgLIZIZ = LIZIZ(obj2, (C13HG[]) Arrays.copyOf(c13hgArr3, c13hgArr3.length))) != null) {
                return c13hgLIZIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String canonicalName = clsLIZ.getCanonicalName();
        if (canonicalName != null && !u.LJJIIJZLJL(canonicalName, "java.", false) && !u.LJJIIJZLJL(canonicalName, "kotlin.", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Field[] declaredFields = clsLIZ.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            boolean z2 = false;
            Field field2 = null;
            while (true) {
                if (i < length) {
                    Field field3 = declaredFields[i];
                    if (Intrinsics.LJFF(field3.getName(), "INSTANCE") && Intrinsics.LJFF(field3.getType(), clsLIZ) && Modifier.isStatic(field3.getModifiers())) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        field2 = field3;
                    }
                    i++;
                } else if (z2 && field2 != null) {
                    Object obj3 = field2.get(null);
                    Method[] methods = clsLIZ.getMethods();
                    int length2 = methods.length;
                    int i2 = 0;
                    boolean z3 = false;
                    Method method = null;
                    while (true) {
                        if (i2 < length2) {
                            Method method2 = methods[i2];
                            if (Intrinsics.LJFF(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && Intrinsics.LJFF(method2.getReturnType(), C13HG.class)) {
                                if (z3) {
                                    break;
                                }
                                z3 = true;
                                method = method2;
                            }
                            i2++;
                        } else if (z3 && method != null) {
                            Object objInvoke = method.invoke(obj3, new Object[0]);
                            if ((objInvoke instanceof C13HG) && (c13hg = (C13HG) objInvoke) != null) {
                                return c13hg;
                            }
                        }
                    }
                }
            }
        }
        C13HG[] c13hgArr4 = (C13HG[]) Arrays.copyOf(c13hgArr2, c13hgArr2.length);
        Class<?>[] declaredClasses = clsLIZ.getDeclaredClasses();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 < length3) {
                Class<?> cls = declaredClasses[i3];
                if (cls.getAnnotation(C13G0.class) == null) {
                    i3++;
                } else {
                    try {
                        Field declaredField2 = clsLIZ.getDeclaredField(cls.getSimpleName());
                        declaredField2.setAccessible(true);
                        Object obj4 = declaredField2.get(null);
                        if (obj4 == null || (c13hgLIZIZ = LIZIZ(obj4, (C13HG[]) Arrays.copyOf(c13hgArr4, c13hgArr4.length))) == null) {
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
        }
        try {
            Class<?>[] declaredClasses2 = clsLIZ.getDeclaredClasses();
            int length4 = declaredClasses2.length;
            int i4 = 0;
            boolean z4 = false;
            Class<?> cls2 = null;
            while (true) {
                if (i4 < length4) {
                    Class<?> cls3 = declaredClasses2[i4];
                    if (Intrinsics.LJFF(cls3.getSimpleName(), "$serializer")) {
                        if (z4) {
                            break;
                        }
                        z4 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else {
                    if (!z4 || cls2 == null || (field = cls2.getField("INSTANCE")) == null) {
                        break;
                    }
                    obj = field.get(null);
                }
            }
            obj = null;
            if (obj instanceof C13HG) {
                C13HG<T> c13hgLIZIZ2 = (C13HG) obj;
                if (c13hgLIZIZ2 != null) {
                    return c13hgLIZIZ2;
                }
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (clsLIZ.getAnnotation(C13G1.class) == null && ((interfaceC1841100y0i = (InterfaceC1841100y0i) clsLIZ.getAnnotation(InterfaceC1841100y0i.class)) == null || !Intrinsics.LJFF(C13LE.LIZ(interfaceC1841100y0i.with()), C13LE.LIZ(C13GU.class)))) {
            return null;
        }
        return new C13GU(C13LE.LIZ(clsLIZ));
    }

    public static final <T> C13HG<T> LIZIZ(Object obj, C13HG<Object>... c13hgArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (c13hgArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = c13hgArr.length;
                clsArr = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr[i] = C13HG.class;
                }
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(c13hgArr, c13hgArr.length));
            if (objInvoke instanceof C13HG) {
                return (C13HG) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e2;
        }
    }
}
