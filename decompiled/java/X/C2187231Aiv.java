package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ad.feed.model.AppAdsDetectAppModel;

/* JADX INFO: renamed from: X.1Aiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187231Aiv {
    public static final C01GW LIZ;
    public static AppAdsDetectAppModel LIZIZ;

    static {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C2187241Aiw());
        LIZ = c01gwLIZ;
        AppAdsDetectAppModel appAdsDetectAppModel = null;
        String string = ((Keva) c01gwLIZ.getValue()).getString("app_ads_detect_app_data", null);
        if (string != null && (appAdsDetectAppModel = (AppAdsDetectAppModel) C309390CAv.LIZ(string, AppAdsDetectAppModel.class)) == null) {
            ((Keva) c01gwLIZ.getValue()).erase("app_ads_detect_app_data");
        }
        LIZIZ = appAdsDetectAppModel;
    }
}
