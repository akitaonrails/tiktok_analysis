package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;

/* JADX INFO: renamed from: X.107Q, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107Q {
    public static final C107Q LIZ = new C107Q();

    public static int LIZ() {
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        return (iPrivacySettingsDepService == null || !iPrivacySettingsDepService.LJIIIIZZ()) ? 2131824525 : 2131827587;
    }
}
