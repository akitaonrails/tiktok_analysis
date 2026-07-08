package X;

import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EC7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EC7 extends C09AY implements Function0<Integer> {
    public C1EC7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((LandInboxExperiment.Meta) LandInboxExperiment.LIZIZ.getValue()).msgTimeFactor);
    }
}
