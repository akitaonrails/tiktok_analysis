package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19254310Uj extends C09AY implements Function0<IPluginService> {
    public C19254310Uj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.plugin.IPluginService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPluginService invoke() {
        return ServiceManager.get().getService(IPluginService.class);
    }
}
