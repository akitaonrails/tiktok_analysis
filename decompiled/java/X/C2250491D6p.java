package X;

import X.InterfaceC647710Par;
import Y.ARunnableS68S0300000_35;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.base.TraceEvent;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.1D6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250491D6p<T extends InterfaceC647710Par> {
    public static final Object LJIIIIZZ = new Object();
    public final boolean LIZ;
    public final int LIZIZ;
    public final LruCache<String, T> LIZJ;
    public final LruCache<String, Future<T>> LIZLLL;
    public final LinkedList<Runnable> LJ;
    public volatile boolean LJFF;
    public int LJI;
    public ExecutorService LJII;

    public final synchronized boolean LIZ() {
        int i = this.LJI;
        if (i <= 0) {
            return false;
        }
        this.LJI = i - 1;
        return true;
    }

    public final synchronized void LIZIZ() {
        Runnable runnablePoll;
        if (this.LJI < this.LIZIZ) {
            synchronized (LJIIIIZZ) {
                try {
                    runnablePoll = this.LJ.poll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (runnablePoll != null) {
                C1289620jfE.LIZJ(runnablePoll);
            } else {
                this.LJI++;
            }
        }
    }

    public C2250491D6p(C1556530qbj c1556530qbj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Create LynxAsyncManager, address:");
        sbLIZ.append(this);
        LynxLog.i("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ = 5;
        this.LIZ = true;
        this.LIZJ = new LruCache<>(10);
        this.LIZLLL = new LruCache<>(10);
        this.LJ = new LinkedList<>();
        this.LJI = 5;
    }

    public final T LIZLLL(String str) {
        T tRemove = this.LIZJ.remove(str);
        if (tRemove != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(tRemove);
            sbLIZ.append(", hit the PreLayoutCache identify:");
            sbLIZ.append(str);
            LynxLog.i("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        return tRemove;
    }

    public final void LIZJ(final String str, final T t, final C1AW8<T> c1aw8, final InterfaceC2250511D6r<T> interfaceC2250511D6r) {
        if (this.LJFF) {
            c1aw8.LIZJ();
            LynxLog.e("LynxAsyncManager", "LynxAsyncManager is destroyed, return on pre-layout task begin.");
            return;
        }
        final boolean zLIZ = c1aw8.LIZ();
        if (t == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ContainView is null, in LynxAsyncManager:");
            sbLIZ.append(this);
            LynxLog.e("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        final LynxView lynxView = t.getLynxView();
        if (lynxView == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ContainerView getLynxView is null, in LynxAsyncManager:");
            sbLIZ2.append(this);
            LynxLog.e("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c1aw8.LL = t;
        lynxView.setEnableUIFlush(false);
        if (lynxView.getThreadStrategyForRendering() == EnumC665490Q8l.ALL_ON_UI) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("lynxView preLayout ThreadStrategy can't be ThreadStrategyForRendering.ALL_ON_UI. identify:");
            sbLIZ3.append(str);
            LynxLog.e("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        lynxView.addLynxViewClient(new LynxViewClient() { // from class: X.1D6l
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIIJ() {
                if (this.LLIZ.LJFF) {
                    c1aw8.LIZJ();
                    return;
                }
                if (zLIZ) {
                    this.LLIZ.LIZJ.put(str, (T) t);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onLayoutFinished callback for ");
                sbLIZ4.append(str);
                LynxLog.d("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ4));
                lynxView.removeLynxViewClient(this);
                this.LLIZ.LIZIZ();
                if (interfaceC2250511D6r != null) {
                    TraceEvent.LIZLLL("LynxAsyncLayoutCallback.onLayoutFinished");
                    interfaceC2250511D6r.LIZIZ(t, str);
                    TraceEvent.LJII("LynxAsyncLayoutCallback.onLayoutFinished");
                }
            }

            @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
            public final void LJFF(LynxError lynxError) {
                if (this.LLIZ.LJFF) {
                    c1aw8.LIZJ();
                    return;
                }
                if (lynxError.LIZIZ() == 102) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("onPreLayoutError callback for ");
                    sbLIZ4.append(str);
                    LynxLog.e("LynxAsyncManager", C2188811AlT.LIZIZ(sbLIZ4));
                    lynxView.removeLynxViewClient(this);
                    this.LLIZ.LIZIZ();
                    InterfaceC2250511D6r interfaceC2250511D6r2 = interfaceC2250511D6r;
                    if (interfaceC2250511D6r2 != null) {
                        interfaceC2250511D6r2.LIZ(C0Q8K.ASYNC_MANAGER_LOAD_FAIL, lynxError);
                    }
                }
            }
        });
        ARunnableS68S0300000_35 aRunnableS68S0300000_35 = new ARunnableS68S0300000_35(this, str, t, c1aw8, interfaceC2250511D6r, lynxView, 1);
        if (LIZ()) {
            aRunnableS68S0300000_35.run();
            return;
        }
        synchronized (LJIIIIZZ) {
            try {
                this.LJ.add(aRunnableS68S0300000_35);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
