package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0PkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653560PkI {
    public static void LIZ(String str, String str2, String str3, Aweme aweme) {
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "___search_result_id", str);
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "___list_item_id", str2);
        AwemeExtKt.appendExtraParamUseInSearch(aweme, "___token_type", str3);
    }
}
