package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731420Sma extends C09AY implements Function2<VideoFavoriteAssem, C731910SnN, Unit> {
    public final /* synthetic */ VideoFavoriteAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731420Sma(VideoFavoriteAssem videoFavoriteAssem) {
        super(2);
        this.LL = videoFavoriteAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C731910SnN c731910SnN) {
        InteractAreaCommonAbility interactAreaCommonAbility;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C731910SnN c731910SnN2 = c731910SnN;
        videoFavoriteAssem2.Qp(c731910SnN2);
        if (c731910SnN2 != null && c731910SnN2.LIZLLL && (interactAreaCommonAbility = (InteractAreaCommonAbility) videoFavoriteAssem2.LLJLLIL.getValue()) != null) {
            interactAreaCommonAbility.zB1(this.LL);
        }
        return Unit.LIZ;
    }
}
