package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.17ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21181317ul implements InterfaceC21181417um {
    public final AbstractC21198517xX<AbstractC21202917yF> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1197));

    @Override // X.InterfaceC21181417um
    public final int id() {
        return 0;
    }

    public C21181317ul(AbstractC21197217xK abstractC21197217xK) {
        this.LIZ = abstractC21197217xK;
    }

    public static String LIZIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InterfaceC21181417um LIZJ(int i, int i2) {
        InterfaceC21181417um interfaceC21181417um = (InterfaceC21181417um) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, i2));
        if (interfaceC21181417um == null) {
            if (i == 2) {
                return (InterfaceC21181417um) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, 0));
            }
            return (InterfaceC21181417um) ((Map) this.LIZIZ.getValue()).get(LIZIZ(i, 0));
        }
        return interfaceC21181417um;
    }

    @Override // X.InterfaceC21181417um
    public final void LIZ(String str, Product product, Integer num) {
        Integer numValueOf;
        UsPopupCardVO usPopupCardVO = this.LIZ.LL;
        if (usPopupCardVO != null) {
            numValueOf = Integer.valueOf(usPopupCardVO.cardType);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            InterfaceC21181417um interfaceC21181417umLIZJ = LIZJ(2, 1);
            if (interfaceC21181417umLIZJ != null) {
                interfaceC21181417umLIZJ.LIZ(str, product, num);
                return;
            }
            return;
        }
        InterfaceC21181417um interfaceC21181417umLIZJ2 = LIZJ(1, 0);
        if (interfaceC21181417umLIZJ2 == null) {
            return;
        }
        interfaceC21181417umLIZJ2.LIZ(str, product, num);
    }

    public final void LIZLLL(int i, InterfaceC21181417um interfaceC21181417um, boolean z) {
        ((Map) this.LIZIZ.getValue()).put(LIZIZ(i, interfaceC21181417um.id()), interfaceC21181417um);
        if (z) {
            ((Map) this.LIZIZ.getValue()).put(LIZIZ(i, 0), interfaceC21181417um);
        }
    }
}
