package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveEnablePlayerSetTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePlayerCreateLogicOptExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveAiSummary;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.feed.setting.LivePreviewLinkPerfSendSetting;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AC8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AC8 {
    public static final C1AC8 LIZ = new C1AC8();
    public static final List<String> LIZIZ = new ArrayList();

    public static void LIZJ(C2344009Gk c2344009Gk) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C755940Tl2.LIZ.getValue();
        for (String str : concurrentHashMap.keySet()) {
            c2344009Gk.LJ(concurrentHashMap.get(str), str);
        }
        ((ConcurrentHashMap) C755940Tl2.LIZ.getValue()).clear();
    }

    public static void LIZ(C2344009Gk c2344009Gk, C1ACA c1aca) {
        String reason;
        LiveAiSummary liveAiSummary;
        String str;
        EnumC745120TKs enumC745120TKs = c1aca.LJJLJLI;
        if (enumC745120TKs != null) {
            reason = enumC745120TKs.getReason();
        } else {
            reason = null;
        }
        c2344009Gk.LJFF("ai_summary_show_fail_reason", reason);
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct != null && (liveAiSummary = liveRoomStruct.getLiveAiSummary()) != null) {
            c2344009Gk.LIZJ(c1aca.LJJZZIII, "is_ai_summary_show");
            c2344009Gk.LJFF("is_ai_room", liveAiSummary.aiLiveSummaryVersions);
            List<String> list = liveAiSummary.aiSummaryList;
            if (list != null && !list.isEmpty()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("is_ai_summary_load", str);
            String str2 = liveAiSummary.resultKey;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c2344009Gk.LJFF("result_key", str2);
            String str4 = liveAiSummary.audienceSideTitleLanguage;
            if (str4 != null) {
                str3 = str4;
            }
            c2344009Gk.LJFF("aisummary_language", str3);
        }
    }

    public static C2344009Gk LIZLLL(C2344009Gk c2344009Gk, C1ACD c1acd) {
        String strLJIIIIZZ = c1acd.LJIIIIZZ();
        if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
            c2344009Gk.LJIIIIZZ("sdk_first_frame_state", strLJIIIIZZ);
        }
        return c2344009Gk;
    }

    public static void LJ(C2344009Gk c2344009Gk, C1ACA c1aca) {
        Integer numValueOf;
        float fFloatValue;
        float fFloatValue2;
        boolean z;
        String str;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        if (liveRoomStruct == null) {
            return;
        }
        if (RoomStruct.getStreamType(liveRoomStruct) == LiveMode.LIVE_STUDIO || RoomStruct.getStreamType(liveRoomStruct) == LiveMode.SCREEN_RECORD || RoomStruct.getStreamType(liveRoomStruct) == LiveMode.THIRD_PARTY) {
            GameTagDetail gameTagDetail = liveRoomStruct.gameTagDetail;
            String str2 = "";
            if (gameTagDetail == null) {
                numValueOf = "";
            } else {
                numValueOf = Integer.valueOf(gameTagDetail.gameTagId);
            }
            c2344009Gk.LJ(numValueOf, "game_tag_id");
            GameTagDetail gameTagDetail2 = liveRoomStruct.gameTagDetail;
            if (gameTagDetail2 != null && (str = gameTagDetail2.gameTagName) != null) {
                str2 = str;
            }
            c2344009Gk.LJFF("game_tag_name", str2);
            Float f = c1aca.LJIJ;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            Float f2 = c1aca.LJIJI;
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            C844470XAv.LIZ.getClass();
            int iLJIIJ = C12ES.LJIIJ(C844470XAv.LIZ());
            if (fFloatValue == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String strValueOf = CardStruct.IStatusCode.DEFAULT;
                c2344009Gk.LJFF("is_game_cut", CardStruct.IStatusCode.DEFAULT);
                c2344009Gk.LJFF("final_width", String.valueOf(iLJIIJ));
                if (fFloatValue2 != 0.0f) {
                    strValueOf = String.valueOf((int) (iLJIIJ / fFloatValue2));
                }
                c2344009Gk.LJFF("final_height", strValueOf);
                return;
            }
            c2344009Gk.LJFF("is_game_cut", "1");
            c2344009Gk.LJFF("final_width", String.valueOf(iLJIIJ));
            c2344009Gk.LJFF("final_height", String.valueOf((int) (iLJIIJ / fFloatValue)));
        }
    }

    public static void LJII(C2344009Gk c2344009Gk, C2175771ADf c2175771ADf) {
        int i = 1;
        try {
            if (CastIntegerProtector.parseInt(c2344009Gk.LJIIIZ("stream_state")) >= 4) {
                c2175771ADf.LIZJ = 1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (c2175771ADf.LIZ != 0 || c2175771ADf.LIZJ != 0) {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_screen_black");
        c2344009Gk.LIZJ(c2175771ADf.LIZ, "is_bg_shown");
        c2344009Gk.LIZJ(c2175771ADf.LIZJ, "is_stream_seen");
        c2344009Gk.LIZJ(c2175771ADf.LIZIZ, "is_widget_visible");
        c2175771ADf.LIZ = 0;
        c2175771ADf.LIZIZ = 0;
        c2175771ADf.LIZJ = 0;
    }

    public static void LJIIIZ(C2344009Gk c2344009Gk, C1ACA c1aca) {
        if (c1aca.LJLZ != null || c1aca.LJZ != null) {
            c2344009Gk.LIZJ(1, "is_interest_reason_show");
        }
        String str = c1aca.LJZL;
        if (str != null || (str = c1aca.LJZI) != null) {
            c2344009Gk.LJFF("interest_reason_fail_show_reason", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2344009Gk LIZIZ(X.C2344009Gk r11, X.C1ACA r12, long r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC8.LIZIZ(X.09Gk, X.1ACA, long):X.09Gk");
    }

    public static void LJFF(C2344009Gk c2344009Gk, C1ACA c1aca, LiveRoomStruct liveRoomStruct) {
        long j;
        String str;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiGuestLayoutInfo multiGuestLayoutInfo2;
        MultiLiveUserSettings multiLiveUserSettings = liveRoomStruct.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings2 = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo2 = multiLiveUserApplySettings2.multiGuestLayoutInfo) != null) {
            j = multiGuestLayoutInfo2.guestCnt;
        } else {
            j = 0;
        }
        c1aca.LJJLIIIJLLLLLLLZ = (int) j;
        if (multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) == null || (str = multiGuestLayoutInfo.multiLayoutKey) == null) {
            str = "";
        }
        c1aca.LJJLIIJ = str;
        c2344009Gk.LIZJ(1, "has_multi_track_data");
        c2344009Gk.LIZJ(c1aca.LJJLIIIJLLLLLLLZ, "guest_cnt_pre");
        c2344009Gk.LJFF("multi_layout_key_pre", c1aca.LJJLIIJ);
    }

    public static void LJI(C2344009Gk c2344009Gk, C1ACA c1aca, long j) {
        int i;
        String str;
        long jLJJIIJ;
        if (!((LivePreviewLinkPerfSendSetting.PreviewLinkPerfSendConfig) LivePreviewLinkPerfSendSetting.LIZIZ.getValue()).isEnable) {
            return;
        }
        long j2 = c1aca.LJIIJ.LIZ;
        if (j2 > 0) {
            i = (int) ((j - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            i = 0;
        }
        if (!c1aca.LJJIJIIJIL.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJIZ(c1aca.LJJIJIIJIL), "fps");
        } else if (i > 0) {
            float fLJFF = ((C1ADU) C781400Ul0.LIZ.getValue()).LJFF(i);
            c2344009Gk.LIZIZ(fLJFF, "fps");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendPerfParams final fps: ");
            sbLIZ.append(fLJFF);
            sbLIZ.append(" stayDur = ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!c1aca.LJJIJIL.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJIZ(c1aca.LJJIJIL), "drop3_plus_rate");
        } else if (i > 0) {
            float fLJIIIIZZ = ((C1ADU) C781400Ul0.LIZ.getValue()).LJIIIIZZ(i);
            c2344009Gk.LIZIZ(fLJIIIIZZ, "drop3_plus_rate");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("appendPerfParams final drop3: ");
            sbLIZ2.append(fLJIIIIZZ);
            sbLIZ2.append(" stayDur = ");
            sbLIZ2.append(i);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (!c1aca.LJJIZ.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJIZ(c1aca.LJJIZ), "temperature");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("appendPerfParams avg temp: ");
            sbLIZ3.append(C13LP.LJJIZ(c1aca.LJJIZ));
            C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            float f = C476230Ilx.LIZ.LJFF;
            c2344009Gk.LIZIZ(f, "temperature");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("appendPerfParams final temp: ");
            sbLIZ4.append(f);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (!c1aca.LJJIJLIJ.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJIL(c1aca.LJJIJLIJ), "cpu_speed");
        }
        if (!c1aca.LJJIL.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJIL(c1aca.LJJIL), "cpu_rate");
        }
        if (!c1aca.LJJIJL.isEmpty()) {
            c2344009Gk.LIZ(C13LP.LJJJI(c1aca.LJJIJL), "sei_delay");
        } else {
            C2175861ADo c2175861ADo = c1aca.LJIIIZ;
            Boolean boolValueOf = null;
            if (c2175861ADo != null && (str = c2175861ADo.LIZ) != null && str.length() != 0) {
                InterfaceC480520Iss interfaceC480520IssLLJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLJJ(str, LivePlayerCreateLogicOptExp.isForbidCreate());
                if (interfaceC480520IssLLJJ != null) {
                    jLJJIIJ = interfaceC480520IssLLJJ.LJJIIJ();
                } else {
                    jLJJIIJ = 0;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("playerController = ");
                sbLIZ5.append(interfaceC480520IssLLJJ);
                sbLIZ5.append(" isPlaying = ");
                if (interfaceC480520IssLLJJ != null) {
                    boolValueOf = Boolean.valueOf(interfaceC480520IssLLJJ.isPlaying());
                }
                sbLIZ5.append(boolValueOf);
                sbLIZ5.append(" seiDelay-");
                sbLIZ5.append(jLJJIIJ);
                C2188811AlT.LIZIZ(sbLIZ5);
                if (jLJJIIJ > 0) {
                    c2344009Gk.LIZLLL(jLJJIIJ, "sei_delay");
                }
            }
        }
        long j3 = c1aca.LJJJI;
        if (j3 > 0) {
            c2344009Gk.LIZLLL(j3, "stream_resolution");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2344009Gk LJIIIIZZ(X.C2344009Gk r11, X.C1ACA r12, X.C473100Igu r13, X.C1ACS r14, X.C1ACA r15) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AC8.LJIIIIZZ(X.09Gk, X.1ACA, X.0Igu, X.1ACS, X.1ACA):X.09Gk");
    }

    public static void LJIIJ(final int i, final long j, final C2344009Gk c2344009Gk, final C1ACD c1acd, final String str, final String str2, final String str3, final String str4) {
        C799570VYd.LJFF(false).submit(new Runnable() { // from class: X.0Iux
            public final void LIZ() {
                JSONObject jSONObjectOptJSONObject;
                C1699430uKD playerThreadBlockStatus;
                C1AC7 c1ac7 = C1AC7.LIZ;
                String str5 = str;
                c1ac7.getClass();
                ArrayList arrayList = new ArrayList();
                if (str5 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                arrayList.add(itKeys.next());
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                String string = arrayList.toString();
                C1AC8 c1ac8 = C1AC8.LIZ;
                C2344009Gk c2344009Gk2 = c2344009Gk;
                c1ac8.getClass();
                C1AC8.LIZJ(c2344009Gk2);
                C1ACD c1acd2 = c1acd;
                if (LiveEnablePlayerSetTimeoutSetting.INSTANCE.getValue() && (playerThreadBlockStatus = c1acd2.getPlayerThreadBlockStatus()) != null) {
                    c2344009Gk2.LIZJ(playerThreadBlockStatus.LIZ, "block_msg");
                }
                String str6 = str2;
                Pair<Integer, Integer> pairLIZ = C1976707oj.LIZ(str3);
                if (pairLIZ != null) {
                    String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                    c2344009Gk2.getClass();
                    c2344009Gk2.LJIIIIZZ("user_id", strValueOf);
                    c2344009Gk2.LJIIIIZZ("initial_definition", str6);
                    c2344009Gk2.LIZJ((pairLIZ.getFirst().intValue() < pairLIZ.getSecond().intValue() ? 1 : 0) ^ 1, "is_origin_horizontal");
                    c2344009Gk2.LIZJ(pairLIZ.getFirst().intValue(), "origin_width");
                    c2344009Gk2.LIZJ(pairLIZ.getSecond().intValue(), "origin_height");
                }
                c2344009Gk2.getClass();
                c2344009Gk2.LJIIIIZZ("resolution_list", string);
                c2344009Gk2.LJIIIIZZ("default_resolution", str4);
                c2344009Gk2.LIZLLL(j, "stall_duration");
                c2344009Gk2.LIZJ(i, "stall_count");
                c2344009Gk2.LJIIIIZZ("play_resolution", str2);
                C20684815ws.LJIILLIIL("livesdk_live_card_full_link", c2344009Gk2.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LivePreviewFullLinkManager@20ef.reportFullLinkLogAsync$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LivePreviewFullLinkManager@20ef.reportFullLinkLogAsync$1");
            }
        });
    }
}
