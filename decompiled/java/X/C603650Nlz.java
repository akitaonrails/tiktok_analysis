package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0Nlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603650Nlz {
    public static final /* synthetic */ C603650Nlz LIZ = new C603650Nlz();
    public static final InterfaceC2661011f LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZIZ = (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder("https://oec-api.tiktokv.com")) == null) ? null : c1499850p8JCreateBuilder.build();
    }
}
