package X;

import Y.ARunnableS43S0300000_10;
import Y.AsS37S0100000_10;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0P6H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6H<T> {
    public final C0P6B<T> LIZ;
    public final AbstractC683590Qrd<T> LIZIZ;
    public final RecyclerView LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public final AsS37S0100000_10 LJIIIIZZ = new AsS37S0100000_10(this, 10);

    public final void LIZ() {
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.LJIIIIZZ);
        }
        RecyclerView recyclerView2 = this.LIZJ;
        if ((recyclerView2 != null ? recyclerView2.getOnFlingListener() : null) instanceof C0P62) {
            return;
        }
        RecyclerView recyclerView3 = this.LIZJ;
        AbstractC1338480kw2 onFlingListener = recyclerView3 != null ? recyclerView3.getOnFlingListener() : null;
        RecyclerView recyclerView4 = this.LIZJ;
        if (recyclerView4 != null) {
            recyclerView4.setOnFlingListener(new C641190PCz(this, onFlingListener));
        }
    }

    public static String LIZIZ(List list) {
        if (list != null && !list.isEmpty()) {
            return (String) ListProtector.get(list, 0);
        }
        return "";
    }

    public final void LIZJ(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        int iFindLastVisibleItemPosition;
        List<T> data = null;
        if (recyclerView == null) {
            layoutManager = null;
        } else {
            try {
                layoutManager = recyclerView.getLayoutManager();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if ((layoutManager instanceof LinearLayoutManager) && recyclerView.isAttachedToWindow() && (iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition()) >= 0) {
            AbstractC683590Qrd<T> abstractC683590Qrd = this.LIZIZ;
            if (abstractC683590Qrd != null) {
                data = abstractC683590Qrd.getData();
            }
            LIZLLL(iFindLastVisibleItemPosition, data);
        }
    }

    public final void LIZLLL(int i, List list) {
        int i2;
        if (list == null || i <= this.LJII) {
            return;
        }
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        C118300cf c118300cf = new C118300cf();
        C0P6J.LIZ.getClass();
        int i3 = C0P6J.LIZ().prefetchCount + i2;
        c118300cf.element = i3;
        if (i3 >= list.size()) {
            c118300cf.element = list.size() - 1;
        }
        int i4 = this.LJFF;
        if (i4 != 0 && i4 < list.size()) {
            this.LJFF = list.size();
            c118300cf.element++;
        }
        int i5 = c118300cf.element;
        int i6 = this.LJ;
        if (i5 <= i6) {
            return;
        }
        this.LJII = i;
        if (i6 != 0) {
            i2 = i6;
        }
        this.LJI = i2;
        this.LJ = i5;
        C0P6B<T> c0p6b = this.LIZ;
        if (c0p6b instanceof C0P69) {
            C823050WQl.LIZJ().execute(new C0PQY(false, list, i2 + 1, 0L, i5, 24));
        } else {
            if (!(c0p6b instanceof C0P6A)) {
                return;
            }
            C823050WQl.LIZJ().execute(new ARunnableS43S0300000_10(list, c118300cf, this, 9));
        }
    }

    public C0P6H(C0P6B<T> c0p6b, AbstractC683590Qrd<T> abstractC683590Qrd, RecyclerView recyclerView) {
        this.LIZ = c0p6b;
        this.LIZIZ = abstractC683590Qrd;
        this.LIZJ = recyclerView;
    }
}
