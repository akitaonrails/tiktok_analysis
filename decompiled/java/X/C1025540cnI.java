package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAiPdpActionModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAiPdpJumpDataModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterQuickActionModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BrowserConfig;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.AiPdpActionModel;
import com.ss.android.ugc.aweme.feed.model.ad.AiPdpJumpDataModel;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0cnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025540cnI {
    public static final QuickActionModel LIZIZ(CRouterQuickActionModel cRouterQuickActionModel) {
        AiPdpActionModel aiPdpActionModel;
        Integer quickActionType = cRouterQuickActionModel.getQuickActionType();
        String shopifyPid = cRouterQuickActionModel.getShopifyPid();
        Boolean enablePrefetch = cRouterQuickActionModel.getEnablePrefetch();
        String pdpUrl = cRouterQuickActionModel.getPdpUrl();
        CRouterAiPdpActionModel aiPdpActionModel2 = cRouterQuickActionModel.getAiPdpActionModel();
        AiPdpJumpDataModel aiPdpJumpDataModel = null;
        if (aiPdpActionModel2 != null) {
            CRouterAiPdpJumpDataModel jumpData = aiPdpActionModel2.getJumpData();
            if (jumpData != null) {
                aiPdpJumpDataModel = new AiPdpJumpDataModel(jumpData.getLynxSchema(), jumpData.getGeckoChannel(), jumpData.getFrontendData());
            }
            aiPdpActionModel = new AiPdpActionModel(aiPdpJumpDataModel);
        } else {
            aiPdpActionModel = null;
        }
        return new QuickActionModel(quickActionType, shopifyPid, enablePrefetch, pdpUrl, aiPdpActionModel);
    }

    public static final BrowserConfig LIZJ(com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig browserConfig) {
        Integer num;
        String str;
        String str2;
        Long l;
        Integer num2 = null;
        if (browserConfig != null) {
            num2 = browserConfig.useAndroidCustomTab;
            num = browserConfig.enableReplaceWebUrl;
            str = browserConfig.targetUrlPrefix;
            str2 = browserConfig.clickId;
            l = browserConfig.actInternalTime;
        } else {
            num = null;
            str = null;
            str2 = null;
            l = null;
        }
        return new BrowserConfig(num2, num, str, str2, l);
    }

    public static final AdlpExtraModel LIZ(Aweme aweme, C1025520cnG c1025520cnG, String str, NonAdWebModel nonAdWebModel, String str2, CRouterQuickActionModel cRouterQuickActionModel, AiAgentConfig aiAgentConfig) {
        User author;
        String requestId;
        String aid;
        Video video;
        User author2;
        QuickActionModel quickActionModelLIZIZ = null;
        if (aweme != null) {
            author = aweme.getAuthor();
            requestId = aweme.getRequestId();
            aid = aweme.getAid();
            video = aweme.getVideo();
        } else {
            author = null;
            requestId = null;
            aid = null;
            video = null;
        }
        String str3 = c1025520cnG.LIZLLL;
        if (aweme != null) {
            author2 = aweme.getAuthor();
        } else {
            author2 = null;
        }
        UrlModel urlModelLIZLLL = C10EU.LIZLLL(author2);
        if (cRouterQuickActionModel != null) {
            quickActionModelLIZIZ = LIZIZ(cRouterQuickActionModel);
        }
        return new AdlpExtraModel(author, requestId, aid, video, null, str3, 0, 0, 0, nonAdWebModel, urlModelLIZLLL, null, null, null, null, str, str2, quickActionModelLIZIZ, null, null, aiAgentConfig, null);
    }
}
