package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0mLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392710mLV extends AbstractC1394010mNb {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1392710mLV();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE();
    }

    @Override // X.AbstractC1394010mNb, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (C298980Bnk.LIZ() && !C0AYL.LIZ(Integer.valueOf(type()))) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        return super.LJJJJLL(list);
    }
}
