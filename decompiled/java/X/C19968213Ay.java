package X;

import java.util.List;

/* JADX INFO: renamed from: X.13Ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968213Ay {
    public static final Object[] LIZ = new Object[0];
    public static final C13B1 LIZIZ = new C13B1(0);

    public static final void LIZ(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Index ");
        sbLIZ.append(i);
        sbLIZ.append(" is out of bounds. The list has ");
        sbLIZ.append(size);
        sbLIZ.append(" elements.");
        C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        throw null;
    }

    public static final void LIZIZ(int i, int i2, List list) {
        int size = list.size();
        if (i <= i2) {
            if (i >= 0) {
                if (i2 <= size) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("toIndex (");
                sbLIZ.append(i2);
                sbLIZ.append(") is more than than the list size (");
                sbLIZ.append(size);
                sbLIZ.append(')');
                C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                throw null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fromIndex (");
            sbLIZ2.append(i);
            sbLIZ2.append(") is less than 0.");
            C19968313Az.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            throw null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Indices are out of order. fromIndex (");
        sbLIZ3.append(i);
        sbLIZ3.append(") is greater than toIndex (");
        sbLIZ3.append(i2);
        sbLIZ3.append(").");
        C19968313Az.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        throw null;
    }
}
