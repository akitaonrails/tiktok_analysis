package X;

/* JADX INFO: renamed from: X.053j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12909053j implements C053Z {
    public final int LIZ;
    public final long LIZIZ = 0;
    public final long LIZJ = 86400;
    public final EnumC12930054e LIZLLL = EnumC12930054e.X_TIMES_IN_TIME_SLOT_IN_DAY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12909053j)) {
            return false;
        }
        C12909053j c12909053j = (C12909053j) obj;
        return this.LIZ == c12909053j.LIZ && this.LIZIZ == c12909053j.LIZIZ && this.LIZJ == c12909053j.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XTimesInTimeSlotInDayConfig(times=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimingSecond=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTimingSecond=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C053Z
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12909053j(int i) {
        this.LIZ = i;
    }
}
