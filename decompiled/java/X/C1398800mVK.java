package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;

/* JADX INFO: renamed from: X.0mVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398800mVK implements InterfaceC1456340o08<IWaterMarkService> {
    public IWaterMarkService LL;

    @Override // X.InterfaceC1456340o08
    public final IWaterMarkService get() {
        if (this.LL == null) {
            this.LL = (IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class);
        }
        return this.LL;
    }
}
