package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingPageNavArg;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingPageVM;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS95S1000000_10;

/* JADX INFO: renamed from: X.0QC1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QC1 {
    public static void LIZ(Fragment fragment, int i, List list, Map map) {
        LIZIZ(fragment, i, list, map, null, null);
    }

    public static void LIZIZ(Fragment fragment, int i, List list, Map map, String str, String str2) {
        Map mapLJ = map;
        if (list != null && (!list.isEmpty()) && fragment != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image_landing_page");
            sbLIZ.append(fragment.hashCode());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ((SearchImageLandingPageVM) new C736950SvV(C13LE.LIZ(SearchImageLandingPageVM.class), new AwS95S1000000_10(strLIZIZ, 1), new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment), AFwS241S0000000_10.get$arr$(276), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment)).getValue()).vQ2(list);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment, "aweme://search/nimble/image_landing");
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            smartRouteBuildRoute.withNavArg(new SearchImageLandingPageNavArg(mapLJ, strLIZIZ, i, null, str2, Boolean.FALSE, Boolean.FALSE, str));
            smartRouteBuildRoute.open();
        }
    }
}
