package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731920SnO extends C09AY implements Function1<C731530Sml, C731530Sml> {
    public final /* synthetic */ VideoFavoriteVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731920SnO(VideoFavoriteVM videoFavoriteVM) {
        super(1);
        this.LL = videoFavoriteVM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final C731530Sml invoke(C731530Sml c731530Sml) {
        C731910SnN c731910SnNLIZ;
        C731530Sml c731530Sml2 = c731530Sml;
        C731910SnN c731910SnN = ((C731530Sml) this.LL.getState()).LL;
        if (c731910SnN != null) {
            c731910SnNLIZ = C731910SnN.LIZ(c731910SnN, this.LL.getForceTextShow());
        } else {
            c731910SnNLIZ = null;
        }
        return C731530Sml.LIZ(c731530Sml2, c731910SnNLIZ, null, null, null, null, null, null, 126);
    }
}
