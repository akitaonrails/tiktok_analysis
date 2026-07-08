package X;

import com.bytedance.android.commercialize.track.sampling.CommerceEventSamplingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ddj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260451Ddj extends C09AY implements Function0<Integer> {
    public C2260451Ddj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((CommerceEventSamplingConfig) C2260431Ddh.LIZIZ.getValue()).sampleMethod);
    }
}
