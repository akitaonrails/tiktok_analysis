package X;

/* JADX INFO: renamed from: X.00hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C146400hC {
    public final EnumC146000h8 LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C146400hC)) {
            return false;
        }
        C146400hC c146400hC = (C146400hC) obj;
        return this.LIZ == c146400hC.LIZ && this.LIZIZ == c146400hC.LIZIZ && this.LIZJ == c146400hC.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerGameGiftStateSnapshot(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C146400hC(EnumC146000h8 enumC146000h8, long j, long j2) {
        this.LIZ = enumC146000h8;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
