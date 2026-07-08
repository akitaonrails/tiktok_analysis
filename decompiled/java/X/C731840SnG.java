package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731840SnG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoFavoriteAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731840SnG(VideoFavoriteAssem videoFavoriteAssem) {
        super(0);
        this.LL = videoFavoriteAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.Jp("click_fav_button");
        return Unit.LIZ;
    }
}
