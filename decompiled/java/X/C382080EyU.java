package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382080EyU {
    public final List<C378700Et2> LIZ;
    public final C378700Et2 LIZIZ;
    public final boolean LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final long LJFF;

    public C382080EyU() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382080EyU)) {
            return false;
        }
        C382080EyU c382080EyU = (C382080EyU) obj;
        return Intrinsics.LJFF(this.LIZ, c382080EyU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382080EyU.LIZIZ) && this.LIZJ == c382080EyU.LIZJ && Intrinsics.LJFF(this.LIZLLL, c382080EyU.LIZLLL) && Intrinsics.LJFF(this.LJ, c382080EyU.LJ) && this.LJFF == c382080EyU.LJFF;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C378700Et2 c378700Et2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (c378700Et2 == null ? 0 : c378700Et2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJ;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAISuggestPrompts(prompts=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultPrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", uploadDuration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C382080EyU(C13BV c13bv, Integer num, String str, int i) {
        boolean z;
        String str2 = str;
        Integer num2 = num;
        C13BV c13bv2 = (i & 1) != 0 ? C13BV.INSTANCE : c13bv;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(c13bv2, null, z, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str2, 0L);
    }

    public C382080EyU(List<C378700Et2> list, C378700Et2 c378700Et2, boolean z, Integer num, String str, long j) {
        this.LIZ = list;
        this.LIZIZ = c378700Et2;
        this.LIZJ = z;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = j;
    }
}
