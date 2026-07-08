package X;

/* JADX INFO: renamed from: X.13EX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EX {
    public static final Object LIZ = new Object();

    public static final void LIZ(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index (");
        sbLIZ.append(i);
        sbLIZ.append(") is out of bound of [0, ");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
