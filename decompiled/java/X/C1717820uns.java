package X;

import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchNetworkApi;

/* JADX INFO: renamed from: X.0uns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717820uns {
    public static final /* synthetic */ C1717820uns LIZ = new C1717820uns();

    public static PipoPrefetchNetworkApi LIZ(String str) {
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZIZ(new PipoNetworkMonitor());
        return (PipoPrefetchNetworkApi) interfaceC1717730unjCreateBuilder.build().create(PipoPrefetchNetworkApi.class);
    }
}
