package X;

/* JADX INFO: renamed from: X.0845, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0845 {
    public final boolean LIZ = true;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0845)) {
            return false;
        }
        AnonymousClass0845 anonymousClass0845 = (AnonymousClass0845) obj;
        return this.LIZ == anonymousClass0845.LIZ && this.LIZIZ == anonymousClass0845.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigationSecurityDecision(triggered=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldIntercept=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0845(boolean z) {
        this.LIZIZ = z;
    }
}
