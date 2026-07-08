package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08RK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RK {
    public static final Set<String> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZ(String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.isDirectory()) {
                return;
            }
            String canonicalPath = c0vsj.getCanonicalPath();
            long jLastModified = c0vsj.lastModified();
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, "effect_dir.ok");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0vsj2.getAbsolutePath());
                sbLIZ.append(".tmp");
                C0VSJ c0vsj3 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("v1 ");
                sbLIZ2.append(jLastModified);
                sbLIZ2.append(' ');
                sbLIZ2.append(length);
                C09BH.LJIIIZ(c0vsj3, C2188811AlT.LIZIZ(sbLIZ2), Charsets.UTF_8);
                if (c0vsj3.renameTo(c0vsj2)) {
                    LIZ.add(canonicalPath);
                } else {
                    c0vsj3.delete();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
