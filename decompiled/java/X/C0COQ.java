package X;

import com.ss.android.ugc.aweme.feed.experiment.SingleSurfaceViewPage;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0COQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COQ {
    public static final SingleSurfaceViewPage LIZ = (SingleSurfaceViewPage) C0C64.LJIILLIIL().LJJII(SingleSurfaceViewPage.class, null, "page_surface_enable_single_surface_view", true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6075));

    public static final boolean LIZ(String str) {
        SingleSurfaceViewPage singleSurfaceViewPage;
        Set<String> set;
        if (str != null && str.length() != 0 && ((Boolean) LIZIZ.getValue()).booleanValue() && C0COR.LIZ(str) && (singleSurfaceViewPage = LIZ) != null && (set = singleSurfaceViewPage.pages) != null && set.contains(str)) {
            return true;
        }
        return false;
    }
}
