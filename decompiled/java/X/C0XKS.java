package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XKS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKS extends C09AY implements Function0<Integer> {
    public C0XKS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((IPnSSandboxOptApi) ServiceManager.get().getService(IPnSSandboxOptApi.class)).LIZLLL());
    }
}
