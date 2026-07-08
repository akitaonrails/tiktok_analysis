package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;

/* JADX INFO: renamed from: X.0rLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584950rLZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(FeedSkylightContainerViewModel feedSkylightContainerViewModel) {
        if (feedSkylightContainerViewModel.xQ2()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightDisplayUtil", "checkAndHideSkylightList closes skylight automatically");
            FeedSkylightContainerViewModel.AQ2(feedSkylightContainerViewModel, false, "auto", false, false, false, null, 60);
        }
        if (feedSkylightContainerViewModel.vQ2()) {
            feedSkylightContainerViewModel.zQ2(false, true);
        }
        feedSkylightContainerViewModel.BQ2(false);
    }

    public static boolean LIZIZ(int i) {
        if (i != 0) {
            if (i != 1 && i == 2) {
                C1596130rdb.LIZ.getClass();
                if (C1596130rdb.LJ(2) <= 0) {
                    int iLJI = C1596130rdb.LJI(2);
                    SettingsManager.LIZLLL().getClass();
                    if (iLJI < SettingsManager.LJ("story_skylight_unread_expand_threshold", 1)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        C1596130rdb.LIZ.getClass();
        if (C1596130rdb.LJ(0) <= 0) {
            int iLJI2 = C1596130rdb.LJI(0);
            SettingsManager.LIZLLL().getClass();
            if (iLJI2 < SettingsManager.LJ("story_skylight_unread_expand_threshold", 1)) {
                return false;
            }
        }
        if (!C1589640rT8.LIZIZ.h2()) {
            return true;
        }
        return false;
    }
}
