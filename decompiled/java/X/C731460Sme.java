package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731460Sme extends C09AY implements Function0<IRootAbility> {
    public final /* synthetic */ VideoFavoriteAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C731460Sme(VideoFavoriteAssem videoFavoriteAssem) {
        super(0);
        this.LL = videoFavoriteAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.IRootAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IRootAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IRootAbility.class, null);
    }
}
