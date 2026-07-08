package X;

import Y.AfS67S0201000_15;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS551S0100000_7;
import qo2.w;

/* JADX INFO: renamed from: X.0aPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933910aPV extends AbstractC929850aIx implements InterfaceC929560aIU {
    public final InterfaceC933920aPW LLILLJJLI;
    public final DataChannel LLILLL;
    public ISharedBgAbility LLILZ;
    public Room LLILZLL;
    public final C11NJ LLILZIL = new C11NJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(124));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(123));

    @Override // X.C929710aIj
    public final void LIZIZ() {
        this.LLILZIL.LJ();
    }

    @Override // X.InterfaceC929560aIU
    public final void LIZJ() {
        Long l;
        User user;
        this.LLILLJJLI.dismiss();
        C930480aJy c930480aJy = C930480aJy.LIZ;
        DataChannel dataChannel = this.LLILLL;
        Context context = this.LLILLJJLI.getContext();
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0Iu5
            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
                C20441214yg.LIZIZ("MultiLiveAnchorUserInfoPresenter", "share failed!");
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
                long j;
                User owner;
                Room room;
                User owner2;
                User owner3;
                C20441214yg.LIZIZ("MultiLiveAnchorUserInfoPresenter", "share success!");
                HashMap map = new HashMap();
                C933910aPV c933910aPV = this.LIZ;
                Room room2 = c933910aPV.LLILZLL;
                if (room2 != null) {
                    j = room2.liveSubOnly;
                } else {
                    j = 0;
                }
                map.put("is_sub_only_live", String.valueOf(j));
                Room room3 = c933910aPV.LLILZLL;
                if (room3 != null) {
                    owner = room3.getOwner();
                } else {
                    owner = null;
                }
                if (owner == null || ((room = c933910aPV.LLILZLL) != null && (owner3 = room.getOwner()) != null && !owner3.isAnchorHasSubQualification())) {
                    map.put("is_subscription", "-1");
                } else {
                    Room room4 = c933910aPV.LLILZLL;
                    if (room4 != null && (owner2 = room4.getOwner()) != null && owner2.isSubscribed()) {
                        map.put("is_subscription", "1");
                    } else {
                        map.put("is_subscription", CardStruct.IStatusCode.DEFAULT);
                    }
                }
                HashMap map2 = new HashMap();
                map2.put("user_type", "anchor");
                map2.put("event_page", "guest_connection_panel");
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                map2.putAll(C467820IWe.LIZIZ());
                map2.putAll(map);
                map2.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
                map2.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                map2.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
                C481150Itt.LIZ(new AwS551S0100000_7(map2, (Map<String, String>) 710));
            }
        };
        c930480aJy.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String str = dataChannel != null ? (String) dataChannel.gg0(C760110Trl.class) : null;
            C1106200etO c1106200etO = new C1106200etO(room);
            if (room.getOwner() != null) {
                String str2 = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion() ? "h5_m" : "h5_t";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("www.tiktok.com/@");
                sbLIZ.append(C0KVU.LJ(room.getOwner()));
                sbLIZ.append("/live");
                sbLIZ.append(str2);
                sbLIZ.append("&_r=1");
                c1106200etO.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            c1106200etO.LIZJ = interfaceC500940JkiUser.getCurrentUserId();
            w.LIZ.getClass();
            c1106200etO.LJIJ = w.LJIJI();
            boolean z = (dataChannel == null || (user = (User) dataChannel.gg0(RoomUserChannel.class)) == null || user.getUserAttr() == null || !user.getUserAttr().isAdmin) ? false : true;
            InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
            C19EG c19egLJ = C500260Jjc.LJ(context);
            String anchorShareText = room.getAnchorShareText();
            if (anchorShareText == null) {
                anchorShareText = "";
            }
            c1106200etO.LJIIJJI = anchorShareText;
            c1106200etO.LJIILIIL = C930480aJy.LJIJJ(Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()));
            c1106200etO.LJIILL = z;
            c1106200etO.LJIILLIIL = RedDotExtensionKt.LJIILLIIL(C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING);
            Hashtag hashtag = room.hashtag;
            c1106200etO.LJIIZILJ = (hashtag == null || (l = hashtag.id) == null) ? 0L : l.longValue();
            c1106200etO.LJIJI = str;
            C1106210etP c1106210etP = new C1106210etP(c1106200etO);
            C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
            c481220Iu0.getClass();
            c1106210etP.LIZIZ();
            c481220Iu0.LIZ(c19egLJ, c1106210etP, interfaceC1372610lp5);
            C2478709nV.LIZIZ(context).LIZJ(room.getId(), room.getIdStr());
        }
    }

    public C933910aPV(InterfaceC933920aPW interfaceC933920aPW) {
        this.LLILLJJLI = interfaceC933920aPW;
        this.LLILLL = interfaceC933920aPW.getDataChannel();
    }

    public final void LIZLLL(final int i, final int i2, final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        String strLIZ;
        int i3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        String str;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        if (multiLiveAnchorPanelSettings == null) {
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null || (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) != null) {
            long id = room.getId();
            long jLiveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
            DataChannel dataChannel = this.LLILLL;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = null;
            if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
                ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
                if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                    str = state.LLILZ;
                } else {
                    str = null;
                }
                strLIZ = C936270aTJ.LIZ(str);
            } else {
                strLIZ = null;
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings2 != null) {
                multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings2, 0, 0, 0, 8388607);
            }
            C480460Ism.LIZ().getClass();
            MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
            long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            int i4 = multiLiveAnchorPanelSettings.layoutType;
            int i5 = multiLiveAnchorPanelSettings.fixMicNumAction;
            int i6 = multiLiveAnchorPanelSettings.allowViewerReq;
            int i7 = multiLiveAnchorPanelSettings.onlyAllowFollowerReq;
            int i8 = multiLiveAnchorPanelSettings.LIZ;
            int i9 = multiLiveAnchorPanelSettings.allowRequestFromFriends;
            int i10 = multiLiveAnchorPanelSettings.allowRequestFromFollowers;
            int i11 = multiLiveAnchorPanelSettings.allowRequestFromOthers;
            long j = multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
            int i12 = multiLiveAnchorPanelSettings.enableShowMultiGuestLayout;
            if (C931790aM5.LIZIZ()) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = multiLiveAnchorPanelSettingsLIZ;
            C19487311Lz.LIZIZ(multiLiveApi.updateAnchorPanelSettings(id, jLJIILL, jLiveId, i4, i5, i6, i7, null, strLIZ, i3, i, j, i8, i9, i10, i11, 0, i12, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLILZIL, new C09JN() { // from class: X.0aDB
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("MultiLiveAnchorUserInfoPresenter@6075.updateApplierSetting$1");
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = multiLiveAnchorPanelSettings;
                    if (multiLiveAnchorPanelSettings4.applierSortSetting == i) {
                        ((InterfaceC926280aDC) this.LL).Xg(multiLiveAnchorPanelSettings4, i2);
                    }
                    C924630aAX.LIZ.LJIJI(multiLiveAnchorPanelSettings3, C924810aAp.LJ().LJJIII, "anchor_manage_panel");
                    C1C7U.LIZIZ("MultiLiveAnchorUserInfoPresenter@6075.updateApplierSetting$1");
                }
            }, new AfS67S0201000_15(i, multiLiveAnchorPanelSettings, this, 7), null, null, 56);
        }
    }
}
