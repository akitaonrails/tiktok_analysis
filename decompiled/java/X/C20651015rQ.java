package X;

/* JADX INFO: renamed from: X.15rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20651015rQ extends AbstractC20652915rj {
    public final String LIZ;
    public final int LIZIZ;

    @Override // X.AbstractC20652915rj
    public final int LIZ() {
        return this.LIZIZ * 86400;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CalendarDayDimension: key:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20651015rQ(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
