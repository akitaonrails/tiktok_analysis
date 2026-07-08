package X;

import com.bytedance.android.commercialize.track.sampling.CommerceEventSamplingConfig;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ddi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260441Ddi extends C09AY implements Function0<List<? extends String>> {
    public C2260441Ddi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return ((CommerceEventSamplingConfig) C2260431Ddh.LIZIZ.getValue()).sampleEvents;
    }
}
