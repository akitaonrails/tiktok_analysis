package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.UUID;
import kotlin.jvm.internal.AwS40S2100000_16;

/* JADX INFO: renamed from: X.0dBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040770dBr implements InterfaceC1014040cUk {
    public final String LIZ = UUID.randomUUID().toString();
    public final long LIZIZ = System.currentTimeMillis();

    public final void LIZIZ(String str, String str2, String str3, String str4) {
        ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1041470dCz.LIZ, str, str2, null, new AwS40S2100000_16(this, str3, str4, 5));
        ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C2268011Dpv.LIZ, str, str2, null, new AwS40S2100000_16(this, str3, str4, 6));
    }

    @Override // X.InterfaceC1014040cUk
    public final void LIZJ(String str, String str2, String str3, String str4) {
        ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C2274361E0k.LIZIZ, str, str2, null, new AwS40S2100000_16(this, str3, str4, 7));
    }

    public static final void LIZ(String str, int i, String str2, String str3, Integer num, String str4, String str5, String str6) {
        ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C2268051Dpz.LIZ, str, str2, null, new C2268061Dq0(i, str6, str3, str4, num, str5));
    }
}
