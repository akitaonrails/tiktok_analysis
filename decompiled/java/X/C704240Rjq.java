package X;

import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Rjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704240Rjq {
    public static final List<C699770Rcd> LIZ(List<BannerCommonStruct> list) {
        BannerCommonKey bannerCommonKey;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (BannerCommonStruct bannerCommonStruct : list) {
            if (bannerCommonStruct != null && (bannerCommonKey = bannerCommonStruct.bannerKey) != null) {
                String str = bannerCommonKey.componentKey;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new C699770Rcd(str));
            }
        }
        return arrayList;
    }
}
