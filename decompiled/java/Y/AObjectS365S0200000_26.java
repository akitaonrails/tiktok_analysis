package Y;

import X.C04H5;
import X.C10516049i;
import X.C123100dR;
import X.C1748720vbi;
import X.C1759650vtL;
import X.C1759810vtb;
import X.C1759830vtd;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C919503ib;
import X.InterfaceC1631620sYq;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.PdpDealsEntranceVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.USDealsEntranceVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS365S0200000_26 implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public AObjectS365S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object invoke$0(AObjectS365S0200000_26 aObjectS365S0200000_26, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        String str = (String) obj2;
        if (str != null) {
            PdpDealsEntranceVH pdpDealsEntranceVH = (PdpDealsEntranceVH) aObjectS365S0200000_26.l0;
            USDealsEntranceVO uSDealsEntranceVO = (USDealsEntranceVO) aObjectS365S0200000_26.l1;
            ((PdpViewModel) pdpDealsEntranceVH.LLJJJJJIL.getValue()).LLLLLIL.LIZIZ(view.getContext(), str);
            C1748720vbi.LIZLLL(view, new C10516049i(), new AwS605S0100000_26(uSDealsEntranceVO, 233));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS365S0200000_26 aObjectS365S0200000_26, Object obj, Object obj2, Object obj3) {
        PdpComponentAction pdpComponentAction;
        C04H5 c04h5;
        View view = (View) obj;
        String str = (String) obj2;
        C1759810vtb c1759810vtb = C1759810vtb.LIZ;
        PdpComponent pdpComponent = ((C1759830vtd) aObjectS365S0200000_26.l0).LIZLLL;
        PdpViewModel pdpViewModel = (PdpViewModel) aObjectS365S0200000_26.l1;
        c1759810vtb.getClass();
        try {
            if (C123100dR.LIZ(str)) {
                if (u.LJJIIJZLJL(UriProtector.parse(str).toString(), "ec_action://ec/pdp_action", false)) {
                    if (pdpComponent != null && (pdpComponentAction = pdpComponent.action) != null) {
                        if (pdpViewModel != null && (c04h5 = pdpViewModel.LLLLL) != null) {
                            c04h5.LIZ(pdpComponentAction, view, true);
                        }
                        C1759650vtL.LIZ.getClass();
                        C1759650vtL.LIZIZ(pdpComponent, pdpViewModel, view, null);
                    }
                } else {
                    C919503ib.LIZIZ(view.getContext(), str, C2097608Jq.LJ(), false).open();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TextComponentClickHelper: dealECRichTextClick error: ");
            sbLIZ.append(pdpComponent);
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
