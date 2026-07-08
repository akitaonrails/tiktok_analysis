package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20698915z9 {
    public static List LIZ(PushSettings pushSettings) {
        List<ContentLanguage> list;
        List listLJJLL;
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ == null || (listLJJLL = C13LQ.LJJLL(strArrLIZJ)) == null) {
            if (pushSettings != null && (list = pushSettings.selectedDoNotTranslate) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<ContentLanguage> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getLanguageCode());
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        return listLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.Object[]] */
    public static SmartRoute LIZIZ(Context context, PushSettings pushSettings, String str, Integer num) {
        List list = pushSettings.allDoNotTranslate;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List listLIZ = LIZ(pushSettings);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//do_not_translate/language/settingv2");
        smartRouteBuildRoute.withParam("selected_do_not_translate_codes", (String[]) listLIZ.toArray(new String[0]));
        smartRouteBuildRoute.withParam("all_do_not_translate", (Serializable) list.toArray(new ContentLanguage[0]));
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", "TRANSLATION_SETTING");
        if (num != null) {
            smartRouteBuildRoute.withParam("aweme_type", num.intValue());
        }
        smartRouteBuildRoute.withParam("is_half_sheet", false);
        return smartRouteBuildRoute;
    }
}
