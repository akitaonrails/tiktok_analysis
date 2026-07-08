package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;

/* JADX INFO: renamed from: X.0y4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843530y4d {
    public static final CharSequence LIZ(Context context, String str, boolean z) {
        String string = context.getString(2131829275);
        C1843520y4c.LIZ.getClass();
        if (C1843520y4c.LIZ()) {
            return C1843460y4W.LIZIZ(C1843460y4W.LIZ, string, z, context, str);
        }
        return string;
    }

    public static final CharSequence LIZIZ(Context context, String str, boolean z) {
        Integer numValueOf;
        String string = context.getString(2131829278);
        C1843520y4c.LIZ.getClass();
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null && (numValueOf = Integer.valueOf(iPrivacySettingsDepService.LJJI())) != null && numValueOf.intValue() == 2) {
            C1843460y4W.LIZ.getClass();
            return C1843460y4W.LIZJ(context, string, str, z);
        }
        return string;
    }
}
