package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985720bl4 {
    public static final C985720bl4 LIZ = new C985720bl4();

    public static void LIZLLL(PlayRule playRule, long j, long j2, String str) {
        if (playRule == null) {
            return;
        }
        LIZJ(j, j2, "edit", "add", playRule.getConfig().LIZ, str);
    }

    public static void LJ(PlayRule playRule, long j, long j2, String str, String str2) {
        if (playRule == null) {
            return;
        }
        LIZJ(j, j2, str, "click", playRule.getConfig().LIZ, str2);
    }

    public static void LIZJ(long j, long j2, String str, String str2, String str3, String str4) {
        C978370bZD c978370bZDLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entity_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        linkedHashMap.put("function_name", C2188811AlT.LIZIZ(sbLIZ));
        linkedHashMap.put("action_detail", str2);
        linkedHashMap.put("error_code", String.valueOf(j2));
        linkedHashMap.put("play_id", String.valueOf(j));
        if (str4.length() > 0) {
            linkedHashMap.put("activity_id", str4);
        }
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20("livesdk_multi_function_call_result");
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) linkedHashMap)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public final void LJII(PlayRule playRule, Playbook playbook, long j, String str, String str2, Map<String, String> map, long j2, boolean z) {
        Integer numValueOf;
        long j3;
        if (playRule == null) {
            return;
        }
        Boolean boolValueOf = null;
        if (playbook != null) {
            numValueOf = Integer.valueOf(playbook.playbookType);
            boolValueOf = Boolean.valueOf(playbook.isMyCreation);
        } else {
            numValueOf = null;
        }
        getClass();
        LIZ(playRule, "show", numValueOf, boolValueOf, j, null, 0L, j2, map, z);
        if (playbook != null) {
            j3 = playbook.playbookId;
        } else {
            j3 = 0;
        }
        LIZJ(j3, j, str, "show", playRule.getConfig().LIZ, str2);
    }

    public static void LIZ(PlayRule playRule, String str, Integer num, Boolean bool, long j, String str2, long j2, long j3, Map map, boolean z) {
        long ownerUserId;
        long id;
        String str3;
        C978370bZD c978370bZDLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        linkedHashMap.put("room_id", String.valueOf(id));
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("feature_name", playRule.getConfig().LIZ);
        linkedHashMap.put("from", playRule.LJJIJIL());
        String str4 = "unknown";
        if (num != null && bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    str4 = zBooleanValue ? "ugc_self" : "ugc_other";
                }
            } else {
                str4 = "pgc";
            }
        }
        linkedHashMap.put("playbook_create_type", str4);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_auto_step", str3);
        if (j != 0) {
            linkedHashMap.put("error_code", String.valueOf(j));
        }
        if (C123100dR.LIZ(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("error_message", str2);
        }
        if (j2 > 0) {
            linkedHashMap.put("duration", String.valueOf(j2 / 1000.0f));
        }
        if (j3 > 0) {
            linkedHashMap.put("play_id", String.valueOf(j3));
        }
        Playbook playbookLIZ = playRule.LIZ();
        if (playbookLIZ != null) {
            linkedHashMap.put("playbook_id", String.valueOf(playbookLIZ.playbookId));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20("livesdk_multiguest_playbook_feature_set");
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ((Map) linkedHashMap)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public final void LJFF(PlayRule playRule, Playbook playbook, long j, String str, String str2, String str3, long j2, long j3, Map<String, String> map, boolean z) {
        Integer numValueOf;
        long j4;
        if (playRule == null) {
            return;
        }
        Boolean boolValueOf = null;
        if (playbook != null) {
            numValueOf = Integer.valueOf(playbook.playbookType);
            boolValueOf = Boolean.valueOf(playbook.isMyCreation);
        } else {
            numValueOf = null;
        }
        LIZ(playRule, "save", numValueOf, boolValueOf, j, str, j2, j3, map, z);
        if (j == 0) {
            getClass();
            LIZ(playRule, "success", numValueOf, boolValueOf, 0L, null, 0L, j3, null, z);
        } else {
            getClass();
            LIZ(playRule, "error", numValueOf, boolValueOf, j, str, 0L, j3, null, z);
        }
        if (playbook != null) {
            j4 = playbook.playbookId;
        } else {
            j4 = 0;
        }
        LIZJ(j4, j, str2, "show", playRule.getConfig().LIZ, str3);
    }
}
