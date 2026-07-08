package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.06St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1611706St {
    public static final C1611706St LIZ = new C1611706St();

    public static final void LIZ(Object obj, String str) {
        Object c098200Yq;
        C1598606Ns c1598606Ns;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("dm_group_action_bar_open_live_opt", false) && C1611806Su.LIZ()) {
            Object obj2 = null;
            try {
                Gson gson = C7740030o.LIZ().getGson();
                if (obj instanceof C1598606Ns) {
                    c1598606Ns = (C1598606Ns) obj;
                } else {
                    c1598606Ns = null;
                }
                c098200Yq = gson.LJIILL(c1598606Ns);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            String str2 = (String) obj2;
            Keva kevaLIZJ = C1598206No.LIZJ();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("action_bar_live_button_entrance_data_");
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(curUserId);
            kevaLIZJ.storeString(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }
}
