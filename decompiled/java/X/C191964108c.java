package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyLabelConfigModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.108c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C191964108c extends C109N {
    public final C191848103q LLJI;
    public final C107P LLJIJIL;

    @Override // X.C109N
    public final Integer LJIJJ() {
        return 0;
    }

    @Override // X.C109N
    public final String LJIJJLI() {
        return "Disclosure";
    }

    public String LJJIJIIJIL() {
        C108Z c108z;
        AFwS315S0000000_28 aFwS315S0000000_28LIZ;
        String str;
        Integer value = LJJI().LLILLL.getValue();
        if (value != null) {
            int iIntValue = value.intValue();
            List<PrivacyLabelConfigModel> list = this.LLJIJIL.LJIIJJI;
            if (list != null && (c108z = C103G.LIZIZ) != null && (aFwS315S0000000_28LIZ = c108z.LIZ()) != null && (str = (String) aFwS315S0000000_28LIZ.invoke(Integer.valueOf(iIntValue), list)) != null) {
                return str;
            }
        }
        return "";
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLIZ;
        ArrayList arrayList = new ArrayList();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = LJIL().LLILLL.get(this.LLJIJIL.LJIIIIZZ);
        if (privacySettingsRestrictionItem == null) {
            privacySettingsRestrictionItem = new PrivacySettingsRestrictionItem(2, 0, null, 0, -1, null);
        }
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(privacySettingsRestrictionItem);
        boolean z = c191986108yLIZLLL.LIZ;
        if (LJIJ(c191986108yLIZLLL.LIZIZ)) {
            CharSequence charSequenceLIZ2 = this.LLJIJIL.LJ.LIZ(context);
            C103N c103n = this.LLJIJIL.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            C10FB c10fb = new C10FB(null, charSequenceLIZ2, charSequenceLIZ, LJJIJIIJIL(), new AwS607S0100000_28(this, 247), new AwS607S0100000_28(this, 248), z, true, false, false, false, new AwS572S0100000_28(this, 822), 12032);
            LJJIFFI().LIZJ = Boolean.valueOf(c10fb.LJIIIIZZ);
            arrayList.add(c10fb);
        }
        return arrayList;
    }

    public C191964108c(C191848103q c191848103q, C107P c107p) {
        super(c191848103q, c107p.LIZ, c107p.LJIIIIZZ, c107p.LJIIIZ);
        this.LLJI = c191848103q;
        this.LLJIJIL = c107p;
    }

    @Override // X.C109N
    public void LJJIIJ(int i, View view) {
        String str = this.LLJIJIL.LJIIJ;
        if (str != null) {
            C191958107w.LIZ().LIZIZ(view, str);
        }
    }
}
