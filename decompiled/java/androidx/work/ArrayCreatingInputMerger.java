package androidx.work;

import X.C0VHO;
import X.C795380VIa;
import X.C795410VId;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ArrayCreatingInputMerger extends C0VHO {
    @Override // X.C0VHO
    public final C795380VIa LIZ(List<C795380VIa> list) {
        Object objNewInstance;
        Object objNewInstance2;
        C795410VId c795410VId = new C795410VId();
        HashMap map = new HashMap();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            for (Map.Entry entry : Collections.unmodifiableMap(((C795380VIa) it2.next()).LIZ).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(key);
                if (obj == null) {
                    if (!cls.isArray()) {
                        objNewInstance2 = Array.newInstance(value.getClass(), 1);
                        Array.set(objNewInstance2, 0, value);
                        value = objNewInstance2;
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object objNewInstance3 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, objNewInstance3, 0, length);
                            System.arraycopy(value, 0, objNewInstance3, length, length2);
                            value = objNewInstance3;
                        } else {
                            objNewInstance2 = Array.newInstance(obj.getClass(), 2);
                            Array.set(objNewInstance2, 0, obj);
                            Array.set(objNewInstance2, 1, value);
                            value = objNewInstance2;
                        }
                    } else {
                        if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            int length3 = Array.getLength(obj);
                            objNewInstance = Array.newInstance(value.getClass(), length3 + 1);
                            System.arraycopy(obj, 0, objNewInstance, 0, length3);
                            Array.set(objNewInstance, length3, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            int length4 = Array.getLength(value);
                            objNewInstance = Array.newInstance(obj.getClass(), length4 + 1);
                            System.arraycopy(value, 0, objNewInstance, 0, length4);
                            Array.set(objNewInstance, length4, obj);
                        } else {
                            throw new IllegalArgumentException();
                        }
                        value = objNewInstance;
                    }
                }
                map.put(key, value);
            }
        }
        c795410VId.LIZJ(map);
        return c795410VId.LIZ();
    }
}
