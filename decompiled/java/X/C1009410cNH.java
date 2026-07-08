package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleJumpModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;

/* JADX INFO: renamed from: X.0cNH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009410cNH {
    public static final void LIZ(Context context, String str, AnoleProductModel anoleProductModel, AnoleAdCardModel anoleAdCardModel, AwemeRawAd awemeRawAd) {
        AnoleJumpModel jumpData;
        String webUrl;
        long jLongValue;
        long jLongValue2;
        NativeSiteConfig nativeSiteConfig;
        if (context == null || (jumpData = anoleProductModel.getJumpData()) == null) {
            return;
        }
        String openUrl = jumpData.getOpenUrl();
        String nativeSiteCustomData = jumpData.getNativeSiteCustomData();
        if (nativeSiteCustomData != null && nativeSiteCustomData.length() != 0) {
            if (anoleAdCardModel != null && (nativeSiteConfig = anoleAdCardModel.getNativeSiteConfig()) != null) {
                webUrl = nativeSiteConfig.lynxScheme;
            } else {
                webUrl = null;
            }
        } else {
            webUrl = jumpData.getWebUrl();
        }
        C1027580cqa c1027580cqa = new C1027580cqa();
        c1027580cqa.LJJIII(openUrl);
        c1027580cqa.LJJII(true);
        c1027580cqa.LJ(awemeRawAd);
        c1027580cqa.LJJIJL("draw_ad");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draw_ad_");
        sbLIZ.append(str);
        c1027580cqa.LJJIJ(C2188811AlT.LIZIZ(sbLIZ));
        Long adId = awemeRawAd.getAdId();
        long jLongValue3 = 0;
        if (adId != null) {
            jLongValue = adId.longValue();
        } else {
            jLongValue = 0;
        }
        c1027580cqa.LIZ(jLongValue);
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId != null) {
            jLongValue2 = creativeId.longValue();
        } else {
            jLongValue2 = 0;
        }
        c1027580cqa.LJI(jLongValue2);
        c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            jLongValue3 = groupId.longValue();
        }
        c1027580cqa.LJIILIIL(jLongValue3);
        if (C1027410cqJ.LIZLLL(context, c1027580cqa.LIZ).LIZ()) {
            return;
        }
        c1027580cqa.LJJJIL(webUrl);
        c1027580cqa.LJJJ(anoleProductModel.getDescription());
        c1027580cqa.LIZ.LIZIZ.LJJIZ = true;
        c1027580cqa.LJIJ(awemeRawAd.getWebviewType());
        c1027580cqa.LJIILLIIL(1);
        String nativeSiteCustomData2 = jumpData.getNativeSiteCustomData();
        if (nativeSiteCustomData2 == null) {
            nativeSiteCustomData2 = "";
        }
        c1027580cqa.LJJIFFI(nativeSiteCustomData2);
        C1027410cqJ.LIZ(context, c1027580cqa.LIZ).LIZ();
    }
}
