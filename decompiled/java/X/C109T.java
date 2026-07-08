package X;

import Y.ARunnableS114S0100000_14;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.109T, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C109T extends AbstractC191843103l implements InterfaceC191831102z {
    public final InterfaceC191996109i LLILLJJLI;
    public final C191848103q LLILLL;
    public final C191992109e LLILZ;
    public final C878940Ydw LLILZIL;
    public boolean LLILZLL;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.109r, X.109u] */
    public C192005109r LJIILJJIL() {
        final String str;
        C104A c104a;
        Object obj = this.LLILLJJLI;
        if (!(obj instanceof C104A) || (c104a = (C104A) obj) == null || (str = c104a.LIZ) == null) {
            str = "no_item_tag";
        }
        ?? r2 = new C192008109u(str) { // from class: X.109r
        };
        if (obj instanceof C191995109h) {
            r2.LIZIZ = ((C104A) obj).LIZ;
        }
        return r2;
    }

    public final PrivacySettingsRestrictionItem LJIILLIIL() {
        C191880104w c191880104w = C191880104w.LIZ;
        String strLJI = this.LLILLJJLI.LJI();
        c191880104w.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, strLJI);
        return privacySettingsRestrictionItemLJIIJJI == null ? new PrivacySettingsRestrictionItem(0, 0, null, 0, -1, null) : privacySettingsRestrictionItemLJIIJJI;
    }

    @Override // X.AbstractC191843103l
    public final void LJII() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C878940Ydw c878940Ydw = this.LLILZIL;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).add(c878940Ydw);
        this.LLILZ.LJFF(LJIILJJIL());
    }

    @Override // X.AbstractC191843103l
    public final void LJIIIIZZ() {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        C878940Ydw c878940Ydw = this.LLILZIL;
        c191879104vLIZIZ.getClass();
        ((CopyOnWriteArrayList) C191879104v.LIZIZ).remove(c878940Ydw);
        this.LLILZ.LIZLLL(LJIILJJIL());
    }

    public C192002109o LJIILIIL(int i) {
        C104A c104a;
        String str;
        Object next;
        Object obj = this.LLILLJJLI;
        if (obj instanceof C191995109h) {
            Iterator it2 = ((ArrayList) ((C191995109h) obj).LJIIIIZZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C191976108o) next).LJIIIIZZ == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C104A c104a2 = (C104A) next;
            if (c104a2 != null) {
                str = c104a2.LIZ;
                if (str == null) {
                }
            }
            str = "no_item_tag";
        } else {
            if ((obj instanceof C104A) && (c104a = (C104A) obj) != null) {
                str = c104a.LIZ;
                if (str == null) {
                }
            }
            str = "no_item_tag";
        }
        C192002109o c192002109o = new C192002109o(i, str);
        Object obj2 = this.LLILLJJLI;
        if (obj2 instanceof C191995109h) {
            c192002109o.LIZIZ = ((C104A) obj2).LIZ;
        }
        return c192002109o;
    }

    public String LJIILL(Context context) {
        String string;
        String strInvoke;
        if (LJIILLIIL().tipsType == 1) {
            C191960107y.LIZ();
            string = context.getString(2131847649);
        } else {
            string = null;
        }
        InterfaceC1631620sYq<C109T, Context, String, String> interfaceC1631620sYqLJ = this.LLILLJJLI.LJ();
        if (interfaceC1631620sYqLJ != null && (strInvoke = interfaceC1631620sYqLJ.invoke(this, context, string)) != null) {
            return strInvoke;
        }
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Ydw] */
    public C109T(InterfaceC191996109i interfaceC191996109i, C191848103q c191848103q) {
        this.LLILLJJLI = interfaceC191996109i;
        this.LLILLL = c191848103q;
        C19201910Af.LIZJ.getClass();
        this.LLILZ = new C191992109e(c191848103q);
        this.LLILZIL = new InterfaceC989510brB<PrivacySettingsRestriction>() { // from class: X.0Ydw
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacySettingsRestriction privacySettingsRestriction) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C862050Xrn(this.LL, null), 2);
            }
        };
        this.LLILZLL = true;
        new LinkedHashMap();
    }

    public /* bridge */ /* synthetic */ CharSequence LIZJ(Context context, CharSequence charSequence) {
        return LJIILL(context);
    }

    public boolean LJIIZILJ(int i, View view) {
        if (this.LLILZLL) {
            this.LLILZLL = false;
            HandlerHook.viewPostDelay(view, new ARunnableS114S0100000_14(this, 42), 500L);
            if (!this.LLILZLL) {
                this.LLILZ.LIZ(LJIILIIL(i));
                InterfaceC1631620sYq<C109T, View, Integer, Boolean> interfaceC1631620sYqLIZJ = this.LLILLJJLI.LIZJ();
                if (interfaceC1631620sYqLIZJ == null) {
                    return false;
                }
                return interfaceC1631620sYqLIZJ.invoke(this, view, Integer.valueOf(i)).booleanValue();
            }
        }
        return true;
    }

    public void LJIJ(int i, View view) {
        this.LLILZ.LJ(LJIILIIL(i));
        InterfaceC1631620sYq<C109T, View, Integer, Unit> interfaceC1631620sYqLJFF = this.LLILLJJLI.LJFF();
        if (interfaceC1631620sYqLJFF != null) {
            interfaceC1631620sYqLJFF.invoke(this, view, Integer.valueOf(i));
        }
    }
}
