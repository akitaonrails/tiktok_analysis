package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff;

/* JADX INFO: renamed from: X.0zmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909270zmf {
    public static void LIZ(String str) {
        InterfaceC1909280zmg specActDebugService;
        if (C1909300zmi.LJIILIIL == null) {
            LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
            if (localTestApi != null) {
                specActDebugService = localTestApi.getSpecActDebugService();
            } else {
                specActDebugService = null;
            }
            C1909300zmi.LJIILIIL = specActDebugService;
        }
        InterfaceC1909280zmg interfaceC1909280zmg = C1909300zmi.LJIILIIL;
        if (interfaceC1909280zmg != null) {
            interfaceC1909280zmg.LIZ();
        }
        IPraiseDialogDiff.LIZ.getClass();
        C1909260zme.LIZ().LIZ();
    }
}
