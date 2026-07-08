package X;

import Y.AsS37S0200000_29;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.111l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC194339111l<T extends View> {
    public T LIZ;
    public SafeHandler LIZLLL;
    public final Map<RecyclerView, AbstractC1585810rMx> LIZIZ = new LinkedHashMap();
    public final Map<AbstractC21673619ry<RecyclerView.ViewHolder>, AbstractC471570IeR> LIZJ = new LinkedHashMap();
    public final C0FGI LJ = new C0FGI();
    public boolean LJFF = true;

    public abstract RecyclerView LIZLLL(T t);

    public abstract int LJ(T t);

    public final void LJIIIIZZ() {
        if (!this.LIZJ.isEmpty()) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
                    ((AbstractC21673619ry) entry.getKey()).unregisterAdapterDataObserver((AbstractC471570IeR) entry.getValue());
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            ((LinkedHashMap) this.LIZJ).clear();
        }
        if (!this.LIZIZ.isEmpty()) {
            try {
                for (Map.Entry entry2 : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                    ((RecyclerView) entry2.getKey()).removeOnScrollListener((AbstractC1585810rMx) entry2.getValue());
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            ((LinkedHashMap) this.LIZIZ).clear();
        }
        C0FGI c0fgi = this.LJ;
        ((LinkedHashMap) c0fgi.LIZIZ).clear();
        ((LinkedHashMap) c0fgi.LIZJ).clear();
        c0fgi.LIZLLL = null;
        SafeHandler safeHandler = this.LIZLLL;
        if (safeHandler != null) {
            safeHandler.destroy();
        }
        this.LIZLLL = null;
    }

    public final void LIZ(final T t) {
        try {
            RecyclerView recyclerViewLIZLLL = LIZLLL(t);
            Unit unit = null;
            if (recyclerViewLIZLLL != null) {
                if (((LinkedHashMap) this.LIZJ).get(recyclerViewLIZLLL.getAdapter()) != null) {
                    return;
                }
                AbstractC471570IeR abstractC471570IeR = new AbstractC471570IeR() { // from class: X.111j
                    @Override // X.AbstractC471570IeR
                    public final void LIZ() {
                        AbstractC194339111l<T> abstractC194339111l = this.LIZ;
                        AbstractC194339111l.LJI(abstractC194339111l, new AwS430S0200000_29(abstractC194339111l, (AbstractC194339111l<int>) t, 97));
                    }
                };
                AbstractC21673619ry adapter = recyclerViewLIZLLL.getAdapter();
                if (adapter != null) {
                    adapter.registerAdapterDataObserver(abstractC471570IeR);
                }
                AbstractC21673619ry<RecyclerView.ViewHolder> adapter2 = recyclerViewLIZLLL.getAdapter();
                if (adapter2 != null) {
                    this.LIZJ.put(adapter2, abstractC471570IeR);
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZIZ(T t) {
        Unit unit;
        try {
            RecyclerView recyclerViewLIZLLL = LIZLLL(t);
            if (recyclerViewLIZLLL != null) {
                if (((LinkedHashMap) this.LIZIZ).get(recyclerViewLIZLLL) != null) {
                    return;
                }
                AsS37S0200000_29 asS37S0200000_29 = new AsS37S0200000_29(this, t, 3);
                recyclerViewLIZLLL.addOnScrollListener(asS37S0200000_29);
                this.LIZIZ.put(recyclerViewLIZLLL, asS37S0200000_29);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJI(AbstractC194339111l abstractC194339111l, Function0 function0) {
        SafeHandler safeHandler = abstractC194339111l.LIZLLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        SafeHandler safeHandler2 = abstractC194339111l.LIZLLL;
        if (safeHandler2 != null) {
            safeHandler2.postDelayed(new RunnableC514801zW(function0, (Function0<Unit>) 128), 500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:2:0x0000, B:7:0x000e, B:8:0x0012, B:10:0x0016, B:19:0x002a, B:20:0x003f, B:14:0x001e, B:15:0x0022, B:17:0x0026), top: B:25:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(T r4, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r5) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r2 = r3.LIZLLL(r4)     // Catch: java.lang.Throwable -> L43
            boolean r0 = r3.LJFF     // Catch: java.lang.Throwable -> L43
            r1 = 0
            if (r0 == 0) goto L19
            if (r2 == 0) goto Lc
            goto Le
        Lc:
            r2 = r1
            goto L12
        Le:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()     // Catch: java.lang.Throwable -> L43
        L12:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L3f
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2     // Catch: java.lang.Throwable -> L43
            goto L28
        L19:
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = r1
            goto L22
        L1e:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()     // Catch: java.lang.Throwable -> L43
        L22:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L3f
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2     // Catch: java.lang.Throwable -> L43
        L28:
            if (r2 == 0) goto L3f
            int r1 = r2.findFirstCompletelyVisibleItemPosition()     // Catch: java.lang.Throwable -> L43
            int r0 = r2.findLastCompletelyVisibleItemPosition()     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L43
            r5.invoke(r1, r0)     // Catch: java.lang.Throwable -> L43
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L43
        L3f:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC194339111l.LIZJ(android.view.View, kotlin.jvm.functions.Function2):void");
    }

    public final void LJFF(T t, boolean z) {
        if (!z) {
            C0FGI c0fgi = this.LJ;
            ((LinkedHashMap) c0fgi.LIZIZ).clear();
            ((LinkedHashMap) c0fgi.LIZJ).clear();
            return;
        }
        LJI(this, new AwS430S0200000_29(this, (AbstractC194339111l<int>) t, 98));
    }

    public final void LJII(final T t, C0FGH c0fgh) {
        ViewTreeObserver viewTreeObserver;
        this.LIZ = t;
        if (t != null && (viewTreeObserver = t.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.111k
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2;
                    AbstractC194339111l<T> abstractC194339111l = this.LL;
                    T t2 = abstractC194339111l.LIZ;
                    if (t2 != 0) {
                        AbstractC194339111l.LJI(abstractC194339111l, new AwS273S0300000_29((AbstractC194339111l) abstractC194339111l, (AbstractC194339111l<int>) t2, (int) t, 20));
                    }
                    T t3 = this.LL.LIZ;
                    if (t3 == 0 || (viewTreeObserver2 = t3.getViewTreeObserver()) == null) {
                        return true;
                    }
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LIZLLL = new SafeHandler(ViewTreeLifecycleOwner.get(t));
        this.LJ.LIZLLL = c0fgh;
        LIZ(t);
        LIZIZ(t);
    }
}
