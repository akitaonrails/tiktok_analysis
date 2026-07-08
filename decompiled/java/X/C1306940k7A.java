package X;

import com.bytedance.android.starship.strategy.IStarshipContainerService;
import com.bytedance.android.starship.strategy.StarshipContainerEmptyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0k7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306940k7A {
    public static final IStarshipContainerService LIZ;

    static {
        IStarshipContainerService starshipContainerEmptyService = (IStarshipContainerService) PluggableExtentionKt.pluggableSpi$default(IStarshipContainerService.class, false, false, false, 14, null);
        if (starshipContainerEmptyService == null) {
            starshipContainerEmptyService = new StarshipContainerEmptyService();
        }
        LIZ = starshipContainerEmptyService;
    }
}
