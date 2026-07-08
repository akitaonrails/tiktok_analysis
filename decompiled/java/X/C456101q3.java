package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveBoardsAudienceReportSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveBoardsHostReportIntervalTime;
import com.bytedance.android.livesdk.sei.BoardItemSeiData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C456101q3 implements InterfaceC456501q7 {
    public static DataChannel LIZIZ;
    public static InterfaceC768780UDs LIZJ;
    public static C054G LJ;
    public static AnonymousClass0956 LJFF;
    public static volatile boolean LJIIIZ;
    public static long LJIIJ;
    public static final C456101q3 LIZ = new C456101q3();
    public static String LIZLLL = "null";
    public static final AnonymousClass0204 LJI = new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 4);
    public static final long LJII = LiveBoardsHostReportIntervalTime.value();
    public static final RunnableC456201q4 LJIIIIZZ = RunnableC456201q4.LL;

    public final void LIZIZ() {
        DataChannel dataChannel = LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C473410IhP.LJ(LJIIIIZZ);
        LIZIZ = null;
        LIZJ = null;
        LJIIIZ = false;
        LJIIJ = 0L;
        C054G c054g = LJ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        LJ = null;
        LIZLLL = "null";
    }

    public static void LIZ(String str) {
        List<BoardItemSeiData> list;
        if (!LiveBoardsAudienceReportSettings.enable()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveSeiMessage, seiData: ");
        sbLIZ.append(str);
        C1092200eWo.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        try {
            C397301gZ c397301gZ = new C397301gZ(null, null, null, null, null, null, null, 32767);
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("live_boards_sei");
            if (jSONObjectOptJSONObject != null) {
                c397301gZ.LIZ = jSONObjectOptJSONObject.optString("live_boards_id", "");
                c397301gZ.LIZJ = jSONObjectOptJSONObject.optString("live_boards_room_id", "");
                c397301gZ.LIZIZ = jSONObjectOptJSONObject.optString("live_boards_anchor_id", "");
                c397301gZ.LJFF = jSONObjectOptJSONObject.optString("live_boards_apply_timestamp", "");
                c397301gZ.LJI = jSONObjectOptJSONObject.optString("live_boards_type", "");
                c397301gZ.LJ = jSONObjectOptJSONObject.optString("live_events_board_source", "");
                c397301gZ.LIZLLL = jSONObjectOptJSONObject.optString("live_events_board_type", "");
                c397301gZ.LJII = jSONObjectOptJSONObject.optString("queue_user_type", "");
                c397301gZ.LJIIIIZZ = jSONObjectOptJSONObject.optString("queue_viewers_cnt", "");
                c397301gZ.LJIIIZ = jSONObjectOptJSONObject.optString("ai_summary_board_content", "");
                c397301gZ.LJIIJ = jSONObjectOptJSONObject.optString("live_boards_rec_template_id", "");
                c397301gZ.LJIIJJI = jSONObjectOptJSONObject.optString("generate_version", "");
                c397301gZ.LJIIL = jSONObjectOptJSONObject.optInt("stream_w", 0);
                c397301gZ.LJIILIIL = jSONObjectOptJSONObject.optInt("stream_h", 0);
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("board_items");
                if (jSONArrayOptJSONArray != null) {
                    list = (List) C19748512Ol.LIZIZ.LJIIIIZZ(jSONArrayOptJSONArray.toString(), new TypeToken<List<? extends BoardItemSeiData>>() { // from class: X.01q6
                    }.getType());
                } else {
                    list = null;
                }
                c397301gZ.LJIILJJIL = list;
            }
            if (c397301gZ.LIZ.length() > 0) {
                LIZJ(c397301gZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C397301gZ r21) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C456101q3.LIZJ(X.01gZ):void");
    }
}
