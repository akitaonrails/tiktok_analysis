package X;

/* JADX INFO: renamed from: X.0CYC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CYC extends C0CYD {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0CYC) && this.LIZ == ((C0CYC) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnRefreshLinkPlayerStateEventReceived(linkPlayerState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CYC(int i) {
        this.LIZ = i;
    }
}
