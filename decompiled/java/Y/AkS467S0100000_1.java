package Y;

import X.C03S2;
import X.C03X3;
import X.C03X4;
import X.C04IS;
import X.C04IW;
import X.C0C64;
import X.C0PEM;
import X.C1060104Cp;
import X.C1073304Hr;
import X.C1AF0;
import X.C23250099c;
import X.C259800zU;
import X.C817503Hh;
import X.C857603Ws;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOspCallbackOptModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AkS467S0100000_1 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public AkS467S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS467S0100000_1 akS467S0100000_1, Object obj) {
        Integer num;
        C03S2.LIZ.getClass();
        EcomOspCallbackOptModel ecomOspCallbackOptModel = (EcomOspCallbackOptModel) C03S2.LIZJ.getValue();
        if (ecomOspCallbackOptModel != null && (num = ecomOspCallbackOptModel.optApiCallback) != null && num.intValue() == 2) {
            return ((C259800zU) akS467S0100000_1.l0).element;
        }
        return obj;
    }

    public static final Object apply$1(AkS467S0100000_1 akS467S0100000_1, Object obj) {
        return C857603Ws.LJFF((C857603Ws) akS467S0100000_1.l0, (ComposePbAndJson) obj);
    }

    public static final Object apply$2(AkS467S0100000_1 akS467S0100000_1, Object obj) {
        BillInfoResponse billInfoResponseLJFF = C857603Ws.LJFF((C857603Ws) akS467S0100000_1.l0, (ComposePbAndJson) obj);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C03X3((C857603Ws) akS467S0100000_1.l0, billInfoResponseLJFF, null), 2);
        return billInfoResponseLJFF;
    }

    public static final Object apply$3(AkS467S0100000_1 akS467S0100000_1, Object obj) {
        BillInfoResponse billInfoResponseLJFF = C857603Ws.LJFF((C857603Ws) akS467S0100000_1.l0, (ComposePbAndJson) obj);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C03X4((C857603Ws) akS467S0100000_1.l0, billInfoResponseLJFF, null), 2);
        return billInfoResponseLJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(AkS467S0100000_1 akS467S0100000_1, Object obj) {
        Response<ListReviewData> response;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel;
        ListReviewData listReviewData;
        Response response2 = (Response) obj;
        C1060104Cp c1060104Cp = (C1060104Cp) response2.data;
        Integer numValueOf = null;
        if (c1060104Cp != null) {
            response = c1060104Cp.LIZJ;
        } else {
            response = null;
        }
        if (response != null && response.isCodeOK() && (listReviewData = response.data) != null) {
            ((C1073304Hr) akS467S0100000_1.l0).LJI = (C1060104Cp) response2.data;
            return listReviewData;
        }
        ((C1073304Hr) akS467S0100000_1.l0).LJII = "error";
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel2 = C04IW.LIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel3 = (PdpIntegrateLynxAirModel) c0c64LJIILLIIL.LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel2, "ec_anchor_pdp_integrate_lynx_air_review", true);
        if (pdpIntegrateLynxAirModel3 == null) {
            pdpIntegrateLynxAirModel3 = pdpIntegrateLynxAirModel2;
        }
        if (pdpIntegrateLynxAirModel3.totalSwitch == 1 && (pdpIntegrateLynxAirModel = (PdpIntegrateLynxAirModel) C0C64.LJIILLIIL().LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel2, "ec_anchor_pdp_integrate_lynx_air_review", true)) != null) {
            pdpIntegrateLynxAirModel2 = pdpIntegrateLynxAirModel;
        }
        List<LynxCardModel> list = pdpIntegrateLynxAirModel2.renderCardList;
        if (list != null) {
            Iterator<LynxCardModel> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LynxCardModel next = it2.next();
                if (Intrinsics.LJFF(next.cardName, "global_review_title")) {
                    if (next != null) {
                        C1073304Hr c1073304Hr = (C1073304Hr) akS467S0100000_1.l0;
                        c1073304Hr.LIZ.setState(new AwS580S0100000_1(c1073304Hr, 625));
                    }
                }
            }
        }
        if (response != null) {
            numValueOf = Integer.valueOf(response.code);
        }
        C1AF0.LIZJ(String.valueOf(numValueOf));
        throw new C04IS(response, "data is null");
    }
}
