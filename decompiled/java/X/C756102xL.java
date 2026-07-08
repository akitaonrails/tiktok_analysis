package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import java.util.List;

/* JADX INFO: renamed from: X.02xL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C756102xL {
    public static C755502xF LIZ(BillInfoData billInfoData, String str, boolean z, List list, C035M c035m, String str2, boolean z2, int i) {
        boolean z3 = z2;
        String str3 = str2;
        C035M c035m2 = c035m;
        List list2 = list;
        boolean z4 = z;
        String str4 = str;
        C720002rW c720002rWLIZ = null;
        if ((i & 1) != 0) {
            str4 = null;
        }
        if ((i & 2) != 0) {
            z4 = true;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) != 0) {
            c035m2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        C722302rt c722302rtLJFF = C722002rq.LJFF(billInfoData, str4, z4, 0, list2, null, str3, 20);
        if (billInfoData.platformPromotion != null) {
            c720002rWLIZ = C021I.LIZ(billInfoData, 0, false, false, null, 15);
        }
        return new C755502xF(c722302rtLJFF, c720002rWLIZ, c035m2, (Boolean) null, z3, 24);
    }
}
