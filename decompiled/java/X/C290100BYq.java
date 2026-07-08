package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.csrf.CSRFSettingsBean;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0BYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C290100BYq {
    public static final CSRFSettingsBean LIZ = new CSRFSettingsBean(false, false, false, false, false, false, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());

    public static CSRFSettingsBean LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            CSRFSettingsBean cSRFSettingsBean = LIZ;
            CSRFSettingsBean cSRFSettingsBean2 = (CSRFSettingsBean) settingsManagerLIZLLL.LJIIIIZZ("csrf_client_setting", CSRFSettingsBean.class, cSRFSettingsBean);
            return cSRFSettingsBean2 != null ? cSRFSettingsBean2 : cSRFSettingsBean;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
