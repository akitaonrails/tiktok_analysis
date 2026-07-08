package X;

import Y.ARunnableS120S0100000_20;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0klF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331790klF implements InterfaceC469401sC {
    public final C1331510kkn LL;
    public InterfaceC469401sC LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC469401sC
    public final void cancel() {
        C1331510kkn c1331510kkn = this.LL;
        if (c1331510kkn == null) {
            ExecutorService executorService = C1331710kl7.LIZ;
        } else {
            C1331710kl7.LIZ.execute(new ARunnableS120S0100000_20(c1331510kkn, 410));
        }
    }

    public C1331790klF(C1331510kkn c1331510kkn) {
        this.LL = c1331510kkn;
    }
}
