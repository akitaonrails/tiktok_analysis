package X;

import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970340bMG extends C0K04 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIIJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String strLIZ;
        long jLJJL;
        Integer numValueOf;
        String str2;
        String str3;
        BattleSetting battleSettingLJIILIIL;
        EnumC919170a1j enumC919170a1jLJIIIZ;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (enumC919170a1jLJIIIZ = interfaceC973730bRjYf2.LJIIIZ()) != null) {
            EnumC919170a1j.Companion.getClass();
            strLIZ = C917350Zyn.LIZ(enumC919170a1jLJIIIZ);
        } else {
            strLIZ = "unknown";
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        C0K04.LJFF("current_anchor_id", String.valueOf(C974540bT2.LJJIIZ()), jSONObject2);
        C0K04.LJFF("room_id", String.valueOf(C974540bT2.LJJIIZI()), jSONObject2);
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        C0K04.LJFF("channel_id", String.valueOf(jLJJL), jSONObject2);
        C0K04.LJ("linked_count", listLLILZLL.size(), jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().LJ);
        }
        C0K04.LJI("uid_list", jSONArray, jSONObject2);
        C0K04.LJFF("user_type", str, jSONObject);
        C0K04.LJFF("match_type", strLIZ, jSONObject);
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null) {
            numValueOf = Integer.valueOf(battleSettingLJIILIIL.scene);
        } else {
            numValueOf = null;
        }
        String str4 = "1";
        if (numValueOf != null && numValueOf.intValue() == 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_team_pair", str2, jSONObject);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_direct_match", str3, jSONObject);
        if (!C970370bMJ.LJIIIZ() || C915980Zwa.LJFF().xB0() == EnumC919170a1j.MATCH_TYPE_1V1) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("is_downgrade_1v1", str4, jSONObject);
    }

    public static void LJIIJJI(EnumC970360bMI enumC970360bMI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        int i = C970350bMH.LIZ[enumC970360bMI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "ttlive_client_match_scenarios_audience_monitor";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str2 = "ttlive_client_match_scenarios_anchor_monitor";
            }
        } else {
            str2 = "ttlive_client_match_scenarios_sender_monitor";
        }
        C0K04.LJFF("event_id", str, jSONObject);
        C1CC2.LJFF(str2, jSONObject, jSONObject3, jSONObject2);
    }
}
