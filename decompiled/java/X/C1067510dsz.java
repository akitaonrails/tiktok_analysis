package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dsz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067510dsz extends AbstractC1066890drz {
    public final C1067520dt0 LLJ = new C1067520dt0(this, new AwS560S0100000_16(this, 709));

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return this.LLJ.LIZIZ();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067510dsz();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR_3.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        this.LLJ.LIZ(c2344009Gk);
        LJJIIJ(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        this.LLJ.LJI(list);
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        this.LLJ.LJFF(aweme);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        this.LLJ.LJ(c2344009Gk);
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        this.LLJ.LIZLLL(c2344009Gk);
    }
}
