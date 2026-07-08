package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsSmbStateServiceEnableSetting;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.pcs.LivePcsSmbEntranceOpt;
import com.bytedance.android.livesdk.model.message.SMBStateSync;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;

/* JADX INFO: renamed from: X.0eGB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081890eGB {
    public static C1083930eJT LIZ;

    public static void LIZJ(DataChannel dataChannel) {
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unloadServicePlusAnchorToolbarBehavior enter ");
        sbLIZ.append(iMessageManager);
        sbLIZ.append(' ');
        sbLIZ.append(LIZ);
        C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1083930eJT c1083930eJT = LIZ;
        if (c1083930eJT != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("removeMessageListener ");
            sbLIZ2.append(c1083930eJT);
            C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener((OnIMMessageListener) c1083930eJT);
            }
        }
        C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "removeMessageListener null");
        LIZ = null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0eJT] */
    public static void LIZ(final Room room, final DataChannel dataChannel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadServicePlusAnchorToolbarBehavior enter ");
        LivePcsSmbEntranceOpt livePcsSmbEntranceOpt = LivePcsSmbEntranceOpt.INSTANCE;
        sbLIZ.append(livePcsSmbEntranceOpt.getValue());
        C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (!livePcsSmbEntranceOpt.getValue()) {
            LIZIZ(room, dataChannel);
            return;
        }
        C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "tryLoadServicePlusAnchorToolbarBehavior call");
        if (!LIZIZ(room, dataChannel)) {
            C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "tryLoadServicePlusAnchorToolbarBehavior false");
            IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "messageManager not null");
                if (LIZ == null) {
                    C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "messageListener null");
                    LIZ = new OnIMMessageListener() { // from class: X.0eJT
                        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
                        public final String messageListenerBizTag() {
                            return "PcsAnchorServicePlusToolbarHelper";
                        }

                        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
                        public final IMListenerType messageListenerType() {
                            return IMListenerType.SYNC;
                        }

                        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
                        public final void onMessage(IMessage iMessage) {
                            SMBInfo sMBInfo;
                            IPcsService iPcsService;
                            InterfaceC1083970eJX interfaceC1083970eJXUN1;
                            InterfaceC1097310ef3 interfaceC1097310ef3LIZJ;
                            InterfaceC1083960eJW interfaceC1083960eJWLIZJ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onMessage ");
                            sbLIZ2.append(iMessage);
                            C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            if (iMessage instanceof SMBStateSync) {
                                C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "onMessage is SMBStateSync");
                                Room room2 = room;
                                if (room2 == null) {
                                    return;
                                }
                                SMBStateSync sMBStateSync = (SMBStateSync) iMessage;
                                room2.smbInfo = sMBStateSync.smbInfo;
                                dataChannel.zW(RoomChannel.class, room2);
                                DataChannelGlobal.LLILZ.JQ2(C930940aKi.class, room);
                                C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "onMessage updated Room");
                                Room room3 = room;
                                if (LivePcsSmbStateServiceEnableSetting.INSTANCE.getValue() && (sMBInfo = sMBStateSync.smbInfo) != null && (iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class)) != null && (interfaceC1083970eJXUN1 = iPcsService.UN1()) != null && (interfaceC1097310ef3LIZJ = interfaceC1083970eJXUN1.LIZJ()) != null && (interfaceC1083960eJWLIZJ = interfaceC1097310ef3LIZJ.LIZJ(String.valueOf(room3.getId()))) != null) {
                                    interfaceC1083960eJWLIZJ.LIZ(sMBInfo.optInStatus, sMBInfo.activeSkuCount);
                                }
                                SMBInfo sMBInfo2 = room.smbInfo;
                                if (sMBInfo2 != null && sMBInfo2.activeSkuCount != 0) {
                                    C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "onMessage tryLoadServicePlusAnchorToolbarBehavior call");
                                    if (C1081890eGB.LIZIZ(room, dataChannel)) {
                                        C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", "onMessage registerServicePlusPinCardBehaviors");
                                        C781270Ukn.LJIJ().pa().LJI();
                                    }
                                }
                            }
                        }
                    };
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addMessageListener ");
                sbLIZ2.append(LIZ);
                C20441214yg.LIZIZ("PcsAnchorServicePlusToolbarHelper", C2188811AlT.LIZIZ(sbLIZ2));
                iMessageManager.addMessageListener(C001A.S_M_B_STATE_SYNC.getIntType(), (OnIMMessageListener) LIZ);
            }
        }
    }

    public static boolean LIZIZ(Room room, DataChannel dataChannel) {
        if (C1083940eJU.LIZIZ(room)) {
            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).pa();
            C1106960euc.LJFF(dataChannel);
            return true;
        }
        return false;
    }
}
