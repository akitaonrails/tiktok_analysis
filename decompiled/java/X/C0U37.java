package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0U37, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U37 {
    public final long LIZ;
    public final Function2<Long, Integer, Unit> LIZIZ;
    public int LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0U37(int i, long j, Function2<? super Long, ? super Integer, Unit> function2) {
        this.LIZ = j;
        this.LIZIZ = function2;
        this.LIZLLL = i * 100;
    }
}
