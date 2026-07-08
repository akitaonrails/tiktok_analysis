package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerCustomizedInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0SH9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SH9 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C718360SFu c718360SFu) {
        BannerCommonUIStruct bannerCommonUIStruct;
        BannerCommonTailAction bannerCommonTailAction;
        List<BannerCommonAction> list;
        BannerCommonAction bannerCommonAction;
        BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
        if (bannerCommonStruct != null && (bannerCommonUIStruct = bannerCommonStruct.bannerUIStruct) != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null && (list = bannerCommonTailAction.actions) != null && (bannerCommonAction = (BannerCommonAction) C13LP.LJJJLL(list)) != null) {
            return bannerCommonAction.text;
        }
        return null;
    }

    public static TakoBannerCustomizedInfo LIZIZ(C718360SFu c718360SFu) {
        String str;
        try {
            BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
            if (bannerCommonStruct != null && (str = bannerCommonStruct.customizedInfo) != null) {
                return (TakoBannerCustomizedInfo) C597040NbK.LIZ().LJII(str, TakoBannerCustomizedInfo.class);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("TakoBottomBanner");
            return null;
        }
    }
}
