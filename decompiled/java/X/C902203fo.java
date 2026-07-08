package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PipoCashierBnplEventTrackConfig;

/* JADX INFO: renamed from: X.03fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C902203fo {
    public static final PipoCashierBnplEventTrackConfig LIZ = new PipoCashierBnplEventTrackConfig(true, true, true, true);

    public static final PipoCashierBnplEventTrackConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoCashierBnplEventTrackConfig pipoCashierBnplEventTrackConfig = LIZ;
        PipoCashierBnplEventTrackConfig pipoCashierBnplEventTrackConfig2 = (PipoCashierBnplEventTrackConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_cashier_bnpl_event_track", PipoCashierBnplEventTrackConfig.class, pipoCashierBnplEventTrackConfig);
        return pipoCashierBnplEventTrackConfig2 != null ? pipoCashierBnplEventTrackConfig2 : pipoCashierBnplEventTrackConfig;
    }
}
