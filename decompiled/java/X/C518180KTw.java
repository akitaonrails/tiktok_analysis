package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubClaimPointsOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0KTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518180KTw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJJII(int i, long j, boolean z) {
        return z ? "1" : j < 1 ? CardStruct.IStatusCode.DEFAULT : i != 1 ? "3" : "1";
    }

    public static long LJJIFFI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        long jLJFF = jCurrentTimeMillis - w.LJFF();
        if (jLJFF < 0) {
            return 0L;
        }
        return jLJFF;
    }

    public static void LIZ(C474500IjA c474500IjA) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            id = room.getId();
            if (room.getOwner() != null) {
                id2 = room.getOwner().getId();
            }
        } else {
            id = 0;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(currentUserId), "user_id");
    }

    public static void LJ(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_claim_point_guide_entrance_show");
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(LJFF(((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0()), "fans_club_relation_info");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LJJII("entrance", "enter_from");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJIJL();
        }
    }

    public static JSONObject LJFF(C1095140ebY c1095140ebY) {
        int i;
        long j;
        long jIb1 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Ib1();
        JSONObject jSONObject = new JSONObject();
        if (c1095140ebY != null) {
            i = c1095140ebY.LJ;
        } else {
            i = 0;
        }
        C0K04.LIZLLL(i, "fans_club_relation_status", jSONObject);
        if (c1095140ebY != null) {
            j = c1095140ebY.LIZ;
        } else {
            j = 0;
        }
        C0K04.LJ("fans_club_level", j, jSONObject);
        C0K04.LJ("scores_to_next_level", jIb1, jSONObject);
        return jSONObject;
    }

    public static String LJIJJLI(EnumC1095860eci enumC1095860eci) {
        if (enumC1095860eci == null) {
            return "";
        }
        switch (C1095880eck.LIZ[enumC1095860eci.ordinal()]) {
            case 1:
            case 2:
                return "points_increase";
            case 3:
            case 4:
                return "points_decrease";
            case 5:
            case 6:
                return "level_up";
            default:
                return "";
        }
    }

    public static String LJIL(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "enabled";
        }
        return "grey";
    }

    public static long LJJI(DataChannel dataChannel) {
        Room room;
        long createTime;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room != null) {
            createTime = room.getCreateTime();
        } else {
            createTime = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (createTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (jCurrentTimeMillis < 0) {
            return 0L;
        }
        return jCurrentTimeMillis;
    }

    public static String LJJIII(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "main_tab";
            }
            if (num.intValue() == 15) {
                return "exclusive_tab";
            }
            if (num.intValue() == 16) {
                return "backpack_tab";
            }
            if (num.intValue() == 14) {
                return "reaction_tab";
            }
            return "";
        }
        return "";
    }

    public static void LJJIJ(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_anchor");
        c474500IjALIZ.LJJII("revenue_fans_group_guide", "current_panel_page");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_slide_close");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_return");
        c474500IjALIZ.LJJII("max_6", "height_ratio");
        c474500IjALIZ.LJJIJL();
    }

    public static void LIZIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        C1095140ebY c1095140ebY;
        boolean zLJIIZILJ;
        long j;
        int i;
        String str;
        Long lValueOf = null;
        if (dataChannel != null) {
            c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        } else {
            c1095140ebY = null;
        }
        if (dataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        } else {
            zLJIIZILJ = false;
        }
        c474500IjA.LJJII(String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_cnt");
        if (!zLJIIZILJ) {
            if (c1095140ebY != null) {
                lValueOf = Long.valueOf(c1095140ebY.LIZ);
            }
            c474500IjA.LJJII(String.valueOf(lValueOf), "fans_club_level");
            if (c1095140ebY != null) {
                j = c1095140ebY.LIZ;
                i = c1095140ebY.LJ;
            } else {
                j = 0;
                i = 0;
            }
            c474500IjA.LJJII(LJJII(i, j, false), "fans_club_status");
            if (c1095140ebY != null && c1095140ebY.LJ == 2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str, "is_sleeping");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[PHI: r5
      0x0077: PHI (r5v4 com.bytedance.android.livesdkapi.depend.model.live.Room) = 
      (r5v1 com.bytedance.android.livesdkapi.depend.model.live.Room)
      (r5v6 com.bytedance.android.livesdkapi.depend.model.live.Room)
     binds: [B:6:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C474500IjA r7, com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            if (r8 == 0) goto Lc
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r5 = r8.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
            if (r5 != 0) goto L77
        Lc:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r5 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r5
            if (r8 != 0) goto L77
            r6 = 0
        L19:
            r1 = 0
            if (r5 == 0) goto L74
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L74
            long r3 = r0.getId()
        L27:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "anchor_id"
            r7.LJJII(r3, r0)
            if (r5 == 0) goto L71
            long r3 = r5.getId()
        L36:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "room_id"
            r7.LJJII(r3, r0)
            java.lang.String r3 = "source_page"
            java.lang.String r0 = "live_page"
            r7.LJJII(r0, r3)
            r5 = 0
            if (r8 == 0) goto L6b
            boolean r0 = X.C500260Jjc.LJIIZILJ(r8)
            if (r0 != 0) goto L6b
            if (r6 == 0) goto L6e
            long r3 = r6.LIZ
        L53:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "fans_club_level"
            r7.LJJII(r3, r0)
            if (r6 == 0) goto L6c
            long r1 = r6.LIZ
            int r0 = r6.LJ
        L62:
            java.lang.String r1 = LJJII(r0, r1, r5)
            java.lang.String r0 = "fans_club_status"
            r7.LJJII(r1, r0)
        L6b:
            return
        L6c:
            r0 = 0
            goto L62
        L6e:
            r3 = 0
            goto L53
        L71:
            r3 = 0
            goto L36
        L74:
            r3 = 0
            goto L27
        L77:
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel> r0 = com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel.class
            java.lang.Object r6 = r8.gg0(r0)
            X.0ebY r6 = (X.C1095140ebY) r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518180KTw.LIZJ(X.0IjA, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    public static void LJII(DataChannel dataChannel, String str) {
        String str2;
        ?? LJFF;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_fans_club_first_guide");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LJJII(str, "action_type");
        if (dataChannel != null) {
            LJFF = Intrinsics.LJFF(dataChannel.gg0(IsLiveStudioMonitorChannel.class), Boolean.TRUE);
        } else {
            LJFF = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf((int) LJFF), "is_livestudio_monitor");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(Long l, String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - C0KU0.LIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_client_active_sleeping");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(l, "fans_club_level");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
            c474500IjALIZ.LJJII(str, "enter_from");
            LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
            C0KU0.LIZ = 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILIIL(int i, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_level_request_config");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "status_code");
        int i2 = 1;
        c474500IjALIZ.LJJII(1, "is_successful");
        if (!z) {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_disk_error");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(Throwable th, boolean z) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_level_request_config");
        c474500IjALIZ.LJIL();
        int i2 = 0;
        if (th instanceof C477520Io2) {
            c474500IjALIZ.LJJII("custom_api_error", "error_type");
            C477520Io2 c477520Io2 = (C477520Io2) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c477520Io2.getErrorCode()), "status_code");
            c474500IjALIZ.LJJII(c477520Io2.getErrorMsg(), "error_msg");
            c474500IjALIZ.LJJII(c477520Io2.getxTtLogId(), "log_id");
        } else if (th instanceof C501470JlZ) {
            c474500IjALIZ.LJJII("api_error", "error_type");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c501470JlZ.getErrorCode()), "status_code");
            c474500IjALIZ.LJJII(c501470JlZ.getErrorMsg(), "error_msg");
            c474500IjALIZ.LJJII(c501470JlZ.getLogId(), "log_id");
        } else if (th instanceof C1811850xFX) {
            c474500IjALIZ.LJJII("net_error", "error_type");
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c1811850xFX.getCronetError()), "status_code");
            c474500IjALIZ.LJJII(c1811850xFX.getMessage(), "error_msg");
        } else if (th instanceof C1494690ozz) {
            c474500IjALIZ.LJJII("cronet_io_error", "error_type");
            c474500IjALIZ.LJJII(-2, "status_code");
            c474500IjALIZ.LJJII(th.getMessage(), "error_msg");
        } else if (th instanceof C1494450ozb) {
            c474500IjALIZ.LJJII("net_not_available_error", "error_type");
            C497740JfY.LJII();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                i = -3;
            } else {
                i = -4;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "status_code");
            c474500IjALIZ.LJJII(th.getMessage(), "error_msg");
        } else {
            c474500IjALIZ.LJJII(th.getClass().getCanonicalName(), "error_type");
            c474500IjALIZ.LJJII(-1, "status_code");
            c474500IjALIZ.LJJII(th.getMessage(), "error_msg");
        }
        c474500IjALIZ.LJJII(0, "is_successful");
        if (z) {
            i2 = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_disk_error");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(DataChannel dataChannel, int i) {
        long id;
        String str;
        String str2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            id = room.getId();
            if (room.getOwner() != null) {
                id2 = room.getOwner().getId();
            }
        } else {
            id = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_system_message_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(id2), "anchor_id");
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str2 = "";
                } else {
                    str2 = "points_expire_in_10min";
                }
            } else {
                str2 = "first_day_joiner_claim_point_notice";
            }
        } else {
            str2 = "lifetime_first_claim_point_notice";
        }
        c474500IjALIZ.LJJII(str2, "message_type");
        c474500IjALIZ.LIZ();
    }

    public static String LJJ(C1095140ebY c1095140ebY, boolean z) {
        long j;
        if (c1095140ebY != null) {
            j = c1095140ebY.LJII;
        } else {
            j = 0;
        }
        if (z) {
            if (j > 0) {
                return "have_fans";
            }
            return "zero_fans";
        }
        if (c1095140ebY != null) {
            long j2 = c1095140ebY.LIZ;
            int i = c1095140ebY.LJ;
            if (j2 > 0) {
                if (i == 2) {
                    return "sleep";
                }
                return "after";
            }
            return "before";
        }
        return "before";
    }

    public static void LJJIIZI(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_frame_exit_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_anchor");
        c474500IjALIZ.LJJII("revenue_fans_group_guide", "current_panel_page");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_slide_close");
        c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "has_return");
        c474500IjALIZ.LJJII("max_6", "height_ratio");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJIJL();
    }

    public static Map LIZLLL(Room room, DataChannel dataChannel, boolean z) {
        boolean z2;
        String str;
        long j;
        C1095140ebY c1095140ebY;
        User.FansClubInfo fansClubInfo;
        User.FansClubInfo fansClubInfo2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z3 = true;
        boolean z4 = false;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str = "-1";
            j = -1;
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
            if (room != null) {
                User owner = room.getOwner();
                if (owner != null && (fansClubInfo2 = owner.fansClubInfo) != null) {
                    j = fansClubInfo2.fansLevel;
                } else {
                    j = 0;
                }
                User owner2 = room.getOwner();
                if (owner2 != null && (fansClubInfo = owner2.fansClubInfo) != null) {
                    z4 = fansClubInfo.isSleeping;
                }
            } else if (dataChannel != null && (c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class)) != null) {
                j = c1095140ebY.LIZ;
                if (c1095140ebY.LJ != 2) {
                    z3 = false;
                }
                z4 = z3;
            } else {
                j = 0;
            }
            if (j > 0) {
                str = z4 ? "3" : "1";
            }
        }
        linkedHashMap.put("is_fans_club_anchor", str);
        if (z) {
            linkedHashMap.put("is_fans_club_level", str);
        }
        linkedHashMap.put("fans_club_level", String.valueOf(j));
        return linkedHashMap;
    }

    public static void LJIIIZ(String str, C1494690ozz c1494690ozz, long j) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_api");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "path");
            c474500IjALIZ.LJJII(Integer.valueOf(c1494690ozz.getStatusCode()), "http_status_code");
            c474500IjALIZ.LJJII(Integer.valueOf(c1494690ozz.getCronetInternalErrorCode()), "error_code");
            c474500IjALIZ.LJJII(-1, "biz_status_code");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LJJII(Boolean.FALSE, "is_success");
            LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIJJI(Boolean bool, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fansclub_click_join_button");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str2, "panel_type");
        c474500IjALIZ.LJJII(LJIL(bool), "button_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJLIJ(DataChannel dataChannel, String str, Boolean bool) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fan_club_goal_page_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        LIZIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "source_page");
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "if_discount");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIL(DataChannel dataChannel, String str, Boolean bool) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fan_club_goal_page_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        LIZIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "source_page");
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "if_discount");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(int i, int i2, String str, long j) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_api");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "path");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "http_status_code");
            c474500IjALIZ.LJJII(0, "error_code");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "biz_status_code");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LJJII(Boolean.TRUE, "is_success");
            LIZ(c474500IjALIZ);
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIILL(Boolean bool, Integer num, String str, String str2) {
        if (Intrinsics.LJFF(str, "click")) {
            LJIIJJI(bool, str2, "alert");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_first_join_notice");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(LJJIII(num), "gift_panel_tab_from");
        c474500IjALIZ.LJJII(num, "tab_id");
        c474500IjALIZ.LJJII(LJIL(bool), "button_status");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJIL(int i, int i2, String str, boolean z) {
        int i3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_config_exist");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_exist");
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "from_grade");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "to_grade");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJ(DataChannel dataChannel, String str, String str2, boolean z, String str3, long j) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_join_guide_virtual_click");
        c474500IjALIZ.LJIL();
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str2, "click_position");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_team_named");
        c474500IjALIZ.LJJII(str3, "highlighted_info");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration_after_watch");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIJ(DataChannel dataChannel, String str, String str2, int i, boolean z, boolean z2) {
        Object obj;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_join_guide_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(0, "fans_club_level");
        c474500IjALIZ.LJJII(0, "fans_club_status");
        c474500IjALIZ.LJJII(str, "source_page");
        c474500IjALIZ.LJJII(LJJIII(Integer.valueOf(i)), "gift_panel_tab_from");
        c474500IjALIZ.LJJII("send_and_join", "click_position");
        c474500IjALIZ.LJJII(str2, "tab_name");
        String str3 = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "has_community_gift_icon");
        if (Intrinsics.LJFF(str2, "superfan")) {
            if (!z) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "if_discount");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIJZLJL(DataChannel dataChannel, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        Object obj;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_join_guide_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(0, "fans_club_level");
        c474500IjALIZ.LJJII(0, "fans_club_status");
        c474500IjALIZ.LJJII(str, "source_page");
        c474500IjALIZ.LJJII(LJJIII(Integer.valueOf(i)), "gift_panel_tab_from");
        c474500IjALIZ.LJJII(LJIL(Boolean.valueOf(z)), "button_status");
        c474500IjALIZ.LJJII(str2, "tab_name");
        String str3 = "1";
        if (z3) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "has_community_gift_icon");
        if (Intrinsics.LJFF(str2, "superfan")) {
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "if_discount");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJI(int i, String str, String str2, String str3, long j, int i2, long j2) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_compensation_response");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        if (i == 101) {
            str4 = "joincompensation";
        } else {
            str4 = "reactivecompensation";
        }
        c474500IjALIZ.LJJII(str4, "operation_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "status_code");
        c474500IjALIZ.LJJII(str, "status_msg");
        c474500IjALIZ.LJJII(str2, "result");
        c474500IjALIZ.LJJII(str3, "log_id");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration");
        c474500IjALIZ.LJJIJL();
    }

    public static void LJIILLIIL(DataChannel dataChannel, String str, String str2, Boolean bool, String str3, Integer num, boolean z, String str4) {
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(C1148210fz9.class);
        if (objGg0 == null) {
            objGg0 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_join_guide");
        c474500IjALIZ.LJIL();
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(LJJIII(num), "gift_panel_tab_from");
        c474500IjALIZ.LJJII(num, "tab_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(LJIL(bool), "button_status");
        c474500IjALIZ.LJJII(str3, "click_position");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_team_named");
        c474500IjALIZ.LJJII(str4, "highlighted_info");
        c474500IjALIZ.LJJII(objGg0, "from_badge_status");
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(str, "click")) {
            LJIIJJI(bool, str2, "panel");
        }
    }

    public static void LJJIJIL(String str, DataChannel dataChannel, long j, boolean z, String str2, long j2, String str3, boolean z2) {
        String str4;
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(C1148210fz9.class);
        if (objGg0 == null) {
            objGg0 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_join_guide_stay");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(0, "fans_club_level");
        c474500IjALIZ.LJJII(0, "fans_club_status");
        c474500IjALIZ.LJJII(0, "is_sleeping");
        c474500IjALIZ.LJJII(str3, "tab_name");
        c474500IjALIZ.LJJII(str, "source_page");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "member_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_team_named");
        c474500IjALIZ.LJJII(str2, "highlighted_info");
        if (z2) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "has_community_gift_icon");
        c474500IjALIZ.LJJII(objGg0, "from_badge_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(String str, DataChannel dataChannel, long j, Integer num, Long l, Integer num2, String str2, boolean z, String str3) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_join_fans_club_success");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str, "source_page");
        c474500IjALIZ.LJJII(str3, "tab_name");
        c474500IjALIZ.LJJII(LJJIII(num), "gift_panel_tab_from");
        c474500IjALIZ.LJJII(num, "tab_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(l, "fans_club_level");
        c474500IjALIZ.LJJII(1, "fans_club_status");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
        c474500IjALIZ.LJJII(num2, "retry_count");
        if (z) {
            str4 = "superfan";
        } else {
            str4 = "fan";
        }
        c474500IjALIZ.LJJII(str4, "superfan_status");
        c474500IjALIZ.LJJII(str2, "from_badge_status");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, boolean z, boolean z2, boolean z3, String str, long j, String str2, boolean z4, EnumC1095860eci enumC1095860eci, Long l, boolean z5, String str3, Map map) {
        String str4;
        C1095140ebY c1095140ebY;
        long j2;
        String str5;
        String str6;
        long j3;
        if (z5) {
            str4 = "livesdk_fans_club_anchor_entrance_click";
        } else {
            str4 = "livesdk_fans_club_anchor_entrance_show";
        }
        if (dataChannel != null) {
            c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        } else {
            c1095140ebY = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str4);
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (!z) {
            c474500IjALIZ.LJJII(LJFF(c1095140ebYUw0), "fans_club_relation_info");
            c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_follow");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(LJJI(dataChannel)), "duration_after_live_take");
            c474500IjALIZ.LJJII(Long.valueOf(j), "member_cnt");
        }
        c474500IjALIZ.LJJII(str2, "landing_page");
        if (c1095140ebYUw0 != null) {
            j2 = c1095140ebYUw0.LIZ;
        } else {
            j2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "fans_club_level");
        c474500IjALIZ.LJJII(LJJ(c1095140ebYUw0, z), "content_type");
        if (z) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        c474500IjALIZ.LJJII(str5, "user_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "is_first_guide");
        if (str != null) {
            c474500IjALIZ.LJJII(str, "target_page");
        }
        c474500IjALIZ.LJJII("entrance", "enter_from");
        c474500IjALIZ.LJJII("entrance", "source_page");
        c474500IjALIZ.LJJII(str3, "trigger_type");
        if (C1131530fYF.LJI()) {
            c474500IjALIZ.LJJII("heartme_ug_task_join_team_page", "target_page");
        }
        if (LiveFansClubClaimPointsOptSetting.INSTANCE.enableFansClubPointOpt() && !z) {
            String strLJJ = LJJ(c1095140ebYUw0, z);
            Object objValueOf = "";
            if (Intrinsics.LJFF(strLJJ, "after") && z4) {
                str6 = "unclaimed_point";
            } else if (!Intrinsics.LJFF(strLJJ, "after") || z4) {
                str6 = "";
            } else {
                str6 = "level";
            }
            c474500IjALIZ.LJJII(str6, "sub_content_type");
            if (z4 && c1095140ebY != null) {
                j3 = c1095140ebY.LJIIIIZZ;
            } else {
                j3 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j3), "num_unclaimed_points");
            c474500IjALIZ.LJJII(LJIJJLI(enumC1095860eci), "most_recent_effect_shown");
            if (l != null && l.longValue() != 0) {
                objValueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
            }
            c474500IjALIZ.LJJII(objValueOf, "duration_after_most_recent_effect_ms");
        }
        if (map != null) {
            c474500IjALIZ.LJJIIZI(map);
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(DataChannel dataChannel, boolean z, boolean z2, boolean z3, String str, long j, String str2, boolean z4, EnumC1095860eci enumC1095860eci, Long l, boolean z5, boolean z6, boolean z7, String str3, Map map) {
        String str4;
        C1095140ebY c1095140ebY;
        long j2;
        String str5;
        long j3;
        int i;
        String str6;
        long j4;
        String str7 = str3;
        if (z5) {
            str4 = "livesdk_fans_club_entrance_click";
        } else {
            str4 = "livesdk_fans_club_entrance_show";
        }
        if (dataChannel != null) {
            c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
        } else {
            c1095140ebY = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str4);
        C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (z6) {
            str7 = "view_superfan";
        } else if (z7) {
            str7 = "highlight_is_ready";
        }
        if (!z) {
            c474500IjALIZ.LJJII(LJFF(c1095140ebYUw0), "fans_club_relation_info");
            c474500IjALIZ.LJJII(Long.valueOf(LJJIFFI()), "duration_after_watch");
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_follow");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(LJJI(dataChannel)), "duration_after_live_take");
            c474500IjALIZ.LJJII(Long.valueOf(j), "member_cnt");
        }
        c474500IjALIZ.LJJII(str2, "landing_page");
        if (c1095140ebYUw0 != null) {
            j2 = c1095140ebYUw0.LIZ;
        } else {
            j2 = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j2), "fans_club_level");
        c474500IjALIZ.LJJII(LJJ(c1095140ebYUw0, z), "content_type");
        if (z) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        c474500IjALIZ.LJJII(str5, "user_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "is_first_guide");
        if (str != null) {
            c474500IjALIZ.LJJII(str, "target_page");
        }
        c474500IjALIZ.LJJII("entrance", "enter_from");
        c474500IjALIZ.LJJII("entrance", "source_page");
        if (c1095140ebY != null) {
            j3 = c1095140ebY.LIZ;
        } else {
            j3 = 0;
        }
        if (c1095140ebY != null) {
            i = c1095140ebY.LJ;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(LJJII(i, j3, false), "fans_club_status");
        c474500IjALIZ.LJJII(str7, "trigger_type");
        if (C1131530fYF.LJI()) {
            c474500IjALIZ.LJJII("heartme_ug_task_join_team_page", "target_page");
        }
        if (LiveFansClubClaimPointsOptSetting.INSTANCE.enableFansClubPointOpt() && !z) {
            String strLJJ = LJJ(c1095140ebYUw0, z);
            Object objValueOf = "";
            if (Intrinsics.LJFF(strLJJ, "after") && z4) {
                str6 = "unclaimed_point";
            } else if (!Intrinsics.LJFF(strLJJ, "after") || z4) {
                str6 = "";
            } else {
                str6 = "level";
            }
            c474500IjALIZ.LJJII(str6, "sub_content_type");
            if (z4 && c1095140ebY != null) {
                j4 = c1095140ebY.LJIIIIZZ;
            } else {
                j4 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j4), "num_unclaimed_points");
            c474500IjALIZ.LJJII(LJIJJLI(enumC1095860eci), "most_recent_effect_shown");
            if (l != null && l.longValue() != 0) {
                objValueOf = Long.valueOf(System.currentTimeMillis() - l.longValue());
            }
            c474500IjALIZ.LJJII(objValueOf, "duration_after_most_recent_effect_ms");
        }
        if (map != null) {
            c474500IjALIZ.LJJIIZI(map);
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
