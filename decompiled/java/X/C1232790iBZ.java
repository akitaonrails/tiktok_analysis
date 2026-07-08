package X;

import Y.AkS326S0200000_19;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListRequest;
import com.ss.android.ugc.aweme.minis.request.payment.IMinisSubscriptionApi;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0iBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232790iBZ {
    public final IMinisSubscriptionApi LIZ;

    public C1232790iBZ() {
        IMinisSubscriptionApi.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
        this.LIZ = (IMinisSubscriptionApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(IMinisSubscriptionApi.class);
    }

    public static boolean LIZIZ(String str) {
        if (!C204575153d.LIZLLL() && !u.LJJIIJZLJL(str, "sb", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.ss.android.ugc.aweme.minis.model.payment.common.MinisPaymentNetworkResponse] */
    public final void LIZ(TiktokMinisSubscriptionListRequest tiktokMinisSubscriptionListRequest, InterfaceC1232530iB9 interfaceC1232530iB9) {
        int i = C2187451AjH.LIZ;
        String str = tiktokMinisSubscriptionListRequest.flowId;
        if (str == null) {
            str = "";
        }
        String str2 = tiktokMinisSubscriptionListRequest.trackingId;
        if (str2 == null) {
            str2 = "";
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new MinisPaymentNetworkResponse(null, -1);
        AbstractC19484711Kz.LJIJJ(this.LIZ.getSubscriptionList("", str, str2)).LJIIZILJ(new AkS326S0200000_19(this, c259800zU, 16)).LJJI(new InterfaceC1487280oo2() { // from class: X.01T7
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String string;
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getSubscriptionList, error occurred, cause:");
                Throwable cause = th.getCause();
                if (cause != null) {
                    string = cause.toString();
                } else {
                    string = null;
                }
                sbLIZ.append(string);
                C2188811AlT.LIZIZ(sbLIZ);
                return AbstractC19484711Kz.LJIILLIIL(th);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(interfaceC1232530iB9, 5));
    }
}
