package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.exp.SharePostBannerCoverUrl;

/* JADX INFO: renamed from: X.01bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C368501bv {
    public static final SharePostBannerCoverUrl LIZ = new SharePostBannerCoverUrl("", "");

    public static String LIZ(boolean z) {
        String str;
        String str2;
        if (z) {
            SharePostBannerCoverUrl sharePostBannerCoverUrl = (SharePostBannerCoverUrl) SettingsManager.LIZLLL().LJIIIIZZ("im_share_post_banner_cover_url_config", SharePostBannerCoverUrl.class, LIZ);
            if (sharePostBannerCoverUrl != null && (str2 = sharePostBannerCoverUrl.coverDarkUrl) != null) {
                return str2;
            }
        } else {
            SharePostBannerCoverUrl sharePostBannerCoverUrl2 = (SharePostBannerCoverUrl) SettingsManager.LIZLLL().LJIIIIZZ("im_share_post_banner_cover_url_config", SharePostBannerCoverUrl.class, LIZ);
            if (sharePostBannerCoverUrl2 != null && (str = sharePostBannerCoverUrl2.coverLightUrl) != null) {
                return str;
            }
        }
        return "";
    }
}
