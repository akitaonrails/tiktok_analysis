package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.127U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127U {
    public static final /* synthetic */ C127U LIZ = new C127U();

    public static C127T LIZ() {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder("https://oec-api.tiktokv.com")) == null) {
            return null;
        }
        return (C127T) c1499850p8JCreateBuilder.build().retrofit.LIZ(C127T.class);
    }
}
