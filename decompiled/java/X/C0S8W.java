package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S8W, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S8W extends C09AY implements Function0<IPaidContentVideoHotSwapService> {
    public C0S8W() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPaidContentVideoHotSwapService invoke() {
        return ServiceManager.get().getService(IPaidContentVideoHotSwapService.class);
    }
}
