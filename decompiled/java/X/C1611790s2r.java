package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611790s2r {
    public static final C1611790s2r LIZ = new C1611790s2r();

    public static DramaExtraTrackingParams LIZIZ(Intent intent) {
        String strLIZ;
        C1155320gAc c1155320gAc = DramaExtraTrackingParams.Companion;
        if (intent != null) {
            strLIZ = LIZ(intent, "drama_extra_tracking_params");
        } else {
            strLIZ = null;
        }
        c1155320gAc.getClass();
        return C1155320gAc.LIZ(strLIZ);
    }

    public static boolean LIZJ(Intent intent) {
        Serializable serializableExtra;
        if (intent != null) {
            serializableExtra = intent.getSerializableExtra("anchor_event_map");
        } else {
            serializableExtra = null;
        }
        if ((serializableExtra instanceof HashMap) || (intent != null && intent.getBooleanExtra("is_from_anchor", false))) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("is_from_bottom_banner", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("is_from_drama_component", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("is_from_hot_zone", false)) {
            return false;
        }
        return true;
    }

    public static String LJI(Intent intent) {
        String strLIZ;
        if (intent == null || (strLIZ = LIZ(intent, "source_card")) == null) {
            return "";
        }
        return strLIZ;
    }

    public static int LJIIL(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJIIIZ(Intent intent, long j, String str) {
        String strLIZ;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        if (intent != null) {
            strLIZ = LIZ(intent, "enter_from");
        } else {
            strLIZ = null;
        }
        c1612490s3z.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", strLIZ);
        c2344009Gk.LIZJ(1, "enable_experiment");
        c2344009Gk.LIZLLL(j, "loading_duration");
        c2344009Gk.LJFF("current_page_name", str);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("paid_content_page_loading_ttrc", c2344009Gk.LIZ);
        }
    }

    public static void LJIIJJI(CollectionDetailModel collectionDetailModel, C1576640r8A c1576640r8A, String str) {
        String uid;
        String str2;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c1612490s3z.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("page_name", "series_detail_page");
        c2344009Gk.LIZLLL(collectionDetailModel.collectionId, "collection_id");
        User user = collectionDetailModel.collectionCreator;
        String str3 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJFF("author_id", uid);
        c2344009Gk.LJFF("user_id", curUserId);
        c2344009Gk.LJ(collectionDetailModel.voucherId, "voucher_id");
        if (c1576640r8A != null) {
            str2 = c1576640r8A.LIZIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJFF("collection_price", str2);
        if (c1576640r8A != null) {
            str3 = c1576640r8A.LIZLLL;
        }
        c2344009Gk.LJFF("discount_price", str3);
        c2344009Gk.LJFF("error_code", str);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("claim_voucher_button_click", c2344009Gk.LIZ);
        }
    }

    public static void LJIIIIZZ(String str, String str2, String str3, long j, String str4, String str5, SeriesCategory seriesCategory) {
        String string;
        C1612490s3z.LJI.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("stage", str);
        if (str2 != null) {
            c2344009Gk.LJFF("error_code", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("error_msg", str3);
        }
        c2344009Gk.LIZLLL(j, "collection_id");
        c2344009Gk.LJFF("collection_user_id", str4);
        if (str5 != null) {
            c2344009Gk.LJFF("enter_from", str5);
        }
        if (seriesCategory == null || (string = Integer.valueOf(seriesCategory.ordinal()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("series_category", string);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("collection_create_order", c2344009Gk.LIZ);
        }
    }

    public static void LJIIJ(EnumC1613440s5W enumC1613440s5W, C1613360s5O c1613360s5O, Boolean bool, String str, String str2, Long l, long j) {
        C1612930s4h.LIZIZ.LJ(enumC1613440s5W, c1613360s5O, bool, str, str2, l, j);
    }

    public static void LJII(CollectionDetailModel collectionDetailModel, Intent intent, String str, boolean z, Boolean bool, Integer num, Integer num2, boolean z2, String str2, C1612600s4A c1612600s4A) {
        String strLIZ;
        C1612490s3z c1612490s3z = C1612490s3z.LJI;
        if (intent != null) {
            strLIZ = LIZ(intent, "enter_from");
        } else {
            strLIZ = null;
        }
        C1612490s3z.LJJJJZ(c1612490s3z, "click_video_in_collection", strLIZ, null, null, str, str2, Boolean.valueOf(LIZJ(intent)), null, null, Boolean.valueOf(z), null, null, null, null, num, bool, num2, null, collectionDetailModel, null, null, null, null, null, null, null, z2, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, c1612600s4A, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -269190260, 1073733631);
    }
}
