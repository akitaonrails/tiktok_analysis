package Y;

import X.C0VH8;
import X.C0VHC;
import X.C0VIH;
import X.C0VIP;
import X.C134N;
import X.C134U;
import X.C1C7U;
import X.C2179971ATj;
import X.C2187701Ajg;
import X.C786410Ut5;
import X.C788790Uwv;
import X.C794950VGj;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS9S0500000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((View) this.l0).getContext() == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = ((View) this.l0).getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.l1;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = (ViewTreeObserver.OnWindowFocusChangeListener) this.l2;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.l3;
        ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) this.l4;
        C786410Ut5.C3(viewTreeObserver, onGlobalLayoutListener);
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
        viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
        viewTreeObserver.removeOnDrawListener(onDrawListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
    }

    public final void LIZ$1() {
        try {
            if (!(((C134N) this.l0).LL instanceof C134U)) {
                String string = ((UUID) this.l1).toString();
                C0VIP c0vipLJFF = ((C0VIH) ((C0VHC) this.l4).LIZJ).LJFF(string);
                if (c0vipLJFF == null || c0vipLJFF.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C0VH8) ((C0VHC) this.l4).LIZIZ).LJI(string, (C788790Uwv) this.l2);
                C786410Ut5.s3((Context) this.l3, C794950VGj.LIZ((Context) this.l3, string, (C788790Uwv) this.l2));
            }
            ((C134N) this.l0).LJIIIZ(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C134N) this.l0).LJIIJ(th);
        }
    }

    public static final void run$0(ARunnableS9S0500000_13 aRunnableS9S0500000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ExposeViewExtKt@24b7.addListeners$1$onViewDetachedFromWindow$1");
        try {
            aRunnableS9S0500000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExposeViewExtKt@24b7.addListeners$1$onViewDetachedFromWindow$1");
    }

    public static final void run$1(ARunnableS9S0500000_13 aRunnableS9S0500000_13) {
        try {
            aRunnableS9S0500000_13.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS9S0500000_13(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj5;
        this.l3 = obj4;
        this.l4 = obj2;
    }
}
