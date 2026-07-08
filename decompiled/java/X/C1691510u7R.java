package X;

/* JADX INFO: renamed from: X.0u7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691510u7R {
    public static final void LIZ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("both minLines ");
            sbLIZ.append(i);
            sbLIZ.append(" and maxLines ");
            sbLIZ.append(i2);
            sbLIZ.append(" must be greater than zero");
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i > i2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("minLines ");
            sbLIZ2.append(i);
            sbLIZ2.append(" must be less than or equal to maxLines ");
            sbLIZ2.append(i2);
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
