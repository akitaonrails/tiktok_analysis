package X;

import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0che, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022040che extends C09AY implements Function0<ICrossPlatformLegacyService> {
    public C1022040che() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ICrossPlatformLegacyService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICrossPlatformLegacyService invoke() {
        return ServiceManager.get().getService(ICrossPlatformLegacyService.class);
    }
}
