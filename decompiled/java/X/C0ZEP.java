package X;

/* JADX INFO: renamed from: X.0ZEP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZEP {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C0ZEP() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZEP)) {
            return false;
        }
        C0ZEP c0zep = (C0ZEP) obj;
        return this.LIZ == c0zep.LIZ && this.LIZIZ == c0zep.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotSharePostPagingState(isLoadingMore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZEP(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C0ZEP LIZ(C0ZEP c0zep, boolean z) {
        boolean z2 = c0zep.LIZIZ;
        c0zep.getClass();
        return new C0ZEP(z, z2);
    }
}
