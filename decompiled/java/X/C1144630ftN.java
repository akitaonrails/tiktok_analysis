package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ftN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144630ftN extends C944730agx {
    public static final C1144630ftN LIZ = new C1144630ftN();

    public static C1144590ftJ LJJ() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C1144590ftJ c1144590ftJ = new C1144590ftJ(jSONObject, jSONObject2);
        LJIJJLI(jSONObject2);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C0K04.LJ("uid", interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L, jSONObject2);
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        C0K04.LJFF("is_gift_only", (interfaceC975810bV5LIZLLL == null || !interfaceC975810bV5LIZLLL.LJ()) ? CardStruct.IStatusCode.DEFAULT : "1", jSONObject2);
        C0K04.LJ("only_gift_id", C978520bZS.LJ(false), jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().LJ);
        }
        C0K04.LJI("linked_uids", jSONArray, c1144590ftJ.LIZIZ);
        C0K04.LIZLLL(C915980Zwa.LJII().LLILZLL(true).size(), "host_count", c1144590ftJ.LIZ);
        JSONObject jSONObject3 = c1144590ftJ.LIZIZ;
        int i = C1144650ftP.LIZ[C915980Zwa.LJFF().RY(false).ordinal()];
        C0K04.LJFF("match_state", i != 1 ? i != 2 ? "none" : "punishing" : "pking", jSONObject3);
        long jLIZ = C158B.LIZ();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        C0K04.LJ("match_current_time_in_sec", (jLIZ - (interfaceC973730bRjYf2 != null ? interfaceC973730bRjYf2.er() : 0L)) / 1000, c1144590ftJ.LIZIZ);
        C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        int size = C915980Zwa.LJII().LJIJJ().size();
        c917350Zyn.getClass();
        C0K04.LJFF("sub_match_type", C917350Zyn.LIZIZ(enumC919170a1jXB0, size), c1144590ftJ.LIZ);
        return c1144590ftJ;
    }

    public static void LJIILLIIL(C1144590ftJ c1144590ftJ) {
        long jLJJL;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jLJJJJJL = 0;
        if (interfaceC973730bRjYf2 != null) {
            jLJJL = interfaceC973730bRjYf2.LJJL();
        } else {
            jLJJL = 0;
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            jLJJJJJL = interfaceC973730bRjYf22.LJJJJJL();
        }
        LJIILL(c1144590ftJ, jLJJL, jLJJJJJL);
    }

    public static void LJIJJLI(JSONObject jSONObject) {
        String idStr;
        long ownerUserId;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (Room.isValid(room)) {
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
        } else {
            idStr = CardStruct.IStatusCode.DEFAULT;
        }
        C0K04.LJFF("room_id", idStr, jSONObject);
        if (Room.isValid(room) && room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        C0K04.LJ("anchor_id", ownerUserId, jSONObject);
    }

    public static Pair LJIL(C1144750ftZ c1144750ftZ) {
        Long l;
        EnumC919120a1e enumC919120a1e;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l2;
        InterfaceC973730bRj interfaceC973730bRjYf2;
        List<TeamUsersInfo> listLJJJ;
        BattleBaseUserInfo battleBaseUserInfo2;
        String str;
        String str2;
        BattleBaseUserInfo battleBaseUserInfo3;
        Long l3;
        String strLIZ;
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        long jLongValue = 0;
        if (interfaceC973730bRjYf22 == null) {
            enumC919120a1e = EnumC919120a1e.UNKNOWN;
        } else {
            BattleUserInfo battleUserInfoLJJI = interfaceC973730bRjYf22.LJJI();
            Long lValueOf = null;
            if (battleUserInfoLJJI != null && (battleBaseUserInfo2 = battleUserInfoLJJI.user) != null) {
                l = battleBaseUserInfo2.userId;
            } else {
                l = null;
            }
            long j = c1144750ftZ.LIZ.LJ;
            if (c1144750ftZ.LIZJ) {
                if (C970370bMJ.LJII()) {
                    if (j != 0 && (interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false)) != null && (listLJJJ = interfaceC973730bRjYf2.LJJJ()) != null) {
                        Iterator<TeamUsersInfo> it2 = listLJJJ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TeamUsersInfo next = it2.next();
                            if (next.userIds.contains(Long.valueOf(j))) {
                                lValueOf = Long.valueOf(next.teamId);
                                break;
                            }
                        }
                    }
                    long jLJJJJJ = interfaceC973730bRjYf22.LJJJJJ();
                    if (lValueOf != null && lValueOf.longValue() == jLJJJJJ) {
                        enumC919120a1e = EnumC919120a1e.TEAM_ANCHOR;
                    } else {
                        enumC919120a1e = EnumC919120a1e.ENEMY_ANCHOR;
                    }
                } else if (l != null && l.longValue() == j) {
                    enumC919120a1e = EnumC919120a1e.TEAM_ANCHOR;
                } else {
                    enumC919120a1e = EnumC919120a1e.ENEMY_ANCHOR;
                }
            } else {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                BattleUserInfo battleUserInfo = c1144750ftZ.LIZ.LIZJ;
                if (battleUserInfo != null && (battleBaseUserInfo = battleUserInfo.user) != null && (l2 = battleBaseUserInfo.userId) != null && l2.longValue() == currentUserId) {
                    enumC919120a1e = EnumC919120a1e.AUDIENCE_SENDER;
                } else if (l != null && l.longValue() == j) {
                    enumC919120a1e = EnumC919120a1e.TEAM_AUDIENCE;
                } else {
                    enumC919120a1e = EnumC919120a1e.ENEMY_AUDIENCE;
                }
            }
        }
        EnumC1144570ftH enumC1144570ftHLJJI = LJJI(enumC919120a1e);
        C1144670ftR c1144670ftR = c1144750ftZ.LIZIZ;
        C1144590ftJ c1144590ftJLJJ = LJJ();
        LJIJJLI(c1144590ftJLJJ.LIZIZ);
        LJIILL(c1144590ftJLJJ, c1144670ftR.LIZIZ, c1144670ftR.LIZJ);
        Long l4 = c1144670ftR.LIZLLL;
        if (l4 != null) {
            C0K04.LJ("message_create_time", l4.longValue(), c1144590ftJLJJ.LIZIZ);
        }
        Long l5 = c1144670ftR.LJ;
        if (l5 != null) {
            C0K04.LJ("message_fetch_time", l5.longValue(), c1144590ftJLJJ.LIZIZ);
        }
        Long l6 = c1144670ftR.LJFF;
        if (l6 != null) {
            C0K04.LJ("message_id", l6.longValue(), c1144590ftJLJJ.LIZIZ);
        }
        int i = C1144650ftP.LIZIZ[c1144670ftR.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "battle_info";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "open_message";
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, str, c1144590ftJLJJ.LIZ);
        if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            JSONObject jSONObject = c1144590ftJLJJ.LIZ;
            Integer num = c1144670ftR.LJI;
            if (num == null || (strLIZ = C0286007w.LIZ(num.intValue())) == null) {
                strLIZ = "";
            }
            C0K04.LJFF("inner_msg_type", strLIZ, jSONObject);
        }
        LJIJ(c1144590ftJLJJ, c1144750ftZ.LIZ.LIZIZ);
        JSONObject jSONObject2 = c1144590ftJLJJ.LIZIZ;
        BattleUserInfo battleUserInfo2 = c1144750ftZ.LIZ.LIZJ;
        if (battleUserInfo2 != null && (battleBaseUserInfo3 = battleUserInfo2.user) != null && (l3 = battleBaseUserInfo3.userId) != null) {
            jLongValue = l3.longValue();
        }
        C0K04.LJ("sender_uid", jLongValue, jSONObject2);
        C0K04.LJ("send_time_sec", c1144750ftZ.LIZ.LIZLLL, c1144590ftJLJJ.LIZIZ);
        C0K04.LJ("effect_last_duration", c1144750ftZ.LIZ.LJI, c1144590ftJLJJ.LIZIZ);
        C0K04.LJ("effect_time_sec", c1144750ftZ.LIZ.LJFF, c1144590ftJLJJ.LIZIZ);
        JSONObject jSONObject3 = c1144590ftJLJJ.LIZ;
        switch (C1144650ftP.LIZLLL[enumC919120a1e.ordinal()]) {
            case 1:
                str2 = "unknown";
                break;
            case 2:
                str2 = "team_anchor";
                break;
            case 3:
                str2 = "enemy_anchor";
                break;
            case 4:
                str2 = "sender";
                break;
            case 5:
                str2 = "team_audience";
                break;
            case 6:
                str2 = "enemy_audience";
                break;
            default:
                throw new C1954807lC();
        }
        C0K04.LJFF("role", str2, jSONObject3);
        return new Pair(enumC1144570ftHLJJI, c1144590ftJLJJ);
    }

    public static EnumC1144570ftH LJJI(EnumC919120a1e enumC919120a1e) {
        switch (C1144650ftP.LIZLLL[enumC919120a1e.ordinal()]) {
            case 1:
                return EnumC1144570ftH.AUDIENCE;
            case 2:
                return EnumC1144570ftH.ANCHOR;
            case 3:
                return EnumC1144570ftH.ANCHOR;
            case 4:
                return EnumC1144570ftH.AUDIENCE_SENDER;
            case 5:
                return EnumC1144570ftH.AUDIENCE;
            case 6:
                return EnumC1144570ftH.AUDIENCE;
            default:
                throw new C1954807lC();
        }
    }

    public static void LJJIIJ(C178500mN c178500mN) {
        Iterator<C1144660ftQ> it2 = c178500mN.LIZ.iterator();
        while (it2.hasNext()) {
            Pair pairLJIL = LJIL(new C1144750ftZ(it2.next(), c178500mN.LIZIZ, c178500mN.LIZJ));
            LJJIJIIJIL((EnumC1144570ftH) pairLJIL.getFirst(), "receive_item", (C1144590ftJ) pairLJIL.getSecond());
        }
    }

    public static void LJJIJ(C1144750ftZ c1144750ftZ) {
        Pair pairLJIL = LJIL(c1144750ftZ);
        EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
        C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
        LJIJJ(c1144590ftJ.LIZIZ, c1144750ftZ);
        LJJIJIIJIL(enumC1144570ftH, "show_item_effect", c1144590ftJ);
    }

    public static void LJIJ(C1144590ftJ c1144590ftJ, int i) {
        String str;
        JSONObject jSONObject = c1144590ftJ.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        str = "";
                                    } else {
                                        str = "vault_gloves";
                                    }
                                } else {
                                    str = "no3_booster";
                                }
                            } else {
                                str = "no2_booster";
                            }
                        } else {
                            str = "hammer";
                        }
                    } else {
                        str = "time_extending";
                    }
                } else {
                    str = "magic_smokes";
                }
            } else {
                str = "boosting_gloves";
            }
        } else {
            str = "none";
        }
        C0K04.LJFF("match_item_type", str, jSONObject);
    }

    public static void LJIJJ(JSONObject jSONObject, C1144750ftZ c1144750ftZ) {
        C1144660ftQ c1144660ftQ = c1144750ftZ.LIZ;
        long jLIZIZ = C158B.LIZIZ();
        long j = c1144660ftQ.LJFF * 1000;
        long j2 = c1144660ftQ.LJI;
        long j3 = (j2 * 1000) + j;
        if (jLIZIZ >= j) {
            if (jLIZIZ >= j3) {
                j2 = 0;
            } else {
                j2 = (j3 - jLIZIZ) / 1000;
            }
        }
        C0K04.LJ("item_remain_time", j2, jSONObject);
    }

    public static void LJJII(C1144750ftZ c1144750ftZ, EnumC1144690ftT enumC1144690ftT) {
        String str;
        if (c1144750ftZ == null) {
            return;
        }
        Pair pairLJIL = LJIL(c1144750ftZ);
        EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
        C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
        JSONObject jSONObject = c1144590ftJ.LIZIZ;
        int i = C1144650ftP.LJ[enumC1144690ftT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "expired";
                    } else {
                        throw new C1954807lC();
                    }
                } else if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
                    str = "wrong_match_phase";
                } else {
                    str = "wrong_match_state";
                }
            } else {
                str = "type_not_valid";
            }
        } else {
            str = "battle_not_match";
        }
        C0K04.LJFF("reason", str, jSONObject);
        LJJIJIIJIL(enumC1144570ftH, "discard_item_message", c1144590ftJ);
    }

    public static void LJJIII(C178500mN c178500mN, EnumC1144690ftT enumC1144690ftT) {
        Iterator<C1144660ftQ> it2 = c178500mN.LIZ.iterator();
        while (it2.hasNext()) {
            LJJII(new C1144750ftZ(it2.next(), c178500mN.LIZIZ, c178500mN.LIZJ), enumC1144690ftT);
        }
    }

    public final void LJIIZILJ(Throwable th, JSONObject jSONObject) {
        C944730agx.LJIIL(th, jSONObject);
        if (th instanceof C501470JlZ) {
            C0K04.LJFF("log_id", ((C501470JlZ) th).getLogId(), jSONObject);
        }
    }

    public static void LJIILL(C1144590ftJ c1144590ftJ, long j, long j2) {
        C0K04.LJ("channel_id", j, c1144590ftJ.LIZIZ);
        C0K04.LJ("battle_id", j2, c1144590ftJ.LIZ);
    }

    public static void LJIJI(C1144590ftJ c1144590ftJ, List list, int i) {
        Object objLIZJ;
        JSONObject jSONObject = c1144590ftJ.LIZ;
        if (i == 1 && (!list.isEmpty())) {
            objLIZJ = Integer.valueOf(((Number) ListProtector.get(list, 0)).intValue());
        } else {
            objLIZJ = C1144530ftD.LIZJ(list);
        }
        C0K04.LJFF("match_item_type", objLIZJ.toString(), jSONObject);
        C0K04.LJFF("match_item_type_list", C1144530ftD.LIZJ(list).toString(), c1144590ftJ.LIZ);
        C0K04.LJFF("match_item_cnts", String.valueOf(i), c1144590ftJ.LIZ);
    }

    public static void LJJIJIIJI(C1144750ftZ c1144750ftZ, int i, EnumC1144700ftU enumC1144700ftU) {
        String str;
        Pair pairLJIL = LJIL(c1144750ftZ);
        EnumC1144570ftH enumC1144570ftH = (EnumC1144570ftH) pairLJIL.getFirst();
        C1144590ftJ c1144590ftJ = (C1144590ftJ) pairLJIL.getSecond();
        LJIJJ(c1144590ftJ.LIZIZ, c1144750ftZ);
        C0K04.LIZLLL(i, "count", c1144590ftJ.LIZIZ);
        JSONObject jSONObject = c1144590ftJ.LIZIZ;
        int i2 = C1144650ftP.LJFF[enumC1144700ftU.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        str = "match_finished";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "terminate_by_other_card";
                }
            } else {
                str = "settlement";
            }
        } else {
            str = "expired";
        }
        C0K04.LJFF("reason", str, jSONObject);
        LJJIJIIJIL(enumC1144570ftH, "item_finished", c1144590ftJ);
    }

    public static void LJJIJIIJIL(EnumC1144570ftH enumC1144570ftH, String str, C1144590ftJ c1144590ftJ) {
        boolean z;
        C0K04.LJFF("event_id", str, c1144590ftJ.LIZ);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C1520640pfq.LIZ(jSONObject2, c1144590ftJ.LIZIZ);
        C1520640pfq.LIZ(jSONObject, c1144590ftJ.LIZ);
        int i = C1144650ftP.LIZJ[enumC1144570ftH.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1CC2.LJFF("ttlive_client_power_up_anchor_monitor", c1144590ftJ.LIZ, null, c1144590ftJ.LIZIZ);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1CC2.LJFF("ttlive_client_power_up_audience_sender_monitor", c1144590ftJ.LIZ, null, c1144590ftJ.LIZIZ);
            }
        } else if (C1127020fQy.LIZ(0.1f, "ttlive_client_power_up_audience_monitor") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_power_up_audience_monitor", 0.1d)) {
            C1CC2.LJFF("ttlive_client_power_up_audience_monitor", c1144590ftJ.LIZ, null, c1144590ftJ.LIZIZ);
        }
        boolean zLJII = C970370bMJ.LJII();
        if (enumC1144570ftH != EnumC1144570ftH.AUDIENCE) {
            z = true;
        } else {
            z = false;
        }
        C962910bAH.LIZJ(str, jSONObject2, jSONObject, null, zLJII, 1, z);
    }

    public static void LJJIFFI(String str, C1144590ftJ c1144590ftJ, EnumC919120a1e enumC919120a1e, String str2) {
        LJIILLIIL(c1144590ftJ);
        LJIJJLI(c1144590ftJ.LIZIZ);
        if (str2.length() > 0 && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            C0K04.LJFF("entry_type", str2, c1144590ftJ.LIZ);
        }
        LJJIJIIJIL(LJJI(enumC919120a1e), str, c1144590ftJ);
    }

    public static void LJJIIZ(long j, long j2, String str, Long l, int i) {
        if (!LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            return;
        }
        C1144590ftJ c1144590ftJLJJ = LJJ();
        LJIILL(c1144590ftJLJJ, j, j2);
        C0K04.LIZLLL(i, "ranking", c1144590ftJLJJ.LIZIZ);
        C0K04.LJFF("reason", str, c1144590ftJLJJ.LIZ);
        if (l != null) {
            C0K04.LJ("elapsed_since_punish_start_ms", l.longValue(), c1144590ftJLJJ.LIZIZ);
        }
        LJJIJIIJIL(EnumC1144570ftH.AUDIENCE_SENDER, "award_match_item_skipped", c1144590ftJLJJ);
    }

    public final void LJJIIJZLJL(int i, long j, long j2, long j3, Throwable th) {
        EnumC1144570ftH enumC1144570ftH;
        C1144590ftJ c1144590ftJLJJ = LJJ();
        LJIILL(c1144590ftJLJJ, j, j2);
        C0K04.LJ("cost", j3, c1144590ftJLJJ.LIZIZ);
        C0K04.LIZLLL(i, "ranking", c1144590ftJLJJ.LIZIZ);
        LJIIZILJ(th, c1144590ftJLJJ.LIZIZ);
        if (LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            enumC1144570ftH = EnumC1144570ftH.AUDIENCE_SENDER;
        } else {
            enumC1144570ftH = EnumC1144570ftH.AUDIENCE;
        }
        LJJIJIIJIL(enumC1144570ftH, "award_match_item_failed", c1144590ftJLJJ);
    }
}
