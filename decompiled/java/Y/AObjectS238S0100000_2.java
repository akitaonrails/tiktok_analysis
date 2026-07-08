package Y;

import X.C06PP;
import X.C0PEM;
import X.C1349805Qa;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C375830EoP;
import X.C389110FNl;
import X.InterfaceC1441305kZ;
import X.InterfaceC332260D0u;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.gamora.recorder.control.h;
import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS238S0100000_2 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    public AObjectS238S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS238S0100000_2 aObjectS238S0100000_2, Object obj) {
        ((C389110FNl) aObjectS238S0100000_2.l0).LLJLILLLLZIIL.LJII(new C375830EoP<>(Unit.LIZ));
    }

    public static final void onChanged$1(AObjectS238S0100000_2 aObjectS238S0100000_2, Object obj) {
        if (!((h) aObjectS238S0100000_2.l0).LLLIL) {
            ((h) aObjectS238S0100000_2.l0).LLLIL = true;
            h hVar = (h) aObjectS238S0100000_2.l0;
            hVar.getClass();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(hVar);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C06PP(hVar, null), 2);
        }
    }

    public static final void onChanged$2(AObjectS238S0100000_2 aObjectS238S0100000_2, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((e0) aObjectS238S0100000_2.l0), null, null, new C1349805Qa((e0) aObjectS238S0100000_2.l0, null), 3);
        }
    }

    public static final void onChanged$3(AObjectS238S0100000_2 aObjectS238S0100000_2, Object obj) {
        ((InterfaceC332260D0u) aObjectS238S0100000_2.l0).setValue(obj);
    }
}
