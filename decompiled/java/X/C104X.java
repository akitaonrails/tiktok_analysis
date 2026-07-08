package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.104X, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C104X extends AbstractC191843103l {
    public final C104Z LLILLJJLI;
    public final C191848103q LLILLL;
    public final C191984108w LLILZ;

    public boolean LJIILIIL(boolean z) {
        return z;
    }

    public boolean LJIILJJIL() {
        return false;
    }

    public boolean LJIILL() {
        return false;
    }

    public boolean LJIILLIIL() {
        return true;
    }

    public boolean LJIIZILJ(boolean z) {
        return z;
    }

    public void LJIJ(int i, View view) {
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLIZ;
        ArrayList arrayList = new ArrayList();
        Function1<? super Boolean, Boolean> function1 = this.LLILLJJLI.LJII;
        Boolean bool = Boolean.TRUE;
        if (LJIIZILJ(function1.invoke(bool).booleanValue())) {
            CharSequence charSequenceLIZ2 = this.LLILLJJLI.LJ.LIZ(context);
            C103N c103n = this.LLILLJJLI.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            C10FB c10fb = new C10FB(null, charSequenceLIZ2, charSequenceLIZ, "", new AwS607S0100000_28(this, 306), new AwS607S0100000_28(this, 307), LJIILIIL(this.LLILLJJLI.LJI.invoke(bool).booleanValue()), LJIILLIIL(), LJIILJJIL(), LJIILL(), false, new AwS572S0100000_28(this, 892), 11264);
            this.LLILZ.LIZJ = Boolean.valueOf(c10fb.LJIIIIZZ);
            arrayList.add(c10fb);
        }
        return arrayList;
    }

    public C104X(C104Z c104z, C191848103q c191848103q) {
        this.LLILLJJLI = c104z;
        this.LLILLL = c191848103q;
        this.LLILZ = new C191984108w(c104z.LIZ, "Disclosure");
    }

    public void LJIJI(int i, View view) {
        String str = this.LLILLJJLI.LJIIIIZZ;
        if (str != null) {
            InterfaceC1703650uR1 interfaceC1703650uR1LJ = C100C.LIZ.LJ();
            Context context = view.getContext();
            String str2 = this.LLILLL.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC1703650uR1LJ.LIZ(context, str, C2097908Jt.LIZJ(new Pair("previous_page_tag", str2)), null, null);
        }
    }
}
