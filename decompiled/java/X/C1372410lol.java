package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.model.ShareSettings;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.SharePlatformConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372410lol {
    public static final C1372410lol LIZ = new C1372410lol();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final C01GW LJI;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(590));
        LIZIZ = c01gwLIZIZ;
        LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(593));
        LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(591));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_photo_share_guide_show_not_click_times_");
        sbLIZ.append((String) c01gwLIZIZ.getValue());
        LJ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("keva_photo_share_guide_start_date_day_");
        sbLIZ2.append((String) c01gwLIZIZ.getValue());
        LJFF = C2188811AlT.LIZIZ(sbLIZ2);
        LJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(592));
    }

    public static Keva LIZIZ() {
        return (Keva) LJI.getValue();
    }

    public static int LIZ(InterfaceC1369790lkX interfaceC1369790lkX) {
        SharePlatformConfig sharePlatformConfig;
        List<SharePlatform> list;
        SharePlatform next;
        ShareSettings shareSettings = C313130CPf.LIZIZ().LLILLL;
        if (shareSettings != null && (sharePlatformConfig = shareSettings.sharePhotoDownloadPlatforms) != null && (list = sharePlatformConfig.platforms) != null) {
            Iterator<SharePlatform> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(interfaceC1369790lkX.key(), next.platformId)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SharePlatform sharePlatform = next;
            if (sharePlatform != null) {
                return sharePlatform.photoShareMode;
            }
            return 1;
        }
        return 1;
    }

    public static void LIZJ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("unshow_reason", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        C20684815ws.LJIILLIIL("recall_photo_downloaded_share_window_show", c2344009Gk.LIZ);
    }
}
