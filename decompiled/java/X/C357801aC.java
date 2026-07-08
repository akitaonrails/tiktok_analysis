package X;

import com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01aC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C357801aC extends C09AY implements Function0<Fetcher.FetcherService> {
    public C357801aC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher$FetcherService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Fetcher.FetcherService invoke() {
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveRetrofit(false).LIZ(Fetcher.FetcherService.class);
    }
}
