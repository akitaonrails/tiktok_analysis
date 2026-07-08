package X;

/* JADX INFO: renamed from: X.07U6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U6 {
    public final boolean LIZ;

    public C07U6() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07U6) && this.LIZ == ((C07U6) obj).LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestAutoApprovalItem(isAllowed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07U6(boolean z) {
        this.LIZ = z;
    }
}
