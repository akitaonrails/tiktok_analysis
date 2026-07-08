package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Tlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756420Tlo implements InterfaceC756510Tlx {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(488));

    @Override // X.InterfaceC756510Tlx
    public final void LIZIZ(EnumC1108010ewJ enumC1108010ewJ) {
        ((InterfaceC756430Tlp) this.LIZ.getValue()).Rg(EnumC1107860ew4.LIVE_LEADS_GEN, enumC1108010ewJ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Tlt] */
    @Override // X.InterfaceC756510Tlx
    public final void LIZ(C756480Tlu c756480Tlu, Function0<Unit> function0) {
        String str;
        InterfaceC756430Tlp interfaceC756430Tlp = (InterfaceC756430Tlp) this.LIZ.getValue();
        EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.LIVE_LEADS_GEN;
        if (interfaceC756430Tlp.Qi(enumC1107860ew4) || c756480Tlu.LIZIZ <= 0) {
            return;
        }
        int i = C756440Tlq.LIZ[c756480Tlu.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "BA_side";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "user_side";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("ttelite_ba_lead_live_card_show", c2344009Gk.LIZ);
        AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 1079);
        InterfaceC756430Tlp interfaceC756430Tlp2 = (InterfaceC756430Tlp) this.LIZ.getValue();
        ?? r6 = new InterfaceC771240UNe() { // from class: X.0Tlt
            @Override // X.InterfaceC1108000ewI
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC771240UNe
            public final View LIZLLL(Context context) {
                return C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d66, null, false);
            }
        };
        C1107970ewF c1107970ewF = c756480Tlu.LJFF;
        long j = (long) (c756480Tlu.LIZIZ * 1.02f);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cardContentProvider", c756480Tlu);
        linkedHashMap.put("cardDismissBlock", awS591S0100000_12);
        if (function0 != null) {
            linkedHashMap.put("cardCtaNavigateBlock", function0);
        }
        interfaceC756430Tlp2.LIZ(enumC1107860ew4, r6, c1107970ewF, j, linkedHashMap);
    }
}
