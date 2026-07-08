package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716270S7t extends C09AY implements Function0<IPaidContentVideoHotSwapService> {
    public C716270S7t() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPaidContentVideoHotSwapService invoke() {
        return ServiceManager.get().getService(IPaidContentVideoHotSwapService.class);
    }
}
