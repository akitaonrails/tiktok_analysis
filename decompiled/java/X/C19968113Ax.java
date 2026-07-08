package X;

import java.util.List;

/* JADX INFO: renamed from: X.13Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968113Ax {
    public static final void LIZLLL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromIndex (");
        sbLIZ.append(i);
        sbLIZ.append(") is less than 0.");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            LIZJ(i, size);
        }
    }

    public static final void LIZJ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" is out of bounds. The list has ");
        sbLIZ.append(i2);
        sbLIZ.append(" elements.");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toIndex (");
        sbLIZ.append(i);
        sbLIZ.append(") is more than than the list size (");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJFF(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Indices are out of order. fromIndex (");
        sbLIZ.append(i);
        sbLIZ.append(") is greater than toIndex (");
        sbLIZ.append(i2);
        sbLIZ.append(").");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(int i, int i2, List list) {
        if (i > i2) {
            LJFF(i, i2);
        }
        if (i < 0) {
            LIZLLL(i);
        }
        if (i2 > list.size()) {
            LJ(i2, list.size());
        }
    }
}
