package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403740mdI {
    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getCreativeFlowData().getPublishConfig().getMatureTheme() == 1) {
            return true;
        }
        return false;
    }

    public static final Map<String, String> LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("creation_id", videoPublishEditModel.getCreationId()), new Pair("content_source", videoPublishEditModel.getAvetParameter().getContentSource()), new Pair("content_type", C1428470nHB.LJIILL(videoPublishEditModel)));
    }

    public static final Map<String, String> LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        Map mapLJIIIIZZ;
        Map<String, String> mapLIZ = LIZ(videoPublishEditModel, str);
        String str2 = "on";
        if (z) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "on"), new Pair("changable", CardStruct.IStatusCode.DEFAULT));
        } else {
            Pair[] pairArr = new Pair[2];
            if (!LIZJ(videoPublishEditModel)) {
                str2 = "off";
            }
            pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
            pairArr[1] = new Pair("changable", "1");
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        }
        return C2097608Jq.LJIIL(mapLIZ, mapLJIIIIZZ);
    }
}
