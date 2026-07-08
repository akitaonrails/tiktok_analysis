package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090660eUK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BarrageMessage barrageMessage, boolean z, String str, boolean z2, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            C0K04.LJFF("error_msg", str2, jSONObject);
        }
        C0K04.LJFF("channel", str, jSONObject);
        if (z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = "1";
        }
        C0K04.LJFF("call_back_state", str3, jSONObject);
        if (barrageMessage != null) {
            C0K04.LIZLLL(barrageMessage.msgType, "barrage_msg_type", jSONObject);
            C0K04.LIZLLL(C1090780eUW.LJI(barrageMessage), "barrage_grade", jSONObject);
        }
        C1CC2.LJIIIIZZ("grade_channel_resource_download_event", !z ? 1 : 0, jSONObject);
    }
}
