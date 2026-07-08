package X;

import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.spi.ApiMobNetworkPartner;
import com.ss.android.ugc.aweme.feed.spi.AwemeApiNetworkPartner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.topic.book.IBookTokService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508720pMc extends C09AY implements Function0<List<? extends NetworkPartner>> {
    public C1508720pMc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends NetworkPartner> invoke() {
        NetworkPartner[] networkPartnerArr = new NetworkPartner[6];
        networkPartnerArr[0] = new ApiMobNetworkPartner();
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        networkPartnerArr[1] = iFavoriteService != null ? iFavoriteService.LIZ() : null;
        C1508730pMd.LIZ.getClass();
        INoticeService iNoticeService = C1508730pMd.LIZIZ;
        networkPartnerArr[2] = iNoticeService != null ? iNoticeService.LIZ() : null;
        IBookTokService iBookTokService = (IBookTokService) PluggableExtentionKt.pluggableSpi$default(IBookTokService.class, false, false, false, 14, null);
        networkPartnerArr[3] = iBookTokService != null ? iBookTokService.LIZ() : null;
        ICLACaptionService iCLACaptionService = (ICLACaptionService) PluggableExtentionKt.pluggableSpi$default(ICLACaptionService.class, false, false, false, 14, null);
        networkPartnerArr[4] = iCLACaptionService != null ? iCLACaptionService.LIZ() : null;
        networkPartnerArr[5] = new AwemeApiNetworkPartner();
        return C13LP.LJJJJLI(C1697810uHb.LJIIJJI(networkPartnerArr));
    }
}
