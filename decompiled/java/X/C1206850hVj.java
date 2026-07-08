package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206850hVj extends C09AY implements Function0<IAwemeService> {
    public C1206850hVj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.awemeservice.api.IAwemeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAwemeService invoke() {
        return ServiceManager.get().getService(IAwemeService.class);
    }
}
