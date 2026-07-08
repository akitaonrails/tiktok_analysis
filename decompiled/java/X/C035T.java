package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.035T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035T {
    public static final C035T LIZ = new C035T();

    public static void LIZ(Function0 function0) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("module", "new_arch");
            linkedHashMap.put("type", "exception");
            linkedHashMap.put("message", function0.invoke());
            if (C7879035x.LIZLLL()) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OspErrorLogger reportError: ");
                sbLIZ.append(linkedHashMap);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJII(strLIZIZ);
            }
            C1018503yZ.LIZIZ("rd_tiktokec_osp_custom_track_info", linkedHashMap, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }
}
