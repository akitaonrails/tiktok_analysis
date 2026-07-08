package X;

import Y.AkS326S0200000_19;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisAdPlacementValidateResponse;

/* JADX INFO: renamed from: X.0iHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236730iHv {
    public final InterfaceC1236740iHw LIZ;

    public C1236730iHv() {
        InterfaceC1236740iHw.LIZ.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url host:");
        String str = C0CQT.LIZJ;
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Gson gsonLIZ = new e().LIZ();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        c1499850p8JCreateBuilder.LIZJ(new C2336109Dj(gsonLIZ));
        this.LIZ = (InterfaceC1236740iHw) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1236740iHw.class);
    }

    public static NetworkResponse LIZ(MinisAdPlacementValidateResponse minisAdPlacementValidateResponse, int i) {
        NetworkResponse networkResponse = new NetworkResponse(minisAdPlacementValidateResponse, Integer.valueOf(i), false, null, false, null, null);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildResponse， networkResponse:");
        sbLIZ.append(networkResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        return networkResponse;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public final void LIZIZ(String str, String str2, int i, int i2, String str3, InterfaceC1236750iHx interfaceC1236750iHx) {
        int i3 = C2187451AjH.LIZ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
        AbstractC19484711Kz.LJIJJ(this.LIZ.LIZ(str, str2, C204575153d.LJ(), i, i2, str3)).LJIIZILJ(new AkS326S0200000_19(this, c259800zU, 7)).LJJI(new InterfaceC1487280oo2() { // from class: X.01Sq
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String string;
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMinisAdPlacementValidateResponse, error occurred, cause:");
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
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C1266080j3G(interfaceC1236750iHx, 4));
    }
}
