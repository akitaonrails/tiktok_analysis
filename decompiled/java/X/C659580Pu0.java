package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659580Pu0 {
    public static final C659580Pu0 LIZ = new C659580Pu0();

    public static Map LIZ(Map map) {
        if (Intrinsics.LJFF(map.get("search_type"), "general")) {
            C13DA c13da = new C13DA();
            Object obj = map.get("inner_search_id");
            if (obj != null) {
                c13da.put("inner_search_id", obj);
            }
            Object obj2 = map.get("is_inner");
            if (obj2 != null) {
                c13da.put("is_inner", obj2);
            }
            Object obj3 = map.get("slide_rank");
            if (obj3 != null) {
                c13da.put("slide_rank", obj3);
            }
            Object obj4 = map.get("aweme_type");
            if (obj4 != null) {
                c13da.put("aweme_type", obj4);
            }
            return c13da.build();
        }
        return null;
    }

    public static Map LIZIZ(Aweme aweme, boolean z) {
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams == null) {
            return C2097608Jq.LJ();
        }
        C13DA c13da = new C13DA();
        String str = mobParams.get("inner_search_id");
        if (str != null) {
            c13da.put("inner_search_id", str);
        }
        String str2 = mobParams.get("is_inner");
        if (str2 != null) {
            c13da.put("is_inner", str2);
        }
        if (z) {
            c13da.put("slide_rank", CardStruct.IStatusCode.DEFAULT);
        } else {
            String str3 = mobParams.get("slide_rank");
            if (str3 != null) {
                c13da.put("slide_rank", str3);
            }
        }
        c13da.put("aweme_type", String.valueOf(aweme.getAwemeType()));
        return c13da.build();
    }
}
