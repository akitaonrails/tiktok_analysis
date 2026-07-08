package X;

import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceAudienceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPerformanceMonitorSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978500bZQ {
    public static boolean LIZ;
    public static final Map<String, Integer> LIZIZ = C2097608Jq.LJIIJ(new Pair("match_color_eggs_guide", 2), new Pair("match_color_eggs_task_start", 2), new Pair("match_color_eggs_reward_start", 2));
    public static final C01GW LIZJ = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(206));

    public static long LIZ() {
        return ((Number) LIZJ.getValue()).longValue();
    }

    public static void LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.o11(linkedHashMap);
        C1EOY c1eoy = C1EOY.LIZ;
        C930480aJy.LIZ.getClass();
        AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(292);
        c1eoy.LJJI();
        C1EOY.LJIILJJIL = "broadcast_link_period";
        c1eoy.LJIIJJI(aFwS203S0000000_15);
        c1eoy.LJIILLIIL();
        iPerformanceManager.Dy1(1, "resident");
    }

    public static void LIZIZ(String str) {
        String str2;
        long id;
        Integer numValueOf;
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start match monitor enabled = + ");
        LiveMatchPerformanceMonitorSetting liveMatchPerformanceMonitorSetting = LiveMatchPerformanceMonitorSetting.INSTANCE;
        sbLIZ.append(liveMatchPerformanceMonitorSetting.getValue());
        C20441214yg.LIZIZ("MatchPerformanceMonitor", C2188811AlT.LIZIZ(sbLIZ));
        String str4 = "";
        if (liveMatchPerformanceMonitorSetting.getValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C974450bSt c974450bSt = C973890bRz.LIZ;
            linkedHashMap.put("battle_id", String.valueOf(c974450bSt.LJLIIIL()));
            linkedHashMap.put("channel_id", String.valueOf(c974450bSt.LJLIIL()));
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(id);
            if (interfaceC1085480eLyO41 != null) {
                numValueOf = Integer.valueOf(interfaceC1085480eLyO41.getTotal());
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("like_count", String.valueOf(numValueOf));
            int iIntValue = 1;
            linkedHashMap.put("linked_user_count", String.valueOf(C915980Zwa.LJII().LLILZLL(true).size()));
            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(LIZ());
            if (c954460aweLLILL != null && (str3 = c954460aweLLILL.LJIIJJI) != null) {
                str4 = str3;
            }
            linkedHashMap.put("linkmic_id", str4);
            C1EOY c1eoy = C1EOY.LIZ;
            C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ(C1EOY.LJIILJJIL);
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.LJIIZILJ = linkedHashMap;
            }
            C930480aJy.LIZ.getClass();
            AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(292);
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = str;
            c1eoy.LJIIJJI(aFwS203S0000000_15);
            c1eoy.LJIILLIIL();
            EnumC919170a1j enumC919170a1jLIZIZ = C962910bAH.LIZIZ();
            EnumC919170a1j.Companion.getClass();
            linkedHashMap.put("match_type", C917350Zyn.LIZJ(enumC919170a1jLIZIZ));
            if (!LIZ ? LIZ() % ((long) LiveMatchPerformanceAudienceSetting.INSTANCE.getValue()) == 0 : LIZ() % ((long) LiveMatchPerformanceAnchorSetting.INSTANCE.getValue()) == 0) {
                IPerformanceManager iPerformanceManager = C465520INi.LIZ;
                iPerformanceManager.o11(linkedHashMap);
                Integer num = (Integer) ((LinkedHashMap) LIZIZ).get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                iPerformanceManager.Dy1(iIntValue, str);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start match monitor scene = ");
            sbLIZ2.append(str);
            sbLIZ2.append(linkedHashMap);
            C20441214yg.LIZIZ("MatchPerformanceMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (!Intrinsics.LJFF(str, "match_prepare")) {
            return;
        }
        C1EOY c1eoy2 = C1EOY.LIZ;
        c1eoy2.LJJI();
        C1EOY.LJIILJJIL = "pk_period";
        c1eoy2.LJIILLIIL();
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String strValueOf = String.valueOf(C973890bRz.LIZ.LJLIIL());
        c1276840jKc.getClass();
        Map<String, String> map = C1276840jKc.LJIIL;
        map.put("channel_id", strValueOf);
        C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(LIZ());
        if (c954460aweLLILL2 != null && (str2 = c954460aweLLILL2.LJIIJJI) != null) {
            str4 = str2;
        }
        map.put("linkmic_id", str4);
        C465520INi.LIZ.ml0("live_pk");
    }
}
