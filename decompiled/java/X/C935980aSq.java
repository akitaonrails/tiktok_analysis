package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935980aSq extends AbstractC960460b6K<C936100aT2, C936090aT1> {
    public final Function1<C936100aT2, Unit> LIZIZ;
    public final Function1<C936100aT2, Unit> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C935980aSq(Function1<? super C936100aT2, Unit> function1, Function1<? super C936100aT2, Unit> function12) {
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C936090aT1(viewGroup.getContext(), viewGroup, this.LIZIZ, this.LIZJ);
    }
}
