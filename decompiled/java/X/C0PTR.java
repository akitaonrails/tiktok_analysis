package X;

import Y.AsS37S0100000_10;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PTR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTR<T> {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(629));
    public final RecyclerView LIZIZ;
    public final ExecutorService LIZJ;
    public final Function2<RecyclerView.ViewHolder, Integer, Unit> LIZLLL;
    public final C0PTY<T> LJ;
    public final Set<Integer> LJFF;
    public final C0PT6 LJI;
    public final Function2<Integer, Integer, Boolean> LJII;
    public Field LJIIIIZZ;
    public Field LJIIIZ;
    public final C0PTQ<T> LJIIJ;
    public final C0PTU<RecyclerView.ViewHolder> LJIIJJI;
    public final AsS37S0100000_10 LJIIL;

    public C0PTR(C0PTT<T> c0ptt) {
        RecyclerView recyclerView = c0ptt.LIZ;
        this.LIZIZ = recyclerView;
        ExecutorService executorService = c0ptt.LIZIZ;
        this.LIZJ = executorService;
        this.LIZLLL = c0ptt.LIZJ;
        C0PTY<T> c0pty = c0ptt.LIZLLL;
        this.LJ = c0pty;
        Set<Integer> set = c0ptt.LJ;
        this.LJFF = set;
        C0PT6 c0pt6 = c0ptt.LJII;
        this.LJI = c0pt6;
        this.LJII = c0ptt.LJFF;
        C0PTQ<T> c0ptq = new C0PTQ<>(recyclerView, c0pty, c0ptt.LJIIIIZZ, c0pt6.LIZ());
        this.LJIIJ = c0ptq;
        this.LJIIJJI = new C0PTU<>(new C0PTX(c0ptt.LJI, executorService, "async bind"));
        this.LJIIL = new AsS37S0100000_10(this, 21);
        recyclerView.setViewCacheExtension(c0ptq);
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                this.LIZIZ.getRecycledViewPool().setMaxRecycledViews(((Number) it2.next()).intValue(), 15);
            }
        }
        RecyclerView.LayoutManager layoutManager = this.LIZIZ.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(C640690PBb.LIZIZ.openPrefetch);
        }
        this.LIZIZ.addOnScrollListener(this.LJIIL);
    }

    public final void LIZ(int i) {
        AbstractC21673619ry adapter;
        boolean zContains;
        if (!this.LJ.LJJLIIIIJ(i)) {
            return;
        }
        C0PTQ<T> c0ptq = this.LJIIJ;
        C0PTW<T> c0ptw = c0ptq.LJI.get(Integer.valueOf(i));
        int i2 = 0;
        if ((c0ptw == null || !Intrinsics.LJFF(c0ptw.LIZIZ, c0ptq.LIZIZ.LJJLIIIJJI(i))) && !c0ptq.LJII.containsKey(Integer.valueOf(i)) && (adapter = this.LIZIZ.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(i);
            Set<Integer> set = this.LJFF;
            if (set != null) {
                zContains = set.contains(Integer.valueOf(itemViewType));
            } else {
                zContains = false;
            }
            boolean zBooleanValue = this.LJII.invoke(Integer.valueOf(itemViewType), Integer.valueOf(i)).booleanValue();
            if (!zContains && !zBooleanValue) {
                return;
            }
            C0PTQ<T> c0ptq2 = this.LJIIJ;
            c0ptq2.getClass();
            C0PTW<T> c0ptw2 = new C0PTW<>(i, c0ptq2.LIZIZ.LJJLIIIJJI(i));
            C0PTU<RecyclerView.ViewHolder> c0ptu = this.LJIIJJI;
            final C0PTS c0pts = new C0PTS(this, itemViewType, i, c0ptw2);
            Callable<C645340PSy<T>> callable = new Callable<C645340PSy<T>>(c0pts) { // from class: X.0PTV
                public final Function0<T> LL;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    long jUptimeMillis;
                    T tInvoke;
                    int i3;
                    C1C7U.LIZ("AsyncTask@59d4.call");
                    Exception exc = null;
                    try {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        tInvoke = this.LL.invoke();
                        jUptimeMillis = SystemClock.uptimeMillis() - jUptimeMillis2;
                        i3 = 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        jUptimeMillis = 0;
                        tInvoke = null;
                        exc = e;
                        i3 = 1;
                    }
                    C645340PSy c645340PSy = new C645340PSy(tInvoke, i3, exc, jUptimeMillis);
                    C1C7U.LIZIZ("AsyncTask@59d4.call");
                    return c645340PSy;
                }

                {
                    this.LL = c0pts;
                }
            };
            c0ptu.getClass();
            try {
                if (!c0ptu.LIZLLL.isShutdown()) {
                    CopyOnWriteArrayList<Future<C645340PSy<RecyclerView.ViewHolder>>> copyOnWriteArrayListLIZ = c0ptu.LIZ(i);
                    int size = copyOnWriteArrayListLIZ.size();
                    ConcurrentHashMap<Integer, CopyOnWriteArrayList<Future<C645340PSy<RecyclerView.ViewHolder>>>> concurrentHashMap = c0ptu.LIZ;
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<Integer, CopyOnWriteArrayList<Future<C645340PSy<RecyclerView.ViewHolder>>>>> it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getValue(), arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        i2 += !((Future) it3.next()).isDone() ? 1 : 0;
                    }
                    if (!c0ptu.LIZJ.invoke(Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(i2), Boolean.valueOf(Intrinsics.LJFF(c0ptu.LIZIZ.get(Integer.valueOf(i)), Boolean.TRUE))).booleanValue()) {
                        String.valueOf(i);
                        Future<C645340PSy<RecyclerView.ViewHolder>> futureSubmit = c0ptu.LIZLLL.submit(callable);
                        copyOnWriteArrayListLIZ.add(futureSubmit);
                        if (futureSubmit != null) {
                            c0ptw2.LIZLLL = futureSubmit;
                            C0PTQ<T> c0ptq3 = this.LJIIJ;
                            c0ptq3.LIZIZ();
                            C0PTW<T> c0ptw3 = c0ptq3.LJI.get(Integer.valueOf(i));
                            if (c0ptw3 != null && c0ptq3.LIZIZ.LLJJI(c0ptw3.LIZIZ, c0ptw2.LIZIZ)) {
                                try {
                                    Future<C645340PSy<RecyclerView.ViewHolder>> future = c0ptw3.LIZLLL;
                                    if (future != null) {
                                        future.cancel(true);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            c0ptq3.LJI.put(Integer.valueOf(i), c0ptw2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
