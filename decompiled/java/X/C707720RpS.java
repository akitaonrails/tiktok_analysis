package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707720RpS {
    public static final String LIZ(Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        Uri uri = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uri.getHost(), "flex_panel")) {
            return str;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null) {
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
            c2344009Gk.LJIIIIZZ("enter_method", "feed_component");
            c2344009Gk.LJIIIIZZ("component_key", str3);
            c2344009Gk.LJIIIIZZ("component_type", str4);
            c2344009Gk.LJFF("enter_from", str2);
        }
        return uri.buildUpon().appendQueryParameter("track_params", C309390CAv.LIZIZ(c2344009Gk.LIZ)).appendQueryParameter("biz_params", str5).build().toString();
    }
}
