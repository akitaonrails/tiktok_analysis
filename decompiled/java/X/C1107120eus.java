package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveLeadsAdsPinCardEnableSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveLeadsAdsPinCardMockSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0eus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107120eus {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        if (!LiveLeadsAdsPinCardEnableSetting.INSTANCE.enable() || (enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ()) == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null) {
            return;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig;
        if (C1107130eut.LIZJ(adLiveEnterRoomConfig != null ? adLiveEnterRoomConfig.isLeadsAdsTraffic : null)) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            SubPinCard subPinCard = C1107150euv.LIZ;
            SubPinCard subPinCardLIZ = C1107150euv.LIZ;
            if (subPinCardLIZ == null && (subPinCardLIZ = C1107130eut.LIZ(room)) == null) {
                return;
            }
            if (C1107150euv.LIZJ(subPinCardLIZ.id)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("leadsAdsPinCard dismissed, cardId=");
                sbLIZ.append(subPinCardLIZ.id);
                C20441214yg.LIZIZ("LiveAdsRoomEntryHandler", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (!roomsData.clickAdsPinCard && !LiveLeadsAdsPinCardMockSetting.INSTANCE.shouldForceClickAdsPinCard()) {
                C20441214yg.LIZIZ("LiveAdsRoomEntryHandler", "scenario 2: only pin card show delegated to PcsSimplePinCardBehavior");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scenario 1: auto-open landing page and still show pin card, schema=");
            sbLIZ2.append(subPinCardLIZ.actionSchema);
            sbLIZ2.append(", type=");
            sbLIZ2.append(subPinCardLIZ.type);
            C20441214yg.LIZIZ("LiveAdsRoomEntryHandler", C2188811AlT.LIZIZ(sbLIZ2));
            String strLJIIIIZZ = subPinCardLIZ.actionSchema;
            int i = subPinCardLIZ.type;
            if (strLJIIIIZZ.length() != 0) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                SubPinCard subPinCardLIZ2 = C1107130eut.LIZ(room2);
                C490590JLt c490590JLt = C490590JLt.LIZ;
                String string = subPinCardLIZ2 != null ? Long.valueOf(subPinCardLIZ2.id).toString() : null;
                c490590JLt.getClass();
                if (i != 3) {
                    if (i != 4) {
                        if (i != 4) {
                            if (i == 4) {
                            }
                        }
                        strLJIIIIZZ = C425101l3.LIZ(strLJIIIIZZ, new C0JMH(this.LIZIZ));
                    } else {
                        strLJIIIIZZ = C490590JLt.LJIIIZ(strLJIIIIZZ, string);
                    }
                    strLJIIIIZZ = C0JMF.LIZ(C0JMF.LIZ, strLJIIIIZZ, room2);
                    strLJIIIIZZ = C425101l3.LIZ(strLJIIIIZZ, new C0JMH(this.LIZIZ));
                } else {
                    strLJIIIIZZ = C490590JLt.LJIIIIZZ(strLJIIIIZZ, null, true);
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZ, strLJIIIIZZ);
            }
        }
    }

    public C1107120eus(Context context, DataChannel dataChannel) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
    }
}
