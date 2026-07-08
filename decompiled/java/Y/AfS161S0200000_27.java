package Y;

import X.C09JN;
import X.C09W6;
import X.C0K04;
import X.C0KQH;
import X.C1119430fEj;
import X.C1133130fap;
import X.C1146840fww;
import X.C118300cf;
import X.C1494460ozc;
import X.C1494690ozz;
import X.C1792840wks;
import X.C1793890wmZ;
import X.C1794210wn5;
import X.C1797100wrk;
import X.C1807350x8H;
import X.C1811840xFW;
import X.C1812020xFo;
import X.C1840110xz7;
import X.C1842150y2P;
import X.C1842390y2n;
import X.C1846820y9w;
import X.C1909107dp;
import X.C19719512Dh;
import X.C19EG;
import X.C1C7U;
import X.C1CC2;
import X.C20684815ws;
import X.C2177041AIc;
import X.C2188811AlT;
import X.C257100z3;
import X.C477520Io2;
import X.C501470JlZ;
import X.C517450KRb;
import X.C5183020f;
import X.C784440Upu;
import X.C786410Ut5;
import X.C829590WgX;
import X.DialogInterfaceOnDismissListenerC1864750ycr;
import X.EnumC1805570x5P;
import X.EnumC1811400xEo;
import X.InterfaceC1106030et7;
import X.InterfaceC1793900wma;
import X.InterfaceC1796910wrR;
import X.InterfaceC1842140y2O;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo;
import com.bytedance.android.livesdk.game.playtogether.fragment.GameLivePlayTogetherPickedFragment;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.BaseErrorData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder.IapV1PayResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.toplives.watchlater.StreamCardCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.game.GetPlayTogetherPickInfoResponse;
import webcast.api.profit.FirstChargeV2Result;

/* JADX INFO: loaded from: classes28.dex */
public class AfS161S0200000_27 implements C09JN {
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
        }
    }

    public static final void accept$0(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            Function1 function1 = (Function1) afS161S0200000_27.l0;
            Function1 function12 = (Function1) afS161S0200000_27.l1;
            if (baseResponse.status_code == 0) {
                if (function1 != null) {
                    String str = baseResponse.status_msg;
                    if (str == null) {
                        str = "Success";
                    }
                    function1.invoke(str);
                }
            } else if (function12 != null) {
                String strLIZIZ = baseResponse.status_msg;
                if (strLIZIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed with status code ");
                    sbLIZ.append(baseResponse.status_code);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                function12.invoke(strLIZIZ);
            }
        }
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$3");
    }

    public static final void accept$1(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("RechargeViewModel@9624.loadEventListener$1");
        C1146840fww c1146840fww = (C1146840fww) obj;
        if (Intrinsics.LJFF(c1146840fww.LIZ, "NormalRechargePanel")) {
            ((RechargeViewModel) afS161S0200000_27.l0).qR2((Context) afS161S0200000_27.l1, C19719512Dh.LIZJ(c1146840fww.LIZIZ), ((RechargeViewModel) afS161S0200000_27.l0).og1(false), null);
        }
        C1C7U.LIZIZ("RechargeViewModel@9624.loadEventListener$1");
    }

    public static final void accept$10(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("AutoDubbingAuthorizationHelper@bdf4.tryShowPanel$2");
        AutoDubbingStatusResponse autoDubbingStatusResponse = (AutoDubbingStatusResponse) obj;
        C1840110xz7.LIZLLL = autoDubbingStatusResponse;
        if (autoDubbingStatusResponse != null && autoDubbingStatusResponse.enableDubbingForPost && !C1840110xz7.LIZJ.get()) {
            C1840110xz7.LIZLLL((C19EG) afS161S0200000_27.l0, (Aweme) afS161S0200000_27.l1);
        }
        C1C7U.LIZIZ("AutoDubbingAuthorizationHelper@bdf4.tryShowPanel$2");
    }

    public static final void accept$11(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("PayManager@437b.createOrderV3$observable$3");
        Throwable th = (Throwable) obj;
        int iIntValue = ((Number) C517450KRb.LIZ(-1, th).getFirst()).intValue();
        C1797100wrk c1797100wrk = C1797100wrk.LIZIZ;
        InterfaceC1796910wrR interfaceC1796910wrR = (InterfaceC1796910wrR) afS161S0200000_27.l0;
        String str = ((Diamond) afS161S0200000_27.l1).iapId;
        c1797100wrk.getClass();
        if (th instanceof Exception) {
            C1797100wrk.LJIIIIZZ(c1797100wrk, interfaceC1796910wrR, 2, 33, iIntValue, "1-20-51-01", "create wallet order external api error", "wallet_create_order_external", (Exception) th, str, null, 1536);
        }
        C1C7U.LIZIZ("PayManager@437b.createOrderV3$observable$3");
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
    public static final void accept$12(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        boolean z;
        C1C7U.LIZ("CreatePayOrderTask@484a.run$1");
        com.bytedance.globalpayment.iap.common.ability.model.api.entity.BaseResponse baseResponse = (com.bytedance.globalpayment.iap.common.ability.model.api.entity.BaseResponse) obj;
        int i = baseResponse.statusCode;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C1794210wn5) afS161S0200000_27.l0).LJ(true, null);
            InterfaceC1793900wma<IapV1PayResponse> interfaceC1793900wma = ((C1793890wmZ) afS161S0200000_27.l1).LIZ;
            if (interfaceC1793900wma != null) {
                interfaceC1793900wma.onSuccess(baseResponse.data);
            }
        } else {
            String str = ((BaseErrorData) baseResponse.data).message;
            if (str == null) {
                str = "create order service response failed, message is null";
            }
            C1793890wmZ c1793890wmZ = (C1793890wmZ) afS161S0200000_27.l1;
            C1794210wn5 c1794210wn5 = (C1794210wn5) afS161S0200000_27.l0;
            C1792840wks c1792840wks = new C1792840wks(202, i, str);
            c1793890wmZ.getClass();
            c1794210wn5.LJ(false, null);
            InterfaceC1793900wma<IapV1PayResponse> interfaceC1793900wma2 = c1793890wmZ.LIZ;
            if (interfaceC1793900wma2 != null) {
                interfaceC1793900wma2.LIZ(c1792840wks);
            }
        }
        C1C7U.LIZIZ("CreatePayOrderTask@484a.run$1");
    }

    public static final void accept$13(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        int responseCode;
        C1C7U.LIZ("CreatePayOrderTask@484a.run$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C829590WgX) {
            responseCode = ((C829590WgX) th).getResponseCode();
        } else {
            responseCode = -100;
        }
        C1793890wmZ c1793890wmZ = (C1793890wmZ) afS161S0200000_27.l0;
        C1794210wn5 c1794210wn5 = (C1794210wn5) afS161S0200000_27.l1;
        C1792840wks c1792840wks = new C1792840wks(202, responseCode, th.getMessage());
        c1793890wmZ.getClass();
        c1794210wn5.LJ(false, null);
        InterfaceC1793900wma<IapV1PayResponse> interfaceC1793900wma = c1793890wmZ.LIZ;
        if (interfaceC1793900wma != null) {
            interfaceC1793900wma.LIZ(c1792840wks);
        }
        C1C7U.LIZIZ("CreatePayOrderTask@484a.run$2");
    }

    public static final void accept$14(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("LiveRepostServiceImpl@9d34.createRepost$2");
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) afS161S0200000_27.l0);
        linkedHashMap.put("fail_reason", "android_error");
        C20684815ws.LJIILLIIL("livesdk_repost_failure", linkedHashMap);
        C1842150y2P.LIZ.getClass();
        C1842150y2P.LJIIL(0, true, false);
        InterfaceC1842140y2O interfaceC1842140y2O = (InterfaceC1842140y2O) afS161S0200000_27.l1;
        if (interfaceC1842140y2O != null) {
            interfaceC1842140y2O.onFailure();
        }
        C1C7U.LIZIZ("LiveRepostServiceImpl@9d34.createRepost$2");
    }

    public static final void accept$15(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("TeamRankStickerView@c2c8.insert$1$1");
        if (((C1133130fap) obj).LIZ) {
            ((C1846820y9w) afS161S0200000_27.l0).LLJIJIL.LIZIZ((C1119430fEj) afS161S0200000_27.l1);
            ((C1846820y9w) afS161S0200000_27.l0).LLJILJIL.LIZJ();
            ((C1846820y9w) afS161S0200000_27.l0).LLJILJILJ.LIZIZ((C1119430fEj) afS161S0200000_27.l1);
            ((C1846820y9w) afS161S0200000_27.l0).LLJILLL.LJ();
        }
        C1C7U.LIZIZ("TeamRankStickerView@c2c8.insert$1$1");
    }

    public static final void accept$16(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("StreamCardCell@bb36.follow$1");
        int i = ((FollowPair) obj).followStatus;
        if (i == 1 || i == 2) {
            FollowInfo followInfo = ((User) afS161S0200000_27.l0).getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(r6.followStatus);
            }
            ((StreamCardCell) afS161S0200000_27.l1).N5().setText(((StreamCardCell) afS161S0200000_27.l1).itemView.getContext().getString(2131856890));
            ((StreamCardCell) afS161S0200000_27.l1).N5().setButtonVariant(1);
            C786410Ut5.U8(((StreamCardCell) afS161S0200000_27.l1).N5(), new ACListenerS161S0100000_27((StreamCardCell) afS161S0200000_27.l1, 212));
        }
        C1C7U.LIZIZ("StreamCardCell@bb36.follow$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS161S0200000_27 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS161S0200000_27.accept$2(Y.AfS161S0200000_27, java.lang.Object):void");
    }

    public static final void accept$3(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1494460ozc c1494460ozc;
        String logId;
        C501470JlZ c501470JlZ;
        C477520Io2 c477520Io2;
        C1C7U.LIZ("RankEntranceManager@d691.queryRankEntranceData$rankDisposable$2");
        Throwable th = (Throwable) obj;
        C1842390y2n c1842390y2n = ((RankEntranceManager) afS161S0200000_27.l0).LLIZ;
        ((ArrayList) c1842390y2n.LJ).clear();
        ((ArrayList) c1842390y2n.LJFF).clear();
        ((ArrayList) c1842390y2n.LJI).clear();
        ((RankEntranceManager) afS161S0200000_27.l0).LIZJ();
        if (((C118300cf) afS161S0200000_27.l1).element == 1) {
            DataChannel dataChannel = ((RankEntranceManager) afS161S0200000_27.l0).LLILLJJLI;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            String str = "";
            C0K04.LJFF("current_entrance_rank_type", "", jSONObject);
            C0K04.LIZLLL(EnumC1811400xEo.DEFAULT.getType(), "group_type", jSONObject);
            C1811840xFW.LIZ(dataChannel, jSONObject3, null);
            if (C1811840xFW.LIZLLL == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1811840xFW.LIZLLL = jCurrentTimeMillis;
                C0K04.LJ("event_duration", jCurrentTimeMillis - C1811840xFW.LIZJ, jSONObject2);
                C0K04.LJ("event_duration", C1811840xFW.LIZLLL - C1811840xFW.LIZJ, jSONObject3);
                C0K04.LJFF("data_source", "entrance", jSONObject3);
                C1811840xFW.LJ(th, jSONObject3);
                if (!(th instanceof C477520Io2) ? !(!(th instanceof C501470JlZ) ? !(th instanceof C1494690ozz) || (c1494460ozc = (C1494460ozc) th) == null || (logId = c1494460ozc.traceCode) == null : (c501470JlZ = (C501470JlZ) th) == null || (logId = c501470JlZ.getLogId()) == null) : !((c477520Io2 = (C477520Io2) th) == null || (logId = c477520Io2.getxTtLogId()) == null)) {
                    str = logId;
                }
                if (!TextUtils.isEmpty(str)) {
                    C0K04.LJFF("xLogId", str, jSONObject3);
                }
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ(C0KQH.LIZIZ("ttlive_ranklist_entrance_show"), jSONObject, jSONObject2, jSONObject4);
            } else {
                C1811840xFW.LIZIZ = "change_by_roomverify_message";
                C1811840xFW.LIZJ(jSONObject, jSONObject2, jSONObject3, false);
            }
        } else {
            C1811840xFW.LIZIZ(((RankEntranceManager) afS161S0200000_27.l0).LLILLJJLI, "failure", th);
        }
        ((RankEntranceManager) afS161S0200000_27.l0).getClass();
        C1C7U.LIZIZ("RankEntranceManager@d691.queryRankEntranceData$rankDisposable$2");
    }

    public static final void accept$4(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        C1C7U.LIZ("FirstRechargeParamSyncManager@32cd.performSync$1");
        FirstChargeV2Result firstChargeV2Result = (FirstChargeV2Result) obj;
        C1807350x8H c1807350x8H = (C1807350x8H) afS161S0200000_27.l0;
        Boolean bool = c1807350x8H.LIZ;
        Boolean bool2 = c1807350x8H.LIZIZ;
        FirstChargeV2Result.Data data = firstChargeV2Result.data;
        Boolean boolValueOf4 = null;
        if (data != null) {
            boolValueOf = Boolean.valueOf(data.isFirstRecharge);
        } else {
            boolValueOf = null;
        }
        FirstChargeV2Result.Data data2 = firstChargeV2Result.data;
        if (data2 != null) {
            boolValueOf2 = Boolean.valueOf(data2.isFirstCashRecharge);
        } else {
            boolValueOf2 = null;
        }
        C1807350x8H.LIZLLL(true, bool, bool2, boolValueOf, boolValueOf2, (EnumC1805570x5P) afS161S0200000_27.l1);
        C1807350x8H c1807350x8H2 = (C1807350x8H) afS161S0200000_27.l0;
        c1807350x8H2.getClass();
        FirstChargeV2Result.Data data3 = firstChargeV2Result.data;
        if (data3 != null) {
            boolValueOf3 = Boolean.valueOf(data3.isFirstRecharge);
        } else {
            boolValueOf3 = null;
        }
        c1807350x8H2.LIZ = boolValueOf3;
        FirstChargeV2Result.Data data4 = firstChargeV2Result.data;
        if (data4 != null) {
            boolValueOf4 = Boolean.valueOf(data4.isFirstCashRecharge);
        }
        c1807350x8H2.LIZIZ = boolValueOf4;
        InterfaceC1106030et7.ga.LIZJ(C1807350x8H.LJI(c1807350x8H2.LIZ));
        InterfaceC1106030et7.ha.LIZJ(C1807350x8H.LJI(c1807350x8H2.LIZIZ));
        ((C1807350x8H) afS161S0200000_27.l0).LIZLLL.set(false);
        C1C7U.LIZIZ("FirstRechargeParamSyncManager@32cd.performSync$1");
    }

    public static final void accept$5(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("FirstRechargeParamSyncManager@32cd.performSync$2");
        C1807350x8H c1807350x8H = (C1807350x8H) afS161S0200000_27.l0;
        Boolean bool = c1807350x8H.LIZ;
        Boolean bool2 = c1807350x8H.LIZIZ;
        C1807350x8H.LIZLLL(false, bool, bool2, bool, bool2, (EnumC1805570x5P) afS161S0200000_27.l1);
        ((C1807350x8H) afS161S0200000_27.l0).LIZLLL.set(false);
        C1C7U.LIZIZ("FirstRechargeParamSyncManager@32cd.performSync$2");
    }

    public static final void accept$6(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        PlayTogetherPickInfo playTogetherPickInfo;
        GetPlayTogetherPickInfoResponse.ResponseData responseData;
        C1C7U.LIZ("GameLivePlayTogetherController@b91.showPickedSheet$1");
        GetPlayTogetherPickInfoResponse getPlayTogetherPickInfoResponse = (GetPlayTogetherPickInfoResponse) obj;
        if (getPlayTogetherPickInfoResponse != null && (responseData = getPlayTogetherPickInfoResponse.data) != null) {
            playTogetherPickInfo = responseData.pickInfo;
        } else {
            playTogetherPickInfo = null;
        }
        if (playTogetherPickInfo != null && playTogetherPickInfo.isPicked) {
            GameLivePlayTogetherPickedFragment gameLivePlayTogetherPickedFragment = new GameLivePlayTogetherPickedFragment();
            gameLivePlayTogetherPickedFragment.LLILZIL = playTogetherPickInfo;
            gameLivePlayTogetherPickedFragment.setOnDismissListener(new DialogInterfaceOnDismissListenerC1864750ycr((C2177041AIc) afS161S0200000_27.l1, 2));
            gameLivePlayTogetherPickedFragment.show((FragmentManager) afS161S0200000_27.l0, "live_game_play_together_picked_type_sheet");
        } else {
            ((C2177041AIc) afS161S0200000_27.l1).LLJIJIL = false;
        }
        C1C7U.LIZIZ("GameLivePlayTogetherController@b91.showPickedSheet$1");
    }

    public static final void accept$7(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("StreamCardCell@bb36.unfollow$1");
        int i = ((FollowPair) obj).followStatus;
        if (i == 0 || i == 3) {
            FollowInfo followInfo = ((User) afS161S0200000_27.l0).getFollowInfo();
            if (followInfo != null) {
                followInfo.setFollowStatus(r6.followStatus);
            }
            ((StreamCardCell) afS161S0200000_27.l1).N5().setText(((StreamCardCell) afS161S0200000_27.l1).itemView.getContext().getString(2131856889));
            ((StreamCardCell) afS161S0200000_27.l1).N5().setButtonVariant(0);
            C786410Ut5.U8(((StreamCardCell) afS161S0200000_27.l1).N5(), new ACListenerS161S0100000_27((StreamCardCell) afS161S0200000_27.l1, 52));
        }
        C1C7U.LIZIZ("StreamCardCell@bb36.unfollow$1");
    }

    public static final void accept$8(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("UserActionMethod@38d4.followFromWeb$3");
        FollowPair followPair = (FollowPair) obj;
        if (followPair != null) {
            C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
        }
        CompletionBlock completionBlock = (CompletionBlock) afS161S0200000_27.l0;
        ((C1812020xFo) afS161S0200000_27.l1).getClass();
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C09W6.class, null), "");
        C1C7U.LIZIZ("UserActionMethod@38d4.followFromWeb$3");
    }

    public static final void accept$9(AfS161S0200000_27 afS161S0200000_27, Object obj) {
        C1C7U.LIZ("UserActionMethod@38d4.followFromWeb$5");
        FollowPair followPair = (FollowPair) obj;
        if (followPair != null) {
            C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
        }
        CompletionBlock completionBlock = (CompletionBlock) afS161S0200000_27.l0;
        ((C1812020xFo) afS161S0200000_27.l1).getClass();
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C09W6.class, null), "");
        C1C7U.LIZIZ("UserActionMethod@38d4.followFromWeb$5");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS161S0200000_27(X.C1794210wn5 r2, X.C1793890wmZ r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 12 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS161S0200000_27.<init>(X.0wn5, X.0wmZ, int):void");
    }

    public AfS161S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AfS161S0200000_27(FamilyPairingServiceImpl familyPairingServiceImpl, AwS377S0200000_11 awS377S0200000_11, C5183020f c5183020f, int i) {
        this.$t = i;
        this.l0 = awS377S0200000_11;
        this.l1 = c5183020f;
    }
}
