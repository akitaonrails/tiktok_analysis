package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;

/* JADX INFO: renamed from: X.02uU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C738402uU {
    public static C738302uT LIZ(BillInfoData billInfoData, C722902rz c722902rz, C719302rP c719302rP, boolean z, int i) {
        BillStarlingText billStarlingText;
        String str = null;
        if ((i & 1) != 0) {
            c722902rz = null;
        }
        if ((i & 2) != 0) {
            c719302rP = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        BillStarling billStarling = billInfoData.starlingTexts;
        if (billStarling != null && (billStarlingText = billStarling.logisticsModuleText) != null) {
            str = billStarlingText.text;
        }
        return new C738302uT(c722902rz, c719302rP, str, z);
    }
}
