package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ukq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715940ukq<T> {
    public volatile boolean LIZ;
    public Function1<? super T, Unit> LIZIZ;

    public C1715940ukq(Function1<? super T, Unit> function1) {
        this.LIZIZ = function1;
    }

    public final void LIZ(T t) {
        if (!this.LIZ) {
            this.LIZ = true;
            Function1<? super T, Unit> function1 = this.LIZIZ;
            if (function1 != null) {
                function1.invoke(t);
            }
            this.LIZIZ = null;
        }
    }
}
