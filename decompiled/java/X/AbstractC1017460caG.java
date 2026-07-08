package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0caG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1017460caG {
    public static boolean LIZ(Context context, Aweme aweme, int i) {
        String openUrl;
        String webUrl = aweme.getAwemeRawAd().getWebUrl();
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (TextUtils.isEmpty(webUrl)) {
            webUrl = "";
        }
        Uri uri = UriProtector.parse(webUrl);
        if (aweme.getAwemeRawAd().getShouldWebUrlJumpThirdApp() && AbstractC1025070cmX.LJIIL(uri) && C1025140cme.LIZJ(context, uri)) {
            if (iAdSceneService != null) {
                iAdSceneService.LIZIZ();
                C1022290ci3.LJ(context, aweme, i);
            }
            return true;
        }
        if (C1017070cZd.LLLF(aweme) && i == 8) {
            TextUtils.isEmpty(aweme.getAid());
            return true;
        }
        if (C1017550caP.LIZ(context, aweme)) {
            if (iAdSceneService != null) {
                iAdSceneService.LIZIZ();
                C1022290ci3.LJ(context, aweme, i);
            }
            return true;
        }
        String creativeIdStr = null;
        if (aweme.getAwemeRawAd() != null && (openUrl = aweme.getAwemeRawAd().getOpenUrl()) != null && a0.LJJIIZI(openUrl, "enter_method=brand_mission_search", false)) {
            String strLIZ = C1026350cob.LIZ(i);
            if (aweme.getAwemeRawAd() != null) {
                creativeIdStr = aweme.getAwemeRawAd().getCreativeIdStr();
            }
            C0P9G.LJ(C0PON.LIZ(strLIZ, creativeIdStr));
        } else {
            C0PON.LIZ = null;
        }
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            if (C1022290ci3.LJ(context, aweme, i) && !C1017070cZd.LJJJJLI(aweme) && !C1017070cZd.LJIIJ(aweme) && !((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZJ(aweme)) {
                return true;
            }
        }
        return false;
    }
}
