package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612580s48 extends C09AY implements Function0<ISeriesLimitedFreeService> {
    public C1612580s48() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ISeriesLimitedFreeService invoke() {
        return C1411310mpV.LIZ(ServiceManager.get(), ISeriesLimitedFreeService.class);
    }
}
