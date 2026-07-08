package X;

import java.util.HashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07kM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949607kM {
    public static final C01GW<C1949607kM> LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(956));
    public final HashMap<String, C1949707kN> LIZ;

    public C1949607kM() {
        HashMap<String, C1949707kN> map = new HashMap<>();
        this.LIZ = map;
        map.put("(?:share/)?question/[^/?]*-(\\d+)(?=(?:[?/]|$))", new C1949707kN(new String[]{"//qna/detail/"}, "com.ss.android.ugc.aweme.deeplink.actions.QnAAction"));
        map.put("bulletin_board", new C1949707kN(new String[]{"//bulletin_board"}, "com.ss.android.ugc.aweme.deeplink.actions.BulletinBoardPageAction"));
        map.put("messages/streak", new C1949707kN(new String[]{"//streak/invite"}, "com.ss.android.ugc.aweme.deeplink.actions.OpenStreakInviteAction"));
        map.put("minis/", new C1949707kN(new String[]{"//minis"}, "com.ss.android.ugc.aweme.minis.route.deeplink.MinisLinkHandler"));
        map.put("previewDraftVideo", new C1949707kN(new String[]{"//previewDraftVideo"}, "com.ss.android.ugc.aweme.preview.WebPreviewAction"));
        map.put("shortdrama/episode/[a-z]{2}/(\\d+)/(\\d+)", new C1949707kN(new String[]{"//shortdrama/episode"}, "com.ss.android.ugc.aweme.series.deeplink.DramaInnerFeedAction"));
        map.put("third-party-oauth-redirect/commerce/buy-with-amazon", new C1949707kN(new String[]{"//third-party-oauth-redirect/commerce/buy-with-amazon"}, "com.ss.android.ugc.aweme.deeplink.actions.commerce.BuyWithAmazonAuthAction"));
        map.put("third-party-oauth-redirect/music/amazon", new C1949707kN(new String[]{"//third-party-oauth-redirect/music/amazon"}, "com.ss.android.ugc.aweme.deeplink.actions.music.AmazonMusicAuthAction"));
        map.put("third-party-oauth-redirect/music/anghami", new C1949707kN(new String[]{"//third-party-oauth-redirect/music/anghami"}, "com.ss.android.ugc.aweme.deeplink.actions.music.AnghamiMusicAuthAction"));
        map.put("third-party-oauth-redirect/music/deezer", new C1949707kN(new String[]{"//third-party-oauth-redirect/music/deezer"}, "com.ss.android.ugc.aweme.deeplink.actions.music.DeezerMusicAuthAction"));
        map.put("third-party-oauth-redirect/music/melon", new C1949707kN(new String[]{"//third-party-oauth-redirect/music/melon"}, "com.ss.android.ugc.aweme.deeplink.actions.music.MelonMusicAuthAction"));
        map.put("third-party-oauth-redirect/music/soundcloud", new C1949707kN(new String[]{"//third-party-oauth-redirect/music/soundcloud"}, "com.ss.android.ugc.aweme.deeplink.actions.music.SoundCloudMusicAuthAction"));
        map.put("ucenter_web/deeplink/account/risk_notification", new C1949707kN(new String[]{"//ucenter_web/deeplink/account/risk_notification"}, "com.ss.android.ugc.aweme.deeplink.actions.RiskNotificationAction"));
        map.put("ucenter_web/deeplink/email_verification", new C1949707kN(new String[]{"//ucenter_web/deeplink/email_verification"}, "com.ss.android.ugc.aweme.deeplink.actions.EmailVerificationAction"));
        map.put("ucenter_web/m2/deeplink/email_verification", new C1949707kN(new String[]{"//ucenter_web/deeplink/email_verification"}, "com.ss.android.ugc.aweme.deeplink.actions.EmailVerificationAction"));
        map.put("ucenter_web/passkey_wizard", new C1949707kN(new String[]{"//passkey/wizard/create"}, "com.ss.android.ugc.aweme.deeplink.actions.PasskeyWizardAction"));
        map.put("v2/h5/auth/authorize", new C1949707kN(new String[]{"//v2/authorize"}, "com.ss.android.ugc.aweme.deeplink.actions.AuthorizationAction"));
    }
}
