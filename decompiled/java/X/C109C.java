package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.core.render.components.builtin.setting.SettingItemViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS9S0211000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.109C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109C extends AbstractC191843103l {
    public final C105L LLILLJJLI;
    public final C191848103q LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 917));
    public final Map<Integer, C191984108w> LLILZIL = new LinkedHashMap();

    public List<AbstractC191840103i> LJIILIIL(List<AbstractC191840103i> list) {
        return list;
    }

    public CharSequence LJIILJJIL(Context context, CharSequence charSequence, int i) {
        return charSequence;
    }

    public boolean LJIILL(boolean z) {
        return z;
    }

    public AnonymousClass1098 LJIIZILJ() {
        return null;
    }

    public boolean LJIJ(int i, View view) {
        return false;
    }

    public final SettingItemViewModel LJIILLIIL() {
        return (SettingItemViewModel) this.LLILZ.getValue();
    }

    @Override // X.AbstractC191843103l
    public void LJII() {
        LJIILLIIL().LL.observe(this.LLILLL.LIZJ, new AObserverS230S0100000_28(this, 92));
        LJIILLIIL().LLILLJJLI.observe(this.LLILLL.LIZJ, new AObserverS230S0100000_28(this, 93));
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        int iIntValue;
        boolean z;
        CharSequence charSequenceLIZ;
        boolean z2;
        boolean z3;
        CharSequence charSequenceLIZ2;
        ArrayList arrayList = new ArrayList();
        Function1<? super Boolean, Boolean> function1 = this.LLILLJJLI.LJII;
        Boolean bool = Boolean.TRUE;
        boolean zLJIILL = LJIILL(function1.invoke(bool).booleanValue());
        boolean zBooleanValue = this.LLILLJJLI.LJI.invoke(bool).booleanValue();
        if (zLJIILL) {
            CharSequence charSequenceLIZ3 = this.LLILLJJLI.LJ.LIZ(context);
            if (charSequenceLIZ3.length() <= 0) {
                charSequenceLIZ3 = null;
            }
            if (charSequenceLIZ3 != null) {
                C103N c103n = this.LLILLJJLI.LJFF;
                if (c103n == null || (charSequenceLIZ2 = c103n.LIZ(context)) == null) {
                    charSequenceLIZ2 = "";
                }
                arrayList.add(new AnonymousClass1088(charSequenceLIZ3, charSequenceLIZ2));
            }
            int i = 0;
            for (Object obj : (ArrayList) this.LLILLJJLI.LJIIIIZZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    C105N c105n = (C105N) obj;
                    int i3 = c105n.LJIIIIZZ;
                    Function1<? super Boolean, Boolean> function12 = c105n.LJII;
                    Boolean bool2 = Boolean.TRUE;
                    if (function12.invoke(bool2).booleanValue()) {
                        C191984108w c191984108w = new C191984108w(c105n.LIZ, "Radio");
                        this.LLILZIL.put(Integer.valueOf(i3), c191984108w);
                        Integer value = LJIILLIIL().LL.getValue();
                        if (value != null) {
                            iIntValue = value.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        if (iIntValue == i3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        CharSequence charSequenceLIZ4 = c105n.LJ.LIZ(context);
                        C103N c103n2 = c105n.LJFF;
                        if (c103n2 == null || (charSequenceLIZ = c103n2.LIZ(context)) == null) {
                            charSequenceLIZ = "";
                        }
                        CharSequence charSequenceLJIILJJIL = LJIILJJIL(context, charSequenceLIZ, i3);
                        AwS642S0100000_28 awS642S0100000_28 = new AwS642S0100000_28(this, i3, 89);
                        AwS109S0201000_28 awS109S0201000_28 = new AwS109S0201000_28(c191984108w, this, i3, 11);
                        AwS109S0201000_28 awS109S0201000_282 = new AwS109S0201000_28(c191984108w, this, i3, 12);
                        if (z && Intrinsics.LJFF(LJIILLIIL().LLILLJJLI.getValue(), bool2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (zBooleanValue && c105n.LJI.invoke(bool2).booleanValue()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        C109B c109b = new C109B(null, charSequenceLIZ4, charSequenceLJIILJJIL, awS642S0100000_28, awS109S0201000_28, awS109S0201000_282, z, z2, z3, LJIIZILJ(), new AwS9S0211000_28(c191984108w, this, z, i, 5), 23040);
                        c191984108w.LIZJ = Boolean.valueOf(c109b.LJIIJ);
                        arrayList.add(c109b);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LJIILIIL(arrayList);
        return arrayList;
    }

    public C109C(C105L c105l, C191848103q c191848103q) {
        this.LLILLJJLI = c105l;
        this.LLILLL = c191848103q;
    }
}
