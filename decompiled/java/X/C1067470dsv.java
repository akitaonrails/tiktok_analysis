package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0dsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067470dsv extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(376);
        return new C1400390mXt(aFwS204S0000000_16, null, aFwS204S0000000_16, null, null, 26);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067470dsv();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_AIGC_AVATAR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (C1067920dte.LIZ()) {
            return super.LJJJJLL(list);
        }
        C19719612Di.LJJIIJ(list, new AwS595S0100000_16(this, 229), true);
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("anchor_type", "ai_avatar");
            super.p1(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("anchor_type", "ai_avatar");
        }
        LJJIJ(new AwS598S0100000_19(this, 586));
        LJJII(c2344009Gk, true, true);
    }
}
