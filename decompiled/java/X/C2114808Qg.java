package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: X.08Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114808Qg {
    public static volatile String LIZ;

    public static long LIZIZ(Context context) {
        String str;
        try {
            File fileLIZLLL = C2114508Qd.LIZLLL("", context.getApplicationInfo().sourceDir);
            if (fileLIZLLL != null) {
                if (Build.SUPPORTED_64_BIT_ABIS.length == 0) {
                    str = "oat/arm/base.art";
                } else {
                    str = "oat/arm64/base.art";
                }
                File fileLIZJ = C2114508Qd.LIZJ(fileLIZLLL.getParentFile(), str);
                if (fileLIZJ != null && fileLIZJ.isFile()) {
                    long length = fileLIZJ.length();
                    if (length <= 0) {
                        return 0L;
                    }
                    return length / 1024;
                }
                return -1L;
            }
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public static void LIZ(File file, String str, Map<String, Integer> map) {
        if (!str.endsWith(".apk")) {
            return;
        }
        String strSubstring = str.substring(0, str.length() - 4);
        if (!LIZJ(file, strSubstring, ".vdex")) {
            return;
        }
        if (!LIZJ(file, strSubstring, ".odex")) {
            LIZLLL(1, strSubstring, map);
        } else if (!LIZJ(file, strSubstring, ".art")) {
            LIZLLL(3, strSubstring, map);
        } else {
            LIZLLL(7, strSubstring, map);
        }
    }

    public static boolean LIZJ(File file, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        File fileLIZJ = C2114508Qd.LIZJ(file, C2188811AlT.LIZIZ(sbLIZ));
        if (fileLIZJ != null && fileLIZJ.isFile()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(int i, String str, Map map) {
        String strSubstring = "base";
        if ("base".equals(str) || (str.startsWith("split_") && (strSubstring = str.substring(6)) != null)) {
            map.put(strSubstring, Integer.valueOf(i));
        }
    }
}
