package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T4C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4C extends C09AY implements Function0<Integer> {
    public C0T4C() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIILLIIL());
    }
}
