package X;

import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00UF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UF {
    public static final boolean LIZ(Room room) {
        boolean zLJFF;
        PartnershipInfo partnershipInfo;
        if (room == null) {
            return false;
        }
        PartnershipInfo partnershipInfo2 = room.partnershipInfo;
        if (partnershipInfo2 != null) {
            zLJFF = Intrinsics.LJFF(partnershipInfo2.partnershipRoom, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF && (room == null || (partnershipInfo = room.partnershipInfo) == null || !partnershipInfo.promotingRoom)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Room room) {
        if (C1081990eGL.LIZ("LazyLoadSlotWidget")) {
            if (room != null) {
                CommerceStruct commerceStruct = room.getCommerceStruct();
                if (commerceStruct == null || commerceStruct.commercePermission != 1) {
                    BALinkStruct bALinkStruct = room.getBALinkStruct();
                    if (bALinkStruct != null && bALinkStruct.baLinkPermission == 1) {
                        return true;
                    }
                    BaLeadsGenInfo baLeadsGenInfo = room.baLeadsGenInfo;
                    if (baLeadsGenInfo != null && baLeadsGenInfo.leadsGenPermission) {
                        return true;
                    }
                    PaidContentInfo paidContentInfo = room.paidContentInfo;
                    if ((paidContentInfo != null && paidContentInfo.paidContentPermission) || room.hasTtlsLivePermission) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
