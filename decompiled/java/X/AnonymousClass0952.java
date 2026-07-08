package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0952, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0952<E> extends AnonymousClass0953<E> implements C094D<E> {
    @Override // X.C094D
    public final AnonymousClass0955 getChannel() {
        return this;
    }

    @Override // X.C099D, kotlinx.coroutines.JobSupport, X.C09AE
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // X.C099D
    public final void LJLJJI(Unit unit) {
        this.LLILZ.LJIIJJI(null);
    }

    public AnonymousClass0952(CoroutineContext coroutineContext, C1DEK c1dek) {
        super(coroutineContext, c1dek);
    }

    @Override // X.C099D
    public final void LJLILLLLZI(Throwable th, boolean z) {
        if (!this.LLILZ.LJIIJJI(th) && !z) {
            C2185108hF.LIZ(this.LLILLL, th);
        }
    }
}
