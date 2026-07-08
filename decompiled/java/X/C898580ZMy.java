package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898580ZMy {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Map map) {
        if (!Intrinsics.LJFF(map.get("ref_video_state"), "available") && !Intrinsics.LJFF(map.get("ref_attachment_state"), "available") && !Intrinsics.LJFF(map.get("feed_video_status_flag"), CardStruct.IStatusCode.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(String str, Map map) {
        Object obj = map.get("aweme_id");
        Object obj2 = map.get("author_id");
        Object obj3 = str;
        if (obj2 != null) {
            obj3 = obj2;
        }
        if (obj != null && obj3 != null && LIZ(map)) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("story_click", C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("enter_method", "video_cover"), new Pair("group_id", obj), new Pair("author_id", obj3)));
        }
    }

    public static void LIZJ(String str, Map map) {
        Object obj = map.get("aweme_id");
        Object obj2 = map.get("author_id");
        Object obj3 = str;
        if (obj2 != null) {
            obj3 = obj2;
        }
        if (obj != null && obj3 != null && LIZ(map)) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("story_show", C2097608Jq.LJIIJ(new Pair("enter_from", "chat"), new Pair("enter_method", "video_cover"), new Pair("group_id", obj), new Pair("author_id", obj3)));
        }
    }
}
