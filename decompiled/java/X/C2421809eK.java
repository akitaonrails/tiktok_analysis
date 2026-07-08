package X;

import android.app.Application;
import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: X.09eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421809eK {
    public static Application LIZ = null;
    public static String LIZIZ = "defaultmd5";
    public static String LIZJ;

    public static synchronized String LIZIZ() {
        return LIZIZ;
    }

    public static synchronized String LIZJ() {
        if (LIZJ == null) {
            String string = C2418109dj.LIZLLL().LJ().getString("key.meta.md5", "defaultmd5");
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getString ");
            sbLIZ.append("key.meta.md5");
            sbLIZ.append(" ");
            sbLIZ.append(string);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LIZJ = string;
        }
        return LIZJ;
    }

    public static ClassLoader LIZ(ClassLoader classLoader) {
        if (classLoader == null) {
            return null;
        }
        if (classLoader.getClass().equals(PathClassLoader.class)) {
            return classLoader;
        }
        return LIZ(classLoader.getParent());
    }

    public static String LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(String str, boolean z) {
        C2418109dj.LIZLLL().LJ().edit().putBoolean(str, z).apply();
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putBoolean ");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        sbLIZ.append(z);
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }
}
