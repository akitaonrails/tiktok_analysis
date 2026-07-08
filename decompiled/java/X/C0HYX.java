package X;

import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYX extends C09AY implements Function0<IPopSuiteManagerService> {
    public C0HYX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IPopSuiteManagerService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPopSuiteManagerService invoke() {
        return ServiceManager.get().getService(IPopSuiteManagerService.class);
    }
}
