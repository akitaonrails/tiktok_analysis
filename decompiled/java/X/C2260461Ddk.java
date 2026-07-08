package X;

import com.bytedance.android.commercialize.track.sampling.CommerceEventSamplingConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ddk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260461Ddk extends C09AY implements Function0<CommerceEventSamplingConfig> {
    public C2260461Ddk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.commercialize.track.sampling.CommerceEventSamplingConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final CommerceEventSamplingConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CommerceEventSamplingConfig commerceEventSamplingConfig = C2260431Ddh.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(CommerceEventSamplingConfig.class, commerceEventSamplingConfig, "commerce_event_sampling", true);
        return LJJII != 0 ? LJJII : commerceEventSamplingConfig;
    }
}
