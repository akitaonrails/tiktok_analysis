package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bo6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987600bo6 extends C09AY implements Function0<IVMPreviewAdsOfflineService> {
    public C987600bo6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IVMPreviewAdsOfflineService invoke() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ();
    }
}
