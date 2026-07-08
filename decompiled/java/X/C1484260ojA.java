package X;

import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collections;

/* JADX INFO: renamed from: X.0ojA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1484260ojA {
    public static final PreloadStrategyConfig LIZ;

    static {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        LIZ = preloadStrategyConfig;
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
    }
}
