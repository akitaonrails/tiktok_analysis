package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;

/* JADX INFO: renamed from: X.0y4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843520y4c {
    public static final C1843520y4c LIZ = new C1843520y4c();

    public static boolean LIZ() {
        Integer numValueOf;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        return (iPrivacySettingsDepService == null || (numValueOf = Integer.valueOf(iPrivacySettingsDepService.LJJI())) == null || numValueOf.intValue() != 1) ? false : true;
    }
}
