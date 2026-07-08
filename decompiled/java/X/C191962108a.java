package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyLabelConfigModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.108a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C191962108a extends AbstractC191963108b {
    public final C191848103q LLJ;
    public final C107P LLJI;
    public final Function2<Context, String, CharSequence> LLJIJIL;
    public final C191983108v LLJILJIL;

    @Override // X.AbstractC191963108b, X.InterfaceC191831102z
    public CharSequence LIZJ(Context context, CharSequence charSequence) {
        return null;
    }

    public boolean LJJI() {
        return true;
    }

    public String LJJIFFI() {
        C108Z c108z;
        AFwS315S0000000_28 aFwS315S0000000_28LIZ;
        String str;
        Integer numLJIJJ = LJIJJ();
        if (numLJIJJ != null) {
            int iIntValue = numLJIJJ.intValue();
            List<PrivacyLabelConfigModel> list = this.LLJI.LJIIJJI;
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
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIJJLI());
        boolean z = c191986108yLIZLLL.LIZ;
        if (LJIJI(c191986108yLIZLLL.LIZIZ)) {
            Integer numLJIILLIIL = LJIILLIIL();
            CharSequence charSequenceLJIJ = LJIJ(context, this.LLJI.LJ.LIZ(context));
            C103N c103n = this.LLJI.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            C10FB c10fb = new C10FB(numLJIILLIIL, charSequenceLJIJ, LJIIZILJ(context, charSequenceLIZ), LJJIFFI(), new AwS607S0100000_28(this, 378), new AwS607S0100000_28(this, 379), LJIILL(z), LJJI(), false, false, false, new AwS572S0100000_28(this, 1065), 12032);
            this.LLJILJIL.LIZJ = Boolean.valueOf(c10fb.LJIIIIZZ);
            arrayList.add(c10fb);
        }
        LJIILIIL(arrayList);
        return arrayList;
    }

    public C191962108a(C191848103q c191848103q, C107P c107p) {
        super(c191848103q, c107p.LJIIIIZZ, c107p.LJIIIZ, null);
        this.LLJ = c191848103q;
        this.LLJI = c107p;
        this.LLJIJIL = null;
        this.LLJILJIL = new C191983108v(c107p.LIZ, "Disclosure");
    }

    public void LJJII(int i, View view) {
        String str = this.LLJI.LJIIJ;
        if (str != null) {
            C191958107w.LIZ().LIZIZ(view, str);
        }
    }
}
