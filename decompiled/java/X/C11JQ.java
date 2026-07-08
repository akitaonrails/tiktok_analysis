package X;

import Y.ARunnableS98S0200000_29;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS430S0200000_29;

/* JADX INFO: renamed from: X.11JQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JQ<S, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC420801kM {
    public final C1770850wBP<R> LL;
    public final Function1<S, R> LLILLJJLI;
    public final Function1<R, Unit> LLILLL;
    public final boolean LLILZ;
    public final Function1<Throwable, Unit> LLILZIL;
    public R LLILZLL;
    public R LLIZ;
    public R LLIZLLLIL;
    public Function0<Unit> LLJI;
    public int LLJ = 1;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(317));

    @Override // X.InterfaceC420801kM
    public void dispose() {
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        C11JE.dispose(this);
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return C11JE.isDisposed(this);
    }

    public final C1770850wBP<R> getConfig() {
        return this.LL;
    }

    public final Function1<S, R> getMapper() {
        return this.LLILLJJLI;
    }

    public final Function1<R, Unit> getSubscriber() {
        return this.LLILLL;
    }

    public final Function1<Throwable, Unit> getWhenError() {
        return this.LLILZIL;
    }

    public final void onActive(boolean z) {
        R r;
        if (!z && this.LLILZ) {
            r = this.LLIZLLLIL;
            if (r == null) {
                r = this.LLILZLL;
            }
        } else {
            r = this.LLIZLLLIL;
        }
        this.LLIZLLLIL = null;
        if (r != null) {
            if (!this.LL.LJFF) {
                AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(this, (C11JQ<S, int>) r, 74);
                if (C20630086i.LIZ()) {
                    awS430S0200000_29.invoke();
                    return;
                } else {
                    C786410Ut5.LJJZZIII(C20630086i.LIZ, new RunnableC514801zW(awS430S0200000_29, (Function0<Unit>) 98));
                    return;
                }
            }
            ((C11RO) this.LLJIJIL.getValue()).LIZIZ(new ARunnableS98S0200000_29(this, r, 39));
        }
    }

    public final void operateNextValue(S s) {
        boolean zBooleanValue;
        R r;
        Boolean boolValueOf;
        R rInvoke = this.LLILLJJLI.invoke(s);
        if (rInvoke != null && (r = this.LLIZ) != null && (boolValueOf = Boolean.valueOf(this.LL.LIZIZ.invoke(rInvoke, r).booleanValue())) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZ = rInvoke;
        if (zBooleanValue) {
            return;
        }
        if (this.LL.LIZ && this.LLJ == 1) {
            this.LLJ = 0;
        } else {
            this.LLILZLL = rInvoke;
            this.LLIZLLLIL = rInvoke;
        }
    }

    public final InterfaceC420801kM whenDispose(Function0<Unit> function0) {
        this.LLJI = function0;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11JQ(C1770850wBP<R> c1770850wBP, Function1<? super S, ? extends R> function1, Function1<? super R, Unit> function12, boolean z, Function1<? super Throwable, Unit> function13) {
        this.LL = c1770850wBP;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = z;
        this.LLILZIL = function13;
    }
}
