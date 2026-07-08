package com.bytedance.als;

import X.C09AE;
import X.C09B1;
import X.C09B2;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23119094b;
import X.C23250099c;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import androidx.lifecycle.MutableLiveData;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineLiveData<T> extends MutableLiveData<T> {
    public C09AE cancellationJob;
    public C09AE runningJob;
    public final InterfaceC497601wk scope;
    public final long timeoutInMs;
    public final InterfaceC346201Wa<T> upstream;

    private final void cancelRun() {
        if (this.cancellationJob != null) {
            "Cancel call cannot happen without a maybeRun".toString();
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        InterfaceC497601wk interfaceC497601wk = this.scope;
        C1DFH c1dfh = C0PEM.LIZ;
        this.cancellationJob = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new C09B1(this, null), 2);
    }

    private final void maybeRun() {
        C09AE c09ae = this.cancellationJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = C23250099c.LIZLLL(this.scope, null, null, new C09B2(this, null), 3);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        maybeRun();
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        cancelRun();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineLiveData(CoroutineContext coroutineContext, T t, InterfaceC346201Wa<? extends T> interfaceC346201Wa, long j) {
        super(t);
        this.upstream = interfaceC346201Wa;
        this.timeoutInMs = j;
        C1DFH c1dfh = C0PEM.LIZ;
        this.scope = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII().plus(coroutineContext).plus(new C23119094b((C09AE) coroutineContext.get(C09AE.LJJLJ))));
    }
}
