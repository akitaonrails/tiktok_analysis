package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355680lNm {
    public static final void LIZ(Bundle bundle, C2344009Gk c2344009Gk) {
        String string;
        if (bundle != null && (string = bundle.getString("panel_source_v2")) != null && (!a0.LJJJIL(string))) {
            c2344009Gk.LJFF("panel_source_v2", a0.LJLIIIL(string).toString());
        }
    }

    public static final void LIZIZ(Bundle bundle, String str) {
        if (str != null && !a0.LJJJIL(str)) {
            C786410Ut5.LJJJI("panel_source_v2", a0.LJLIIIL(str).toString(), bundle);
        }
    }

    public static final void LIZJ(Bundle bundle, Aweme aweme) {
        PaidContentInfo paidContentInfo;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
            C786410Ut5.LJJJI("series_category", String.valueOf(paidContentInfo.getCategory()), bundle);
        }
    }
}
