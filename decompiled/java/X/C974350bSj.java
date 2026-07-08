package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSpecificGiftPlaybookIdSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974350bSj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map) {
        long jLJ;
        long jLongValue;
        String strValueOf;
        if (C500260Jjc.LJJIL()) {
            jLJ = C933980aPc.LIZIZ();
        } else {
            jLJ = C950220apo.LJ();
        }
        map.put("anchor_id", String.valueOf(jLJ));
        Long lLJIIJ = C930540aK4.LJIIJ();
        if (lLJIIJ != null) {
            jLongValue = lLJIIJ.longValue();
        } else {
            jLongValue = 0;
        }
        map.put("room_id", String.valueOf(jLongValue));
        map.put("channel_id", String.valueOf(C915980Zwa.LIZLLL().getChannelId()));
        map.put("competition_id", C978440bZK.LJIIIIZZ());
        int iY91 = C915980Zwa.LIZLLL().y91();
        if (iY91 == 0) {
            strValueOf = "1";
        } else {
            strValueOf = String.valueOf(iY91);
        }
        map.put("current_host_cnt", strValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.util.Map r8, webcast.data.multi_guest_play.ActivePlaybook r9) {
        /*
            boolean r0 = com.bytedance.android.livesdk.util.PlayEntityUtilKt.LJIIIZ()
            java.lang.String r7 = "0"
            java.lang.String r6 = "1"
            java.lang.String r5 = "is_initiator"
            if (r0 == 0) goto La3
            r1 = 0
            if (r9 == 0) goto L9f
            webcast.data.multi_guest_play.PlaybookGroup r0 = r9.playbookGroup
            if (r0 == 0) goto L9f
            long r3 = r0.lastActorUserId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9f
            long r1 = X.C933980aPc.LIZIZ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
            r7 = r6
        L23:
            r8.put(r5, r7)
        L26:
            r0 = r8
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L9c
            java.lang.Class<com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService> r0 = com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService r0 = (com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService) r0
            X.0blY r2 = r0.mb0()
            java.lang.String r3 = ""
            if (r2 == 0) goto L4d
            X.14wr r1 = X.EnumC20429914wr.PAGE
            X.01x6 r0 = X.EnumC499801x6.PLAYBOOK
            java.lang.String r1 = r2.LIZ(r1, r0)
            if (r1 != 0) goto L4e
        L4d:
            r1 = r3
        L4e:
            java.lang.String r0 = "panel_page"
            r8.put(r0, r1)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService> r0 = com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService r0 = (com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService) r0
            X.0blY r2 = r0.mb0()
            if (r2 == 0) goto L6b
            X.14wr r1 = X.EnumC20429914wr.ENTRANCE
            X.01x6 r0 = X.EnumC499801x6.PLAYBOOK
            java.lang.String r1 = r2.LIZ(r1, r0)
            if (r1 != 0) goto L6c
        L6b:
            r1 = r3
        L6c:
            java.lang.String r0 = "panel_entrance"
            r8.put(r0, r1)
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0bVB r2 = r0.LJFF()
            if (r2 == 0) goto L9d
            java.lang.String r1 = r2.LJIIJ()
        L7f:
            java.lang.String r0 = "unknown"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9c
            java.lang.String r1 = "module"
            java.lang.String r0 = "match_panel"
            r8.put(r1, r0)
            if (r2 == 0) goto L97
            java.lang.String r0 = r2.LJIIJ()
            if (r0 == 0) goto L97
            r3 = r0
        L97:
            java.lang.String r0 = "label"
            r8.put(r0, r3)
        L9c:
            return
        L9d:
            r1 = 0
            goto L7f
        L9f:
            r8.put(r5, r6)
            goto L26
        La3:
            r8.put(r5, r7)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C974350bSj.LIZLLL(java.util.Map, webcast.data.multi_guest_play.ActivePlaybook):void");
    }

    public static void LJII(String str, Map map) {
        C978370bZD c978370bZDLIZIZ;
        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20(str);
        if (interfaceC774000UXuG20 != null && (c978370bZDLIZIZ = interfaceC774000UXuG20.LIZIZ(map)) != null) {
            c978370bZDLIZIZ.LIZ();
        }
    }

    public static void LIZIZ(String str, String str2, Map map) {
        LIZ(map);
        map.put("action_type", str);
        map.put("feature_name", "victory_lap_funny_effect");
        if (str2 != null) {
            map.put("cohost_game_feature_value", C2097608Jq.LJIIJ(new Pair("effect_id", str2)).toString());
        }
    }

    public static void LIZJ(String str, String str2, Map map) {
        LIZ(map);
        map.put("action_type", str);
        map.put("feature_name", "designated_gift");
        if (str2 != null) {
            map.put("cohost_game_feature_value", C2097608Jq.LJIIJ(new Pair("gift_id", str2)).toString());
        }
    }

    public static void LJ(Map map, ActivePlaybook activePlaybook, boolean z) {
        Playbook playbook = activePlaybook.playbook;
        if (playbook != null) {
            String strLJFF = C978440bZK.LJFF(playbook);
            if (z) {
                map.put("old_playbook_id", String.valueOf(playbook.playbookId));
                strLJFF.toString();
                map.put("old_playbook_biz", strLJFF);
                map.put("old_play_id", String.valueOf(activePlaybook.playId));
                return;
            }
            map.put("playbook_id", String.valueOf(playbook.playbookId));
            strLJFF.toString();
            map.put("playbook_biz", strLJFF);
            map.put("play_id", String.valueOf(activePlaybook.playId));
        }
    }

    public static void LJFF(DataChannel dataChannel, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(str, str2, linkedHashMap);
        linkedHashMap.put("playbook_id", String.valueOf(LiveMatchSpecificGiftPlaybookIdSetting.INSTANCE.getValue()));
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multiguest_playbook_feature_set", linkedHashMap);
        }
        LJII("livesdk_multiguest_playbook_feature_set", linkedHashMap);
    }

    public static void LJI(long j, DataChannel dataChannel, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(str, str2, linkedHashMap);
        linkedHashMap.put("playbook_id", String.valueOf(j));
        if (dataChannel != null) {
            C935410aRv.LIZ(dataChannel, "livesdk_multiguest_playbook_feature_set", linkedHashMap);
        }
        LJII("livesdk_multiguest_playbook_feature_set", linkedHashMap);
    }
}
