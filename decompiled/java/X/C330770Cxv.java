package X;

import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Cxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330770Cxv {
    public static final C330770Cxv LIZ = new C330770Cxv();

    public static EnumC330740Cxs LIZ(Aweme aweme) {
        IPrivacyService iPrivacyService;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ;
        Integer numLIZ;
        if (C729510SjV.LJJIJIL(aweme)) {
            return EnumC330740Cxs.STORY_VIEWER_LIST;
        }
        if (aweme != null && !C729510SjV.LJJIJIL(aweme) && C330780Cxw.LIZIZ.LIZIZ() && (iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null)) != null && (privacyUserSettingsV2LJIIIIZZ = iPrivacyService.LJIIIIZZ()) != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("video_view_history")) != null && numLIZ.intValue() == 1) {
            return EnumC330740Cxs.POST_VIEWER_LIST;
        }
        return EnumC330740Cxs.POST_LIKE_LIST;
    }

    public static C0SEI LIZIZ(Aweme aweme) {
        if (C330750Cxt.LIZ[LIZ(aweme).ordinal()] == 1) {
            return new C0SEI(2131756059, R.string.kz3, 2131833939, 2131755724, 2131849019);
        }
        return new C0SEI();
    }
}
