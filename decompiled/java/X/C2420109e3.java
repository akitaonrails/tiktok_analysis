package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.utils.Deeplink3pH5WhitelistModel;

/* JADX INFO: renamed from: X.09e3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2420109e3 {
    public static final Deeplink3pH5WhitelistModel LIZ = new Deeplink3pH5WhitelistModel(false, false, false, false, null, 31, null);

    public static final Deeplink3pH5WhitelistModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Deeplink3pH5WhitelistModel deeplink3pH5WhitelistModel = LIZ;
        Deeplink3pH5WhitelistModel deeplink3pH5WhitelistModel2 = (Deeplink3pH5WhitelistModel) settingsManagerLIZLLL.LJIIIIZZ("deeplink_3p_h5_whitelist", Deeplink3pH5WhitelistModel.class, deeplink3pH5WhitelistModel);
        return deeplink3pH5WhitelistModel2 != null ? deeplink3pH5WhitelistModel2 : deeplink3pH5WhitelistModel;
    }
}
