package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BCB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BCB {
    public static C1BCE LIZ(Method method) {
        C1BCF c1bcf = (C1BCF) method.getAnnotation(C1BCF.class);
        if (c1bcf != null) {
            C1BCE c1bce = new C1BCE();
            c1bce.LIZ = c1bcf.distinctId();
            c1bce.LIZIZ = c1bcf.taskPriority();
            c1bce.LIZLLL = c1bcf.dependencyRes();
            c1bce.LIZJ = c1bcf.scene();
            c1bce.LJFF = c1bcf.taskType();
            c1bce.LJ = c1bcf.taskGroup();
            return c1bce;
        }
        return null;
    }

    public static C1BCE LIZJ(String str) {
        int iIndexOf;
        int i;
        try {
            Class<?> cls = Class.forName(str.substring(0, str.length() - 26));
            if (cls != null && (iIndexOf = str.indexOf("Lambda")) >= 0 && (i = iIndexOf + 6) < str.length()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.c);
                sbLIZ.append(str.substring(i));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method.getName().startsWith("lambda$") && method.getName().endsWith(strLIZIZ)) {
                            return LIZ(method);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return null;
        } catch (ClassNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return null;
    }

    public static C1BCE LIZIZ(Class<?> cls, String str) {
        try {
            C1BCE c1bceLIZ = LIZ(cls.getMethod(str, new Class[0]));
            if (c1bceLIZ == null) {
                String name = cls.getName();
                if (name.contains("$$ExternalSyntheticLambda")) {
                    return LIZJ(name);
                }
                return c1bceLIZ;
            }
            return c1bceLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
