package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor;

import X.C01GW;
import X.C0IJT;
import X.C0UTD;
import X.C1161920gLG;
import X.C1388190mED;
import X.C307001Gy;
import X.C474500IjA;
import X.C500260Jjc;
import X.C782140UmC;
import X.C786410Ut5;
import X.C916490ZxP;
import X.C917520Zz4;
import X.C924810aAp;
import X.C925150aBN;
import X.C925600aC6;
import X.C925810aCR;
import X.C926520aDa;
import X.C927600aFK;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.EnumC918970a1P;
import X.InterfaceC777420Uea;
import X.InterfaceC925800aCQ;
import X.InterfaceC928000aFy;
import Y.AObserverS179S0200000_15;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class FansRequiredInterceptor implements InterfaceC928000aFy {
    public InterfaceC777420Uea LIZ;
    public MultiGuestFollowAndApplyDialog LIZIZ;

    @Override // X.InterfaceC928000aFy
    public final boolean LIZ(final C0UTD c0utd, boolean z) {
        Room room;
        InterfaceC777420Uea interfaceC777420Uea;
        LifecycleOwner lifecycleOwner;
        Context context = c0utd.LIZ;
        final DataChannel dataChannel = c0utd.LIZIZ;
        ComponentCallbacks2 componentCallbacks2LIZ = null;
        if (C925150aBN.LJJIII()) {
            if (c0utd.LJFF == 101 || !C925150aBN.LJJJJIZL()) {
                return false;
            }
        } else if (c0utd.LJFF != 101) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925150aBN.LJFF();
            if (!C925150aBN.LJJIZ(multiLiveAnchorPanelSettingsLJFF) || !C925150aBN.LJJIJIIJIL(multiLiveAnchorPanelSettingsLJFF) || dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || C925150aBN.LJIJI(room) || !C925150aBN.LJJIJIIJI()) {
                return false;
            }
        } else {
            return false;
        }
        if (!z) {
            MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener onFollowRequestListener = new MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor$interceptor$1
                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                }

                @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener
                public final void L2(boolean z2) {
                    int followStatus;
                    String strLIZIZ;
                    Room roomLJJLIIIIJ;
                    User owner;
                    FollowInfo followInfo;
                    if (z2) {
                        c0utd.LJFF = 101;
                        DataChannel dataChannel2 = dataChannel;
                        if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                            followStatus = (int) followInfo.getFollowStatus();
                        } else {
                            followStatus = 0;
                        }
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                        int i = C924810aAp.LJ().LJJII;
                        HashMap map = new HashMap();
                        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
                        InterfaceC925800aCQ interfaceC925800aCQLIZIZ = C925810aCR.LIZIZ();
                        map.put("anchor_relationship", String.valueOf(followStatus));
                        if (interfaceC925800aCQLIZIZ != null) {
                            strLIZIZ = interfaceC925800aCQLIZIZ.LIZIZ();
                        } else {
                            strLIZIZ = "";
                        }
                        if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null && !deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZIZ().isEmpty()) {
                            map.put("request_page", deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZIZ());
                        } else if (interfaceC925800aCQLIZIZ != null && !TextUtils.isEmpty(strLIZIZ)) {
                            map.put("request_page", strLIZIZ);
                        } else if (!TextUtils.isEmpty(C925600aC6.LIZ)) {
                            map.put("request_page", C925600aC6.LIZ);
                        }
                        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
                        if (multiGuestDataHolderLIZJ != null) {
                            map.put("guest_permission", multiGuestDataHolderLIZJ.LJIILJJIL());
                        }
                        map.put("connected_guest_cnt", String.valueOf(i));
                        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
                        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_click_follow_and_apply");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJIILJJIL("live_take_detail");
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LIZ();
                        C0UTD c0utd2 = c0utd;
                        c0utd2.LIZJ.invoke(Integer.valueOf(c0utd2.LJ));
                        FansRequiredInterceptor fansRequiredInterceptor = this;
                        DataChannel dataChannel3 = dataChannel;
                        fansRequiredInterceptor.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
                        linkedHashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                        linkedHashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                        linkedHashMap.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                        if (iInteractService.vp0()) {
                            if (iInteractService.xw0().equals(LiveCenterMockToolSwitch.PUNISH)) {
                                linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
                            } else {
                                linkedHashMap.put("match_status", "pk_phase");
                            }
                            linkedHashMap.putAll(iInteractService.getMatchLogParams());
                        }
                        linkedHashMap.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("follow");
                        c474500IjALIZ2.LJJII("live_audience_c_anchor", "request_page");
                        c474500IjALIZ2.LJJII("guest_connection_apply_auto", "click_user_position");
                        c474500IjALIZ2.LJJIIZI(linkedHashMap);
                        c474500IjALIZ2.LJIJJLI(dataChannel3);
                        c474500IjALIZ2.LJIIJJI("live_interact");
                        c474500IjALIZ2.LJIILJJIL("live_room");
                        c474500IjALIZ2.LJIILL("core");
                        c474500IjALIZ2.LIZ();
                    } else {
                        c0utd.LJFF = 102;
                    }
                    MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog = this.LIZIZ;
                    if (multiGuestFollowAndApplyDialog != null && multiGuestFollowAndApplyDialog.isShowing()) {
                        multiGuestFollowAndApplyDialog.dismiss();
                    }
                }
            };
            MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog = new MultiGuestFollowAndApplyDialog();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "OnLinkMicBuiltListener", onFollowRequestListener);
            multiGuestFollowAndApplyDialog.setArguments(bundle);
            multiGuestFollowAndApplyDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 6));
            this.LIZIZ = multiGuestFollowAndApplyDialog;
            if (dataChannel != null && (interfaceC777420Uea = (InterfaceC777420Uea) dataChannel.gg0(C782140UmC.class)) != null) {
                this.LIZ = interfaceC777420Uea;
                if (context != null) {
                    componentCallbacks2LIZ = C1388190mED.LIZ(context);
                }
                if ((componentCallbacks2LIZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) != null) {
                    interfaceC777420Uea.UO0(LSPassThroughRecordSizeConfig.DEFAULT);
                    interfaceC777420Uea.addToShow(LSPassThroughRecordSizeConfig.DEFAULT, lifecycleOwner, new AObserverS179S0200000_15(this, dataChannel, 0));
                }
            }
        }
        return true;
    }
}
