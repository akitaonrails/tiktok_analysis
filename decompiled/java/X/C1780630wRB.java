package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780630wRB {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final EnumC1780670wRF LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780630wRB)) {
            return false;
        }
        C1780630wRB c1780630wRB = (C1780630wRB) obj;
        return Intrinsics.LJFF(this.LIZ, c1780630wRB.LIZ) && this.LIZIZ == c1780630wRB.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1780630wRB.LIZJ) && this.LIZLLL == c1780630wRB.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Price(formattedPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priceAmountMicros=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priceCurrencyCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", recurrenceMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780630wRB(String str, long j, String str2, EnumC1780670wRF enumC1780670wRF) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = enumC1780670wRF;
    }
}
