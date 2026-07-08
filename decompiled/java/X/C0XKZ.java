package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IPnSSandboxOptApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XKZ extends C09AY implements Function0<Integer> {
    public C0XKZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((IPnSSandboxOptApi) ServiceManager.get().getService(IPnSSandboxOptApi.class)).LJIIJ());
    }
}
