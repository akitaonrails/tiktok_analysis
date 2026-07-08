package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642340PHk {
    public static final void LIZ(Aweme aweme) {
        HashMap<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
            searchExtraParams.remove("inner_last_consumed");
        }
    }

    public static final boolean LIZIZ(Aweme aweme) {
        String str;
        HashMap<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
            str = searchExtraParams.get("inner_last_consumed");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "true");
    }

    public static final void LIZJ(Aweme aweme) {
        if (aweme != null) {
            AwemeExtKt.appendExtraParamUseInSearch(aweme, "inner_last_consumed", "true");
        }
    }
}
