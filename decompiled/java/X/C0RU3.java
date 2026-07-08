package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RU3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RU3 implements C0HTT<C737030Svd> {
    public final CopyOnWriteArrayList<Function1<C737030Svd, Unit>> LL = new CopyOnWriteArrayList<>();

    @Override // X.C0HTT
    public final void LLIIL(C737030Svd c737030Svd) {
        Iterator<Function1<C737030Svd, Unit>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(c737030Svd);
        }
    }
}
