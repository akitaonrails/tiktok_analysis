package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999890c7v {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, n nVar) {
        JSONObject frontendData;
        String strJ3;
        String str;
        C997610c4F c997610c4FLIZJ;
        String nickname = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                IAdTranslationData translationData = awemeRawAd.getTranslationData();
                if ((translationData == null || (c997610c4FLIZJ = C997720c4Q.LIZJ(translationData)) == null || (frontendData = c997610c4FLIZJ.LIZ) == null) && (frontendData = awemeRawAd.getFrontendData()) == null) {
                    strJ3 = null;
                } else {
                    strJ3 = C786410Ut5.J3(frontendData);
                }
                nVar.LJJIIJ("frontendData", strJ3);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str = nativeSiteConfig.lynxScheme;
                } else {
                    str = null;
                }
                nVar.LJJIIJ("lynxSchema", str);
            }
            User author = aweme.getAuthor();
            if (author != null) {
                nickname = author.getNickname();
            }
        }
        nVar.LJJIIJ("accountName", nickname);
    }
}
