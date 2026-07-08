package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519160pdS extends C09AY implements Function0<PNSWebContainerService> {
    public C1519160pdS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PNSWebContainerService invoke() {
        return ServiceManager.get().getService(PNSWebContainerService.class);
    }
}
