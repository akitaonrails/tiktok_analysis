package Y;

import X.AbstractC516030KLp;
import X.C036E;
import X.C09JN;
import X.C0IF0;
import X.C0IJT;
import X.C0IO6;
import X.C0ITM;
import X.C0ITP;
import X.C0IV1;
import X.C0IVA;
import X.C0J7L;
import X.C0J7Y;
import X.C0K04;
import X.C0KSS;
import X.C0KST;
import X.C0KSU;
import X.C1161920gLG;
import X.C11JF;
import X.C11JL;
import X.C11S5;
import X.C1286510jaD;
import X.C1494450ozb;
import X.C1494570ozn;
import X.C1494690ozz;
import X.C16F5;
import X.C1701940uOG;
import X.C1811850xFX;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465330IMp;
import X.C465340IMq;
import X.C465350IMr;
import X.C472820IgS;
import X.C474500IjA;
import X.C477500Io0;
import X.C477520Io2;
import X.C477680IoI;
import X.C477860Ioa;
import X.C477900Ioe;
import X.C477930Ioh;
import X.C480460Ism;
import X.C497740JfY;
import X.C501440JlW;
import X.C501470JlZ;
import X.C501520Jle;
import X.C512300K7g;
import X.C516120KLy;
import X.C518170KTv;
import X.C518180KTw;
import X.C748980TZo;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C930540aK4;
import X.EnumC471750Iej;
import X.InterfaceC466760ISc;
import X.InterfaceC518010KTf;
import X.InterfaceC954180awC;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.MultiGuestLinkMicMatchFragmentAuto;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.service.LinkMicMatchService;
import com.bytedance.android.live.liveinteract.multilive.model.HostReportOpenLinkmicPanelParams;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideVM;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.api.room.PreviewGoLiveAnchorPoint;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyCheckData;
import webcast.api.sub.GetSubGoalResponse;

/* JADX INFO: loaded from: classes8.dex */
public class AfS3S0100100_7 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        Map<Long, Long> mapLIZ;
        Map<Long, Long> mapLIZ2;
        Map<Long, Long> mapLIZ3;
        C0J7L c0j7l = (C0J7L) afS3S0100100_7.l0;
        long j = afS3S0100100_7.j1;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        c0j7l.getClass();
        C1C7U.LIZ("LiveStateManager$RefreshRequest@a83.run$1L");
        LiveStateResponse.MapUserIdRoomId mapUserIdRoomId = liveStateResponse.mapUserIdRoomId;
        if (mapUserIdRoomId == null) {
            mapLIZ = new HashMap<>(0);
        } else {
            mapLIZ = mapUserIdRoomId.LIZ();
        }
        if (!mapLIZ.isEmpty()) {
            LiveStateResponse.MapUserIdRoomId mapUserIdRoomId2 = liveStateResponse.mapUserIdRoomId;
            if (mapUserIdRoomId2 == null) {
                mapLIZ2 = new HashMap<>(0);
            } else {
                mapLIZ2 = mapUserIdRoomId2.LIZ();
            }
            Set<Long> setKeySet = mapLIZ2.keySet();
            LiveStateResponse.MapUserIdRoomId mapUserIdRoomId3 = liveStateResponse.mapUserIdRoomId;
            if (mapUserIdRoomId3 == null) {
                mapLIZ3 = new HashMap<>(0);
            } else {
                mapLIZ3 = mapUserIdRoomId3.LIZ();
            }
            for (Long l : setKeySet) {
                ((HashMap) c0j7l.LLIZ.LJ).put(l, Long.valueOf(j));
                Long l2 = mapLIZ3.get(l);
                if (l2 == null) {
                    l2 = 0L;
                }
                if (!C0J7Y.LJIIL.equals(l2)) {
                    ((HashMap) c0j7l.LLIZ.LIZ).put(l, l2);
                } else {
                    ((HashMap) c0j7l.LLIZ.LIZ).remove(l);
                }
            }
        } else {
            ((HashMap) c0j7l.LLIZ.LIZ).put(c0j7l.LLILLJJLI, 0L);
        }
        c0j7l.LIZIZ();
        C1C7U.LIZIZ("LiveStateManager$RefreshRequest@a83.run$1L");
    }

    public static final void accept$1(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("PaywallDataSource@b65f.loadResponse$4$perSpecPrices$2");
        C518170KTv.LIZIZ("prefetch_iap_product_detail", "success", SystemClock.elapsedRealtime() - afS3S0100100_7.j1, null, null, null, null, null, null, (Map) afS3S0100100_7.l0, 1016);
        C1C7U.LIZIZ("PaywallDataSource@b65f.loadResponse$4$perSpecPrices$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$10(Y.AfS3S0100100_7 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0100100_7.accept$10(Y.AfS3S0100100_7, java.lang.Object):void");
    }

    public static final void accept$11(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("LiveHangoutPushCardController@4e83.getPushCardData$2");
        Throwable th = (Throwable) obj;
        C477500Io0.LIZ.getClass();
        C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(th);
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
        String str = c477680IoILJIJ.LIZJ;
        if (str == null) {
            str = "";
        }
        C477860Ioa.LJI(new C477900Ioe("LiveHangoutFragment # getPushCardData, error", jCurrentTimeMillis, "error", str, String.valueOf(c477680IoILJIJ.LIZ), c477680IoILJIJ.LIZIZ));
        String str2 = ((C477930Ioh) afS3S0100100_7.l0).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get push card data fail:");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveHangoutPushCardController@4e83.getPushCardData$2");
    }

    public static final void accept$12(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("CaptureImageUploadController@8178.upload$2");
        ((C1286510jaD) afS3S0100100_7.l0).LJI = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload complete duration:");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("CaptureImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
        ((C1286510jaD) afS3S0100100_7.l0).LJ();
        C1C7U.LIZIZ("CaptureImageUploadController@8178.upload$2");
    }

    public static final void accept$13(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("CaptureImageUploadController@8178.upload$3");
        Throwable th = (Throwable) obj;
        ((C1286510jaD) afS3S0100100_7.l0).LJI = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload error msg:");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(" duration:");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("CaptureImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C501520Jle) {
            C0K04.LJ("error_code", ((C501520Jle) th).getErrorCode(), jSONObject);
        } else {
            C0K04.LIZLLL(-1, "error_code", jSONObject);
        }
        C0K04.LJFF("error_msg", th.getMessage(), jSONObject);
        ((C1286510jaD) afS3S0100100_7.l0).LJ();
        C1C7U.LIZIZ("CaptureImageUploadController@8178.upload$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        long j;
        FeedExtra feedExtra;
        List<FeedItem> list;
        C0IO6 c0io6;
        C0IO6 c0io62;
        C1C7U.LIZ("HashtagAudienceDialog@6ad8.fetchFeedLoadMore$2");
        C0ITM c0itm = (C0ITM) obj;
        C0ITP c0itp = (C0ITP) c0itm.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C465340IMq c465340IMq = new C465340IMq();
        c465340IMq.LIZ = c0itm.LJ;
        c465340IMq.LIZLLL = c0itm.LIZLLL;
        c465340IMq.LJ = "/webcast/feed/";
        c465340IMq.LJFF = c0itm.LJFF;
        C465330IMp.LIZ(afS3S0100100_7.j1, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
        if (c0itp != null && (list = c0itp.LIZ) != null) {
            HashtagAudienceDialog hashtagAudienceDialog = (HashtagAudienceDialog) afS3S0100100_7.l0;
            C0IO6 c0io63 = null;
            if (list.isEmpty()) {
                C0IO6 c0io64 = hashtagAudienceDialog.LLJILJILJ;
                if (c0io64 == null) {
                    c0io62 = null;
                } else {
                    c0io62 = c0io64;
                }
                c0io62.LLILLJJLI = 3;
                if (c0io64 != null) {
                    c0io63 = c0io64;
                }
                c0io63.notifyDataSetChanged();
            } else {
                C0IO6 c0io65 = hashtagAudienceDialog.LLJILJILJ;
                if (c0io65 == null) {
                    c0io6 = null;
                } else {
                    c0io6 = c0io65;
                }
                c0io6.LLILLJJLI = 2;
                if (c0io65 != null) {
                    c0io63 = c0io65;
                }
                ((ArrayList) c0io63.LLILLL).addAll(list);
                c0io63.notifyDataSetChanged();
            }
        }
        HashtagAudienceDialog hashtagAudienceDialog2 = (HashtagAudienceDialog) afS3S0100100_7.l0;
        if (c0itp != null && (feedExtra = c0itp.LIZIZ) != null) {
            j = feedExtra.maxTime;
        } else {
            j = 0;
        }
        hashtagAudienceDialog2.LLJJ = j;
        C1C7U.LIZIZ("HashtagAudienceDialog@6ad8.fetchFeedLoadMore$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$15(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("SuperFansGoalViewModel@cce5.getSuperFansGoalInfo$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
        if (baseResponse != null) {
            int i = baseResponse.statusCode;
            if (baseResponse.data != 0) {
                C518180KTw.LJIIIIZZ(0, i, "/webcast/sub/goal/get/", jCurrentTimeMillis);
                ((InterfaceC518010KTf) afS3S0100100_7.l0).LIZ((GetSubGoalResponse.Data) baseResponse.data);
            }
        }
        C1C7U.LIZIZ("SuperFansGoalViewModel@cce5.getSuperFansGoalInfo$dispose$1");
    }

    public static final void accept$16(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("SuperFansGoalViewModel@cce5.getSuperFansGoalInfo$dispose$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C1494690ozz) {
            C518180KTw.LJIIIZ("/webcast/sub/goal/get/", (C1494690ozz) th, System.currentTimeMillis() - afS3S0100100_7.j1);
        }
        ((InterfaceC518010KTf) afS3S0100100_7.l0).onFailure();
        C1C7U.LIZIZ("SuperFansGoalViewModel@cce5.getSuperFansGoalInfo$dispose$2");
    }

    public static final void accept$17(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        int i;
        C1C7U.LIZ("FansClubViewModel@394b.requestFansTaskInfo$dispose$2");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
        boolean z = th instanceof C1494690ozz;
        if (z) {
            C518180KTw.LJIIIZ("/webcast/privilege/fans_get_task_info/", (C1494690ozz) th, jCurrentTimeMillis);
        }
        int i2 = (int) jCurrentTimeMillis;
        String strValueOf = String.valueOf(((Room) afS3S0100100_7.l0).getId());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fetch_fans_task_complete");
        c474500IjALIZ.LJIL();
        if (th instanceof C477520Io2) {
            c474500IjALIZ.LJJII("custom_api_error", "error_type");
            C477520Io2 c477520Io2 = (C477520Io2) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c477520Io2.getErrorCode()), "errorCode");
            c474500IjALIZ.LJJII(c477520Io2.getErrorMsg(), "error_msg");
            c474500IjALIZ.LJJII(c477520Io2.getxTtLogId(), "log_id");
        } else if (th instanceof C501470JlZ) {
            c474500IjALIZ.LJJII("api_error", "error_type");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c501470JlZ.getErrorCode()), "errorCode");
            c474500IjALIZ.LJJII(c501470JlZ.getErrorMsg(), "error_msg");
            c474500IjALIZ.LJJII(c501470JlZ.getLogId(), "log_id");
        } else if (th instanceof C1811850xFX) {
            c474500IjALIZ.LJJII("net_error", "error_type");
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            c474500IjALIZ.LJJII(Integer.valueOf(c1811850xFX.getCronetError()), "errorCode");
            c474500IjALIZ.LJJII(c1811850xFX.getMessage(), "error_msg");
        } else if (z) {
            c474500IjALIZ.LJJII("cronet_io_error", "error_type");
            c474500IjALIZ.LJJII(-2, "errorCode");
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
            c474500IjALIZ.LJJII(Integer.valueOf(i), "errorCode");
            c474500IjALIZ.LJJII(th.getMessage(), "error_msg");
        } else {
            c474500IjALIZ.LJJII(th.getClass().getCanonicalName(), "error_type");
            c474500IjALIZ.LJJII(-1, "errorCode");
            c474500IjALIZ.LJJII(th.getMessage(), "error_msg");
        }
        c474500IjALIZ.LJJII(0, "success");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "duration");
        c474500IjALIZ.LJJII(strValueOf, "room_id");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("FansClubViewModel@394b.requestFansTaskInfo$dispose$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        PreviewGoLiveAnchorPoint previewGoLiveAnchorPoint;
        int i;
        ShowMode showMode;
        C1C7U.LIZ("GoLiveGuideVM@bf6d.checkStrategy$1");
        StrategyCheckData strategyCheckData = (StrategyCheckData) ((BaseResponse) obj).data;
        if (strategyCheckData != null && strategyCheckData.decision == 1) {
            long j = afS3S0100100_7.j1;
            GoLiveGuideVM goLiveGuideVM = (GoLiveGuideVM) afS3S0100100_7.l0;
            if (j == goLiveGuideVM.LLILZLL) {
                if (strategyCheckData != null && (showMode = strategyCheckData.showMode) != null) {
                    previewGoLiveAnchorPoint = showMode.previewGoLive;
                } else {
                    previewGoLiveAnchorPoint = null;
                }
                goLiveGuideVM.LLILLL = previewGoLiveAnchorPoint;
                if (previewGoLiveAnchorPoint != null && (i = previewGoLiveAnchorPoint.style) != 0) {
                    if (i == 1) {
                        if (previewGoLiveAnchorPoint != null) {
                            previewGoLiveAnchorPoint.LIZ = j;
                        }
                        goLiveGuideVM.LLILLJJLI.setValue(previewGoLiveAnchorPoint);
                    }
                } else {
                    goLiveGuideVM.LL.setValue(Boolean.TRUE);
                }
            }
        }
        C1C7U.LIZIZ("GoLiveGuideVM@bf6d.checkStrategy$1");
    }

    public static final void accept$19(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("FansTemplateFetchRepo@784.fetchTemplate$result$2");
        Throwable th = (Throwable) obj;
        C516120KLy c516120KLyLIZ = C0KSS.LIZ((C0KSS) afS3S0100100_7.l0, System.currentTimeMillis() - afS3S0100100_7.j1, null, th, 2);
        ((C0KSS) afS3S0100100_7.l0).LIZIZ.getClass();
        AbstractC516030KLp.LIZ(c516120KLyLIZ);
        C0KSU<GetNonFansUserDataResponse.Data> c0ksu = ((C0KSS) afS3S0100100_7.l0).LIZ.LJIIJ;
        Integer numValueOf = Integer.valueOf(C512300K7g.LIZIZ(th));
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c0ksu.LIZIZ(numValueOf, message);
        C1C7U.LIZIZ("FansTemplateFetchRepo@784.fetchTemplate$result$2");
    }

    public static final void accept$2(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("PaywallDataSource@b65f.loadResponse$4$perSpecPrices$3");
        C518170KTv.LIZIZ("prefetch_iap_product_detail", "fail", SystemClock.elapsedRealtime() - afS3S0100100_7.j1, null, null, null, null, ((Throwable) obj).getMessage(), "server", (Map) afS3S0100100_7.l0, 248);
        C1C7U.LIZIZ("PaywallDataSource@b65f.loadResponse$4$perSpecPrices$3");
    }

    public static final void accept$20(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("TreasureBoxTemplateFetchRepo@7d68.fetchTemplate$result$2");
        Throwable th = (Throwable) obj;
        C516120KLy c516120KLyLIZ = C0KST.LIZ((C0KST) afS3S0100100_7.l0, System.currentTimeMillis() - afS3S0100100_7.j1, null, th, 2);
        ((C0KST) afS3S0100100_7.l0).LIZIZ.getClass();
        AbstractC516030KLp.LIZ(c516120KLyLIZ);
        C0KSU<GetSuperFansTreasureBoxDataResponse.Data> c0ksu = ((C0KST) afS3S0100100_7.l0).LIZ.LJIIJ;
        Integer numValueOf = Integer.valueOf(C512300K7g.LIZIZ(th));
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c0ksu.LIZIZ(numValueOf, message);
        C1C7U.LIZIZ("TreasureBoxTemplateFetchRepo@7d68.fetchTemplate$result$2");
    }

    public static final void accept$3(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("CommonSkylightDataManager@25b.refreshData$1");
        BaseListResponse<FeedItem, FeedExtra> baseListResponse = (BaseListResponse) obj;
        CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
        EnumC471750Iej enumC471750Iej = (EnumC471750Iej) afS3S0100100_7.l0;
        if ((enumC471750Iej == EnumC471750Iej.ENTER_TOPLIVE || enumC471750Iej == EnumC471750Iej.MULTI_TOPLIVE_MANUAL_REFRESH) && afS3S0100100_7.j1 > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - afS3S0100100_7.j1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommonSkylightDataManager skyLight cost:");
            sbLIZ.append(jCurrentTimeMillis);
            C20441214yg.LIZIZ("MultiTopLive", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0IV1 c0iv1 = CommonSkylightDataManager.LIZIZ;
        c0iv1.LIZJ(false);
        long jUptimeMillis = SystemClock.uptimeMillis();
        CommonSkylightDataManager commonSkylightDataManager2 = CommonSkylightDataManager.LIZ;
        CommonSkylightDataManager.LJJIFFI(SystemClock.uptimeMillis(), baseListResponse.data);
        CommonSkylightDataManager.LJ = baseListResponse;
        CommonSkylightDataManager.LJIIIIZZ = jUptimeMillis;
        CommonSkylightDataManager.LJFF = null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("refreshData success, ");
        sbLIZ2.append(CommonSkylightDataManager.LJIIIIZZ);
        C20441214yg.LJIIIZ("SkylightDataManager", C2188811AlT.LIZIZ(sbLIZ2));
        EnumC471750Iej enumC471750Iej2 = (EnumC471750Iej) afS3S0100100_7.l0;
        long j = CommonSkylightDataManager.LJII;
        Iterator it2 = ((CopyOnWriteArrayList) CommonSkylightDataManager.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((C0IVA) it2.next()).LIZ(enumC471750Iej2, j);
        }
        EnumC471750Iej enumC471750Iej3 = (EnumC471750Iej) afS3S0100100_7.l0;
        Iterator it3 = ((CopyOnWriteArrayList) CommonSkylightDataManager.LIZLLL).iterator();
        while (it3.hasNext()) {
            ((C0IVA) it3.next()).LIZIZ(enumC471750Iej3, true);
        }
        c0iv1.LIZIZ(new C0ITP(baseListResponse.data, (FeedExtra) baseListResponse.extra));
        C1C7U.LIZIZ("CommonSkylightDataManager@25b.refreshData$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        long j;
        Long l;
        FeedExtra feedExtra;
        List<FeedItem> list;
        String str;
        C1C7U.LIZ("HashtagAudienceDialog@6ad8.fetchFeedRefresh$2");
        C0ITM c0itm = (C0ITM) obj;
        C0ITP c0itp = (C0ITP) c0itm.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C465340IMq c465340IMq = new C465340IMq();
        c465340IMq.LIZ = c0itm.LJ;
        c465340IMq.LIZLLL = c0itm.LIZLLL;
        c465340IMq.LJ = "/webcast/feed/";
        c465340IMq.LJFF = c0itm.LJFF;
        C465330IMp.LIZ(afS3S0100100_7.j1, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
        if (c0itp != null && (list = c0itp.LIZ) != null) {
            HashtagAudienceDialog hashtagAudienceDialog = (HashtagAudienceDialog) afS3S0100100_7.l0;
            if (list.isEmpty()) {
                if (hashtagAudienceDialog.LLJJI) {
                    hashtagAudienceDialog.NR().LIZJ("WithGoLivePerm");
                } else {
                    hashtagAudienceDialog.NR().LIZJ("WithoutGoLivePerm");
                }
            } else {
                hashtagAudienceDialog.NR().LIZLLL();
                FeedExtra feedExtra2 = c0itp.LIZIZ;
                C0IO6 c0io6 = null;
                if (feedExtra2 != null && (str = feedExtra2.hashtag_text) != null) {
                    View viewFindViewById = hashtagAudienceDialog.LLJI;
                    if (viewFindViewById == null) {
                        View view = hashtagAudienceDialog.getView();
                        if (view != null) {
                            viewFindViewById = view.findViewById(R.id.jhc);
                        } else {
                            viewFindViewById = null;
                        }
                        hashtagAudienceDialog.LLJI = (C16F5) viewFindViewById;
                    }
                    C16F5 c16f5 = (C16F5) viewFindViewById;
                    c16f5.setText(str);
                    C786410Ut5.LLJJJJ(c16f5, 0);
                }
                C0IO6 c0io62 = hashtagAudienceDialog.LLJILJILJ;
                if (c0io62 != null) {
                    c0io6 = c0io62;
                }
                ((ArrayList) c0io6.LLILLL).addAll(list);
                c0io6.notifyDataSetChanged();
            }
        }
        HashtagAudienceDialog hashtagAudienceDialog2 = (HashtagAudienceDialog) afS3S0100100_7.l0;
        long jLongValue = 0;
        if (c0itp != null && (feedExtra = c0itp.LIZIZ) != null) {
            j = feedExtra.maxTime;
        } else {
            j = 0;
        }
        hashtagAudienceDialog2.LLJJ = j;
        DataChannel dataChannel = hashtagAudienceDialog2.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C748980TZo.class)) != null) {
            jLongValue = l.longValue();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_topic_duration");
        c474500IjALIZ.LJIJJLI(((HashtagAudienceDialog) afS3S0100100_7.l0).dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - jLongValue), "duration");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("HashtagAudienceDialog@6ad8.fetchFeedRefresh$2");
    }

    public static final void accept$5(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C0IF0 c0if0 = (C0IF0) afS3S0100100_7.l0;
        long j = afS3S0100100_7.j1;
        C1C7U.LIZ("RoomManager@6c79.requestSmartPreEnter$2L");
        if (c0if0 != null) {
            c0if0.LIZIZ(j);
        }
        C1C7U.LIZIZ("RoomManager@6c79.requestSmartPreEnter$2L");
    }

    public static final void accept$6(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        long jLongValue;
        String strU3;
        C1C7U.LIZ("LinkMicMatchAnchorHelper@afea.startLoopReport$1");
        Long l = (Long) obj;
        long j = afS3S0100100_7.j1;
        if (l != null && l.longValue() == j) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LinkMicMatchAnchorHelper == ");
            sbLIZ.append(afS3S0100100_7.j1);
            C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C501440JlW c501440JlW = (C501440JlW) afS3S0100100_7.l0;
            if (c501440JlW.LIZ > 0) {
                HostReportOpenLinkmicPanelParams hostReportOpenLinkmicPanelParams = new HostReportOpenLinkmicPanelParams();
                Long lLJIIJ = C930540aK4.LJIIJ();
                long jLongValue2 = 0;
                if (lLJIIJ != null) {
                    jLongValue = lLJIIJ.longValue();
                } else {
                    jLongValue = 0;
                }
                hostReportOpenLinkmicPanelParams.roomId = jLongValue;
                Long lLJII = C930540aK4.LJII();
                if (lLJII != null) {
                    jLongValue2 = lLJII.longValue();
                }
                hostReportOpenLinkmicPanelParams.anchorId = jLongValue2;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
                    strU3 = CardStruct.IStatusCode.DEFAULT;
                }
                try {
                    hostReportOpenLinkmicPanelParams.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
                    hostReportOpenLinkmicPanelParams.channelId = CastLongProtector.parseLong(strU3);
                    hostReportOpenLinkmicPanelParams.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
                    hostReportOpenLinkmicPanelParams.accOpenedCounter = c501440JlW.LIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C480460Ism.LIZ().getClass();
                c501440JlW.LIZJ = (C11JL) ((LinkMicMatchService) C480460Ism.LIZLLL(LinkMicMatchService.class)).reportAnchorOpenLinkMicPanelTimes(hostReportOpenLinkmicPanelParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS176S0100000_7(c501440JlW, 163), new C09JN() { // from class: X.0IgU
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("LinkMicMatchAnchorHelper@afea.reportAnchorOpenLinkMicPanelTimes$2");
                        C472820IgS.LIZ("reportAnchorOpenLinkMicPanelTimes error");
                        C1C7U.LIZIZ("LinkMicMatchAnchorHelper@afea.reportAnchorOpenLinkMicPanelTimes$2");
                    }
                });
            }
            C501440JlW c501440JlW2 = (C501440JlW) afS3S0100100_7.l0;
            C11JF c11jf = c501440JlW2.LIZIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c501440JlW2.LIZIZ = null;
            ((C501440JlW) afS3S0100100_7.l0).LIZ();
        }
        C1C7U.LIZIZ("LinkMicMatchAnchorHelper@afea.startLoopReport$1");
    }

    public static final void accept$7(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("MultiGuestLinkMicMatchFragmentAuto@9bfa.startCountdown$1");
        Long l = (Long) obj;
        long j = afS3S0100100_7.j1;
        if (l != null && l.longValue() == j) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("autoDialogCurrentTimeSec == ");
            sbLIZ.append(afS3S0100100_7.j1);
            C472820IgS.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            ((MultiGuestLinkMicMatchFragmentAuto) afS3S0100100_7.l0).dismissAllowingStateLoss();
        }
        C1C7U.LIZIZ("MultiGuestLinkMicMatchFragmentAuto@9bfa.startCountdown$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("FeedApiManager@9905.fetchData$3");
        C0ITM c0itm = (C0ITM) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C465340IMq c465340IMq = new C465340IMq();
        c465340IMq.LIZ = c0itm.LJ;
        c465340IMq.LIZIZ = "live_merge";
        c465340IMq.LIZJ = "live_cover";
        c465340IMq.LIZLLL = c0itm.LIZLLL;
        c465340IMq.LJ = "/webcast/feed/";
        c465340IMq.LJFF = c0itm.LJFF;
        C465350IMr c465350IMrLIZ = c465340IMq.LIZ();
        C1494570ozn c1494570ozn = c0itm.LIZJ;
        C465330IMp.LIZ(afS3S0100100_7.j1, jCurrentTimeMillis, jUptimeMillis, c465350IMrLIZ, c0itm.LIZIZ, c1494570ozn);
        ((InterfaceC466760ISc) afS3S0100100_7.l0).LIZIZ((C0ITP) c0itm.LIZ);
        C1C7U.LIZIZ("FeedApiManager@9905.fetchData$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS3S0100100_7 afS3S0100100_7, Object obj) {
        C1C7U.LIZ("FeedApiManager@9905.realFetchFeedData$3");
        C0ITM c0itm = (C0ITM) obj;
        C0ITP c0itp = (C0ITP) c0itm.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C465340IMq c465340IMq = new C465340IMq();
        c465340IMq.LIZ = c0itm.LJ;
        c465340IMq.LIZIZ = "referral_task";
        c465340IMq.LIZJ = "H5";
        c465340IMq.LIZLLL = c0itm.LIZLLL;
        c465340IMq.LJ = "/webcast/feed/";
        c465340IMq.LJFF = c0itm.LJFF;
        C465350IMr c465350IMrLIZ = c465340IMq.LIZ();
        C1494570ozn c1494570ozn = c0itm.LIZJ;
        C465330IMp.LIZ(afS3S0100100_7.j1, jCurrentTimeMillis, jUptimeMillis, c465350IMrLIZ, c0itm.LIZIZ, c1494570ozn);
        ((InterfaceC466760ISc) afS3S0100100_7.l0).LIZIZ(c0itp);
        C1C7U.LIZIZ("FeedApiManager@9905.realFetchFeedData$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS3S0100100_7(long r2, X.C477930Ioh r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 10 - r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS3S0100100_7.<init>(long, X.0Ioh, int):void");
    }

    public AfS3S0100100_7(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
