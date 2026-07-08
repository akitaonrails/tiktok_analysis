package X;

/* JADX INFO: renamed from: X.0RiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703230RiD {
    public final EnumC699470Rc9 LIZ;
    public final EnumC699470Rc9 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703230RiD)) {
            return false;
        }
        C703230RiD c703230RiD = (C703230RiD) obj;
        return this.LIZ == c703230RiD.LIZ && this.LIZIZ == c703230RiD.LIZIZ;
    }

    public final int hashCode() {
        EnumC699470Rc9 enumC699470Rc9 = this.LIZ;
        int iHashCode = (enumC699470Rc9 == null ? 0 : enumC699470Rc9.hashCode()) * 31;
        EnumC699470Rc9 enumC699470Rc92 = this.LIZIZ;
        return iHashCode + (enumC699470Rc92 != null ? enumC699470Rc92.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotAvailabilityTransition(beforeAvailability=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", afterAvailability=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703230RiD(EnumC699470Rc9 enumC699470Rc9, EnumC699470Rc9 enumC699470Rc92) {
        this.LIZ = enumC699470Rc9;
        this.LIZIZ = enumC699470Rc92;
    }
}
