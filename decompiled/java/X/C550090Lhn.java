package X;

import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550090Lhn {
    public final int LIZ;
    public final GenerateStatus LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C550090Lhn)) {
            return false;
        }
        C550090Lhn c550090Lhn = (C550090Lhn) obj;
        return this.LIZ == c550090Lhn.LIZ && this.LIZIZ == c550090Lhn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c550090Lhn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c550090Lhn.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGenerationLoadingState(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generateStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failedType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aiSelfImagePath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C550090Lhn() {
        this(0, GenerateStatus.NOT_START, null, null);
    }

    public C550090Lhn(int i, GenerateStatus generateStatus, Integer num, String str) {
        this.LIZ = i;
        this.LIZIZ = generateStatus;
        this.LIZJ = num;
        this.LIZLLL = str;
    }

    public static C550090Lhn LIZ(C550090Lhn c550090Lhn, int i, GenerateStatus generateStatus, Integer num, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            i = c550090Lhn.LIZ;
        }
        if ((i2 & 2) != 0) {
            generateStatus = c550090Lhn.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            num = c550090Lhn.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str = c550090Lhn.LIZLLL;
        } else {
            str = null;
        }
        c550090Lhn.getClass();
        return new C550090Lhn(i, generateStatus, num, str);
    }
}
