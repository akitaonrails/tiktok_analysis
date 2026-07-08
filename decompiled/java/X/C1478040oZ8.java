package X;

import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* JADX INFO: renamed from: X.0oZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478040oZ8 {
    public IPlayerExperiment LIZ;
    public ISimPlayerConfig LIZIZ;

    public final ISimPlayerConfig LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = ((ISimPlayerConfigInjectWrapper) InjectedConfigManager.getConfig(ISimPlayerConfigInjectWrapper.class)).wrap((ISimPlayerConfig) InjectedConfigManager.getConfig(ISimPlayerConfig.class));
        }
        return this.LIZIZ;
    }

    public final IPlayerExperiment LIZIZ() {
        IPlayerExperiment iPlayerExperiment = this.LIZ;
        return iPlayerExperiment == null ? (IPlayerExperiment) InjectedConfigManager.getConfig(IPlayerExperiment.class) : iPlayerExperiment;
    }
}
