package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0sB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616920sB8 {
    public static final C1616920sB8 LIZ = new C1616920sB8();

    public static String LIZ() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        String billingCountryCode;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) == null || (billingCountryCode = interfaceC1791930wjPLLFZ.getBillingCountryCode()) == null) ? "" : billingCountryCode;
    }
}
