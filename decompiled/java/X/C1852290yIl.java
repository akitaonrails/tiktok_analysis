package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCCustomizedColors;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCStyleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852290yIl {
    public static final C1852290yIl LIZ = new C1852290yIl();

    public static void LIZ(Context context, CreativeTemplate creativeTemplate, AIGCStyleConfig aIGCStyleConfig, String str, String str2, String str3, TakoPageContext takoPageContext, Map map, Integer num) {
        AIGCCustomizedColors aIGCCustomizedColors;
        AIGCCustomizedColors aIGCCustomizedColors2;
        String str4 = creativeTemplate.templateId;
        String strLJFF = C1853740yL6.LJFF(creativeTemplate.templateType);
        String str5 = creativeTemplate.templatePrompt;
        String str6 = creativeTemplate.pictureUrl;
        List<String> list = null;
        List<String> list2 = null;
        String str7 = null;
        List listSingletonList = Collections.singletonList(new TakoAITemplates(strLJFF, str5, null, str4, null, creativeTemplate.nameText, creativeTemplate.subTitle, str6, str6, creativeTemplate.assets, creativeTemplate.defaultStdSize, creativeTemplate.videos, 20, null));
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        String str8 = null;
        if (aIGCStyleConfig != null && (aIGCCustomizedColors2 = aIGCStyleConfig.customizedColors) != null) {
            list = aIGCCustomizedColors2.titleColors;
        }
        String json = GsonProtectorUtils.toJson(gsonLIZLLL, list);
        if (aIGCStyleConfig != null && (aIGCCustomizedColors = aIGCStyleConfig.customizedColors) != null) {
            list2 = aIGCCustomizedColors.arrowColors;
        }
        String json2 = GsonProtectorUtils.toJson(gsonLIZLLL, list2);
        String json3 = GsonProtectorUtils.toJson(gsonLIZLLL, listSingletonList);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//tako/template");
        smartRouteBuildRoute.withParam("template_list", json3);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", str2);
        smartRouteBuildRoute.withParam("mode_source", str3);
        if (aIGCStyleConfig != null) {
            str7 = aIGCStyleConfig.backgroundLightUrl;
        }
        smartRouteBuildRoute.withParam("background_light", str7);
        if (aIGCStyleConfig != null) {
            str8 = aIGCStyleConfig.backgroundDarkUrl;
        }
        smartRouteBuildRoute.withParam("background_dark", str8);
        smartRouteBuildRoute.withParam("template_title_colors", json);
        smartRouteBuildRoute.withParam("template_indicator_colors", json2);
        smartRouteBuildRoute.withParam("common_mob_params", GsonProtectorUtils.toJson(gsonLIZLLL, map));
        smartRouteBuildRoute.withParam("tako_page_context", GsonProtectorUtils.toJson(gsonLIZLLL, takoPageContext));
        if (num != null) {
            smartRouteBuildRoute.open(num.intValue());
        } else {
            smartRouteBuildRoute.open();
        }
    }
}
