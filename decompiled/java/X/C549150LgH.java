package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0LgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549150LgH {
    public static final C549150LgH LIZ = new C549150LgH();

    public static boolean LIZ(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MentionDataItem mentionDataItem = (MentionDataItem) it2.next();
                Regex regex = C549450Lgl.LIZ;
                if (mentionDataItem.cameoId != null && !C123100dR.LIZ(mentionDataItem.generatingTaskId)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZIZ(Context context) {
        C547930LeJ.LIZIZ(C1388190mED.LIZ(context), 2131826231, new Object[0]);
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E39 c1e39 = C1E39.LJIIIIZZ;
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(378);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e39, null, aFwS239S0000000_8);
    }

    public static void LIZJ(Activity activity) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(activity, C546540Lc4.LIZ(AIGC.AICreationSceneName.CHAT_AI_THEATER.INSTANCE.getValue()), true);
        } else {
            C547930LeJ.LIZIZ(activity, 2131826241, new Object[0]);
        }
    }
}
