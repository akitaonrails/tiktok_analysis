package X;

import com.bytedance.android.LiveCommentAddPullStreamDataSetting;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115670f8f {
    public static final HashMap LIZ(int i, long j, C0IXY c0ixy, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2) throws JSONException {
        String str12;
        String strQ92;
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("content", str);
        pairArr[1] = new Pair("starling_key", str2);
        pairArr[2] = new Pair("room_id", String.valueOf(j));
        pairArr[3] = new Pair("request_id", str3);
        pairArr[4] = new Pair("common_label_list", str4);
        pairArr[5] = new Pair("enter_source", str5);
        if (z) {
            str12 = "1";
        } else {
            str12 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("post_anyway", str12);
        pairArr[7] = new Pair("input_type", String.valueOf(i));
        pairArr[8] = new Pair("sec_at_uid", str6);
        pairArr[9] = new Pair("emotes_with_index", str7);
        String str13 = null;
        if (z2) {
            str13 = "3";
        }
        pairArr[10] = new Pair("quick_chat_scene", str13);
        pairArr[11] = new Pair("client_start_timestamp_millisecond", String.valueOf(C963140bAe.LIZJ()));
        pairArr[12] = new Pair("screen_time", str8);
        pairArr[13] = new Pair("mention_user_list", str9);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        HashMap map = new HashMap(linkedHashMap);
        map.putAll(C0IXW.LJI(c0ixy));
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null && (strQ92 = iInteractService.Q92()) != null && strQ92.length() != 0) {
            map.put("anchor_link_mic_id", strQ92);
        }
        if (LiveCommentAddPullStreamDataSetting.INSTANCE.getValue()) {
            JSONObject jSONObject = new JSONObject();
            if (str11 != null && str11.length() != 0) {
                jSONObject.put("session_id", str11);
            }
            if (str10 != null && str10.length() != 0) {
                jSONObject.put("pull_url", str10);
            }
            map.put("extra", C786410Ut5.J3(jSONObject));
        }
        return map;
    }
}
