package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.c;
import com.google.gson.internal.s;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2333709Cl {
    public static final ConcurrentHashMap<Class, Field[]> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, HashMap<String, Field>> LIZIZ;
    public static boolean LIZJ;
    public static final c LIZLLL;

    static {
        new ConcurrentHashMap();
        LIZIZ = new ConcurrentHashMap<>();
        LIZJ = false;
        LIZLLL = c.IDENTITY;
    }

    public static void LIZIZ(Class cls) {
        Field[] fieldArr = LIZ.get(cls);
        if (fieldArr == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                arrayList.addAll(new ArrayList(Arrays.asList(superclass.getDeclaredFields())));
            }
            fieldArr = new Field[arrayList.size()];
            arrayList.toArray(fieldArr);
            LIZ.put(cls, fieldArr);
        }
        for (Field field : fieldArr) {
            field.setAccessible(true);
            ConcurrentHashMap<Class, HashMap<String, Field>> concurrentHashMap = LIZIZ;
            HashMap<String, Field> map = concurrentHashMap.get(cls);
            if (map == null) {
                map = new HashMap<>();
                concurrentHashMap.put(cls, map);
            }
            C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
            if (c09ct == null) {
                map.put(LIZLLL.translateName(field), field);
            } else {
                map.put(c09ct.value(), field);
                String[] strArrAlternate = c09ct.alternate();
                for (String str : strArrAlternate) {
                    map.put(str, field);
                }
            }
        }
    }

    public static Field LIZ(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<Class, HashMap<String, Field>> concurrentHashMap = LIZIZ;
        HashMap<String, Field> map = concurrentHashMap.get(cls);
        if (map == null) {
            LIZIZ(cls);
            map = concurrentHashMap.get(cls);
            if (map == null) {
                return null;
            }
        }
        return map.get(str);
    }

    public static boolean LIZJ(Object obj, Field field, Object obj2) throws IllegalAccessException {
        Object obj3 = field.get(obj);
        if (obj3 instanceof Long) {
            field.set(obj, Long.valueOf(((Double) obj2).longValue()));
            return true;
        }
        if (obj3 instanceof Integer) {
            field.set(obj, Integer.valueOf(((Double) obj2).intValue()));
            return true;
        }
        if (((Number) C079Q.LIZ.getValue()).intValue() != 0 || !(obj3 instanceof Double)) {
            return false;
        }
        field.set(obj, Double.valueOf(((Double) obj2).doubleValue()));
        return true;
    }

    public static boolean LIZLLL(Object obj, Field field, Object obj2) throws IllegalAccessException {
        if (C09F0.LIZ() && (obj2 instanceof n)) {
            field.set(obj, GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) obj2, (Class) field.getType()));
            return true;
        }
        if (obj2 instanceof s) {
            field.set(obj, GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), obj2), (Class) field.getType()));
            return true;
        }
        if ((obj2 instanceof List) && Collection.class.isAssignableFrom(field.getType())) {
            Type typeU2 = C786410Ut5.U2(field);
            if (typeU2 == null) {
                return false;
            }
            if (typeU2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) typeU2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (obj3 instanceof s) {
                        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), obj3);
                        if (((Boolean) C271670Akn.LIZIZ.getValue()).booleanValue()) {
                            arrayList.add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), json, parameterizedType.getActualTypeArguments()[0]));
                        } else {
                            arrayList.add(GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), json, (Class) parameterizedType.getActualTypeArguments()[0]));
                        }
                    } else {
                        arrayList.add(obj3);
                    }
                }
                field.set(obj, arrayList);
                return true;
            }
        }
        field.set(obj, obj2);
        return true;
    }
}
