package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTechMonitorCalibrationSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.0bSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974500bSy {
    public static final void LIZ(LinkMicBattleMessage linkMicBattleMessage) {
        String str;
        if (!LiveMatchTechMonitorCalibrationSetting.INSTANCE.isInviteeRequestFromPassingEnabled() || linkMicBattleMessage.action != 1) {
            return;
        }
        InterfaceC955780aym interfaceC955780aymLJIIJ = C915980Zwa.LJI().LJIIJ();
        String str2 = "";
        interfaceC955780aymLJIIJ.LJJJJJ("");
        Map<String, String> map = linkMicBattleMessage.trackingExtra;
        if (map != null && (str = map.get("request_from")) != null) {
            str2 = str;
        }
        if (str2.length() == 0) {
            return;
        }
        interfaceC955780aymLJIIJ.LJJJJJ(str2);
    }

    public static final boolean LIZIZ(LinkMicBattleMessage linkMicBattleMessage) {
        BattleSetting battleSetting;
        if (linkMicBattleMessage == null || (battleSetting = linkMicBattleMessage.battleSetting) == null || battleSetting.inviteType != 5) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(LinkMicBattleMessage linkMicBattleMessage) {
        BattleSetting battleSetting;
        if (linkMicBattleMessage == null || (battleSetting = linkMicBattleMessage.battleSetting) == null || battleSetting.scene != 1) {
            return false;
        }
        return true;
    }
}
