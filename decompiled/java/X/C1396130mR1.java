package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mR1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396130mR1 {
    public final C1749280vcc LIZ;
    public final RecyclerView LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final C19EG LJ;
    public final LifecycleOwner LJFF;
    public final C2385709Wl LJI;

    public final void LIZ(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        C1722300uv6 c1722300uv6;
        RecyclerView recyclerView = this.LIZIZ;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, i);
        View view = this.LIZJ;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        View view2 = this.LIZLLL;
        if (!z && !z2) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, view2);
        if (z) {
            C786410Ut5.LLLZLZ(this.LIZ, 8);
            return;
        }
        if (z2) {
            c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = this.LJ.getString(2131857691);
            c1722300uv6.LJIIIIZZ = this.LJ.getString(2131857692);
        } else {
            c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_person;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = this.LJ.getResources().getString(2131848036);
            c1722300uv6.LJIIIIZZ = this.LJ.getResources().getString(2131848037);
        }
        this.LIZ.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(this.LIZ, 0);
    }

    public C1396130mR1(C1749280vcc c1749280vcc, RecyclerView recyclerView, View view, View view2, C19EG c19eg, DialogC1396120mR0 dialogC1396120mR0, C2385709Wl c2385709Wl) {
        this.LIZ = c1749280vcc;
        this.LIZIZ = recyclerView;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = c19eg;
        this.LJFF = dialogC1396120mR0;
        this.LJI = c2385709Wl;
    }
}
