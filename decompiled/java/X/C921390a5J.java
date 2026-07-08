package X;

import Y.AcS35S0301000_15;
import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0a5J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921390a5J {
    public static final C921390a5J LIZ = new C921390a5J();

    public static void LIZIZ(Context context, Room room, C11NJ c11nj, InterfaceC921410a5L interfaceC921410a5L) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131841113);
        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131841112));
        c782110Um9.LJIILIIL(2131841111, new AcS35S0301000_15(room, c11nj, interfaceC921410a5L, 1));
        c782110Um9.LJIIJ(2131841164, new InterfaceC743640TFa() { // from class: X.0a5K
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LIZ(int i, boolean z, Room room, C11NJ c11nj, InterfaceC921410a5L interfaceC921410a5L) {
        long id;
        User owner;
        MultiGuestReserveReqParams multiGuestReserveReqParams = new MultiGuestReserveReqParams();
        multiGuestReserveReqParams.scene = 2;
        multiGuestReserveReqParams.appId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId();
        multiGuestReserveReqParams.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
        LIZ.getClass();
        multiGuestReserveReqParams.fromUserId = UserService.getInstance().user().getCurrentUserId();
        long id2 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        multiGuestReserveReqParams.toUserId = id;
        if (room != null) {
            id2 = room.getId();
        }
        multiGuestReserveReqParams.roomId = id2;
        multiGuestReserveReqParams.type = i;
        multiGuestReserveReqParams.autoFollow = z;
        c11nj.LIZ(C921380a5I.LIZ(multiGuestReserveReqParams, interfaceC921410a5L));
    }
}
