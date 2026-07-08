package X;

import com.bytedance.android.commercialize.track.sampling.CommerceEventSamplingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ddg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260421Ddg extends C09AY implements Function0<Integer> {
    public C2260421Ddg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf((int) (((CommerceEventSamplingConfig) C2260431Ddh.LIZIZ.getValue()).sampleRate * ((double) 10000)));
    }
}
