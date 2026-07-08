package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.ShowInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.feed.model.live.WatchReason;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AC7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AC7 {
    public static final C1AC7 LIZ = new C1AC7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(114));

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(X.C1ACA r9) {
        /*
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            if (r9 == 0) goto L97
            com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview$PreviewItem r7 = r9.LJLIL
            if (r7 != 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r9.LIZJ
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview r0 = r0.smbLivePreview
            if (r0 == 0) goto L97
            java.util.List<com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview$PreviewItem> r0 = r0.previewItem
            if (r0 == 0) goto L97
            java.lang.Object r7 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview$PreviewItem r7 = (com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview.PreviewItem) r7
        L1d:
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            java.lang.String r2 = "has_show_smb_msg"
            r6 = 1
            r1 = 0
            if (r7 == 0) goto L8a
            r0 = 3
            kotlin.Pair[] r8 = new kotlin.Pair[r0]
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r4)
            r8[r1] = r0
            int r0 = r7.type
            int r0 = com.ss.android.ugc.aweme.feed.model.live.SMBLivePreviewKt.convertPreviewType2SmbMsgType(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "smb_msg_type"
            r1.<init>(r0, r2)
            r8[r6] = r1
            java.lang.String r2 = r7.content
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "smb_msg_text"
            r1.<init>(r0, r2)
            r0 = 2
            r8[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r8)
            r5.putAll(r0)
            int r0 = r7.type
            boolean r0 = com.ss.android.ugc.aweme.feed.model.live.SMBLivePreviewKt.isServiceSkuType(r0)
            if (r0 == 0) goto L6a
            int r0 = r7.type
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "smb_service_type"
            r5.put(r0, r1)
        L6a:
            if (r9 == 0) goto L88
            boolean r0 = r9.LJJLL
            if (r0 != r6) goto L88
        L70:
            java.lang.String r2 = "is_smb_preview_summary_show"
            if (r6 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r9.LIZJ
            if (r0 == 0) goto L99
            java.lang.Boolean r1 = r0.enableSMBLiveAiSummary()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            r5.put(r2, r4)
            return r5
        L88:
            r6 = 0
            goto L70
        L8a:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            r5.putAll(r0)
            goto L6a
        L97:
            r7 = 0
            goto L1d
        L99:
            r5.put(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC7.LIZJ(X.1ACA):java.util.Map");
    }

    public static Map LIZLLL(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            String str = liveRoomStruct.hotUpdateType;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("hot_update_type", str);
            String str3 = liveRoomStruct.hotReloadType;
            if (str3 != null) {
                str2 = str3;
            }
            linkedHashMap.put("hot_reload_type", str2);
            if (C500260Jjc.LJJIIZ(liveRoomStruct.originReqId)) {
                linkedHashMap.put("origin_request_id", liveRoomStruct.originReqId);
            }
            if (C500260Jjc.LJJIIZ(liveRoomStruct.originRoomId)) {
                linkedHashMap.put("origin_room_id", liveRoomStruct.originRoomId);
            }
            String strLJII = C0J4Y.LJII(c1aca.LIZIZ, "hot_req_control_live_duration_estimate");
            if (strLJII != null || (strLJII = C0J4Y.LJII(c1aca.LIZIZ, "chandler_hot_req_control_live_duration_estimate")) != null) {
                linkedHashMap.put("live_duration_estimate", strLJII);
            }
            if (!c1aca.LJIILLIIL && (aweme = c1aca.LIZIZ) != null) {
                long clientAcceptanceTime = liveRoomStruct.firstShowTime - AwemeBizExtKt.getClientAcceptanceTime(aweme);
                if (clientAcceptanceTime <= 0) {
                    clientAcceptanceTime = 0;
                }
                linkedHashMap.put("commend_time_gap", String.valueOf(clientAcceptanceTime));
            }
        }
        return linkedHashMap;
    }

    public static String LJ(C1ACA c1aca) {
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        JSONObject jSONObjectOptJSONObject;
        ArrayList arrayList = new ArrayList();
        try {
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            if (liveRoomStruct != null && (streamUrlStruct = liveRoomStruct.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
                JSONObject jSONObject = new JSONObject(streamData);
                if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        arrayList.add(itKeys.next());
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList.toString();
    }

    public static String LJFF(LiveRoomStruct liveRoomStruct) {
        WatchReason watchReason;
        List<WatchReasonItem> list;
        if (liveRoomStruct != null && (watchReason = liveRoomStruct.fypWatchReason) != null && (list = watchReason.watchReasons) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<WatchReasonItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().reasonId));
            }
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    public static void LJI(C1ACA c1aca) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String string;
        AwemeRawAd awemeRawAd2;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        C1022820ciu c1022820ciuLJJIJIL;
        if (c1aca != null && c1aca.LIZIZ != null && c1aca.LIZJ != null) {
            String string2 = null;
            if (1 != 0) {
                Aweme aweme2 = c1aca.LIZIZ;
                if (((aweme2 != null && aweme2.isAd()) || ((aweme = c1aca.LIZIZ) != null && AwemeExtKt.isPseudoAd(aweme))) && c1aca.LJIIJ.LIZ > 0 && c1aca.LJIL) {
                    Aweme aweme3 = c1aca.LIZIZ;
                    if (aweme3 != null) {
                        awemeRawAd = aweme3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "break", awemeRawAd);
                    Aweme aweme4 = c1aca.LIZIZ;
                    if (aweme4 != null && (c1022820ciuLJJIJIL = C1017070cZd.LJJIJIL(aweme4, "draw_ad", "break")) != null) {
                        c1022820ciuLIZLLL = c1022820ciuLJJIJIL;
                    }
                    c1022820ciuLIZLLL.LIZJ(Long.valueOf(System.currentTimeMillis() - c1aca.LJIIJ.LIZ), "duration");
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - c1aca.LJIIJ.LIZ), "duration");
                    Aweme aweme5 = c1aca.LIZIZ;
                    if (aweme5 != null && (roomFeedCellStruct2 = aweme5.getRoomFeedCellStruct()) != null && (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) != null) {
                        string = Long.valueOf(newLiveRoomData2.getAnchorId()).toString();
                    } else {
                        string = null;
                    }
                    c1022820ciuLIZLLL.LIZIZ(string, "anchor_id");
                    Aweme aweme6 = c1aca.LIZIZ;
                    if (aweme6 != null && (roomFeedCellStruct = aweme6.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                        string2 = Long.valueOf(newLiveRoomData.id).toString();
                    }
                    c1022820ciuLIZLLL.LIZIZ(string2, "room_id");
                    c1022820ciuLIZLLL.LJII();
                    Aweme aweme7 = c1aca.LIZIZ;
                    if (aweme7 != null && (awemeRawAd2 = aweme7.getAwemeRawAd()) != null) {
                        awemeRawAd2.setReshowAd(true);
                    }
                }
            }
        }
    }

    public static void LJIIJJI(C1ACA c1aca) {
        String str;
        C2175631ACr c2175631ACrLIZ;
        if (c1aca != null) {
            InterfaceC2175871ADp interfaceC2175871ADp = c1aca.LJJJLIIL;
            if (interfaceC2175871ADp == null || (c2175631ACrLIZ = interfaceC2175871ADp.LIZ(false)) == null || (str = c2175631ACrLIZ.LIZ) == null) {
                str = "normal";
            }
            if (!Intrinsics.LJFF(str, "normal")) {
                LIZ.getClass();
                LJIIJ(c1aca, "livesdk_live_connection_play", null);
            }
        }
    }

    public static void LJIJI(C1ACA c1aca) {
        String currentUserID;
        if (c1aca != null) {
            c1aca.LLD = 1;
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            if (liveRoomStruct != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null) {
                    currentUserID = iUserService.getCurrentUserID();
                } else {
                    currentUserID = null;
                }
                c2344009Gk.LJIIIIZZ("user_id", currentUserID);
                C487710JAr.LIZ.getClass();
                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct), "follow_status");
                LivePreviewCTASmartDisplayManager livePreviewCTASmartDisplayManager = LivePreviewCTASmartDisplayManager.INSTANCE;
                c2344009Gk.LIZLLL(livePreviewCTASmartDisplayManager.getDelayShowTime(), "cta_show_interval");
                c2344009Gk.LJFF("delay_time_from", livePreviewCTASmartDisplayManager.getDelayTimeFrom());
                LIZ.getClass();
                LIZ(c2344009Gk, c1aca);
                C20684815ws.LJIILLIIL("livesdk_cta_show", c2344009Gk.LIZ);
            }
        }
    }

    public static void LIZ(C2344009Gk c2344009Gk, C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1aca.LIZLLL);
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            c2344009Gk.LJIIIIZZ("action_type", "click");
            c2344009Gk.LJIIIIZZ("anchor_id", liveRoomStruct.owner.getUid());
            c2344009Gk.LIZLLL(liveRoomStruct.id, "room_id");
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, C1ACA c1aca) {
        LiveRoomStruct newLiveRoomDataExt;
        TopFrameSummary topFrameSummary;
        if (!TextUtils.equals(c1aca.LIZLLL, "homepage_hot") && !TextUtils.equals(c1aca.LIZLLL, "homepage_follow")) {
            c2344009Gk.LIZJ(0, "is_program_live");
            return;
        }
        Aweme aweme = c1aca.LIZIZ;
        ShowInfo showInfo = null;
        if (aweme != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null && (topFrameSummary = newLiveRoomDataExt.topFrameSummary) != null) {
            c2344009Gk.LIZJ(1, "is_program_live");
            List<ShowInfo> showList = topFrameSummary.getShowList();
            if (showList != null) {
                Iterator<ShowInfo> it2 = showList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ShowInfo next = it2.next();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis >= next.showStartTime && jCurrentTimeMillis <= next.showEndTime) {
                        showInfo = next;
                        break;
                    }
                }
            }
            if (showInfo != null) {
                c2344009Gk.LJFF("program_live_type", "onstage");
                return;
            } else {
                c2344009Gk.LJFF("program_live_type", "upcoming");
                return;
            }
        }
        c2344009Gk.LIZJ(0, "is_program_live");
    }

    public static void LJIILL(String str, Pair... pairArr) {
        StringBuilder sb = new StringBuilder("scene=");
        sb.append(str);
        for (Pair pair : pairArr) {
            String str2 = (String) pair.getFirst();
            Object second = pair.getSecond();
            sb.append(' ');
            sb.append(str2);
            sb.append('=');
            sb.append(second);
        }
        C20441214yg.LIZIZ("live_preview_qa", sb.toString());
    }

    public static void LJIJJLI(long j, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(j));
        c2344009Gk.LJIIIIZZ("error_type", str);
        C20684815ws.LJIILLIIL("live_preview_strategy_error", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(C1ACA c1aca, boolean z, boolean z2) {
        LiveRoomStruct liveRoomStruct;
        int i;
        String requestId;
        String str;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            long j = c1aca.LJIIJ.LIZ;
            if (j > 0 && c1aca.LIZIZ != null && c1aca.LJIIL) {
                Integer numValueOf = null;
                if (1 != 0) {
                    if (z2) {
                        i = -3;
                    } else if (!z) {
                        i = -2;
                    } else {
                        if (c1aca.LJIIIZ.LIZIZ) {
                            return;
                        }
                        if (c1aca.LLFFF) {
                            i = -4;
                        } else {
                            i = -1;
                        }
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
                    c2344009Gk.LJIIIIZZ("enter_from_merge", c1aca.LIZLLL);
                    c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    c2344009Gk.LJIIIIZZ("anchor_id", liveRoomStruct.owner.getUid());
                    c2344009Gk.LIZLLL(liveRoomStruct.id, "room_id");
                    c2344009Gk.LJIIIIZZ("live_play_session_id", c1aca.LJJJJ);
                    String str2 = c1aca.LJJJJI;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c2344009Gk.LJIIIIZZ("live_session_id", str2);
                    Aweme aweme = c1aca.LIZIZ;
                    if (aweme != null) {
                        requestId = aweme.getRequestId();
                    } else {
                        requestId = null;
                    }
                    c2344009Gk.LJIIIIZZ("request_id", requestId);
                    Aweme aweme2 = c1aca.LIZIZ;
                    if (aweme2 != null) {
                        numValueOf = Integer.valueOf(AwemeBizExtKt.getAwemePosition(aweme2));
                    }
                    c2344009Gk.LJ(numValueOf, "order");
                    C487710JAr.LIZ.getClass();
                    c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct), "follow_status");
                    if (liveRoomStruct.hasCommerceGoods) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk.LJIIIIZZ("is_ecom", str);
                    c2344009Gk.LIZJ(c1aca.LJIIIIZZ, "room_position");
                    c2344009Gk.LIZJ(0, "is_from_draw_req");
                    c2344009Gk.LJIIIIZZ("live_type", RoomStruct.getStreamType(liveRoomStruct).logStreamingType);
                    c2344009Gk.LIZJ(i, "error_code");
                    C20684815ws.LJIILLIIL("livesdk_preview_live_play_fail", c2344009Gk.LIZ);
                }
            }
        }
    }

    public static void LJIIIZ(final C1ACA c1aca, final boolean z, final boolean z2) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        C11NZ.LJJJJZ(Boolean.TRUE).LJL(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0Iv3
            @Override // X.C09JN
            public final void accept(Object obj) {
                long j;
                String uid;
                User user;
                C1C7U.LIZ("LivePreviewLogUtil@b1cf.logGameWatchDuration$1");
                C1AC7 c1ac7 = C1AC7.LIZ;
                long j2 = jCurrentTimeMillis;
                String str = currentUserID;
                C1ACA c1aca2 = c1aca;
                boolean z3 = z;
                boolean z4 = z2;
                c1ac7.getClass();
                if (SlardarSampleSetting.INSTANCE.isReport("livesdk_live_game_watch_duration", 0.0d) && c1aca2 != null && c1aca2.LIZJ != null) {
                    if (z3 && z4) {
                        j = 0;
                    } else {
                        j = j2 - c1aca2.LJIIJ.LIZIZ;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(j, "watch_duration");
                    LiveRoomStruct liveRoomStruct = c1aca2.LIZJ;
                    Long lValueOf = null;
                    if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    c2344009Gk.LJIIIIZZ("anchor_id", uid);
                    LiveRoomStruct liveRoomStruct2 = c1aca2.LIZJ;
                    if (liveRoomStruct2 != null) {
                        lValueOf = Long.valueOf(liveRoomStruct2.id);
                    }
                    c2344009Gk.LJ(lValueOf, "room_id");
                    c2344009Gk.LJIIIIZZ("user_id", str);
                    C20684815ws.LJIILLIIL("livesdk_live_game_watch_duration", c2344009Gk.LIZ);
                }
                C1C7U.LIZIZ("LivePreviewLogUtil@b1cf.logGameWatchDuration$1");
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(X.C1ACA r14, java.lang.String r15, X.C940170aZb r16) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC7.LJIIJ(X.1ACA, java.lang.String, X.0aZb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0576  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(X.C1ACA r23, long r24, X.EnumC2175161AAw r26) {
        /*
            Method dump skipped, instruction units count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC7.LJIIL(X.1ACA, long, X.1AAw):void");
    }

    public static void LJIILIIL(C1ACA c1aca, String str, boolean z) {
        String uid;
        Long lValueOf;
        String requestId;
        String str2;
        User user;
        User user2;
        if (((Boolean) LIZIZ.getValue()).booleanValue() && c1aca != null && !c1aca.LJFF) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1aca.LIZLLL);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            Integer numValueOf = null;
            if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
                uid = user2.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", uid);
            LIZ.getClass();
            c2344009Gk.LJII(LIZLLL(c1aca));
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null) {
                lValueOf = Long.valueOf(liveRoomStruct2.id);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "room_id");
            Aweme aweme = c1aca.LIZIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            LiveRoomStruct liveRoomStruct3 = c1aca.LIZJ;
            if (liveRoomStruct3 != null && (user = liveRoomStruct3.owner) != null) {
                numValueOf = Integer.valueOf(user.getFollowStatus());
            }
            c2344009Gk.LJ(numValueOf, "follow_status");
            c2344009Gk.LIZJ(c1aca.LJIIIIZZ, "room_position");
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1ADO c1ado = c1aca.LJIIJ;
            c2344009Gk.LIZLLL((jCurrentTimeMillis - c1ado.LIZ) + c1ado.LIZJ, "watch_live_duration");
            c2344009Gk.LJIIIIZZ("show_reason", str);
            c2344009Gk.LJIIIIZZ("live_play_session_id", c1aca.LJJJJ);
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("back_from_background", str2);
            C20684815ws.LJIILLIIL("livesdk_finish_card_show", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(X.C1ACA r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC7.LJIILJJIL(X.1ACA, java.lang.String, boolean):void");
    }

    public static void LJIJ(C1ACA c1aca, String str, String str2) {
        LiveRoomStruct liveRoomStruct;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
            C487710JAr.LIZ.getClass();
            c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct), "follow_status");
            c2344009Gk.LJIIIIZZ("style", str);
            c2344009Gk.LJFF("reason_id", str2);
            LIZ.getClass();
            LIZ(c2344009Gk, c1aca);
            C20684815ws.LJIILLIIL("livesdk_interest_reason_show", c2344009Gk.LIZ);
        }
    }

    public static void LJIJJ(int i, long j, boolean z) {
        int i2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(j));
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "bind_hit");
        c2344009Gk.LJIIIIZZ("pulse_count", String.valueOf(i));
        C20684815ws.LJIILLIIL("live_preview_prewarm_bind_result", c2344009Gk.LIZ);
    }

    public static void LJIL(C2344009Gk c2344009Gk, String str, String str2, AFwS229S0000000_2 aFwS229S0000000_2) {
        if (((Boolean) aFwS229S0000000_2.invoke(c2344009Gk.LJIIIZ(str))).booleanValue()) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static void LJIILLIIL(C1ACA c1aca, int i, String str, Integer num, String str2) {
        String string;
        if (c1aca != null && c1aca.LIZJ != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            LIZ.getClass();
            LIZ(c2344009Gk, c1aca);
            c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (num == null || (string = num.toString()) == null) {
                string = "NULL";
            }
            c2344009Gk.LJIIIIZZ("frequency_block_details", string);
            c2344009Gk.LJIIIIZZ("survey_id", str);
            c2344009Gk.LJIIIIZZ("detail_status", str2);
            C20684815ws.LJIILLIIL("livesdk_preview_survey_status", c2344009Gk.LIZ);
        }
    }

    public static void LJII(C1ACA c1aca, EnumC1488280ope enumC1488280ope, long j, long j2, int i, int i2, String str) {
        String uid;
        Long lValueOf;
        User user;
        if (c1aca != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(enumC1488280ope.ordinal(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c2344009Gk.LIZJ(i, "is_p95");
            c2344009Gk.LIZLLL(j, "stream_strategy_duration");
            c2344009Gk.LIZLLL(j2, "star_ship_duration");
            c2344009Gk.LIZJ(i2, "star_ship_result");
            c2344009Gk.LJIIIIZZ("traffic_tag", String.valueOf(str));
            c2344009Gk.LIZJ(C1ABT.LJIJI(c1aca), "preview_stream_trigger_type");
            c2344009Gk.LJIIIIZZ("enter_from_merge", c1aca.LIZLLL);
            c2344009Gk.LJIIIIZZ("action_type", "click");
            LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
            String requestId = null;
            if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("anchor_id", uid);
            LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
            if (liveRoomStruct2 != null) {
                lValueOf = Long.valueOf(liveRoomStruct2.id);
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "room_id");
            LiveRoomStruct liveRoomStruct3 = c1aca.LIZJ;
            if (liveRoomStruct3 != null) {
                requestId = liveRoomStruct3.getRequestId();
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            C20684815ws.LJIILLIIL("livesdk_parallel_pull_traffic_status", c2344009Gk.LIZ);
        }
    }
}
