package X;

import android.graphics.Rect;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318020kP2 implements InterfaceC1319180kQu {
    public final AbstractC1298750jtx LIZ;
    public final BPEAHandler LIZIZ;
    public final RunnableC787520Uus LIZJ;
    public final RecyclerView LIZLLL;
    public C787550Uuv LJ;
    public ViewTreeObserverOnDrawListenerC787530Uut LJFF;
    public ViewTreeObserverOnScrollChangedListenerC787540Uuu LJI;
    public final HashSet<C1318030kP3> LJII = new HashSet<>();
    public final Rect LJIIIIZZ;
    public final int[] LJIIIZ;
    public final Rect LJIIJ;
    public long LJIIJJI;

    @Override // X.InterfaceC1319180kQu
    public final void LIZ(C1318570kPv c1318570kPv) {
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZIZ() {
        LJ(false);
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZJ(C1318570kPv c1318570kPv) {
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZLLL(C1318570kPv c1318570kPv) {
    }

    @Override // X.InterfaceC1319180kQu
    public final void dispose() {
        this.LIZIZ.removeCallbacks(this.LIZJ);
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            C787550Uuv c787550Uuv = this.LJ;
            if (c787550Uuv != null) {
                recyclerView.removeOnScrollListener(c787550Uuv);
                this.LJ = null;
            }
            ViewTreeObserver viewTreeObserver = this.LIZLLL.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserverOnDrawListenerC787530Uut viewTreeObserverOnDrawListenerC787530Uut = this.LJFF;
                if (viewTreeObserverOnDrawListenerC787530Uut != null) {
                    viewTreeObserver.removeOnDrawListener(viewTreeObserverOnDrawListenerC787530Uut);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnDrawListenerC787530Uut, ViewTreeObserver.OnDrawListener.class);
                    this.LJFF = null;
                }
                ViewTreeObserverOnScrollChangedListenerC787540Uuu viewTreeObserverOnScrollChangedListenerC787540Uuu = this.LJI;
                if (viewTreeObserverOnScrollChangedListenerC787540Uuu != null) {
                    viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC787540Uuu);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC787540Uuu, ViewTreeObserver.OnScrollChangedListener.class);
                    this.LJI = null;
                }
            }
        }
        this.LJII.clear();
    }

    public final void LJ(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z && jCurrentTimeMillis - this.LJIIJJI < 200) {
            return;
        }
        this.LJIIJJI = jCurrentTimeMillis;
        this.LIZIZ.removeCallbacks(this.LIZJ);
        System.nanoTime();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.LIZLLL.getChildCount(); i++) {
            View childAt = this.LIZLLL.getChildAt(i);
            C1318570kPv c1318570kPv = (C1318570kPv) this.LIZLLL.getChildViewHolder(childAt);
            UIComponent uIComponent = c1318570kPv.LL.LLILLJJLI;
            if (uIComponent != null && uIComponent.getEvents() != null && (uIComponent.getEvents().containsKey("nodeappear") | uIComponent.getEvents().containsKey("nodedisappear"))) {
                this.LJIIJ.set(0, 0, childAt.getWidth(), childAt.getHeight());
                childAt.getLocationOnScreen(this.LJIIIZ);
                Rect rect = this.LJIIJ;
                int[] iArr = this.LJIIIZ;
                rect.offset(iArr[0], iArr[1]);
                if (this.LJIIJ.intersect(this.LJIIIIZZ)) {
                    C1318030kP3 c1318030kP3 = new C1318030kP3(c1318570kPv.LL.LLILLJJLI.getSign(), c1318570kPv.getLayoutPosition(), c1318570kPv.LL.LLILLJJLI.LLILLJJLI);
                    hashSet.add(c1318030kP3);
                    if (!this.LJII.contains(c1318030kP3)) {
                        arrayList.add(c1318030kP3);
                    }
                }
            }
        }
        this.LJII.removeAll(hashSet);
        Iterator<C1318030kP3> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            LJFF("nodedisappear", it2.next());
        }
        this.LJII.clear();
        this.LJII.addAll(hashSet);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            LJFF("nodeappear", (C1318030kP3) it3.next());
        }
        int i2 = UIList.LLLL;
        if (!z) {
            C786410Ut5.LJLIIL(200L, this.LIZIZ, this.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Uuv, X.0rMx] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Uut] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Uuu] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Uus] */
    public C1318020kP2(AbstractC1298750jtx abstractC1298750jtx, RecyclerView recyclerView) {
        Rect rect = new Rect();
        this.LJIIIIZZ = rect;
        this.LJIIIZ = new int[2];
        this.LJIIJ = new Rect();
        this.LJIIJJI = 0L;
        DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(recyclerView.getContext());
        rect.set(0, 0, displayMetricsLIZ.widthPixels, displayMetricsLIZ.heightPixels);
        this.LIZ = abstractC1298750jtx;
        this.LIZIZ = new BPEAHandler(Looper.getMainLooper());
        this.LIZJ = new Runnable(this) { // from class: X.0Uus
            public final WeakReference<C1318020kP2> LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AppearEventCourierImplV2$CallBack@2a9.run");
                try {
                    C1318020kP2 c1318020kP2 = this.LL.get();
                    if (c1318020kP2 != null) {
                        c1318020kP2.LJ(true);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AppearEventCourierImplV2$CallBack@2a9.run");
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
        this.LIZLLL = recyclerView;
        ?? r0 = new AbstractC1585810rMx(this) { // from class: X.0Uuv
            public final WeakReference<C1318020kP2> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                C1318020kP2 c1318020kP2 = this.LL.get();
                if (c1318020kP2 != null && i == 0) {
                    c1318020kP2.LJ(true);
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                C1318020kP2 c1318020kP2 = this.LL.get();
                if (c1318020kP2 != null) {
                    c1318020kP2.LJ(false);
                }
            }
        };
        this.LJ = r0;
        recyclerView.addOnScrollListener(r0);
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        this.LJFF = new ViewTreeObserver.OnDrawListener(this) { // from class: X.0Uut
            public final WeakReference<C1318020kP2> LL;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                C1318020kP2 c1318020kP2 = this.LL.get();
                if (c1318020kP2 != null) {
                    c1318020kP2.LJ(false);
                }
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
        this.LJI = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: X.0Uuu
            public final WeakReference<C1318020kP2> LL;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C1318020kP2 c1318020kP2 = this.LL.get();
                if (c1318020kP2 != null) {
                    c1318020kP2.LJ(false);
                }
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
        C786410Ut5.w3(viewTreeObserver, this.LJFF);
        ViewTreeObserverOnScrollChangedListenerC787540Uuu viewTreeObserverOnScrollChangedListenerC787540Uuu = this.LJI;
        viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC787540Uuu);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC787540Uuu, ViewTreeObserver.OnScrollChangedListener.class);
    }

    public final void LJFF(String str, C1318030kP3 c1318030kP3) {
        int i = UIList.LLLL;
        C1298110jsv c1298110jsv = new C1298110jsv(c1318030kP3.LIZ, str);
        c1298110jsv.LIZIZ(Integer.valueOf(c1318030kP3.LIZIZ), "position");
        c1298110jsv.LIZIZ(c1318030kP3.LIZJ, "key");
        this.LIZ.LIZIZ(c1298110jsv);
    }
}
