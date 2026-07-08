package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721090SQh {
    public static final C721090SQh LIZ = new C721090SQh();

    public static boolean LIZ(PostModeDetailParams postModeDetailParams) {
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (((Boolean) C0AER.LIZ.getValue()).booleanValue()) {
            if (postModeDetailParams != null) {
                postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism;
            } else {
                postModeEntranceMechanism = null;
            }
            if (postModeEntranceMechanism == PostModeEntranceMechanism.EXPLORE_CARD) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZLLL(PostModeDetailParams postModeDetailParams, Aweme aweme, String str, Boolean bool) {
        JSONObject jSONObjectPut;
        if (!LIZ(postModeDetailParams)) {
            return;
        }
        if (bool != null) {
            jSONObjectPut = new JSONObject().put("is_single_activity", bool.booleanValue() ? 1 : 0);
        } else {
            jSONObjectPut = null;
        }
        getClass();
        LIZIZ(postModeDetailParams, aweme, str, "", jSONObjectPut);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LIZIZ(PostModeDetailParams postModeDetailParams, Aweme aweme, String str, String str2, JSONObject jSONObject) {
        String aid;
        String str3;
        String value;
        int awemeType;
        int i;
        int i2;
        int i3;
        PhotoModeIngressEtData photoModeIngressEtData;
        String requestId;
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (!LIZ(postModeDetailParams)) {
            return;
        }
        ?? jSONObject2 = new JSONObject();
        Integer num = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            if (postModeDetailParams != null) {
                aid = postModeDetailParams.awemeId;
            } else {
                aid = null;
            }
        }
        jSONObject2.putOpt("group_id", aid);
        if (postModeDetailParams != null) {
            str3 = postModeDetailParams.eventType;
        } else {
            str3 = null;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        jSONObject2.put("enter_from", str3);
        if (postModeDetailParams != null && (postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) != null) {
            value = postModeEntranceMechanism.getValue();
        } else {
            value = null;
        }
        jSONObject2.putOpt("enter_method", value);
        ?? LJFF = 0;
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = 0;
        }
        jSONObject2.put("aweme_type", awemeType);
        if (aweme != null && (requestId = aweme.getRequestId()) != null) {
            str4 = requestId;
        }
        jSONObject2.put("request_id", str4);
        jSONObject2.put("stage", str);
        jSONObject2.put("reason", str2);
        LIZ.getClass();
        long j = 0;
        if (postModeDetailParams != null && (photoModeIngressEtData = postModeDetailParams.photoModeIngressEtData) != null) {
            long j2 = photoModeIngressEtData.timeStamp;
            if (j2 > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
                if (jElapsedRealtime >= 0) {
                    j = jElapsedRealtime;
                }
            }
        }
        jSONObject2.put("cost_since_enter_ms", j);
        int i4 = 1;
        if (postModeDetailParams != null && postModeDetailParams.isPreviewLightWeight) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject2.put("is_preview_light", i);
        if (postModeDetailParams != null && postModeDetailParams.enableAnimDegrade) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject2.put("enable_anim_degrade", i2);
        if (postModeDetailParams != null && postModeDetailParams.useSwipeEnterAnim) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        jSONObject2.put("use_swipe_enter_anim", i3);
        if (postModeDetailParams == null || !postModeDetailParams.isPlayerPaused) {
            i4 = 0;
        }
        jSONObject2.put("is_player_paused", i4);
        if (postModeDetailParams != null) {
            LJFF = Intrinsics.LJFF(postModeDetailParams.isMuted, Boolean.TRUE);
        }
        jSONObject2.put("is_muted", LJFF);
        if (postModeDetailParams != null) {
            num = postModeDetailParams.modelSource;
        }
        jSONObject2.putOpt("model_source", num);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
        }
        C20684815ws.LJIJ("explore_card_first_frame_trace", jSONObject2);
    }
}
