package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.15zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20699115zB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object[]] */
    public static SmartRoute LIZ(Context context, List list, String str, String str2, Integer num) {
        TranslationLanguageSettingPage.LLJJIJIL = C1839820xye.LIZ().LIZ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//translation/language/setting");
        smartRouteBuildRoute.withParam("translation_language", (Serializable) list.toArray(new ContentLanguage[0]));
        smartRouteBuildRoute.withParam("selected_translation_language_code", TranslationLanguageSettingPage.LLJJIJIL);
        smartRouteBuildRoute.withParam("enter_method", str2);
        smartRouteBuildRoute.withParam("enter_from", str);
        if (num != null) {
            smartRouteBuildRoute.withParam("aweme_type", num.intValue());
        }
        return smartRouteBuildRoute;
    }
}
