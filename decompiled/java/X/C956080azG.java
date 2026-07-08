package X;

import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostInvitationMonitorSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostListJumpStatusOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostPanelUserStatusRefreshMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostPanelUserStatusRefreshMonitorSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0azG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956080azG {
    public static final Map<String, C955440ayE> LIZ = new LinkedHashMap();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static long LJI;
    public static final Map<String, Integer> LJII;

    static {
        LiveCoHostInvitationMonitorSettings liveCoHostInvitationMonitorSettings = LiveCoHostInvitationMonitorSettings.INSTANCE;
        LIZLLL = liveCoHostInvitationMonitorSettings.isEnable();
        LJ = liveCoHostInvitationMonitorSettings.isEnableWithInflate() && new SecureRandom().nextInt(100) < 10;
        LJFF = liveCoHostInvitationMonitorSettings.isEnableWithBind() && new SecureRandom().nextInt(100) < 5;
        LJII = C2097608Jq.LJIIJ(new Pair("page_refresh_1", 0), new Pair("page_refresh_2", 0), new Pair("page_refresh_3", 0), new Pair("page_refresh_4", 0), new Pair("page_refresh_5", 0), new Pair("page_refresh_6", 0), new Pair("page_refresh_7", 0), new Pair("page_refresh_8", 0), new Pair("page_refresh_9", 0), new Pair("page_refresh_10", 0), new Pair("page_refresh_11", 0));
    }

    public static void LIZJ(String str, String str2, boolean z) {
        C955440ayE c955440ayERemove;
        String str3;
        if (LIZLLL && (c955440ayERemove = LIZ.remove(str)) != null) {
            LIZIZ.removeCallbacksAndMessages(null);
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c955440ayERemove.LJIIL(str3, "success", true);
            c955440ayERemove.LJIIL(str2, "failReason", true);
            c955440ayERemove.LJIILIIL();
            c955440ayERemove.LJIJJLI("plugin_load");
        }
    }

    public static EnumC955770ayl LIZ(EnumC955720ayg enumC955720ayg, EnumC956110azJ enumC956110azJ, int i, EnumC955770ayl enumC955770ayl, int i2) {
        EnumC955770ayl enumC955770ayl2;
        EnumC955770ayl enumC955770ayl3;
        if ((i2 & 1) != 0) {
            enumC955720ayg = EnumC955720ayg.NORMAL;
        }
        if ((i2 & 2) != 0) {
            enumC956110azJ = EnumC956110azJ.NUDGABLE;
        }
        if ((i2 & 8) != 0) {
            enumC955770ayl = EnumC955770ayl.UNKNOWN;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return EnumC955770ayl.UNKNOWN;
                }
                int i3 = C956090azH.LIZIZ[enumC956110azJ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2 && i3 != 3) {
                        if (i3 == 4) {
                            return EnumC955770ayl.INVITE_DISABLED;
                        }
                        throw new C1954807lC();
                    }
                    return EnumC955770ayl.RESERVE_SENT;
                }
                return EnumC955770ayl.RESERVED_ENABLED;
            }
            int i4 = C956090azH.LIZ[enumC955720ayg.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        return EnumC955770ayl.UNKNOWN;
                    }
                    return EnumC955770ayl.APPLY_DISABLED;
                }
                return EnumC955770ayl.APPLYING;
            }
            if (LiveCohostListJumpStatusOptSetting.INSTANCE.isEnable() && enumC955770ayl == (enumC955770ayl3 = EnumC955770ayl.INVITE_ENABLED)) {
                return enumC955770ayl3;
            }
            return EnumC955770ayl.APPLY_ENABLED;
        }
        int i5 = C956090azH.LIZ[enumC955720ayg.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3 && i5 != 4) {
                    return EnumC955770ayl.UNKNOWN;
                }
                return EnumC955770ayl.INVITE_DISABLED;
            }
            return EnumC955770ayl.INVITING;
        }
        if (LiveCohostListJumpStatusOptSetting.INSTANCE.isEnable() && enumC955770ayl == (enumC955770ayl2 = EnumC955770ayl.APPLY_ENABLED)) {
            return enumC955770ayl2;
        }
        return EnumC955770ayl.INVITE_ENABLED;
    }

    public static final void LIZIZ(C955590ayT c955590ayT, AbstractC960400b6E<?> abstractC960400b6E, EnumC955770ayl enumC955770ayl, EnumC955770ayl enumC955770ayl2, int i, boolean z) {
        int i2;
        boolean z2;
        String str;
        int iIntValue;
        int i3;
        String strLIZIZ;
        String str2;
        List<Integer> list;
        if (!LiveCohostPanelUserStatusRefreshMonitorEnableSetting.INSTANCE.isEnable() || !(c955590ayT instanceof C956150azN) || !z) {
            return;
        }
        if (enumC955770ayl == EnumC955770ayl.UNKNOWN) {
            c955590ayT.LJIILJJIL = enumC955770ayl2;
            c955590ayT.LJIILL = C158B.LIZ();
            return;
        }
        if (enumC955770ayl2 == enumC955770ayl) {
            return;
        }
        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
        int i4 = 0;
        if (rivalExtraInfo != null) {
            i2 = rivalExtraInfo.showPlayType;
        } else {
            i2 = 0;
        }
        long j = c955590ayT.LJIILL;
        if (j <= 0) {
            j = abstractC960400b6E.LLILLJJLI;
        }
        long jLIZ = C158B.LIZ() - j;
        long jLIZ2 = C158B.LIZ() - abstractC960400b6E.LLILLJJLI;
        LiveCohostPanelUserStatusRefreshMonitorSetting liveCohostPanelUserStatusRefreshMonitorSetting = LiveCohostPanelUserStatusRefreshMonitorSetting.INSTANCE;
        List<Integer> hitStatuses = liveCohostPanelUserStatusRefreshMonitorSetting.getHitStatuses();
        Map<Integer, List<Integer>> transitions = liveCohostPanelUserStatusRefreshMonitorSetting.getTransitions();
        if (hitStatuses.contains(Integer.valueOf(enumC955770ayl2.getValue())) || hitStatuses.contains(Integer.valueOf(enumC955770ayl.getValue())) || ((list = transitions.get(Integer.valueOf(enumC955770ayl.getValue()))) != null && list.contains(Integer.valueOf(enumC955770ayl2.getValue())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        long jLIZ3 = C158B.LIZ() - LJI;
        List<Integer> enableInviteeLists = liveCohostPanelUserStatusRefreshMonitorSetting.getEnableInviteeLists();
        String str3 = "";
        if ((enableInviteeLists.isEmpty() || enableInviteeLists.contains(Integer.valueOf(c955590ayT.LJI.LIZ))) && !z2) {
            if (1 <= jLIZ3 && jLIZ3 < 1001) {
                str = "page_refresh_1";
            } else if (1001 <= jLIZ3 && jLIZ3 < 2001) {
                str = "page_refresh_2";
            } else if (2001 <= jLIZ3 && jLIZ3 < 3001) {
                str = "page_refresh_3";
            } else if (3001 <= jLIZ3 && jLIZ3 < 4001) {
                str = "page_refresh_4";
            } else if (4001 <= jLIZ3 && jLIZ3 < 5001) {
                str = "page_refresh_5";
            } else if (5001 <= jLIZ3 && jLIZ3 < 6001) {
                str = "page_refresh_6";
            } else if (6001 <= jLIZ3 && jLIZ3 < 7001) {
                str = "page_refresh_7";
            } else if (7001 <= jLIZ3 && jLIZ3 < 8001) {
                str = "page_refresh_8";
            } else if (8001 <= jLIZ3 && jLIZ3 < 9001) {
                str = "page_refresh_9";
            } else if (9001 <= jLIZ3 && jLIZ3 < 10001) {
                str = "page_refresh_10";
            } else if (10001 > jLIZ3 || jLIZ3 > Long.MAX_VALUE) {
                str = "";
            } else {
                str = "page_refresh_11";
            }
            Map<String, Integer> map = LJII;
            Integer num = (Integer) ((LinkedHashMap) map).get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(str, Integer.valueOf(iIntValue + 1));
        }
        RivalExtraInfo rivalExtraInfo2 = c955590ayT.LJIIJ;
        if (rivalExtraInfo2 == null) {
            i3 = 0;
            strLIZIZ = C497740JfY.LJIJI(2131841162);
        } else {
            i3 = rivalExtraInfo2.inviteBlockReason;
            i4 = rivalExtraInfo2.detailBlockReason;
            strLIZIZ = C950420aq8.LIZIZ(null, Integer.valueOf(rivalExtraInfo2.detailBlockReason));
        }
        if (strLIZIZ != null) {
            str3 = strLIZIZ;
        }
        C956150azN c956150azN = (C956150azN) c955590ayT;
        int i5 = c956150azN.LJJI;
        int i6 = c956150azN.LJJIFFI;
        c956150azN.LJJI = i3;
        c956150azN.LJJIFFI = i4;
        Room room = c955590ayT.LJ;
        C955540ayO c955540ayO = c955590ayT.LJI;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("connection_inviter_id", String.valueOf(C950220apo.LJFF()));
        linkedHashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
        C955400ayA c955400ayA2 = C955400ayA.LIZ;
        linkedHashMap.put("invitee_list", C955400ayA.LJJLI(c955540ayO.LIZ, true));
        linkedHashMap.put("pre_button_status", String.valueOf(enumC955770ayl.getValue()));
        linkedHashMap.put("cur_button_status", String.valueOf(enumC955770ayl2.getValue()));
        linkedHashMap.put("cur_play_type", String.valueOf(i2));
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_user_behaviour_trigger", str2);
        linkedHashMap.put("last_button_refresh_interval", String.valueOf(jLIZ));
        linkedHashMap.put("list_stay_duration", String.valueOf(jLIZ2));
        linkedHashMap.put("idx", String.valueOf(i));
        linkedHashMap.put("block_reason", String.valueOf(i3));
        linkedHashMap.put("detailed_reason", String.valueOf(i4));
        linkedHashMap.put("block_text", str3);
        linkedHashMap.put("pre_block_reason", String.valueOf(i5));
        linkedHashMap.put("pre_detailed_reason", String.valueOf(i6));
        C955400ayA.LLIILII("livesdk_connection_invite_refresh", linkedHashMap);
        c955590ayT.LJIILJJIL = enumC955770ayl2;
        c955590ayT.LJIILL = C158B.LIZ();
        LJI = C158B.LIZ();
    }
}
