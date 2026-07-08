package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969807nc {
    public static final C1969807nc LIZ = new C1969807nc();

    public static Object LIZ(Class cls) {
        Method method;
        Field field;
        Object c098200Yq;
        boolean z;
        Object c098200Yq2;
        boolean z2;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i < length) {
                method = declaredMethods[i];
                if (Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && Intrinsics.LJFF(method.getReturnType(), cls)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            } else {
                method = null;
                break;
            }
        }
        if (method != null) {
            method.setAccessible(true);
            try {
                c098200Yq2 = C2204961BRm.a0(method, null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIFGrmkJr93hRTOzcR/NF1yLQjCM8g592TnCI=", null));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                return null;
            }
            return c098200Yq2;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int length2 = declaredFields.length;
        int i2 = 0;
        while (true) {
            if (i2 < length2) {
                field = declaredFields[i2];
                if (Modifier.isStatic(field.getModifiers()) && Intrinsics.LJFF(field.getType(), cls)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                field = null;
                break;
            }
        }
        if (field != null) {
            field.setAccessible(true);
            try {
                c098200Yq = field.get(null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                return c098200Yq;
            }
        }
        return null;
    }

    public static Set LIZIZ(Class cls) throws Throwable {
        Set set;
        for (Method method : cls.getDeclaredMethods()) {
            if (Intrinsics.LJFF(method.getName(), "getAabSpiServiceKeySetForRefreshByByteX") && Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0) {
                method.setAccessible(true);
                Object objA0 = C2204961BRm.a0(method, null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIFGrmkJr93hRTOzcR/NF1yLQjCM8g592TnCI=", null));
                if ((objA0 instanceof Set) && (set = (Set) objA0) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    return C13LP.LLIIJI(arrayList);
                }
                return C08CX.INSTANCE;
            }
        }
        return C08CX.INSTANCE;
    }

    public static void LIZLLL(String str, String str2) {
        Object c098200Yq;
        Integer numLIZJ;
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.aweme.framework.services.StaticServiceImplManager");
            Set setLJ = LJ(cls, str2);
            if (setLJ.isEmpty() || (numLIZJ = LIZJ(cls, LIZ(cls), setLJ)) == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refresh done. package=");
            sbLIZ.append(str);
            sbLIZ.append(" module=");
            sbLIZ.append(str2);
            sbLIZ.append(" serviceCount=");
            sbLIZ.append(setLJ.size());
            sbLIZ.append(" removedEntries=");
            sbLIZ.append(numLIZJ);
            c098200Yq = Integer.valueOf(Log.i("AabSpiCacheRefresher", C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static Set LJ(Class cls, String str) {
        boolean z;
        Object c098200Yq;
        Set set;
        Method method;
        Object c098200Yq2;
        Set setLLIIJI;
        boolean z2;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return LIZIZ(cls);
        }
        try {
            C08EG.LIZ.getClass();
            c098200Yq = C08EG.LIZ(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            C1969907nd c1969907nd = (C1969907nd) c098200Yq;
            Set<String> set2 = c1969907nd.LJFF;
            if (set2.isEmpty()) {
                return C08CX.INSTANCE;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                set = null;
                if (i < length) {
                    method = declaredMethods[i];
                    if (Intrinsics.LJFF(method.getName(), "getAabSpiServiceKeysByProjectPaths") && Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 1 && Set.class.isAssignableFrom(method.getParameterTypes()[0])) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                } else {
                    method = null;
                    break;
                }
            }
            if (method == null) {
                setLLIIJI = C08CX.INSTANCE;
            } else {
                method.setAccessible(true);
                try {
                    c098200Yq2 = C2204961BRm.a0(method, null, new Object[]{set2}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIFGrmkJr93hRTOzcR/NF1yLQjCM8g592TnCI=", null));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                if (c098200Yq2 instanceof Set) {
                    set = (Set) c098200Yq2;
                }
                if (set == null) {
                    setLLIIJI = C08CX.INSTANCE;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (obj instanceof String) {
                            arrayList.add(obj);
                        }
                    }
                    setLLIIJI = C13LP.LLIIJI(arrayList);
                }
            }
            if (setLLIIJI.isEmpty() && (!c1969907nd.LJI.isEmpty())) {
                return c1969907nd.LJI;
            }
            if (!setLLIIJI.isEmpty()) {
                return setLLIIJI;
            }
            return C08CX.INSTANCE;
        }
        LIZ.getClass();
        return LIZIZ(cls);
    }

    public static Integer LIZJ(Class cls, Object obj, Set set) {
        Number number;
        Method method;
        Object c098200Yq;
        boolean z;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int iIntValue = 0;
        int i = 0;
        while (true) {
            number = null;
            if (i < length) {
                method = declaredMethods[i];
                if (Intrinsics.LJFF(method.getName(), "invalidateAabSpiCaches") && method.getParameterCount() == 1 && Set.class.isAssignableFrom(method.getParameterTypes()[0])) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                method = null;
                break;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        if (Modifier.isStatic(method.getModifiers())) {
            obj = null;
        } else if (obj == null) {
            return null;
        }
        try {
            c098200Yq = C2204961BRm.a0(method, obj, new Object[]{set}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOupYY/CyTWLEHdFYsp1PwXSO2QIFGrmkJr93hRTOzcR/NF1yLQjCM8g592TnCI=", null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            return 0;
        }
        if (c098200Yq instanceof Number) {
            number = (Number) c098200Yq;
        }
        if (number != null) {
            iIntValue = number.intValue();
        }
        return Integer.valueOf(iIntValue);
    }
}
