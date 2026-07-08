package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.09RK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RK<T> implements Sequence<T>, C09RA<T> {
    public final Sequence<T> LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    @Override // X.C09RA
    public final Sequence LIZ() {
        int i = this.LIZJ;
        int i2 = this.LIZIZ;
        return 2 >= i - i2 ? C09R5.LIZ : new C09RK(this.LIZ, i2 + 2, i);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new C09RL(this);
    }

    @Override // X.C09RA
    public final Sequence<T> LIZIZ(int i) {
        int i2 = this.LIZJ;
        int i3 = this.LIZIZ;
        if (i >= i2 - i3) {
            return this;
        }
        return new C09RK(this.LIZ, i3, i + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09RK(Sequence<? extends T> sequence, int i, int i2) {
        this.LIZ = sequence;
        this.LIZIZ = i;
        this.LIZJ = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("endIndex should be not less than startIndex, but was ");
                sbLIZ.append(i2);
                sbLIZ.append(" < ");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endIndex should be non-negative, but is ");
            sbLIZ2.append(i2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalArgumentException(strLIZIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("startIndex should be non-negative, but is ");
        sbLIZ3.append(i);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        strLIZIZ3.toString();
        throw new IllegalArgumentException(strLIZIZ3);
    }
}
