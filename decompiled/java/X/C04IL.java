package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04IL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04IL {
    public static final PdpIntegrateLynxAirModel LIZ = new PdpIntegrateLynxAirModel(0, null, null, null, false, null);

    public static LynxCardModel LIZ() {
        List<LynxCardModel> list = LIZIZ().renderCardList;
        LynxCardModel lynxCardModel = null;
        if (list == null) {
            return null;
        }
        Iterator<LynxCardModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LynxCardModel next = it2.next();
            if (Intrinsics.LJFF(next.cardName, "pdp_product_info")) {
                lynxCardModel = next;
                break;
            }
        }
        return lynxCardModel;
    }

    public static PdpIntegrateLynxAirModel LIZIZ() {
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel2 = LIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel3 = (PdpIntegrateLynxAirModel) c0c64LJIILLIIL.LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel2, "ec_anchor_pdp_integrate_lynx_air_lockup", true);
        if (pdpIntegrateLynxAirModel3 == null) {
            pdpIntegrateLynxAirModel3 = pdpIntegrateLynxAirModel2;
        }
        return (pdpIntegrateLynxAirModel3.totalSwitch != 1 || (pdpIntegrateLynxAirModel = (PdpIntegrateLynxAirModel) C0C64.LJIILLIIL().LJJII(PdpIntegrateLynxAirModel.class, pdpIntegrateLynxAirModel2, "ec_anchor_pdp_integrate_lynx_air_lockup", true)) == null) ? pdpIntegrateLynxAirModel2 : pdpIntegrateLynxAirModel;
    }
}
