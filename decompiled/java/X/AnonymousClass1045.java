package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1045, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1045 extends AbstractC191841103j implements InterfaceC191854103w {
    public final CharSequence LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;
    public final int LJFF = R.layout.bec;
    public boolean LJI = false;
    public boolean LJII = false;

    @Override // X.AbstractC191841103j
    public final int LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC191854103w
    public final boolean x0() {
        return this.LJI;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZJ(boolean z) {
        this.LJII = z;
    }

    @Override // X.InterfaceC191854103w
    public final void LIZLLL(boolean z) {
        this.LJI = z;
    }

    @Override // X.InterfaceC191837103f
    public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
        AnonymousClass1045 anonymousClass1045;
        C127K c127k;
        if ((abstractC191840103i instanceof AnonymousClass1045) && (anonymousClass1045 = (AnonymousClass1045) abstractC191840103i) != null && (c127k = (C127K) c191838103g.itemView.findViewById(R.id.l1c)) != null) {
            c127k.setTitle(anonymousClass1045.LIZJ);
            c127k.setWithSeparator(anonymousClass1045.LJ);
            Integer num = anonymousClass1045.LIZLLL;
            if (num != null) {
                int iIntValue = num.intValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = iIntValue;
                c127k.setIcon(c419910GdJ);
            }
            c127k.LJ(anonymousClass1045.LJI, anonymousClass1045.LJII);
        }
    }

    public AnonymousClass1045(CharSequence charSequence, Integer num, boolean z) {
        this.LIZJ = charSequence;
        this.LIZLLL = num;
        this.LJ = z;
    }
}
