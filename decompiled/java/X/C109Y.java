package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.109Y, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C109Y extends AbstractC191843103l {
    public final C191848103q LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public InterfaceC192003109p LLILZIL;
    public InterfaceC192004109q LLILZLL;
    public final C1727506pd LLIZ = new InterfaceC989510brB<PrivacySettingsRestriction>() { // from class: X.06pd
        @Override // X.InterfaceC989510brB
        public final void LLZZLLIL(PrivacySettingsRestriction privacySettingsRestriction) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL.LLILLJJLI.LIZJ), null, null, new C05A6(this.LL, null), 3);
        }
    };

    public List<AbstractC191840103i> LJIILJJIL(List<AbstractC191840103i> list) {
        return list;
    }

    public boolean LJIILL(boolean z) {
        return z;
    }

    public CharSequence LJIILLIIL(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
        return charSequence;
    }

    public boolean LJIJI(int i, View view) {
        return false;
    }

    public final int LJIILIIL() {
        InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
        if (interfaceC192004109q != null) {
            return interfaceC192004109q.LIZ();
        }
        return 0;
    }

    public final PrivacySettingsRestrictionItem LJIJ() {
        if (this.LLILLL.length() == 0) {
            return new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null);
        }
        C191880104w c191880104w = C191880104w.LIZ;
        String str = this.LLILLL;
        c191880104w.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(1, str);
        return privacySettingsRestrictionItemLJIIJJI == null ? new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null) : privacySettingsRestrictionItemLJIIJJI;
    }

    public final void LJIL() {
        InterfaceC192003109p interfaceC192003109p = this.LLILZIL;
        if (interfaceC192003109p == null) {
            return;
        }
        interfaceC192003109p.LIZIZ(LJ(this.LLILLJJLI.LIZ));
    }

    @Override // X.AbstractC191843103l
    public void LJII() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C1727506pd c1727506pd = this.LLIZ;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).add(c1727506pd);
        LJIL();
    }

    @Override // X.AbstractC191843103l
    public void LJIIIIZZ() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C1727506pd c1727506pd = this.LLIZ;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).remove(c1727506pd);
    }

    public void LJIJJ(int i, View view) {
        if (C1207604ny.LIZ() && LJIJ().disabledToast != null) {
            String str = LJIJ().disabledToast;
            if (str != null) {
                C191960107y.LIZJ(view, str);
                return;
            }
            return;
        }
        if (!C191985108x.LIZIZ(LJIJ(), view)) {
            return;
        }
        C191985108x.LIZ(C856230XiP.LIZ(LJIJ(), Integer.valueOf(i)), view);
    }

    public void LJIJJLI(int i, View view) {
        InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
        if (interfaceC192004109q != null) {
            interfaceC192004109q.LIZJ(i);
        }
        LJIL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06pd] */
    public C109Y(C191848103q c191848103q, String str, String str2) {
        this.LLILLJJLI = c191848103q;
        this.LLILLL = str;
        this.LLILZ = str2;
    }
}
