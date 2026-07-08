package X;

import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0s1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610960s1W implements ISocialAffinityService {
    public static final C1610960s1W LIZIZ = new C1610960s1W();
    public final /* synthetic */ ISocialAffinityService LIZ = (ISocialAffinityService) ServiceManager.get().getService(ISocialAffinityService.class);

    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final void LIZ(InterfaceC2204408kM interfaceC2204408kM) {
        this.LIZ.LIZ(interfaceC2204408kM);
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final Map<String, SocialAffinityItem> LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService
    public final boolean isReady() {
        return this.LIZ.isReady();
    }
}
