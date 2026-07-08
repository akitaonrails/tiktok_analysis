package X;

/* JADX INFO: renamed from: X.07uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2011307uJ implements InterfaceC0148002o {
    public final long LL = 5655;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2011307uJ) && this.LL == ((C2011307uJ) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsumptionTaskState(giftId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
