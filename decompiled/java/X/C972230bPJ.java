package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import wh6.AbS505S0200000_15;

/* JADX INFO: renamed from: X.0bPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972230bPJ extends C0J8P<C960770b6p, C972220bPI> {
    public final InterfaceC972200bPG LIZIZ;
    public final Context LIZJ;
    public C972220bPI LIZLLL;
    public boolean LJ;
    public final Set<String> LJFF = new LinkedHashSet();

    public C972230bPJ(InterfaceC972200bPG interfaceC972200bPG, Context context) {
        this.LIZIZ = interfaceC972200bPG;
        this.LIZJ = context;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960770b6p c960770b6p) {
        C972220bPI c972220bPI = (C972220bPI) viewHolder;
        int i = 0;
        c972220bPI.setIsRecyclable(false);
        this.LIZLLL = c972220bPI;
        C426160GnO c426160GnO = (C426160GnO) c972220bPI.itemView.findViewById(R.id.i_5);
        c972220bPI.LL = c426160GnO;
        if (c426160GnO != null) {
            C972230bPJ c972230bPJ = c972220bPI.LLILZ;
            c426160GnO.setGravity(-1);
            c426160GnO.setShowMore(true);
            if (!c972230bPJ.LJ) {
                i = 2;
            }
            c426160GnO.setMaxTagLines(i);
        }
        View viewI5 = c972220bPI.I5(c972220bPI.LL);
        c972220bPI.LLILLJJLI = viewI5;
        C972230bPJ c972230bPJ2 = c972220bPI.LLILZ;
        LiveIconView liveIconView = (LiveIconView) viewI5.findViewById(R.id.lbg);
        if (liveIconView != null) {
            liveIconView.setIcon(R.raw.icon_chevron_down);
        }
        C786410Ut5.I7(new AbS505S0200000_15(c972230bPJ2, c972220bPI, 0), viewI5);
        View viewI52 = c972220bPI.I5(c972220bPI.LL);
        c972220bPI.LLILLL = viewI52;
        C972230bPJ c972230bPJ3 = c972220bPI.LLILZ;
        LiveIconView liveIconView2 = (LiveIconView) viewI52.findViewById(R.id.lbg);
        if (liveIconView2 != null) {
            liveIconView2.setIcon(R.raw.icon_chevron_up);
        }
        C786410Ut5.I7(new AbS505S0200000_15(c972230bPJ3, c972220bPI, 1), viewI52);
        c972220bPI.N5();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C972220bPI c972220bPI = new C972220bPI(this, C786410Ut5.Td(layoutInflater, R.layout.gh4, viewGroup, false));
        c972220bPI.setIsRecyclable(false);
        return c972220bPI;
    }
}
