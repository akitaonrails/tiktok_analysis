package X;

import com.ss.android.ugc.aweme.experiment.InstantFeedFrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ng3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599970Ng3 extends C09AY implements Function0<Integer> {
    public C599970Ng3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((InstantFeedFrequencyConfig) C599990Ng5.LIZIZ.getValue()).time);
    }
}
