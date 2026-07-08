package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBannerCustomizedInfo;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SGU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SGU {
    public static BannerCommonStruct LIZ(Aweme aweme) {
        List<BannerCommonStruct> banners;
        String str;
        BannerCommonKey bannerCommonKey;
        BannerCommonStruct bannerCommonStruct = null;
        if (aweme == null || (banners = aweme.getBanners()) == null) {
            return null;
        }
        Iterator<BannerCommonStruct> it2 = banners.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BannerCommonStruct next = it2.next();
            BannerCommonStruct bannerCommonStruct2 = next;
            if (bannerCommonStruct2 != null && (bannerCommonKey = bannerCommonStruct2.bannerKey) != null) {
                str = bannerCommonKey.componentKey;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "bottom_banner_series_mini_drama")) {
                bannerCommonStruct = next;
                break;
            }
        }
        return bannerCommonStruct;
    }

    public static SeriesBannerCustomizedInfo LIZIZ(Aweme aweme) {
        String str;
        Object c098200Yq;
        BannerCommonStruct bannerCommonStructLIZ = LIZ(aweme);
        Object obj = null;
        if (bannerCommonStructLIZ == null || (str = bannerCommonStructLIZ.customizedInfo) == null) {
            return null;
        }
        try {
            c098200Yq = (SeriesBannerCustomizedInfo) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(str, SeriesBannerCustomizedInfo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (SeriesBannerCustomizedInfo) obj;
    }

    public static String LIZJ(Aweme aweme) {
        BannerCommonUIStruct bannerCommonUIStruct;
        BannerCommonTailAction bannerCommonTailAction;
        List<BannerCommonAction> list;
        BannerCommonAction bannerCommonAction;
        BannerCommonStruct bannerCommonStructLIZ = LIZ(aweme);
        if (bannerCommonStructLIZ != null && (bannerCommonUIStruct = bannerCommonStructLIZ.bannerUIStruct) != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null && (list = bannerCommonTailAction.actions) != null && (bannerCommonAction = (BannerCommonAction) C13LP.LJJJLL(list)) != null) {
            SeriesBannerCustomizedInfo seriesBannerCustomizedInfoLIZIZ = LIZIZ(aweme);
            if (seriesBannerCustomizedInfoLIZIZ != null && seriesBannerCustomizedInfoLIZIZ.isSchemaEncoded()) {
                return Uri.decode(bannerCommonAction.schema);
            }
            return bannerCommonAction.schema;
        }
        return null;
    }
}
