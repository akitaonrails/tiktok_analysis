package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IStoryDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718020SEm extends C09AY implements Function0<IStoryDebugService> {
    public C718020SEm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IStoryDebugService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStoryDebugService invoke() {
        return ServiceManager.get().getService(IStoryDebugService.class);
    }
}
