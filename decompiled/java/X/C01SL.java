package X;

import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01SL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01SL {
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
}
