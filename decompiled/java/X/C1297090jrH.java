package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0jrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297090jrH<T> extends AbstractC1296960jr4<T> {
    public static final C1297220jrU LIZLLL = new InterfaceC1296930jr1() { // from class: X.0jrU
        @Override // X.InterfaceC1296930jr1
        public final AbstractC1296960jr4<?> LIZ(Type type, Set<? extends Annotation> set, C1297080jrG c1297080jrG) {
            AbstractC1297190jrR<Object> abstractC1297190jrR;
            Set<Annotation> setUnmodifiableSet;
            String name;
            Type typeLJI = type;
            final Class<?> clsLJFF = C1297410jrn.LJFF(typeLJI);
            LinkedHashSet linkedHashSet = null;
            if (clsLJFF.isInterface() || clsLJFF.isEnum()) {
                return null;
            }
            if (C1297090jrH.LIZJ(clsLJFF) && clsLJFF != Boolean.class && clsLJFF != Byte.class && clsLJFF != Character.class && clsLJFF != Double.class && clsLJFF != Float.class && clsLJFF != Integer.class && clsLJFF != Long.class && clsLJFF != Short.class && clsLJFF != String.class && clsLJFF != Object.class) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Platform ");
                sbLIZ.append(typeLJI);
                sbLIZ.append(" annotated ");
                sbLIZ.append(set);
                sbLIZ.append(" requires explicit JsonAdapter to be registered");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!set.isEmpty()) {
                return null;
            }
            if (clsLJFF.getEnclosingClass() != null && !Modifier.isStatic(clsLJFF.getModifiers())) {
                if (clsLJFF.getSimpleName().isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Cannot serialize anonymous class ");
                    sbLIZ2.append(clsLJFF.getName());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Cannot serialize non-static nested class ");
                sbLIZ3.append(clsLJFF.getName());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (!Modifier.isAbstract(clsLJFF.getModifiers())) {
                try {
                    final Constructor<?> declaredConstructor = clsLJFF.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrZ
                        @Override // X.AbstractC1297190jrR
                        public final Object LIZ() {
                            return declaredConstructor.newInstance(null);
                        }

                        public final String toString() {
                            return clsLJFF.getName();
                        }
                    };
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        Class<?> cls = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        final Object obj = declaredField.get(null);
                        final Method method = cls.getMethod("allocateInstance", Class.class);
                        abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrX
                            @Override // X.AbstractC1297190jrR
                            public final Object LIZ() {
                                return C2204961BRm.a0(method, obj, new Object[]{clsLJFF}, new C0WZX("dzBzEhErSsvOUEIxCx+LdX1WBFO/kPM5TLChOBVkHw==", null));
                            }

                            public final String toString() {
                                return clsLJFF.getName();
                            }
                        };
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod.setAccessible(true);
                            final int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                            final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                            declaredMethod2.setAccessible(true);
                            abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrW
                                @Override // X.AbstractC1297190jrR
                                public final Object LIZ() {
                                    return C2204961BRm.a0(declaredMethod2, null, new Object[]{clsLJFF, Integer.valueOf(iIntValue)}, new C0WZX("dzBzEhErSsvOUEIxCx+LdX1WBFO/kPM5TLChOBVkHw==", null));
                                }

                                public final String toString() {
                                    return clsLJFF.getName();
                                }
                            };
                        } catch (IllegalAccessException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw new AssertionError();
                        } catch (NoSuchMethodException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            try {
                                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                declaredMethod3.setAccessible(true);
                                abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrY
                                    @Override // X.AbstractC1297190jrR
                                    public final Object LIZ() {
                                        return C2204961BRm.a0(declaredMethod3, null, new Object[]{clsLJFF, Object.class}, new C0WZX("dzBzEhErSsvOUEIxCx+LdX1WBFO/kPM5TLChOBVkHw==", null));
                                    }

                                    public final String toString() {
                                        return clsLJFF.getName();
                                    }
                                };
                            } catch (Exception e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("cannot construct instances of ");
                                sbLIZ4.append(clsLJFF.getName());
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                            }
                        } catch (InvocationTargetException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            throw new RuntimeException(e6);
                        }
                    } catch (IllegalAccessException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                        throw new AssertionError();
                    } catch (NoSuchFieldException e8) {
                        e = e8;
                        TryCatchGuardChecker.doCheck(e);
                        Method declaredMethod4 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod4.setAccessible(true);
                        final int iIntValue2 = ((Integer) declaredMethod4.invoke(null, Object.class)).intValue();
                        final Method declaredMethod22 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod22.setAccessible(true);
                        abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrW
                            @Override // X.AbstractC1297190jrR
                            public final Object LIZ() {
                                return C2204961BRm.a0(declaredMethod22, null, new Object[]{clsLJFF, Integer.valueOf(iIntValue2)}, new C0WZX("dzBzEhErSsvOUEIxCx+LdX1WBFO/kPM5TLChOBVkHw==", null));
                            }

                            public final String toString() {
                                return clsLJFF.getName();
                            }
                        };
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        TryCatchGuardChecker.doCheck(e);
                        Method declaredMethod42 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod42.setAccessible(true);
                        final int iIntValue22 = ((Integer) declaredMethod42.invoke(null, Object.class)).intValue();
                        final Method declaredMethod222 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod222.setAccessible(true);
                        abstractC1297190jrR = new AbstractC1297190jrR<Object>() { // from class: X.0jrW
                            @Override // X.AbstractC1297190jrR
                            public final Object LIZ() {
                                return C2204961BRm.a0(declaredMethod222, null, new Object[]{clsLJFF, Integer.valueOf(iIntValue22)}, new C0WZX("dzBzEhErSsvOUEIxCx+LdX1WBFO/kPM5TLChOBVkHw==", null));
                            }

                            public final String toString() {
                                return clsLJFF.getName();
                            }
                        };
                    }
                }
                TreeMap treeMap = new TreeMap();
                while (typeLJI != Object.class) {
                    Class<?> clsLJFF2 = C1297410jrn.LJFF(typeLJI);
                    boolean zLIZJ = C1297090jrH.LIZJ(clsLJFF2);
                    Field[] declaredFields = clsLJFF2.getDeclaredFields();
                    int length = declaredFields.length;
                    int i = 0;
                    while (i < length) {
                        Field field = declaredFields[i];
                        int modifiers = field.getModifiers();
                        if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zLIZJ)) {
                            Type typeLJI2 = C1297410jrn.LJI(typeLJI, clsLJFF2, C786410Ut5.U2(field));
                            Set<Annotation> set2 = C1297180jrQ.LIZ;
                            for (Annotation annotation : field.getAnnotations()) {
                                if (annotation.annotationType().isAnnotationPresent(InterfaceC1297280jra.class)) {
                                    if (linkedHashSet == null) {
                                        linkedHashSet = new LinkedHashSet();
                                    }
                                    linkedHashSet.add(annotation);
                                }
                            }
                            if (linkedHashSet != null) {
                                setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                            } else {
                                setUnmodifiableSet = C1297180jrQ.LIZ;
                            }
                            AbstractC1296960jr4 abstractC1296960jr4LIZ = c1297080jrG.LIZ(typeLJI2, setUnmodifiableSet);
                            field.setAccessible(true);
                            InterfaceC1296470jqH interfaceC1296470jqH = (InterfaceC1296470jqH) field.getAnnotation(InterfaceC1296470jqH.class);
                            if (interfaceC1296470jqH != null) {
                                name = interfaceC1296470jqH.name();
                            } else {
                                name = field.getName();
                            }
                            C1297140jrM c1297140jrM = (C1297140jrM) treeMap.put(name, new C1297140jrM(name, field, abstractC1296960jr4LIZ));
                            if (c1297140jrM != null) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("Conflicting fields:\n    ");
                                sbLIZ5.append(c1297140jrM.LIZIZ);
                                sbLIZ5.append("\n");
                                sbLIZ5.append("    ");
                                sbLIZ5.append(field);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
                            }
                        }
                        i++;
                        linkedHashSet = null;
                    }
                    Class<?> clsLJFF3 = C1297410jrn.LJFF(typeLJI);
                    typeLJI = C1297410jrn.LJI(typeLJI, clsLJFF3, clsLJFF3.getGenericSuperclass());
                    linkedHashSet = null;
                }
                return new C1296940jr2(new C1297090jrH(abstractC1297190jrR, treeMap));
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Cannot serialize abstract class ");
            sbLIZ6.append(clsLJFF.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
        }
    };
    public final AbstractC1297190jrR<T> LIZ;
    public final C1297140jrM<?>[] LIZIZ;
    public final C1296760jqk LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonAdapter(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1296960jr4
    public final T LIZ(AbstractC1296450jqF abstractC1296450jqF) throws Throwable {
        try {
            T tLIZ = this.LIZ.LIZ();
            try {
                abstractC1296450jqF.LIZIZ();
                while (abstractC1296450jqF.LJII()) {
                    int iLJJJJ = abstractC1296450jqF.LJJJJ(this.LIZJ);
                    if (iLJJJJ != -1) {
                        C1297140jrM<?> c1297140jrM = this.LIZIZ[iLJJJJ];
                        c1297140jrM.LIZIZ.set(tLIZ, c1297140jrM.LIZJ.LIZ(abstractC1296450jqF));
                    } else {
                        abstractC1296450jqF.LJIJJ();
                        abstractC1296450jqF.LJJJJJ();
                    }
                }
                abstractC1296450jqF.LJFF();
                return tLIZ;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError();
            }
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new AssertionError();
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            Throwable targetException = e4.getTargetException();
            if ((targetException instanceof RuntimeException) || (targetException instanceof Error)) {
                throw targetException;
            }
            throw new RuntimeException(targetException);
        }
    }

    public C1297090jrH(AbstractC1297190jrR<T> abstractC1297190jrR, Map<String, C1297140jrM<?>> map) {
        this.LIZ = abstractC1297190jrR;
        TreeMap treeMap = (TreeMap) map;
        this.LIZIZ = (C1297140jrM[]) treeMap.values().toArray(new C1297140jrM[treeMap.size()]);
        this.LIZJ = C1296760jqk.LIZ((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, T t) {
        try {
            C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
            c1297030jrB.LJIJJ();
            c1297030jrB.LJIILL();
            c1297030jrB.LJFF(3);
            c1297030jrB.LLILZ[c1297030jrB.LL - 1] = 0;
            c1297030jrB.LLIZLLLIL.LJLLILLLL("{");
            for (C1297140jrM<?> c1297140jrM : this.LIZIZ) {
                abstractC1297000jr8.LIZ(c1297140jrM.LIZ);
                c1297140jrM.LIZJ.LIZIZ(abstractC1297000jr8, c1297140jrM.LIZIZ.get(t));
            }
            C1297030jrB c1297030jrB2 = (C1297030jrB) abstractC1297000jr8;
            c1297030jrB2.LLIZ = false;
            c1297030jrB2.LJIILLIIL(3, 5, "}");
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError();
        }
    }
}
