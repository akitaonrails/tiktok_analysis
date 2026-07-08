package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1046, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1046 extends AbstractC191841103j implements InterfaceC191854103w {
    public final int LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final boolean LJFF;
    public boolean LJI = false;
    public boolean LJII = false;
    public final int LJIIIIZZ = R.layout.bet;

    @Override // X.AbstractC191841103j
    public final int LJFF() {
        return this.LJIIIIZZ;
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
        AnonymousClass1046 anonymousClass1046;
        C127K c127k;
        if ((abstractC191840103i instanceof AnonymousClass1046) && (anonymousClass1046 = (AnonymousClass1046) abstractC191840103i) != null && (c127k = (C127K) c191838103g.itemView.findViewById(R.id.l1c)) != null) {
            View viewFindViewById = c127k.findViewById(R.id.wmy);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), false, 23);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            AnonymousClass1046 anonymousClass10462 = (AnonymousClass1046) abstractC191840103i;
            c419910GdJ.LIZ = anonymousClass10462.LIZJ;
            c127k.setIcon(c419910GdJ);
            c127k.setTitle(anonymousClass10462.LIZLLL);
            c127k.setSubtitle(anonymousClass10462.LJ);
            c127k.setWithSeparator(anonymousClass10462.LJFF);
            c127k.LJ(anonymousClass1046.LJI, anonymousClass1046.LJII);
        }
    }

    public AnonymousClass1046(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.LIZJ = i;
        this.LIZLLL = charSequence;
        this.LJ = charSequence2;
        this.LJFF = z;
    }
}
