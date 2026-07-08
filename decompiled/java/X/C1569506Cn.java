package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Cn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569506Cn extends AbstractC1569806Cq {
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Function2<C1397510mTF, C1397650mTT, Unit> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1569506Cn)) {
            return false;
        }
        C1569506Cn c1569506Cn = (C1569506Cn) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1569506Cn.LIZLLL) && Intrinsics.LJFF(this.LJ, c1569506Cn.LJ) && Intrinsics.LJFF(this.LJFF, c1569506Cn.LJFF) && Intrinsics.LJFF(this.LJI, c1569506Cn.LJI) && Intrinsics.LJFF(this.LJII, c1569506Cn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1569506Cn.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1569506Cn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1569506Cn.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZLLL.hashCode() * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        String str = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function2<C1397510mTF, C1397650mTT, Unit> function2 = this.LJIIJ;
        return iHashCode3 + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualFollow(conversationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", targetUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", targetSecUid=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", eggUrl=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", onDialogButtonClick=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1569806Cq
    public final String LIZ() {
        return this.LJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1569506Cn(String str, String str2, String str3, String str4, String str5, String str6, String str7, C1569706Cp c1569706Cp) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        String string = C894660Z7w.LIZ().getResources().getString(2131831739);
        c0i0b.LIZJ();
        super(str2, string, C894660Z7w.LIZ().getResources().getString(2131831740));
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = c1569706Cp;
    }
}
