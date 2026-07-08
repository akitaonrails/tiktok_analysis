package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19973713Db {
    public static int LJ(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public C19973713Db(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void LIZIZ(int i, int i2) {
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

    public static void LIZJ(int i, int i2) {
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

    public static void LIZ(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startIndex: ");
            sbLIZ.append(i);
            sbLIZ.append(" > endIndex: ");
            sbLIZ.append(i2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startIndex: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", endIndex: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", size: ");
        sbLIZ2.append(i3);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZLLL(int i, int i2, int i3) {
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
