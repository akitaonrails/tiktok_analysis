package X;

import com.ss.android.ugc.aweme.cache.FollowingCacheConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588830rRp extends C09AY implements Function0<FollowingCacheConfigModel> {
    public C1588830rRp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.cache.FollowingCacheConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FollowingCacheConfigModel invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FollowingCacheConfigModel followingCacheConfigModel = C1588820rRo.LIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "following_feed_cache_config", 31744, FollowingCacheConfigModel.class, followingCacheConfigModel, 2);
        return LJJIIJ != 0 ? LJJIIJ : followingCacheConfigModel;
    }
}
