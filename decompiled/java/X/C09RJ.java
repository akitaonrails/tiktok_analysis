package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RJ<T> implements Sequence<T>, C09RA<T> {
    public final Sequence<T> LIZ;
    public final int LIZIZ;

    @Override // X.C09RA
    public final Sequence LIZ() {
        int i = this.LIZIZ;
        return 2 >= i ? C09R5.LIZ : new C09RK(this.LIZ, 2, i);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new C2500509r1(this, 24);
    }

    @Override // X.C09RA
    public final Sequence<T> LIZIZ(int i) {
        if (i >= this.LIZIZ) {
            return this;
        }
        return new C09RJ(this.LIZ, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09RJ(Sequence<? extends T> sequence, int i) {
        this.LIZ = sequence;
        this.LIZIZ = i;
        if (i >= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count must be non-negative, but was ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
