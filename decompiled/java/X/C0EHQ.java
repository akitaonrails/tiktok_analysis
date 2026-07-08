package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EHQ extends AbstractC1585810rMx {
    public final RecyclerView LL;
    public final Function2<C361980EHc, Integer, Unit> LLILLL;
    public final Function1<List<C361980EHc>, Unit> LLILZ;
    public final float LLILLJJLI = 0.5f;
    public final HashSet<String> LLILZIL = new HashSet<>();

    public final void LJJIJIIJIL() {
        RecyclerView.LayoutManager layoutManager;
        int iFindLastVisibleItemPosition;
        int iFindFirstVisibleItemPosition;
        C0EJO c0ejo;
        ArrayList<C361980EHc> arrayList;
        Object c098200Yq;
        View viewFindViewByPosition;
        RecyclerView recyclerView = this.LL;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = -1;
            iFindFirstVisibleItemPosition = -1;
        }
        Pair pair = new Pair(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue == -1 || iIntValue2 == -1) {
            return;
        }
        RecyclerView recyclerView2 = this.LL;
        AbstractC21673619ry adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        if (!(adapter instanceof C0EJO) || (c0ejo = (C0EJO) adapter) == null || (arrayList = c0ejo.LL) == null) {
            return;
        }
        Function1<List<C361980EHc>, Unit> function1 = this.LLILZ;
        int i = iIntValue2 + 1;
        List<C361980EHc> listSubList = C13BV.INSTANCE;
        try {
            listSubList = arrayList.subList(iIntValue, i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        function1.invoke(listSubList);
        if (iIntValue > iIntValue2) {
            return;
        }
        while (true) {
            C361980EHc c361980EHc = (C361980EHc) C13LP.LJJJLZIJ(iIntValue, arrayList);
            if (c361980EHc != null && !this.LLILZIL.contains(c361980EHc.LJI) && (viewFindViewByPosition = layoutManager.findViewByPosition(iIntValue)) != null) {
                Rect rect = new Rect();
                if (viewFindViewByPosition.getLocalVisibleRect(rect)) {
                    double height = viewFindViewByPosition.getHeight();
                    double width = viewFindViewByPosition.getWidth();
                    double d = rect.left;
                    double d2 = rect.top;
                    double d3 = rect.right;
                    double d4 = rect.bottom;
                    if ((d == 0.0d ? d3 == width ? d2 == 0.0d ? d4 == height ? 1.0d : d4 / height : (height - d2) / height : d3 / width : (width - d) / width) >= this.LLILLJJLI) {
                        this.LLILZIL.add(c361980EHc.LJI);
                        this.LLILLL.invoke(c361980EHc, Integer.valueOf(iIntValue));
                    }
                }
            }
            if (iIntValue == iIntValue2) {
                return;
            } else {
                iIntValue++;
            }
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIJIIJIL();
        }
    }

    public C0EHQ(RecyclerView recyclerView, Function2 function2, Function1 function1) {
        this.LL = recyclerView;
        this.LLILLL = function2;
        this.LLILZ = function1;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LJJIJIIJIL();
    }
}
