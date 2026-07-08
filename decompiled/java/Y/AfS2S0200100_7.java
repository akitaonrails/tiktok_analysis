package Y;

import X.AbstractC470790IdB;
import X.AbstractC516030KLp;
import X.AbstractC516150KMb;
import X.AbstractC516340KMu;
import X.C09JN;
import X.C0IJT;
import X.C0IOL;
import X.C0IR5;
import X.C0ITM;
import X.C0KFM;
import X.C0KL2;
import X.C0KLK;
import X.C0KLL;
import X.C0KLN;
import X.C0KLY;
import X.C0KP3;
import X.C0KPD;
import X.C0KS7;
import X.C0KSH;
import X.C0KSK;
import X.C0KSS;
import X.C0KST;
import X.C0KVU;
import X.C1095100ebU;
import X.C1100380ek0;
import X.C1161920gLG;
import X.C13LP;
import X.C15438062q;
import X.C1558520qew;
import X.C1789940wgC;
import X.C189200o6;
import X.C19748512Ol;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C465330IMp;
import X.C465340IMq;
import X.C470600Ics;
import X.C470770Id9;
import X.C474500IjA;
import X.C476130Iln;
import X.C488970JFn;
import X.C497740JfY;
import X.C501470JlZ;
import X.C501520Jle;
import X.C510380Jzw;
import X.C511230K3d;
import X.C511520K4g;
import X.C512300K7g;
import X.C516050KLr;
import X.C516120KLy;
import X.C516140KMa;
import X.C516160KMc;
import X.C516490KNj;
import X.C516550KNp;
import X.C517450KRb;
import X.C518180KTw;
import X.C766270U4b;
import X.C930940aKi;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1791930wjP;
import X.InterfaceC2262081DgM;
import X.InterfaceC474510IjB;
import X.InterfaceC500940Jki;
import X.InterfaceC518100KTo;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MarkUserResp;
import com.bytedance.android.livesdk.chatroom.model.UnmarkUserResp;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveLoadMoreOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedAbility;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import org.json.JSONException;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.api.envelope.PortalListResponse;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;
import webcast.data.RechargeCustomError;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public class AfS2S0200100_7 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
        }
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
    public static final void accept$0(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        String popUpContent;
        String toastContent;
        C1C7U.LIZ("FansCreateContractRepo@b2a.createContract$result$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        CreateSuperFanContractResult createSuperFanContractResult = (CreateSuperFanContractResult) baseResponse.data;
        RechargeCustomError rechargeCustomError = createSuperFanContractResult.customerr;
        String str = "";
        if (rechargeCustomError != null) {
            int i = rechargeCustomError.errCode;
            Gson gson = C19748512Ol.LIZJ;
            CustomErrorExtra customErrorExtra = (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, rechargeCustomError), CustomErrorExtra.class);
            C501470JlZ c501470JlZ = new C501470JlZ(i);
            c501470JlZ.setErrorMsg("RechargeCustomError");
            if (customErrorExtra == null || (popUpContent = customErrorExtra.getPopUpContent()) == null) {
                popUpContent = "";
            }
            c501470JlZ.setAlert(popUpContent);
            if (customErrorExtra != null && (toastContent = customErrorExtra.getToastContent()) != null) {
                str = toastContent;
            }
            c501470JlZ.setPrompt(str);
            c501470JlZ.setLogId(baseResponse.LIZIZ);
            AbstractC516340KMu.LIZIZ(((C0KPD) afS2S0200100_7.l0).LIZIZ, AbstractC516340KMu.LIZ(((C0KPD) afS2S0200100_7.l0).LIZIZ, (C0KP3) afS2S0200100_7.l1, System.currentTimeMillis() - afS2S0200100_7.j2, null, c501470JlZ, C512300K7g.LIZJ(c501470JlZ), 4));
            Map mapLIZIZ = C0KSH.LIZIZ((C0KP3) afS2S0200100_7.l1);
            mapLIZIZ.put("log_id", baseResponse.LIZIZ);
            mapLIZIZ.put("error_code", String.valueOf(i));
            mapLIZIZ.put("detail_error_code", String.valueOf(i));
            mapLIZIZ.put("detail_error_msg", c501470JlZ.getErrorMsg());
            C0KSH.LJ((int) (System.currentTimeMillis() - afS2S0200100_7.j2), false, mapLIZIZ);
            ((C0KP3) afS2S0200100_7.l1).LJIILJJIL.LIZIZ(c501470JlZ, createSuperFanContractResult.customerr);
        } else {
            C0KS7 c0ks7 = ((C0KPD) afS2S0200100_7.l0).LIZIZ;
            C0KP3 c0kp3 = (C0KP3) afS2S0200100_7.l1;
            long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0200100_7.j2;
            String str2 = createSuperFanContractResult.contractId;
            if (str2 == null) {
                str2 = "";
            }
            C516550KNp c516550KNpLIZ = AbstractC516340KMu.LIZ(c0ks7, c0kp3, jCurrentTimeMillis, str2, null, null, 24);
            ((C0KPD) afS2S0200100_7.l0).LIZIZ.getClass();
            AbstractC516340KMu.LIZLLL(c516550KNpLIZ);
            Map mapLIZIZ2 = C0KSH.LIZIZ((C0KP3) afS2S0200100_7.l1);
            mapLIZIZ2.put("contract_id", ((CreateSuperFanContractResult) baseResponse.data).contractId);
            mapLIZIZ2.put("order_id", ((CreateSuperFanContractResult) baseResponse.data).contractId);
            mapLIZIZ2.put("log_id", baseResponse.LIZIZ);
            C0KSH.LJ((int) (System.currentTimeMillis() - afS2S0200100_7.j2), true, mapLIZIZ2);
            C0KP3 c0kp32 = (C0KP3) afS2S0200100_7.l1;
            String str3 = createSuperFanContractResult.contractId;
            if (str3 != null) {
                str = str3;
            }
            c0kp32.LJIILL = str;
            c0kp32.LJIILJJIL.LJFF((CreateSuperFanContractResult) baseResponse.data);
            ((C0KPD) afS2S0200100_7.l0).LIZ.LIZ(baseResponse.data);
        }
        C1C7U.LIZIZ("FansCreateContractRepo@b2a.createContract$result$1");
    }

    public static final void accept$1(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("FansCreateContractRepo@b2a.createContract$result$2");
        Throwable th = (Throwable) obj;
        ((Number) C517450KRb.LIZ(-1, th).getFirst()).intValue();
        AbstractC516340KMu.LIZIZ(((C0KPD) afS2S0200100_7.l0).LIZIZ, AbstractC516340KMu.LIZ(((C0KPD) afS2S0200100_7.l0).LIZIZ, (C0KP3) afS2S0200100_7.l1, System.currentTimeMillis() - afS2S0200100_7.j2, null, th, C512300K7g.LIZJ(th), 4));
        Map mapLIZIZ = C0KSH.LIZIZ((C0KP3) afS2S0200100_7.l1);
        String strLJ = C512300K7g.LJ(th);
        String str = "";
        if (strLJ == null) {
            strLJ = "";
        }
        mapLIZIZ.put("log_id", strLJ);
        mapLIZIZ.put("error_code", String.valueOf(C512300K7g.LIZIZ(th)));
        mapLIZIZ.put("detail_error_code", String.valueOf(C512300K7g.LIZIZ(th)));
        String strLIZLLL = C512300K7g.LIZLLL(th);
        if (strLIZLLL != null || (strLIZLLL = th.getMessage()) != null) {
            str = strLIZLLL;
        }
        mapLIZIZ.put("detail_error_msg", str);
        C0KSH.LJ((int) (System.currentTimeMillis() - afS2S0200100_7.j2), false, mapLIZIZ);
        ((C0KP3) afS2S0200100_7.l1).LJIILJJIL.LIZIZ(th, null);
        C1C7U.LIZIZ("FansCreateContractRepo@b2a.createContract$result$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        MarkUserResp.Data data;
        C1C7U.LIZ("MarkUserManager@3cea.mark$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (MarkUserResp.Data) baseResponse.data) != null) {
            ((User) afS2S0200100_7.l0).isAnchorMarked = data.isAnchorMarked;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853649, C0KVU.LIZ((User) afS2S0200100_7.l0)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_toast");
        C0IR5 c0ir5 = (C0IR5) afS2S0200100_7.l1;
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(c0ir5);
        }
        c474500IjALIZ.LJJII("on", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII("succeed", "type");
        c474500IjALIZ.LIZ();
        C476130Iln.LIZ.onNext(new Pair<>(Long.valueOf(afS2S0200100_7.j2), Boolean.TRUE));
        C1C7U.LIZIZ("MarkUserManager@3cea.mark$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        UnmarkUserResp.Data data;
        C1C7U.LIZ("MarkUserManager@3cea.unmark$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (data = (UnmarkUserResp.Data) baseResponse.data) != null) {
            ((User) afS2S0200100_7.l0).isAnchorMarked = data.isAnchorMarked;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853648, C0KVU.LIZ((User) afS2S0200100_7.l0)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_toast");
        C0IR5 c0ir5 = (C0IR5) afS2S0200100_7.l1;
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(c0ir5);
        }
        c474500IjALIZ.LJJII("off", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII("succeed", "type");
        c474500IjALIZ.LIZ();
        C476130Iln.LIZ.onNext(new Pair<>(Long.valueOf(afS2S0200100_7.j2), Boolean.FALSE));
        C1C7U.LIZIZ("MarkUserManager@3cea.unmark$1");
    }

    public static final void accept$12(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("LiveProfileFollowProxy@7039.follow$1$1");
        ((C488970JFn) afS2S0200100_7.l0).LJFF((User) afS2S0200100_7.l1, true, afS2S0200100_7.j2, ((FollowPair) obj).followStatus);
        C1C7U.LIZIZ("LiveProfileFollowProxy@7039.follow$1$1");
    }

    public static final void accept$13(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("LiveProfileFollowProxy@7039.unfollow$1$1");
        ((C488970JFn) afS2S0200100_7.l0).LJFF((User) afS2S0200100_7.l1, false, afS2S0200100_7.j2, ((FollowPair) obj).followStatus);
        C1C7U.LIZIZ("LiveProfileFollowProxy@7039.unfollow$1$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        String str;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        C1C7U.LIZ("PortalLeaf@b89.getPortalList$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        Integer numValueOf = Integer.valueOf(baseResponse.statusCode);
        boolean zLJJJJI = ((C1100380ek0) afS2S0200100_7.l0).LJJJJI();
        long j = afS2S0200100_7.j2;
        PortalListResponse.ResponseData responseData = (PortalListResponse.ResponseData) baseResponse.data;
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        if (numValueOf != null) {
            map.put("error_code", String.valueOf(numValueOf.intValue()));
        }
        if (zLJJJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (responseData != null) {
            for (PortalListResponse.PortalInfo portalInfo : responseData.portal) {
                arrayList.add(portalInfo.id);
                arrayList2.add(portalInfo.senderId);
            }
        }
        map.put("portal_id_list", arrayList.toString());
        map.put("sender_id_list", arrayList2.toString());
        map.put("duration_from_request", String.valueOf(System.currentTimeMillis() - j));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_list_response");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_portal_list_response", 0.1d)) {
            C1CC2.LIZLLL("ttlive_portal_list_response", map, new HashMap(), new HashMap());
        }
        C1100380ek0.LJJJJ((List) afS2S0200100_7.l1, (C1100380ek0) afS2S0200100_7.l0, (PortalListResponse.ResponseData) baseResponse.data);
        C1C7U.LIZIZ("PortalLeaf@b89.getPortalList$2");
    }

    public static final void accept$15(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        int i;
        int i2;
        Object obj2;
        C1C7U.LIZ("FansClubViewModel@394b.requestFansTaskInfo$dispose$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = ((FansClubViewModel) afS2S0200100_7.l0).getDataChannel();
        if (dataChannel != null) {
            if (baseResponse != null) {
                obj2 = baseResponse.data;
            } else {
                obj2 = null;
            }
            dataChannel.SX0(C1095100ebU.class, obj2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0200100_7.j2;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = 1;
        }
        String strValueOf = String.valueOf(((Room) afS2S0200100_7.l1).getId());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fetch_fans_task_complete");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(1, "success");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "errorCode");
        c474500IjALIZ.LJJII(Integer.valueOf((int) jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(strValueOf, "room_id");
        c474500IjALIZ.LIZ();
        if (baseResponse != null) {
            i2 = baseResponse.statusCode;
        } else {
            i2 = 0;
        }
        C518180KTw.LJIIIIZZ(0, i2, "/webcast/privilege/fans_get_task_info/", jCurrentTimeMillis);
        C1C7U.LIZIZ("FansClubViewModel@394b.requestFansTaskInfo$dispose$1");
    }

    public static final void accept$16(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("EmotesCommentLazyDispatcher@2531.loadSingleEmote$4");
        Throwable th = (Throwable) obj;
        ((InterfaceC1631620sYq) afS2S0200100_7.l0).invoke((EmoteModel) afS2S0200100_7.l1, String.valueOf(th.getMessage()), 0);
        C510380Jzw.LJIJ(afS2S0200100_7.j2, th);
        C1C7U.LIZIZ("EmotesCommentLazyDispatcher@2531.loadSingleEmote$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("FansTemplateFetchRepo@784.fetchTemplate$result$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0200100_7.j2;
        final GetNonFansUserDataResponse.Data data = (GetNonFansUserDataResponse.Data) baseResponse.data;
        C516120KLy c516120KLyLIZ = C0KSS.LIZ((C0KSS) afS2S0200100_7.l0, jCurrentTimeMillis, data, null, 4);
        String str = baseResponse.LIZIZ;
        if (str == null) {
            str = "";
        }
        c516120KLyLIZ.LJFF = str;
        ((C0KSS) afS2S0200100_7.l0).LIZIZ.getClass();
        AbstractC516030KLp.LIZIZ(c516120KLyLIZ);
        ((C0KSS) afS2S0200100_7.l0).LIZ.LJIIJ.LJFF(data);
        final C0KSS c0kss = (C0KSS) afS2S0200100_7.l0;
        final C0KLN c0kln = (C0KLN) afS2S0200100_7.l1;
        InterfaceC518100KTo interfaceC518100KTo = new InterfaceC518100KTo() { // from class: X.0KSP
            @Override // X.InterfaceC518100KTo
            public final void LIZ(Map<String, C517630KRt> map) {
                C0KM0 c0km0;
                C517630KRt c517630KRt = (C517630KRt) C13LP.LJJJLIIL(map.values());
                if (c517630KRt != null) {
                    c0km0 = c517630KRt.LIZ;
                } else {
                    c0km0 = null;
                }
                if (c0km0 == C0KM0.PRE_CHECK_SUCCESS) {
                    if (c517630KRt.LIZJ.contains(C0KQD.PURCHASES)) {
                        c0kss.LIZ.LJIIJ.LIZ();
                        c0kln.LIZ(data);
                        return;
                    } else {
                        c0kss.LIZ.LJIIJ.LIZJ(c517630KRt);
                        c0kln.LIZ(data);
                        return;
                    }
                }
                c0kss.LIZ.LJIIJ.LIZJ(c517630KRt);
                c0kln.LIZ(data);
            }
        };
        C0KSK<GetNonFansUserDataResponse.Data> c0ksk = c0kss.LIZ;
        long j = c0ksk.LIZ;
        long j2 = c0ksk.LIZIZ;
        List<SuperFanPackage> list = data.allPkgInfos;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SuperFanPackage> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().iapid);
        }
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LIZJ(interfaceC518100KTo, new C1789940wgC(j, "80XR2DK73101", C13LP.LJJJJI(arrayList), null, j2, 40));
        C1C7U.LIZIZ("FansTemplateFetchRepo@784.fetchTemplate$result$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("TreasureBoxTemplateFetchRepo@7d68.fetchTemplate$result$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0200100_7.j2;
        GetSuperFansTreasureBoxDataResponse.Data data = (GetSuperFansTreasureBoxDataResponse.Data) baseResponse.data;
        C516120KLy c516120KLyLIZ = C0KST.LIZ((C0KST) afS2S0200100_7.l0, jCurrentTimeMillis, data.treasureBoxPkgInfo, null, 4);
        c516120KLyLIZ.LJ = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForSuperFan();
        String str = baseResponse.LIZIZ;
        if (str == null) {
            str = "";
        }
        c516120KLyLIZ.LJFF = str;
        ((C0KST) afS2S0200100_7.l0).LIZIZ.getClass();
        AbstractC516030KLp.LIZIZ(c516120KLyLIZ);
        ((C0KST) afS2S0200100_7.l0).LIZ.LJIIJ.LJFF(data);
        ((C0KLN) afS2S0200100_7.l1).LIZ(baseResponse.data);
        C1C7U.LIZIZ("TreasureBoxTemplateFetchRepo@7d68.fetchTemplate$result$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS2S0200100_7 afS2S0200100_7, Object obj) throws JSONException {
        String str;
        C1C7U.LIZ("SubscribeCreateContractRepo@5d14.createContract$1");
        PGCCreateContractResult pGCCreateContractResult = (PGCCreateContractResult) ((DataResponse) obj).data;
        if (pGCCreateContractResult != null) {
            Object obj2 = null;
            C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(((C516490KNj) afS2S0200100_7.l0).LIZLLL, (C0KFM) afS2S0200100_7.l1, System.currentTimeMillis() - afS2S0200100_7.j2, pGCCreateContractResult.contractId, null, null, 24);
            ((C516490KNj) afS2S0200100_7.l0).LIZLLL.getClass();
            AbstractC516150KMb.LIZLLL(c516160KMcLIZ);
            C516140KMa c516140KMa = (C516140KMa) ((C516490KNj) afS2S0200100_7.l0).LIZJ.getValue();
            C0KFM c0kfm = (C0KFM) afS2S0200100_7.l1;
            String str2 = c0kfm.LJIIIZ;
            String str3 = c0kfm.LJIL;
            String str4 = c0kfm.LJJ;
            String str5 = c0kfm.LJIIJJI;
            String str6 = c0kfm.LJI;
            HashMap<String, Object> map = c0kfm.LJIJJLI;
            if (map != null) {
                obj2 = map.get("log_anchor_id");
            }
            if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                str = "";
            }
            c516140KMa.LIZIZ = str3;
            c516140KMa.LIZ = str2;
            c516140KMa.LIZJ = str4;
            c516140KMa.LIZLLL = str5;
            c516140KMa.LJ = str6;
            c516140KMa.LJFF = str;
            C0KFM c0kfm2 = (C0KFM) afS2S0200100_7.l1;
            String str7 = pGCCreateContractResult.contractId;
            c0kfm2.LJJIIZ = str7;
            C516050KLr c516050KLr = C516050KLr.LIZ;
            String str8 = c0kfm2.LJIIIZ;
            boolean zLIZ = c0kfm2.LIZ();
            Integer numValueOf = Integer.valueOf(((C0KFM) afS2S0200100_7.l1).LJIIZILJ);
            c516050KLr.getClass();
            C516050KLr.LIZ(str8, numValueOf, str7, zLIZ);
            ((C516490KNj) afS2S0200100_7.l0).LIZ.LIZ(pGCCreateContractResult);
        }
        C1C7U.LIZIZ("SubscribeCreateContractRepo@5d14.createContract$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS2S0200100_7 afS2S0200100_7, Object obj) throws JSONException {
        C1C7U.LIZ("SubscribeCreateContractRepo@5d14.preCreateContract$1");
        PGCCreateContractResult pGCCreateContractResult = (PGCCreateContractResult) ((DataResponse) obj).data;
        if (pGCCreateContractResult != null) {
            C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(((C516490KNj) afS2S0200100_7.l0).LIZLLL, (C0KFM) afS2S0200100_7.l1, System.currentTimeMillis() - afS2S0200100_7.j2, pGCCreateContractResult.contractId, null, null, 24);
            ((C516490KNj) afS2S0200100_7.l0).LIZLLL.getClass();
            AbstractC516150KMb.LIZLLL(c516160KMcLIZ);
        }
        C1C7U.LIZIZ("SubscribeCreateContractRepo@5d14.preCreateContract$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        List listLIZ;
        List<PGCTemplateInfo> list;
        C1C7U.LIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplateBasic$2$1");
        PGCTemplateListData pGCTemplateListData = (PGCTemplateListData) ((DataResponse) obj).data;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS2S0200100_7.l0;
        C189200o6.m2constructorimpl(pGCTemplateListData);
        interfaceC1364105Vn.resumeWith(pGCTemplateListData);
        long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0200100_7.j2;
        C0KL2 c0kl2 = (C0KL2) afS2S0200100_7.l1;
        if (pGCTemplateListData != null && (list = pGCTemplateListData.templateList) != null) {
            listLIZ = C0KLY.LIZ(list);
        } else {
            listLIZ = null;
        }
        C0KLL c0kllLIZIZ = C0KL2.LIZIZ(c0kl2, jCurrentTimeMillis, listLIZ, null, 4);
        ((C0KL2) afS2S0200100_7.l1).LJ.getClass();
        C0KLK.LIZIZ(c0kllLIZIZ);
        C1C7U.LIZIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplateBasic$2$1");
    }

    public static final void accept$5(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplateBasic$2$2");
        Throwable th = (Throwable) obj;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS2S0200100_7.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        Context contextLIZJ = C511520K4g.LIZJ();
        if (contextLIZJ != null || (contextLIZJ = ((C0KL2) afS2S0200100_7.l1).LIZ.LJIIIZ) != null) {
            C511230K3d.LIZ(contextLIZJ, th, 2131839337);
        }
        C0KLL c0kllLIZIZ = C0KL2.LIZIZ((C0KL2) afS2S0200100_7.l1, System.currentTimeMillis() - afS2S0200100_7.j2, null, th, 2);
        ((C0KL2) afS2S0200100_7.l1).LJ.getClass();
        C0KLK.LIZ(c0kllLIZIZ);
        C1C7U.LIZIZ("SubscribeTemplateFetchRepo@b0a5.fetchTemplateBasic$2$2");
    }

    public static final void accept$6(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        String simpleName;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        C1C7U.LIZ("MultiPlusFeedRoomListProviderV2@2def.loadMore$disposable$2");
        Throwable th = (Throwable) obj;
        ((MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0).LLJILJIL.set(false);
        if (LiveLoadMoreOptSetting.INSTANCE.isTry()) {
            MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV2 = (MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0;
            multiPlusFeedRoomListProviderV2.LJJIIJZLJL(multiPlusFeedRoomListProviderV2.LLJL);
        }
        C20441214yg.LJI("MultiPlusFeedRoomListProvider", th);
        ((Map) afS2S0200100_7.l1).put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - afS2S0200100_7.j2));
        MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV22 = (MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0;
        if (th instanceof C501520Jle) {
            simpleName = String.valueOf(((C501520Jle) th).getErrorCode());
        } else {
            simpleName = th.getClass().getSimpleName();
        }
        multiPlusFeedRoomListProviderV22.LLJJLIIIJLLLLLLLZ = simpleName;
        ((Map) afS2S0200100_7.l1).put("error_code", ((MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0).LLJJLIIIJLLLLLLLZ);
        Map map = (Map) afS2S0200100_7.l1;
        EnterRoomConfig enterRoomConfig = ((MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0).LLILZIL.LIZIZ;
        String str2 = null;
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
            str = roomsData2.enterFromMerge;
        } else {
            str = null;
        }
        map.put("enter_from_merge", str);
        Map map2 = (Map) afS2S0200100_7.l1;
        EnterRoomConfig enterRoomConfig2 = ((MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0).LLILZIL.LIZIZ;
        if (enterRoomConfig2 != null && (roomsData = enterRoomConfig2.mRoomsData) != null) {
            str2 = roomsData.enterMethod;
        }
        map2.put("enter_method", str2);
        MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV23 = (MultiPlusFeedRoomListProviderV2) afS2S0200100_7.l0;
        Map map3 = (Map) afS2S0200100_7.l1;
        multiPlusFeedRoomListProviderV23.getClass();
        C0IOL.LJJIZ(map3);
        C1C7U.LIZIZ("MultiPlusFeedRoomListProviderV2@2def.loadMore$disposable$2");
    }

    public static final void accept$7(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) afS2S0200100_7.l0;
        Map map = (Map) afS2S0200100_7.l1;
        long j = afS2S0200100_7.j2;
        Throwable th = (Throwable) obj;
        multiPlusFeedRoomListProvider.getClass();
        C1C7U.LIZ("MultiPlusFeedRoomListProvider@8180.loadMore$2L");
        multiPlusFeedRoomListProvider.LLJIJIL = false;
        if (LiveLoadMoreOptSetting.INSTANCE.isTry()) {
            multiPlusFeedRoomListProvider.LJJIIJZLJL(multiPlusFeedRoomListProvider.LLJLLL);
        }
        C20441214yg.LJI("MultiPlusFeedRoomListProvider", th);
        map.put("request_time", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (th instanceof C501520Jle) {
            multiPlusFeedRoomListProvider.LLJLLIL = String.valueOf(((C501520Jle) th).getErrorCode());
        } else {
            multiPlusFeedRoomListProvider.LLJLLIL = th.getClass().getSimpleName();
        }
        map.put("error_code", multiPlusFeedRoomListProvider.LLJLLIL);
        map.put("enter_from_merge", multiPlusFeedRoomListProvider.LLJI.mRoomsData.enterFromMerge);
        map.put("enter_method", multiPlusFeedRoomListProvider.LLJI.mRoomsData.enterMethod);
        C0IOL.LJJIZ(map);
        C1C7U.LIZIZ("MultiPlusFeedRoomListProvider@8180.loadMore$2L");
    }

    public static final void accept$8(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        C1C7U.LIZ("SubSpaceDetailVM@57b0.deletePost$1");
        ((Function0) afS2S0200100_7.l0).invoke();
        InterfaceC665370Q7z interfaceC665370Q7z = ((SubSpaceDetailVM) afS2S0200100_7.l1).LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            subSpaceFeedAbility.Gh(afS2S0200100_7.j2);
        }
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) afS2S0200100_7.l1;
        subSpaceDetailVM.getClass();
        subSpaceDetailVM.setState(AFwS237S0000000_7.get$arr$(271));
        C1C7U.LIZIZ("SubSpaceDetailVM@57b0.deletePost$1");
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
    public static final void accept$9(AfS2S0200100_7 afS2S0200100_7, Object obj) {
        boolean z;
        C470600Ics c470600Ics = (C470600Ics) afS2S0200100_7.l0;
        long j = afS2S0200100_7.j2;
        AbstractC470790IdB abstractC470790IdB = (AbstractC470790IdB) afS2S0200100_7.l1;
        C0ITM c0itm = (C0ITM) obj;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.loadAfter$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c0itm != null) {
            C465340IMq c465340IMq = new C465340IMq();
            c465340IMq.LIZ = c0itm.LJ;
            c465340IMq.LIZLLL = c0itm.LIZLLL;
            c465340IMq.LJ = "/webcast/feed/";
            c465340IMq.LJFF = c0itm.LJFF;
            C465330IMp.LIZ(j, jCurrentTimeMillis, jUptimeMillis, c465340IMq.LIZ(), c0itm.LIZIZ, c0itm.LIZJ);
        }
        android.util.Pair pair = (android.util.Pair) c0itm.LIZ;
        Long lLJIILLIIL = C470600Ics.LJIILLIIL((FeedExtra) pair.second);
        MutableLiveData<Boolean> mutableLiveData = c470600Ics.LJIIJ;
        if (lLJIILLIIL != null) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
        abstractC470790IdB.LIZ(lLJIILLIIL, c470600Ics.LJIIZILJ((List) pair.first, (FeedExtra) pair.second));
        c470600Ics.LJIIIIZZ.postValue(C470770Id9.LIZJ);
        if (c470600Ics.LJI.get(c470600Ics.LJFF).size() == 1) {
            Object obj2 = ListProtector.get(c470600Ics.LJI.get(c470600Ics.LJFF), 0);
            if ((obj2 instanceof FeedItem) && ((FeedItem) obj2).type == 1005) {
                c470600Ics.LJIIJJI.postValue(Boolean.TRUE);
            }
        }
        C1C7U.LIZIZ("RxCacheDataSource@388c.loadAfter$1L");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S0200100_7(long r2, X.C0KL2 r4, X.C23260099m r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.j2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r5
            r0.j2 = r2
            r0.l1 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S0200100_7.<init>(long, X.0KL2, X.099m, int):void");
    }

    public AfS2S0200100_7(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
