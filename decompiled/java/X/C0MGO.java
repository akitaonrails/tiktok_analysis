package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0MGO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGO {
    public static final /* synthetic */ int LIZ = 0;

    public static SmartRoute LIZIZ(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, String str9, int i) {
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        String str10 = str9;
        if ((i & 1024) != 0) {
            z4 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = false;
        }
        if ((i & 8192) != 0) {
            z6 = false;
        }
        if ((i & 16384) != 0) {
            str10 = "";
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str5, bundle);
        C786410Ut5.LJJJI("shoot_way", str6, bundle);
        C786410Ut5.LJJIZ(bundle, "customize_type", EnumC0331009p.REFINE);
        C786410Ut5.LJJJI("aimeImageUrl", str2, bundle);
        C786410Ut5.LJJJI("prompt_text", str, bundle);
        C786410Ut5.LJJJI("fixedText", str4, bundle);
        C786410Ut5.LJJJI("styleId", str3, bundle);
        C786410Ut5.LJJJI("root_style_id", str8, bundle);
        C786410Ut5.LJJJI("entrance", str7, bundle);
        bundle.putBoolean("is_main_cover", false);
        bundle.putBoolean("IS_FORCED_DARK_MODE", z4);
        C786410Ut5.LJJJI("style_selected_from", null, bundle);
        bundle.putBoolean("is_from_editor_tab", z5);
        bundle.putBoolean("arg_is_editor_pro_outlinker", z6);
        C786410Ut5.LJJJI("arg_editor_pro_outlinker", str10, bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aime/freeCreate");
        smartRouteBuildRoute.withParam(bundle);
        return smartRouteBuildRoute;
    }

    public static SmartRoute LIZ(Context context, String str, String str2, String str3, String str4, String str5, Integer num, boolean z, String str6, boolean z2, boolean z3, int i, String str7, boolean z4, String str8, int i2) {
        Integer num2 = num;
        boolean z5 = z2;
        String str9 = str6;
        boolean z6 = z4;
        String str10 = str7;
        boolean z7 = z3;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 512) != 0) {
            str9 = null;
        }
        if ((i2 & 1024) != 0) {
            z5 = false;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z7 = false;
        }
        if ((i2 & 8192) != 0) {
            str10 = "";
        }
        if ((i2 & 16384) != 0) {
            z6 = false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "fix_aiself_crash_ve_plugin", true) == 2) {
            CreativeToolsPluginService creativeToolsPluginServiceLIZ = C535670Kzd.LIZ();
            C844470XAv.LIZ.getClass();
            if (!creativeToolsPluginServiceLIZ.LJI(C844470XAv.LIZ())) {
                C535670Kzd.LIZ().LJ(null);
                return SmartRouter.buildRoute(context, "");
            }
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aime/creation/camera");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", (String) null);
        smartRouteBuildRoute.withParam("shoot_way", str2);
        smartRouteBuildRoute.withParam("styleId", str3);
        smartRouteBuildRoute.withParam("prompt_text", str4);
        smartRouteBuildRoute.withParam("entrance", str5);
        smartRouteBuildRoute.withParam("is_regenerate", num2);
        smartRouteBuildRoute.withParam("intro_sheet_shown", z);
        smartRouteBuildRoute.withParam("style_selected_from", str9);
        smartRouteBuildRoute.withParam("is_from_editor_tab", z5);
        smartRouteBuildRoute.withParam("ai_self_is_from_album_ai_tab", i);
        smartRouteBuildRoute.withParam("arg_is_editor_pro_outlinker", z7);
        smartRouteBuildRoute.withParam("arg_editor_pro_outlinker", str10);
        smartRouteBuildRoute.withParam("apply_dm_sticker", z6);
        smartRouteBuildRoute.withParam("creation_id", str8);
        return smartRouteBuildRoute;
    }
}
