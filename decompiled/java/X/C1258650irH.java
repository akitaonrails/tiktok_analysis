package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0irH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258650irH extends AbstractC1585810rMx {
    public final GridLayoutManager LL;
    public final C1258710irN LLILLJJLI;
    public final InterfaceC1259140is4 LLILLL;
    public final List<Runnable> LLILZ = new ArrayList();
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = C2187451AjH.LIZ;
                    return;
                }
                return;
            }
            this.LLILZIL.set(true);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrollStateChanged: DRAGGING. lastDy = ");
            sbLIZ.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C299890BpD.LIZ()) {
                if (this.LLIZLLLIL <= 0) {
                    return;
                }
                LJJIJIIJIL(-1, "load_more_scroll_dragging");
                return;
            }
            LJJIJIIJIL(-1, "load_more_scroll_dragging");
            return;
        }
        this.LLILZIL.set(false);
        if (recyclerView != null) {
            HandlerHook.viewPostDelay(recyclerView, new RunnableC514501zT(recyclerView, this, 46), 100L);
        }
        if (!C299890BpD.LIZ() || this.LLIZLLLIL > 0) {
            LJJIJIIJIL(-1, "load_more_scroll_idle");
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onScrollStateChanged: IDLE. lastDy = ");
        sbLIZ2.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJJIJIIJIL(int i, String str) {
        int height;
        InterfaceC1259140is4 interfaceC1259140is4 = this.LLILLL;
        int height2 = 0;
        if (interfaceC1259140is4 != null && !interfaceC1259140is4.LIZIZ()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check list no more, source = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        int iFindLastVisibleItemPosition = this.LL.findLastVisibleItemPosition();
        int itemCount = this.LL.getItemCount();
        if (this.LLILZLL <= 0) {
            View childAt = this.LL.getChildAt(0);
            if (childAt != null) {
                height = childAt.getHeight();
            } else {
                height = 0;
            }
            View childAt2 = this.LL.getChildAt(iFindLastVisibleItemPosition);
            if (childAt2 != null) {
                height2 = childAt2.getHeight();
            }
            this.LLILZLL = Math.max(height, height2);
        }
        if (this.LLIZ <= 0) {
            this.LLIZ = this.LL.LLILLJJLI;
        }
        this.LLILLJJLI.LIZ(iFindLastVisibleItemPosition, itemCount, this.LLILZLL, this.LLIZ, str, this.LLILLL, i);
    }

    public C1258650irH(GridLayoutManager gridLayoutManager, C1258710irN c1258710irN, C1258940irk c1258940irk) {
        this.LL = gridLayoutManager;
        this.LLILLJJLI = c1258710irN;
        this.LLILLL = c1258940irk;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        this.LLIZLLLIL = i2;
    }
}
