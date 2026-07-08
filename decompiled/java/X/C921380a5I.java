package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;

/* JADX INFO: renamed from: X.0a5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921380a5I {
    public static final C11JL LIZ(MultiGuestReserveReqParams multiGuestReserveReqParams, InterfaceC921410a5L interfaceC921410a5L) {
        C480460Ism.LIZ().getClass();
        return (C11JL) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).reserve(multiGuestReserveReqParams.scene, multiGuestReserveReqParams.appId, multiGuestReserveReqParams.liveId, multiGuestReserveReqParams.fromUserId, multiGuestReserveReqParams.toUserId, multiGuestReserveReqParams.roomId, multiGuestReserveReqParams.type, multiGuestReserveReqParams.autoFollow).LJFF(new C0UO0()).LJJIIZ(new AfS184S0100000_15(interfaceC921410a5L, 116), new AfS184S0100000_15(interfaceC921410a5L, 117));
    }
}
