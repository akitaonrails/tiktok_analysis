package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204290hRb extends C09AY implements Function0<View> {
    public final /* synthetic */ VideoFavoriteAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204290hRb(VideoFavoriteAssem videoFavoriteAssem) {
        super(0);
        this.LL = videoFavoriteAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        AbstractC1591090rVT abstractC1591090rVTY01;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null || (abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19egLIZ).y01()) == null) {
            return null;
        }
        return abstractC1591090rVTY01.LJIJI("USER");
    }
}
