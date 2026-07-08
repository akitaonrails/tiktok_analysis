package X;

import Y.ACListenerS150S0100000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935900aSi extends AbstractC960460b6K<InterfaceC935960aSo, C935890aSh> {
    public final Function0<Unit> LIZIZ;

    public C935900aSi(C935860aSe c935860aSe) {
        this.LIZIZ = c935860aSe;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C935890aSh c935890aSh = new C935890aSh(viewGroup.getContext(), viewGroup);
        c935890aSh.LLILLJJLI.setIcon(C20736316Cj.LIZLLL(R.attr.cy2, viewGroup.getContext()));
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 191), c935890aSh.itemView);
        return c935890aSh;
    }
}
