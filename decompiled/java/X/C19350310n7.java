package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.10n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19350310n7 {
    public static String LIZ(long j) {
        try {
            C19374510r1.LIZ.getClass();
            if (C19374510r1.LIZJ && Build.VERSION.SDK_INT >= 24) {
                CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(j), new C19348710mr(EnumC19356510o7.DECIMAL, EnumC19356310o5.COMPACT, EnumC826620Wbk.SHORT), null, 0, 28);
                if (charSequenceLIZ != null) {
                    return (String) charSequenceLIZ;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (j < 0) {
            return String.valueOf(0);
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            String strLIZIZ = LIZIZ(j, 1000L, "");
            if (strLIZIZ.equals("1000.0")) {
                return "1.0M";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            String strLIZIZ2 = LIZIZ(j, 1000000L, "");
            if (strLIZIZ2.equals("1000.0")) {
                return "1.0B";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return LIZIZ(j, 1000000000L, "B");
    }

    public static String LIZIZ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
