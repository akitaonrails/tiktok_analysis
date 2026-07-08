package com.appsflyer.share;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1vSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        String strValueOf = AFb1vSDK.valueOf();
        LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        linkGenerator.setBaseURL(string, string2, context.getPackageName());
        linkGenerator.setReferrerUID(appsFlyerUID);
        linkGenerator.setReferrerCustomerId(strValueOf);
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string3 != null && string3.length() > 3) {
            linkGenerator.setBaseDeeplink(string3);
        }
        return linkGenerator;
    }

    public static void logInvite(Context context, String str, Map<String, String> map) throws Throwable {
        if (TextUtils.isEmpty(str) || AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            return;
        }
        LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
        linkGeneratorGenerateInviteUrl.addParameters(map);
        String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = "af_invite";
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = "af_share";
        }
        HashMap map2 = new HashMap();
        if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
            map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
        }
        map2.put("af_channel", str);
        C2204961BRm.LLJZ(AppsFlyerLib.getInstance(), context, mediaSource, map2, new C0WZX("dzBzEgMqT9naWU4kV1yXbiF8TJaXUZht2OyxTDxOtxbcNg8UWQ==", new String[]{"01c45"}));
    }
}
