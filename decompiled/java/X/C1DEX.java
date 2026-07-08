package X;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DEX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEX extends C1DET<C1DEX> {
    public final AtomicReferenceArray LLILZIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SemaphoreSegment[id=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1DET
    public final int LJFF() {
        return C2252461DEe.LJFF;
    }

    @Override // X.C1DET
    public final void LJI(int i, CoroutineContext coroutineContext) {
        this.LLILZIL.set(i, C2252461DEe.LJ);
        LJII();
    }

    public C1DEX(long j, C1DEX c1dex, int i) {
        super(j, c1dex, i);
        this.LLILZIL = new AtomicReferenceArray(C2252461DEe.LJFF);
    }
}
