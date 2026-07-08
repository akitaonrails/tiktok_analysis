package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.api.EdmSubscribeApi;

/* JADX INFO: renamed from: X.01aE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C358001aE {
    public static final /* synthetic */ C358001aE LIZ = new C358001aE();
    public static final EdmSubscribeApi LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZIZ = (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C359001aO.LIZ)) == null) ? null : (EdmSubscribeApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(EdmSubscribeApi.class);
    }
}
