package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120208Si {
    public static C0VSJ LIZ(Context context) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getApplicationInfo().dataDir);
        sbLIZ.append("/shared_prefs");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.getApplicationInfo().dataDir);
        sbLIZ2.append("/spFiles");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(File.separator);
        sbLIZ3.append("/tmp");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            for (File file : c0vsj.listFiles()) {
                String name = file.getName();
                if (name.endsWith(".xml") && !C2120108Sh.LIZLLL(file.getAbsolutePath(), strLIZIZ3, name)) {
                    return null;
                }
            }
        }
        try {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            String str = File.separator;
            sbLIZ4.append(str);
            sbLIZ4.append("sp.zip");
            C2120108Sh.LJIIJ(strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ4));
            C2120108Sh.LJII(strLIZIZ3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append(str);
            sbLIZ5.append("sp.zip");
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ5));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
