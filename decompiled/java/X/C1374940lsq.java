package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: renamed from: X.0lsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374940lsq {
    public static final C1374940lsq LIZ = new C1374940lsq();

    public static void LIZ(int i, int i2, Aweme aweme, String str, String str2, String str3) {
        String imprId;
        if (aweme.getAwemeType() != 150 && aweme.getAwemeType() != 152) {
            String strLIZIZ = C0XJW.LIZIZ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", str);
            String aid = aweme.getAid();
            String str4 = "";
            if (aid == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("aweme_id", aid);
            c2344009Gk.LIZJ(i, "button_show_type");
            c2344009Gk.LIZJ(i2, "watermark_type");
            LogPbBean logPbBean = aweme.getLogPbBean();
            if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                str4 = imprId;
            }
            c2344009Gk.LJIIIIZZ("aweme_logid", str4);
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            c2344009Gk.LJIIIIZZ("download_method,", str2);
            c2344009Gk.LJIIIIZZ("btm,", strLIZIZ);
            C20684815ws.LJIILLIIL("ug_download_url_error", c2344009Gk.LIZ);
        }
    }
}
