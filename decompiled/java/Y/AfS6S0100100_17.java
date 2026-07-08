package Y;

import X.AbstractC1110790f0n;
import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C083100Sv;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C1095610ecJ;
import X.C1101750emD;
import X.C1109010exv;
import X.C1109020exw;
import X.C1113480f58;
import X.C1116230f9Z;
import X.C1116240f9a;
import X.C1116380f9o;
import X.C1121290fHj;
import X.C1123090fKd;
import X.C1123100fKe;
import X.C1123110fKf;
import X.C1127050fR1;
import X.C1127380fRY;
import X.C1128710fTh;
import X.C1128860fTw;
import X.C1129650fVD;
import X.C1131200fXi;
import X.C1133120fao;
import X.C1133160fas;
import X.C1133640fbe;
import X.C1161920gLG;
import X.C1494690ozz;
import X.C16F5;
import X.C189200o6;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C512240K7a;
import X.C518180KTw;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1120860fH2;
import X.EnumC1129500fUy;
import X.InterfaceC20236714Gf;
import android.os.SystemClock;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.GetRoomGoodyBagResponseData;
import com.bytedance.android.livesdk.dataChannel.PortalListResponseData;
import com.bytedance.android.livesdk.dataChannel.RedEnvelopeListResponseData;
import com.bytedance.android.livesdk.dataChannel.RevenuePermissionResponseData;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialogV1;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.FansGetTaskInfoResponse;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.star_comment.StarCommentGetQueueResponse;
import tikcast.api.star_comment.StarCommentItem;
import tikcast.api.star_comment.StarCommentQueue;
import webcast.api.bag.BagItemListResponse;
import webcast.api.envelope.RevenuePermissionResponse;
import webcast.api.room.RoomMultiShortTouchV2Response;
import webcast.data.BagItem;
import webcast.data.FansClubBanner;

/* JADX INFO: loaded from: classes18.dex */
public class AfS6S0100100_17 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
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
            case 21:
                accept$21(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS6S0100100_17 r8, java.lang.Object r9) throws org.json.JSONException {
        /*
            java.lang.String r7 = "MatchItemViewModel@5b2b.sendCardFromUserGuide$dispose$2"
            X.C1C7U.LIZ(r7)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            long r2 = android.os.SystemClock.elapsedRealtime()
            r5 = 2131841046(0x7f115016, float:1.9315389E38)
            if (r9 == 0) goto L71
            boolean r0 = r9 instanceof X.C501470JlZ
            if (r0 == 0) goto L6d
            r4 = r9
            X.0JlZ r4 = (X.C501470JlZ) r4
            java.lang.String r0 = r4.getPrompt()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6d
            int r1 = r4.getErrorCode()
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r0) goto L6d
            java.lang.String r0 = r4.getPrompt()
            X.C766270U4b.LJIIJJI(r0)
        L30:
            X.0ftJ r4 = new X.0ftJ
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r4.<init>(r0, r6)
            java.lang.Object r0 = r8.l0
            webcast.data.BagItem r0 = (webcast.data.BagItem) r0
            long r0 = r0.minExpireAt
            java.lang.String r5 = "match_item_expiretime"
            r6.put(r5, r0)
            long r0 = r8.j1
            long r2 = r2 - r0
            java.lang.String r0 = "cost"
            r6.put(r0, r2)
            X.0ftN r1 = X.C1144630ftN.LIZ
            java.lang.Object r0 = r8.l0
            webcast.data.BagItem r0 = (webcast.data.BagItem) r0
            int r0 = r0.itemType
            X.C1144630ftN.LJIJ(r4, r0)
            r1.LJIIZILJ(r9, r6)
            X.0a1e r2 = X.EnumC919120a1e.AUDIENCE_SENDER
            java.lang.String r1 = "banner_guide"
            java.lang.String r0 = "match_item_send_failed"
            X.C1144630ftN.LJJIFFI(r0, r4, r2, r1)
        L69:
            X.C1C7U.LIZIZ(r7)
            return
        L6d:
            X.C766270U4b.LIZLLL(r5)
            goto L30
        L71:
            X.C766270U4b.LIZLLL(r5)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S0100100_17.accept$0(Y.AfS6S0100100_17, java.lang.Object):void");
    }

    public static final void accept$1(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        Object obj2;
        String str;
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.launchAnchorListApi$2$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - afS6S0100100_17.j1;
        if (baseResponse != null) {
            obj2 = baseResponse.data;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            String str2 = baseResponse.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            C1133640fbe.LJFF(0, Long.valueOf(jUptimeMillis), "", str2);
            C1133640fbe.LJIIL(6, null, Long.valueOf(jUptimeMillis), null, 10);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS6S0100100_17.l0;
            Object obj3 = baseResponse.data;
            C189200o6.m2constructorimpl(obj3);
            interfaceC20236714Gf.resumeWith(obj3);
        } else {
            if (baseResponse == null || (str = baseResponse.LIZIZ) == null) {
                str = "";
            }
            C1133640fbe.LJFF(-1, Long.valueOf(jUptimeMillis), "", str);
            C1133640fbe.LJIIL(7, null, Long.valueOf(jUptimeMillis), -1, 2);
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) afS6S0100100_17.l0;
            C098200Yq c098200Yq = new C098200Yq(new Exception("resp is null or resp.data is null"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.launchAnchorListApi$2$1");
    }

    public static final void accept$10(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("FansClubPreloadTaskPagePresenter@d943.obtainJoinFansTaskInfo$dispose$1");
        long jCurrentTimeMillis = System.currentTimeMillis() - afS6S0100100_17.j1;
        C1095610ecJ c1095610ecJ = (C1095610ecJ) afS6S0100100_17.l0;
        if (obj == null) {
            obj = "";
        }
        c1095610ecJ.LIZIZ = new Pair<>(1, obj);
        C518180KTw.LJIIIIZZ(200, 0, "/webcast/privilege/fans_get_task_info/mock", jCurrentTimeMillis);
        ((C1095610ecJ) afS6S0100100_17.l0).LJ();
        C1C7U.LIZIZ("FansClubPreloadTaskPagePresenter@d943.obtainJoinFansTaskInfo$dispose$1");
    }

    public static final void accept$11(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("FansClubPreloadTaskPagePresenter@d943.obtainJoinFansTaskInfo$dispose$2");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS6S0100100_17.j1;
        ((C1095610ecJ) afS6S0100100_17.l0).LIZIZ = new Pair<>(2, "");
        if (th instanceof C1494690ozz) {
            C518180KTw.LJIIIZ("/webcast/privilege/fans_get_task_info/mock", (C1494690ozz) th, jCurrentTimeMillis);
        }
        C1C7U.LIZIZ("FansClubPreloadTaskPagePresenter@d943.obtainJoinFansTaskInfo$dispose$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        BagItemListResponse.Data data;
        List<BagItem> list;
        C1C7U.LIZ("GiftGuideWidgetViewModel@3b0.handleLiveFestEoyVoteGuide$subscription$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (BagItemListResponse.Data) baseResponse.data) != null && (list = data.items) != null) {
            long j = afS6S0100100_17.j1;
            Iterator<BagItem> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BagItem next = it2.next();
                BagItem bagItem = next;
                if (bagItem.itemId == j && bagItem.available) {
                    if (next != null) {
                        C784440Upu.LIZ().LIZIZ(new C1121290fHj(EnumC1120860fH2.GIFT_CAMPAIGN_25_FEST_TICKET_RECV, (GiftGuideMessage) afS6S0100100_17.l0, null));
                    }
                }
            }
        }
        C1C7U.LIZIZ("GiftGuideWidgetViewModel@3b0.handleLiveFestEoyVoteGuide$subscription$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$13(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        int i;
        long j;
        FansGetTaskInfoResponse.Data data;
        FansClubBanner fansClubBanner;
        FansGetTaskInfoResponse.Data data2;
        FansGetTaskInfoResponse.Data data3;
        C1C7U.LIZ("FansClubJoinDialogV1@a08b.initFansEntrance$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS6S0100100_17.j1;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = 0;
        }
        C518180KTw.LJIIIIZZ(200, i, "/webcast/privilege/fans_get_task_info/", jCurrentTimeMillis);
        FansClubJoinDialogV1 fansClubJoinDialogV1 = (FansClubJoinDialogV1) afS6S0100100_17.l0;
        if (baseResponse != null && (data3 = (FansGetTaskInfoResponse.Data) baseResponse.data) != null) {
            j = data3.anchorFansCount;
        } else {
            j = -1;
        }
        fansClubJoinDialogV1.LLJJJIL = j;
        if (j >= 0) {
            LinearLayout linearLayout = fansClubJoinDialogV1.LLIZLLLIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            String strValueOf = String.valueOf(((FansClubJoinDialogV1) afS6S0100100_17.l0).LLJJJIL);
            try {
                FansClubJoinDialogV1 fansClubJoinDialogV12 = (FansClubJoinDialogV1) afS6S0100100_17.l0;
                strValueOf = fansClubJoinDialogV12.NR(fansClubJoinDialogV12.LLJJJIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            FansClubJoinDialogV1 fansClubJoinDialogV13 = (FansClubJoinDialogV1) afS6S0100100_17.l0;
            C16F5 c16f5 = fansClubJoinDialogV13.LLJ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIIL(2131755523, (int) fansClubJoinDialogV13.LLJJJIL, strValueOf));
            }
        }
        FansClubJoinDialogV1 fansClubJoinDialogV14 = (FansClubJoinDialogV1) afS6S0100100_17.l0;
        FansClubBanner fansClubBanner2 = null;
        if (fansClubJoinDialogV14.LLJJJ == null) {
            if (baseResponse != null && (data2 = (FansGetTaskInfoResponse.Data) baseResponse.data) != null) {
                fansClubBanner = data2.fansClubBanner;
            } else {
                fansClubBanner = null;
            }
            fansClubJoinDialogV14.PR(fansClubBanner, true);
        }
        FansClubJoinDialogV1 fansClubJoinDialogV15 = (FansClubJoinDialogV1) afS6S0100100_17.l0;
        if (baseResponse != null && (data = (FansGetTaskInfoResponse.Data) baseResponse.data) != null) {
            fansClubBanner2 = data.fansClubBanner;
        }
        fansClubJoinDialogV15.LLJJJ = fansClubBanner2;
        C1C7U.LIZIZ("FansClubJoinDialogV1@a08b.initFansEntrance$dispose$1");
    }

    public static final void accept$14(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        Boolean boolValueOf;
        C1C7U.LIZ("GiftPanelLeafV2@f893.initData$17");
        C1127380fRY c1127380fRY = (C1127380fRY) obj;
        if (c1127380fRY != null) {
            long j = afS6S0100100_17.j1;
            C1128710fTh c1128710fTh = (C1128710fTh) afS6S0100100_17.l0;
            if (c1127380fRY.LIZ == j) {
                RiskCtl riskCtl = c1128710fTh.LLLLZLL;
                c1128710fTh.LLLLZLL = c1127380fRY.LIZIZ;
                GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = c1128710fTh.LJJLIIIIJ();
                if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
                    Boolean boolValueOf2 = null;
                    if (riskCtl != null) {
                        boolValueOf = Boolean.valueOf(riskCtl.disableSendGift);
                    } else {
                        boolValueOf = null;
                    }
                    RiskCtl riskCtl2 = c1128710fTh.LLLLZLL;
                    if (riskCtl2 != null) {
                        boolValueOf2 = Boolean.valueOf(riskCtl2.disableSendGift);
                    }
                    if (!Intrinsics.LJFF(boolValueOf, boolValueOf2)) {
                        int i = -1;
                        int i2 = 0;
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
                            int i3 = i2 + 1;
                            if (abstractC1126600fQI != null && abstractC1126600fQI.LJI() == c1128710fTh.LJJLJ()) {
                                i = i2;
                            }
                            i2 = i3;
                        }
                        if (i > -1) {
                            C1127050fR1 c1127050fR1 = c1128710fTh.LLJJIJI;
                            if (c1127050fR1 != null) {
                                c1127050fR1.LLLJIL(c1128710fTh.LLJJIII, i);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("notifyItemChanged pos = ");
                            sbLIZ.append(i);
                            sbLIZ.append(" when risk ctl update");
                            C20441214yg.LIZIZ("GiftPanelLeaf", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.initData$17");
    }

    public static final void accept$15(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("GiftRepository@13a6.syncGiftListV1$5");
        ((C1129650fVD) afS6S0100100_17.l0).LIZIZ(afS6S0100100_17.j1, null, null, "GiftListSync", "onSubscribe gift/list");
        C1C7U.LIZIZ("GiftRepository@13a6.syncGiftListV1$5");
    }

    public static final void accept$16(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("GiftWidgetPreloadManager@e1a5.schedulePrediction$runnable$1$1");
        Long l = (Long) obj;
        C1131200fXi c1131200fXi = (C1131200fXi) afS6S0100100_17.l0;
        c1131200fXi.LJIIJJI = true;
        if (!c1131200fXi.LJIIL) {
            ((C1131200fXi) afS6S0100100_17.l0).LJIIIZ = l;
            long j = 0;
            if (l.longValue() > 0) {
                long jLongValue = ((l.longValue() * 1000) - afS6S0100100_17.j1) / 2;
                if (jLongValue >= 0) {
                    j = jLongValue;
                }
                C1131200fXi c1131200fXi2 = (C1131200fXi) afS6S0100100_17.l0;
                ARunnableS117S0100000_17 aRunnableS117S0100000_17 = c1131200fXi2.LJI;
                if (aRunnableS117S0100000_17 != null) {
                    c1131200fXi2.LJ.removeCallbacks(aRunnableS117S0100000_17);
                }
                C1131200fXi c1131200fXi3 = (C1131200fXi) afS6S0100100_17.l0;
                ARunnableS117S0100000_17 aRunnableS117S0100000_172 = new ARunnableS117S0100000_17(c1131200fXi3, 235);
                c1131200fXi3.LJI = aRunnableS117S0100000_172;
                C786410Ut5.LJLIIL(j, c1131200fXi3.LJ, aRunnableS117S0100000_172);
            }
        }
        C1C7U.LIZIZ("GiftWidgetPreloadManager@e1a5.schedulePrediction$runnable$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        Boolean boolValueOf;
        StarCommentQueue starCommentQueue;
        List<StarCommentItem> list;
        DataChannel dataChannel;
        long j;
        C1C7U.LIZ("StarCommentCenter@1cc2.query$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C1116230f9Z c1116230f9Z = (C1116230f9Z) afS6S0100100_17.l0;
        long j2 = afS6S0100100_17.j1;
        c1116230f9Z.getClass();
        StarCommentGetQueueResponse.Data data = (StarCommentGetQueueResponse.Data) baseResponse.data;
        if (data != null) {
            StarCommentViewModel starCommentViewModel = c1116230f9Z.LLILLL;
            if (starCommentViewModel != null) {
                starCommentViewModel.LLJIJIL = data.serverCurMsgStartTimeMs;
            }
            long j3 = data.pollingIntervalMs;
            if (j3 >= 1000) {
                C1116380f9o.LIZ = j3;
            }
            long j4 = data.normalIntervalBetweenMsgMs;
            if (j4 >= 1000) {
                C1116380f9o.LIZJ = j4;
            }
            long j5 = data.laggingIntervalBetweenMsgMs;
            if (j5 >= 1000) {
                long j6 = data.advancedIntervalBetweenMsgMs;
                if (j6 > 1000) {
                    if (j5 < j6) {
                        j = j6;
                    } else {
                        j = j5;
                    }
                    C1116380f9o.LIZIZ = j;
                    if (j5 > j6) {
                        j5 = j6;
                    }
                    C1116380f9o.LIZLLL = j5;
                }
            }
            StarCommentQueue starCommentQueue2 = data.queue;
            if (starCommentQueue2 != null) {
                int i = starCommentQueue2.queueVersion;
                if (i > c1116230f9Z.LLIZ && (dataChannel = c1116230f9Z.LLILLJJLI) != null) {
                    int size = starCommentQueue2.starCommentList.size();
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
                    String str = baseResponse.LIZIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_get_queue_request");
                    C1116240f9a.LIZIZ(c474500IjALIZ, dataChannel);
                    c474500IjALIZ.LJJII(Integer.valueOf(size), "query_size");
                    c474500IjALIZ.LJJII(Integer.valueOf(i), "query_version");
                    c474500IjALIZ.LJJII(1, "is_successful");
                    c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "duration");
                    c474500IjALIZ.LJJII(str, "log_id");
                    c474500IjALIZ.LIZ();
                }
                c1116230f9Z.LJ(starCommentQueue2, false);
            }
        }
        StarCommentGetQueueResponse.Data data2 = (StarCommentGetQueueResponse.Data) baseResponse.data;
        if (data2 != null && (starCommentQueue = data2.queue) != null && (list = starCommentQueue.starCommentList) != null) {
            boolValueOf = Boolean.valueOf(list.isEmpty());
        } else {
            boolValueOf = null;
        }
        if (c1116230f9Z.LLJILJILJ && c1116230f9Z.LLJJIII == 3 && (boolValueOf == null || Intrinsics.LJFF(boolValueOf, Boolean.TRUE))) {
            c1116230f9Z.LJIIJJI(0);
        }
        c1116230f9Z.LLJILJILJ = false;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j2;
        long j7 = 0;
        if (jElapsedRealtime2 < 0) {
            jElapsedRealtime2 = 0;
        }
        long j8 = C1116380f9o.LIZ - jElapsedRealtime2;
        if (j8 >= 0) {
            j7 = j8;
        }
        BPEAHandler bPEAHandler = c1116230f9Z.LLJJI;
        C786410Ut5.LJLJLJ(bPEAHandler, bPEAHandler.obtainMessage(1), j7);
        C1116240f9a.LIZIZ++;
        C1116240f9a.LIZLLL += SystemClock.elapsedRealtime() - C1116240f9a.LJ;
        C1C7U.LIZIZ("StarCommentCenter@1cc2.query$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$18(Y.AfS6S0100100_17 r11, java.lang.Object r12) {
        /*
            java.lang.String r10 = "StarCommentCenter@1cc2.query$2"
            X.C1C7U.LIZ(r10)
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r7 = r11.l0
            X.0f9Z r7 = (X.C1116230f9Z) r7
            long r2 = r11.j1
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.LLILLJJLI
            r4 = 0
            if (r1 == 0) goto L38
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r2
            java.lang.String r0 = "livesdk_star_comment_get_queue_request"
            X.0IjA r5 = X.C0IJT.LIZ(r0)
            X.C1116240f9a.LIZIZ(r5, r1)
            X.C1116240f9a.LIZJ(r5, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "is_successful"
            r5.LJJII(r1, r0)
            java.lang.String r1 = "duration"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r5.LJJII(r0, r1)
            r5.LIZ()
        L38:
            boolean r0 = r7.LLJILJILJ
            r8 = 1
            if (r0 == 0) goto L54
            int r0 = r7.LLJILLL
            int r1 = r0 + 1
            r7.LLJILLL = r1
            r0 = 5
            if (r1 < r0) goto L54
            r7.LLJILJILJ = r4
            int r1 = r7.LLJJIII
            r0 = 3
            if (r1 != r0) goto L50
            r7.LJIIJJI(r4)
        L50:
            X.C1C7U.LIZIZ(r10)
            return
        L54:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r2
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L61
            r5 = 0
        L61:
            long r1 = X.C1116380f9o.LIZ
            long r1 = r1 - r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L69
            r3 = r1
        L69:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r7.LLJJI
            android.os.Message r0 = r1.obtainMessage(r8)
            X.C786410Ut5.LJLJLJ(r1, r0, r3)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S0100100_17.accept$18(Y.AfS6S0100100_17, java.lang.Object):void");
    }

    public static final void accept$19(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("BaseSubviewViewHolder@84e1.actionButtonClick$4");
        User user = ((AbstractC1110790f0n) afS6S0100100_17.l0).getUser();
        if (user != null) {
            user.isFollowing = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindView: unFollow success, isFollowing = ");
        User user2 = ((AbstractC1110790f0n) afS6S0100100_17.l0).getUser();
        if (user2 != null) {
            boolValueOf = Boolean.valueOf(user2.isFollowing);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf));
        C20441214yg.LIZIZ("SubviewViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long j = afS6S0100100_17.j1;
        long j2 = ((AbstractC1110790f0n) afS6S0100100_17.l0).LIZ;
        C1113480f58 c1113480f58 = new C1113480f58();
        c1113480f58.LIZIZ = true;
        iPublicScreenService.ke0(j, j2, c1113480f58);
        C1C7U.LIZIZ("BaseSubviewViewHolder@84e1.actionButtonClick$4");
    }

    public static final void accept$2(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.launchAnchorListApi$2$2");
        Throwable th = (Throwable) obj;
        long jUptimeMillis = SystemClock.uptimeMillis() - afS6S0100100_17.j1;
        C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
        int i = c1133120faoLIZ.LIZ;
        C1133640fbe.LJFF(Integer.valueOf(i), Long.valueOf(jUptimeMillis), c1133120faoLIZ.LIZIZ, "");
        C1133640fbe.LJIIL(7, null, Long.valueOf(jUptimeMillis), Integer.valueOf(i), 2);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS6S0100100_17.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterViewModel@7747.launchAnchorListApi$2$2");
    }

    public static final void accept$20(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("BaseSubviewViewHolder@84e1.actionButtonClick$6");
        User user = ((AbstractC1110790f0n) afS6S0100100_17.l0).getUser();
        if (user != null) {
            user.isFollowing = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindView: unFollow success, isFollowing = ");
        User user2 = ((AbstractC1110790f0n) afS6S0100100_17.l0).getUser();
        if (user2 != null) {
            boolValueOf = Boolean.valueOf(user2.isFollowing);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf));
        C20441214yg.LIZIZ("SubviewViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        long j = afS6S0100100_17.j1;
        long j2 = ((AbstractC1110790f0n) afS6S0100100_17.l0).LIZ;
        C1113480f58 c1113480f58 = new C1113480f58();
        c1113480f58.LIZIZ = true;
        iPublicScreenService.ke0(j, j2, c1113480f58);
        C1C7U.LIZIZ("BaseSubviewViewHolder@84e1.actionButtonClick$6");
    }

    public static final void accept$21(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("PinMessageManager@ae43.pin$5");
        C1109010exv.LJFF.remove(afS6S0100100_17.j1);
        C1109010exv c1109010exv = C1109010exv.LIZ;
        C1109020exw c1109020exw = (C1109020exw) afS6S0100100_17.l0;
        c1109020exw.LIZLLL = false;
        c1109010exv.getClass();
        C1109010exv.LJIIL(c1109020exw);
        C1C7U.LIZIZ("PinMessageManager@ae43.pin$5");
    }

    public static final void accept$3(AfS6S0100100_17 afS6S0100100_17, Object obj) throws JSONException {
        C1C7U.LIZ("BagListViewModel@cb9.fetchMatchItems$2");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", jElapsedRealtime - afS6S0100100_17.j1);
        C1128860fTw.LIZ((Throwable) obj, jSONObject);
        C1128860fTw.LJIIIIZZ("match_item_list_failed", new JSONObject(), jSONObject, false, "");
        if (((BagListViewModel) afS6S0100100_17.l0).LLJ.getValue() == EnumC1129500fUy.LOADING) {
            ((BagListViewModel) afS6S0100100_17.l0).LLJ.setValue(EnumC1129500fUy.ERROR);
        }
        C1C7U.LIZIZ("BagListViewModel@cb9.fetchMatchItems$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void accept$4(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        Object obj2;
        long j;
        int i;
        GetNonFansUserDataResponse.Data data;
        GetNonFansUserDataResponse.Data data2;
        C1C7U.LIZ("JoinDialogViewModel@c4dc.getUserData$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        LiveData liveData = ((JoinDialogViewModel) afS6S0100100_17.l0).LLJ;
        FansClubBanner fansClubBanner = null;
        if (baseResponse != null) {
            obj2 = baseResponse.data;
        } else {
            obj2 = null;
        }
        liveData.setValue(obj2);
        MutableLiveData<Long> mutableLiveData = ((JoinDialogViewModel) afS6S0100100_17.l0).LLIZLLLIL;
        if (baseResponse != null && (data2 = (GetNonFansUserDataResponse.Data) baseResponse.data) != null) {
            j = data2.fansCount;
        } else {
            j = -1;
        }
        mutableLiveData.setValue(Long.valueOf(j));
        MutableLiveData<FansClubBanner> mutableLiveData2 = ((JoinDialogViewModel) afS6S0100100_17.l0).LLIZ;
        if (baseResponse != null && (data = (GetNonFansUserDataResponse.Data) baseResponse.data) != null) {
            fansClubBanner = data.fansClubBanner;
        }
        mutableLiveData2.setValue(fansClubBanner);
        long jCurrentTimeMillis = System.currentTimeMillis() - afS6S0100100_17.j1;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = 0;
        }
        C518180KTw.LJIIIIZZ(200, i, "/webcast/privilege/non_fans_get_user_data/", jCurrentTimeMillis);
        C1C7U.LIZIZ("JoinDialogViewModel@c4dc.getUserData$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$5(Y.AfS6S0100100_17 r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "FansClubViewModel@394b.requestFansConfig$dispose$1"
            X.C1C7U.LIZ(r5)
            X.0Icr r7 = (X.C470590Icr) r7
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.j1
            long r2 = r2 - r0
            r4 = 0
            if (r7 == 0) goto L6e
            int r1 = r7.statusCode
        L13:
            java.lang.String r0 = "/webcast/privilege/fans_config/"
            X.C518180KTw.LJIIIIZZ(r4, r1, r0, r2)
            if (r7 == 0) goto L66
            T r0 = r7.data
            tikcast.api.fans.FansConfigResponse$Data r0 = (tikcast.api.fans.FansConfigResponse.Data) r0
            if (r0 == 0) goto L66
            java.util.List<webcast.data.FansConfig> r0 = r0.fansConfig
            X.C1095130ebX.LIZJ(r0)
            T r0 = r7.data
            tikcast.api.fans.FansConfigResponse$Data r0 = (tikcast.api.fans.FansConfigResponse.Data) r0
            if (r0 == 0) goto L6c
            tikcast.api.fans.FansConfigResponse$Data$Extra r0 = r0.extra
            if (r0 == 0) goto L6c
            boolean r1 = r0.isReverseAb
            r0 = 1
            if (r1 != r0) goto L6c
        L34:
            X.0JT6<java.lang.Boolean> r1 = X.InterfaceC1093910eZZ.LLLLLLZZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LIZJ(r0)
            int r0 = r7.statusCode
            X.C518180KTw.LJIILIIL(r0, r4)
            kotlin.jvm.internal.AwS561S0100000_17 r2 = new kotlin.jvm.internal.AwS561S0100000_17
            r0 = 594(0x252, float:8.32E-43)
            r2.<init>(r7, r0)
            Y.ARunnableS116S0100000_16 r1 = new Y.ARunnableS116S0100000_16
            r0 = 15
            r1.<init>(r2, r0)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = X.C1095250ebj.LIZ
            X.C786410Ut5.LJJZZIII(r0, r1)
            java.lang.Object r1 = r6.l0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L66
            T r0 = r7.data
            tikcast.api.fans.FansConfigResponse$Data r0 = (tikcast.api.fans.FansConfigResponse.Data) r0
            if (r0 == 0) goto L6a
            java.util.List<webcast.data.FansConfig> r0 = r0.fansConfig
        L63:
            r1.invoke(r0)
        L66:
            X.C1C7U.LIZIZ(r5)
            return
        L6a:
            r0 = 0
            goto L63
        L6c:
            r0 = 0
            goto L34
        L6e:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS6S0100100_17.accept$5(Y.AfS6S0100100_17, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        String string2;
        Map<Long, Boolean> map;
        Set<Long> setKeySet;
        Map<Long, Boolean> map2;
        Set<Long> setKeySet2;
        C1C7U.LIZ("ShortTouchService@4a4a.requestShortTouch$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        DataChannel dataChannel = (DataChannel) afS6S0100100_17.l0;
        RoomMultiShortTouchV2Response roomMultiShortTouchV2Response = (RoomMultiShortTouchV2Response) t;
        boolean z4 = true;
        if (roomMultiShortTouchV2Response.goodyBagStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        dataChannel.zW(GetRoomGoodyBagResponseData.class, new Pair(Boolean.valueOf(z), roomMultiShortTouchV2Response.goodyBag));
        if (roomMultiShortTouchV2Response.portalListStatus == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        dataChannel.zW(PortalListResponseData.class, new Pair(Boolean.valueOf(z2), roomMultiShortTouchV2Response.portalList));
        if (roomMultiShortTouchV2Response.envelopeListStatus == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        dataChannel.zW(RedEnvelopeListResponseData.class, new Pair(Boolean.valueOf(z3), roomMultiShortTouchV2Response.envelopeList));
        if (roomMultiShortTouchV2Response.revenuePermissionStatus != 1) {
            z4 = false;
        }
        dataChannel.zW(RevenuePermissionResponseData.class, new Pair(Boolean.valueOf(z4), roomMultiShortTouchV2Response.revenuePermission));
        DataChannel dataChannel2 = (DataChannel) afS6S0100100_17.l0;
        Boolean bool = Boolean.TRUE;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() - afS6S0100100_17.j1);
        RevenuePermissionResponse.ResponseData responseData = ((RoomMultiShortTouchV2Response) baseResponse.data).revenuePermission;
        if (responseData != null && (map2 = responseData.envelopePermission) != null && (setKeySet2 = map2.keySet()) != null) {
            string = setKeySet2.toString();
        } else {
            string = null;
        }
        RevenuePermissionResponse.ResponseData responseData2 = ((RoomMultiShortTouchV2Response) baseResponse.data).revenuePermission;
        if (responseData2 != null && (map = responseData2.goodyBagPermission) != null && (setKeySet = map.keySet()) != null) {
            string2 = setKeySet.toString();
        } else {
            string2 = null;
        }
        C1101750emD.LIZLLL(dataChannel2, false, bool, lValueOf, null, string, string2);
        C1C7U.LIZIZ("ShortTouchService@4a4a.requestShortTouch$dispose$1");
    }

    public static final void accept$7(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("ShortTouchService@4a4a.requestShortTouch$dispose$2");
        DataChannel dataChannel = (DataChannel) afS6S0100100_17.l0;
        Boolean bool = Boolean.FALSE;
        dataChannel.zW(GetRoomGoodyBagResponseData.class, new Pair(bool, null));
        ((DataChannel) afS6S0100100_17.l0).zW(PortalListResponseData.class, new Pair(bool, null));
        ((DataChannel) afS6S0100100_17.l0).zW(RedEnvelopeListResponseData.class, new Pair(bool, null));
        ((DataChannel) afS6S0100100_17.l0).zW(RevenuePermissionResponseData.class, new Pair(bool, null));
        C1101750emD.LIZLLL((DataChannel) afS6S0100100_17.l0, false, bool, Long.valueOf(System.currentTimeMillis() - afS6S0100100_17.j1), Integer.valueOf(C512240K7a.LIZ((Throwable) obj)), null, null);
        C1C7U.LIZIZ("ShortTouchService@4a4a.requestShortTouch$dispose$2");
    }

    public static final void accept$8(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("LiveDummyFastPresenter@e1b8.registerRxBus$1");
        C1123110fKf c1123110fKf = (C1123110fKf) obj;
        C1123090fKd c1123090fKd = (C1123090fKd) afS6S0100100_17.l0;
        long j = afS6S0100100_17.j1;
        c1123090fKd.getClass();
        long j2 = c1123110fKf.LIZIZ;
        if ((j2 == 0 || j == j2) && (!C083100Sv.LIZ() || c1123090fKd.LIZIZ == null)) {
            c1123090fKd.LIZIZ(GiftManager.inst().findGiftById(c1123110fKf.LIZ), c1123110fKf.LIZJ, c1123110fKf.LIZLLL);
        }
        C1C7U.LIZIZ("LiveDummyFastPresenter@e1b8.registerRxBus$1");
    }

    public static final void accept$9(AfS6S0100100_17 afS6S0100100_17, Object obj) {
        C1C7U.LIZ("LiveNewFastPresenter@a60e.registerRxBus$1");
        C1123110fKf c1123110fKf = (C1123110fKf) obj;
        C1123100fKe c1123100fKe = (C1123100fKe) afS6S0100100_17.l0;
        long j = afS6S0100100_17.j1;
        c1123100fKe.getClass();
        long j2 = c1123110fKf.LIZIZ;
        if ((j2 == 0 || j == j2) && (!C083100Sv.LIZ() || c1123100fKe.LIZJ == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onGiftList, event = ");
            sbLIZ.append(c1123110fKf);
            C20441214yg.LIZIZ("LiveNewFastPresenter", C2188811AlT.LIZIZ(sbLIZ));
            c1123100fKe.LIZ(GiftManager.inst().findGiftById(c1123110fKf.LIZ), c1123110fKf.LIZJ, c1123110fKf.LIZLLL);
        }
        C1C7U.LIZIZ("LiveNewFastPresenter@a60e.registerRxBus$1");
    }

    public AfS6S0100100_17(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
