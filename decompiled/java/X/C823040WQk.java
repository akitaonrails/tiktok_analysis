package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823040WQk {
    public static volatile Field LIZ;
    public static volatile Field LIZIZ;

    public static Object LIZ(Object obj) {
        try {
            if (LIZ == null) {
                synchronized (C823040WQk.class) {
                    try {
                        if (LIZ == null) {
                            LIZ = obj.getClass().getDeclaredField("callable");
                            LIZ.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return LIZ.get(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZIZ(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!className.contains("libcore.io") && !className.contains("java.io") && !className.contains("android.database.sqlite") && !className.contains("android.database.AbstractCursor") && !className.contains("dalvik.system") && !className.contains("android.os") && !className.contains("com.ss.android.ugc.conan") && !className.contains("com.lody.whale")) {
                        String methodName = stackTraceElement.getMethodName();
                        if (!methodName.equals("getThreadStackTrace") && !methodName.equals("getStackTrace")) {
                            sb.append("\tat ");
                            sb.append(stackTraceElement.getClassName());
                            sb.append(e3.d);
                            sb.append(stackTraceElement.getMethodName());
                            sb.append(e3.h);
                            sb.append(stackTraceElement.getFileName());
                            sb.append(":");
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")\n");
                        }
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String LIZJ(Object obj) {
        Object obj2;
        Object objLIZ;
        if ((obj instanceof FutureTask) && (objLIZ = LIZ(obj)) != null) {
            obj = objLIZ;
        }
        if ("java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName())) {
            try {
                if (LIZIZ == null) {
                    synchronized (C823040WQk.class) {
                        try {
                            if (LIZIZ == null) {
                                LIZIZ = obj.getClass().getDeclaredField("task");
                                LIZIZ.setAccessible(true);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                obj2 = LIZIZ.get(obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj2 = null;
            }
            if (obj2 != null) {
                obj = obj2;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!LIZLLL(obj.getClass())) {
            String string = obj.toString();
            int iIndexOf = string.indexOf(e3.g);
            if (iIndexOf > 0) {
                string = string.substring(0, iIndexOf);
            }
            sb.append(string);
            sb.append(",");
        }
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null) {
                    Class<?> cls = obj3.getClass();
                    if (!LIZLLL(cls)) {
                        String name = cls.getName();
                        int iIndexOf2 = name.indexOf(e3.g);
                        if (iIndexOf2 > 0) {
                            name = name.substring(0, iIndexOf2);
                        }
                        sb.append(name);
                        sb.append(",");
                    }
                }
            }
        } catch (Exception e2) {
        }
        return sb.toString().replaceAll("class ", "");
    }

    public static boolean LIZLLL(Class cls) {
        String name = cls.getName();
        if (!"java.lang.Integer".equals(name) && !"java.lang.Boolean".equals(name) && !"java.lang.Long".equals(name) && !"java.lang.Float".equals(name) && !"java.lang.Double".equals(name) && !"java.lang.String".equals(name) && !"sun.misc.Unsafe".equals(name) && !"v7.o".equals(name) && !"java.util.ArrayList".equals(name) && !name.contains("android.os.Handler") && !name.contains("com.bytedance.common.utility.collection.WeakHandler") && !name.contains("java.util.concurrent.Executors$RunnableAdapter") && !name.contains("bolts.Task") && !cls.isPrimitive()) {
            return false;
        }
        return true;
    }
}
