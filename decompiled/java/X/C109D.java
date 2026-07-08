package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.tiktok.tpsc.core.render.components.builtin.setting.SettingItemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.109D, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C109D extends AbstractC191843103l {
    public final C191888105e LLILLJJLI;
    public final C191848103q LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 975));
    public final C191984108w LLILZIL;

    public boolean LJIILIIL(boolean z) {
        return z;
    }

    public boolean LJIILJJIL(boolean z) {
        return z;
    }

    public CharSequence LJIILL(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public boolean LJIIZILJ(boolean z) {
        return z;
    }

    public boolean LJIJJ(int i, View view) {
        return false;
    }

    public final SettingItemViewModel LJIJI() {
        return (SettingItemViewModel) this.LLILZ.getValue();
    }

    @Override // X.AbstractC191843103l
    public void LJII() {
        LJIJI().LL.observe(this.LLILLL.LIZJ, new AObserverS230S0100000_28(this, 97));
        LJIJI().LLILLJJLI.observe(this.LLILLL.LIZJ, new AObserverS230S0100000_28(this, 98));
    }

    public final int LJIJ() {
        Integer value = LJIJI().LL.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 2;
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        CharSequence charSequenceLIZ;
        if (LJIJ() == this.LLILLJJLI.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJIILIIL = LJIILIIL(z);
        ArrayList arrayList = new ArrayList();
        Function1<? super Boolean, Boolean> function1 = this.LLILLJJLI.LJII;
        Boolean bool = Boolean.TRUE;
        if (LJIIZILJ(function1.invoke(bool).booleanValue())) {
            CharSequence charSequenceLJIILLIIL = LJIILLIIL(context, this.LLILLJJLI.LJ.LIZ(context));
            C103N c103n = this.LLILLJJLI.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            C10FD c10fd = new C10FD(null, charSequenceLJIILLIIL, LJIILL(context, charSequenceLIZ), new AwS642S0100000_28(this, 91), new AwS607S0100000_28(this, 348), new AwS642S0100000_28(this, 92), LJIILIIL(zLJIILIIL), Intrinsics.LJFF(LJIJI().LLILLJJLI.getValue(), bool), LJIILJJIL(this.LLILLJJLI.LJI.invoke(bool).booleanValue()), false, null, false, new AwS144S0110000_28(this, zLJIILIIL, 7), 24064);
            this.LLILZIL.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            arrayList.add(c10fd);
        }
        return arrayList;
    }

    public C109D(C191888105e c191888105e, C191848103q c191848103q) {
        this.LLILLJJLI = c191888105e;
        this.LLILLL = c191848103q;
        this.LLILZIL = new C191984108w(c191888105e.LIZ, "Switch");
    }
}
