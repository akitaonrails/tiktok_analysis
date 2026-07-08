package X;

/* JADX INFO: renamed from: X.053n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12913053n implements InterfaceC12901053b {
    public final long LIZ = 0;
    public final long LIZIZ = 86400;
    public final EnumC12926054a LIZJ = EnumC12926054a.EXIT_AT_SPECIFIC_TIME_IN_DAY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12913053n)) {
            return false;
        }
        C12913053n c12913053n = (C12913053n) obj;
        return this.LIZ == c12913053n.LIZ && this.LIZIZ == c12913053n.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitAtSpecificTimeInDayConfig(startTimingSecond=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTimingSecond=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC12901053b
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
