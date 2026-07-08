package X;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.099f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23253099f<T> extends C099D<T> {
    public final Thread LLILZ;
    public final AbstractC2252601DEs LLILZIL;

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJIII(Object obj) {
        if (!Intrinsics.LJFF(C786410Ut5.u3(), this.LLILZ)) {
            LockSupport.unpark(this.LLILZ);
        }
    }

    public C23253099f(CoroutineContext coroutineContext, Thread thread, AbstractC2252601DEs abstractC2252601DEs) {
        super(coroutineContext, true, true);
        this.LLILZ = thread;
        this.LLILZIL = abstractC2252601DEs;
    }
}
