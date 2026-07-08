package X;

/* JADX INFO: renamed from: X.0Qkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679370Qkp implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C679370Qkp)) {
            return false;
        }
        C679370Qkp c679370Qkp = (C679370Qkp) obj;
        return this.LL == c679370Qkp.LL && this.LLILLJJLI == c679370Qkp.LLILLJJLI;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSevenScreenHierarchyData(isFromComment=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isFromCSIBanner=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C679370Qkp(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
