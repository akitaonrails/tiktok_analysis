package X;

/* JADX INFO: renamed from: X.0064, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0064 implements AnonymousClass0060 {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public AnonymousClass0064() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0064)) {
            return false;
        }
        AnonymousClass0064 anonymousClass0064 = (AnonymousClass0064) obj;
        return this.LIZ == anonymousClass0064.LIZ && this.LIZIZ == anonymousClass0064.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeFetchParams(isInit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isMixRankSkylight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0064(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
