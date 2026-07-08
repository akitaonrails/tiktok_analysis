package X;

/* JADX INFO: renamed from: X.13Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19973913Dd {
    public static final void LIZ(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index: ");
        sbLIZ.append(i);
        sbLIZ.append(", size: ");
        sbLIZ.append(i2);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index: ");
        sbLIZ.append(i);
        sbLIZ.append(", size: ");
        sbLIZ.append(i2);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fromIndex: ");
            sbLIZ.append(i);
            sbLIZ.append(" > toIndex: ");
            sbLIZ.append(i2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fromIndex: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", toIndex: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", size: ");
        sbLIZ2.append(i3);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
