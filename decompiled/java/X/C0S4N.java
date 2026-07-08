package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S4N, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4N {
    public static final C0S4N LIZ = new C0S4N();

    public static boolean LIZ(Aweme aweme, BaseFeedPageParams baseFeedPageParams, boolean z) {
        if (z || baseFeedPageParams == null) {
            return false;
        }
        if (C300940Bqu.LIZ() && Intrinsics.LJFF(baseFeedPageParams.eventType, "homepage_hot") && !C10EU.LJIILLIIL(aweme.getAuthor())) {
            return false;
        }
        if ((((Boolean) C0RZ9.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(baseFeedPageParams.eventType, "homepage_hot")) || aweme.isAd() || ComplianceServiceProvider.LJIL().LJJIJIIJIL() || aweme.getPlaylist_info() == null || baseFeedPageParams.param.isFromDuetModeOrDuetModeDetail()) {
            return false;
        }
        return true;
    }
}
