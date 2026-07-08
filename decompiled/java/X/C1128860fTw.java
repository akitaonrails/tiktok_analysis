package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.GiftAnchorCommunityLevelGiftIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128860fTw {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LJ(C474500IjA c474500IjA) {
        String str;
        Map<String, String> map;
        c474500IjA.LJJII(C1128450fTH.LIZLLL(), "connection_type");
        IInteractService iInteractService = C1128450fTH.LIZ;
        c474500IjA.LJJII(iInteractService.oE2(), "core_connection_type");
        if (C1128450fTH.LJJIIZ()) {
            c474500IjA.LJJII(Long.valueOf(C1128450fTH.LIZJ()), "pk_id");
            c474500IjA.LJJII(((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0(), "is_multi");
            c474500IjA.LJJII(((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my(), "sub_match_type");
            c474500IjA.LJJII(C1128450fTH.LJIJ(), "team_member_cnts");
        }
        if (C1128450fTH.LJJIIZ() || C1128450fTH.LJJIIJ()) {
            c474500IjA.LJJII(Long.valueOf(iInteractService.getChannelId()), "channel_id");
        }
        String str2 = C1130100fVw.LIZ.LIZJ;
        c474500IjA.LJJII(str2, "gift_enter_from");
        if (C1697810uHb.LJIIJJI("match_item_get_bubble", "match_item_use_bubble").contains(str2)) {
            c474500IjA.LJJII("bubble", "bubble_type");
        }
        c474500IjA.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sR(0L, false));
        c474500IjA.LJIIIIZZ();
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        c474500IjA.LJJII(Long.valueOf(C1128460fTI.LJI()), "fans_club_level");
        c474500IjA.LJJII(Integer.valueOf(C1128460fTI.LJIIIIZZ(C1128460fTI.LJII())), "fans_club_status");
        Gift giftFindGiftById = GiftManager.inst().findGiftById(GiftAnchorCommunityLevelGiftIdSetting.INSTANCE.getValue());
        if (giftFindGiftById == null || (map = giftFindGiftById.trackerParams) == null || (str = map.get("anchor_community_level")) == null) {
            str = "";
        }
        c474500IjA.LJJII(str, "anchor_community_level");
    }

    public static void LJFF(AbstractC1126600fQI abstractC1126600fQI) {
        C1128940fU4 c1128940fU4;
        if ((abstractC1126600fQI instanceof C1126980fQu) && abstractC1126600fQI != null && (c1128940fU4 = (C1128940fU4) abstractC1126600fQI.LIZIZ) != null && c1128940fU4.LJIIJ == 101) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backpack_activity_item_show");
            c474500IjALIZ.LJIL();
            LIZJ(c474500IjALIZ, (C1126980fQu) abstractC1126600fQI);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJI(C1126980fQu c1126980fQu) {
        C1128940fU4 c1128940fU4;
        String str;
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_item_send_click");
        c474500IjALIZ.LJIL();
        LJ(c474500IjALIZ);
        LIZLLL(c474500IjALIZ, c1126980fQu);
        String strLIZ = null;
        C1128460fTI.LIZ(c474500IjALIZ, null);
        C1128460fTI.LIZIZ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        JSONObject jSONObject = new JSONObject();
        if ((c1126980fQu instanceof C1126980fQu) && c1126980fQu != null) {
            c1128940fU4 = (C1128940fU4) c1126980fQu.LIZIZ;
        } else {
            c1128940fU4 = null;
        }
        if (c1128940fU4 != null && c1128940fU4.LJIIL && C1128450fTH.LJIL()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_available", str);
        JSONObject jSONObject2 = new JSONObject();
        if (c1128940fU4 != null) {
            strLIZ = c1128940fU4.LIZ();
        }
        jSONObject2.put("match_item_type", strLIZ);
        LJIIIIZZ("match_item_send_click", jSONObject2, jSONObject, true, "native_panel");
    }

    public static void LJII(C1126980fQu c1126980fQu) {
        if (c1126980fQu != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backpack_activity_item_send_click");
            c474500IjALIZ.LJIL();
            LIZJ(c474500IjALIZ, c1126980fQu);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZ(Throwable th, JSONObject jSONObject) {
        String message;
        int errorCode;
        String logId;
        if (th != null) {
            message = th.toString();
        } else {
            message = null;
        }
        boolean z = th instanceof C501470JlZ;
        if (z) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            errorCode = c501470JlZ.getErrorCode();
            message = c501470JlZ.getErrorMsg();
        } else if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            errorCode = c1811850xFX.statusCode;
            message = c1811850xFX.getMessage();
        } else {
            errorCode = 10001;
        }
        C0K04.LJ("error_msg", errorCode, jSONObject);
        C0K04.LJFF("error_detail", message, jSONObject);
        if (th != null) {
            C0K04.LJFF("error_class", th.getClass().getName(), jSONObject);
        }
        if (z && (logId = ((C501470JlZ) th).getLogId()) != null) {
            C0K04.LJFF("log_id", logId, jSONObject);
        }
    }

    public static void LIZIZ(C474500IjA c474500IjA, C1126980fQu c1126980fQu) {
        long jLIZ;
        C1128940fU4 c1128940fU4 = (C1128940fU4) c1126980fQu.LIZIZ;
        if (c1128940fU4 != null && c1128940fU4.LJIIJ == 100) {
            c474500IjA.LJJII(C1130100fVw.LIZ.LIZJ, "gift_enter_from");
            c474500IjA.LJJII(Long.valueOf(((C1128940fU4) c1126980fQu.LIZIZ).LJIIJJI), "gift_id");
            c474500IjA.LJJII(Long.valueOf(((C1128940fU4) c1126980fQu.LIZIZ).LIZIZ), "gift_cnt");
            c474500IjA.LJJII(Integer.valueOf(((C1128940fU4) c1126980fQu.LIZIZ).LJIIL ? 1 : 0), "is_available");
            if (((C1128940fU4) c1126980fQu.LIZIZ).LIZLLL <= C158B.LIZ()) {
                jLIZ = 0;
            } else {
                jLIZ = ((((C1128940fU4) c1126980fQu.LIZIZ).LIZLLL - C158B.LIZ()) / ((long) 86400000)) + 1;
            }
            c474500IjA.LJJII(Long.valueOf(jLIZ), "valid_days");
        }
    }

    public static void LIZJ(C474500IjA c474500IjA, C1126980fQu c1126980fQu) {
        Long lValueOf;
        String str;
        C1128940fU4 c1128940fU4 = (C1128940fU4) c1126980fQu.LIZIZ;
        if (c1128940fU4 != null && c1128940fU4.LJIIJ == 101) {
            c474500IjA.LJJII(C1130100fVw.LIZ.LIZJ, "gift_enter_from");
            c474500IjA.LJJII("popularity_votes", "item_type");
            C1128940fU4 c1128940fU42 = (C1128940fU4) c1126980fQu.LIZIZ;
            if (c1128940fU42 != null) {
                lValueOf = Long.valueOf(c1128940fU42.LIZIZ);
            } else {
                lValueOf = null;
            }
            c474500IjA.LJJII(lValueOf, "item_count");
            IInteractService iInteractService = C1128450fTH.LIZ;
            if (iInteractService.b70().size() > 2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjA.LJJII(str, "is_multi");
            c474500IjA.LJJII(C1128450fTH.LIZLLL(), "connection_type");
            c474500IjA.LJJII(iInteractService.oE2(), "core_connection_type");
            c474500IjA.LJJII(Integer.valueOf(((C1128940fU4) c1126980fQu.LIZIZ).LJIIL ? 1 : 0), "is_available");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[PHI: r3
      0x0034: PHI (r3v4 boolean) = (r3v1 boolean), (r3v0 boolean) binds: [B:33:0x0053, B:22:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056 A[PHI: r3
      0x0056: PHI (r3v2 boolean) = (r3v1 boolean), (r3v4 boolean) binds: [B:33:0x0053, B:24:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C474500IjA r5, X.AbstractC1126600fQI r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L5
            T extends X.0054 r4 = r6.LIZIZ
        L5:
            boolean r0 = r4 instanceof X.C1128940fU4
            if (r0 == 0) goto L4e
            X.0fU4 r4 = (X.C1128940fU4) r4
            if (r4 == 0) goto L4e
            boolean r0 = r4.LJIIL
            r3 = 1
            if (r0 == 0) goto L71
            boolean r0 = X.C1128450fTH.LJIL()
            if (r0 == 0) goto L71
            r2 = 1
        L19:
            int r0 = r4.LJIIJ
            switch(r0) {
                case 1: goto L59;
                case 2: goto L5c;
                case 3: goto L5f;
                case 4: goto L62;
                case 5: goto L1e;
                case 6: goto L1e;
                case 7: goto L65;
                case 8: goto L68;
                case 9: goto L6b;
                case 10: goto L6e;
                default: goto L1e;
            }
        L1e:
            java.lang.String r1 = "unknown"
        L20:
            java.lang.String r0 = "match_item_type"
            r5.LJJII(r1, r0)
            int r1 = r4.LJIIJ
            r0 = 4
            if (r1 != r0) goto L52
            boolean r0 = r4.LJIIL
            if (r0 == 0) goto L52
            boolean r0 = X.C1128450fTH.LJJIIZ()
            if (r0 == 0) goto L52
        L34:
            boolean r0 = X.C1128450fTH.LJJIIZ()
            if (r0 == 0) goto L56
            long r0 = r4.LIZIZ
        L3c:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "match_item_cnts"
            r5.LJJII(r1, r0)
            if (r3 == 0) goto L4f
            java.lang.String r1 = "1"
        L49:
            java.lang.String r0 = "is_available"
            r5.LJJII(r1, r0)
        L4e:
            return
        L4f:
            java.lang.String r1 = "0"
            goto L49
        L52:
            r3 = r2
            if (r2 == 0) goto L56
            goto L34
        L56:
            r0 = 0
            goto L3c
        L59:
            java.lang.String r1 = "boosting_gloves"
            goto L20
        L5c:
            java.lang.String r1 = "magic_smokes"
            goto L20
        L5f:
            java.lang.String r1 = "time_extending"
            goto L20
        L62:
            java.lang.String r1 = "hammer"
            goto L20
        L65:
            java.lang.String r1 = "no2_booster"
            goto L20
        L68:
            java.lang.String r1 = "no3_booster"
            goto L20
        L6b:
            java.lang.String r1 = "vault_gloves"
            goto L20
        L6e:
            java.lang.String r1 = "virtual_tickets"
            goto L20
        L71:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128860fTw.LIZLLL(X.0IjA, X.0fQI):void");
    }

    public static void LJIIIIZZ(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, String str2) {
        if (str2.length() > 0 && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enablePowerupTrack()) {
            jSONObject.put("entry_type", str2);
        }
        IInteractService iInteractService = C1128450fTH.LIZ;
        boolean zLIZIZ = C2640010k.LIZIZ();
        boolean zLJI = MethodIDManager.LJI(138000);
        C1128450fTH.LIZ.Vl0(zLIZIZ, str, jSONObject, jSONObject2, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
