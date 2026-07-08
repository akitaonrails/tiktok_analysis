package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: renamed from: X.109X, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109X extends C109Y {
    public final C107O LLIZLLLIL;
    public final C191983108v LLJ;

    @Override // X.C109Y
    public final List<AbstractC191840103i> LJIILJJIL(List<AbstractC191840103i> list) {
        throw null;
    }

    public Integer LJJ() {
        return this.LLIZLLLIL.LIZLLL;
    }

    @Override // X.C109Y, X.AbstractC191843103l
    public final void LJII() {
        super.LJII();
        this.LLJ.LIZLLL = false;
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        CharSequence charSequenceLIZ;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIJ());
        boolean z2 = c191986108yLIZLLL.LIZ;
        boolean z3 = c191986108yLIZLLL.LIZIZ;
        C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIJ(), Integer.valueOf(this.LLIZLLLIL.LJIIJJI)));
        boolean z4 = c191986108yLJ.LIZ;
        boolean z5 = c191986108yLJ.LIZIZ;
        boolean z6 = true;
        if (z3 && z5) {
            if (LJIILIIL() == this.LLIZLLLIL.LJIIJJI) {
                z = true;
            } else {
                z = false;
            }
            Integer numLJJ = LJJ();
            CharSequence charSequenceLJIIZILJ = LJIIZILJ(context, this.LLIZLLLIL.LJ.LIZ(context));
            C103N c103n = this.LLIZLLLIL.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            CharSequence charSequenceLJIILLIIL = LJIILLIIL(context, charSequenceLIZ);
            if (!z2 || !z4) {
                z6 = false;
            }
            C10FD c10fd = new C10FD(numLJJ, charSequenceLJIIZILJ, charSequenceLJIILLIIL, new AwS642S0100000_28(this, 68), new AwS607S0100000_28(this, 216), new AwS642S0100000_28(this, 69), z, false, LJIILL(z6), false, null, false, new AwS144S0110000_28(this, z, 3), 23552);
            this.LLJ.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            arrayList.add(c10fd);
        }
        return arrayList;
    }

    public C109X(C191848103q c191848103q, C107O c107o) {
        super(c191848103q, c107o.LJIIIIZZ, c107o.LJIIIZ);
        this.LLIZLLLIL = c107o;
        this.LLJ = new C191983108v(c107o.LIZ, "Switch");
    }
}
