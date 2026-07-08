package X;

import Y.ARunnableS112S0100000_12;
import Y.AsS39S0100000_12;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781660UlQ {
    public final RecyclerView LIZ;
    public final Function2<TreeMap<Integer, C781670UlR>, TreeMap<Integer, C781670UlR>, Unit> LIZIZ;
    public long LIZJ;
    public final TreeMap<Integer, C781670UlR> LIZLLL = new TreeMap<>();
    public final TreeMap<Integer, C781670UlR> LJ = new TreeMap<>();
    public final TreeMap<Integer, C781670UlR> LJFF = new TreeMap<>();
    public boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final ARunnableS112S0100000_12 LJIILIIL;
    public final ARunnableS112S0100000_12 LJIILJJIL;

    public final void LIZIZ() {
        this.LJI = false;
        C473410IhP.LIZ().removeCallbacks(this.LJIILIIL);
        this.LJIIJ = false;
        this.LIZJ = 0L;
        this.LJ.clear();
        this.LJFF.clear();
    }

    public final void LIZ() {
        for (Map.Entry<Integer, C781670UlR> entry : this.LIZLLL.entrySet()) {
            View view = entry.getValue().LIZIZ;
            if (view != null) {
                double dHeight = view.getGlobalVisibleRect(new Rect()) ? r1.height() : 0.0d;
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    rect.width();
                }
                double measuredHeight = view.getMeasuredHeight();
                double d = measuredHeight == 0.0d ? 0.0d : (dHeight / measuredHeight) * ((double) 100);
                view.getMeasuredWidth();
                if (d > 0.0d) {
                    C781670UlR value = entry.getValue();
                    value.getClass();
                    value.LIZJ = d;
                    if (!this.LJ.containsKey(entry.getKey())) {
                        this.LJFF.put(entry.getKey(), value);
                    }
                    this.LJ.put(entry.getKey(), value);
                } else {
                    this.LJ.remove(entry.getKey());
                }
            }
        }
    }

    public final void LIZLLL() {
        Integer numValueOf;
        if (this.LJI) {
            C473410IhP.LIZ().removeCallbacks(this.LJIILJJIL);
            if (!(!this.LJ.isEmpty()) || System.currentTimeMillis() - this.LJIIIIZZ <= 100) {
                return;
            }
            this.LJIIIIZZ = System.currentTimeMillis();
            TreeMap<Integer, C781670UlR> treeMap = new TreeMap<>();
            TreeMap<Integer, C781670UlR> treeMap2 = new TreeMap<>();
            for (Map.Entry<Integer, C781670UlR> entry : this.LJ.entrySet()) {
                RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
                if (layoutManager != null && (numValueOf = Integer.valueOf(layoutManager.getPosition(entry.getValue().LIZIZ))) != null) {
                    C781670UlR c781670UlR = new C781670UlR(numValueOf.intValue(), entry.getValue().LIZIZ);
                    treeMap.put(numValueOf, c781670UlR);
                    if (this.LJFF.containsKey(entry.getKey())) {
                        treeMap2.put(numValueOf, c781670UlR);
                    }
                }
            }
            this.LIZIZ.invoke(treeMap2, treeMap);
            this.LJFF.clear();
        }
    }

    public final void LIZJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:manual", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = 0;
        this.LJI = true;
        if (z) {
            C473410IhP.LIZJ(this.LJIILIIL, 500L);
        } else {
            LIZ();
            LIZLLL();
        }
    }

    public C781660UlQ(RunnableC781530UlD runnableC781530UlD, AwS626S0100000_12 awS626S0100000_12) {
        this.LIZ = runnableC781530UlD;
        this.LIZIZ = awS626S0100000_12;
        runnableC781530UlD.addOnScrollListener(new AsS39S0100000_12(this, 8));
        AbstractC21673619ry adapter = runnableC781530UlD.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0UlS
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:insert", String.valueOf(this.LIZ.hashCode()));
                    this.LIZ.LJIIIZ = true;
                }

                @Override // X.AbstractC471570IeR
                public final void LIZJ(int i, int i2, Object obj) {
                    C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:change", String.valueOf(this.LIZ.hashCode()));
                    this.LIZ.LJIIIZ = true;
                }
            });
        }
        runnableC781530UlD.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0UlP
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                double dHeight;
                double d;
                int position;
                View view2;
                RecyclerView.LayoutManager layoutManager;
                Integer numValueOf;
                int iIntValue;
                C781670UlR c781670UlR;
                RecyclerView.LayoutManager layoutManager2 = this.LL.LIZ.getLayoutManager();
                if (layoutManager2 != null && (position = layoutManager2.getPosition(view)) >= 0) {
                    C781660UlQ c781660UlQ = this.LL;
                    long j = c781660UlQ.LIZJ;
                    c781660UlQ.LIZJ = 1 + j;
                    view.setTag(Long.valueOf(j));
                    C781670UlR c781670UlR2 = new C781670UlR(position, view);
                    do {
                        C781670UlR c781670UlR3 = this.LL.LIZLLL.get(Integer.valueOf(position));
                        if (c781670UlR3 != null && (view2 = c781670UlR3.LIZIZ) != null && (layoutManager = this.LL.LIZ.getLayoutManager()) != null && (numValueOf = Integer.valueOf(layoutManager.getPosition(view2))) != null && (iIntValue = numValueOf.intValue()) != -1) {
                            if (position == iIntValue) {
                                break;
                            }
                            c781670UlR = this.LL.LIZLLL.get(Integer.valueOf(position));
                            this.LL.LIZLLL.put(Integer.valueOf(position), c781670UlR2);
                            position = iIntValue;
                            c781670UlR2 = c781670UlR;
                        } else {
                            this.LL.LIZLLL.put(Integer.valueOf(position), c781670UlR2);
                            break;
                        }
                    } while (c781670UlR != null);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(view);
                sbLIZ.append((char) 65292);
                this.LL.getClass();
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    dHeight = rect.height();
                } else {
                    dHeight = 0.0d;
                }
                Rect rect2 = new Rect();
                if (view.getGlobalVisibleRect(rect2)) {
                    rect2.width();
                }
                double measuredHeight = view.getMeasuredHeight();
                boolean z = true;
                if (measuredHeight == 0.0d) {
                    d = 0.0d;
                } else {
                    d = (dHeight / measuredHeight) * ((double) 100);
                }
                view.getMeasuredWidth();
                C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:percent", String.valueOf(d));
                if (d <= 0.0d) {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(", ");
                sbLIZ.append(this.LL.hashCode());
                C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:view_add0", C2188811AlT.LIZIZ(sbLIZ));
                C781660UlQ c781660UlQ2 = this.LL;
                if (c781660UlQ2.LJIIIZ) {
                    if (c781660UlQ2.LJIIL) {
                        c781660UlQ2.LJIIL = false;
                        return;
                    }
                    Handler handlerLIZ = C473410IhP.LIZ();
                    C781660UlQ c781660UlQ3 = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(view);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(c781660UlQ3.hashCode());
                    C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:view_add", C2188811AlT.LIZIZ(sbLIZ2));
                    handlerLIZ.removeCallbacks(c781660UlQ3.LJIILJJIL);
                    C786410Ut5.LJLIIL(1200L, handlerLIZ, c781660UlQ3.LJIILJJIL);
                }
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(view);
                sbLIZ.append(", ");
                sbLIZ.append(this.LL.hashCode());
                C20441214yg.LIZIZ("livesdk_live_karaoke_song_show:remove", C2188811AlT.LIZIZ(sbLIZ));
                C781660UlQ c781660UlQ = this.LL;
                TreeMap<Integer, C781670UlR> treeMap = c781660UlQ.LIZLLL;
                c781660UlQ.getClass();
                for (Map.Entry<Integer, C781670UlR> entry : treeMap.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue().LIZIZ.getTag(), view.getTag())) {
                        int iIntValue = entry.getKey().intValue();
                        if (iIntValue >= 0) {
                            this.LL.LIZLLL.remove(Integer.valueOf(iIntValue));
                            this.LL.LJ.remove(Integer.valueOf(iIntValue));
                            return;
                        }
                        return;
                    }
                }
            }
        });
        this.LJIILIIL = new ARunnableS112S0100000_12(this, 415);
        this.LJIILJJIL = new ARunnableS112S0100000_12(this, 418);
    }
}
