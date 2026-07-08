package X;

import com.bytedance.android.livesdk.game.data.AudienceCommentGiftGuideInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fB1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117130fB1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1117140fB2 c1117140fB2) {
        int iLIZIZ;
        String strLIZ;
        AudienceCommentGiftGuideInfo audienceCommentGiftGuideInfo;
        String str;
        try {
            if (!c1117140fB2.LIZ().contains(1)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("gift_guide_src", Integer.valueOf(c1117140fB2.LIZ));
            C204543151x c204543151x = c1117140fB2.LIZIZ;
            if (c204543151x != null) {
                jSONObject.putOpt("message_type", Integer.valueOf(c204543151x.LIZIZ()));
            }
            AudienceCommentGiftGuideInfo audienceCommentGiftGuideInfo2 = c1117140fB2.LIZJ;
            if (audienceCommentGiftGuideInfo2 != null) {
                jSONObject.putOpt("comment_type", Integer.valueOf(audienceCommentGiftGuideInfo2.commentType));
            }
            jSONObject.putOpt("message_effect_array", new JSONArray((Collection) c1117140fB2.LIZ()));
            int i = c1117140fB2.LIZ;
            if (i != 1) {
                strLIZ = "";
                if (i == 2 && (audienceCommentGiftGuideInfo = c1117140fB2.LIZJ) != null && (str = audienceCommentGiftGuideInfo.matchValue) != null) {
                    strLIZ = str;
                }
            } else {
                C204543151x c204543151x2 = c1117140fB2.LIZIZ;
                if (c204543151x2 != null) {
                    iLIZIZ = c204543151x2.LIZIZ();
                } else {
                    iLIZIZ = -1;
                }
                strLIZ = C778700Uge.LIZ(iLIZIZ);
            }
            jSONObject.putOpt("sub_trigger_name", strLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            C20430714wz.LIZ("livesdk_custom_log_game_gift_guide_v2", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
            C1AF0.LJ(e);
        }
    }
}
