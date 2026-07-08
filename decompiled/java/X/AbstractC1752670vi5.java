package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1752670vi5 {
    public final Map<String, Object> LIZ;

    public abstract String LIZ();

    public final void LIZIZ() {
        try {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            String strLIZ = LIZ();
            String strLIZLLL = C1280004ze.LIZLLL(this.LIZ);
            if (strLIZLLL == null) {
                strLIZLLL = "{}";
            }
            iEventCenterLIZ.LIZ(strLIZ, strLIZLLL);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pdp_container: eventName: ");
            sbLIZ.append(LIZ());
            sbLIZ.append(", data: ");
            sbLIZ.append(this.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public AbstractC1752670vi5(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        linkedHashMap.put("product_id", str);
    }
}
