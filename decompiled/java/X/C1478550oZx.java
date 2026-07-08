package X;

import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478550oZx extends C09AY implements Function0<IPreloaderExperiment> {
    public final /* synthetic */ SimKitConfigImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1478550oZx(SimKitConfigImpl simKitConfigImpl) {
        super(0);
        this.LL = simKitConfigImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPreloaderExperiment invoke() {
        return this.LL.getMVideoPreloaderManagerConfig().getExperiment();
    }
}
