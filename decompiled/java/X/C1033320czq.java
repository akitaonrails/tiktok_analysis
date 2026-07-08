package X;

/* JADX INFO: renamed from: X.0czq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033320czq {
    public final int LIZ;
    public final String LIZIZ;
    public final EnumC1033270czl LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GmtRewardPreRequestCacheKey(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033320czq() {
        this(-1, "", EnumC1033270czl.UNKNOWN);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.getValue());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033320czq(int i, String str, EnumC1033270czl enumC1033270czl) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = enumC1033270czl;
    }
}
