package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930090aJL extends AbstractC960460b6K<C930130aJP, C930080aJK> {
    public final Function1<Integer, Unit> LIZIZ;
    public final C930100aJM LIZJ = new Object() { // from class: X.0aJM
        {
            new HashSet();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0aJM] */
    public C930090aJL(Function1<? super Integer, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.AbstractC960460b6K, X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        getClass();
    }

    @Override // X.AbstractC960460b6K
    /* JADX INFO: renamed from: LJIIIIZZ */
    public final void LJII(AbstractC960470b6L abstractC960470b6L) {
        abstractC960470b6L.getClass();
        getClass();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C930080aJK(C786410Ut5.Td(layoutInflater, R.layout.hej, viewGroup, false), this.LIZIZ, this.LIZJ);
    }
}
