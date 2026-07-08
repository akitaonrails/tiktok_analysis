package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708500Rqi extends C09AY implements Function0<IDeclarationService> {
    public C708500Rqi() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.jvm.functions.Function0
    public final IDeclarationService invoke() {
        ?? r1;
        try {
            IDeclarationService iDeclarationService = (IDeclarationService) PluggableExtentionKt.pluggableSpi$default(IDeclarationService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(iDeclarationService);
            r1 = iDeclarationService;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r1 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r1)) {
            return null;
        }
        return r1;
    }
}
