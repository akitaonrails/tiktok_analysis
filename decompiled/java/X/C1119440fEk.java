package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerMonitorEventSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119440fEk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, C1119420fEi c1119420fEi, C1119420fEi c1119420fEi2, RankTypeV2 rankTypeV2, String str) {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str2;
        long jLJJLIIIJ;
        C1846810y9v c1846810y9v;
        C1846810y9v c1846810y9v2;
        if (!LiveRankStickerMonitorEventSetting.INSTANCE.getValue()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        int i2 = -1;
        if (c1119420fEi != null && (c1846810y9v2 = c1119420fEi.LJIIIIZZ) != null) {
            i = c1846810y9v2.LIZ;
        } else {
            i = -1;
        }
        if (c1119420fEi2 != null && (c1846810y9v = c1119420fEi2.LJIIIIZZ) != null) {
            i2 = c1846810y9v.LIZ;
        }
        if (c1119420fEi != null) {
            j = c1119420fEi.LJFF;
        } else {
            j = -1;
        }
        if (c1119420fEi2 != null) {
            j2 = c1119420fEi2.LJFF;
        } else {
            j2 = -1;
        }
        if (c1119420fEi != null) {
            j3 = c1119420fEi.LIZIZ;
        } else {
            j3 = -1;
        }
        if (c1119420fEi2 != null) {
            j4 = c1119420fEi2.LIZIZ;
        } else {
            j4 = -1;
        }
        if (c1119420fEi != null) {
            j5 = c1119420fEi.LJII;
        } else {
            j5 = -1;
        }
        if (c1119420fEi2 != null) {
            j6 = c1119420fEi2.LJII;
        } else {
            j6 = -1;
        }
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        C0K04.LJFF("scenario_name", str, jSONObject);
        C0K04.LJFF("rank_name", rankTypeV2.rankName, jSONObject);
        C0K04.LJFF("user_type", str2, jSONObject);
        C0K04.LIZLLL(i, "current_settle_scene", jSONObject2);
        C0K04.LIZLLL(i2, "new_settle_scene", jSONObject2);
        C0K04.LJ("current_score", j, jSONObject2);
        C0K04.LJ("new_score", j2, jSONObject2);
        C0K04.LJ("current_rank", j3, jSONObject2);
        C0K04.LJ("new_rank", j4, jSONObject2);
        C0K04.LJ("current_settle_rank", j5, jSONObject2);
        C0K04.LJ("new_settle_rank", j6, jSONObject2);
        C0K04.LIZLLL(i, "current_settle_scene", jSONObject3);
        C0K04.LIZLLL(i2, "new_settle_scene", jSONObject3);
        C0K04.LJ("current_score", j, jSONObject3);
        C0K04.LJ("new_score", j2, jSONObject3);
        C0K04.LJ("current_rank", j3, jSONObject3);
        C0K04.LJ("new_rank", j4, jSONObject3);
        C0K04.LJ("current_settle_rank", j5, jSONObject3);
        C0K04.LJ("new_settle_rank", j6, jSONObject3);
        C0K04.LJ("cur_room_id", jLJJLIIIJ, jSONObject3);
        C1CC3 c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();
        if (c1cc3MN2 != null) {
            c1cc3MN2.LJIL("revenue_rank", "ttlive_rank_sticker_invalidate_scene", jSONObject, jSONObject2, jSONObject3);
        }
    }
}
