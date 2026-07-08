package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0KTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518190KTx {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z, Room room) {
        User owner;
        IFansClubService iFansClubService;
        User owner2;
        IFansClubService iFansClubService2;
        if (z) {
            if (room != null && (owner2 = room.getOwner()) != null && owner2.fansClubInfo != null && (iFansClubService2 = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)) != null && iFansClubService2.oS0()) {
                return true;
            }
            return false;
        }
        if (room != null && (owner = room.getOwner()) != null && owner.fansClubInfo != null && (iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)) != null && iFansClubService.TL0()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(boolean z, Room room) {
        User owner;
        User.FansClubInfo fansClubInfo;
        if (z) {
            return false;
        }
        C1095140ebY c1095140ebYUw0 = null;
        if (room != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        if (iFansClubService != null) {
            c1095140ebYUw0 = iFansClubService.uw0();
        }
        if (c1095140ebYUw0 == null) {
            if (owner == null || (fansClubInfo = owner.fansClubInfo) == null || fansClubInfo.fansLevel <= 0) {
                return false;
            }
            return true;
        }
        if (c1095140ebYUw0.LIZ <= 0) {
            return false;
        }
        return true;
    }
}
