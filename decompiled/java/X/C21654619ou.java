package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.19ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21654619ou implements InterfaceC21654919ox {
    public final SparseArray<C21680219t2> LIZ = new SparseArray<>();
    public int LIZIZ = 0;

    @Override // X.InterfaceC21654919ox
    public final InterfaceC21680519t5 LIZ(final C21680219t2 c21680219t2) {
        return new InterfaceC21680519t5(c21680219t2) { // from class: X.19ot
            public final SparseIntArray LIZ = new SparseIntArray(1);
            public final SparseIntArray LIZIZ = new SparseIntArray(1);
            public final C21680219t2 LIZJ;

            @Override // X.InterfaceC21680519t5
            public final void dispose() {
                C21654619ou c21654619ou = this.LIZLLL;
                C21680219t2 c21680219t22 = this.LIZJ;
                int size = c21654619ou.LIZ.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    }
                    if (c21654619ou.LIZ.valueAt(size) == c21680219t22) {
                        c21654619ou.LIZ.removeAt(size);
                    }
                }
            }

            @Override // X.InterfaceC21680519t5
            public final int LIZ(int i) {
                int iIndexOfKey = this.LIZ.indexOfKey(i);
                if (iIndexOfKey > -1) {
                    return this.LIZ.valueAt(iIndexOfKey);
                }
                C21654619ou c21654619ou = this.LIZLLL;
                C21680219t2 c21680219t22 = this.LIZJ;
                int i2 = c21654619ou.LIZIZ;
                c21654619ou.LIZIZ = i2 + 1;
                c21654619ou.LIZ.put(i2, c21680219t22);
                this.LIZ.put(i, i2);
                this.LIZIZ.put(i2, i);
                return i2;
            }

            @Override // X.InterfaceC21680519t5
            public final int LIZIZ(int i) {
                int iIndexOfKey = this.LIZIZ.indexOfKey(i);
                if (iIndexOfKey >= 0) {
                    return this.LIZIZ.valueAt(iIndexOfKey);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requested global type ");
                sbLIZ.append(i);
                sbLIZ.append(" does not belong to the adapter:");
                sbLIZ.append(this.LIZJ.LIZJ);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }

            {
                this.LIZJ = c21680219t2;
            }
        };
    }

    @Override // X.InterfaceC21654919ox
    public final C21680219t2 LIZIZ(int i) {
        C21680219t2 c21680219t2 = this.LIZ.get(i);
        if (c21680219t2 != null) {
            return c21680219t2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find the wrapper for global view type ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
