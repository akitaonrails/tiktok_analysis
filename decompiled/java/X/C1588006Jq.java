package X;

/* JADX INFO: renamed from: X.06Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1588006Jq implements InterfaceC0148002o {
    public final EnumC1228990i5R LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1588006Jq)) {
            return false;
        }
        C1588006Jq c1588006Jq = (C1588006Jq) obj;
        return this.LL == c1588006Jq.LL && this.LLILLJJLI == c1588006Jq.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedGroupCreationVMState(currentCategory=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSearchActive=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1588006Jq() {
        this(EnumC1228990i5R.PRIVATE_GROUP, false);
    }

    public C1588006Jq(EnumC1228990i5R enumC1228990i5R, boolean z) {
        this.LL = enumC1228990i5R;
        this.LLILLJJLI = z;
    }
}
