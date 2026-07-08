package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336160DFu {
    public final String LIZ;
    public final EnumC335980DFc LIZIZ;
    public final C0D7I LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public C336160DFu() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C336160DFu)) {
            return false;
        }
        C336160DFu c336160DFu = (C336160DFu) obj;
        return Intrinsics.LJFF(this.LIZ, c336160DFu.LIZ) && this.LIZIZ == c336160DFu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c336160DFu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c336160DFu.LIZLLL) && Intrinsics.LJFF(this.LJ, c336160DFu.LJ) && Intrinsics.LJFF(this.LJFF, c336160DFu.LJFF) && Intrinsics.LJFF(this.LJI, c336160DFu.LJI) && Intrinsics.LJFF(this.LJII, c336160DFu.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C0D7I c0d7i = this.LIZJ;
        int iHashCode2 = (((((((((iHashCode + (c0d7i == null ? 0 : c0d7i.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        String str = this.LJII;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DelegatePaymentOutcome(paymentMethodToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", methodType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", billingAddress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentMethodId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", instrumentId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fpToken=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fpSession=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C336160DFu LIZ(C336160DFu c336160DFu, String str, C0D7I c0d7i, String str2, String str3, int i) {
        EnumC335980DFc enumC335980DFc;
        String str4;
        String str5;
        String str6 = str3;
        String str7 = str2;
        C0D7I c0d7i2 = c0d7i;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = c336160DFu.LIZ;
        }
        String str9 = null;
        if ((i & 2) != 0) {
            enumC335980DFc = c336160DFu.LIZIZ;
        } else {
            enumC335980DFc = null;
        }
        if ((i & 4) != 0) {
            c0d7i2 = c336160DFu.LIZJ;
        }
        if ((i & 8) != 0) {
            str4 = c336160DFu.LIZLLL;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = c336160DFu.LJ;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str7 = c336160DFu.LJFF;
        }
        if ((i & 64) != 0) {
            str6 = c336160DFu.LJI;
        }
        if ((i & 128) != 0) {
            str9 = c336160DFu.LJII;
        }
        c336160DFu.getClass();
        return new C336160DFu(str8, enumC335980DFc, c0d7i2, str4, str5, str7, str6, str9);
    }

    public C336160DFu(String str, EnumC335980DFc enumC335980DFc, C0D7I c0d7i, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = enumC335980DFc;
        this.LIZJ = c0d7i;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
    }

    public /* synthetic */ C336160DFu(String str, EnumC335980DFc enumC335980DFc, C0D7I c0d7i, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EnumC335980DFc.CCDC : enumC335980DFc, (i & 4) != 0 ? null : c0d7i, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", (i & 128) == 0 ? str6 : null);
    }
}
