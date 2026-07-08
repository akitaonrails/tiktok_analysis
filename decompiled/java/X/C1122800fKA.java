package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fKA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122800fKA extends C09AY implements Function0<C1122680fJy> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122800fKA(ServiceRoutingDetector serviceRoutingDetector) {
        super(0);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1122680fJy invoke() {
        ServiceRoutingDetector serviceRoutingDetector = this.LL;
        return new C1122680fJy(serviceRoutingDetector.LLJJIII, serviceRoutingDetector.dataChannel, new C1122870fKH(serviceRoutingDetector));
    }
}
