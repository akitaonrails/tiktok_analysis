package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.MyMomentsAddLocationFragment;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Map;

/* JADX INFO: renamed from: X.0gpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180880gpq {
    public static final C1180880gpq LIZ = new C1180880gpq();

    public static void LIZLLL(C2344009Gk c2344009Gk) {
        Boolean boolValueOf;
        String str;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJ(contextLIZ));
        } else {
            boolValueOf = null;
        }
        String strLJJIIZI = C1189060h32.LJJIIZI(boolValueOf);
        if (strLJJIIZI == null) {
            strLJJIIZI = "";
        }
        C1200940hMC.LIZ.getClass();
        String str2 = "1";
        if (C1200940hMC.LIZIZ(contextLIZ)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (iLocationBaseServiceForMT == null || !iLocationBaseServiceForMT.LJJIJ()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("inapp_is_precise", str2);
        c2344009Gk.LJFF("system_is_precise", strLJJIIZI);
        c2344009Gk.LJFF("enable_location", str);
    }

    public static void LIZ(Fragment fragment, Integer num, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "main_add_location_icon");
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("current_page", "my_year_campaign_landing_page");
        LJ(fragment, "ttls_my_year_campaign_add_location_click", c2344009Gk.LIZ);
    }

    public static void LJ(Fragment fragment, String str, Map map) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(fragment));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ(str, map, c1185050gwZ);
    }

    public static void LIZIZ(Fragment fragment, Integer num, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("click_module", str2);
        LJ(fragment, "ttls_my_year_campaign_location_add_page_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(MyMomentsAddLocationFragment myMomentsAddLocationFragment, Integer num, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJ(num, "is_poi_publish_new_user");
        LIZLLL(c2344009Gk);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        LJ(myMomentsAddLocationFragment, "ttls_my_year_campaign_location_add_page_enter", c2344009Gk.LIZ);
    }
}
