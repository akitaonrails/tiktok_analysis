package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854420yMC {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(IMessageAbility iMessageAbility, ITakoContextAbility iTakoContextAbility, BaseImage baseImage, Context context, Activity activity, View view, String str) {
        Map<String, String> mapLJ;
        Map<String, String> commonParams;
        if (baseImage == null) {
            return false;
        }
        baseImage.setImageSource("tako_generation_image");
        if (iMessageAbility != null && iMessageAbility.oj()) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("is_resend", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("is_edit", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("interaction_type", "image_to_video_button");
            c830490Whz.put("mode", "image_to_video");
            c830490Whz.put("mode_source", "image_to_video_button");
            c830490Whz.put("generate_type", "video_generation");
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("mode_source", "image_to_video_button"));
            String string = context.getString(2131849905);
            c830490Whz.put("message_type", "text_image");
            List listSingletonList = Collections.singletonList(baseImage);
            EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.CUSTOM;
            if (iTakoContextAbility != null) {
                commonParams = iTakoContextAbility.getCommonParams();
            } else {
                commonParams = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("aigc_type", 2);
            if (!a0.LJJJIL(str)) {
                linkedHashMap.put("image_template_id", str);
            }
            C1858150ySD.LIZIZ(iMessageAbility, string, listSingletonList, null, true, enumC1858090yS7, 6, 2, 0, null, null, commonParams, c830490Whz, false, new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false), null, mapLJIIJ, null, null, 480132);
            return true;
        }
        C0DQF c0dqf = C0DQF.LIZ;
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        AIBotInfo aIBotInfoLIZIZ = C1854260yLw.LIZIZ(iTakoContextAbility);
        if (activity == null) {
            return false;
        }
        c0dqf.LJIIL(activity, view, mapLJ, aIBotInfoLIZIZ);
        return false;
    }
}
