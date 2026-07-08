package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971470bO5 extends AbstractC960460b6K<C971410bNz, C971480bO6> {
    public final Function1<Integer, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C971470bO5(Function1<? super Integer, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(viewGroup.getContext())), R.layout.hfe, viewGroup, false);
        int i = C971490bO7.LIZLLL / 2;
        C426750GoL.LJIIIZ(viewTd, Integer.valueOf(i), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(i), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
        return new C971480bO6(viewTd, this.LIZIZ);
    }
}
