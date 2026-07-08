package Y;

import X.C09JN;
import X.C0IJT;
import X.C0UO0;
import X.C11JF;
import X.C11NZ;
import X.C12OY;
import X.C1809480xBi;
import X.C19748512Ol;
import X.C1AGX;
import X.C1AHJ;
import X.C1AHK;
import X.C1AHM;
import X.C1AHQ;
import X.C1AJJ;
import X.C1AJL;
import X.C1C7U;
import X.C20441214yg;
import X.C2176511AGb;
import X.C2176541AGe;
import X.C2176871AHl;
import X.C2177041AIc;
import X.C2177381AJk;
import X.C2188811AlT;
import X.C342601Uq;
import X.C474500IjA;
import X.C477520Io2;
import X.C497740JfY;
import X.C501470JlZ;
import X.C512300K7g;
import X.C766270U4b;
import X.EnumC2175041AAk;
import X.InterfaceC1487280oo2;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.LiveCenterForceRefreshEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.message.PlayTogetherMessage;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.api.boost.Card;
import webcast.api.game.GetPlayTogetherTempelateResponse;
import webcast.api.game.PlayTogetherTemplate;
import webcast.api.room.RefreshPaidStreamResp;

/* JADX INFO: loaded from: classes34.dex */
public class AfS166S0200000_33 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("ViewerWishesQueuePagePresenter@3d8.requestOrders$5");
        ((Function0) afS166S0200000_33.l0).invoke();
        ((C2176871AHl) afS166S0200000_33.l1).LJ = false;
        C1C7U.LIZIZ("ViewerWishesQueuePagePresenter@3d8.requestOrders$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        StreamUrl streamUrl;
        C1C7U.LIZ("LivePreviewPlayerWidget@e362.playLive$1$1");
        C20441214yg.LIZIZ("LivePaidEvent", "get refreshPaidStream success");
        LiveRoomStruct liveRoomStruct = (LiveRoomStruct) afS166S0200000_33.l0;
        RefreshPaidStreamResp.ResponseData responseData = (RefreshPaidStreamResp.ResponseData) ((BaseResponse) obj).data;
        if (responseData != null && (streamUrl = responseData.streamUrl) != null) {
            StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
            streamUrlStruct.sid = streamUrl.id;
            streamUrlStruct.rtmp_pull_url = streamUrl.rtmpPullUrl;
            streamUrlStruct.rtmp_push_url = streamUrl.LIZLLL();
            streamUrlStruct.provider = streamUrl.provider;
            streamUrlStruct.mFlvPullUrlMap = new HashMap<>(streamUrl.flvPullUrl);
            streamUrlStruct.mCandidateResolutionList = new ArrayList<>(streamUrl.candidateResolution);
            streamUrlStruct.mDefaultResolution = streamUrl.defaultResolution;
            streamUrlStruct.aliveTimestamp = streamUrl.aliveTimestamp;
            streamUrlStruct.drmType = streamUrl.drmType;
            streamUrlStruct.streamLanguage = streamUrl.streamLanguage;
            try {
                Gson gson = C19748512Ol.LIZIZ;
                streamUrlStruct.liveCoreSDKData = (LiveCoreSDKData) gson.LJII(gson.LJIILL(streamUrl.liveCoreSDKData), LiveCoreSDKData.class);
                liveRoomStruct.stream_url = streamUrlStruct;
                C20441214yg.LIZIZ("LivePaidEvent", "refresh paid room stream success");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LivePaidEvent", "convert date exception from json", e);
            }
        }
        LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) afS166S0200000_33.l1;
        EnumC2175041AAk enumC2175041AAk = EnumC2175041AAk.REFRESH_PULL_STREAM;
        int i = LivePreviewPlayerWidget.LLLF;
        livePreviewPlayerWidget.V1(enumC2175041AAk);
        C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.playLive$1$1");
    }

    public static final void accept$10(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C501470JlZ c501470JlZ;
        String prompt;
        C1AHM c1ahm;
        C1C7U.LIZ("LiveCenterPropsCard@c17f.showFlareConfirmDialog$dialogBuilder$2$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LIZIZ("LiveCenterProp", String.valueOf(Unit.LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C512300K7g.LIZIZ(th));
        sbLIZ.append(", ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("LiveCenterProp", C2188811AlT.LIZIZ(sbLIZ));
        if (th instanceof C477520Io2) {
            c501470JlZ = (C501470JlZ) th;
        } else {
            c501470JlZ = null;
        }
        String str = "";
        if (c501470JlZ == null || (prompt = c501470JlZ.getPrompt()) == null) {
            prompt = "";
        }
        C1AHQ c1ahq = C1AHM.Companion;
        int iLIZIZ = C512300K7g.LIZIZ(th);
        c1ahq.getClass();
        if (iLIZIZ != 4003087) {
            if (iLIZIZ != 4003148 && iLIZIZ != 4003165) {
                switch (iLIZIZ) {
                    case 4003078:
                        c1ahm = C1AHM.RISK;
                        break;
                    case 4003079:
                        c1ahm = C1AHM.REUSE;
                        break;
                    case 4003080:
                        c1ahm = C1AHM.TRAFFIC;
                        break;
                    case 4003081:
                        c1ahm = C1AHM.PRIVATE;
                        break;
                    default:
                        c1ahm = C1AHM.UNKNOWN;
                        break;
                }
            } else {
                c1ahm = C1AHM.PERMISSION;
            }
        } else {
            c1ahm = C1AHM.GATED;
        }
        String str2 = ((C1AHJ) afS166S0200000_33.l0).LLJI.get(c1ahm);
        if (str2 != null) {
            str = str2;
        }
        if (c1ahm == C1AHM.PERMISSION) {
            ((C1AHJ) afS166S0200000_33.l0).LL.getDataChannel();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_feature_locked_toast_show");
            c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.FLARE, "feature");
            c474500IjALIZ.LIZ();
            if (prompt.length() > 0) {
                C766270U4b.LJIIJJI(prompt);
            }
        } else {
            DataChannel dataChannel = ((C1AHJ) afS166S0200000_33.l0).LL.getDataChannel();
            Card card = ((C1AHK) afS166S0200000_33.l1).LJ;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_boost_card_fail_show");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            C12OY.LJIIIZ(c474500IjALIZ2, card);
            c474500IjALIZ2.LJJII(str, "fail_reason");
            c474500IjALIZ2.LIZ();
            C1AHJ c1ahj = (C1AHJ) afS166S0200000_33.l0;
            C1AHK c1ahk = (C1AHK) afS166S0200000_33.l1;
            C11JF c11jf = c1ahj.LLJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c1ahj.LLJ = (C11JF) C11NZ.LJJJJZ(c1ahk.LIZLLL()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0J1j
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    return C1143680frq.LIZ("tiktok_live_broadcast_demand_2", (String) obj2);
                }
            }).LJIILIIL(new C0UO0()).LJJLJLI(new AfS119S0300000_33(c1ahk, c1ahm, c1ahj, 5));
        }
        C1C7U.LIZIZ("LiveCenterPropsCard@c17f.showFlareConfirmDialog$dialogBuilder$2$2");
    }

    public static final void accept$2(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("RoomStickerView@ad27.delayReportDecorationUsed$1");
        C2177381AJk c2177381AJk = C1AJL.LIZLLL;
        DataChannel dataChannel = ((C1AJJ) afS166S0200000_33.l0).getDataChannel();
        RoomSticker roomSticker = (RoomSticker) afS166S0200000_33.l1;
        C1AJL.LJI(dataChannel, roomSticker, Boolean.valueOf(C342601Uq.LIZIZ(((C1AJJ) afS166S0200000_33.l0).getContent(), roomSticker)));
        C1C7U.LIZIZ("RoomStickerView@ad27.delayReportDecorationUsed$1");
    }

    public static final void accept$3(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$1");
        ((C2176541AGe) afS166S0200000_33.l0).LJIIIZ = true;
        DataChannel dataChannel = ((C2176511AGb) afS166S0200000_33.l1).LL;
        if (dataChannel != null) {
            dataChannel.FQ2(LiveCenterForceRefreshEvent.class);
        }
        ((C2176511AGb) afS166S0200000_33.l1).LLILZIL.setEnabled(false);
        ((C2176511AGb) afS166S0200000_33.l1).LLILZIL.setText(C497740JfY.LJIJI(2131842069));
        C1AGX.LIZ(((C2176511AGb) afS166S0200000_33.l1).LL, (C2176541AGe) afS166S0200000_33.l0, true, 1);
        C1C7U.LIZIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$1");
    }

    public static final void accept$4(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$2");
        C766270U4b.LIZLLL(2131842060);
        C1AGX.LIZ(((C2176511AGb) afS166S0200000_33.l0).LL, (C2176541AGe) afS166S0200000_33.l1, true, 0);
        C1C7U.LIZIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$2");
    }

    public static final void accept$5(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$3");
        ((C2176541AGe) afS166S0200000_33.l0).LJIIIZ = true;
        DataChannel dataChannel = ((C2176511AGb) afS166S0200000_33.l1).LL;
        if (dataChannel != null) {
            dataChannel.FQ2(LiveCenterForceRefreshEvent.class);
        }
        ((C2176511AGb) afS166S0200000_33.l1).LLILZIL.setEnabled(false);
        ((C2176511AGb) afS166S0200000_33.l1).LLILZIL.setText(C497740JfY.LJIJI(2131842069));
        C1AGX.LIZ(((C2176511AGb) afS166S0200000_33.l1).LL, (C2176541AGe) afS166S0200000_33.l0, true, 1);
        C1C7U.LIZIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$3");
    }

    public static final void accept$6(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$4");
        C766270U4b.LIZLLL(2131842060);
        C1AGX.LIZ(((C2176511AGb) afS166S0200000_33.l0).LL, (C2176541AGe) afS166S0200000_33.l1, true, 0);
        C1C7U.LIZIZ("ClaimRewardsViewHolder@a6e8.onBind$1$1$4");
    }

    public static final void accept$7(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        List<PlayTogetherTemplate> list;
        C1C7U.LIZ("GameLivePlayTogetherController@b91.onAnchorPlayTogetherStart$2");
        C2177041AIc c2177041AIc = (C2177041AIc) afS166S0200000_33.l0;
        GetPlayTogetherTempelateResponse.ResponseData responseData = ((GetPlayTogetherTempelateResponse) obj).data;
        if (responseData != null) {
            list = responseData.systemTemplates;
        } else {
            list = null;
        }
        c2177041AIc.LLILZLL = list;
        c2177041AIc.LJIILLIIL((PlayTogetherMessage) afS166S0200000_33.l1);
        C1C7U.LIZIZ("GameLivePlayTogetherController@b91.onAnchorPlayTogetherStart$2");
    }

    public static final void accept$8(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("LiveCenterPropsCard@c17f.<init>$3$1$2");
        ((C1AHJ) afS166S0200000_33.l0).S5((C1AHK) ((C1809480xBi) afS166S0200000_33.l1), (Drawable) obj);
        C1C7U.LIZIZ("LiveCenterPropsCard@c17f.<init>$3$1$2");
    }

    public static final void accept$9(AfS166S0200000_33 afS166S0200000_33, Object obj) {
        C1C7U.LIZ("LiveCenterPropsCard@c17f.<init>$3$3$2");
        ((C1AHJ) afS166S0200000_33.l0).S5((C1AHK) ((C1809480xBi) afS166S0200000_33.l1), (Drawable) obj);
        C1C7U.LIZIZ("LiveCenterPropsCard@c17f.<init>$3$3$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS166S0200000_33(X.C2176541AGe r2, X.C2176511AGb r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 3: goto Le;
                case 4: goto L5;
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS166S0200000_33.<init>(X.1AGe, X.1AGb, int):void");
    }

    public AfS166S0200000_33(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
