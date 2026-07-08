package X;

import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EC6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EC6 extends C09AY implements Function0<Integer> {
    public C1EC6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((LandInboxExperiment.Meta) LandInboxExperiment.LIZIZ.getValue()).landCountFactor);
    }
}
