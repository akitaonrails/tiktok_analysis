package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0irX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258810irX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C1255780ime c1255780ime, String str) {
        FeedItemList data;
        Map<String, String> map;
        if (c1255780ime != null && (data = c1255780ime.getData()) != null && (map = data.filterReason) != null) {
            if (map.containsValue("content_classification_restricted_mode_parent") || Intrinsics.LJFF(str, "content_classification_restricted_mode_parent")) {
                return "content_classification_restricted_mode_parent";
            }
            if (map.containsValue("content_classification_restricted_mode_self") || Intrinsics.LJFF(str, "content_classification_restricted_mode_self")) {
                return "content_classification_restricted_mode_self";
            }
            if (map.containsValue("content_classification_age_unknown") || Intrinsics.LJFF(str, "content_classification_age_unknown")) {
                return "content_classification_age_unknown";
            }
            if (map.containsValue("content_classification_logout") || Intrinsics.LJFF(str, "content_classification_logout")) {
                return "content_classification_logout";
            }
            return "";
        }
        return str;
    }
}
