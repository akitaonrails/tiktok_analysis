package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122870fKH extends C09AY implements Function0<Context> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122870fKH(ServiceRoutingDetector serviceRoutingDetector) {
        super(0);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return this.LL.context;
    }
}
