package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dalvik.system.PathClassLoader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.145e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202080145e {
    public static final Class LIZLLL;
    public final String LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public final ClassLoader LIZJ;

    static {
        try {
            LIZLLL = Class.forName("java.lang.BootClassLoader");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202080145e.LIZ():java.util.List");
    }

    public final C1489405sK LIZIZ() {
        Class cls;
        if (!C202079145d.LIZIZ()) {
            return C1489405sK.LIZJ;
        }
        ArrayList arrayList = (ArrayList) LIZ();
        if (arrayList.isEmpty()) {
            return C1489405sK.LIZJ;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        ClassLoader classLoader = this.LIZJ;
        if (classLoader == null) {
            return C1489405sK.LIZJ;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        int i2 = 0;
        for (String str : strArr) {
            try {
                i++;
                if (Class.forName(str, false, classLoader).getClassLoader() != classLoader && !(classLoader instanceof PathClassLoader) && (((cls = LIZLLL) == null || !cls.isInstance(classLoader)) && C202089145n.LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LoadClasses: class load error, ");
                    sbLIZ.append(str);
                    sbLIZ.append(" loader: ");
                    sbLIZ.append(classLoader.getClass().getName());
                    sbLIZ.append(classLoader.hashCode());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                i2++;
                if (C202089145n.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LoadClasses: class not found ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LoadClasses: load ");
        sbLIZ3.append(i);
        sbLIZ3.append(", ");
        sbLIZ3.append(i2);
        sbLIZ3.append(" not found, took ");
        sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ3);
        return new C1489405sK(i, i2);
    }

    public C202080145e(String str, ClassLoader classLoader) {
        this.LIZJ = null;
        this.LIZ = str;
        if (classLoader instanceof PathClassLoader) {
            this.LIZJ = classLoader;
        }
    }
}
