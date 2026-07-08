package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09RI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RI<T> implements Sequence<T>, C09RA<T> {
    public final Sequence<T> LIZ;
    public final int LIZIZ;

    @Override // X.C09RA
    public final Sequence LIZ() {
        int i = this.LIZIZ + 2;
        return i < 0 ? new C09RI(this, 2) : new C09RI(this.LIZ, i);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new C2500509r1(this, 23);
    }

    @Override // X.C09RA
    public final Sequence<T> LIZIZ(int i) {
        int i2 = this.LIZIZ;
        int i3 = i2 + i;
        if (i3 < 0) {
            return new C09RJ(this, i);
        }
        return new C09RK(this.LIZ, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09RI(Sequence<? extends T> sequence, int i) {
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
