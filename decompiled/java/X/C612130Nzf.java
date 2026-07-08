package X;

import android.content.Context;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612130Nzf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoFavoriteVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612130Nzf(VideoFavoriteVM videoFavoriteVM, String str, String str2, String str3) {
        super(0);
        this.LL = videoFavoriteVM;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme;
        String aid = null;
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService == null) {
            return null;
        }
        Context context = this.LL.getContext();
        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
        VideoItemParams item = this.LL.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        }
        VideoItemParams item2 = this.LL.getItem();
        iFavoriteService.LJIIL(c19egLIZIZ, aid, item2 != null ? item2.mEventType : null, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
