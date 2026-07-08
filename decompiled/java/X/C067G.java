package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.core.infoupload.ProbeApi;

/* JADX INFO: renamed from: X.067G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067G {
    public static final /* synthetic */ C067G LIZ = new C067G();

    public static ProbeApi LIZ(String str) {
        boolean z;
        IRetrofitFactory iRetrofitFactory;
        C1499850p8J c1499850p8JCreateBuilder;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null)) == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null) {
            return null;
        }
        c1499850p8JCreateBuilder.LIZ(new CommonParamInterceptor());
        return (ProbeApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(ProbeApi.class);
    }
}
