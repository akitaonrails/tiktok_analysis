package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService;

/* JADX INFO: renamed from: X.0s4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612950s4j implements IMiniDramaFavoriteGuideService {
    public static final C1612950s4j LIZIZ = new C1612950s4j();
    public final /* synthetic */ IMiniDramaFavoriteGuideService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final String LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final CharSequence LIZJ(Context context) {
        return this.LIZ.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final C1389910mGz LJFF(C19EG c19eg, Aweme aweme, String str) {
        return this.LIZ.LJFF(c19eg, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LJI(long j, boolean z) {
        this.LIZ.LJI(j, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFavoriteGuideService
    public final void LJII(Context context, String str) {
        this.LIZ.LJII(context, "paid_series_detail_page");
    }

    public C1612950s4j() {
        IMiniDramaFavoriteGuideService iMiniDramaFavoriteGuideService = (IMiniDramaFavoriteGuideService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaFavoriteGuideService.class, false, false, false, 14, null);
        if (iMiniDramaFavoriteGuideService != null) {
            this.LIZ = iMiniDramaFavoriteGuideService;
        } else {
            "no implement IMiniDramaFavoriteGuideService".toString();
            throw new IllegalStateException("no implement IMiniDramaFavoriteGuideService");
        }
    }
}
