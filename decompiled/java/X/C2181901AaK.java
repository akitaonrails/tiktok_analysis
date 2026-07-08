package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayerConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181901AaK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C972840bQI LL;
    public final /* synthetic */ LinkMicLayoutLayer LLILLJJLI;
    public final /* synthetic */ LinkMicLayoutLayerConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181901AaK(C972840bQI c972840bQI, LinkMicLayoutLayer linkMicLayoutLayer, LinkMicLayoutLayerConfig linkMicLayoutLayerConfig) {
        super(0);
        this.LL = c972840bQI;
        this.LLILLJJLI = linkMicLayoutLayer;
        this.LLILLL = linkMicLayoutLayerConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C972840bQI c972840bQI = this.LL;
        LinkMicLayoutQosMonitor linkMicLayoutQosMonitor = c972840bQI.LLILLL;
        if (linkMicLayoutQosMonitor != null) {
            linkMicLayoutQosMonitor.close();
        }
        c972840bQI.LLILLL = null;
        LinkMicLayoutLayer linkMicLayoutLayer = this.LLILLJJLI;
        if (linkMicLayoutLayer != null) {
            linkMicLayoutLayer.close();
        }
        LinkMicLayoutLayerConfig linkMicLayoutLayerConfig = this.LLILLL;
        if (linkMicLayoutLayerConfig != null) {
            linkMicLayoutLayerConfig.close();
        }
        return Unit.LIZ;
    }
}
