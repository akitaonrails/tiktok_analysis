package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129340fUi {
    public static final EnumC1129620fVA LIZ(C1129400fUo c1129400fUo) {
        if (Intrinsics.LJFF(c1129400fUo.LJI, "collect_page")) {
            return EnumC1129620fVA.LL;
        }
        if (Intrinsics.LJFF(c1129400fUo.LJI, "gift_detail_page")) {
            return EnumC1129620fVA.LLILLJJLI;
        }
        if (Intrinsics.LJFF(c1129400fUo.LJI, "gift_hub")) {
            return EnumC1129620fVA.LLILLL;
        }
        if (!C1533950q1J.LJ(c1129400fUo.LJIILLIIL) && !Intrinsics.LJFF(c1129400fUo.LJI, "pin_card")) {
            return EnumC1129620fVA.LLILZIL;
        }
        return EnumC1129620fVA.LLILZ;
    }

    public static final User LIZIZ(C1129400fUo c1129400fUo) {
        int iOrdinal = LIZ(c1129400fUo).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null) {
                        return room.getOwner();
                    }
                    return null;
                }
                throw new C1954807lC();
            }
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null) {
                return room2.getOwner();
            }
            return null;
        }
        return C1125800fP0.LIZJ();
    }
}
