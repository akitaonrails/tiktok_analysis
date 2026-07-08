package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* JADX INFO: renamed from: X.0oZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478190oZN {
    public static C1478300oZY LIZ;

    public static C1478300oZY LIZ() {
        C1478300oZY c1478300oZY = LIZ;
        if (c1478300oZY != null) {
            return c1478300oZY;
        }
        return new C1478300oZY(((IVideoPreloadConfigInjectWrapper) InjectedConfigManager.getConfig(IVideoPreloadConfigInjectWrapper.class)).wrap((IVideoPreloadConfig) InjectedConfigManager.getConfig(IVideoPreloadConfig.class)));
    }
}
