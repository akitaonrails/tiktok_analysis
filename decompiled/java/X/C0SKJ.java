package X;

import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerCustomizedInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKJ {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C718360SFu c718360SFu) {
        String str;
        String strLJ;
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ = C0SH9.LIZIZ(c718360SFu);
        if (takoBannerCustomizedInfoLIZIZ == null || (str = takoBannerCustomizedInfoLIZIZ.recommendType) == null) {
            str = null;
        }
        String strLIZ = C0SH9.LIZ(c718360SFu);
        BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
        String str2 = c718360SFu.LIZIZ;
        if (str2 == null) {
            strLJ = null;
        } else {
            strLJ = C719550SKj.LIZ(bannerCommonStruct).LJ(str2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (strLJ != null && strLJ.length() != 0) {
            linkedHashMap.put("exit_code", strLJ);
        } else {
            if (C123100dR.LIZ(strLIZ)) {
                linkedHashMap.put("query_recommend", strLIZ);
            }
            if (C123100dR.LIZ(str)) {
                linkedHashMap.put("query_recommend_type", str);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
