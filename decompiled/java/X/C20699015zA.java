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

/* JADX INFO: renamed from: X.15zA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20699015zA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public static SmartRoute LIZ(Context context, PushSettings pushSettings, String str, Integer num) {
        ?? arrayList;
        List list = pushSettings.allDoNotTranslate;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ == null || (arrayList = C13LQ.LJJLL(strArrLIZJ)) == 0) {
            List<ContentLanguage> list2 = pushSettings.selectedDoNotTranslate;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<ContentLanguage> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getLanguageCode());
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
        }
        return LIZIZ(context, list, arrayList, str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Object[]] */
    public static SmartRoute LIZIZ(Context context, List list, List list2, String str, Integer num) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//do_not_translate/language/setting");
        smartRouteBuildRoute.withParam("selected_do_not_translate_codes", (String[]) list2.toArray(new String[0]));
        smartRouteBuildRoute.withParam("all_do_not_translate", (Serializable) list.toArray(new ContentLanguage[0]));
        smartRouteBuildRoute.withParam("enter_from", str);
        if (num != null) {
            smartRouteBuildRoute.withParam("aweme_type", num.intValue());
        }
        return smartRouteBuildRoute;
    }
}
