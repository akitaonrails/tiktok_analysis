package X;

import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14GE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GE implements C14G2 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14GE)) {
            return false;
        }
        C14GE c14ge = (C14GE) obj;
        return Intrinsics.LJFF(this.LIZ, c14ge.LIZ) && Intrinsics.LJFF(this.LIZIZ, c14ge.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c14ge.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c14ge.LIZLLL) && Intrinsics.LJFF(this.LJ, c14ge.LJ) && Intrinsics.LJFF(this.LJFF, c14ge.LJFF) && Intrinsics.LJFF(this.LJI, c14ge.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJI;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @Override // X.C14G2
    public final void isLog() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEnterShareAction(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", botSource=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        ((TakoContextAbilityImpl) C144I.LIZ()).aP2().LIZ(C13LE.LIZ(C14GE.class), AFwS318S0000000_30.get$arr$(47));
    }

    public C14GE(String str, Integer num, String str2, String str3, Long l, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = l;
        this.LJI = num;
    }
}
