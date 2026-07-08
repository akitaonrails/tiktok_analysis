package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MUX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUX extends AbstractC1066890drz {
    public long LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new C0MUY());

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C0MUX();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_PLAYGROUND_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == type() && anchorCommonStruct2.getExtra().length() > 0) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        IAnchorService iAnchorService = (IAnchorService) this.LLJI.getValue();
        if (iAnchorService != null && iAnchorService.needShowAnchorInFYP(Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), C0XQ7.LJFF().getCurUserId()))) {
            return super.LJJJJLL(list);
        }
        C201955140j.LJII(C563650M8t.LIZIZ, "filter ai playground anchor by experiment");
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJ < 500) {
            return;
        }
        this.LLJ = jCurrentTimeMillis;
        LJJII(c2344009Gk, true, true);
        LJJIJ(new AwS587S0100000_8(this, 590));
    }
}
