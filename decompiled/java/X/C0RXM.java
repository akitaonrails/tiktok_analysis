package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import java.util.Set;

/* JADX INFO: renamed from: X.0RXM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXM {
    public static final C0RXM LIZ = new C0RXM();
    public static final Set<String> LIZIZ;

    static {
        Set<String> setLJ = C093Y.LJ("bottom_tag_container_series_purchase_label", "bottom_tag_container_ad_label", "bottom_tag_container_paid_partnership_label", "bottom_tag_container_label_featured", "bottom_tag_container_bottom_label_aigc", "bottom_tag_container_bottom_label_ad_aigc", "bottom_tag_container_bottom_label_poi_alliance", "bottom_tag_container_anole_label_slot");
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 8, null);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJIL();
        }
        LIZIZ = setLJ;
    }
}
