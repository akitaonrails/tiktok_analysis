package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0NSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594220NSi implements InterfaceC594230NSj {
    public final AbstractC21198617xY<AbstractC21202217y8> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(949));

    @Override // X.InterfaceC594230NSj
    public final int id() {
        return 0;
    }

    public C594220NSi(boolean z, AbstractC21197117xJ abstractC21197117xJ) {
        this.LIZ = abstractC21197117xJ;
        LIZLLL(3, new C594180NSe(z, abstractC21197117xJ), false);
    }

    public static String LIZIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InterfaceC594230NSj LIZJ(int i, int i2) {
        InterfaceC594230NSj interfaceC594230NSj = (InterfaceC594230NSj) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, i2));
        if (interfaceC594230NSj == null) {
            if (i == 2) {
                return (InterfaceC594230NSj) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, 0));
            }
            return (InterfaceC594230NSj) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, 0));
        }
        return interfaceC594230NSj;
    }

    @Override // X.InterfaceC594230NSj
    public final void LIZ(String str, Product product, Integer num) {
        Integer numValueOf;
        PopupCardVO popupCardVO = this.LIZ.LL;
        if (popupCardVO != null) {
            numValueOf = Integer.valueOf(popupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            InterfaceC594230NSj interfaceC594230NSjLIZJ = LIZJ(2, 1);
            if (interfaceC594230NSjLIZJ != null) {
                interfaceC594230NSjLIZJ.LIZ(str, product, num);
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            InterfaceC594230NSj interfaceC594230NSjLIZJ2 = LIZJ(3, 0);
            if (interfaceC594230NSjLIZJ2 == null) {
                return;
            }
            interfaceC594230NSjLIZJ2.LIZ(str, product, num);
            return;
        }
        InterfaceC594230NSj interfaceC594230NSjLIZJ3 = LIZJ(1, 0);
        if (interfaceC594230NSjLIZJ3 == null) {
            return;
        }
        interfaceC594230NSjLIZJ3.LIZ(str, product, num);
    }

    public final void LIZLLL(int i, InterfaceC594230NSj interfaceC594230NSj, boolean z) {
        ((Map) this.LIZIZ.getValue()).put(LIZIZ(i, interfaceC594230NSj.id()), interfaceC594230NSj);
        if (z) {
            ((Map) this.LIZIZ.getValue()).put(LIZIZ(i, 0), interfaceC594230NSj);
        }
    }
}
