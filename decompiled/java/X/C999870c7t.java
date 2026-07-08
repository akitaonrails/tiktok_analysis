package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999870c7t {
    public static final /* synthetic */ int LIZ = 0;

    public static n LIZ(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String strJ3;
        n nVarLIZ = C999590c7R.LIZ(context, aweme);
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            JSONObject frontendData = awemeRawAd.getFrontendData();
            String str = null;
            if (frontendData != null) {
                strJ3 = C786410Ut5.J3(frontendData);
            } else {
                strJ3 = null;
            }
            nVarLIZ.LJJIIJ("cardData", strJ3);
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig != null) {
                str = nativeSiteConfig.lynxScheme;
            }
            nVarLIZ.LJJIIJ("lynxSchema", str);
        }
        nVarLIZ.LJJIII(1, "isCardState");
        return nVarLIZ;
    }
}
