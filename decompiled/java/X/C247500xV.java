package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorListCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.00xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C247500xV {
    public static final int LIZ(boolean z, Room room) {
        String eSVersion;
        if (z || !LiveGiftAnchorListCacheSetting.INSTANCE.enable() || room == null) {
            return 0;
        }
        long id = room.getId();
        boolean z2 = !C1128450fTH.LJJIJIIJIL();
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService != null) {
            eSVersion = iGiftService.getESVersion();
        } else {
            eSVersion = null;
        }
        if (C096800Yc.LIZ(new C096600Ya(id, z2, eSVersion), C158B.LIZJ()) == null) {
            return 0;
        }
        return 1;
    }
}
