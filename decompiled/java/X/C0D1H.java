package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings.PdpNewUcpApiConfigModel;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D1H {
    public static final PdpNewUcpApiConfigModel LIZ = new PdpNewUcpApiConfigModel(true, 1, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4017));

    public static final boolean LIZ(Integer num) {
        if (num == null || num.intValue() != 2) {
            return false;
        }
        if (!((PdpNewUcpApiConfigModel) LIZIZ.getValue()).enable) {
            InterfaceC332180D0m.LIZ.getClass();
            if (!Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.pdp_force_server_proxy", "false"), "true")) {
                return false;
            }
        }
        return true;
    }
}
