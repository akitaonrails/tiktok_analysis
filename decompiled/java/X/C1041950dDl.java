package X;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0dDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041950dDl {
    public static final C1041950dDl LIZ = new C1041950dDl();

    public static final void LIZ(Uri uri) {
        if (TextUtils.equals(uri.getHost(), "stickers")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "draw_ad");
            c2344009Gk.LJIIIIZZ("prop_id", uri.getLastPathSegment());
            C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
        }
    }
}
