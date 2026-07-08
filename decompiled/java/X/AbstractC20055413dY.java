package X;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS431S0200000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13dY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20055413dY implements InterfaceC1691470u7N {
    public C054G LLILLJJLI;
    public int LLILLL;
    public AbstractC20055413dY LLILZIL;
    public AbstractC20055413dY LLILZLL;
    public C20061713eZ LLIZ;
    public j1 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public AwS431S0200000_30 LLJILJILJ;
    public boolean LLJILLL;
    public AbstractC20055413dY LL = this;
    public int LLILZ = -1;

    public boolean LLILLJJLI() {
        return !(this instanceof C1697400uGw);
    }

    public void LLILZIL() {
    }

    public /* synthetic */ void LLILZLL() {
    }

    public void LLIZ() {
    }

    public /* synthetic */ void LLIZLLLIL() {
    }

    public void LLJ() {
    }

    public final InterfaceC497601wk LLILLIZIL() {
        C054G c054g = this.LLILLJJLI;
        if (c054g != null) {
            return c054g;
        }
        C054G c054gLIZ = C2296808zG.LIZ(C20052513d5.LJI(this).getCoroutineContext().plus(new C1DFK((C09AE) C20052513d5.LJI(this).getCoroutineContext().get(C09AE.LJJLJ))));
        this.LLILLJJLI = c054gLIZ;
        return c054gLIZ;
    }

    public void LLILLL() {
        if (!(!this.LLJILLL)) {
            C1696250uF5.LIZIZ("node attached multiple times");
        }
        if (this.LLIZLLLIL == null) {
            C1696250uF5.LIZIZ("attach invoked on a node without a coordinator");
        }
        this.LLJILLL = true;
        this.LLJIJIL = true;
    }

    public void LLILZ() {
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("Cannot detach a node that is not attached");
        }
        if (!(!this.LLJIJIL)) {
            C1696250uF5.LIZIZ("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (!(!this.LLJILJIL)) {
            C1696250uF5.LIZIZ("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.LLJILLL = false;
        C054G c054g = this.LLILLJJLI;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, new CancellationException() { // from class: X.13df
                public static final int $stable = 0;

                @Override // java.lang.Throwable
                public Throwable fillInStackTrace() {
                    setStackTrace(C20058713e5.LIZ);
                    return this;
                }
            });
            this.LLILLJJLI = null;
        }
    }

    public void LLJI() {
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("reset() called on an unattached node");
        }
        LLJ();
    }

    public void LLJIJIL() {
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.LLJIJIL) {
            C1696250uF5.LIZIZ("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.LLJIJIL = false;
        LLILZIL();
        this.LLJILJIL = true;
    }

    public void LLJILJIL() {
        if (!this.LLJILLL) {
            C1696250uF5.LIZIZ("node detached multiple times");
        }
        if (this.LLIZLLLIL == null) {
            C1696250uF5.LIZIZ("detach invoked on a node without a coordinator");
        }
        if (!this.LLJILJIL) {
            C1696250uF5.LIZIZ("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.LLJILJIL = false;
        AwS431S0200000_30 awS431S0200000_30 = this.LLJILJILJ;
        if (awS431S0200000_30 != null) {
            awS431S0200000_30.invoke();
        }
        LLIZ();
    }

    @Override // X.InterfaceC1691470u7N
    public final AbstractC20055413dY LJIJJ() {
        return this.LL;
    }

    public void LLJILJILJ(AbstractC20055413dY abstractC20055413dY) {
        this.LL = abstractC20055413dY;
    }

    public void LLJILLL(j1 j1Var) {
        this.LLIZLLLIL = j1Var;
    }
}
