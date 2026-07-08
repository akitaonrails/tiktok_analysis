package X;

/* JADX INFO: renamed from: X.07sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002807sw implements InterfaceC0148002o {
    public final boolean LL;

    public C2002807sw() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2002807sw) && this.LL == ((C2002807sw) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowButtonFFPState(isVisible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2002807sw(boolean z) {
        this.LL = z;
    }
}
