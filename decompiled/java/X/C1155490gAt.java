package X;

/* JADX INFO: renamed from: X.0gAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155490gAt implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;

    public C1155490gAt() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155490gAt)) {
            return false;
        }
        C1155490gAt c1155490gAt = (C1155490gAt) obj;
        return this.LL == c1155490gAt.LL && this.LLILLJJLI == c1155490gAt.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewUserInterestCardVMState(submitButtonEnabled=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155490gAt(boolean z, int i) {
        this.LL = z;
        this.LLILLJJLI = i;
    }
}
