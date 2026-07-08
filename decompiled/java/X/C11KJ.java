package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IStrictModeService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11KJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KJ extends C09AY implements Function0<IStrictModeService> {
    public C11KJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IStrictModeService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IStrictModeService invoke() {
        return ServiceManager.get().getService(IStrictModeService.class);
    }
}
