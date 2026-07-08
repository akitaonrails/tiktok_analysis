package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122890fKJ extends C09AY implements Function1<C1883607Zi, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122890fKJ(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1883607Zi c1883607Zi) {
        this.LL.C1(c1883607Zi);
        return Unit.LIZ;
    }
}
