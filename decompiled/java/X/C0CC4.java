package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.0CC4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CC4 {
    public static final InterfaceC1618270sDJ LIZ;

    static {
        try {
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
            if (iMainService != null) {
                C844470XAv.LIZ.getClass();
                LIZ = (InterfaceC1618270sDJ) iMainService.getSP(C844470XAv.LIZ(), InterfaceC1618270sDJ.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get show xmas tree SP failed.");
            sbLIZ.append(th.getMessage());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
