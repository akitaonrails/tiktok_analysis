package X;

import com.ss.android.ugc.aweme.lemon.postmode.model.ImageLoadMonitorParams;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0lOP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356070lOP {
    public static final C1356070lOP LIZ = new C1356070lOP();

    public static void LIZ(ImageLoadMonitorParams imageLoadMonitorParams) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("index", String.valueOf(imageLoadMonitorParams.index));
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(imageLoadMonitorParams.status));
        c2344009Gk.LJIIIIZZ("duration", String.valueOf(imageLoadMonitorParams.duration));
        String str = imageLoadMonitorParams.aid;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("aweme_id", str);
        c2344009Gk.LJIIIIZZ("url", imageLoadMonitorParams.url);
        c2344009Gk.LJ(imageLoadMonitorParams.errorCode, "error_code");
        C20684815ws.LJIILLIIL("lemon8_slides_image_load", c2344009Gk.LIZ);
    }
}
