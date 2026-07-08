package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266381DnI extends AbstractC336760DIc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ = CardStruct.IStatusCode.DEFAULT;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2266381DnI)) {
            return false;
        }
        C2266381DnI c2266381DnI = (C2266381DnI) obj;
        return Intrinsics.LJFF(this.LIZ, c2266381DnI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2266381DnI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2266381DnI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2266381DnI.LIZLLL) && Intrinsics.LJFF(this.LJ, c2266381DnI.LJ) && this.LJFF == c2266381DnI.LJFF && Intrinsics.LJFF(this.LJI, c2266381DnI.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentResultFailure(orderAmount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paymentStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", paymentDurationMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", placeOrderSessionId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2266381DnI(long j, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = j;
        this.LJI = str5;
    }
}
