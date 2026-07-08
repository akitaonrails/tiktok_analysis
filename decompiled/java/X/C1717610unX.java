package X;

import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;
import com.ss.android.ugc.aweme.pipo.common.network.SessionIdHeaderInterceptor;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;

/* JADX INFO: renamed from: X.0unX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717610unX {
    public static final /* synthetic */ C1717610unX LIZ = new C1717610unX();

    public static BiometricBEApi LIZ(String str, String str2) {
        if (str.length() == 0) {
            return null;
        }
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZ(new SessionIdHeaderInterceptor(str2));
        interfaceC1717730unjCreateBuilder.LIZIZ(new PipoNetworkMonitor());
        return (BiometricBEApi) interfaceC1717730unjCreateBuilder.build().create(BiometricBEApi.class);
    }
}
