package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2238608ps extends AbstractC2238508pr {
    public final Handler LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C2238608ps LLILZ;
    public volatile C2238608ps _immediate;

    public C2238608ps() {
        throw null;
    }

    public final int hashCode() {
        return System.identityHashCode(this.LL);
    }

    @Override // X.AbstractC2238408pq, X.AbstractC2252651DEx
    public final String toString() {
        String str;
        AbstractC2238408pq abstractC2238408pqLLIILII;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        if (this == abstractC2238408pq) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                abstractC2238408pqLLIILII = abstractC2238408pq.LLIILII();
            } catch (UnsupportedOperationException unused) {
                abstractC2238408pqLLIILII = null;
            }
            if (this == abstractC2238408pqLLIILII) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String string = this.LLILLJJLI;
        if (string == null) {
            string = this.LL.toString();
        }
        if (!this.LLILLL) {
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(".immediate");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2238408pq
    public final /* bridge */ /* synthetic */ AbstractC2238408pq LLIILII() {
        return this.LLILZ;
    }

    public C2238608ps(Handler handler) {
        this(handler, null, false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2238608ps) && ((C2238608ps) obj).LL == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC2252651DEx
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        if (this.LLILLL && Intrinsics.LJFF(Looper.myLooper(), this.LL.getLooper())) {
            return false;
        }
        return true;
    }

    public final void LLIILZL(CoroutineContext coroutineContext, Runnable runnable) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The task was rejected, the handler underlying the dispatcher '");
        sbLIZ.append(this);
        sbLIZ.append("' was closed");
        C23118094a.LIZJ(coroutineContext, new CancellationException(C2188811AlT.LIZIZ(sbLIZ)));
        C0WQQ.LIZ(C0PEM.LIZJ, coroutineContext, runnable);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (!C786410Ut5.LJJZZIII(this.LL, runnable)) {
            LLIILZL(coroutineContext, runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.08pt, java.lang.Runnable] */
    @Override // X.InterfaceC2239108px
    public final void scheduleResumeAfterDelay(long j, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf) {
        final C2252611DEt c2252611DEt = (C2252611DEt) interfaceC20236714Gf;
        ?? r4 = new Runnable() { // from class: X.08pt
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c2252611DEt.LJIL(this, Unit.LIZ);
                } catch (Throwable th) {
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        Handler handler = this.LL;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (C786410Ut5.LJLIIL(j, handler, r4)) {
            c2252611DEt.LJJII(new C2238808pu(this, r4));
        } else {
            LLIILZL(c2252611DEt.LLILZIL, r4);
        }
    }

    public C2238608ps(Handler handler, String str, boolean z) {
        C2238608ps c2238608ps;
        this.LL = handler;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        if (z) {
            c2238608ps = this;
        } else {
            c2238608ps = null;
        }
        this._immediate = c2238608ps;
        C2238608ps c2238608ps2 = this._immediate;
        if (c2238608ps2 == null) {
            c2238608ps2 = new C2238608ps(handler, str, true);
            this._immediate = c2238608ps2;
        }
        this.LLILZ = c2238608ps2;
    }

    @Override // X.AbstractC2238508pr, X.InterfaceC2239108px
    public final InterfaceC2238208po invokeOnTimeout(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        Handler handler = this.LL;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (C786410Ut5.LJLIIL(j, handler, runnable)) {
            return new InterfaceC2238208po() { // from class: X.08pv
                @Override // X.InterfaceC2238208po
                public final void dispose() {
                    C2238608ps c2238608ps = this.LL;
                    c2238608ps.LL.removeCallbacks(runnable);
                }
            };
        }
        LLIILZL(coroutineContext, runnable);
        return C09AF.LL;
    }
}
