package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ydv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1865410ydv {
    public static final void LIZ(String str, Function0<String> function0) {
        IComplianceDebugService iComplianceDebugService = (IComplianceDebugService) PluggableExtentionKt.pluggableSpi$default(IComplianceDebugService.class, false, false, false, 14, null);
        if (iComplianceDebugService != null) {
            function0.invoke();
            iComplianceDebugService.LIZIZ();
        }
    }
}
