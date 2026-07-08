package X;

/* JADX INFO: renamed from: X.0gDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156960gDG extends AbstractC1156990gDJ {
    public final long LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156960gDG) && this.LL == ((C1156960gDG) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MonthHeaderItem(timestamp=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156960gDG(long j) {
        this.LL = j;
    }
}
