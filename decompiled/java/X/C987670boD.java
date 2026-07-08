package X;

import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987670boD extends C09AY implements Function0<ICommercializeAdService> {
    public C987670boD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommercializeAdService invoke() {
        return ServiceManager.get().getService(ICommercializeAdService.class);
    }
}
