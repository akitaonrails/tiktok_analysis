package X;

/* JADX INFO: renamed from: X.0D6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333810D6t extends AbstractC333850D6x {
    public final C0D73 LIZ;
    public final String LIZIZ = "footer";
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C333810D6t) && this.LIZ == ((C333810D6t) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Footer(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC333850D6x
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC333850D6x
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public C333810D6t(C0D73 c0d73) {
        this.LIZ = c0d73;
        this.LIZJ = c0d73.ordinal();
    }
}
