package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0v1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726420v1k {
    public static final C1726420v1k LIZ = new C1726420v1k();

    public static C2218561BsM LIZ(String str, String str2) {
        String str3;
        String strLIZIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C2218571BsN.LIZJ().LJIIZILJ(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof C1722250uv1) {
                str3 = "NumberParseException";
            } else {
                str3 = "Exception";
            }
            if (e.getMessage() == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append(" Message is null");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str3);
                sbLIZ2.append(':');
                sbLIZ2.append(e.getMessage());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C2338609Ei.LIZ.getClass();
            C2338609Ei.LIZ(207, strLIZIZ, str, str2, "", str2);
            return null;
        }
    }
}
