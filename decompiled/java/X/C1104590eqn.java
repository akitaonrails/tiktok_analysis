package X;

import Y.AfS0S1101100_4;
import Y.AfS153S0200000_17;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.room.ChatMessageReplaceEvent;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBagToast;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.LiveSendGoodyBagEvent;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCoinDetail;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail;
import com.bytedance.android.livesdk.goody_bag.model.ParticipateThresholdSelected;
import com.bytedance.android.livesdk.impl.revenue.goodybag.api.GoodyBagApi;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBag4FEModel;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShortTouchInitData;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShourTouchModel4FE;
import com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: renamed from: X.0eqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104590eqn implements InterfaceC1104570eql {
    public DataChannel LIZ;
    public InterfaceC1104610eqp LIZIZ;
    public boolean LIZJ;
    public Room LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public String LJI;
    public final C1151720g4o LJII = new C1151720g4o(this, 22);
    public final C1151790g4v LJIIIIZZ = new C1151790g4v(this, 5);
    public GoodyBagMessage LJIIIZ;
    public GoodyBagBaseInfo LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public AnonymousClass0956 LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    @Override // X.InterfaceC1104570eql
    public final void LIZJ() {
        IMessageManager iMessageManager;
        this.LIZIZ = null;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LJII);
        }
        C1548820qPI.LJIIIIZZ("EVENT_GOODY_BAG_CREATE_SUCCESS", this.LJIIIIZZ);
        C1548820qPI.LJIIIIZZ("EVENT_GOODY_BAG_END", this.LJIIIIZZ);
        C1548820qPI.LJIIIIZZ("EVENT_GOODY_BAG_SHARE_EVENT", this.LJIIIIZZ);
        this.LIZLLL = null;
    }

    public final void LJIILJJIL() {
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo != null) {
            String str = goodyBagBaseInfo.goodyBagId;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            int i = goodyBagCommonDetail != null ? goodyBagCommonDetail.openAt : 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i2 = this.LJIIJJI;
            if (i2 == 0) {
                boolean z = this.LIZJ;
                HashMap map = new HashMap();
                UserService userService = UserService.getInstance();
                if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                    map.put("user_id", String.valueOf(currentUser.getId()));
                }
                map.put("is_anchor", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = String.valueOf(room.getId());
                    }
                    map.put("room_id", idStr);
                    map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    User owner = room.getOwner();
                    if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                        string = "";
                    }
                    map.put("follow_status", string);
                }
                map.put("goody_bag_id", str);
                map.put("open_at", String.valueOf(i));
                map.put("time_diff", String.valueOf(C963140bAe.LIZLLL));
                map.put("dur_from_open_at", String.valueOf(C963140bAe.LIZIZ() - (((long) i) * 1000)));
                map.put("retry_count", String.valueOf(i2));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_lottery_request");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIILL("other");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LIZ();
                C1CC2.LJII(0, "ttlive_goody_bag_lottery_request", map);
            }
            C480460Ism.LIZ().getClass();
            ((GoodyBagApi) C480460Ism.LIZLLL(GoodyBagApi.class)).getUserIfWinner(str).LJFF(new C0UO0()).LJJIIZ(new AfS0S1101100_4(this, str, i, jCurrentTimeMillis, 0), new AfS0S1101100_4(this, str, i, jCurrentTimeMillis, 1));
        }
    }

    public final void LJIJ() {
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo != null) {
            String str = goodyBagBaseInfo.goodyBagId;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            int i = goodyBagCommonDetail != null ? goodyBagCommonDetail.openAt : 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i2 = this.LJIIJJI;
            if (i2 == 0) {
                boolean z = this.LIZJ;
                HashMap map = new HashMap();
                UserService userService = UserService.getInstance();
                if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                    map.put("user_id", String.valueOf(currentUser.getId()));
                }
                map.put("is_anchor", z ? "1" : CardStruct.IStatusCode.DEFAULT);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = String.valueOf(room.getId());
                    }
                    map.put("room_id", idStr);
                    map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    User owner = room.getOwner();
                    if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                        string = "";
                    }
                    map.put("follow_status", string);
                }
                map.put("goody_bag_id", str);
                map.put("open_at", String.valueOf(i));
                map.put("time_diff", String.valueOf(C963140bAe.LIZLLL));
                map.put("dur_from_open_at", String.valueOf(C963140bAe.LIZIZ() - (((long) i) * 1000)));
                map.put("request_platform", "client");
                map.put("retry_count", String.valueOf(i2));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_winner_list_request");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIILL("other");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LIZ();
                C1CC2.LJII(0, "ttlive_goody_bag_winner_list_request", map);
            }
            C480460Ism.LIZ().getClass();
            ((GoodyBagApi) C480460Ism.LIZLLL(GoodyBagApi.class)).getWinnerList(str, 0L, 200L).LJFF(new C0UO0()).LJJIIZ(new AfS0S1101100_4(this, str, i, jCurrentTimeMillis, 2), new AfS0S1101100_4(this, str, i, jCurrentTimeMillis, 3));
        }
    }

    @Override // X.InterfaceC1104570eql
    public final void onPause() {
    }

    @Override // X.InterfaceC1104570eql
    public final void onResume() {
    }

    public final void LJFF() {
        IWalletCenter iWalletCenterWalletCenter;
        C20441214yg.LIZIZ("GoodyBagPresenter", "anchorOpenWinnerPage: ");
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null) {
            iWalletCenterWalletCenter.Ri2(EnumC1805420x5A.GOODY_BAG);
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C314240CTm(this, null), 3);
    }

    public final int LJIIL() {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        ParticipateThresholdSelected participateThresholdSelected;
        if (!C518190KTx.LIZ(this.LIZJ, this.LIZLLL) || (goodyBagBaseInfo = this.LJIIJ) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || (participateThresholdSelected = goodyBagCommonDetail.participateThresholdSelected) == null) {
            return 1;
        }
        return participateThresholdSelected.type;
    }

    public final long LJIILIIL() {
        GoodyBagBaseInfo goodyBagBaseInfo;
        GoodyBagCommonDetail goodyBagCommonDetail;
        ParticipateThresholdSelected participateThresholdSelected;
        if (!C518190KTx.LIZ(this.LIZJ, this.LIZLLL) || (goodyBagBaseInfo = this.LJIIJ) == null || (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) == null || (participateThresholdSelected = goodyBagCommonDetail.participateThresholdSelected) == null) {
            return 0L;
        }
        return participateThresholdSelected.value;
    }

    public final void LJIIZILJ() {
        C20441214yg.LIZIZ("GoodyBagPresenter", "reSetStatus");
        LJIJI(false);
        this.LJIIJ = null;
        this.LJIILJJIL = false;
        this.LJIILL = false;
        LJIJJ(false);
        C780500UjY.LIZ = null;
        this.LJIIIZ = null;
        this.LJIIJJI = 0;
        this.LJIIL = false;
        this.LJFF = false;
        this.LJI = null;
    }

    @Override // X.InterfaceC1104570eql
    public final GoodyBagBaseInfo LIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1104570eql
    public final GoodyBagMessage LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1104570eql
    public final boolean isAnchor() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1104570eql
    public final void LIZLLL(GetRoomGoodyBagResponse.ResponseData responseData) {
        int i;
        int i2;
        Number numberValueOf;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        GoodyBagCommonDetail goodyBagCommonDetail;
        GoodyBagCommonDetail goodyBagCommonDetail2;
        GoodyBagCommonDetail goodyBagCommonDetail3;
        ParticipateThresholdSelected participateThresholdSelected;
        GoodyBagCommonDetail goodyBagCommonDetail4;
        ParticipateThresholdSelected participateThresholdSelected2;
        GoodyBagCoinDetail goodyBagCoinDetail;
        GoodyBagCommonDetail goodyBagCommonDetail5;
        String str;
        GoodyBagCommonDetail goodyBagCommonDetail6;
        GoodyBagCommonDetail goodyBagCommonDetail7;
        User owner;
        if (C500260Jjc.LJJIIZ(responseData.goodyBagId) && !this.LJFF) {
            this.LJFF = true;
            C20441214yg.LIZIZ("GoodyBagPresenter", "getGoodyBagRoom");
            boolean z = responseData.joined;
            GoodyBagBaseInfo goodyBagBaseInfo = responseData.baseInfo;
            if (goodyBagBaseInfo != null) {
                i = goodyBagBaseInfo.biz;
            } else {
                i = -1;
            }
            if (!LJIIIZ(i)) {
                return;
            }
            GoodyBagShourTouchModel4FE goodyBagShourTouchModel4FE = new GoodyBagShourTouchModel4FE();
            ArrayList arrayList = new ArrayList();
            GoodyBagShortTouchInitData goodyBagShortTouchInitData = new GoodyBagShortTouchInitData();
            goodyBagShortTouchInitData.dataFrom = "api";
            Room room = this.LIZLLL;
            int i8 = 0;
            String str2 = "";
            if (room != null && (owner = room.getOwner()) != null) {
                if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
                    String str3 = "";
                    goodyBagShortTouchInitData.anchorAvatarUrl = str3;
                    goodyBagShortTouchInitData.anchorName = C0KVU.LJ(owner);
                } else {
                    String str32 = "";
                    goodyBagShortTouchInitData.anchorAvatarUrl = str32;
                    goodyBagShortTouchInitData.anchorName = C0KVU.LJ(owner);
                }
            }
            this.LJIILJJIL = responseData.participateMethodSatisfied;
            this.LJIILL = responseData.participateThresholdSatisfied;
            goodyBagShortTouchInitData.goodyBagId = responseData.goodyBagId;
            GoodyBagBaseInfo goodyBagBaseInfo2 = responseData.baseInfo;
            if (goodyBagBaseInfo2 != null) {
                i2 = goodyBagBaseInfo2.biz;
            } else {
                i2 = 0;
            }
            goodyBagShortTouchInitData.goodyBagBiz = i2;
            if (goodyBagBaseInfo2 != null && (goodyBagCommonDetail7 = goodyBagBaseInfo2.commonDetail) != null) {
                numberValueOf = Integer.valueOf(goodyBagCommonDetail7.openAt);
            } else {
                numberValueOf = 0L;
            }
            goodyBagShortTouchInitData.openAt = numberValueOf.longValue() - (C963140bAe.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            GoodyBagBaseInfo goodyBagBaseInfo3 = responseData.baseInfo;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail6 = goodyBagBaseInfo3.commonDetail) != null) {
                i3 = goodyBagCommonDetail6.participateMethod;
            } else {
                i3 = 0;
            }
            goodyBagShortTouchInitData.participateMethod = i3;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail5 = goodyBagBaseInfo3.commonDetail) != null && (str = goodyBagCommonDetail5.participateMethodContent) != null) {
                str2 = str;
            }
            goodyBagShortTouchInitData.participateMethodContent = str2;
            if (goodyBagBaseInfo3 != null && (goodyBagCoinDetail = goodyBagBaseInfo3.coinDetail) != null) {
                i4 = goodyBagCoinDetail.totalCoin;
            } else {
                i4 = 0;
            }
            goodyBagShortTouchInitData.totalCoins = i4;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail4 = goodyBagBaseInfo3.commonDetail) != null && (participateThresholdSelected2 = goodyBagCommonDetail4.participateThresholdSelected) != null) {
                i5 = participateThresholdSelected2.type;
            } else {
                i5 = 0;
            }
            goodyBagShortTouchInitData.participateThresholdType = i5;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail3 = goodyBagBaseInfo3.commonDetail) != null && (participateThresholdSelected = goodyBagCommonDetail3.participateThresholdSelected) != null) {
                i6 = (int) participateThresholdSelected.value;
            } else {
                i6 = 0;
            }
            goodyBagShortTouchInitData.participateThresholdValue = i6;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail2 = goodyBagBaseInfo3.commonDetail) != null) {
                i7 = goodyBagCommonDetail2.winnerHeadcount;
            } else {
                i7 = 0;
            }
            goodyBagShortTouchInitData.winnerHeadCount = i7;
            if (goodyBagBaseInfo3 != null && (goodyBagCommonDetail = goodyBagBaseInfo3.commonDetail) != null) {
                i8 = goodyBagCommonDetail.countDownMinutes;
            }
            goodyBagShortTouchInitData.countDownMinutes = i8;
            goodyBagShourTouchModel4FE.timeDiff = C963140bAe.LIZJ() - System.currentTimeMillis();
            goodyBagShortTouchInitData.timeDiff = C963140bAe.LIZLLL;
            arrayList.add(goodyBagShortTouchInitData);
            goodyBagShourTouchModel4FE.goodyBagList = arrayList;
            String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, goodyBagShourTouchModel4FE);
            InterfaceC1104610eqp interfaceC1104610eqp = this.LIZIZ;
            if (interfaceC1104610eqp != null) {
                interfaceC1104610eqp.LJJZ(json);
            }
            this.LJIIJ = responseData.baseInfo;
            boolean z2 = responseData.participateMethodSatisfied;
            this.LJIILJJIL = z2;
            this.LJIILL = responseData.participateThresholdSatisfied;
            LJIJJ(z2);
            LJIILL("api");
            LJIJI(z);
            C780500UjY.LIZ = this.LJIIJ;
        }
    }

    public final void LJI(GetGoodyBagLotteryResponse.ResponseData responseData) {
        String str;
        int i;
        GetGoodyBagLotteryResponse.ResponseData responseData2;
        Boolean bool;
        IWalletCenter iWalletCenterWalletCenter;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null) {
            iWalletCenterWalletCenter.Ri2(EnumC1805420x5A.GOODY_BAG);
        }
        GoodyBag4FEModel goodyBag4FEModel = new GoodyBag4FEModel();
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo == null || (str = goodyBagBaseInfo.goodyBagId) == null) {
            str = "";
        }
        goodyBag4FEModel.goodyBagId = str;
        if (goodyBagBaseInfo != null) {
            i = goodyBagBaseInfo.biz;
        } else {
            i = 0;
        }
        goodyBag4FEModel.goodyBagBiz = i;
        C389001fE.LIZ("EVENT_GOODY_BAG_OPEN", new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, goodyBag4FEModel)), System.currentTimeMillis(), false);
        if (responseData != null) {
            responseData2 = new GetGoodyBagLotteryResponse.ResponseData();
            responseData2.win = responseData.win;
            responseData2.coins = responseData.coins;
        } else {
            responseData2 = null;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null && !bool.booleanValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C1148370fzP.class, this.LJIIIZ);
            dataChannelGlobal.JQ2(C1148360fzO.class, this.LJIIJ);
            dataChannelGlobal.JQ2(C1148380fzQ.class, responseData2);
            dataChannelGlobal.JQ2(C1148150fz3.class, Boolean.TRUE);
            LJIIZILJ();
            C784440Upu.LIZ().LIZIZ(new C0IF2("goody_bag_open_winner_horizontal"));
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C314270CTp(this, responseData2, null), 3);
    }

    public final boolean LJIIIZ(int i) {
        Map map;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (map = (Map) dataChannel.gg0(C754590Tir.class)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (i == ((int) ((Number) entry.getKey()).longValue()) && ((Boolean) entry.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ(int i) {
        Activity activityLIZ;
        C1389890mGx c1389890mGx;
        Dialog dialog;
        Context viewContext;
        InterfaceC1104610eqp interfaceC1104610eqp = this.LIZIZ;
        Object obj = null;
        if (interfaceC1104610eqp != null && (viewContext = interfaceC1104610eqp.getViewContext()) != null) {
            activityLIZ = C1388190mED.LIZ(viewContext);
        } else {
            activityLIZ = null;
        }
        C1529870puj.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C1529870puj.LIZIZ);
        linkedHashMap.putAll(C1529870puj.LIZJ);
        linkedHashMap.putAll(C1529870puj.LIZLLL);
        linkedHashMap.putAll(C1529870puj.LJ);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C1529880puk c1529880puk = SparkContext.Companion;
            String str = (String) entry.getKey();
            c1529880puk.getClass();
            Object objLIZ = C1529880puk.LIZ(str);
            if ((objLIZ instanceof SparkPopup) && Intrinsics.LJFF(((Fragment) objLIZ).getActivity(), activityLIZ)) {
                obj = objLIZ;
            }
        }
        DialogFragment dialogFragment = (DialogFragment) obj;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            c1389890mGx = new C1389890mGx(dialog);
        } else if (activityLIZ == null) {
            return;
        } else {
            c1389890mGx = new C1389890mGx(activityLIZ);
        }
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.eu1);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[PHI: r8 r9
      0x0019: PHI (r8v0 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String) binds: [B:10:0x0017, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x0019: PHI (r9v1 int) = (r9v3 int), (r9v4 int) binds: [B:10:0x0017, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[PHI: r9
      0x0015: PHI (r9v3 int) = (r9v0 int), (r9v4 int) binds: [B:22:0x0045, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r13) {
        /*
            r12 = this;
            X.00w2 r6 = new X.00w2
            r6.<init>()
            r7 = r12
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo r2 = r7.LJIIJ
            r1 = 0
            if (r2 == 0) goto L44
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail r0 = r2.commonDetail
            if (r0 == 0) goto L44
            int r9 = r0.openAt
        L11:
            java.lang.String r8 = r2.goodyBagId
            if (r8 != 0) goto L19
        L15:
            java.lang.String r8 = ""
            if (r2 == 0) goto L1f
        L19:
            com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonDetail r0 = r2.commonDetail
            if (r0 == 0) goto L1f
            int r1 = r0.countDownMinutes
        L1f:
            java.lang.String r0 = "api"
            r10 = r13
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r0)
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L3a
            long r0 = (long) r1
            r2 = 60
            long r0 = r0 * r2
            long r0 = r0 * r4
            r6.element = r0
        L31:
            long r0 = r6.element
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L48
            return
        L3a:
            long r0 = (long) r9
            long r0 = r0 * r4
            long r2 = X.C963140bAe.LIZIZ()
            long r0 = r0 - r2
            r6.element = r0
            goto L31
        L44:
            r9 = 0
            if (r2 == 0) goto L15
            goto L11
        L48:
            X.03Hh r1 = X.C817503Hh.LL
            X.0CTu r5 = new X.0CTu
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r1, r11, r11, r5, r0)
            r7.LJIILIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104590eqn.LJIILL(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104590eqn.LJIILLIIL(java.lang.String):void");
    }

    public final void LJIJI(boolean z) {
        Context viewContext;
        String str;
        Object obj;
        String string;
        FollowInfo followInfo;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        InterfaceC1104610eqp interfaceC1104610eqp = this.LIZIZ;
        if (interfaceC1104610eqp != null && (viewContext = interfaceC1104610eqp.getViewContext()) != null) {
            IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
            if (iHybridStorageService != null) {
                iHybridStorageService.CM(viewContext, Boolean.valueOf(z), "AUDIENCE_JOINED_GOODY_BAG", null);
            }
            this.LJ = z;
            GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            if (goodyBagBaseInfo == null || (str = goodyBagBaseInfo.goodyBagId) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            HashMap map = new HashMap();
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                map.put("user_id", String.valueOf(currentUser.getId()));
            }
            if (C472950Igf.LIZ) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor", obj);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                map.put("room_id", idStr);
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                User owner = room.getOwner();
                if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                    string = "";
                }
                map.put("follow_status", string);
            }
            map.put("goody_bag_id", str);
            if (z) {
                str2 = "1";
            }
            map.put("joined", str2);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_joined_storage_status");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJIILL("other");
            c474500IjALIZ.LJIIJJI("live");
            c474500IjALIZ.LIZ();
            C1CC2.LJII(0, "ttlive_goody_bag_joined_storage_status", map);
        }
    }

    public final void LJIJJ(boolean z) {
        Context viewContext;
        InterfaceC1104610eqp interfaceC1104610eqp = this.LIZIZ;
        if (interfaceC1104610eqp != null && (viewContext = interfaceC1104610eqp.getViewContext()) != null) {
            IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
            if (iHybridStorageService != null) {
                iHybridStorageService.CM(viewContext, Boolean.valueOf(z), "AUDIENCE_GOODY_BAG_PARTICIPATE_METHOD_SATISFIED", null);
            }
            this.LJIILJJIL = z;
        }
    }

    @Override // X.InterfaceC1104570eql
    public final void LJ(DataChannel dataChannel, InterfaceC1104610eqp interfaceC1104610eqp) {
        boolean zBooleanValue;
        LifecycleOwner lifecycleOwner;
        IMessageManager iMessageManager;
        LiveWidget liveWidget;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachView(");
        sbLIZ.append(dataChannel);
        sbLIZ.append(')');
        C20441214yg.LIZIZ("GoodyBagPresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = interfaceC1104610eqp;
        this.LIZ = dataChannel;
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LIZJ = zBooleanValue;
        this.LIZLLL = (Room) dataChannel.gg0(RoomChannel.class);
        this.LJ = false;
        this.LJIILIIL = null;
        this.LJFF = false;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIILL = false;
        this.LJIILJJIL = false;
        this.LJIIJJI = 0;
        this.LJIIL = false;
        this.LJI = null;
        InterfaceC1104610eqp interfaceC1104610eqp2 = this.LIZIZ;
        if (interfaceC1104610eqp2 instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) interfaceC1104610eqp2;
        } else {
            lifecycleOwner = null;
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(lifecycleOwner, LiveSendGoodyBagEvent.class, new AwS596S0100000_17(this, 403));
        }
        DataChannel dataChannel3 = this.LIZ;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(lifecycleOwner, FansClubEvent.class, new AwS596S0100000_17(this, 404));
        }
        DataChannel dataChannel4 = this.LIZ;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(lifecycleOwner, ChatMessageReplaceEvent.class, new AwS596S0100000_17(this, 405));
        }
        DataChannel dataChannel5 = this.LIZ;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(lifecycleOwner, ShareJoinInGoodyBag.class, new AwS583S0100000_4(this, 248));
        }
        DataChannel dataChannel6 = this.LIZ;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(lifecycleOwner, ShareJoinInGoodyBagToast.class, new AwS596S0100000_17(this, 406));
        }
        Object obj = this.LIZIZ;
        if ((obj instanceof LiveWidget) && (liveWidget = (LiveWidget) obj) != null) {
            ((C0J1N) C784440Upu.LIZ().LJ(C1104630eqr.class).LIZJ(C11RD.LJ(liveWidget))).LIZJ(new AfS153S0200000_17(this, liveWidget, 21));
        }
        C1548820qPI.LIZLLL("EVENT_GOODY_BAG_CREATE_SUCCESS", this.LJIIIIZZ);
        C1548820qPI.LIZLLL("EVENT_GOODY_BAG_END", this.LJIIIIZZ);
        C1548820qPI.LIZLLL("EVENT_GOODY_BAG_SHARE_EVENT", this.LJIIIIZZ);
        DataChannel dataChannel7 = this.LIZ;
        if (dataChannel7 != null && (iMessageManager = (IMessageManager) dataChannel7.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.GOODY_BAG_MESSAGE.getIntType(), this.LJII);
        }
    }

    public final String LJIIJJI(GoodyBagBaseInfo goodyBagBaseInfo, String str) {
        Number numberValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ParticipateThresholdSelected participateThresholdSelected;
        ParticipateThresholdSelected participateThresholdSelected2;
        String str2;
        User owner;
        int i6 = 0;
        if (goodyBagBaseInfo == null) {
            return null;
        }
        GoodyBagShourTouchModel4FE goodyBagShourTouchModel4FE = new GoodyBagShourTouchModel4FE();
        ArrayList arrayList = new ArrayList();
        GoodyBagShortTouchInitData goodyBagShortTouchInitData = new GoodyBagShortTouchInitData();
        goodyBagShortTouchInitData.dataFrom = str;
        Room room = this.LIZLLL;
        String str3 = "";
        if (room != null && (owner = room.getOwner()) != null) {
            if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
                String str4 = "";
                goodyBagShortTouchInitData.anchorAvatarUrl = str4;
                goodyBagShortTouchInitData.anchorName = C0KVU.LJ(owner);
            } else {
                String str42 = "";
                goodyBagShortTouchInitData.anchorAvatarUrl = str42;
                goodyBagShortTouchInitData.anchorName = C0KVU.LJ(owner);
            }
        }
        if (goodyBagBaseInfo != null) {
            goodyBagShortTouchInitData.goodyBagId = goodyBagBaseInfo.goodyBagId;
            goodyBagShortTouchInitData.goodyBagBiz = goodyBagBaseInfo.biz;
            GoodyBagCommonDetail goodyBagCommonDetail = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail != null) {
                numberValueOf = Integer.valueOf(goodyBagCommonDetail.openAt);
            } else {
                numberValueOf = 0L;
            }
            goodyBagShortTouchInitData.openAt = numberValueOf.longValue() - (C963140bAe.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            GoodyBagCommonDetail goodyBagCommonDetail2 = goodyBagBaseInfo.commonDetail;
            if (goodyBagCommonDetail2 != null) {
                i = goodyBagCommonDetail2.participateMethod;
            } else {
                i = 0;
            }
            goodyBagShortTouchInitData.participateMethod = i;
            if (goodyBagCommonDetail2 != null && (str2 = goodyBagCommonDetail2.participateMethodContent) != null) {
                str3 = str2;
            }
            goodyBagShortTouchInitData.participateMethodContent = str3;
            GoodyBagCoinDetail goodyBagCoinDetail = goodyBagBaseInfo.coinDetail;
            if (goodyBagCoinDetail != null) {
                i2 = goodyBagCoinDetail.totalCoin;
            } else {
                i2 = 0;
            }
            goodyBagShortTouchInitData.totalCoins = i2;
            if (goodyBagCommonDetail2 != null && (participateThresholdSelected2 = goodyBagCommonDetail2.participateThresholdSelected) != null) {
                i3 = participateThresholdSelected2.type;
            } else {
                i3 = 0;
            }
            goodyBagShortTouchInitData.participateThresholdType = i3;
            if (goodyBagCommonDetail2 != null && (participateThresholdSelected = goodyBagCommonDetail2.participateThresholdSelected) != null) {
                i4 = (int) participateThresholdSelected.value;
            } else {
                i4 = 0;
            }
            goodyBagShortTouchInitData.participateThresholdValue = i4;
            if (goodyBagCommonDetail2 != null) {
                i5 = goodyBagCommonDetail2.winnerHeadcount;
            } else {
                i5 = 0;
            }
            goodyBagShortTouchInitData.winnerHeadCount = i5;
            if (goodyBagCommonDetail2 != null) {
                i6 = goodyBagCommonDetail2.countDownMinutes;
            }
            goodyBagShortTouchInitData.countDownMinutes = i6;
        }
        goodyBagShourTouchModel4FE.timeDiff = C963140bAe.LIZJ() - System.currentTimeMillis();
        goodyBagShortTouchInitData.timeDiff = C963140bAe.LIZLLL;
        arrayList.add(goodyBagShortTouchInitData);
        goodyBagShourTouchModel4FE.goodyBagList = arrayList;
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, goodyBagShourTouchModel4FE);
    }

    public final void LJII(int i, String str, boolean z) {
        GoodyBagCommonDetail goodyBagCommonDetail;
        GoodyBagBaseInfo goodyBagBaseInfo = this.LJIIJ;
        if (goodyBagBaseInfo != null && (goodyBagCommonDetail = goodyBagBaseInfo.commonDetail) != null && !this.LJIILJJIL && goodyBagCommonDetail.participateMethod == 1 && Intrinsics.LJFF(goodyBagCommonDetail.participateMethodContent, str)) {
            LJIJI(z);
            LJIJJ(true);
            LJIIJ(i);
        }
    }

    public final void LJIIIIZZ(AbstractC1095150ebZ abstractC1095150ebZ, long j, int i, boolean z) {
        long j2 = -1;
        if (abstractC1095150ebZ instanceof C1095020ebM) {
            C1095140ebY c1095140ebY = ((C1095020ebM) abstractC1095150ebZ).LIZ;
            if (c1095140ebY != null) {
                j2 = c1095140ebY.LIZ;
            }
        } else {
            C1095140ebY c1095140ebY2 = ((C1095030ebN) abstractC1095150ebZ).LIZ;
            if (c1095140ebY2 != null) {
                j2 = c1095140ebY2.LIZ;
            }
        }
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        boolean z2 = false;
        if (c1095140ebYUw0 != null && c1095140ebYUw0.LJ == 2) {
            z2 = true;
        }
        if (j2 >= j && !z2 && !this.LJIILL) {
            LJIJI(z);
            this.LJIILL = true;
            LJIIJ(i);
        }
    }
}
