package X;

/* JADX INFO: renamed from: X.0Ri4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703140Ri4 {
    public final EnumC699470Rc9 LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703140Ri4)) {
            return false;
        }
        C703140Ri4 c703140Ri4 = (C703140Ri4) obj;
        return this.LIZ == c703140Ri4.LIZ && this.LIZIZ == c703140Ri4.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedSlotAvailability(availabilityState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", usedDefaultAvailability=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703140Ri4(EnumC699470Rc9 enumC699470Rc9, boolean z) {
        this.LIZ = enumC699470Rc9;
        this.LIZIZ = z;
    }
}
