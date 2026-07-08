package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.rank.TtliveOnlineAudienceThresholdConfigSetting;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0erz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105330erz {
    public static boolean LIZ;
    public static boolean LIZIZ = true;
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static RoomUserSeqMessage LJFF;
    public static long LJI;

    public static void LIZ(DataChannel dataChannel, HashMap map) {
        long id;
        boolean zBooleanValue;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            map.put("room_id", Long.valueOf(id));
            Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            }
            map.put("anchor_id", Long.valueOf(ownerUserId));
            map.put("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            map.put("is_anchor", Boolean.valueOf(zBooleanValue));
            map.put("opt_out_enable", Integer.valueOf(C1810700xDg.LJ(dataChannel)));
            map.put("user_count", Integer.valueOf(C1810700xDg.LJFF));
        }
    }

    public static void LIZIZ(DataChannel dataChannel, JSONObject jSONObject) {
        long id;
        boolean zBooleanValue;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C0K04.LJ("room_id", id, jSONObject);
            Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            }
            C0K04.LJ("anchor_id", ownerUserId, jSONObject);
            C0K04.LJ("user_id", UserService.getInstance().user().getCurrentUserId(), jSONObject);
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            int userCount = 0;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C0K04.LJIIIZ(jSONObject, "is_anchor", zBooleanValue);
            C0K04.LIZLLL(C1810700xDg.LJ(dataChannel), "opt_out_enable", jSONObject);
            Room room3 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room3 != null) {
                userCount = room3.getUserCount();
            }
            C0K04.LIZLLL(userCount, "user_count", jSONObject);
        }
    }

    public static void LIZLLL(DataChannel dataChannel, Throwable th) {
        Long l;
        long jLongValue = 0;
        if (LJ == 0) {
            LJ = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("data_source", "entrance");
            map.put("duration", Long.valueOf(LJ - LIZLLL));
            map.put("is_error", Boolean.TRUE);
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C1082850eHj.class)) != null) {
                jLongValue = l.longValue();
            }
            map.put("room_duration", Long.valueOf(LJ - jLongValue));
            String str = "";
            if (th instanceof C501470JlZ) {
                map.put("error_type", "api_error");
                C501470JlZ c501470JlZ = (C501470JlZ) th;
                map.put("error_code", Integer.valueOf(c501470JlZ.getErrorCode()));
                String errorMsg = c501470JlZ.getErrorMsg();
                if (errorMsg != null) {
                    str = errorMsg;
                }
                map.put("error_msg", str);
            } else if (th instanceof C1811850xFX) {
                map.put("error_type", "net_error");
                C1811850xFX c1811850xFX = (C1811850xFX) th;
                map.put("error_code", Integer.valueOf(c1811850xFX.getCronetError()));
                String message = c1811850xFX.getMessage();
                if (message != null) {
                    str = message;
                }
                map.put("error_msg", str);
            } else {
                map.put("error_type", "un_know");
                map.put("error_code", -1);
                String message2 = th.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                map.put("error_msg", str);
            }
            LIZ(dataChannel, map);
            C501590Jll.LJ(map);
            C1CC2.LJIIJJI(1, "ttlive_audience_rank_entrance_error", map, LJ - LIZLLL);
            if (!C1127020fQy.LIZ(0.1f, "ttlive_audience_rank_entrance_show_all") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_show_all", 0.1d)) {
                return;
            }
            C1CC2.LJIIJJI(1, "ttlive_audience_rank_entrance_show_all", map, LJ - LIZLLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(int r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, boolean r12) {
        /*
            r8 = 1
            r7 = 0
            if (r12 == 0) goto L44
            boolean r0 = X.C1105330erz.LIZIZ
            if (r0 == 0) goto L24
            X.0es8 r0 = X.EnumC1105420es8.SHOW
            int r9 = r0.getType()
            X.C1105330erz.LIZIZ = r7
            X.C1105330erz.LIZ = r8
            X.C1105330erz.LIZJ = r10
        L14:
            com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting r2 = com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting.INSTANCE
            java.lang.String r6 = "ttlive_audience_rank_entrance_profile_pic_show"
            r0 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            boolean r0 = r2.isReport(r6, r0)
            if (r0 != 0) goto L6f
            return
        L24:
            boolean r0 = X.C1105330erz.LIZ
            if (r12 == r0) goto L33
            X.0es8 r0 = X.EnumC1105420es8.TURNTOSHOW
            int r9 = r0.getType()
            X.C1105330erz.LIZ = r12
            X.C1105330erz.LIZJ = r10
            goto L14
        L33:
            boolean r0 = X.C1105330erz.LIZ
            if (r0 == 0) goto L64
            int r0 = X.C1105330erz.LIZJ
            if (r0 == r10) goto L64
            X.0es8 r0 = X.EnumC1105420es8.COUNTCHANGE
            int r9 = r0.getType()
            X.C1105330erz.LIZJ = r10
            goto L14
        L44:
            boolean r0 = X.C1105330erz.LIZIZ
            if (r0 == 0) goto L55
            X.0es8 r0 = X.EnumC1105420es8.HIDE
            int r9 = r0.getType()
            X.C1105330erz.LIZIZ = r7
            X.C1105330erz.LIZ = r7
            X.C1105330erz.LIZJ = r7
            goto L14
        L55:
            boolean r0 = X.C1105330erz.LIZ
            if (r12 == r0) goto L64
            X.0es8 r0 = X.EnumC1105420es8.TURNTOHIDE
            int r9 = r0.getType()
            X.C1105330erz.LIZ = r12
            X.C1105330erz.LIZJ = r7
            goto L14
        L64:
            boolean r0 = X.C1105330erz.LIZ
            if (r12 != r0) goto L6d
            int r0 = X.C1105330erz.LIZJ
            if (r0 != r10) goto L6d
            return
        L6d:
            r9 = -1
            goto L14
        L6f:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "viewer_profile_pic_status"
            X.C0K04.LIZLLL(r9, r0, r5)
            java.lang.String r0 = "viewer_profile_pic_count"
            X.C0K04.LIZLLL(r10, r0, r5)
            java.lang.String r0 = "use_new_display_strategy"
            X.C0K04.LJIIIZ(r3, r0, r8)
            if (r11 == 0) goto La0
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r1 = r11.gg0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
        La0:
            java.lang.String r0 = "is_portrait"
            X.C0K04.LJIIIZ(r3, r0, r7)
            LIZIZ(r11, r3)
            X.C501590Jll.LJFF(r3)
            java.lang.String r0 = "extra"
            X.C0K04.LJII(r0, r2, r3)
            X.C1CC2.LJ(r6, r5, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1105330erz.LIZJ(int, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):void");
    }

    public static void LJ(DataChannel dataChannel, int i, int i2, C1105520esI c1105520esI) {
        List<TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig> list;
        TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfigPrevious;
        int i3;
        long j;
        if (c1105520esI == null) {
            return;
        }
        long j2 = c1105520esI.LIZ;
        if (j2 > 0) {
            TtliveOnlineAudienceThresholdConfigSetting.ThresholdConfig value = TtliveOnlineAudienceThresholdConfigSetting.INSTANCE.getValue();
            if (value.enable && i != i2) {
                if (i > i2) {
                    list = value.upConfig;
                } else {
                    list = value.downConfig;
                }
                if (list != null) {
                    ListIterator<TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            proportionConfigPrevious = listIterator.previous();
                            TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfig = proportionConfigPrevious;
                            long j3 = i2;
                            if (proportionConfig != null) {
                                j = proportionConfig.curUserCount;
                            } else {
                                j = 0;
                            }
                            if (j3 >= j) {
                                break;
                            }
                        } else {
                            proportionConfigPrevious = null;
                            break;
                        }
                    }
                    TtliveOnlineAudienceThresholdConfigSetting.ProportionConfig proportionConfig2 = proportionConfigPrevious;
                    if (proportionConfig2 != null) {
                        int iAbs = Math.abs(i - i2) * 100;
                        if (i2 < 1) {
                            i3 = 1;
                        } else {
                            i3 = i2;
                        }
                        if (iAbs / i3 >= proportionConfig2.prop) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            LIZIZ(dataChannel, jSONObject3);
                            C501590Jll.LJFF(jSONObject3);
                            C0K04.LJ("msg_id", j2, jSONObject3);
                            C0K04.LIZLLL(i2, "before_acu", jSONObject3);
                            C0K04.LIZLLL(i, "cur_acu", jSONObject3);
                            C0K04.LJ("ts", System.currentTimeMillis(), jSONObject3);
                            C0K04.LJ("before_acu_ts", c1105520esI.LIZIZ, jSONObject3);
                            C0K04.LJ("app_enter_background_ts", c1105520esI.LJ, jSONObject3);
                            C0K04.LJ("app_enter_foreground_ts", c1105520esI.LJFF, jSONObject3);
                            C0K04.LIZLLL(c1105520esI.LIZJ, "action_type", jSONObject3);
                            C0K04.LJII("extra", jSONObject4, jSONObject3);
                            C1CC2.LJ("ttlive_audience_ranking_number_change_error", jSONObject, jSONObject2, jSONObject4);
                        }
                    }
                }
            }
        }
    }
}
