package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.sdk.account.api.IRegionApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848000XOk implements InterfaceC829330Wg7 {
    public final C01GW LIZ = C452501pT.LIZIZ(new C848010XOl());

    public static final Context LIZ() {
        C0XPY.LIZ.getClass();
        return C0XPY.LIZ();
    }

    public static final boolean LIZJ() {
        return C0XQ5.LJ().isEnableMultiAccountLogin();
    }

    public static final IRegionApi LIZIZ(String str) {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        if (!u.LJJIIJZLJL(str, "https://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        return (IRegionApi) iRetrofitFactory.LIZ(str).create(IRegionApi.class);
    }
}
