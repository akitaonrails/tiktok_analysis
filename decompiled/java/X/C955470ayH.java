package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0ayH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955470ayH extends AbstractC1585810rMx {
    public final Set<Object> LL = new LinkedHashSet();
    public final /* synthetic */ C955510ayL LLILLJJLI;

    public final void LJJIJIIJIL() {
        Iterator<Object> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            LJJIL(it2.next());
        }
        this.LL.clear();
    }

    public final void LJJIZ() {
        int iFindFirstVisibleItemPosition;
        int iFindLastCompletelyVisibleItemPosition;
        int iFindFirstCompletelyVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        C1117360fBO c1117360fBO;
        List<?> list;
        C955670ayb c955670ayb;
        if (this.LLILLJJLI.LIZ.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LLILLJJLI.LIZ.getLayoutManager();
            if (linearLayoutManager != null) {
                iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1) {
                    return;
                }
            } else {
                iFindFirstVisibleItemPosition = 0;
                iFindLastCompletelyVisibleItemPosition = 0;
                iFindFirstCompletelyVisibleItemPosition = 0;
                iFindLastVisibleItemPosition = 0;
            }
            AbstractC21673619ry adapter = this.LLILLJJLI.LIZ.getAdapter();
            if (!(adapter instanceof C1117360fBO) || (c1117360fBO = (C1117360fBO) adapter) == null || (list = c1117360fBO.LL) == null) {
                return;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = ListProtector.get(list, i);
                if ((obj instanceof C955670ayb) && (c955670ayb = (C955670ayb) obj) != null) {
                    c955670ayb.LIZIZ = iFindFirstCompletelyVisibleItemPosition <= i && i <= iFindLastCompletelyVisibleItemPosition;
                    c955670ayb.LIZJ = iFindFirstVisibleItemPosition <= i && i <= iFindLastVisibleItemPosition;
                }
                i++;
            }
        }
    }

    public C955470ayH(C955510ayL c955510ayL) {
        this.LLILLJJLI = c955510ayL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0678  */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [int] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955470ayH.LJJIL(java.lang.Object):void");
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL();
            LJJIZ();
            AbstractC960950b77 abstractC960950b77 = this.LLILLJJLI.LIZIZ;
            if (abstractC960950b77 != null) {
                abstractC960950b77.LJJIIZ();
            }
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int iFindLastCompletelyVisibleItemPosition;
        int iFindFirstCompletelyVisibleItemPosition;
        C1117360fBO c1117360fBO;
        List<?> list;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1) {
                    return;
                }
            } else {
                iFindLastCompletelyVisibleItemPosition = 0;
                iFindFirstCompletelyVisibleItemPosition = 0;
            }
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C1117360fBO) || (c1117360fBO = (C1117360fBO) adapter) == null || (list = c1117360fBO.LL) == null) {
                return;
            }
            if (i2 == 0) {
                LJJIJIIJIL();
                LJJIZ();
                if (iFindFirstCompletelyVisibleItemPosition > iFindLastCompletelyVisibleItemPosition) {
                    return;
                }
                while (iFindFirstCompletelyVisibleItemPosition < list.size()) {
                    LJJIL(ListProtector.get(list, iFindFirstCompletelyVisibleItemPosition));
                    if (iFindFirstCompletelyVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
                        return;
                    } else {
                        iFindFirstCompletelyVisibleItemPosition++;
                    }
                }
                return;
            }
            if (iFindLastCompletelyVisibleItemPosition >= list.size() || !(ListProtector.get(list, iFindLastCompletelyVisibleItemPosition) instanceof C955670ayb)) {
                return;
            }
            this.LL.add(ListProtector.get(list, iFindLastCompletelyVisibleItemPosition));
        }
    }
}
