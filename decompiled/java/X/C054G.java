package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.054G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054G implements InterfaceC497601wk {
    public final CoroutineContext LL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoroutineScope(coroutineContext=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public C054G(CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
    }
}
