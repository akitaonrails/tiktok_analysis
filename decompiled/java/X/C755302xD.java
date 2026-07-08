package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import java.util.List;

/* JADX INFO: renamed from: X.02xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755302xD {
    public static final C755202xC LIZ(UserTrustModule userTrustModule, ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText) {
        List<UserTrustItem> list = userTrustModule.userTrustItems;
        if (list != null && !list.isEmpty()) {
            return new C755202xC(userTrustModule.userTrustItems, null, exposeUserRightPanel, str, billStarlingText, 62);
        }
        return null;
    }
}
