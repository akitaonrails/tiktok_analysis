package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024890cmF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(AwemeRawAd awemeRawAd, boolean z, boolean z2, String str, boolean z3) {
        int i;
        String packageName;
        String str2;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("auto_show", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "app_url");
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "download_type");
        if (!z2) {
            i2 = 2;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "minicard_type");
        c1022820ciuLIZLLL.LIZIZ("gp_card", "appstore_type");
        if (awemeRawAd != null) {
            packageName = awemeRawAd.getPackageName();
        } else {
            packageName = null;
        }
        c1022820ciuLIZLLL.LIZIZ(packageName, "package_name");
        if (z3) {
            str2 = "panel_blocked";
        } else {
            str2 = "load_fail";
        }
        c1022820ciuLIZLLL.LIZIZ(str2, "fail_reason");
        c1022820ciuLIZLLL.LJII();
    }

    public static void LIZ(boolean z, AwemeRawAd awemeRawAd, String str, boolean z2, boolean z3, String str2) {
        String str3;
        int i;
        int i2;
        int i3;
        if (awemeRawAd == null) {
            return;
        }
        if (z) {
            str3 = "gp_card";
        } else {
            str3 = "gp_store";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "deeplink_success", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("minicard", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "app_url");
        int i4 = 1;
        if (z2) {
            i = 1;
        } else {
            i = 2;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "download_type");
        if (z3) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "minicard_type");
        c1022820ciuLIZLLL.LIZIZ(str3, "appstore_type");
        c1022820ciuLIZLLL.LIZIZ(awemeRawAd.getPackageName(), "package_name");
        c1022820ciuLIZLLL.LJII();
        if (Intrinsics.LJFF(str2, "is_auto_showed") || Intrinsics.LJFF(str2, "is_showed_after_video_completed")) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
            c1022820ciuLIZLLL2.LIZJ("auto_show", "refer");
            c1022820ciuLIZLLL2.LIZIZ(str, "app_url");
            if (z2) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i3), "download_type");
            if (!z3) {
                i4 = 2;
            }
            c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i4), "minicard_type");
            c1022820ciuLIZLLL2.LIZIZ(str3, "appstore_type");
            c1022820ciuLIZLLL2.LIZIZ(awemeRawAd.getPackageName(), "package_name");
            c1022820ciuLIZLLL2.LJII();
        }
    }
}
