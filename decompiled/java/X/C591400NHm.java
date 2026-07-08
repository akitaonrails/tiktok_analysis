package X;

import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0NHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591400NHm implements InterfaceC497601wk {
    public final CoroutineContext LL;
    public final C1DFK LLILLJJLI;
    public C23119094b LLILLL;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        C1DFK c1dfk = this.LLILLJJLI;
        CoroutineContext coroutineContext = this.LL;
        c1dfk.getClass();
        return C09A1.LIZLLL(c1dfk, coroutineContext).plus(this.LLILLL);
    }

    public C591400NHm(CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLILLJJLI = c1dfkLIZ;
        this.LLILLL = new C23119094b(c1dfkLIZ);
        new ArrayList();
    }
}
