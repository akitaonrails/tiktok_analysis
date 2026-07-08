package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800360VaU {
    public static C800390VaX LIZ;

    public static void LIZ(int i) {
        Object c098200Yq;
        List<? extends C0VYZ> list;
        C800390VaX c800390VaX = LIZ;
        if (c800390VaX == null || !c800390VaX.LIZJ) {
            return;
        }
        try {
            String strLIZLLL = C0VZT.LIZLLL();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("relativeViewType", "H5");
            jSONObject.put("containerType", "Activity");
            jSONObject.put("containerName", "org.chromium.chrome.browser.customtabs.CustomTabActivity");
            jSONObject.put("caller", strLIZLLL);
            jSONObject.put("callee", "org.chromium.chrome.browser.customtabs.CustomTabActivity");
            jSONObject.put("dataflowId", i);
            jSONObject.put("is_interior", EnumC800450Vad.THIRD.name());
            jSONObject.put("is_iab", 0);
            jSONObject.put("jumpTimes", 0);
            C799540VYa c799540VYa = new C799540VYa(false, true, 1);
            C800390VaX c800390VaX2 = LIZ;
            if (c800390VaX2 != null && (list = c800390VaX2.LJII) != null) {
                Iterator<? extends C0VYZ> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(jSONObject, c799540VYa);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CCT monitor: ");
            sbLIZ.append(jSONObject);
            c098200Yq = Integer.valueOf(Log.d("BDSec.Navigate.Monitor", C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C0VZK.LIZ(thM5exceptionOrNullimpl, "chrome_custom_tab_reporter_reportCCT_error", C2097608Jq.LJIIJ(new Pair("message", "chrome_custom_tab_reporter_reportCCT_error")));
        }
    }
}
