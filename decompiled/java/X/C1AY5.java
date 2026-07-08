package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AY5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AY5 extends C09AY implements Function0<InterfaceC969870bLV> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AY5(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC969870bLV invoke() {
        LiveStreamMixer liveStreamMixerLJLLJ = this.LL.LJLLJ();
        if (liveStreamMixerLJLLJ != null) {
            return liveStreamMixerLJLLJ.getPlayerInfoProvider();
        }
        return null;
    }
}
