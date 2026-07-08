package X;

import com.ss.android.ugc.aweme.image.experiment.TTIMImageRefreshConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E2Y extends C09AY implements Function0<Boolean> {
    public C1E2Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((TTIMImageRefreshConfig) C1E2X.LIZIZ.getValue()).enablePrivateMediaImageRefresh > 0);
    }
}
