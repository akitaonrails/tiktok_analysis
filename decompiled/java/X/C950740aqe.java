package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950740aqe extends AbstractC960460b6K<C950750aqf, C950730aqd> {
    public final Function0<C950690aqZ> LIZIZ;

    public C950740aqe(Function0<C950690aqZ> function0) {
        this.LIZIZ = function0;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C950730aqd(C786410Ut5.Td(layoutInflater, R.layout.g48, viewGroup, false), this.LIZIZ);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        C950730aqd c950730aqd = (C950730aqd) viewHolder;
        C950750aqf c950750aqf = (C950750aqf) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() == C950760aqg.LIZ) {
                    if (c950750aqf.LIZIZ) {
                        View view = c950730aqd.LLILLL;
                        if (view == null) {
                            return;
                        }
                        C12ES.LJIILL(0, view);
                        return;
                    }
                    View view2 = c950730aqd.LLILLL;
                    if (view2 == null) {
                        return;
                    }
                    C12ES.LJIILL(4, view2);
                    return;
                }
            }
        }
        LIZJ(c950730aqd, c950750aqf);
    }
}
