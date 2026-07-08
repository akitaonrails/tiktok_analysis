package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;

/* JADX INFO: renamed from: X.0OF0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OF0 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        String contentDiffType;
        String contentDiffType2;
        if (aweme != null) {
            contentDiffType = AwemeBizExtKt.getContentDiffType(aweme);
        } else {
            contentDiffType = null;
        }
        if (contentDiffType == null || TextUtils.isEmpty(AwemeBizExtKt.getContentDiffType(aweme)) || (contentDiffType2 = AwemeBizExtKt.getContentDiffType(aweme)) == null) {
            return "unknown";
        }
        return contentDiffType2;
    }

    public static final void LIZIZ(Aweme aweme, String str) {
        if (C299770Bp1.LIZ() > 0 && aweme != null) {
            AwemeBizExtKt.setContentDiffType(aweme, str);
        }
    }
}
