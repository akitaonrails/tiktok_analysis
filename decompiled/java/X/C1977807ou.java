package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1977807ou {
    public static final Method LIZ;
    public static final ConcurrentHashMap<String, Class<?>> LIZIZ;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Class.forName("dalvik.system.VMDebug").getDeclaredMethod("countInstancesOfClasses", Array.newInstance((Class<?>) Class.class, 0).getClass(), Boolean.TYPE);
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            declaredMethod = null;
        }
        LIZ = declaredMethod;
        LIZIZ = new ConcurrentHashMap<>();
    }

    public static Map LIZ(boolean z, String[] strArr) {
        boolean z2;
        long[] jArr;
        boolean z3;
        long jLongValue;
        int i = 0;
        if (strArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return C2097608Jq.LJ();
        }
        try {
            Method method = LIZ;
            if (method != null) {
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    jArr = null;
                    Class<?> cls = null;
                    if (i2 >= length) {
                        break;
                    }
                    String str = strArr[i2];
                    Class<?> cls2 = LIZIZ.get(str);
                    if (cls2 == null) {
                        try {
                            cls = Class.forName(str);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (cls != null) {
                            LIZIZ.put(str, cls);
                        }
                        cls2 = cls;
                    }
                    if (cls2 != null) {
                        arrayList.add(cls2);
                    }
                    i2++;
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                if (clsArr.length != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3 && clsArr.length == strArr.length) {
                    Object objA0 = C2204961BRm.a0(method, null, new Object[]{clsArr, Boolean.valueOf(z)}, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJgFJAxCBlbRWrERygAfQVwFAtHFf8D", null));
                    if (objA0 instanceof long[]) {
                        jArr = (long[]) objA0;
                    }
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    C13DA c13da = new C13DA(clsArr.length);
                    int length2 = clsArr.length;
                    int i3 = 0;
                    while (i < length2) {
                        int i4 = i3 + 1;
                        String name = clsArr[i].getName();
                        Long lLJJIIJZLJL = C13LQ.LJJIIJZLJL(i3, jArr);
                        if (lLJJIIJZLJL != null) {
                            jLongValue = lLJJIIJZLJL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c13da.put(name, Long.valueOf(jLongValue));
                        i++;
                        i3 = i4;
                    }
                    Map mapBuild = c13da.build();
                    if (mapBuild != null) {
                        return mapBuild;
                    }
                } else {
                    return C2097608Jq.LJ();
                }
            }
            return C2097608Jq.LJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return C2097608Jq.LJ();
        }
    }
}
