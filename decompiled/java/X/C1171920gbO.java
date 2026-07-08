package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol;

/* JADX INFO: renamed from: X.0gbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171920gbO {
    public static final C1171920gbO LIZ = new C1171920gbO();

    public static void LIZ(C19EG c19eg, boolean z) {
        String str;
        C1171950gbR c1171950gbR = IFavoriteRevisitAppDiffProtocol.LIZ;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("from_scene", "1030");
        smartRouteBuildRoute.withParam("extra_mob_tab_name", "music");
        if (z) {
            str = "click_song_first_toast";
        } else {
            str = "click_song_toast";
        }
        smartRouteBuildRoute.withParam("favorite_auto_landing_method", str);
        c1171950gbR.getClass();
        C1171950gbR.LIZ().LJFF();
        smartRouteBuildRoute.open();
    }
}
