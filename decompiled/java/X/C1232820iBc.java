package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.request.payment.IMinisCouponApi;

/* JADX INFO: renamed from: X.0iBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232820iBc {
    public static final /* synthetic */ C1232820iBc LIZ = new C1232820iBc();

    public static IMinisCouponApi LIZ() {
        C1499850p8J c1499850p8JCreateBuilder;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null) {
            return null;
        }
        c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
        return (IMinisCouponApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IMinisCouponApi.class);
    }
}
