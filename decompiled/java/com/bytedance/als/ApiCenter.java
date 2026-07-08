package com.bytedance.als;

import X.C05YF;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import androidx.lifecycle.ViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@InterfaceC1294060jmO
public final class ApiCenter {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ApiCenter LIZ;
    public final Map<Class<?>, Object> LIZIZ;
    public boolean LIZJ;

    public static final class ApiCenterCompatViewModel extends ViewModel {
        public final ApiCenter LL = new ApiCenter(0);
    }

    public ApiCenter() {
        this(0);
    }

    public ApiCenter(int i) {
        this.LIZ = null;
        this.LIZIZ = new HashMap();
    }

    public final synchronized <T extends C05YF> T LIZ(Class<T> cls) {
        Object next;
        Object obj = ((HashMap) this.LIZIZ).get(cls);
        if (obj != null) {
            return (T) obj;
        }
        Iterator it2 = ((HashMap) this.LIZIZ).keySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (LIZJ(cls, (Class) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Class cls2 = (Class) next;
        ApiCenter apiCenter = this.LIZ;
        if (cls2 != null) {
            return (T) ((HashMap) this.LIZIZ).get(cls2);
        }
        if (apiCenter != null) {
            return (T) apiCenter.LIZ(cls);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not found ");
        sbLIZ.append(cls);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized <T extends C05YF> T LIZLLL(Class<T> cls) {
        Object next;
        Object obj = ((HashMap) this.LIZIZ).get(cls);
        if (obj != null) {
            return (T) obj;
        }
        Iterator it2 = ((HashMap) this.LIZIZ).keySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (LIZJ(cls, (Class) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Class cls2 = (Class) next;
        ApiCenter apiCenter = this.LIZ;
        if (cls2 != null) {
            return (T) ((HashMap) this.LIZIZ).get(cls2);
        }
        if (apiCenter == null) {
            return null;
        }
        return (T) apiCenter.LIZLLL(cls);
    }

    public static boolean LIZJ(Class cls, Class cls2) {
        if (cls.isInterface()) {
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (Intrinsics.LJFF(cls3, cls) || LIZJ(cls, cls3)) {
                    return true;
                }
            }
            return false;
        }
        while (!Intrinsics.LJFF(cls2, Object.class)) {
            if (Intrinsics.LJFF(cls2, cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
        }
        return false;
    }
}
