package X;

/* JADX INFO: renamed from: X.0978, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0978 extends AbstractC764660Tz6 {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0978) && this.LIZ == ((AnonymousClass0978) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchModeChange(isSearch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0978(boolean z) {
        this.LIZ = z;
    }
}
