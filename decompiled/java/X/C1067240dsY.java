package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker;

/* JADX INFO: renamed from: X.0dsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067240dsY {
    public static String LIZ(GamingAnchorMaker.AnchorExtra anchorExtra, EnumC993060bwu enumC993060bwu, String str) {
        GamingAnchorMaker.AnchorExtra.AttributionRelated attributionRelated;
        String str2;
        String str3;
        if (anchorExtra == null || (attributionRelated = anchorExtra.attributionRelated) == null) {
            return "";
        }
        int i = attributionRelated.linkType;
        if (i != 0 && i != 1) {
            if (i != 3) {
                return "";
            }
            if (enumC993060bwu != EnumC993060bwu.TYPE_CLICK) {
                str3 = "";
            } else {
                str3 = attributionRelated.appsflyerClick;
            }
            if (enumC993060bwu == EnumC993060bwu.TYPE_CLICK_LANDING_PAGE) {
                str3 = attributionRelated.appsflyerClickToLandingPage;
            }
            if (enumC993060bwu == EnumC993060bwu.TYPE_IMPRESSION) {
                str3 = attributionRelated.appsflyerImpression;
            }
            if (str3 == null || str3.length() == 0) {
                return "";
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(str3).buildUpon();
            builderBuildUpon.appendQueryParameter("advertising_id", AnonymousClass1440.LIZJ());
            return builderBuildUpon.build().toString();
        }
        if (enumC993060bwu != EnumC993060bwu.TYPE_CLICK) {
            str2 = "";
        } else {
            str2 = attributionRelated.adjustClick;
        }
        if (enumC993060bwu == EnumC993060bwu.TYPE_CLICK_LANDING_PAGE) {
            str2 = attributionRelated.adjustClickToLandingPage;
        }
        if (enumC993060bwu == EnumC993060bwu.TYPE_IMPRESSION) {
            str2 = attributionRelated.adjustImpression;
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        Uri.Builder builderBuildUpon2 = UriProtector.parse(str2).buildUpon();
        builderBuildUpon2.appendQueryParameter("gps_adid", AnonymousClass1440.LIZJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-item_anchor");
        builderBuildUpon2.appendQueryParameter("campaign", C2188811AlT.LIZIZ(sbLIZ));
        return builderBuildUpon2.build().toString();
    }
}
