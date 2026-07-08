package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Phv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652090Phv {
    public static final C652090Phv LIZ = new C652090Phv();

    public static boolean LIZJ(Aweme aweme) {
        String str;
        if (Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchFeaturedAnswer")) {
            HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
            if (searchExtraParams != null) {
                str = searchExtraParams.get("token_type");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "tt_enhance_card")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LIZ(Aweme aweme, Map<String, String> map) {
        if (aweme == null) {
            return;
        }
        C0P65 c0p65 = ((C0PYD) C0Q3E.LIZJ(aweme).Y30().LIZJ()).LLILLL;
        if (c0p65 != null) {
            String str = c0p65.LIZ;
            if (str != null && str.length() != 0) {
                map.put("fullscreen_enter_doc_id", str);
            }
            map.put("fullscreen_rank", String.valueOf(c0p65.LIZIZ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current aweme: ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(' ');
            sbLIZ.append(c0p65.LIZ);
            sbLIZ.append(' ');
            sbLIZ.append(c0p65.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
        if (searchExtraParams != null) {
            String str2 = searchExtraParams.get("fullscreen_actual_rank");
            if (str2 != null) {
                map.put("fullscreen_actual_rank", str2);
            }
            String str3 = searchExtraParams.get("fullscreen_actual_enter_doc_id");
            if (str3 != null) {
                map.put("fullscreen_actual_enter_doc_id", str3);
            }
        }
    }

    public static final Map LIZIZ(C2189821An6 c2189821An6, String str) {
        String previousPageWithPlaylistScene;
        String shootEnterFrom = null;
        if (c2189821An6 != null) {
            previousPageWithPlaylistScene = c2189821An6.getPreviousPageWithPlaylistScene();
        } else {
            previousPageWithPlaylistScene = null;
        }
        if (TextUtils.isEmpty(previousPageWithPlaylistScene)) {
            if (c2189821An6 != null) {
                shootEnterFrom = c2189821An6.getShootEnterFrom();
            }
            previousPageWithPlaylistScene = shootEnterFrom;
        }
        C651970Phj.LLILLL.getClass();
        if (!C651980Phk.LIZLLL(str) && !C651980Phk.LIZLLL(previousPageWithPlaylistScene) && !Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "single_song") && !C1ER1.LIZIZ.LLJJL(str)) {
            return new HashMap();
        }
        return new HashMap(C1ER1.LIZIZ.fetchSearchParams(str, previousPageWithPlaylistScene));
    }

    public static final boolean LIZLLL(String str, String str2) {
        if (!TextUtils.equals(str, "general_search")) {
            if (TextUtils.equals(str2, "general_search") && TextUtils.equals(str, "playlist")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJ(String str, String str2) {
        if (!LIZLLL(str, str2) && !TextUtils.equals(str, "search_result") && !TextUtils.equals(str, "visual_search")) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(String str, String str2, String str3) {
        if (!LIZLLL(str2, str3) && !TextUtils.equals(str2, "search_result") && !TextUtils.equals(str2, "visual_search")) {
            return TextUtils.equals(str, "app_outside");
        }
        return false;
    }
}
