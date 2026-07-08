package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fKD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122830fKD extends C09AY implements Function0<Float> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122830fKD(ServiceRoutingDetector serviceRoutingDetector) {
        super(0);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        C1122620fJs c1122620fJs = this.LL.LLJJIJIL;
        return Float.valueOf(c1122620fJs != null ? c1122620fJs.LJ : 0.0f);
    }
}
