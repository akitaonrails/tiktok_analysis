package X;

import com.bytedance.pumbaa.audit.api.OpenAuditService;
import com.bytedance.pumbaa.audit.api.OpenAuditServiceEmptyStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Wxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840270Wxl {
    public static volatile OpenAuditService LIZIZ;
    public static final /* synthetic */ C840270Wxl LIZ = new C840270Wxl();
    public static final OpenAuditServiceEmptyStub LIZJ = new OpenAuditServiceEmptyStub();

    public final OpenAuditService LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        synchronized (this) {
            try {
                if (LIZIZ != null) {
                    return LIZIZ;
                }
                OpenAuditService openAuditService = (OpenAuditService) ServiceManager.get().getService(OpenAuditService.class);
                if (openAuditService == null) {
                    openAuditService = LIZJ;
                }
                LIZIZ = openAuditService;
                return LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
