package X;

import X.C11EV;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19464111Db<VH extends C11EV<?>> {
    public final SparseArray<Function1<ViewGroup, VH>> LIZ = new SparseArray<>();
    public int LIZIZ;
    public final List<C19464211Dc<VH>> LIZJ;
    public final C19464011Da LIZLLL;

    public void LIZJ(C11EV c11ev) {
        throw null;
    }

    public VH LIZLLL(ViewGroup viewGroup) {
        throw null;
    }

    public VH LJI(int i) {
        throw null;
    }

    public C19464111Db() {
        this.LIZIZ = 11513600;
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 787);
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(405);
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        this.LIZJ = C1697810uHb.LJIILJJIL(new C19464211Dc(awS608S0100000_29, aFwS271S0000000_28, i, null));
        this.LIZLLL = new C19464011Da();
    }

    public final int LIZIZ(int i) {
        C19464211Dc<VH> next;
        Iterator<C19464211Dc<VH>> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ.invoke(Integer.valueOf(i)).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C19464211Dc<VH> c19464211Dc = next;
        if (c19464211Dc != null) {
            Function1<ViewGroup, VH> function1 = c19464211Dc.LIZ;
            int i2 = c19464211Dc.LIZJ;
            if (this.LIZ.get(i2) == null) {
                this.LIZ.put(i2, function1);
            }
            return i2;
        }
        "no factory is registered for this item type".toString();
        throw new IllegalArgumentException("no factory is registered for this item type");
    }

    public final void LJ(RecyclerView recyclerView) {
        C19464011Da c19464011Da = this.LIZLLL;
        C11D6 c11d6 = c19464011Da.LIZIZ;
        c11d6.LLILLL = recyclerView;
        recyclerView.addOnAttachStateChangeListener(c11d6);
        c19464011Da.LIZJ = new C19464511Df();
        for (C19464211Dc<VH> c19464211Dc : this.LIZJ) {
            int i = c19464211Dc.LIZJ;
            Function2<Integer, RecyclerView, Unit> function2 = c19464211Dc.LIZLLL;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i), recyclerView);
            }
        }
    }

    public final C11EV LIZ(int i, ViewGroup viewGroup) {
        C11EV c11evLJI = LJI(i);
        if (c11evLJI == null) {
            if (this.LIZ.indexOfKey(i) >= 0) {
                VH vhInvoke = this.LIZ.get(i).invoke(viewGroup);
                LIZJ(vhInvoke);
                return vhInvoke;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no factory for viewType ");
            sbLIZ.append(i);
            sbLIZ.append(" is registered");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        return c11evLJI;
    }

    public final C19464111Db LJFF(Function1 function1, Function1 function12, Function2 function2) {
        int size = this.LIZJ.size();
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        ListProtector.add(this.LIZJ, size - 1, new C19464211Dc(function12, function1, i, function2));
        return this;
    }
}
