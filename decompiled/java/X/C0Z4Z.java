package X;

import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4Z extends C09AY implements Function0<ReceiveMsgPerfTracker> {
    public C0Z4Z() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ReceiveMsgPerfTracker invoke() {
        ?? PluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(ReceiveMsgPerfTracker.class);
        return PluggableSpiForReal == 0 ? new ReceiveMsgPerfTracker() { // from class: X.0Z4h
            @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
            public final void LIZ(int i, int i2, String str) {
            }

            @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
            public final void LIZIZ() {
            }

            @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
            public final void LIZJ(int i, String str) {
            }
        } : PluggableSpiForReal;
    }
}
