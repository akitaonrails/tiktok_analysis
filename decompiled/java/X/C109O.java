package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.109O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109O extends C109N {
    public final C191848103q LLJI;
    public final C107O LLJIJIL;

    @Override // X.C109N
    public final String LJIJJLI() {
        return "Switch";
    }

    @Override // X.C109N
    public final Integer LJIJJ() {
        return LJIL().LLILZ.get(this.LLJIJIL.LJIIIZ);
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOptionLIZ;
        boolean z;
        boolean z2;
        CharSequence charSequenceLIZ;
        ArrayList arrayList = new ArrayList();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
        if (privacySettingsRestrictionItem == null) {
            privacySettingsRestrictionItem = new PrivacySettingsRestrictionItem(2, 0, null, 0, -1, null);
        }
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(privacySettingsRestrictionItem);
        boolean z3 = c191986108yLIZLLL.LIZ;
        boolean z4 = c191986108yLIZLLL.LIZIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem2 = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
        if (privacySettingsRestrictionItem2 != null) {
            privacySettingsRestrictionOptionLIZ = C856230XiP.LIZ(privacySettingsRestrictionItem2, Integer.valueOf(this.LLJIJIL.LJIIJJI));
        } else {
            privacySettingsRestrictionOptionLIZ = null;
        }
        C191986108y c191986108yLJ = C191985108x.LJ(privacySettingsRestrictionOptionLIZ);
        boolean z5 = c191986108yLJ.LIZ;
        boolean z6 = c191986108yLJ.LIZIZ;
        boolean z7 = true;
        if (z4 && z6) {
            z = true;
        } else {
            z = false;
        }
        if (LJIJ(z)) {
            Integer value = LJJI().LLILLL.getValue();
            int i = this.LLJIJIL.LJIIJJI;
            if (value != null && value.intValue() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            C107O c107o = this.LLJIJIL;
            Integer num = c107o.LIZLLL;
            CharSequence charSequenceLJIIZILJ = LJIIZILJ(context, c107o.LJ.LIZ(context));
            C103N c103n = this.LLJIJIL.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            CharSequence charSequenceLJIILLIIL = LJIILLIIL(context, charSequenceLIZ);
            AwS642S0100000_28 awS642S0100000_28 = new AwS642S0100000_28(this, 86);
            AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 274);
            AwS642S0100000_28 awS642S0100000_282 = new AwS642S0100000_28(this, 87);
            boolean zLJFF = Intrinsics.LJFF(LJJI().LLILZ.getValue(), Boolean.TRUE);
            if (!z3 || !z5) {
                z7 = false;
            }
            C10FD c10fd = new C10FD(num, charSequenceLJIIZILJ, charSequenceLJIILLIIL, awS642S0100000_28, awS607S0100000_28, awS642S0100000_282, z2, zLJFF, LJIILL(z7), false, null, false, new AwS144S0110000_28(this, z2, 6), 24064);
            LJJIFFI().LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            arrayList.add(c10fd);
        }
        return arrayList;
    }

    public C109O(C191848103q c191848103q, C107O c107o) {
        super(c191848103q, c107o.LIZ, c107o.LJIIIIZZ, c107o.LJIIIZ);
        this.LLJI = c191848103q;
        this.LLJIJIL = c107o;
    }
}
