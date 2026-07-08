package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0tLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661700tLM {
    public static String LIZIZ() {
        try {
            String strRealFindResourceUri = C20005113Pd.LIZ().LIZLLL().realFindResourceUri(0, null, "lens_hdr");
            if (strRealFindResourceUri == null) {
                strRealFindResourceUri = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hdr model raw path: ");
            sbLIZ.append(strRealFindResourceUri);
            C201955140j.LIZIZ("hdr_lens", C2188811AlT.LIZIZ(sbLIZ));
            return strRealFindResourceUri;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static boolean LIZ() {
        String strLIZIZ = LIZIZ();
        if (strLIZIZ.length() == 0) {
            C201955140j.LIZIZ("hdr_lens", "hdr model path empty");
            return false;
        }
        if (!u.LJJIIJZLJL(strLIZIZ, "asset://", false)) {
            return C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_hdr_strategy", true) != 0;
        }
        C201955140j.LIZIZ("hdr_lens", "hdr model not found");
        return false;
    }
}
