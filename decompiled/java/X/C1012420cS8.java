package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.component.comment.PromoCodeApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0cS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012420cS8 {
    public static final /* synthetic */ C1012420cS8 LIZ = new C1012420cS8();

    public static PromoCodeApi LIZ() {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) == null) {
            return null;
        }
        return (PromoCodeApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PromoCodeApi.class);
    }
}
