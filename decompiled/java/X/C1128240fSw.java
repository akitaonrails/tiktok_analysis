package X;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0fSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128240fSw {
    public static final /* synthetic */ int LJIIJJI = 0;
    public int LJI;
    public int LJII;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final LongSparseArray<Long> LIZJ = new LongSparseArray<>();
    public final LongSparseArray<Long> LIZLLL = new LongSparseArray<>();
    public final LongSparseArray<Integer> LJ = new LongSparseArray<>();
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LJFF = new LinkedList<>();
    public final LinkedList<Long> LJIIIIZZ = new LinkedList<>();
    public final LinkedList<Long> LJIIIZ = new LinkedList<>();
    public boolean LJIIJ = true;

    public final int LIZ() {
        Iterator<Long> it2 = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            if (this.LIZJ.get(jLongValue) != null || this.LJIIIZ.contains(Long.valueOf(jLongValue))) {
                i++;
            }
        }
        return i;
    }

    public final int LIZIZ() {
        Iterator<Long> it2 = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Integer num = this.LJ.get(it2.next().longValue());
            if (num != null && num.intValue() == 0) {
                i++;
            }
        }
        return i;
    }

    public final void LIZJ() {
        if (LIZIZ() == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_panel_gift_icon_load");
        c474500IjALIZ.LJJII(Integer.valueOf(C1130100fVw.LIZ.LJFF), "tab_id");
        Iterator<Long> it2 = this.LJIIIIZZ.iterator();
        long j = 0;
        while (it2.hasNext()) {
            long jLongValue = it2.next().longValue();
            long jLongValue2 = this.LIZJ.get(jLongValue).longValue() - this.LIZLLL.get(jLongValue).longValue();
            if (jLongValue2 > j) {
                j = jLongValue2;
            }
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_icon_load_duration_ms");
        c474500IjALIZ.LJJII(Integer.valueOf(GiftManager.inst().getTabLocation(C1130100fVw.LIZ.LJFF)), "page_position");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJII), "gift_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ()), "no_cache_gift_cnt");
        Iterator<Long> it3 = this.LJIIIIZZ.iterator();
        int i = 0;
        while (it3.hasNext()) {
            if (this.LJIIIZ.contains(Long.valueOf(it3.next().longValue()))) {
                i++;
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "no_cache_gift_fail_cnt");
        int iLIZIZ = LIZIZ();
        Iterator<Long> it4 = this.LJIIIIZZ.iterator();
        long jLongValue3 = 0;
        while (it4.hasNext()) {
            long jLongValue4 = it4.next().longValue();
            Integer num = this.LJ.get(jLongValue4);
            if (num != null && num.intValue() == 0) {
                jLongValue3 += this.LIZJ.get(jLongValue4).longValue() - this.LIZLLL.get(jLongValue4).longValue();
            }
        }
        c474500IjALIZ.LJJII(Long.valueOf(iLIZIZ != 0 ? jLongValue3 / ((long) iLIZIZ) : 0L), "no_cache_gift_load_duration_ms_avg");
        c474500IjALIZ.LJJII("1", "is_swipe");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        Iterator<Long> it5 = this.LJIIIIZZ.iterator();
        while (it5.hasNext()) {
            this.LJ.put(it5.next().longValue(), 1);
        }
    }

    public final void LIZLLL(long j) {
        this.LIZJ.put(j, Long.valueOf(C158B.LIZ()));
        if (this.LJIIIIZZ.contains(Long.valueOf(j))) {
            this.LJI++;
        }
        if (this.LJI == this.LJII && this.LJIIJ) {
            this.LJIIJ = false;
            LIZJ();
        }
    }

    public final void LJ(long j) {
        this.LIZJ.put(j, Long.valueOf(C158B.LIZ()));
        if (this.LJIIIIZZ.contains(Long.valueOf(j))) {
            this.LJI++;
        }
        this.LJIIIZ.add(Long.valueOf(j));
        if (this.LJI == this.LJII && this.LJIIJ) {
            this.LJIIJ = false;
            LIZJ();
        }
    }

    public final void LJFF(long j) {
        this.LIZLLL.put(j, Long.valueOf(C158B.LIZ()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(int i) {
        int size;
        long jLJI;
        if (this.LIZIZ == i) {
            return;
        }
        this.LIZIZ = i;
        int size2 = ((this.LJFF.size() - 1) / 8) + 1;
        int size3 = ((this.LJFF.size() - 1) / 8) * 8;
        if (i == size2 - 1) {
            size = this.LJFF.size() - size3;
        } else {
            size = 8;
        }
        this.LJII = size;
        this.LJIIIIZZ.clear();
        Iterator it2 = C13LP.LLIIL(this.LJFF).iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            int i2 = indexedValue.LIZ;
            if (i2 >= i * 8 && i2 < Math.min((i + 1) * 8, this.LJFF.size())) {
                LinkedList<Long> linkedList = this.LJIIIIZZ;
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) indexedValue.LIZIZ;
                if (abstractC1126600fQI != null) {
                    jLJI = abstractC1126600fQI.LJI();
                } else {
                    jLJI = 0;
                }
                linkedList.add(Long.valueOf(jLJI));
            }
        }
        int iLIZ = LIZ();
        this.LJI = iLIZ;
        this.LJIIJ = true;
        if (iLIZ == this.LJII) {
            this.LJIIJ = false;
            try {
                LIZJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJII(int i, LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList) {
        if (this.LIZ == i) {
            return;
        }
        this.LIZIZ = -1;
        this.LJIIJ = true;
        this.LIZ = i;
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LIZJ.clear();
        this.LJFF.clear();
        this.LJFF.addAll(linkedList);
    }
}
