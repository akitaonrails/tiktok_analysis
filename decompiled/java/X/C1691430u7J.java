package X;

/* JADX INFO: renamed from: X.0u7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1691430u7J {
    public static final void LIZ(int i, int i2) {
        if (i <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toIndex (");
        sbLIZ.append(i);
        sbLIZ.append(") is greater than size (");
        sbLIZ.append(i2);
        sbLIZ.append(").");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
