package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0lok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372400lok {
    public static DialogC1372820lpQ LIZ(Fragment fragment, Context context, Aweme aweme, String str) {
        boolean zIsAdTraffic;
        boolean z;
        int i;
        String uniqueId;
        boolean z2;
        C1379170lzf c1379170lzf = new C1379170lzf(aweme, str, null, null, context, fragment, null, null, null, null, null, null, null, null, null, false, 262080);
        if (aweme != null) {
            Bundle bundle = c1379170lzf.LLJILJILJ.extras;
            C735280Sso.LIZ.getClass();
            if (C735280Sso.LJIIIIZZ(aweme)) {
                i = 3;
            } else if (C735280Sso.LIZJ(aweme)) {
                i = 2;
            } else {
                User author = aweme.getAuthor();
                if (author != null && author.isSecret()) {
                    i = 1;
                } else {
                    i = -1;
                }
            }
            bundle.putInt("share_im_limit_tip_type", i);
            Bundle bundle2 = c1379170lzf.LLJILJILJ.extras;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                uniqueId = author2.getUniqueId();
            } else {
                uniqueId = null;
            }
            C786410Ut5.LJJJI("author_user_name", uniqueId, bundle2);
            Bundle bundle3 = c1379170lzf.LLJILJILJ.extras;
            if (aweme.getAwemeType() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bundle3.putBoolean("is_video_only", z2);
        }
        Bundle bundle4 = c1379170lzf.LLJILJILJ.extras;
        if (aweme != null) {
            zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
        } else {
            zIsAdTraffic = false;
        }
        bundle4.putBoolean("is_ad", zIsAdTraffic);
        C1381010m2d.LIZ.getClass();
        C1365840leA c1365840leA = C1365840leA.LIZ;
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        if (aweme != null && !C1365840leA.LIZ(aweme) && !zLIZJ && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            z = true;
        } else {
            z = false;
        }
        return new DialogC1372820lpQ(context, new C1372830lpR(z, null, null, null, null, 62), c1379170lzf, 0.5f);
    }
}
