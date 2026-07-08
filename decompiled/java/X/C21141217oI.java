package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141217oI extends C09AY implements Function0<IVMPreviewAdsOfflineService> {
    public C21141217oI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IVMPreviewAdsOfflineService invoke() {
        return ServiceManager.get().getService(IVMPreviewAdsOfflineService.class);
    }
}
