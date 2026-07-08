package X;

/* JADX INFO: renamed from: X.0ZNG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNG implements InterfaceC898720ZNm {
    public final int LIZ = 2131831091;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZNG) && this.LIZ == ((C0ZNG) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareCommentUnavailable(resId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
