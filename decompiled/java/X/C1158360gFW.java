package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.ab.PipoPinManageVcConnectSettings;

/* JADX INFO: renamed from: X.0gFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158360gFW {
    public static final C1158360gFW LIZ = new C1158360gFW();

    public static final boolean LIZ() {
        Boolean bool;
        LIZ.getClass();
        PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel pipoPinManageVcConnectModelLIZIZ = LIZIZ();
        if (pipoPinManageVcConnectModelLIZIZ == null || (bool = pipoPinManageVcConnectModelLIZIZ.enable) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel LIZIZ() {
        Object c098200Yq;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            c098200Yq = PipoPinManageVcConnectSettings.LIZ;
            PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel pipoPinManageVcConnectModel = (PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_pin_manage_vc_connect", PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel.class, c098200Yq);
            if (pipoPinManageVcConnectModel != null) {
                c098200Yq = pipoPinManageVcConnectModel;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (PipoPinManageVcConnectSettings.PipoPinManageVcConnectModel) c098200Yq;
    }
}
