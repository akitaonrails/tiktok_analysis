package X;

import com.ss.android.ugc.aweme.feed.api.FetchNetworkInfoInterceptor;
import com.ss.android.ugc.aweme.feed.api.recommend.FeedPostQueryParamInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.interceptor.CdnScoreInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0X3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842490X3f {
    public static final List<InterfaceC1904907d9> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedPostQueryParamInterceptor());
        if (!((Boolean) C277680AuU.LIZ.getValue()).booleanValue()) {
            arrayList.add(new FeedRetryInterceptorTTNet());
            arrayList.add(new FetchNetworkInfoInterceptor());
        }
        IEcRaxService iEcRaxService = (IEcRaxService) PluggableExtentionKt.pluggableSpi$default(IEcRaxService.class, false, false, false, 14, null);
        if (iEcRaxService != null) {
            iEcRaxService.LIZJ();
        }
        arrayList.add(new CdnScoreInterceptor());
        return arrayList;
    }
}
