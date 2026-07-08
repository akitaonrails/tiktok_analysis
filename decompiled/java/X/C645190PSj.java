package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645190PSj<T> {
    public static final /* synthetic */ int LJI = 0;
    public final Function2<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final Function2<RecyclerView.ViewHolder, Integer, Unit> LIZIZ;
    public final C01GW LIZJ;
    public final C645250PSp LIZLLL;
    public final C0PTR<T> LJ;
    public final C0P8P LJFF;

    public final void LIZ() {
        C0PTR<T> c0ptr = this.LJ;
        if (c0ptr != null) {
            C0PTU<RecyclerView.ViewHolder> c0ptu = c0ptr.LJIIJJI;
            Iterator<T> it2 = c0ptu.LIZ.values().iterator();
            while (it2.hasNext()) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) it2.next();
                Iterator it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    ((Future) it3.next()).cancel(true);
                }
                copyOnWriteArrayList.clear();
            }
            c0ptu.LIZ.clear();
            c0ptu.LIZIZ.clear();
            C0PTQ<T> c0ptq = c0ptr.LJIIJ;
            Collection<C0PTW<T>> collectionValues = c0ptq.LJI.values();
            ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList();
            Iterator<T> it4 = collectionValues.iterator();
            while (it4.hasNext()) {
                RecyclerView.ViewHolder viewHolder = ((C0PTW) it4.next()).LIZJ;
                if (viewHolder != null) {
                    arrayList.add(viewHolder);
                }
            }
            for (RecyclerView.ViewHolder viewHolder2 : arrayList) {
                if (viewHolder2 != null) {
                    c0ptq.LIZ.getRecycledViewPool().putRecycledView(viewHolder2);
                }
            }
            c0ptq.LJI.clear();
            c0ptq.LJII.clear();
        }
    }

    public C645190PSj(RecyclerView recyclerView, C645270PSr<T> c645270PSr) {
        C645250PSp c645250PSp;
        Function2<ViewGroup, Integer, RecyclerView.ViewHolder> function2 = c645270PSr.LIZ;
        this.LIZ = function2;
        Function2<RecyclerView.ViewHolder, Integer, Unit> function22 = c645270PSr.LIZIZ;
        this.LIZIZ = function22;
        C645310PSv c645310PSv = c645270PSr.LIZJ;
        C645180PSi<T> c645180PSi = c645270PSr.LIZLLL;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(630));
        this.LIZJ = c01gwLIZIZ;
        if (c645310PSv == null) {
            c645250PSp = null;
        } else {
            c645250PSp = new C645250PSp(new C645260PSq(function2, (ExecutorService) c01gwLIZIZ.getValue(), c645310PSv.LIZ, c645310PSv.LIZIZ, c645310PSv.LIZJ));
        }
        this.LIZLLL = c645250PSp;
        C0PTR<T> c0ptr = c645180PSi != null ? new C0PTR<>(new C0PTT(recyclerView, (ExecutorService) c01gwLIZIZ.getValue(), function22, c645180PSi.LIZ, c645180PSi.LIZIZ, c645180PSi.LIZJ, c645180PSi.LIZLLL, c645180PSi.LJ, c645180PSi.LJFF)) : null;
        this.LJ = c0ptr;
        this.LJFF = new C0P8P(c0ptr);
    }
}
