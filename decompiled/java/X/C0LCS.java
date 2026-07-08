package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LCS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0LCS<T> {
    public final T LIZ;
    public boolean LIZIZ;

    public final T LIZIZ() {
        if (this.LIZIZ) {
            return null;
        }
        this.LIZIZ = true;
        return this.LIZ;
    }

    public C0LCS(T t) {
        this.LIZ = t;
    }

    public final void LIZ(Function1<? super T, Unit> function1) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        function1.invoke(this.LIZ);
    }
}
