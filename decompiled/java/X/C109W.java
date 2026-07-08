package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS182S0101000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.109W, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109W extends C109Y {
    public final C107N LLIZLLLIL;
    public final Map<Integer, C191983108v> LLJ;

    public boolean LJJI(int i, boolean z) {
        return z;
    }

    public boolean LJJIFFI(int i, boolean z) {
        return z;
    }

    public Integer LJJII(int i) {
        return null;
    }

    public CharSequence LJJIII(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public CharSequence LJJIIJ(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public boolean LJJIIJZLJL(int i, boolean z) {
        return z;
    }

    public AnonymousClass1098 LJJIIZ(C191848103q c191848103q) {
        return null;
    }

    @Override // X.C109Y, X.AbstractC191843103l
    public void LJII() {
        super.LJII();
        Iterator it2 = ((LinkedHashMap) this.LLJ).values().iterator();
        while (it2.hasNext()) {
            ((C191983108v) it2.next()).LIZLLL = false;
        }
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLIZ;
        boolean z;
        CharSequence charSequenceLIZ2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIJ());
        boolean z3 = c191986108yLIZLLL.LIZ;
        if (c191986108yLIZLLL.LIZIZ) {
            CharSequence charSequenceLJIIZILJ = LJIIZILJ(context, this.LLIZLLLIL.LJ.LIZ(context));
            C103N c103n = this.LLIZLLLIL.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            if (!a0.LJJJIL(charSequenceLJIIZILJ)) {
                arrayList.add(new AnonymousClass1088(charSequenceLJIIZILJ, charSequenceLIZ));
            }
            for (C105M c105m : this.LLIZLLLIL.LJIIJJI) {
                int i = c105m.LJIIIIZZ;
                C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIJ(), Integer.valueOf(i)));
                boolean z4 = c191986108yLJ.LIZ;
                if (LJJIIJZLJL(i, c191986108yLJ.LIZIZ)) {
                    C191983108v c191983108v = (C191983108v) ((LinkedHashMap) this.LLJ).get(Integer.valueOf(i));
                    if (c191983108v == null) {
                        c191983108v = new C191983108v(c105m.LIZ, "Radio");
                        this.LLJ.put(Integer.valueOf(i), c191983108v);
                    }
                    if (LJIILIIL() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zLJJI = LJJI(i, z);
                    Integer numLJJII = LJJII(i);
                    CharSequence charSequenceLJJIIJ = LJJIIJ(context, c105m.LJ.LIZ(context), i);
                    C103N c103n2 = c105m.LJFF;
                    if (c103n2 == null || (charSequenceLIZ2 = c103n2.LIZ(context)) == null) {
                        charSequenceLIZ2 = "";
                    }
                    CharSequence charSequenceLJJIII = LJJIII(context, charSequenceLIZ2, i);
                    AwS182S0101000_28 awS182S0101000_28 = new AwS182S0101000_28(this, i, 0);
                    AwS109S0201000_28 awS109S0201000_28 = new AwS109S0201000_28(c191983108v, this, i, 6);
                    AwS109S0201000_28 awS109S0201000_282 = new AwS109S0201000_28(c191983108v, this, i, 7);
                    if (z3 && LJJIFFI(i, z4)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C109B c109b = new C109B(numLJJII, charSequenceLJJIIJ, charSequenceLJJIII, awS182S0101000_28, awS109S0201000_28, awS109S0201000_282, zLJJI, false, z2, LJJIIZ(this.LLILLJJLI), new AwS9S0211000_28(c191983108v, this, zLJJI, i, 2), 23040);
                    c191983108v.LIZJ = Boolean.valueOf(c109b.LJIIJ);
                    arrayList.addAll(LJJ(i, c109b));
                }
            }
        }
        return LJIILJJIL(arrayList);
    }

    public C109W(C191848103q c191848103q, C107N c107n) {
        super(c191848103q, c107n.LJIIIIZZ, c107n.LJIIIZ);
        this.LLIZLLLIL = c107n;
        this.LLJ = new LinkedHashMap();
    }

    public List LJJ(int i, C109B c109b) {
        return Collections.singletonList(c109b);
    }
}
