package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.AddressApi;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import defpackage.PipoCashierDistrictConfigSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505740pHo {
    public static final /* synthetic */ C1505740pHo LIZ = new C1505740pHo();
    public static final String LIZIZ;
    public static AddressApi LIZJ;
    public static String LIZLLL;

    static {
        String str = PipoCashierDistrictConfigSettings.LIZIZ().key;
        if (str == null || str.length() == 0) {
            str = "ceb6c970658f31504a901b89dcd3e461";
        }
        if (str == null) {
            str = "";
        }
        LIZIZ = str;
        LIZLLL = "";
    }

    public static AddressApi LIZ() {
        AddressApi addressApi;
        C1499850p8J c1499850p8JCreateBuilder;
        String str = PipoCashierDistrictConfigSettings.LIZIZ().host;
        if (str == null || str.length() == 0) {
            str = "https://location-sg.byteintl.com";
        }
        if (LIZJ == null || !Intrinsics.LJFF(LIZLLL, str)) {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) == null) {
                addressApi = null;
            } else {
                c1499850p8JCreateBuilder.LIZIZ(new PipoNetworkMonitor("CASHIER"));
                addressApi = (AddressApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(AddressApi.class);
            }
            LIZJ = addressApi;
            LIZLLL = str;
        }
        return LIZJ;
    }
}
