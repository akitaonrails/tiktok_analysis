package X;

import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048090dNf extends C09AY implements Function0<IAppMeasurementProvider> {
    public C1048090dNf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAppMeasurementProvider invoke() {
        return ServiceManager.get().getService(IAppMeasurementProvider.class);
    }
}
