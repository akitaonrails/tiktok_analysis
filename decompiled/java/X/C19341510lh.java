package X;

import android.app.Activity;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.collection.WeakHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19341510lh {
    public final Function0<Unit> LIZ;
    public Function0<Unit> LIZIZ;
    public final Activity LIZJ;
    public final C16FB LIZLLL;
    public final Handler LJ;
    public final String LJFF;
    public final int LJI;
    public RunnableC627560OjS LJII;
    public C19341610li LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZIZ() {
        C19341610li c19341610li = this.LJIIIIZZ;
        if (c19341610li != null) {
            C036E.LIZ.LIZLLL(c19341610li);
        }
        RunnableC627560OjS runnableC627560OjS = this.LJII;
        if (runnableC627560OjS != null) {
            this.LJ.removeCallbacks(runnableC627560OjS);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OjS] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.10li] */
    public final void LIZ(final Exception exc) {
        final ?? r4 = new C0H62() { // from class: X.10li
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (c0o0l2 == C0O0L.AVAILABLE) {
                    this.LL.getClass();
                    Function0<Unit> function0 = this.LL.LIZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    C19341510lh c19341510lh = this.LL;
                    RunnableC627560OjS runnableC627560OjS = c19341510lh.LJII;
                    if (runnableC627560OjS != null) {
                        c19341510lh.LJ.removeCallbacks(runnableC627560OjS);
                    }
                    C036E.LIZ.LIZLLL(this.LL.LJIIIIZZ);
                }
            }
        };
        this.LJIIIIZZ = r4;
        final Function0<Unit> function0 = this.LIZIZ;
        final Activity activity = this.LIZJ;
        final C16FB c16fb = this.LIZLLL;
        final String str = this.LJFF;
        final int i = this.LJI;
        this.LJII = new Runnable(function0, activity, c16fb, r4, str, i, exc) { // from class: X.0OjS
            public final Function0<Unit> LL;
            public final Activity LLILLJJLI;
            public final C16FB LLILLL;
            public final C0H62 LLILZ;
            public final String LLILZIL;
            public final int LLILZLL;
            public final Exception LLIZ;

            public final void LIZ() {
                Function0<Unit> function02;
                Activity activity2 = this.LLILLJJLI;
                if (activity2 != null) {
                    if (this.LLILZLL != 0) {
                        Function0<Unit> function03 = this.LL;
                        if (function03 != null) {
                            function03.invoke();
                            return;
                        }
                        return;
                    }
                    C1257170iot.LIZIZ(activity2, this.LLILZIL, this.LLIZ, null);
                    C16FB c16fb2 = this.LLILLL;
                    if ((c16fb2 == null || c16fb2.getVisibility() != 0) && (function02 = this.LL) != null) {
                        function02.invoke();
                    }
                    C0H62 c0h62 = this.LLILZ;
                    if (c0h62 != null) {
                        C036E.LIZ.LIZLLL(c0h62);
                    }
                    C16FB c16fb3 = this.LLILLL;
                    if (c16fb3 != null) {
                        c16fb3.setRefreshing(false);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NetworkRunnable@2878.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NetworkRunnable@2878.run");
            }

            {
                this.LL = function0;
                this.LLILLJJLI = activity;
                this.LLILLL = c16fb;
                this.LLILZ = r4;
                this.LLILZIL = str;
                this.LLILZLL = i;
                this.LLIZ = exc;
            }
        };
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIIZ;
        this.LJIIIZ = jCurrentTimeMillis;
        if (jCurrentTimeMillis >= 2000) {
            RunnableC627560OjS runnableC627560OjS = this.LJII;
            if (runnableC627560OjS != null) {
                C786410Ut5.LJJZZIII(this.LJ, runnableC627560OjS);
                return;
            }
            return;
        }
        C036E.LIZ.LIZ(this.LJIIIIZZ);
        RunnableC627560OjS runnableC627560OjS2 = this.LJII;
        if (runnableC627560OjS2 == null) {
            return;
        }
        C786410Ut5.LJLIIL(((long) 2000) - this.LJIIIZ, this.LJ, runnableC627560OjS2);
    }

    public /* synthetic */ C19341510lh(Function0 function0, Function0 function02, C19EG c19eg, C16FB c16fb, WeakHandler weakHandler, String str) {
        this(function0, function02, c19eg, c16fb, weakHandler, str, 0);
    }

    public C19341510lh(Function0 function0, Function0 function02, Activity activity, C16FB c16fb, BPEAHandler bPEAHandler, String str, int i) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = activity;
        this.LIZLLL = c16fb;
        this.LJ = bPEAHandler;
        this.LJFF = str;
        this.LJI = i;
    }
}
