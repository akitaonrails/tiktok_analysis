package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052280dUQ extends AbstractC1066890drz {
    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLZIJ(C2344009Gk c2344009Gk, boolean z) {
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1052280dUQ();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.THIRD_PART_GENERAL.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        String strLIZ;
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String schema = anchorCommonStruct2.getSchema();
            if (schema != null && schema.length() != 0) {
                Uri uri = UriProtector.parse(schema);
                if (anchorCommonStruct2.getType() == type() && Intrinsics.LJFF(uri.getHost(), "third_party_common_webview") && (strLIZ = C416901jj.LIZ(uri, "url")) != null && a0.LJJIIZI(strLIZ, "fcp_anchor_spark=1", false)) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJII(c2344009Gk, true, true);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        LJJIJ(new AwS382S0200000_16(this, interfaceC1392640mLO.LIZIZ(), 67));
    }
}
