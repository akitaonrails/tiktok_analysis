package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0dsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067130dsN extends AbstractC1066890drz {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067130dsN();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        AnchorCommonStruct anchorCommonStruct;
        if (list.size() > 1) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        Iterator<AnchorCommonStruct> it2 = list.iterator();
        while (true) {
            anchorCommonStruct = null;
            InterfaceC1392640mLO interfaceC1392640mLO = null;
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getStandardComponentInfo() != null) {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                if (interfaceC1392640mLO2 == null) {
                    interfaceC1392640mLO2 = null;
                }
                interfaceC1392640mLO2.Cf();
                InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
                InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
                if (interfaceC1392640mLO3 != null) {
                    interfaceC1392640mLO = interfaceC1392640mLO3;
                }
                if (!interfaceC706770RnvLJJIIJ.LJJIIJZLJL(interfaceC1392640mLO.LJ())) {
                    anchorCommonStruct = next;
                    break;
                }
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
        if (anchorCommonStruct2 == null) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        list.remove(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        return EnumC1050190dR3.DONE;
    }
}
