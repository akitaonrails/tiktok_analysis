package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bP5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972090bP5 extends C0J8P<C086900Uh, C972100bP6> {
    public final Function0<Unit> LIZIZ;

    public C972090bP5(Function0<Unit> function0) {
        this.LIZIZ = function0;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C086900Uh c086900Uh) {
        C972100bP6 c972100bP6 = (C972100bP6) viewHolder;
        c972100bP6.getAdapterPosition();
        C500260Jjc.LJLIIIL(500L, c972100bP6.LLILLJJLI, new AwS594S0100000_15(c972100bP6, 34));
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C972100bP6(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.h_s, viewGroup, false), this.LIZIZ);
    }
}
