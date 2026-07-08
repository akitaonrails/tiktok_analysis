package X;

import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855510XhF {
    public static final C855510XhF LIZ = new C855510XhF();

    public static boolean LIZIZ() {
        List<Integer> listLJJIL;
        if (!C0L44.LIZ()) {
            return false;
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null && (listLJJIL = iECommerceAnchorService.LJJIL()) != null) {
            IAnchorListService iAnchorListService = (IAnchorListService) PluggableExtentionKt.pluggableSpi$default(IAnchorListService.class, false, false, false, 14, null);
            if (Intrinsics.LJFF(iAnchorListService != null ? Boolean.valueOf(iAnchorListService.containAnchors(listLJJIL)) : null, Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }
}
