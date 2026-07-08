package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INowCaptionService;

/* JADX INFO: renamed from: X.0lId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352490lId implements INowCaptionService {
    public static final C1352490lId LIZIZ = new C1352490lId();
    public final /* synthetic */ INowCaptionService LIZ = (INowCaptionService) ServiceManager.get().getService(INowCaptionService.class);

    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final boolean LIZ(int i) {
        return this.LIZ.LIZ(i);
    }

    @Override // com.ss.android.ugc.aweme.service.INowCaptionService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }
}
