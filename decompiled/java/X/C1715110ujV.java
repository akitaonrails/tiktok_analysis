package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ujV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715110ujV<T> {
    public final T LIZ;
    public boolean LIZIZ;

    public C1715110ujV(T t) {
        this.LIZ = t;
    }

    public final void LIZ(Function1<? super T, Unit> function1) {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            T t = this.LIZ;
            if (t != null) {
                function1.invoke(t);
            }
        }
    }
}
