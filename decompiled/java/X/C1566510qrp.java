package X;

import com.ss.android.ugc.aweme.experiment.NUInstantFeedFrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566510qrp extends C09AY implements Function0<Integer> {
    public C1566510qrp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((NUInstantFeedFrequencyConfig) C1566520qrq.LIZIZ.getValue()).singleAwemeTriggerOnce);
    }
}
