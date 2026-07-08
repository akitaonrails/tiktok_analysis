package X;

/* JADX INFO: renamed from: X.0amN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948090amN extends AbstractC948140amS {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C948090amN) && this.LIZ == ((C948090amN) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetShowAvailableMicSlot(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C948090amN(boolean z) {
        this.LIZ = z;
    }
}
