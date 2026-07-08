package X;

import android.text.TextUtils;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubClientAISettings;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubEntranceAiConfigSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveUserWatchDurationLayoutSettings;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubGuideClientAiEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101440eli implements InterfaceC1145110fu9 {
    public final List<String> LIZ = Collections.singletonList("tt_live_fans_club_guide");
    public DataChannel LIZIZ;

    @Override // X.InterfaceC1145110fu9
    public final List<String> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1145110fu9
    public final void LIZIZ(String str, C01JS c01js) {
        if (!Intrinsics.LJFF(str, "tt_live_fans_club_guide") || C500260Jjc.LJJLIIIJ(this.LIZIZ) == 0) {
            return;
        }
        LiveFansClubEntranceAiConfigSettings liveFansClubEntranceAiConfigSettings = LiveFansClubEntranceAiConfigSettings.INSTANCE;
        if (liveFansClubEntranceAiConfigSettings.getValue().algoEnable == 1 && this.LIZIZ != null) {
            final String str2 = liveFansClubEntranceAiConfigSettings.getValue().algoPkgName;
            if (str2 == null) {
                str2 = "";
            }
            ((C1ATJ) LivePitayaEnv.LJIIL()).LIZJ(new C1ATK(str2, new C1132380fZc(false, new JSONObject().putOpt("room_id", Long.valueOf(C500260Jjc.LJJLIIIJ(this.LIZIZ))).putOpt("user_consume_layer", Integer.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue())).putOpt("user_watch_duration_layer", Integer.valueOf(LiveUserWatchDurationLayoutSettings.INSTANCE.getValue()))), new InterfaceC2179811ASt() { // from class: X.0elj
                @Override // X.InterfaceC2179811ASt
                public final void LIZ(C21406118pv c21406118pv) {
                    String strJ3;
                    String strJ32;
                    JSONObject jSONObjectOptJSONObject;
                    DataChannel dataChannel;
                    String str3 = "";
                    if (c21406118pv.LIZ()) {
                        JSONObject jSONObject = c21406118pv.LIZIZ;
                        String strOptString = null;
                        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && (strOptString = jSONObjectOptJSONObject.optString("guide_type")) != null && C500260Jjc.LJJIIZ(strOptString) && !TextUtils.equals(strOptString, "None") && (dataChannel = this.LIZIZ) != null) {
                            dataChannel.LC0(FansClubGuideClientAiEvent.class, strOptString);
                        }
                        String str4 = str2;
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        JSONObject jSONObject2 = c21406118pv.LIZIZ;
                        if (jSONObject2 != null && (strJ32 = C786410Ut5.J3(jSONObject2)) != null) {
                            str3 = strJ32;
                        }
                        C181900mv.LIZ(str4, strOptString, str3);
                        return;
                    }
                    String str5 = str2;
                    JSONObject jSONObject3 = c21406118pv.LIZIZ;
                    if (jSONObject3 != null && (strJ3 = C786410Ut5.J3(jSONObject3)) != null) {
                        str3 = strJ3;
                    }
                    C181900mv.LIZ(str5, "fail", str3);
                }
            }, new C1ATM(LiveFansClubClientAISettings.INSTANCE.getValue().taskTimeout, false, 11), 8));
        }
    }
}
