package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;

/* JADX INFO: renamed from: X.0Byl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305810Byl {
    public static final TcmConfig LIZ() {
        try {
            return (TcmConfig) SettingsManager.LIZLLL().LJIIIIZZ("tcm_config", TcmConfig.class, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }
}
