package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.data.HybridABApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1423705hj extends C09AY implements Function0<HybridABApi> {
    public C1423705hj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.data.HybridABApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final HybridABApi invoke() {
        String str = C844470XAv.LJIIIIZZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(str);
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(HybridABApi.class);
    }
}
