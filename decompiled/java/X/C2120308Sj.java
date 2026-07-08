package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08Sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120308Sj {
    public static boolean LIZ;
    public static String LIZIZ;

    public static C0VSJ LIZ(Context context, String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            LIZ = true;
            LIZIZ = str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getApplicationInfo().dataDir);
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append("databases");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.getApplicationInfo().dataDir);
        sbLIZ2.append(str2);
        sbLIZ2.append("dbFiles");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(str2);
        sbLIZ3.append("/tmp");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.endsWith(".db") && !LIZ && !C2120108Sh.LIZLLL(file.getAbsolutePath(), strLIZIZ3, name)) {
                    return null;
                }
                if (LIZ && !TextUtils.isEmpty(LIZIZ) && LIZIZ.equals(name) && !C2120108Sh.LIZLLL(file.getAbsolutePath(), strLIZIZ3, name)) {
                    return null;
                }
            }
        }
        try {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            String str3 = File.separator;
            sbLIZ4.append(str3);
            sbLIZ4.append("db.zip");
            C2120108Sh.LJIIJ(strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ4));
            C2120108Sh.LJII(strLIZIZ3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append(str3);
            sbLIZ5.append("db.zip");
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ5));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
