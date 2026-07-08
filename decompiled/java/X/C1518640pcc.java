package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS308S0000000_23;

/* JADX INFO: renamed from: X.0pcc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518640pcc {
    public final Function2<List<C07YX>, Integer, Unit> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final Map<Integer, List<C07YX>> LIZLLL = new LinkedHashMap();
    public final Map<Integer, List<C07YX>> LJ = new LinkedHashMap();

    public final synchronized Pair<List<C07YX>, Integer> LIZ() {
        this.LIZJ++;
        if (this.LJ.isEmpty()) {
            return null;
        }
        List<C07YX> listRemove = this.LJ.remove(Integer.valueOf(this.LIZJ));
        if (listRemove == null) {
            return null;
        }
        return new Pair<>(listRemove, Integer.valueOf(this.LIZJ));
    }

    public final void LIZIZ() {
        Pair pair;
        int iIntValue;
        synchronized (this) {
            this.LIZIZ++;
            pair = null;
            if (!this.LIZLLL.isEmpty()) {
                List<C07YX> listRemove = this.LIZLLL.remove(Integer.valueOf(this.LIZIZ));
                if (listRemove != null) {
                    pair = new Pair(listRemove, Integer.valueOf(this.LIZIZ));
                }
            }
        }
        Pair<List<C07YX>, Integer> pairLIZ = LIZ();
        ArrayList arrayList = new ArrayList();
        if (pair != null) {
            arrayList.addAll((Collection) pair.getFirst());
            iIntValue = ((Number) pair.getSecond()).intValue();
        } else {
            iIntValue = 0;
        }
        if (pairLIZ != null) {
            arrayList.addAll(pairLIZ.getFirst());
            if (iIntValue == 0) {
                iIntValue = pairLIZ.getSecond().intValue();
            }
        }
        if (!arrayList.isEmpty()) {
            this.LIZ.invoke(arrayList, Integer.valueOf(iIntValue));
        }
    }

    public C1518640pcc(AFwS308S0000000_23 aFwS308S0000000_23) {
        this.LIZ = aFwS308S0000000_23;
    }
}
