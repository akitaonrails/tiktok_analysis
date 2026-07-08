package com.bytedance.android.live.rank.impl.list.controller;

import X.C01GW;
import X.C0IJT;
import X.C0IXW;
import X.C1119070fE9;
import X.C1119080fEA;
import X.C1119090fEB;
import X.C1119100fEC;
import X.C1161920gLG;
import X.C1790680whO;
import X.C1790720whS;
import X.C1790730whT;
import X.C1790870whh;
import X.C1810220xCu;
import X.C1810340xD6;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C1810700xDg;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C760380TsC;
import X.C784440Upu;
import X.CountDownTimerC1811820xFU;
import X.EnumC1811400xEo;
import X.EnumC495990Jcj;
import X.InterfaceC1790880whi;
import X.InterfaceC1846850y9z;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseLongArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.rank.impl.list.controller.base.IBaseController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import qo2.w;

/* JADX INFO: loaded from: classes28.dex */
public class RankRootController extends IBaseController {
    public final Fragment LLILLJJLI;
    public final C1810340xD6 LLILLL;
    public InterfaceC1790880whi LLILZ;
    public CountDownTimerC1811820xFU LLILZLL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 89));
    public final C1790720whS LLIZ = new C1790720whS(this);

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final int LJ() {
        View view;
        Fragment fragment = this.LLILLJJLI;
        return (int) C497740JfY.LJJI((fragment == null || (view = fragment.getView()) == null) ? C760380TsC.LIZ(this.LLILLJJLI, LJFF().LLILLJJLI) : view.getHeight());
    }

    public RankRootViewModel LJFF() {
        return (RankRootViewModel) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public RankRootViewModel LIZ() {
        return LJFF();
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZIZ(C1790730whT c1790730whT) {
        String str;
        InterfaceC1846850y9z interfaceC1846850y9z;
        InterfaceC1846850y9z interfaceC1846850y9z2;
        InterfaceC1846850y9z interfaceC1846850y9z3;
        Uri uriLJJJZ;
        InterfaceC1846850y9z interfaceC1846850y9z4;
        Object obj;
        long ownerUserId;
        String str2;
        Room room;
        String str3 = "1";
        if (c1790730whT.LIZ.LIZ == EnumC1811400xEo.E_COMMERCE) {
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLJJLI);
            C1810410xDD c1810410xDD = c1790730whT.LIZ;
            boolean z = LJFF().LLILLL;
            LJFF();
            c1810690xDf.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_sale_rank_rule_click");
            c474500IjALIZ.LJIL();
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(obj, "is_self");
            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
            c474500IjALIZ.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD.LIZIZ.type, false)), "author_rank");
            if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "author_id");
            if (c1810410xDD.LJ) {
                str2 = "last";
            } else {
                str2 = "this";
            }
            c474500IjALIZ.LJJII(str2, "rank_period");
            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
            c474500IjALIZ.LJJII("live", "page_name");
            c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ.LIZ();
        }
        if (TextUtils.isEmpty(c1790730whT.LIZIZ)) {
            return;
        }
        String strValueOf = String.valueOf((int) C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.am1)));
        if (u.LJJIIJZLJL(c1790730whT.LIZIZ, "aweme://roma_redirect", false)) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI.getContext(), C500260Jjc.LJJJZ(UriProtector.parse(c1790730whT.LIZIZ), "radius", strValueOf).buildUpon().appendQueryParameter("height", String.valueOf(LJ())).build());
            return;
        }
        Uri uri = UriProtector.parse(c1790730whT.LIZIZ);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return;
        }
        boolean z2 = LJFF().LLILLJJLI;
        Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
        if (!z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        builderBuildUpon.appendQueryParameter("landscape", str).appendQueryParameter("height", String.valueOf(LJ()));
        if (!z2) {
            builderBuildUpon.appendQueryParameter("trait_mode", "dark");
        }
        builderBuildUpon.appendQueryParameter("from_rank_type", String.valueOf(c1790730whT.LIZ.LIZIZ.type));
        if (Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, RankTypeV2.LJIIL)) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LLILLJJLI);
            if (dataChannelLJ2 == null || (interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannelLJ2.gg0(C1119080fEA.class)) == null || !interfaceC1846850y9z4.LJIIIIZZ()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            builderBuildUpon.appendQueryParameter("show_sticker", str3);
        } else if (Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, RankTypeV2.LIZ)) {
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this.LLILLJJLI);
            if (dataChannelLJ3 == null || (interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannelLJ3.gg0(C1119100fEC.class)) == null || !interfaceC1846850y9z3.LJIIIIZZ()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            builderBuildUpon.appendQueryParameter("show_sticker", str3);
        } else if (Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, RankTypeV2.LJIL)) {
            DataChannel dataChannelLJ4 = C475510Ikn.LJ(this.LLILLJJLI);
            if (dataChannelLJ4 == null || (interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannelLJ4.gg0(C1119070fE9.class)) == null || !interfaceC1846850y9z2.LJIIIIZZ()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            builderBuildUpon.appendQueryParameter("show_sticker", str3);
        } else if (Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, RankTypeV2.LJIILJJIL)) {
            DataChannel dataChannelLJ5 = C475510Ikn.LJ(this.LLILLJJLI);
            if (dataChannelLJ5 == null || (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannelLJ5.gg0(C1119090fEB.class)) == null || !interfaceC1846850y9z.LJIIIIZZ()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            builderBuildUpon.appendQueryParameter("show_sticker", str3);
        }
        Uri uriLJJL = C500260Jjc.LJJL(uri, "url", builderBuildUpon.toString());
        if (LJFF().isOffline()) {
            uriLJJJZ = C500260Jjc.LJJL(C500260Jjc.LJJL(uriLJJL, "radius", CardStruct.IStatusCode.DEFAULT), "show_mask", CardStruct.IStatusCode.DEFAULT);
        } else {
            uriLJJJZ = C500260Jjc.LJJJZ(uriLJJL, "radius", strValueOf);
        }
        C760380TsC.LIZIZ(uriLJJJZ, this.LLILLJJLI, z2);
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public final void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            C760380TsC.LIZIZ(UriProtector.parse(str), this.LLILLJJLI, LJFF().LLILLJJLI);
        }
    }

    public void LJI(C1810340xD6 c1810340xD6) {
        FragmentManager fragmentManager;
        RankListDialog rankListDialogLIZ;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLJJLI);
        if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null && (rankListDialogLIZ = C1810220xCu.LIZ(c1810340xD6, this.LLILLJJLI, true, false, "room_entrance_click")) != null) {
            rankListDialogLIZ.show(fragmentManager, "RankHistoryDialog");
        }
    }

    public RankRootController(Fragment fragment, C1810340xD6 c1810340xD6) {
        this.LLILLJJLI = fragment;
        this.LLILLL = c1810340xD6;
    }

    public final void LJII(Context context, C1790870whh c1790870whh) {
        RankListV2Response.PathToOtherList pathToOtherList;
        String str;
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra;
        RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra2;
        if (context != null) {
            InterfaceC1790880whi interfaceC1790880whi = this.LLILZ;
            if (interfaceC1790880whi != null) {
                interfaceC1790880whi.dismiss();
            }
            String str2 = null;
            if (c1790870whh != null && (classActivityBannerExtra2 = c1790870whh.LIZJ) != null) {
                str2 = classActivityBannerExtra2.schema;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (c1790870whh != null && (classActivityBannerExtra = c1790870whh.LIZJ) != null) {
                    str = classActivityBannerExtra.schema;
                    if (str == null) {
                    }
                }
                str = "";
            } else {
                if (c1790870whh != null && (pathToOtherList = c1790870whh.LIZIZ) != null) {
                    str = pathToOtherList.schema;
                    if (str == null) {
                    }
                }
                str = "";
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            w.LIZ.getClass();
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL()).build());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r16, X.C1790680whO r17) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.controller.RankRootController.LJIIIIZZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo, X.0whO):void");
    }

    @Override // com.bytedance.android.live.rank.impl.list.controller.base.IBaseController
    public void LIZJ(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankView rankView, C1810410xDD c1810410xDD) {
        long id;
        long j;
        User user;
        List<RankListV2Response.RankInfo> list = rankView.ranks;
        RankListV2Response.RankInfo rankInfo2 = rankView.ownerRank;
        if (rankInfo2 != null && (user = rankInfo2.user) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        RankListV2Response.RankInfo rankInfo3 = rankView.ownerRank;
        if (rankInfo3 != null) {
            j = rankInfo3.rank;
        } else {
            j = 0;
        }
        LJIIIIZZ(rankInfo, new C1790680whO(c1810410xDD, null, list, id, j, false, false));
    }

    public final void LJIIIZ(boolean z, RankListV2Response.RankInfo rankInfo, boolean z2, String str) {
        String str2;
        String str3;
        EnumC495990Jcj enumC495990Jcj;
        UserProfileEvent userProfileEvent = new UserProfileEvent(rankInfo.user);
        userProfileEvent.mReportType = "report_anchor";
        userProfileEvent.enigmaEnterFrom = "active_user_rank";
        userProfileEvent.roomId = rankInfo.roomId;
        userProfileEvent.mSource = str;
        userProfileEvent.battleEnable = z2;
        userProfileEvent.currentHasMultiCoHostPermission = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12();
        boolean z3 = false;
        userProfileEvent.linkInRoomEnable = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_user_position", str);
        linkedHashMap.put("click_anchor_rank", String.valueOf(rankInfo.rank));
        if (rankInfo.roomId > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_live", str2);
        if (z) {
            str3 = "last";
        } else {
            str3 = "this";
        }
        linkedHashMap.put("rank_period", str3);
        userProfileEvent.mRankInfo = linkedHashMap;
        userProfileEvent.setEnterFromRankList(Boolean.TRUE);
        int iHashCode = str.hashCode();
        if (iHashCode == -1822897862 ? !str.equals("hourly_rank") : !(iHashCode == -1502499542 ? str.equals("weekly_rank") : !(iHashCode != 1527058066 || !str.equals("daily_rank")))) {
            str = "others_rank";
        }
        userProfileEvent.clickModule = str;
        userProfileEvent.setFromLiveModule("ranking_icon");
        if (rankInfo.roomId > 0) {
            z3 = true;
        }
        if (LJFF().LLILLL && z3) {
            enumC495990Jcj = EnumC495990Jcj.OPEN_LIVING_CREATOR_PROFILE_FROM_SCENE_RANKING;
        } else {
            enumC495990Jcj = EnumC495990Jcj.OPEN_PROFILE_FROM_SCENE_CREATOR_RANKING;
        }
        userProfileEvent.mScene = enumC495990Jcj.ordinal();
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }
}
