package X;

import Y.ARunnableS112S0100000_12;
import Y.AsS17S0110000_12;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781710UlV {
    public static final /* synthetic */ int LJIILL = 0;
    public final int LIZ;
    public final double LIZIZ;
    public final RecyclerView LIZJ;
    public final Function2<TreeMap<Integer, C781670UlR>, TreeMap<Integer, C781670UlR>, Unit> LIZLLL;
    public long LJ;
    public final TreeMap<Integer, C781670UlR> LJFF = new TreeMap<>();
    public final TreeMap<Integer, C781670UlR> LJI = new TreeMap<>();
    public final TreeMap<Integer, C781670UlR> LJII = new TreeMap<>();
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final ARunnableS112S0100000_12 LJIILIIL;
    public final ARunnableS112S0100000_12 LJIILJJIL;

    public final void LIZIZ() {
        this.LJIIIIZZ = false;
        C473410IhP.LIZ().removeCallbacks(this.LJIILIIL);
        this.LJIIL = false;
        this.LJ = 0L;
        this.LJI.clear();
        this.LJII.clear();
    }

    public final void LIZ() {
        for (Map.Entry<Integer, C781670UlR> entry : this.LJFF.entrySet()) {
            View view = entry.getValue().LIZIZ;
            if (view != null) {
                double dHeight = view.getGlobalVisibleRect(new Rect()) ? r3.height() : 0.0d;
                double dWidth = view.getGlobalVisibleRect(new Rect()) ? r6.width() : 0.0d;
                double measuredHeight = view.getMeasuredHeight();
                double d = !((measuredHeight > 0.0d ? 1 : (measuredHeight == 0.0d ? 0 : -1)) == 0) ? (dHeight / measuredHeight) * ((double) 100) : 0.0d;
                double measuredWidth = view.getMeasuredWidth();
                double d2 = measuredWidth != 0.0d ? ((double) 100) * (dWidth / measuredWidth) : 0.0d;
                if (this.LIZ != 0) {
                    d2 = d;
                }
                if (d2 > this.LIZIZ) {
                    C781670UlR value = entry.getValue();
                    value.getClass();
                    value.LIZJ = d;
                    if (!this.LJI.containsKey(entry.getKey())) {
                        this.LJII.put(entry.getKey(), value);
                    }
                    this.LJI.put(entry.getKey(), value);
                } else {
                    this.LJI.remove(entry.getKey());
                }
            }
        }
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ && (!this.LJI.isEmpty()) && System.currentTimeMillis() - this.LJIIJ > 100) {
            this.LJIIJ = System.currentTimeMillis();
            this.LIZLLL.invoke(this.LJII, this.LJI);
            this.LJII.clear();
        }
    }

    public final void LIZJ(boolean z) {
        this.LJIIIZ = 0;
        this.LJIIIIZZ = true;
        if (z) {
            C473410IhP.LIZJ(this.LJIILIIL, 500L);
        } else {
            LIZ();
            LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C781710UlV(int i, double d, RecyclerView recyclerView, Function2<? super TreeMap<Integer, C781670UlR>, ? super TreeMap<Integer, C781670UlR>, Unit> function2) {
        this.LIZ = i;
        this.LIZIZ = d;
        this.LIZJ = recyclerView;
        this.LIZLLL = function2;
        recyclerView.addOnScrollListener(new AsS17S0110000_12(this, 1));
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0UlW
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i2, int i3) {
                    this.LIZ.LJIIJJI = true;
                }

                @Override // X.AbstractC471570IeR
                public final void LIZJ(int i2, int i3, Object obj) {
                    this.LIZ.LJIIJJI = true;
                }
            });
        }
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0UlU
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                int position;
                RecyclerView.LayoutManager layoutManager = this.LL.LIZJ.getLayoutManager();
                if (layoutManager != null && (position = layoutManager.getPosition(view)) >= 0) {
                    C781710UlV c781710UlV = this.LL;
                    long j = c781710UlV.LJ;
                    c781710UlV.LJ = 1 + j;
                    view.setTag(Long.valueOf(j));
                    this.LL.LJFF.put(Integer.valueOf(position), new C781670UlR(position, view));
                }
                if (this.LL.LJIIJJI) {
                    Handler handlerLIZ = C473410IhP.LIZ();
                    C781710UlV c781710UlV2 = this.LL;
                    handlerLIZ.removeCallbacks(c781710UlV2.LJIILJJIL);
                    C786410Ut5.LJLIIL(200L, handlerLIZ, c781710UlV2.LJIILJJIL);
                }
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
                C781710UlV c781710UlV = this.LL;
                TreeMap<Integer, C781670UlR> treeMap = c781710UlV.LJFF;
                c781710UlV.getClass();
                for (Map.Entry<Integer, C781670UlR> entry : treeMap.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue().LIZIZ.getTag(), view.getTag())) {
                        int iIntValue = entry.getKey().intValue();
                        if (iIntValue >= 0) {
                            this.LL.LJFF.remove(Integer.valueOf(iIntValue));
                            this.LL.LJI.remove(Integer.valueOf(iIntValue));
                            return;
                        }
                        return;
                    }
                }
            }
        });
        this.LJIILIIL = new ARunnableS112S0100000_12(this, 416);
        this.LJIILJJIL = new ARunnableS112S0100000_12(this, 417);
    }
}
