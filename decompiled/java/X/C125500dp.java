package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C125500dp {
    public static Map LIZ(LinkMicBattleMessage linkMicBattleMessage) {
        long jLongValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (linkMicBattleMessage == null) {
            return linkedHashMap;
        }
        BattleSetting battleSetting = linkMicBattleMessage.battleSetting;
        if (battleSetting != null && battleSetting.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
            linkedHashMap.putAll(C0113001f.LIZ(linkMicBattleMessage.battleResult));
            return linkedHashMap;
        }
        List<BattleTeamResult> list = linkMicBattleMessage.teamBattleResult;
        if (list != null) {
            for (BattleTeamResult battleTeamResult : list) {
                Long l = battleTeamResult.teamId;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkedHashMap.put(Long.valueOf(jLongValue), battleTeamResult);
            }
        }
        return linkedHashMap;
    }

    public static Map LIZIZ(BattleInfoResponse battleInfoResponse) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (battleInfoResponse == null) {
            return linkedHashMap;
        }
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null && battleSetting.battleType == EnumC919170a1j.MATCH_TYPE_1V1.getType()) {
            linkedHashMap.putAll(C0113001f.LIZ(battleInfoResponse.resultMap));
            return linkedHashMap;
        }
        Map<Long, BattleTeamResult> map = battleInfoResponse.teamBattleResult;
        if (map == null) {
            return C2097608Jq.LJ();
        }
        return map;
    }
}
