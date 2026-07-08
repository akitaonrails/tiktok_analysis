package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorTerminateCoHostEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921360a5G implements InterfaceC921430a5N {
    public final DataChannel LIZ;
    public C11JL LIZIZ;

    public C921360a5G(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC921430a5N
    public final void LIZ(ListByTypeResponse.ReservedUser reservedUser) {
        String str;
        String str2;
        C20441214yg.LIZIZ("ReserveCardClickListener", "onAcceptIconClick");
        User user = reservedUser.user;
        if (user != null) {
            long id = user.getId();
            C927240aEk c927240aEk = new C927240aEk("anchorMgrV", "inviteInRoomBtn");
            c927240aEk.LJ = String.valueOf(id);
            c927240aEk.LIZ();
        }
        DataChannel dataChannel = this.LIZ;
        User user2 = reservedUser.user;
        if (Intrinsics.LJFF(C920830a4P.LJFF, "appointment_guide")) {
            str = "appointment_guide";
        } else {
            str = "panel_Golive";
        }
        if (Intrinsics.LJFF(C920830a4P.LJFF, "appointment_guide")) {
            str2 = "appointment_guide_invite";
        } else {
            str2 = "panel_Golive_invite";
        }
        C919670a2X c919670a2X = new C919670a2X(4, user2, str, str2);
        c919670a2X.LJFF = -1;
        if (dataChannel != null) {
            dataChannel.LC0(LinkInRoomAnchorInviteGuestEvent.class, c919670a2X);
        }
    }

    @Override // X.InterfaceC921430a5N
    public final void LIZIZ(final ListByTypeResponse.ReservedUser reservedUser) {
        Room room;
        long id;
        long id2;
        User owner;
        C20441214yg.LIZIZ("ReserveCardClickListener", "onWaitIconClick");
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        MultiGuestReserveReqParams multiGuestReserveReqParams = new MultiGuestReserveReqParams();
        multiGuestReserveReqParams.scene = 2;
        multiGuestReserveReqParams.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        multiGuestReserveReqParams.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        long id3 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        multiGuestReserveReqParams.fromUserId = id;
        User user = reservedUser.user;
        if (user != null) {
            id2 = user.getId();
        } else {
            id2 = 0;
        }
        multiGuestReserveReqParams.toUserId = id2;
        if (room != null) {
            id3 = room.getId();
        }
        multiGuestReserveReqParams.roomId = id3;
        multiGuestReserveReqParams.type = 3;
        this.LIZIZ = C921380a5I.LIZ(multiGuestReserveReqParams, new InterfaceC921410a5L() { // from class: X.0a5H
            @Override // X.InterfaceC921410a5L
            public final void LIZ(MultiGuestReserveResponse.ResponseData responseData) {
                long id4;
                AudienceReserveUserInfo audienceReserveUserInfo;
                C11JL c11jl = this.LIZ.LIZIZ;
                if (c11jl != null) {
                    c11jl.dispose();
                }
                User user2 = reservedUser.user;
                long j = 0;
                if (user2 != null) {
                    id4 = user2.getId();
                } else {
                    id4 = 0;
                }
                if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
                    j = audienceReserveUserInfo.reserveId;
                }
                HashMap map = new HashMap();
                map.put("from_user_id", String.valueOf(id4));
                Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room2 != null) {
                    map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                    map.put("room_id", room2.getIdStr());
                }
                map.put("reservation_id", String.valueOf(j));
                map.put("reservation_type", "multi_guest");
                C0KX4.LIZ("livesdk_connection_reservation_response", map, null, true);
            }

            @Override // X.InterfaceC921410a5L
            public final void onFailed(Throwable th) {
                C11JL c11jl = this.LIZ.LIZIZ;
                if (c11jl != null) {
                    c11jl.dispose();
                }
            }
        });
    }

    @Override // X.InterfaceC921430a5N
    public final void LIZJ(ListByTypeResponse.ReservedUser reservedUser) {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C956910b0b.class, reservedUser);
            C915980Zwa.LJI().LIZ().LLIIIZ();
            User user = reservedUser.user;
            if (user != null) {
                long id = user.getId();
                C927240aEk c927240aEk = new C927240aEk("anchorMgrV", "inviteInRoomBtn");
                c927240aEk.LJ = String.valueOf(id);
                c927240aEk.LIZ();
            }
            dataChannel.LC0(MultiGuestAnchorTerminateCoHostEvent.class, new ARunnableS115S0100000_15(dataChannel, 110));
        }
    }
}
