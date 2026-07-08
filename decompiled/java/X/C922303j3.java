package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.VenmoProcess;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C922303j3 extends C09AY implements InterfaceC1631620sYq<Boolean, Map<String, ? extends String>, Boolean, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1631630sYr<Boolean, List<PaymentElement>, String, Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C922303j3(boolean z, InterfaceC1631630sYr<? super Boolean, ? super List<PaymentElement>, ? super String, ? super Boolean, Unit> interfaceC1631630sYr) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Map<String, ? extends String> map, Boolean bool2) {
        List<PaymentElement> listLJIIJJI;
        boolean zBooleanValue = bool.booleanValue();
        Map<String, ? extends String> map2 = map;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestNativeVenmoTokenAndRiskInfo callback result: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(' ');
        sbLIZ.append(map2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        C921903iz c921903iz = C921903iz.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestNativeVenmoTokenAndRiskInfo callback result: ");
        sbLIZ2.append(zBooleanValue);
        sbLIZ2.append(' ');
        sbLIZ2.append(map2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c921903iz.getClass();
        C921903iz.LIZIZ(4, strLIZIZ2, "VenmoProcess");
        String str = map2.get("access_token");
        String str2 = map2.get("client_metadata_id");
        String str3 = map2.get("device_data");
        String str4 = map2.get("wallet_id");
        if (this.LL) {
            VenmoProcess.LIZ.getClass();
            Boolean bool3 = Boolean.FALSE;
            listLJIIJJI = C1697810uHb.LJIIJJI(new PaymentElement("eg_pi_ew_venmo_c_d_venmo_access_token", "access_token", str, bool3, bool3), new PaymentElement("eg_pi_ew_venmo_c_d_venmo_client_metadata_id", "client_metadata_id", str2, bool3, bool3), new PaymentElement("eg_pi_ew_venmo_c_d_venmo_wallet_id", "wallet_id", str4, bool3, bool3));
        } else {
            VenmoProcess.LIZ.getClass();
            Boolean bool4 = Boolean.FALSE;
            listLJIIJJI = C1697810uHb.LJIIJJI(new PaymentElement("eg_pi_ew_venmoonetime_c_d_us_access_token", "access_token", str, bool4, bool4), new PaymentElement("eg_pi_ew_venmoonetime_c_d_us_client_metadata_id", "client_metadata_id", str2, bool4, bool4), new PaymentElement("eg_pi_ew_venmoonetime_c_d_us_wallet_id", "wallet_id", str4, bool4, bool4));
        }
        this.LLILLJJLI.invoke(Boolean.valueOf(zBooleanValue), listLJIIJJI, str3, bool2);
        return Unit.LIZ;
    }
}
