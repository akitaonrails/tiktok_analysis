package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591620rWK extends C09AY implements Function0<C0J9A> {
    public C1591620rWK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0J9A invoke() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
    }
}
