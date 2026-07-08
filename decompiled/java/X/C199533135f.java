package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.135f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199533135f {
    public static final ConcurrentHashMap<Class<?>, Object> LIZ;

    static {
        Boolean bool = new Boolean(true);
        String str = new String();
        Character ch = new Character((char) 0);
        Byte b = new Byte((byte) 0);
        Short sh = new Short((short) 0);
        Integer num = new Integer(0);
        Float f = new Float(0.0f);
        Long l = new Long(0L);
        Double d = new Double(0.0d);
        BigInteger bigInteger = new BigInteger(CardStruct.IStatusCode.DEFAULT);
        BigDecimal bigDecimal = new BigDecimal(CardStruct.IStatusCode.DEFAULT);
        C20018413Ug c20018413Ug = new C20018413Ug(0L);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        LIZ = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C20018413Ug.class, c20018413Ug);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T LIZ(T t) {
        T t2;
        if (t != 0 && !LIZJ(t.getClass())) {
            if (t instanceof C199536135i) {
                return (T) ((C199536135i) t).clone();
            }
            Class<?> cls = t.getClass();
            if (cls.isArray()) {
                t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
            } else if (t instanceof C19899212tS) {
                t2 = (T) ((C19899212tS) t).clone();
            } else {
                if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                    Object[] array = ((List) t).toArray();
                    LIZIZ(array, array);
                    return (T) Arrays.asList(array);
                }
                t2 = (T) C2341209Fi.LJFF(cls);
            }
            LIZIZ(t, t2);
            return t2;
        }
        return t;
    }

    public static boolean LIZJ(Type type) {
        if (type instanceof WildcardType) {
            type = C2341209Fi.LIZ((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive() && cls != Character.class && cls != String.class && cls != Integer.class && cls != Long.class && cls != Short.class && cls != Byte.class && cls != Float.class && cls != Double.class && cls != BigInteger.class && cls != BigDecimal.class && cls != C20018413Ug.class && cls != Boolean.class) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Class cls) {
        Object objLJFF;
        if (LIZ.get(cls) == null) {
            int i = 0;
            if (cls.isArray()) {
                Class componentType = cls;
                do {
                    componentType = componentType.getComponentType();
                    i++;
                } while (componentType.isArray());
                objLJFF = Array.newInstance((Class<?>) componentType, new int[i]);
            } else if (cls.isEnum()) {
                C199545135r c199545135rLIZ = C199544135q.LIZIZ(cls, false).LIZ(null);
                C19864312np.LJII("enum missing constant with @NullValue annotation: %s", c199545135rLIZ, cls);
                objLJFF = C08FF.LIZ(c199545135rLIZ.LIZIZ.getDeclaringClass(), c199545135rLIZ.LIZIZ.getName());
            } else {
                objLJFF = C2341209Fi.LJFF(cls);
            }
            LIZ.putIfAbsent(cls, objLJFF);
        }
    }

    public static void LIZIZ(Object obj, Object obj2) {
        boolean z;
        C199544135q c199544135qLIZIZ;
        Object obj3;
        int i;
        Class<?> cls = obj.getClass();
        boolean z2 = true;
        int i2 = 0;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LJ(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            C19864312np.LJ(z2);
            Iterator it2 = C2341209Fi.LJ(obj).iterator();
            while (it2.hasNext()) {
                Array.set(obj2, i2, LIZ(it2.next()));
                i2++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                collection2.add(LIZ(it3.next()));
            }
            return;
        }
        boolean zIsAssignableFrom = C199536135i.class.isAssignableFrom(cls);
        if (!zIsAssignableFrom) {
            if (!Map.class.isAssignableFrom(cls)) {
                c199544135qLIZIZ = C199544135q.LIZIZ(cls, false);
            } else {
                if (C19899212tS.class.isAssignableFrom(cls)) {
                    C19899212tS c19899212tS = (C19899212tS) obj2;
                    C19899212tS c19899212tS2 = (C19899212tS) obj;
                    int i3 = c19899212tS2.LL;
                    while (i2 < i3) {
                        if (i2 >= 0 && i2 < c19899212tS2.LL && (i = (i2 << 1) + 1) >= 0) {
                            obj3 = c19899212tS2.LLILLJJLI[i];
                        } else {
                            obj3 = null;
                        }
                        Object objLIZ = LIZ(obj3);
                        int i4 = c19899212tS.LL;
                        if (i2 >= 0 && i2 < i4) {
                            c19899212tS.LLILLJJLI[(i2 << 1) + 1] = objLIZ;
                            i2++;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    }
                    return;
                }
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), LIZ(entry.getValue()));
                }
                return;
            }
        } else {
            c199544135qLIZIZ = ((C199536135i) obj).LLILLJJLI;
        }
        Iterator<String> it4 = c199544135qLIZIZ.LIZJ.iterator();
        while (it4.hasNext()) {
            C199545135r c199545135rLIZ = c199544135qLIZIZ.LIZ(it4.next());
            if (!Modifier.isFinal(c199545135rLIZ.LIZIZ.getModifiers()) && (!zIsAssignableFrom || !c199545135rLIZ.LIZ)) {
                Object objLIZ2 = c199545135rLIZ.LIZ(obj);
                if (objLIZ2 != null) {
                    c199545135rLIZ.LIZLLL(obj2, LIZ(objLIZ2));
                }
            }
        }
    }

    public static Type LJ(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C2341209Fi.LIZ((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type typeLJI = C2341209Fi.LJI(list, (TypeVariable) type);
            if (typeLJI != null) {
                type = typeLJI;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
