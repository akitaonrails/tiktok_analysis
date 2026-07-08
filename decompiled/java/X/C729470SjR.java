package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729470SjR extends C09AY implements Function0<IExternalService> {
    public C729470SjR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IExternalService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IExternalService invoke() {
        return ServiceManager.get().getService(IExternalService.class);
    }
}
