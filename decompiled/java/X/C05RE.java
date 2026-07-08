package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;

/* JADX INFO: renamed from: X.05RE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05RE {
    public static C05RV LIZ() {
        return C889930Yvf.LIZ.LIZJ();
    }

    public static InterfaceC1411705fn LIZIZ(String str) {
        IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlService.class, false, false, false, 14, null);
        if (iFrequencyControlService != null) {
            return iFrequencyControlService.LIZIZ(new C053W(str, new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.BUSINESS_ACCOUNT, EnumC12929054d.APP, 1), new C12912053m(1), C12915053p.LIZ));
        }
        return null;
    }
}
