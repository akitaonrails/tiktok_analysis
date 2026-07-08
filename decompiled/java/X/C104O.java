package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.104O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C104O extends AnonymousClass1931<C104N, C1178304jF, Unit> {
    public static Object LJII(AbstractC191840103i abstractC191840103i) {
        String simpleName;
        int iHashCode;
        if (abstractC191840103i instanceof AnonymousClass1088) {
            return "tpsc_radio_title";
        }
        if (abstractC191840103i instanceof C109B) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tpsc_radio_opt_");
            C109B c109b = (C109B) abstractC191840103i;
            sbLIZ.append(c109b.LIZLLL.hashCode());
            sbLIZ.append('_');
            CharSequence charSequence = c109b.LJ;
            if (charSequence != null) {
                iHashCode = charSequence.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tpsc_");
        sbLIZ2.append(abstractC191840103i.getClass().getName());
        sbLIZ2.append('_');
        if (abstractC191840103i instanceof AnonymousClass1088) {
            simpleName = ((AnonymousClass1088) abstractC191840103i).LIZJ.toString();
        } else if (abstractC191840103i instanceof C109B) {
            simpleName = ((C109B) abstractC191840103i).LIZLLL.toString();
        } else {
            simpleName = abstractC191840103i.getClass().getSimpleName();
        }
        sbLIZ2.append(simpleName.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.AnonymousClass1931
    public final void LJFF(AbstractC1738640vLS abstractC1738640vLS) {
        C104N c104n = (C104N) abstractC1738640vLS;
        for (RecyclerView.ViewHolder viewHolder : c104n.LLILLJJLI.values()) {
            C786410Ut5.LJJL(viewHolder.itemView, c104n.LL);
        }
        c104n.LLILLJJLI.clear();
    }

    @Override // X.AnonymousClass1931
    public final void LJI(AbstractC1738640vLS abstractC1738640vLS) {
        AwS572S0100000_28 awS572S0100000_28 = ((C104N) abstractC1738640vLS).LLILLL;
        if (awS572S0100000_28 != null) {
            awS572S0100000_28.invoke();
        }
    }

    @Override // X.AnonymousClass1931
    public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        return new C104N(linearLayout);
    }

    @Override // X.AnonymousClass1931
    public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
        C104N c104n = (C104N) abstractC1738640vLS;
        LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.05n1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1178304jF) obj2).LIZ;
            }
        }), c104n, Lifecycle.State.STARTED, new C104M(this, c104n));
    }
}
